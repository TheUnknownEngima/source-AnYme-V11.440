package defpackage;

import defpackage.nn;
import java.util.Arrays;

/* renamed from: hn  reason: default package */
final class hn extends nn {
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final qn g;

    /* renamed from: hn$b */
    static final class b extends nn.a {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;
        private qn g;

        b() {
        }

        public nn.a a(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public nn.a b(qn qnVar) {
            this.g = qnVar;
            return this;
        }

        public nn.a c(Integer num) {
            this.b = num;
            return this;
        }

        public nn d() {
            String str = "";
            if (this.a == null) {
                str = str + " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new hn(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public nn.a e(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public nn.a f(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public nn.a g(String str) {
            this.e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public nn.a h(byte[] bArr) {
            this.d = bArr;
            return this;
        }
    }

    /* synthetic */ hn(long j, Integer num, long j2, byte[] bArr, String str, long j3, qn qnVar, a aVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = qnVar;
    }

    public Integer c() {
        return this.b;
    }

    public long d() {
        return this.a;
    }

    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        if (this.a == nnVar.d() && ((num = this.b) != null ? num.equals(((hn) nnVar).b) : ((hn) nnVar).b == null) && this.c == nnVar.e()) {
            if (Arrays.equals(this.d, nnVar instanceof hn ? ((hn) nnVar).d : nnVar.g()) && ((str = this.e) != null ? str.equals(((hn) nnVar).e) : ((hn) nnVar).e == null) && this.f == nnVar.i()) {
                qn qnVar = this.g;
                qn qnVar2 = ((hn) nnVar).g;
                if (qnVar == null) {
                    if (qnVar2 == null) {
                        return true;
                    }
                } else if (qnVar.equals(qnVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public qn f() {
        return this.g;
    }

    public byte[] g() {
        return this.d;
    }

    public String h() {
        return this.e;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        qn qnVar = this.g;
        if (qnVar != null) {
            i2 = qnVar.hashCode();
        }
        return i3 ^ i2;
    }

    public long i() {
        return this.f;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
