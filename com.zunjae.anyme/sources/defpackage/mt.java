package defpackage;

import com.google.android.exoplayer2.m0;

/* renamed from: mt  reason: default package */
public final class mt {

    /* renamed from: mt$a */
    public static final class a {
        public long a;
    }

    private static boolean a(i50 i50, y40 y40, int i) {
        int j = j(i50, i);
        return j != -1 && j <= y40.b;
    }

    private static boolean b(i50 i50, int i) {
        return i50.z() == v50.s(i50.a, i, i50.c() - 1, 0);
    }

    private static boolean c(i50 i50, y40 y40, boolean z, a aVar) {
        try {
            long G = i50.G();
            if (!z) {
                G *= (long) y40.b;
            }
            aVar.a = G;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(i50 i50, y40 y40, int i, a aVar) {
        i50 i502 = i50;
        y40 y402 = y40;
        int c = i50.c();
        long B = i50.B();
        long j = B >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        return g((int) (15 & (B >> 4)), y402) && f((int) ((B >> 1) & 7), y402) && !(((B & 1) > 1 ? 1 : ((B & 1) == 1 ? 0 : -1)) == 0) && c(i502, y402, ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1)) == 0, aVar) && a(i502, y402, (int) ((B >> 12) & 15)) && e(i502, y402, (int) ((B >> 8) & 15)) && b(i502, c);
    }

    private static boolean e(i50 i50, y40 y40, int i) {
        int i2 = y40.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == y40.f;
        }
        if (i == 12) {
            return i50.z() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int F = i50.F();
        if (i == 14) {
            F *= 10;
        }
        return F == i2;
    }

    private static boolean f(int i, y40 y40) {
        return i == 0 || i == y40.i;
    }

    private static boolean g(int i, y40 y40) {
        return i <= 7 ? i == y40.g - 1 : i <= 10 && y40.g == 2;
    }

    public static boolean h(it itVar, y40 y40, int i, a aVar) {
        long d = itVar.d();
        byte[] bArr = new byte[2];
        itVar.l(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            itVar.i();
            itVar.e((int) (d - itVar.m()));
            return false;
        }
        i50 i50 = new i50(16);
        System.arraycopy(bArr, 0, i50.a, 0, 2);
        i50.L(kt.a(itVar, i50.a, 2, 14));
        itVar.i();
        itVar.e((int) (d - itVar.m()));
        return d(i50, y40, i, aVar);
    }

    public static long i(it itVar, y40 y40) {
        itVar.i();
        boolean z = true;
        itVar.e(1);
        byte[] bArr = new byte[1];
        itVar.l(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        itVar.e(2);
        int i = z ? 7 : 6;
        i50 i50 = new i50(i);
        i50.L(kt.a(itVar, i50.a, 0, i));
        itVar.i();
        a aVar = new a();
        if (c(i50, y40, z, aVar)) {
            return aVar.a;
        }
        throw new m0();
    }

    public static int j(i50 i50, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return i50.z() + 1;
            case 7:
                return i50.F() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
