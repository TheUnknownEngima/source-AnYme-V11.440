package defpackage;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q81  reason: default package */
final class q81<TResult> implements x81<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public z71<TResult> c;

    public q81(Executor executor, z71<TResult> z71) {
        this.a = executor;
        this.c = z71;
    }

    public final void b(e81<TResult> e81) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new p81(this, e81));
            }
        }
    }
}
