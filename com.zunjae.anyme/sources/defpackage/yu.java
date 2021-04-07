package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.tt;

/* renamed from: yu  reason: default package */
final class yu implements wu {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    private yu(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    private yu(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1;
    }

    public static yu a(long j, long j2, rt rtVar, i50 i50) {
        int D;
        long j3 = j;
        rt rtVar2 = rtVar;
        int i = rtVar2.g;
        int i2 = rtVar2.d;
        int k = i50.k();
        if ((k & 1) != 1 || (D = i50.D()) == 0) {
            return null;
        }
        long w0 = v50.w0((long) D, ((long) i) * 1000000, (long) i2);
        if ((k & 6) != 6) {
            return new yu(j2, rtVar2.c, w0);
        }
        long B = i50.B();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) i50.z();
        }
        if (j3 != -1) {
            long j4 = j2 + B;
            if (j3 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(j4);
                b50.h("XingSeeker", sb.toString());
            }
        }
        return new yu(j2, rtVar2.c, w0, B, jArr);
    }

    private long d(int i) {
        return (this.c * ((long) i)) / 100;
    }

    public long b(long j) {
        long j2 = j - this.a;
        if (!e() || j2 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = this.f;
        q40.e(jArr);
        long[] jArr2 = jArr;
        double d2 = (((double) j2) * 256.0d) / ((double) this.d);
        int f2 = v50.f(jArr2, (long) d2, true, true);
        long d3 = d(f2);
        long j3 = jArr2[f2];
        int i = f2 + 1;
        long d4 = d(i);
        long j4 = f2 == 99 ? 256 : jArr2[i];
        return d3 + Math.round((j3 == j4 ? Utils.DOUBLE_EPSILON : (d2 - ((double) j3)) / ((double) (j4 - j3))) * ((double) (d4 - d3)));
    }

    public long c() {
        return this.e;
    }

    public boolean e() {
        return this.f != null;
    }

    public tt.a i(long j) {
        if (!e()) {
            return new tt.a(new ut(0, this.a + ((long) this.b)));
        }
        long p = v50.p(j, 0, this.c);
        double d2 = (((double) p) * 100.0d) / ((double) this.c);
        double d3 = Utils.DOUBLE_EPSILON;
        if (d2 > Utils.DOUBLE_EPSILON) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.f;
                q40.e(jArr);
                long[] jArr2 = jArr;
                double d4 = (double) jArr2[i];
                d3 = d4 + ((d2 - ((double) i)) * ((i == 99 ? 256.0d : (double) jArr2[i + 1]) - d4));
            }
        }
        return new tt.a(new ut(p, this.a + v50.p(Math.round((d3 / 256.0d) * ((double) this.d)), (long) this.b, this.d - 1)));
    }

    public long j() {
        return this.c;
    }
}
