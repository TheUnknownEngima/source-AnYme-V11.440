package defpackage;

import defpackage.ge1;

/* renamed from: nd1  reason: default package */
final class nd1 extends ge1.b {
    private final String a;
    private final String b;

    /* renamed from: nd1$b */
    static final class b extends ge1.b.a {
        private String a;
        private String b;

        b() {
        }

        public ge1.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new nd1(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.b.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public ge1.b.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    private nd1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.b)) {
            return false;
        }
        ge1.b bVar = (ge1.b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }
}
