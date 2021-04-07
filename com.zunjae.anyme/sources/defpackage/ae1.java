package defpackage;

import defpackage.ge1;

/* renamed from: ae1  reason: default package */
final class ae1 extends ge1.d.C0116d.a.b.e {
    private final String a;
    private final int b;
    private final he1<ge1.d.C0116d.a.b.e.C0125b> c;

    /* renamed from: ae1$b */
    static final class b extends ge1.d.C0116d.a.b.e.C0124a {
        private String a;
        private Integer b;
        private he1<ge1.d.C0116d.a.b.e.C0125b> c;

        b() {
        }

        public ge1.d.C0116d.a.b.e a() {
            String str = "";
            if (this.a == null) {
                str = str + " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new ae1(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.a.b.e.C0124a b(he1<ge1.d.C0116d.a.b.e.C0125b> he1) {
            if (he1 != null) {
                this.c = he1;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public ge1.d.C0116d.a.b.e.C0124a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public ge1.d.C0116d.a.b.e.C0124a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private ae1(String str, int i, he1<ge1.d.C0116d.a.b.e.C0125b> he1) {
        this.a = str;
        this.b = i;
        this.c = he1;
    }

    public he1<ge1.d.C0116d.a.b.e.C0125b> b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.C0116d.a.b.e)) {
            return false;
        }
        ge1.d.C0116d.a.b.e eVar = (ge1.d.C0116d.a.b.e) obj;
        return this.a.equals(eVar.d()) && this.b == eVar.c() && this.c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
