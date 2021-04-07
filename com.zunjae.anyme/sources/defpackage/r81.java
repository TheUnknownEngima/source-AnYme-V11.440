package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: r81  reason: default package */
final class r81<TResult> implements x81<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public a81 c;

    public r81(Executor executor, a81 a81) {
        this.a = executor;
        this.c = a81;
    }

    public final void b(e81<TResult> e81) {
        if (!e81.q() && !e81.o()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new s81(this, e81));
                }
            }
        }
    }
}
