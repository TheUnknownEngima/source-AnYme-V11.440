package defpackage;

import com.google.android.exoplayer2.m0;
import defpackage.y40;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nt  reason: default package */
public final class nt {

    /* renamed from: nt$a */
    public static final class a {
        public y40 a;

        public a(y40 y40) {
            this.a = y40;
        }
    }

    public static boolean a(it itVar) {
        i50 i50 = new i50(4);
        itVar.l(i50.a, 0, 4);
        return i50.B() == 1716281667;
    }

    public static int b(it itVar) {
        itVar.i();
        i50 i50 = new i50(2);
        itVar.l(i50.a, 0, 2);
        int F = i50.F();
        int i = F >> 2;
        itVar.i();
        if (i == 16382) {
            return F;
        }
        throw new m0("First frame does not start with sync code.");
    }

    public static yx c(it itVar, boolean z) {
        yx a2 = new qt().a(itVar, z ? null : uy.b);
        if (a2 == null || a2.d() == 0) {
            return null;
        }
        return a2;
    }

    public static yx d(it itVar, boolean z) {
        itVar.i();
        long d = itVar.d();
        yx c = c(itVar, z);
        itVar.j((int) (itVar.d() - d));
        return c;
    }

    public static boolean e(it itVar, a aVar) {
        y40 b;
        itVar.i();
        h50 h50 = new h50(new byte[4]);
        itVar.l(h50.a, 0, 4);
        boolean g = h50.g();
        int h = h50.h(7);
        int h2 = h50.h(24) + 4;
        if (h == 0) {
            b = i(itVar);
        } else {
            y40 y40 = aVar.a;
            if (y40 == null) {
                throw new IllegalArgumentException();
            } else if (h == 3) {
                b = y40.c(g(itVar, h2));
            } else if (h == 4) {
                b = y40.d(k(itVar, h2));
            } else if (h == 6) {
                b = y40.b(Collections.singletonList(f(itVar, h2)));
            } else {
                itVar.j(h2);
                return g;
            }
        }
        aVar.a = b;
        return g;
    }

    private static iy f(it itVar, int i) {
        i50 i50 = new i50(i);
        itVar.readFully(i50.a, 0, i);
        i50.N(4);
        int k = i50.k();
        String x = i50.x(i50.k(), Charset.forName("US-ASCII"));
        String w = i50.w(i50.k());
        int k2 = i50.k();
        int k3 = i50.k();
        int k4 = i50.k();
        int k5 = i50.k();
        int k6 = i50.k();
        byte[] bArr = new byte[k6];
        i50.h(bArr, 0, k6);
        return new iy(k, x, w, k2, k3, k4, k5, bArr);
    }

    private static y40.a g(it itVar, int i) {
        i50 i50 = new i50(i);
        itVar.readFully(i50.a, 0, i);
        return h(i50);
    }

    public static y40.a h(i50 i50) {
        i50.N(1);
        int C = i50.C();
        long c = (long) (i50.c() + C);
        int i = C / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long s = i50.s();
            if (s == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = s;
            jArr2[i2] = i50.s();
            i50.N(2);
            i2++;
        }
        i50.N((int) (c - ((long) i50.c())));
        return new y40.a(jArr, jArr2);
    }

    private static y40 i(it itVar) {
        byte[] bArr = new byte[38];
        itVar.readFully(bArr, 0, 38);
        return new y40(bArr, 4);
    }

    public static void j(it itVar) {
        i50 i50 = new i50(4);
        itVar.readFully(i50.a, 0, 4);
        if (i50.B() != 1716281667) {
            throw new m0("Failed to read FLAC stream marker.");
        }
    }

    private static List<String> k(it itVar, int i) {
        i50 i50 = new i50(i);
        itVar.readFully(i50.a, 0, i);
        i50.N(4);
        return Arrays.asList(xt.i(i50, false, false).a);
    }
}
