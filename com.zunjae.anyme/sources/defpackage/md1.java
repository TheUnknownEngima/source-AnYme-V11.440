package defpackage;

import defpackage.ge1;

/* renamed from: md1  reason: default package */
final class md1 extends ge1 {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final ge1.d h;
    private final ge1.c i;

    /* renamed from: md1$b */
    static final class b extends ge1.a {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private ge1.d g;
        private ge1.c h;

        b() {
        }

        private b(ge1 ge1) {
            this.a = ge1.i();
            this.b = ge1.e();
            this.c = Integer.valueOf(ge1.h());
            this.d = ge1.f();
            this.e = ge1.c();
            this.f = ge1.d();
            this.g = ge1.j();
            this.h = ge1.g();
        }

        public ge1 a() {
            String str = "";
            if (this.a == null) {
                str = str + " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.e == null) {
                str = str + " buildVersion";
            }
            if (this.f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new md1(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.a b(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public ge1.a c(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        public ge1.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        public ge1.a e(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        public ge1.a f(ge1.c cVar) {
            this.h = cVar;
            return this;
        }

        public ge1.a g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public ge1.a h(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        public ge1.a i(ge1.d dVar) {
            this.g = dVar;
            return this;
        }
    }

    private md1(String str, String str2, int i2, String str3, String str4, String str5, ge1.d dVar, ge1.c cVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = dVar;
        this.i = cVar;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        ge1.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1)) {
            return false;
        }
        ge1 ge1 = (ge1) obj;
        if (this.b.equals(ge1.i()) && this.c.equals(ge1.e()) && this.d == ge1.h() && this.e.equals(ge1.f()) && this.f.equals(ge1.c()) && this.g.equals(ge1.d()) && ((dVar = this.h) != null ? dVar.equals(ge1.j()) : ge1.j() == null)) {
            ge1.c cVar = this.i;
            ge1.c g2 = ge1.g();
            if (cVar == null) {
                if (g2 == null) {
                    return true;
                }
            } else if (cVar.equals(g2)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.e;
    }

    public ge1.c g() {
        return this.i;
    }

    public int h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        ge1.d dVar = this.h;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        ge1.c cVar = this.i;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public String i() {
        return this.b;
    }

    public ge1.d j() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public ge1.a l() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + "}";
    }
}
