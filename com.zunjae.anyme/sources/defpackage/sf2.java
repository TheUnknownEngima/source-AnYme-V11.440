package defpackage;

/* renamed from: sf2  reason: default package */
abstract class sf2 {
    i a;

    /* renamed from: sf2$b */
    static final class b extends sf2 {
        private String b;

        b() {
            super();
            this.a = i.Character;
        }

        /* access modifiers changed from: package-private */
        public sf2 l() {
            this.b = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b o(String str) {
            this.b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String p() {
            return this.b;
        }

        public String toString() {
            return p();
        }
    }

    /* renamed from: sf2$c */
    static final class c extends sf2 {
        final StringBuilder b = new StringBuilder();
        boolean c = false;

        c() {
            super();
            this.a = i.Comment;
        }

        /* access modifiers changed from: package-private */
        public sf2 l() {
            sf2.m(this.b);
            this.c = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return this.b.toString();
        }

        public String toString() {
            return "<!--" + o() + "-->";
        }
    }

    /* renamed from: sf2$d */
    static final class d extends sf2 {
        final StringBuilder b = new StringBuilder();
        String c = null;
        final StringBuilder d = new StringBuilder();
        final StringBuilder e = new StringBuilder();
        boolean f = false;

        d() {
            super();
            this.a = i.Doctype;
        }

        /* access modifiers changed from: package-private */
        public sf2 l() {
            sf2.m(this.b);
            this.c = null;
            sf2.m(this.d);
            sf2.m(this.e);
            this.f = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return this.b.toString();
        }

        /* access modifiers changed from: package-private */
        public String p() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public String q() {
            return this.d.toString();
        }

        public String r() {
            return this.e.toString();
        }

        public boolean s() {
            return this.f;
        }
    }

    /* renamed from: sf2$e */
    static final class e extends sf2 {
        e() {
            super();
            this.a = i.EOF;
        }

        /* access modifiers changed from: package-private */
        public sf2 l() {
            return this;
        }
    }

    /* renamed from: sf2$f */
    static final class f extends h {
        f() {
            this.a = i.EndTag;
        }

        public String toString() {
            return "</" + z() + ">";
        }
    }

    /* renamed from: sf2$g */
    static final class g extends h {
        g() {
            this.j = new org.jsoup.nodes.b();
            this.a = i.StartTag;
        }

        /* access modifiers changed from: package-private */
        public h D() {
            super.l();
            this.j = new org.jsoup.nodes.b();
            return this;
        }

        /* access modifiers changed from: package-private */
        public g F(String str, org.jsoup.nodes.b bVar) {
            this.b = str;
            this.j = bVar;
            this.c = str.toLowerCase();
            return this;
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ sf2 l() {
            D();
            return this;
        }

        public String toString() {
            StringBuilder sb;
            String z;
            org.jsoup.nodes.b bVar = this.j;
            if (bVar == null || bVar.size() <= 0) {
                sb = new StringBuilder();
                sb.append("<");
                z = z();
            } else {
                sb = new StringBuilder();
                sb.append("<");
                sb.append(z());
                sb.append(" ");
                z = this.j.toString();
            }
            sb.append(z);
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: sf2$h */
    static abstract class h extends sf2 {
        protected String b;
        protected String c;
        private String d;
        private StringBuilder e = new StringBuilder();
        private String f;
        private boolean g = false;
        private boolean h = false;
        boolean i = false;
        org.jsoup.nodes.b j;

        h() {
            super();
        }

        private void v() {
            this.h = true;
            String str = this.f;
            if (str != null) {
                this.e.append(str);
                this.f = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final h A(String str) {
            this.b = str;
            this.c = str.toLowerCase();
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void B() {
            org.jsoup.nodes.a aVar;
            if (this.j == null) {
                this.j = new org.jsoup.nodes.b();
            }
            if (this.d != null) {
                if (this.h) {
                    aVar = new org.jsoup.nodes.a(this.d, this.e.length() > 0 ? this.e.toString() : this.f);
                } else {
                    aVar = this.g ? new org.jsoup.nodes.a(this.d, "") : new org.jsoup.nodes.c(this.d);
                }
                this.j.y(aVar);
            }
            this.d = null;
            this.g = false;
            this.h = false;
            sf2.m(this.e);
            this.f = null;
        }

        /* access modifiers changed from: package-private */
        public final String C() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public h l() {
            this.b = null;
            this.c = null;
            this.d = null;
            sf2.m(this.e);
            this.f = null;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void E() {
            this.g = true;
        }

        /* access modifiers changed from: package-private */
        public final void o(char c2) {
            p(String.valueOf(c2));
        }

        /* access modifiers changed from: package-private */
        public final void p(String str) {
            String str2 = this.d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.d = str;
        }

        /* access modifiers changed from: package-private */
        public final void q(char c2) {
            v();
            this.e.append(c2);
        }

        /* access modifiers changed from: package-private */
        public final void r(String str) {
            v();
            if (this.e.length() == 0) {
                this.f = str;
            } else {
                this.e.append(str);
            }
        }

        /* access modifiers changed from: package-private */
        public final void s(int[] iArr) {
            v();
            for (int appendCodePoint : iArr) {
                this.e.appendCodePoint(appendCodePoint);
            }
        }

        /* access modifiers changed from: package-private */
        public final void t(char c2) {
            u(String.valueOf(c2));
        }

        /* access modifiers changed from: package-private */
        public final void u(String str) {
            String str2 = this.b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.b = str;
            this.c = str.toLowerCase();
        }

        /* access modifiers changed from: package-private */
        public final void w() {
            if (this.d != null) {
                B();
            }
        }

        /* access modifiers changed from: package-private */
        public final org.jsoup.nodes.b x() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public final boolean y() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public final String z() {
            String str = this.b;
            jf2.b(str == null || str.length() == 0);
            return this.b;
        }
    }

    /* renamed from: sf2$i */
    enum i {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    private sf2() {
    }

    static void m(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* access modifiers changed from: package-private */
    public final b a() {
        return (b) this;
    }

    /* access modifiers changed from: package-private */
    public final c b() {
        return (c) this;
    }

    /* access modifiers changed from: package-private */
    public final d c() {
        return (d) this;
    }

    /* access modifiers changed from: package-private */
    public final f d() {
        return (f) this;
    }

    /* access modifiers changed from: package-private */
    public final g e() {
        return (g) this;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.a == i.Character;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.a == i.Comment;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.a == i.Doctype;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.a == i.EOF;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.a == i.EndTag;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.a == i.StartTag;
    }

    /* access modifiers changed from: package-private */
    public abstract sf2 l();

    /* access modifiers changed from: package-private */
    public String n() {
        return getClass().getSimpleName();
    }
}
