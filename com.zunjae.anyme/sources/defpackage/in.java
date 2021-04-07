package defpackage;

import defpackage.on;
import java.util.List;

/* renamed from: in  reason: default package */
final class in extends on {
    private final long a;
    private final long b;
    private final mn c;
    private final Integer d;
    private final String e;
    private final List<nn> f;
    private final rn g;

    /* renamed from: in$b */
    static final class b extends on.a {
        private Long a;
        private Long b;
        private mn c;
        private Integer d;
        private String e;
        private List<nn> f;
        private rn g;

        b() {
        }

        public on.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public on.a c(mn mnVar) {
            this.c = mnVar;
            return this;
        }

        public on.a d(rn rnVar) {
            this.g = rnVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public on.a e(Integer num) {
            this.d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public on.a f(String str) {
            this.e = str;
            return this;
        }

        public on.a g(List<nn> list) {
            this.f = list;
            return this;
        }

        public on h() {
            String str = "";
            if (this.a == null) {
                str = str + " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new in(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public on.a i(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ in(long j, long j2, mn mnVar, Integer num, String str, List list, rn rnVar, a aVar) {
        this.a = j;
        this.b = j2;
        this.c = mnVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = rnVar;
    }

    public mn b() {
        return this.c;
    }

    public List<nn> c() {
        return this.f;
    }

    public Integer d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        mn mnVar;
        Integer num;
        String str;
        List<nn> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof on)) {
            return false;
        }
        on onVar = (on) obj;
        if (this.a == onVar.g() && this.b == onVar.h() && ((mnVar = this.c) != null ? mnVar.equals(((in) onVar).c) : ((in) onVar).c == null) && ((num = this.d) != null ? num.equals(((in) onVar).d) : ((in) onVar).d == null) && ((str = this.e) != null ? str.equals(((in) onVar).e) : ((in) onVar).e == null) && ((list = this.f) != null ? list.equals(((in) onVar).f) : ((in) onVar).f == null)) {
            rn rnVar = this.g;
            rn rnVar2 = ((in) onVar).g;
            if (rnVar == null) {
                if (rnVar2 == null) {
                    return true;
                }
            } else if (rnVar.equals(rnVar2)) {
                return true;
            }
        }
        return false;
    }

    public rn f() {
        return this.g;
    }

    public long g() {
        return this.a;
    }

    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        mn mnVar = this.c;
        int i2 = 0;
        int hashCode = (i ^ (mnVar == null ? 0 : mnVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<nn> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        rn rnVar = this.g;
        if (rnVar != null) {
            i2 = rnVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
