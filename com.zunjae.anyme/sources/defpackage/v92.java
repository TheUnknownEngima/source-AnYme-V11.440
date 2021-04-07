package defpackage;

import kotlinx.coroutines.l0;

/* renamed from: v92  reason: default package */
public final class v92 extends t92 {
    public final Runnable g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v92(Runnable runnable, long j, u92 u92) {
        super(j, u92);
        v62.f(runnable, "block");
        v62.f(u92, "taskContext");
        this.g = runnable;
    }

    public void run() {
        try {
            this.g.run();
        } finally {
            this.f.t();
        }
    }

    public String toString() {
        return "Task[" + l0.a(this.g) + '@' + l0.b(this.g) + ", " + this.e + ", " + this.f + ']';
    }
}
