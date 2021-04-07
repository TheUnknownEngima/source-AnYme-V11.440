package defpackage;

import defpackage.fi1;

/* renamed from: ci1  reason: default package */
final class ci1 extends fi1 {
    private final String a;
    private final String b;
    private final String c;
    private final gi1 d;
    private final fi1.b e;

    /* renamed from: ci1$b */
    static final class b extends fi1.a {
        private String a;
        private String b;
        private String c;
        private gi1 d;
        private fi1.b e;

        b() {
        }

        public fi1 a() {
            return new ci1(this.a, this.b, this.c, this.d, this.e);
        }

        public fi1.a b(gi1 gi1) {
            this.d = gi1;
            return this;
        }

        public fi1.a c(String str) {
            this.b = str;
            return this;
        }

        public fi1.a d(String str) {
            this.c = str;
            return this;
        }

        public fi1.a e(fi1.b bVar) {
            this.e = bVar;
            return this;
        }

        public fi1.a f(String str) {
            this.a = str;
            return this;
        }
    }

    private ci1(String str, String str2, String str3, gi1 gi1, fi1.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gi1;
        this.e = bVar;
    }

    public gi1 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public fi1.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fi1)) {
            return false;
        }
        fi1 fi1 = (fi1) obj;
        String str = this.a;
        if (str != null ? str.equals(fi1.f()) : fi1.f() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(fi1.c()) : fi1.c() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(fi1.d()) : fi1.d() == null) {
                    gi1 gi1 = this.d;
                    if (gi1 != null ? gi1.equals(fi1.b()) : fi1.b() == null) {
                        fi1.b bVar = this.e;
                        fi1.b e2 = fi1.e();
                        if (bVar == null) {
                            if (e2 == null) {
                                return true;
                            }
                        } else if (bVar.equals(e2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        gi1 gi1 = this.d;
        int hashCode4 = (hashCode3 ^ (gi1 == null ? 0 : gi1.hashCode())) * 1000003;
        fi1.b bVar = this.e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
