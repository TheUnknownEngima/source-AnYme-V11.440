package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: m81  reason: default package */
final class m81<TResult> implements x81<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public y71 c;

    public m81(Executor executor, y71 y71) {
        this.a = executor;
        this.c = y71;
    }

    public final void b(e81<TResult> e81) {
        if (e81.o()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new o81(this));
                }
            }
        }
    }
}
