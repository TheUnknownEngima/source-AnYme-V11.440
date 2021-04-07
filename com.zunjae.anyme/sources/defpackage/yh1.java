package defpackage;

import defpackage.ai1;
import defpackage.bi1;

/* renamed from: yh1  reason: default package */
final class yh1 extends bi1 {
    private final String a;
    private final ai1.a b;
    private final String c;
    private final String d;
    private final long e;
    private final long f;
    private final String g;

    /* renamed from: yh1$b */
    static final class b extends bi1.a {
        private String a;
        private ai1.a b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        b() {
        }

        private b(bi1 bi1) {
            this.a = bi1.d();
            this.b = bi1.g();
            this.c = bi1.b();
            this.d = bi1.f();
            this.e = Long.valueOf(bi1.c());
            this.f = Long.valueOf(bi1.h());
            this.g = bi1.e();
        }

        public bi1 a() {
            String str = "";
            if (this.b == null) {
                str = str + " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new yh1(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public bi1.a b(String str) {
            this.c = str;
            return this;
        }

        public bi1.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        public bi1.a d(String str) {
            this.a = str;
            return this;
        }

        public bi1.a e(String str) {
            this.g = str;
            return this;
        }

        public bi1.a f(String str) {
            this.d = str;
            return this;
        }

        public bi1.a g(ai1.a aVar) {
            if (aVar != null) {
                this.b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public bi1.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    private yh1(String str, ai1.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.e;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bi1)) {
            return false;
        }
        bi1 bi1 = (bi1) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(bi1.d()) : bi1.d() == null) {
            if (this.b.equals(bi1.g()) && ((str = this.c) != null ? str.equals(bi1.b()) : bi1.b() == null) && ((str2 = this.d) != null ? str2.equals(bi1.f()) : bi1.f() == null) && this.e == bi1.c() && this.f == bi1.h()) {
                String str4 = this.g;
                String e2 = bi1.e();
                if (str4 == null) {
                    if (e2 == null) {
                        return true;
                    }
                } else if (str4.equals(e2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.d;
    }

    public ai1.a g() {
        return this.b;
    }

    public long h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.e;
        long j2 = this.f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    public bi1.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + this.b + ", authToken=" + this.c + ", refreshToken=" + this.d + ", expiresInSecs=" + this.e + ", tokenCreationEpochInSecs=" + this.f + ", fisError=" + this.g + "}";
    }
}
