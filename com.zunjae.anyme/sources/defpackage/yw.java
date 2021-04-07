package defpackage;

/* renamed from: yw  reason: default package */
final class yw {
    private final s50 a = new s50(0);
    private final i50 b = new i50();
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    yw() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(it itVar) {
        this.b.J(v50.f);
        this.c = true;
        itVar.i();
        return 0;
    }

    private int f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private int h(it itVar, st stVar) {
        int min = (int) Math.min(20000, itVar.g());
        long j = (long) 0;
        if (itVar.m() != j) {
            stVar.a = j;
            return 1;
        }
        this.b.I(min);
        itVar.i();
        itVar.l(this.b.a, 0, min);
        this.f = i(this.b);
        this.d = true;
        return 0;
    }

    private long i(i50 i50) {
        int d2 = i50.d();
        for (int c2 = i50.c(); c2 < d2 - 3; c2++) {
            if (f(i50.a, c2) == 442) {
                i50.M(c2 + 4);
                long l = l(i50);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(it itVar, st stVar) {
        long g2 = itVar.g();
        int min = (int) Math.min(20000, g2);
        long j = g2 - ((long) min);
        if (itVar.m() != j) {
            stVar.a = j;
            return 1;
        }
        this.b.I(min);
        itVar.i();
        itVar.l(this.b.a, 0, min);
        this.g = k(this.b);
        this.e = true;
        return 0;
    }

    private long k(i50 i50) {
        int c2 = i50.c();
        for (int d2 = i50.d() - 4; d2 >= c2; d2--) {
            if (f(i50.a, d2) == 442) {
                i50.M(d2 + 4);
                long l = l(i50);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(i50 i50) {
        int c2 = i50.c();
        if (i50.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        i50.h(bArr, 0, 9);
        i50.M(c2);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }

    private static long m(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.h;
    }

    public s50 d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public int g(it itVar, st stVar) {
        if (!this.e) {
            return j(itVar, stVar);
        }
        if (this.g == -9223372036854775807L) {
            return b(itVar);
        }
        if (!this.d) {
            return h(itVar, stVar);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return b(itVar);
        }
        this.h = this.a.b(this.g) - this.a.b(j);
        return b(itVar);
    }
}
