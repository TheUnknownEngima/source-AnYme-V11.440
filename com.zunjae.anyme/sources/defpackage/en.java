package defpackage;

import defpackage.cn;

/* renamed from: en  reason: default package */
final class en extends cn {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    /* renamed from: en$b */
    static final class b extends cn.a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;

        b() {
        }

        public cn.a a(Integer num) {
            this.a = num;
            return this;
        }

        public cn.a b(String str) {
            this.d = str;
            return this;
        }

        public cn c() {
            return new en(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (a) null);
        }

        public cn.a d(String str) {
            this.h = str;
            return this;
        }

        public cn.a e(String str) {
            this.c = str;
            return this;
        }

        public cn.a f(String str) {
            this.g = str;
            return this;
        }

        public cn.a g(String str) {
            this.b = str;
            return this;
        }

        public cn.a h(String str) {
            this.f = str;
            return this;
        }

        public cn.a i(String str) {
            this.e = str;
            return this;
        }
    }

    /* synthetic */ en(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        Integer num = this.a;
        if (num != null ? num.equals(((en) obj).a) : ((en) obj).a == null) {
            String str = this.b;
            if (str != null ? str.equals(((en) obj).b) : ((en) obj).b == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(((en) obj).c) : ((en) obj).c == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(((en) obj).d) : ((en) obj).d == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(((en) obj).e) : ((en) obj).e == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(((en) obj).f) : ((en) obj).f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((en) obj).g) : ((en) obj).g == null) {
                                    String str7 = this.h;
                                    String str8 = ((en) obj).h;
                                    if (str7 == null) {
                                        if (str8 == null) {
                                            return true;
                                        }
                                    } else if (str7.equals(str8)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.e;
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 ^ i;
    }

    public Integer i() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + "}";
    }
}
