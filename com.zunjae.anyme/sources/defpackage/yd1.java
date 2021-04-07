package defpackage;

import defpackage.ge1;

/* renamed from: yd1  reason: default package */
final class yd1 extends ge1.d.C0116d.a.b.c {
    private final String a;
    private final String b;
    private final he1<ge1.d.C0116d.a.b.e.C0125b> c;
    private final ge1.d.C0116d.a.b.c d;
    private final int e;

    /* renamed from: yd1$b */
    static final class b extends ge1.d.C0116d.a.b.c.C0121a {
        private String a;
        private String b;
        private he1<ge1.d.C0116d.a.b.e.C0125b> c;
        private ge1.d.C0116d.a.b.c d;
        private Integer e;

        b() {
        }

        public ge1.d.C0116d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new yd1(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.a.b.c.C0121a b(ge1.d.C0116d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        public ge1.d.C0116d.a.b.c.C0121a c(he1<ge1.d.C0116d.a.b.e.C0125b> he1) {
            if (he1 != null) {
                this.c = he1;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public ge1.d.C0116d.a.b.c.C0121a d(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public ge1.d.C0116d.a.b.c.C0121a e(String str) {
            this.b = str;
            return this;
        }

        public ge1.d.C0116d.a.b.c.C0121a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    private yd1(String str, String str2, he1<ge1.d.C0116d.a.b.e.C0125b> he1, ge1.d.C0116d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = he1;
        this.d = cVar;
        this.e = i;
    }

    public ge1.d.C0116d.a.b.c b() {
        return this.d;
    }

    public he1<ge1.d.C0116d.a.b.e.C0125b> c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public String e() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.ge1.d.C0116d.a.b.c
            r2 = 0
            if (r1 == 0) goto L_0x0058
            ge1$d$d$a$b$c r5 = (defpackage.ge1.d.C0116d.a.b.c) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            he1<ge1$d$d$a$b$e$b> r1 = r4.c
            he1 r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            ge1$d$d$a$b$c r1 = r4.d
            if (r1 != 0) goto L_0x0043
            ge1$d$d$a$b$c r1 = r5.b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            ge1$d$d$a$b$c r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.e
            int r5 = r5.d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd1.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        ge1.d.C0116d.a.b.c cVar = this.d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }
}
