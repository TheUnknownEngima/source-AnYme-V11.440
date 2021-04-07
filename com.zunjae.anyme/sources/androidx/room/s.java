package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class s {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final l b;
    private volatile q6 c;

    public s(l lVar) {
        this.b = lVar;
    }

    private q6 c() {
        return this.b.e(d());
    }

    private q6 e(boolean z) {
        if (!z) {
            return c();
        }
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }

    public q6 a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public void f(q6 q6Var) {
        if (q6Var == this.c) {
            this.a.set(false);
        }
    }
}
