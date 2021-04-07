package defpackage;

import defpackage.ge1;

/* renamed from: rd1  reason: default package */
final class rd1 extends ge1.d.a {
    private final String a;
    private final String b;
    private final String c;
    private final ge1.d.a.b d;
    private final String e;

    /* renamed from: rd1$b */
    static final class b extends ge1.d.a.C0115a {
        private String a;
        private String b;
        private String c;
        private ge1.d.a.b d;
        private String e;

        b() {
        }

        public ge1.d.a a() {
            String str = "";
            if (this.a == null) {
                str = str + " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new rd1(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.a.C0115a b(String str) {
            this.c = str;
            return this;
        }

        public ge1.d.a.C0115a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public ge1.d.a.C0115a d(String str) {
            this.e = str;
            return this;
        }

        public ge1.d.a.C0115a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private rd1(String str, String str2, String str3, ge1.d.a.b bVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = str4;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.e;
    }

    public ge1.d.a.b e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        ge1.d.a.b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.a)) {
            return false;
        }
        ge1.d.a aVar = (ge1.d.a) obj;
        if (this.a.equals(aVar.c()) && this.b.equals(aVar.f()) && ((str = this.c) != null ? str.equals(aVar.b()) : aVar.b() == null) && ((bVar = this.d) != null ? bVar.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.e;
            String d2 = aVar.d();
            if (str2 == null) {
                if (d2 == null) {
                    return true;
                }
            } else if (str2.equals(d2)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ge1.d.a.b bVar = this.d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.d + ", installationUuid=" + this.e + "}";
    }
}
