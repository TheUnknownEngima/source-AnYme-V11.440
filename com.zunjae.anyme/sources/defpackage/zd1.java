package defpackage;

import defpackage.ge1;

/* renamed from: zd1  reason: default package */
final class zd1 extends ge1.d.C0116d.a.b.C0122d {
    private final String a;
    private final String b;
    private final long c;

    /* renamed from: zd1$b */
    static final class b extends ge1.d.C0116d.a.b.C0122d.C0123a {
        private String a;
        private String b;
        private Long c;

        b() {
        }

        public ge1.d.C0116d.a.b.C0122d a() {
            String str = "";
            if (this.a == null) {
                str = str + " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new zd1(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.a.b.C0122d.C0123a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public ge1.d.C0116d.a.b.C0122d.C0123a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        public ge1.d.C0116d.a.b.C0122d.C0123a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private zd1(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.C0116d.a.b.C0122d)) {
            return false;
        }
        ge1.d.C0116d.a.b.C0122d dVar = (ge1.d.C0116d.a.b.C0122d) obj;
        return this.a.equals(dVar.d()) && this.b.equals(dVar.c()) && this.c == dVar.b();
    }

    public int hashCode() {
        long j = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }
}
