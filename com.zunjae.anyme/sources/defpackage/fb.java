package defpackage;

/* renamed from: fb  reason: default package */
public class fb {
    public static final fb d;
    private final boolean a;
    private final boolean b;
    private final int c;

    /* renamed from: fb$b */
    public static class b {
        private boolean a;
        private boolean b;
        private int c;

        public b() {
        }

        public b(fb fbVar) {
            if (fbVar == null) {
                this.a = fb.d.c();
                this.c = fb.d.a();
                fbVar = fb.d;
            } else {
                this.a = fbVar.c();
                this.c = fbVar.a();
            }
            this.b = fbVar.b();
        }

        public b a(int i) {
            this.c = i;
            return this;
        }

        public b b(boolean z) {
            this.a = z;
            return this;
        }

        public fb c() {
            return new fb(this.a, this.b, this.c);
        }

        public b d(boolean z) {
            this.b = z;
            return this;
        }
    }

    static {
        b bVar = new b();
        bVar.d(false);
        bVar.b(false);
        bVar.a(0);
        d = bVar.c();
    }

    private fb(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }
}
