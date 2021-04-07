package defpackage;

import defpackage.ge1;

/* renamed from: wd1  reason: default package */
final class wd1 extends ge1.d.C0116d.a.b {
    private final he1<ge1.d.C0116d.a.b.e> a;
    private final ge1.d.C0116d.a.b.c b;
    private final ge1.d.C0116d.a.b.C0122d c;
    private final he1<ge1.d.C0116d.a.b.C0118a> d;

    /* renamed from: wd1$b */
    static final class b extends ge1.d.C0116d.a.b.C0120b {
        private he1<ge1.d.C0116d.a.b.e> a;
        private ge1.d.C0116d.a.b.c b;
        private ge1.d.C0116d.a.b.C0122d c;
        private he1<ge1.d.C0116d.a.b.C0118a> d;

        b() {
        }

        public ge1.d.C0116d.a.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " threads";
            }
            if (this.b == null) {
                str = str + " exception";
            }
            if (this.c == null) {
                str = str + " signal";
            }
            if (this.d == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new wd1(this.a, this.b, this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.a.b.C0120b b(he1<ge1.d.C0116d.a.b.C0118a> he1) {
            if (he1 != null) {
                this.d = he1;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        public ge1.d.C0116d.a.b.C0120b c(ge1.d.C0116d.a.b.c cVar) {
            if (cVar != null) {
                this.b = cVar;
                return this;
            }
            throw new NullPointerException("Null exception");
        }

        public ge1.d.C0116d.a.b.C0120b d(ge1.d.C0116d.a.b.C0122d dVar) {
            if (dVar != null) {
                this.c = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        public ge1.d.C0116d.a.b.C0120b e(he1<ge1.d.C0116d.a.b.e> he1) {
            if (he1 != null) {
                this.a = he1;
                return this;
            }
            throw new NullPointerException("Null threads");
        }
    }

    private wd1(he1<ge1.d.C0116d.a.b.e> he1, ge1.d.C0116d.a.b.c cVar, ge1.d.C0116d.a.b.C0122d dVar, he1<ge1.d.C0116d.a.b.C0118a> he12) {
        this.a = he1;
        this.b = cVar;
        this.c = dVar;
        this.d = he12;
    }

    public he1<ge1.d.C0116d.a.b.C0118a> b() {
        return this.d;
    }

    public ge1.d.C0116d.a.b.c c() {
        return this.b;
    }

    public ge1.d.C0116d.a.b.C0122d d() {
        return this.c;
    }

    public he1<ge1.d.C0116d.a.b.e> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.C0116d.a.b)) {
            return false;
        }
        ge1.d.C0116d.a.b bVar = (ge1.d.C0116d.a.b) obj;
        return this.a.equals(bVar.e()) && this.b.equals(bVar.c()) && this.c.equals(bVar.d()) && this.d.equals(bVar.b());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", signal=" + this.c + ", binaries=" + this.d + "}";
    }
}
