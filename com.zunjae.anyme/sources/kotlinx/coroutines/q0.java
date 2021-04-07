package kotlinx.coroutines;

import kotlinx.coroutines.internal.y;

public final class q0<T> extends t0<T> implements x42, k42<T> {
    public Object h = s0.a;
    private final x42 i;
    public final Object j;
    public final a0 k;
    public final k42<T> l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(a0 a0Var, k42<? super T> k42) {
        super(0);
        v62.f(a0Var, "dispatcher");
        v62.f(k42, "continuation");
        this.k = a0Var;
        this.l = k42;
        k42<T> k422 = this.l;
        this.i = (x42) (!(k422 instanceof x42) ? null : k422);
        this.j = y.b(e());
    }

    public x42 c() {
        return this.i;
    }

    public void d(Object obj) {
        n42 e;
        Object c;
        n42 e2 = this.l.e();
        Object a = t.a(obj);
        if (this.k.Q(e2)) {
            this.h = a;
            this.g = 0;
            this.k.N(e2, this);
            return;
        }
        z0 a2 = k2.b.a();
        if (a2.e0()) {
            this.h = a;
            this.g = 0;
            a2.Y(this);
            return;
        }
        a2.c0(true);
        try {
            e = e();
            c = y.c(e, this.j);
            this.l.d(obj);
            u22 u22 = u22.a;
            y.a(e, c);
            do {
            } while (a2.h0());
        } catch (Throwable th) {
            try {
                l(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.U(true);
                throw th2;
            }
        }
        a2.U(true);
    }

    public n42 e() {
        return this.l.e();
    }

    public StackTraceElement g() {
        return null;
    }

    public k42<T> h() {
        return this;
    }

    public Object m() {
        Object obj = this.h;
        if (k0.a()) {
            if (!(obj != s0.a)) {
                throw new AssertionError();
            }
        }
        this.h = s0.a;
        return obj;
    }

    public final void n(T t) {
        n42 e = this.l.e();
        this.h = t;
        this.g = 1;
        this.k.P(e, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.k + ", " + l0.c(this.l) + ']';
    }
}
