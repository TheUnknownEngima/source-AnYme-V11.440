package defpackage;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: a91  reason: default package */
final class a91<TResult> extends e81<TResult> {
    private final Object a = new Object();
    private final y81<TResult> b = new y81<>();
    @GuardedBy("mLock")
    private boolean c;
    private volatile boolean d;
    @GuardedBy("mLock")
    private TResult e;
    @GuardedBy("mLock")
    private Exception f;

    a91() {
    }

    @GuardedBy("mLock")
    private final void A() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void B() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    @GuardedBy("mLock")
    private final void w() {
        r.n(this.c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void z() {
        r.n(!this.c, "Task is already complete");
    }

    public final e81<TResult> a(Executor executor, y71 y71) {
        y81<TResult> y81 = this.b;
        c91.a(executor);
        y81.b(new m81(executor, y71));
        B();
        return this;
    }

    public final e81<TResult> b(z71<TResult> z71) {
        c(g81.a, z71);
        return this;
    }

    public final e81<TResult> c(Executor executor, z71<TResult> z71) {
        y81<TResult> y81 = this.b;
        c91.a(executor);
        y81.b(new q81(executor, z71));
        B();
        return this;
    }

    public final e81<TResult> d(a81 a81) {
        e(g81.a, a81);
        return this;
    }

    public final e81<TResult> e(Executor executor, a81 a81) {
        y81<TResult> y81 = this.b;
        c91.a(executor);
        y81.b(new r81(executor, a81));
        B();
        return this;
    }

    public final e81<TResult> f(b81<? super TResult> b81) {
        g(g81.a, b81);
        return this;
    }

    public final e81<TResult> g(Executor executor, b81<? super TResult> b81) {
        y81<TResult> y81 = this.b;
        c91.a(executor);
        y81.b(new u81(executor, b81));
        B();
        return this;
    }

    public final <TContinuationResult> e81<TContinuationResult> h(x71<TResult, TContinuationResult> x71) {
        return i(g81.a, x71);
    }

    public final <TContinuationResult> e81<TContinuationResult> i(Executor executor, x71<TResult, TContinuationResult> x71) {
        a91 a91 = new a91();
        y81<TResult> y81 = this.b;
        c91.a(executor);
        y81.b(new j81(executor, x71, a91));
        B();
        return a91;
    }

    public final <TContinuationResult> e81<TContinuationResult> j(x71<TResult, e81<TContinuationResult>> x71) {
        return k(g81.a, x71);
    }

    public final <TContinuationResult> e81<TContinuationResult> k(Executor executor, x71<TResult, e81<TContinuationResult>> x71) {
        a91 a91 = new a91();
        y81<TResult> y81 = this.b;
        c91.a(executor);
        y81.b(new k81(executor, x71, a91));
        B();
        return a91;
    }

    public final Exception l() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final TResult m() {
        TResult tresult;
        synchronized (this.a) {
            w();
            A();
            if (this.f == null) {
                tresult = this.e;
            } else {
                throw new c81(this.f);
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult n(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            w();
            A();
            if (cls.isInstance(this.f)) {
                throw ((Throwable) cls.cast(this.f));
            } else if (this.f == null) {
                tresult = this.e;
            } else {
                throw new c81(this.f);
            }
        }
        return tresult;
    }

    public final boolean o() {
        return this.d;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    public final <TContinuationResult> e81<TContinuationResult> r(d81<TResult, TContinuationResult> d81) {
        return s(g81.a, d81);
    }

    public final <TContinuationResult> e81<TContinuationResult> s(Executor executor, d81<TResult, TContinuationResult> d81) {
        a91 a91 = new a91();
        y81<TResult> y81 = this.b;
        c91.a(executor);
        y81.b(new v81(executor, d81, a91));
        B();
        return a91;
    }

    public final void t(Exception exc) {
        r.k(exc, "Exception must not be null");
        synchronized (this.a) {
            z();
            this.c = true;
            this.f = exc;
        }
        this.b.a(this);
    }

    public final void u(TResult tresult) {
        synchronized (this.a) {
            z();
            this.c = true;
            this.e = tresult;
        }
        this.b.a(this);
    }

    public final boolean v() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a(this);
            return true;
        }
    }

    public final boolean x(Exception exc) {
        r.k(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean y(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a(this);
            return true;
        }
    }
}
