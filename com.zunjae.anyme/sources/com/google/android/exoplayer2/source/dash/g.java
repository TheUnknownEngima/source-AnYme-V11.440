package com.google.android.exoplayer2.source.dash;

public final class g implements f {
    private final ct a;
    private final long b;

    public g(ct ctVar, long j) {
        this.a = ctVar;
        this.b = j;
    }

    public long a(long j, long j2) {
        return this.a.d[(int) j];
    }

    public long b(long j) {
        return this.a.e[(int) j] - this.b;
    }

    public n10 c(long j) {
        ct ctVar = this.a;
        int i = (int) j;
        return new n10((String) null, ctVar.c[i], (long) ctVar.b[i]);
    }

    public long d(long j, long j2) {
        return (long) this.a.a(j + this.b);
    }

    public boolean e() {
        return true;
    }

    public long f() {
        return 0;
    }

    public int g(long j) {
        return this.a.a;
    }
}
