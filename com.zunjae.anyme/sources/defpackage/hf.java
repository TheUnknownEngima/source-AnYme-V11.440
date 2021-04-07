package defpackage;

import defpackage.lm;

/* renamed from: hf  reason: default package */
final class hf<Z> implements Cif<Z>, lm.f {
    private static final r3<hf<?>> i = lm.d(20, new a());
    private final nm e = nm.a();
    private Cif<Z> f;
    private boolean g;
    private boolean h;

    /* renamed from: hf$a */
    class a implements lm.d<hf<?>> {
        a() {
        }

        /* renamed from: b */
        public hf<?> a() {
            return new hf<>();
        }
    }

    hf() {
    }

    private void b(Cif<Z> ifVar) {
        this.h = false;
        this.g = true;
        this.f = ifVar;
    }

    static <Z> hf<Z> e(Cif<Z> ifVar) {
        hf<Z> b = i.b();
        jm.d(b);
        hf<Z> hfVar = b;
        hfVar.b(ifVar);
        return hfVar;
    }

    private void f() {
        this.f = null;
        i.c(this);
    }

    public synchronized void a() {
        this.e.c();
        this.h = true;
        if (!this.g) {
            this.f.a();
            f();
        }
    }

    public int c() {
        return this.f.c();
    }

    public Class<Z> d() {
        return this.f.d();
    }

    /* access modifiers changed from: package-private */
    public synchronized void g() {
        this.e.c();
        if (this.g) {
            this.g = false;
            if (this.h) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.f.get();
    }

    public nm h() {
        return this.e;
    }
}
