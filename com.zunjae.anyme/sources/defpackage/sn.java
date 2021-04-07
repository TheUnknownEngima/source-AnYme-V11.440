package defpackage;

import defpackage.zn;
import java.util.Map;

/* renamed from: sn  reason: default package */
final class sn extends zn {
    private final String a;
    private final Integer b;
    private final yn c;
    private final long d;
    private final long e;
    private final Map<String, String> f;

    /* renamed from: sn$b */
    static final class b extends zn.a {
        private String a;
        private Integer b;
        private yn c;
        private Long d;
        private Long e;
        private Map<String, String> f;

        b() {
        }

        public zn d() {
            String str = "";
            if (this.a == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new sn(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public zn.a f(Map<String, String> map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public zn.a g(Integer num) {
            this.b = num;
            return this;
        }

        public zn.a h(yn ynVar) {
            if (ynVar != null) {
                this.c = ynVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public zn.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public zn.a j(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public zn.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    private sn(String str, Integer num, yn ynVar, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = ynVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f;
    }

    public Integer d() {
        return this.b;
    }

    public yn e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.zn
            r2 = 0
            if (r1 == 0) goto L_0x005b
            zn r8 = (defpackage.zn) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            yn r1 = r7.c
            yn r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.d
            long r5 = r8.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.e
            long r5 = r8.k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f
            java.util.Map r8 = r8.c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn.equals(java.lang.Object):boolean");
    }

    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public String j() {
        return this.a;
    }

    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
