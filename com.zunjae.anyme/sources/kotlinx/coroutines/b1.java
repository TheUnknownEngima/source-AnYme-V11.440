package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.a1;

public abstract class b1 extends z0 {
    /* access modifiers changed from: protected */
    public abstract Thread j0();

    /* access modifiers changed from: protected */
    public final void k0(long j, a1.b bVar) {
        v62.f(bVar, "delayedTask");
        if (k0.a()) {
            if (!(this != m0.k)) {
                throw new AssertionError();
            }
        }
        m0.k.L0(j, bVar);
    }

    /* access modifiers changed from: protected */
    public final void m0() {
        Thread j0 = j0();
        if (Thread.currentThread() != j0) {
            l2 a = m2.a();
            if (a != null) {
                a.e(j0);
            } else {
                LockSupport.unpark(j0);
            }
        }
    }
}
