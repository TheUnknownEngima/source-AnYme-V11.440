package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* renamed from: qa  reason: default package */
public class qa {

    /* renamed from: qa$a */
    public static abstract class a implements Comparator<File> {
        private final Map<File, Long> e;

        /* renamed from: qa$a$a  reason: collision with other inner class name */
        class C0135a extends HashMap<File, Long> {
            final /* synthetic */ File[] e;

            C0135a(a aVar, File[] fileArr) {
                this.e = fileArr;
                for (File file : this.e) {
                    put(file, Long.valueOf(file.lastModified()));
                }
            }
        }

        public a(File[] fileArr) {
            this.e = new C0135a(this, fileArr);
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return b(file, this.e.get(file), file2, this.e.get(file2));
        }

        public abstract int b(File file, Long l, File file2, Long l2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ FileNotFoundException -> 0x0015 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0015 }
            r1.println(r3)     // Catch:{ FileNotFoundException -> 0x0010, all -> 0x000d }
            r1.close()
            goto L_0x001e
        L_0x000d:
            r2 = move-exception
            r0 = r1
            goto L_0x001f
        L_0x0010:
            r2 = move-exception
            r0 = r1
            goto L_0x0016
        L_0x0013:
            r2 = move-exception
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
        L_0x0016:
            r2.printStackTrace()     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x001e
            r0.close()
        L_0x001e:
            return
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r0.close()
        L_0x0024:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.a(java.io.File, java.lang.String):void");
    }

    public static void b(File[] fileArr, a aVar) {
        Arrays.sort(fileArr, aVar);
    }

    public static boolean c(File file) {
        boolean z = true;
        for (File file2 : file.listFiles()) {
            z = file2.isDirectory() ? c(file2) : file2.delete();
        }
        return z ? file.delete() : z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.io.File r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ FileNotFoundException -> 0x001d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x001d }
            java.lang.String r2 = ""
            r1.print(r2)     // Catch:{ FileNotFoundException -> 0x0018, all -> 0x0015 }
            r1.flush()     // Catch:{ FileNotFoundException -> 0x0018, all -> 0x0015 }
            r1.println(r3)     // Catch:{ FileNotFoundException -> 0x0018, all -> 0x0015 }
            r1.close()
            goto L_0x0026
        L_0x0015:
            r2 = move-exception
            r0 = r1
            goto L_0x0027
        L_0x0018:
            r2 = move-exception
            r0 = r1
            goto L_0x001e
        L_0x001b:
            r2 = move-exception
            goto L_0x0027
        L_0x001d:
            r2 = move-exception
        L_0x001e:
            r2.printStackTrace()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0026
            r0.close()
        L_0x0026:
            return
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.close()
        L_0x002c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.d(java.io.File, java.lang.String):void");
    }

    public static boolean e(File file) {
        boolean z = true;
        for (File file2 : file.listFiles()) {
            z = file2.isDirectory() ? c(file2) : file2.delete();
        }
        return z;
    }

    public static String f(File file) {
        StringBuilder sb = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        while (scanner.hasNextLine()) {
            try {
                sb.append(scanner.nextLine());
            } finally {
                scanner.close();
            }
        }
        return sb.toString();
    }
}
