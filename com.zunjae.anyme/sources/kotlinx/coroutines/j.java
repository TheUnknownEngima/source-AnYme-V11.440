package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.o1;

public class j<T> extends t0<T> implements i<T>, x42 {
    private static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(j.class, "_decision");
    private static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _state = b.e;
    private final n42 h;
    private final k42<T> i;
    private volatile w0 parentHandle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(k42<? super T> k42, int i2) {
        super(i2);
        v62.f(k42, "delegate");
        this.i = k42;
        this.h = k42.e();
    }

    private final boolean A() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!j.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean B() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!j.compareAndSet(this, 0, 1));
        return true;
    }

    private final void n(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void p(int i2) {
        if (!A()) {
            s0.b(this, i2);
        }
    }

    private final void q() {
        w0 w0Var = this.parentHandle;
        if (w0Var != null) {
            w0Var.k();
            this.parentHandle = b2.e;
        }
    }

    private final void u() {
        o1 o1Var;
        if (!v() && (o1Var = (o1) this.i.e().get(o1.d)) != null) {
            o1Var.start();
            w0 e = o1.a.e(o1Var, true, false, new m(o1Var, this), 2, (Object) null);
            this.parentHandle = e;
            if (v()) {
                e.k();
                this.parentHandle = b2.e;
            }
        }
    }

    private final g w(z52<? super Throwable, u22> z52) {
        return z52 instanceof g ? (g) z52 : new l1(z52);
    }

    private final void x(z52<? super Throwable, u22> z52, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + z52 + ", already has " + obj).toString());
    }

    private final l z(Object obj, int i2) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof c2)) {
                if (obj2 instanceof l) {
                    l lVar = (l) obj2;
                    if (lVar.c()) {
                        return lVar;
                    }
                }
                n(obj);
                throw null;
            }
        } while (!k.compareAndSet(this, obj2, obj));
        q();
        p(i2);
        return null;
    }

    public void b(Object obj, Throwable th) {
        v62.f(th, "cause");
        if (obj instanceof v) {
            try {
                ((v) obj).b.r(th);
            } catch (Throwable th2) {
                n42 e = e();
                c0.a(e, new x("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    public x42 c() {
        k42<T> k42 = this.i;
        if (!(k42 instanceof x42)) {
            k42 = null;
        }
        return (x42) k42;
    }

    public void d(Object obj) {
        z(t.a(obj), this.g);
    }

    public n42 e() {
        return this.h;
    }

    public void f(z52<? super Throwable, u22> z52) {
        Object obj;
        v62.f(z52, "handler");
        Throwable th = null;
        g gVar = null;
        do {
            obj = this._state;
            if (obj instanceof b) {
                if (gVar == null) {
                    gVar = w(z52);
                }
            } else if (obj instanceof g) {
                x(z52, obj);
                throw null;
            } else if (!(obj instanceof l)) {
                return;
            } else {
                if (((l) obj).b()) {
                    try {
                        if (!(obj instanceof s)) {
                            obj = null;
                        }
                        s sVar = (s) obj;
                        if (sVar != null) {
                            th = sVar.a;
                        }
                        z52.r(th);
                        return;
                    } catch (Throwable th2) {
                        c0.a(e(), new x("Exception in cancellation handler for " + this, th2));
                        return;
                    }
                } else {
                    x(z52, obj);
                    throw null;
                }
            }
        } while (!k.compareAndSet(this, obj, gVar));
    }

    public StackTraceElement g() {
        return null;
    }

    public final k42<T> h() {
        return this.i;
    }

    public void j(a0 a0Var, T t) {
        v62.f(a0Var, "$this$resumeUndispatched");
        k42<T> k42 = this.i;
        a0 a0Var2 = null;
        if (!(k42 instanceof q0)) {
            k42 = null;
        }
        q0 q0Var = (q0) k42;
        if (q0Var != null) {
            a0Var2 = q0Var.k;
        }
        z(t, a0Var2 == a0Var ? 3 : this.g);
    }

    public <T> T k(Object obj) {
        return obj instanceof u ? ((u) obj).a : obj instanceof v ? ((v) obj).a : obj;
    }

    public Object m() {
        return t();
    }

    public boolean o(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof c2)) {
                return false;
            }
            z = obj instanceof g;
        } while (!k.compareAndSet(this, obj, new l(this, th, z)));
        if (z) {
            try {
                ((g) obj).a(th);
            } catch (Throwable th2) {
                n42 e = e();
                c0.a(e, new x("Exception in cancellation handler for " + this, th2));
            }
        }
        q();
        p(0);
        return true;
    }

    public Throwable r(o1 o1Var) {
        v62.f(o1Var, "parent");
        return o1Var.A();
    }

    public final Object s() {
        o1 o1Var;
        u();
        if (B()) {
            return s42.d();
        }
        Object t = t();
        if (t instanceof s) {
            throw t.j(((s) t).a, this);
        } else if (this.g != 1 || (o1Var = (o1) e().get(o1.d)) == null || o1Var.b()) {
            return k(t);
        } else {
            CancellationException A = o1Var.A();
            b(t, A);
            throw t.j(A, this);
        }
    }

    public final Object t() {
        return this._state;
    }

    public String toString() {
        return y() + '(' + l0.c(this.i) + "){" + t() + "}@" + l0.b(this);
    }

    public boolean v() {
        return !(t() instanceof c2);
    }

    /* access modifiers changed from: protected */
    public String y() {
        return "CancellableContinuation";
    }
}
