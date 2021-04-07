package defpackage;

import defpackage.cp;

/* renamed from: zo  reason: default package */
final class zo extends cp {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    /* renamed from: zo$b */
    static final class b extends cp.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public cp a() {
            String str = "";
            if (this.a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new zo(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public cp.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public cp.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public cp.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public cp.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public cp.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    private zo(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cp)) {
            return false;
        }
        cp cpVar = (cp) obj;
        return this.b == cpVar.f() && this.c == cpVar.d() && this.d == cpVar.b() && this.e == cpVar.c() && this.f == cpVar.e();
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.e;
        return this.f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }
}
