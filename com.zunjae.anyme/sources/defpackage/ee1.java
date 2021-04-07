package defpackage;

import defpackage.ge1;

/* renamed from: ee1  reason: default package */
final class ee1 extends ge1.d.e {
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    /* renamed from: ee1$b */
    static final class b extends ge1.d.e.a {
        private Integer a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        public ge1.d.e a() {
            String str = "";
            if (this.a == null) {
                str = str + " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new ee1(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.e.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public ge1.d.e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public ge1.d.e.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public ge1.d.e.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private ee1(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.e)) {
            return false;
        }
        ge1.d.e eVar = (ge1.d.e) obj;
        return this.a == eVar.c() && this.b.equals(eVar.d()) && this.c.equals(eVar.b()) && this.d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
