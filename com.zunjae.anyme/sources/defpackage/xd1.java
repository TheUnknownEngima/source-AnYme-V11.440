package defpackage;

import defpackage.ge1;

/* renamed from: xd1  reason: default package */
final class xd1 extends ge1.d.C0116d.a.b.C0118a {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    /* renamed from: xd1$b */
    static final class b extends ge1.d.C0116d.a.b.C0118a.C0119a {
        private Long a;
        private Long b;
        private String c;
        private String d;

        b() {
        }

        public ge1.d.C0116d.a.b.C0118a a() {
            String str = "";
            if (this.a == null) {
                str = str + " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new xd1(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.a.b.C0118a.C0119a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public ge1.d.C0116d.a.b.C0118a.C0119a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public ge1.d.C0116d.a.b.C0118a.C0119a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public ge1.d.C0116d.a.b.C0118a.C0119a e(String str) {
            this.d = str;
            return this;
        }
    }

    private xd1(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.C0116d.a.b.C0118a)) {
            return false;
        }
        ge1.d.C0116d.a.b.C0118a aVar = (ge1.d.C0116d.a.b.C0118a) obj;
        if (this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c())) {
            String str = this.d;
            String e = aVar.e();
            if (str == null) {
                if (e == null) {
                    return true;
                }
            } else if (str.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }
}
