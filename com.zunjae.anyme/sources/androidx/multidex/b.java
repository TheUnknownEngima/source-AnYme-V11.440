package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class b implements Closeable {
    private final File e;
    private final long f;
    private final File g;
    private final RandomAccessFile h;
    private final FileChannel i;
    private final FileLock j;

    class a implements FileFilter {
        a(b bVar) {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: androidx.multidex.b$b  reason: collision with other inner class name */
    private static class C0043b extends File {
        public long e = -1;

        public C0043b(File file, String str) {
            super(file, str);
        }
    }

    b(File file, File file2) {
        "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")";
        this.e = file;
        this.g = file2;
        this.f = l(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.h = randomAccessFile;
        try {
            this.i = randomAccessFile.getChannel();
            try {
                "Blocking on lock " + file3.getPath();
                this.j = this.i.lock();
                file3.getPath() + " locked";
            } catch (IOException e2) {
                e = e2;
                b(this.i);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                b(this.i);
                throw e;
            } catch (Error e4) {
                e = e4;
                b(this.i);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            b(this.h);
            throw e5;
        }
    }

    private static void A(Context context, String str, long j2, long j3, List<C0043b> list) {
        SharedPreferences.Editor edit = i(context).edit();
        edit.putLong(str + "timestamp", j2);
        edit.putLong(str + "crc", j3);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (C0043b next : list) {
            edit.putLong(str + "dex.crc." + i2, next.e);
            edit.putLong(str + "dex.time." + i2, next.lastModified());
            i2++;
        }
        edit.commit();
    }

    private void a() {
        String str;
        StringBuilder sb;
        File[] listFiles = this.g.listFiles(new a(this));
        if (listFiles == null) {
            "Failed to list secondary dex dir content (" + this.g.getPath() + ").";
            return;
        }
        for (File file : listFiles) {
            "Trying to delete old file " + file.getPath() + " of size " + file.length();
            if (!file.delete()) {
                sb = new StringBuilder();
                str = "Failed to delete old file ";
            } else {
                sb = new StringBuilder();
                str = "Deleted old file ";
            }
            sb.append(str);
            sb.append(file.getPath());
            sb.toString();
        }
    }

    private static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void h(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        "Extracting " + createTempFile.getPath();
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                "Renaming to " + file.getPath();
                if (createTempFile.renameTo(file)) {
                    b(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            b(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    private static SharedPreferences i(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static long k(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long l(File file) {
        long c = c.c(file);
        return c == -1 ? c - 1 : c;
    }

    private static boolean m(Context context, File file, long j2, String str) {
        SharedPreferences i2 = i(context);
        if (i2.getLong(str + "timestamp", -1) == k(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return i2.getLong(sb.toString(), -1) != j2;
        }
    }

    private List<C0043b> t(Context context, String str) {
        String str2 = str;
        String str3 = this.e.getName() + ".classes";
        SharedPreferences i2 = i(context);
        int i3 = i2.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i3 + -1);
        int i4 = 2;
        while (i4 <= i3) {
            C0043b bVar = new C0043b(this.g, str3 + i4 + ".zip");
            if (bVar.isFile()) {
                bVar.e = l(bVar);
                long j2 = i2.getLong(str2 + "dex.crc." + i4, -1);
                long j3 = i2.getLong(str2 + "dex.time." + i4, -1);
                long lastModified = bVar.lastModified();
                if (j3 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = i2;
                    if (j2 == bVar.e) {
                        arrayList.add(bVar);
                        i4++;
                        i2 = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str2 + "\"), expected modification time: " + j3 + ", modification time: " + lastModified + ", expected crc: " + j2 + ", file crc: " + bVar.e);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        "Failed to read crc from " + r8.getAbsolutePath();
        r10 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<androidx.multidex.b.C0043b> z() {
        /*
            r14 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = "classes"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r14.e
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r14.e
            r4.<init>(r5)
            r5 = 2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r6.<init>()     // Catch:{ all -> 0x013e }
            r6.append(r1)     // Catch:{ all -> 0x013e }
            r6.append(r5)     // Catch:{ all -> 0x013e }
            r6.append(r0)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x013e }
        L_0x003d:
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x013a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r7.<init>()     // Catch:{ all -> 0x013e }
            r7.append(r2)     // Catch:{ all -> 0x013e }
            r7.append(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch:{ all -> 0x013e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x013e }
            androidx.multidex.b$b r8 = new androidx.multidex.b$b     // Catch:{ all -> 0x013e }
            java.io.File r9 = r14.g     // Catch:{ all -> 0x013e }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x013e }
            r3.add(r8)     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r7.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "Extraction is needed for file "
            r7.append(r9)     // Catch:{ all -> 0x013e }
            r7.append(r8)     // Catch:{ all -> 0x013e }
            r7.toString()     // Catch:{ all -> 0x013e }
            r7 = 0
            r9 = 0
            r10 = 0
        L_0x0074:
            r11 = 3
            if (r9 >= r11) goto L_0x00fa
            if (r10 != 0) goto L_0x00fa
            int r9 = r9 + 1
            h(r4, r6, r8, r2)     // Catch:{ all -> 0x013e }
            long r10 = l(r8)     // Catch:{ IOException -> 0x0086 }
            r8.e = r10     // Catch:{ IOException -> 0x0086 }
            r10 = 1
            goto L_0x009b
        L_0x0086:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r10.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r11 = "Failed to read crc from "
            r10.append(r11)     // Catch:{ all -> 0x013e }
            java.lang.String r11 = r8.getAbsolutePath()     // Catch:{ all -> 0x013e }
            r10.append(r11)     // Catch:{ all -> 0x013e }
            r10.toString()     // Catch:{ all -> 0x013e }
            r10 = 0
        L_0x009b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r11.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "Extraction "
            r11.append(r12)     // Catch:{ all -> 0x013e }
            if (r10 == 0) goto L_0x00aa
            java.lang.String r12 = "succeeded"
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r12 = "failed"
        L_0x00ac:
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = " '"
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = r8.getAbsolutePath()     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "': length "
            r11.append(r12)     // Catch:{ all -> 0x013e }
            long r12 = r8.length()     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = " - crc: "
            r11.append(r12)     // Catch:{ all -> 0x013e }
            long r12 = r8.e     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            r11.toString()     // Catch:{ all -> 0x013e }
            if (r10 != 0) goto L_0x0074
            r8.delete()     // Catch:{ all -> 0x013e }
            boolean r11 = r8.exists()     // Catch:{ all -> 0x013e }
            if (r11 == 0) goto L_0x0074
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r11.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "Failed to delete corrupted secondary dex '"
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = r8.getPath()     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ all -> 0x013e }
            r11.toString()     // Catch:{ all -> 0x013e }
            goto L_0x0074
        L_0x00fa:
            if (r10 == 0) goto L_0x0112
            int r5 = r5 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r6.<init>()     // Catch:{ all -> 0x013e }
            r6.append(r1)     // Catch:{ all -> 0x013e }
            r6.append(r5)     // Catch:{ all -> 0x013e }
            r6.append(r0)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x013e }
            goto L_0x003d
        L_0x0112:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r1.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r8.getAbsolutePath()     // Catch:{ all -> 0x013e }
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x013e }
            r1.append(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x013e }
            r0.<init>(r1)     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013a:
            r4.close()     // Catch:{ IOException -> 0x013d }
        L_0x013d:
            return r3
        L_0x013e:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0142 }
        L_0x0142:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.b.z():java.util.List");
    }

    public void close() {
        this.j.release();
        this.i.close();
        this.h.close();
    }

    /* access modifiers changed from: package-private */
    public List<? extends File> r(Context context, String str, boolean z) {
        List<C0043b> list;
        "MultiDexExtractor.load(" + this.e.getPath() + ", " + z + ", " + str + ")";
        if (this.j.isValid()) {
            if (!z && !m(context, this.e, this.f, str)) {
                try {
                    list = t(context, str);
                } catch (IOException unused) {
                }
                "load found " + list.size() + " secondary dex files";
                return list;
            }
            List<C0043b> z2 = z();
            A(context, str, k(this.e), this.f, z2);
            list = z2;
            "load found " + list.size() + " secondary dex files";
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
