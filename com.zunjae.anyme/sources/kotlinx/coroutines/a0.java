package kotlinx.coroutines;

import defpackage.l42;
import defpackage.n42;

public abstract class a0 extends h42 implements l42 {
    public a0() {
        super(l42.b);
    }

    public abstract void N(n42 n42, Runnable runnable);

    public void P(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        N(n42, runnable);
    }

    public boolean Q(n42 n42) {
        v62.f(n42, "context");
        return true;
    }

    public void a(k42<?> k42) {
        v62.f(k42, "continuation");
        l42.a.c(this, k42);
    }

    public <E extends n42.b> E get(n42.c<E> cVar) {
        v62.f(cVar, "key");
        return l42.a.a(this, cVar);
    }

    public final <T> k42<T> h(k42<? super T> k42) {
        v62.f(k42, "continuation");
        return new q0(this, k42);
    }

    public n42 minusKey(n42.c<?> cVar) {
        v62.f(cVar, "key");
        return l42.a.b(this, cVar);
    }

    public String toString() {
        return l0.a(this) + '@' + l0.b(this);
    }
}
