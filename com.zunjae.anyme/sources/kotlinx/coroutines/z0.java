package kotlinx.coroutines;

import kotlinx.coroutines.internal.a;

public abstract class z0 extends a0 {
    private long e;
    private boolean f;
    private a<t0<?>> g;

    private final long V(boolean z) {
        return z ? 4294967296L : 1;
    }

    public static /* synthetic */ void d0(z0 z0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            z0Var.c0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void U(boolean z) {
        long V = this.e - V(z);
        this.e = V;
        if (V <= 0) {
            if (k0.a()) {
                if (!(this.e == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f) {
                shutdown();
            }
        }
    }

    public final void Y(t0<?> t0Var) {
        v62.f(t0Var, "task");
        a<t0<?>> aVar = this.g;
        if (aVar == null) {
            aVar = new a<>();
            this.g = aVar;
        }
        aVar.a(t0Var);
    }

    /* access modifiers changed from: protected */
    public long Z() {
        a<t0<?>> aVar = this.g;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0;
    }

    public final void c0(boolean z) {
        this.e += V(z);
        if (!z) {
            this.f = true;
        }
    }

    public final boolean e0() {
        return this.e >= V(true);
    }

    public final boolean g0() {
        a<t0<?>> aVar = this.g;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }

    public final boolean h0() {
        t0 d;
        a<t0<?>> aVar = this.g;
        if (aVar == null || (d = aVar.d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }
}
