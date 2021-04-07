package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class m1 extends q1<o1> {
    private static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(m1.class, "_invoked");
    private volatile int _invoked = 0;
    private final z52<Throwable, u22> i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1(o1 o1Var, z52<? super Throwable, u22> z52) {
        super(o1Var);
        v62.f(o1Var, "job");
        v62.f(z52, "handler");
        this.i = z52;
    }

    public /* bridge */ /* synthetic */ Object r(Object obj) {
        y((Throwable) obj);
        return u22.a;
    }

    public String toString() {
        return "InvokeOnCancelling[" + l0.a(this) + '@' + l0.b(this) + ']';
    }

    public void y(Throwable th) {
        if (j.compareAndSet(this, 0, 1)) {
            this.i.r(th);
        }
    }
}
