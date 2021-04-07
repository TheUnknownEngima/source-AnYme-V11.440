package com.google.android.exoplayer2;

public final class z0 {
    public static final z0 c = new z0(0, 0);
    public static final z0 d = c;
    public final long a;
    public final long b;

    static {
        new z0(Long.MAX_VALUE, Long.MAX_VALUE);
        new z0(Long.MAX_VALUE, 0);
        new z0(0, Long.MAX_VALUE);
    }

    public z0(long j, long j2) {
        boolean z = true;
        q40.a(j >= 0);
        q40.a(j2 < 0 ? false : z);
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.a == z0Var.a && this.b == z0Var.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
