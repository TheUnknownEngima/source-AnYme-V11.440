package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: u81  reason: default package */
final class u81<TResult> implements x81<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public b81<? super TResult> c;

    public u81(Executor executor, b81<? super TResult> b81) {
        this.a = executor;
        this.c = b81;
    }

    public final void b(e81<TResult> e81) {
        if (e81.q()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new t81(this, e81));
                }
            }
        }
    }
}
