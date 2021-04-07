package defpackage;

import defpackage.ge1;

/* renamed from: be1  reason: default package */
final class be1 extends ge1.d.C0116d.a.b.e.C0125b {
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    /* renamed from: be1$b */
    static final class b extends ge1.d.C0116d.a.b.e.C0125b.C0126a {
        private Long a;
        private String b;
        private String c;
        private Long d;
        private Integer e;

        b() {
        }

        public ge1.d.C0116d.a.b.e.C0125b a() {
            String str = "";
            if (this.a == null) {
                str = str + " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.d == null) {
                str = str + " offset";
            }
            if (this.e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new be1(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.a.b.e.C0125b.C0126a b(String str) {
            this.c = str;
            return this;
        }

        public ge1.d.C0116d.a.b.e.C0125b.C0126a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public ge1.d.C0116d.a.b.e.C0125b.C0126a d(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public ge1.d.C0116d.a.b.e.C0125b.C0126a e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public ge1.d.C0116d.a.b.e.C0125b.C0126a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    private be1(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public long d() {
        return this.d;
    }

    public long e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.ge1.d.C0116d.a.b.e.C0125b
            r2 = 0
            if (r1 == 0) goto L_0x004b
            ge1$d$d$a$b$e$b r8 = (defpackage.ge1.d.C0116d.a.b.e.C0125b) r8
            long r3 = r7.a
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.e
            int r8 = r8.c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be1.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.d;
        return this.e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }
}
