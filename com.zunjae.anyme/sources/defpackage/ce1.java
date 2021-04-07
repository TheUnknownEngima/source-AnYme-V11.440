package defpackage;

import defpackage.ge1;

/* renamed from: ce1  reason: default package */
final class ce1 extends ge1.d.C0116d.c {
    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    /* renamed from: ce1$b */
    static final class b extends ge1.d.C0116d.c.a {
        private Double a;
        private Integer b;
        private Boolean c;
        private Integer d;
        private Long e;
        private Long f;

        b() {
        }

        public ge1.d.C0116d.c a() {
            String str = "";
            if (this.b == null) {
                str = str + " batteryVelocity";
            }
            if (this.c == null) {
                str = str + " proximityOn";
            }
            if (this.d == null) {
                str = str + " orientation";
            }
            if (this.e == null) {
                str = str + " ramUsed";
            }
            if (this.f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new ce1(this.a, this.b.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.longValue(), this.f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.c.a b(Double d2) {
            this.a = d2;
            return this;
        }

        public ge1.d.C0116d.c.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public ge1.d.C0116d.c.a d(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public ge1.d.C0116d.c.a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public ge1.d.C0116d.c.a f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public ge1.d.C0116d.c.a g(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    private ce1(Double d2, int i, boolean z, int i2, long j, long j2) {
        this.a = d2;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public Double b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.f;
    }

    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.C0116d.c)) {
            return false;
        }
        ge1.d.C0116d.c cVar = (ge1.d.C0116d.c) obj;
        Double d2 = this.a;
        if (d2 != null ? d2.equals(cVar.b()) : cVar.b() == null) {
            return this.b == cVar.c() && this.c == cVar.g() && this.d == cVar.e() && this.e == cVar.f() && this.f == cVar.d();
        }
    }

    public long f() {
        return this.e;
    }

    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        int i = this.c ? 1231 : 1237;
        long j = this.e;
        long j2 = this.f;
        return ((((((hashCode ^ i) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }
}
