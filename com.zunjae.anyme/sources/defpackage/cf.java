package defpackage;

import com.bumptech.glide.load.g;

/* renamed from: cf  reason: default package */
class cf<Z> implements Cif<Z> {
    private final boolean e;
    private final boolean f;
    private final Cif<Z> g;
    private final a h;
    private final g i;
    private int j;
    private boolean k;

    /* renamed from: cf$a */
    interface a {
        void d(g gVar, cf<?> cfVar);
    }

    cf(Cif<Z> ifVar, boolean z, boolean z2, g gVar, a aVar) {
        jm.d(ifVar);
        this.g = ifVar;
        this.e = z;
        this.f = z2;
        this.i = gVar;
        jm.d(aVar);
        this.h = aVar;
    }

    public synchronized void a() {
        if (this.j > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.k) {
            this.k = true;
            if (this.f) {
                this.g.a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        if (!this.k) {
            this.j++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public int c() {
        return this.g.c();
    }

    public Class<Z> d() {
        return this.g.d();
    }

    /* access modifiers changed from: package-private */
    public Cif<Z> e() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        boolean z;
        synchronized (this) {
            if (this.j > 0) {
                z = true;
                int i2 = this.j - 1;
                this.j = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.h.d(this.i, this);
        }
    }

    public Z get() {
        return this.g.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.e + ", listener=" + this.h + ", key=" + this.i + ", acquired=" + this.j + ", isRecycled=" + this.k + ", resource=" + this.g + '}';
    }
}
