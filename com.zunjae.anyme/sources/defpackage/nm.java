package defpackage;

/* renamed from: nm  reason: default package */
public abstract class nm {

    /* renamed from: nm$b */
    private static class b extends nm {
        private volatile boolean a;

        b() {
            super();
        }

        public void b(boolean z) {
            this.a = z;
        }

        public void c() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private nm() {
    }

    public static nm a() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public abstract void b(boolean z);

    public abstract void c();
}
