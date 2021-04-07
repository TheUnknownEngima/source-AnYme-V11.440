package defpackage;

import defpackage.tt;

/* renamed from: dt  reason: default package */
public class dt implements tt {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public dt(long j, long j2, int i, int i2) {
        long j3;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1;
            j3 = -9223372036854775807L;
        } else {
            this.d = j - j2;
            j3 = f(j, j2, i);
        }
        this.f = j3;
    }

    private long a(long j) {
        int i = this.c;
        return this.b + v50.p((((j * ((long) this.e)) / 8000000) / ((long) i)) * ((long) i), 0, this.d - ((long) i));
    }

    private static long f(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    public long d(long j) {
        return f(j, this.b, this.e);
    }

    public boolean e() {
        return this.d != -1;
    }

    public tt.a i(long j) {
        if (this.d == -1) {
            return new tt.a(new ut(0, this.b));
        }
        long a2 = a(j);
        long d2 = d(a2);
        ut utVar = new ut(d2, a2);
        if (d2 < j) {
            int i = this.c;
            if (((long) i) + a2 < this.a) {
                long j2 = a2 + ((long) i);
                return new tt.a(utVar, new ut(d(j2), j2));
            }
        }
        return new tt.a(utVar);
    }

    public long j() {
        return this.f;
    }
}
