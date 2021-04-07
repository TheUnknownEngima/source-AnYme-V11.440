package defpackage;

import defpackage.ge1;

/* renamed from: od1  reason: default package */
final class od1 extends ge1.c {
    private final he1<ge1.c.b> a;
    private final String b;

    /* renamed from: od1$b */
    static final class b extends ge1.c.a {
        private he1<ge1.c.b> a;
        private String b;

        b() {
        }

        public ge1.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new od1(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.c.a b(he1<ge1.c.b> he1) {
            if (he1 != null) {
                this.a = he1;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        public ge1.c.a c(String str) {
            this.b = str;
            return this;
        }
    }

    private od1(he1<ge1.c.b> he1, String str) {
        this.a = he1;
        this.b = str;
    }

    public he1<ge1.c.b> b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.c)) {
            return false;
        }
        ge1.c cVar = (ge1.c) obj;
        if (this.a.equals(cVar.b())) {
            String str = this.b;
            String c = cVar.c();
            if (str == null) {
                if (c == null) {
                    return true;
                }
            } else if (str.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }
}
