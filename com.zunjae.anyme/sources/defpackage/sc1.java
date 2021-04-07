package defpackage;

import defpackage.ge1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: sc1  reason: default package */
class sc1 implements xc1 {
    private final File a;
    private final String b;
    private final String c;

    sc1(String str, String str2, File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] c() {
        /*
            r7 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r2 = r7.d()     // Catch:{ IOException -> 0x0050 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0049 }
            r3.<init>()     // Catch:{ all -> 0x0049 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0044 }
            r4.<init>(r3)     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0021
            r4.close()     // Catch:{ all -> 0x0044 }
            r3.close()     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x0020
            r2.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0020:
            return r1
        L_0x0021:
            int r5 = r2.read(r0)     // Catch:{ all -> 0x003f }
            if (r5 <= 0) goto L_0x002c
            r6 = 0
            r4.write(r0, r6, r5)     // Catch:{ all -> 0x003f }
            goto L_0x0021
        L_0x002c:
            r4.finish()     // Catch:{ all -> 0x003f }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x003f }
            r4.close()     // Catch:{ all -> 0x0044 }
            r3.close()     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x0050 }
        L_0x003e:
            return r0
        L_0x003f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc1.c():byte[]");
    }

    public String a() {
        return this.c;
    }

    public ge1.c.b b() {
        byte[] c2 = c();
        if (c2 == null) {
            return null;
        }
        ge1.c.b.a a2 = ge1.c.b.a();
        a2.b(c2);
        a2.c(this.b);
        return a2.a();
    }

    public InputStream d() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
