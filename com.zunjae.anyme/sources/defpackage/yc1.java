package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: yc1  reason: default package */
class yc1 {
    private static void a(InputStream inputStream, File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            dc1.f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        dc1.f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                dc1.f(gZIPOutputStream);
                throw th;
            }
        }
    }

    static void b(File file, List<xc1> list) {
        for (xc1 next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.d();
                if (inputStream != null) {
                    a(inputStream, new File(file, next.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                dc1.f(inputStream);
                throw th;
            }
            dc1.f(inputStream);
        }
    }
}
