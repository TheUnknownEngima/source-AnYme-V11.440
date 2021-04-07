package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.r;

final class r0<T> extends r<T> {
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_decision");
    private volatile int _decision = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(n42 n42, k42<? super T> k42) {
        super(n42, k42);
        v62.f(n42, "context");
        v62.f(k42, "uCont");
    }

    private final boolean w0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!i.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean x0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!i.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void n(Object obj, int i2) {
        if (!w0()) {
            super.n(obj, i2);
        }
    }

    public int p0() {
        return 1;
    }

    public final Object v0() {
        if (x0()) {
            return s42.d();
        }
        Object e = x1.e(H());
        if (!(e instanceof s)) {
            return e;
        }
        throw ((s) e).a;
    }
}
