package defpackage;

import defpackage.tt;

/* renamed from: xu  reason: default package */
final class xu implements wu {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    private xu(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static xu a(long j, long j2, rt rtVar, i50 i50) {
        int i;
        long j3 = j;
        rt rtVar2 = rtVar;
        i50 i502 = i50;
        i502.N(10);
        int k = i50.k();
        if (k <= 0) {
            return null;
        }
        int i2 = rtVar2.d;
        long w0 = v50.w0((long) k, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int F = i50.F();
        int F2 = i50.F();
        int F3 = i50.F();
        i502.N(2);
        long j4 = j2 + ((long) rtVar2.c);
        long[] jArr = new long[F];
        long[] jArr2 = new long[F];
        int i3 = 0;
        long j5 = j2;
        while (i3 < F) {
            int i4 = F2;
            jArr[i3] = (((long) i3) * w0) / ((long) F);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (F3 == 1) {
                i = i50.z();
            } else if (F3 == 2) {
                i = i50.F();
            } else if (F3 == 3) {
                i = i50.C();
            } else if (F3 != 4) {
                return null;
            } else {
                i = i50.D();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            F2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            b50.h("VbriSeeker", sb.toString());
        }
        return new xu(jArr, jArr2, w0, j5);
    }

    public long b(long j) {
        return this.a[v50.f(this.b, j, true, true)];
    }

    public long c() {
        return this.d;
    }

    public boolean e() {
        return true;
    }

    public tt.a i(long j) {
        int f = v50.f(this.a, j, true, true);
        ut utVar = new ut(this.a[f], this.b[f]);
        if (utVar.a >= j || f == this.a.length - 1) {
            return new tt.a(utVar);
        }
        int i = f + 1;
        return new tt.a(utVar, new ut(this.a[i], this.b[i]));
    }

    public long j() {
        return this.c;
    }
}
