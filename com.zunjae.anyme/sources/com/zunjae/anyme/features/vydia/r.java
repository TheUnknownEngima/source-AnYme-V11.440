package com.zunjae.anyme.features.vydia;

import com.zunjae.extensions.a;
import com.zunjae.extensions.c;

public final class r {
    private final long a;
    private final long b;

    public r(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final String c(int i) {
        long j = (this.a / ((long) 1000)) + ((long) (i / 1000));
        if (j <= 0) {
            return "00:00:00";
        }
        a e = c.e(j);
        String O = g92.O(String.valueOf(e.a()), 2, '0');
        String O2 = g92.O(String.valueOf(e.b()), 2, '0');
        String O3 = g92.O(String.valueOf(e.c()), 2, '0');
        return O + ':' + O2 + ':' + O3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && this.b == rVar.b;
    }

    public int hashCode() {
        return (c.a(this.a) * 31) + c.a(this.b);
    }

    public String toString() {
        return "PlayerProgress(position=" + this.a + ", duration=" + this.b + ")";
    }
}
