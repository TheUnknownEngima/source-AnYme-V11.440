package defpackage;

import defpackage.qe1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: ue1  reason: default package */
class ue1 implements qe1.a {
    ue1() {
    }

    private static String b(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String H = dc1.H(bufferedInputStream2);
                dc1.f(bufferedInputStream2);
                return H;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                dc1.f(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dc1.f(bufferedInputStream);
            throw th;
        }
    }

    public String a(File file) {
        return b(file.getPath());
    }
}
