package defpackage;

import javax.annotation.Nullable;

/* renamed from: ae2  reason: default package */
final class ae2 {
    @Nullable
    static zd2 a;
    static long b;

    private ae2() {
    }

    static void a(zd2 zd2) {
        if (zd2.f != null || zd2.g != null) {
            throw new IllegalArgumentException();
        } else if (!zd2.d) {
            synchronized (ae2.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    zd2.f = a;
                    zd2.c = 0;
                    zd2.b = 0;
                    a = zd2;
                }
            }
        }
    }

    static zd2 b() {
        synchronized (ae2.class) {
            if (a == null) {
                return new zd2();
            }
            zd2 zd2 = a;
            a = zd2.f;
            zd2.f = null;
            b -= 8192;
            return zd2;
        }
    }
}
