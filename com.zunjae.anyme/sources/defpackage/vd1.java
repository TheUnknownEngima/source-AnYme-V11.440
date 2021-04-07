package defpackage;

import defpackage.ge1;

/* renamed from: vd1  reason: default package */
final class vd1 extends ge1.d.C0116d.a {
    private final ge1.d.C0116d.a.b a;
    private final he1<ge1.b> b;
    private final Boolean c;
    private final int d;

    /* renamed from: vd1$b */
    static final class b extends ge1.d.C0116d.a.C0117a {
        private ge1.d.C0116d.a.b a;
        private he1<ge1.b> b;
        private Boolean c;
        private Integer d;

        b() {
        }

        private b(ge1.d.C0116d.a aVar) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.b();
            this.d = Integer.valueOf(aVar.e());
        }

        public ge1.d.C0116d.a a() {
            String str = "";
            if (this.a == null) {
                str = str + " execution";
            }
            if (this.d == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new vd1(this.a, this.b, this.c, this.d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.a.C0117a b(Boolean bool) {
            this.c = bool;
            return this;
        }

        public ge1.d.C0116d.a.C0117a c(he1<ge1.b> he1) {
            this.b = he1;
            return this;
        }

        public ge1.d.C0116d.a.C0117a d(ge1.d.C0116d.a.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        public ge1.d.C0116d.a.C0117a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }
    }

    private vd1(ge1.d.C0116d.a.b bVar, he1<ge1.b> he1, Boolean bool, int i) {
        this.a = bVar;
        this.b = he1;
        this.c = bool;
        this.d = i;
    }

    public Boolean b() {
        return this.c;
    }

    public he1<ge1.b> c() {
        return this.b;
    }

    public ge1.d.C0116d.a.b d() {
        return this.a;
    }

    public int e() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.c;
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
            boolean r1 = r5 instanceof defpackage.ge1.d.C0116d.a
            r2 = 0
            if (r1 == 0) goto L_0x004c
            ge1$d$d$a r5 = (defpackage.ge1.d.C0116d.a) r5
            ge1$d$d$a$b r1 = r4.a
            ge1$d$d$a$b r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            he1<ge1$b> r1 = r4.b
            if (r1 != 0) goto L_0x0022
            he1 r1 = r5.c()
            if (r1 != 0) goto L_0x004a
            goto L_0x002c
        L_0x0022:
            he1 r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x002c:
            java.lang.Boolean r1 = r4.c
            if (r1 != 0) goto L_0x0037
            java.lang.Boolean r1 = r5.b()
            if (r1 != 0) goto L_0x004a
            goto L_0x0041
        L_0x0037:
            java.lang.Boolean r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x0041:
            int r1 = r4.d
            int r5 = r5.e()
            if (r1 != r5) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd1.equals(java.lang.Object):boolean");
    }

    public ge1.d.C0116d.a.C0117a f() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        he1<ge1.b> he1 = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (he1 == null ? 0 : he1.hashCode())) * 1000003;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.d;
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", background=" + this.c + ", uiOrientation=" + this.d + "}";
    }
}
