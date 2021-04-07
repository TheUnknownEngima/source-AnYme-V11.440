package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Set;

final class d extends g.b {
    private final long a;
    private final long b;
    private final Set<g.c> c;

    static final class b extends g.b.a {
        private Long a;
        private Long b;
        private Set<g.c> c;

        b() {
        }

        public g.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public g.b.a c(Set<g.c> set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public g.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    private d(long j, long j2, Set<g.c> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Set<g.c> c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        return this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c());
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
