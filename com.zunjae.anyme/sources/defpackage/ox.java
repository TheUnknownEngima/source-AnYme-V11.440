package defpackage;

import defpackage.tt;

/* renamed from: ox  reason: default package */
final class ox implements tt {
    private final mx a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public ox(mx mxVar, int i, long j, long j2) {
        this.a = mxVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) mxVar.d);
        this.d = j3;
        this.e = a(j3);
    }

    private long a(long j) {
        return v50.w0(j * ((long) this.b), 1000000, (long) this.a.c);
    }

    public boolean e() {
        return true;
    }

    public tt.a i(long j) {
        long p = v50.p((((long) this.a.c) * j) / (((long) this.b) * 1000000), 0, this.d - 1);
        long j2 = this.c + (((long) this.a.d) * p);
        long a2 = a(p);
        ut utVar = new ut(a2, j2);
        if (a2 >= j || p == this.d - 1) {
            return new tt.a(utVar);
        }
        long j3 = p + 1;
        return new tt.a(utVar, new ut(a(j3), this.c + (((long) this.a.d) * j3)));
    }

    public long j() {
        return this.e;
    }
}
