package defpackage;

import android.graphics.Bitmap;

/* renamed from: pf  reason: default package */
class pf implements yf {
    private final b a = new b();
    private final uf<a, Bitmap> b = new uf<>();

    /* renamed from: pf$a */
    static class a implements zf {
        private final b a;
        private int b;
        private int c;
        private Bitmap.Config d;

        public a(b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.a.c(this);
        }

        public void b(int i, int i2, Bitmap.Config config) {
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            Bitmap.Config config = this.d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return pf.f(this.b, this.c, this.d);
        }
    }

    /* renamed from: pf$b */
    static class b extends qf<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a e(int i, int i2, Bitmap.Config config) {
            a aVar = (a) b();
            aVar.b(i, i2, config);
            return aVar;
        }
    }

    pf() {
    }

    static String f(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    private static String g(Bitmap bitmap) {
        return f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public String a(int i, int i2, Bitmap.Config config) {
        return f(i, i2, config);
    }

    public int b(Bitmap bitmap) {
        return km.h(bitmap);
    }

    public void c(Bitmap bitmap) {
        this.b.d(this.a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return this.b.a(this.a.e(i, i2, config));
    }

    public String e(Bitmap bitmap) {
        return g(bitmap);
    }

    public Bitmap removeLast() {
        return this.b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.b;
    }
}
