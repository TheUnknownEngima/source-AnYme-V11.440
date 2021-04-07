package kotlinx.coroutines;

import defpackage.m22;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.y;

public final class s0 {
    /* access modifiers changed from: private */
    public static final u a = new u("UNDEFINED");

    public static final <T> void b(t0<? super T> t0Var, int i) {
        v62.f(t0Var, "$this$dispatch");
        k42<? super T> h = t0Var.h();
        if (!e2.b(i) || !(h instanceof q0) || e2.a(i) != e2.a(t0Var.g)) {
            c(t0Var, h, i);
            return;
        }
        a0 a0Var = ((q0) h).k;
        n42 e = h.e();
        if (a0Var.Q(e)) {
            a0Var.N(e, t0Var);
        } else {
            h(t0Var);
        }
    }

    public static final <T> void c(t0<? super T> t0Var, k42<? super T> k42, int i) {
        v62.f(t0Var, "$this$resume");
        v62.f(k42, "delegate");
        Object m = t0Var.m();
        Throwable i2 = t0Var.i(m);
        if (i2 != null) {
            if (!(k42 instanceof t0)) {
                i2 = t.j(i2, k42);
            }
            e2.f(k42, i2, i);
            return;
        }
        e2.c(k42, t0Var.k(m), i);
    }

    public static final <T> void d(k42<? super T> k42, T t) {
        boolean z;
        n42 e;
        Object c;
        v62.f(k42, "$this$resumeCancellable");
        if (k42 instanceof q0) {
            q0 q0Var = (q0) k42;
            if (q0Var.k.Q(q0Var.e())) {
                q0Var.h = t;
                q0Var.g = 1;
                q0Var.k.N(q0Var.e(), q0Var);
                return;
            }
            z0 a2 = k2.b.a();
            if (a2.e0()) {
                q0Var.h = t;
                q0Var.g = 1;
                a2.Y(q0Var);
                return;
            }
            a2.c0(true);
            try {
                o1 o1Var = (o1) q0Var.e().get(o1.d);
                if (o1Var == null || o1Var.b()) {
                    z = false;
                } else {
                    CancellationException A = o1Var.A();
                    m22.a aVar = m22.e;
                    Object a3 = n22.a(A);
                    m22.a(a3);
                    q0Var.d(a3);
                    z = true;
                }
                if (!z) {
                    e = q0Var.e();
                    c = y.c(e, q0Var.j);
                    k42<T> k422 = q0Var.l;
                    m22.a aVar2 = m22.e;
                    m22.a(t);
                    k422.d(t);
                    u22 u22 = u22.a;
                    y.a(e, c);
                }
                do {
                } while (a2.h0());
            } catch (Throwable th) {
                try {
                    q0Var.l(th, (Throwable) null);
                } catch (Throwable th2) {
                    a2.U(true);
                    throw th2;
                }
            }
            a2.U(true);
            return;
        }
        m22.a aVar3 = m22.e;
        m22.a(t);
        k42.d(t);
    }

    public static final <T> void e(k42<? super T> k42, Throwable th) {
        n42 e;
        Object c;
        v62.f(k42, "$this$resumeCancellableWithException");
        v62.f(th, "exception");
        if (k42 instanceof q0) {
            q0 q0Var = (q0) k42;
            n42 e2 = q0Var.l.e();
            boolean z = false;
            s sVar = new s(th, false, 2, (r62) null);
            if (q0Var.k.Q(e2)) {
                q0Var.h = new s(th, false, 2, (r62) null);
                q0Var.g = 1;
                q0Var.k.N(e2, q0Var);
                return;
            }
            z0 a2 = k2.b.a();
            if (a2.e0()) {
                q0Var.h = sVar;
                q0Var.g = 1;
                a2.Y(q0Var);
                return;
            }
            a2.c0(true);
            try {
                o1 o1Var = (o1) q0Var.e().get(o1.d);
                if (o1Var != null && !o1Var.b()) {
                    CancellationException A = o1Var.A();
                    m22.a aVar = m22.e;
                    Object a3 = n22.a(A);
                    m22.a(a3);
                    q0Var.d(a3);
                    z = true;
                }
                if (!z) {
                    e = q0Var.e();
                    c = y.c(e, q0Var.j);
                    k42<T> k422 = q0Var.l;
                    m22.a aVar2 = m22.e;
                    Object a4 = n22.a(t.j(th, k422));
                    m22.a(a4);
                    k422.d(a4);
                    u22 u22 = u22.a;
                    y.a(e, c);
                }
                do {
                } while (a2.h0());
            } catch (Throwable th2) {
                try {
                    q0Var.l(th2, (Throwable) null);
                } catch (Throwable th3) {
                    a2.U(true);
                    throw th3;
                }
            }
            a2.U(true);
            return;
        }
        m22.a aVar3 = m22.e;
        Object a5 = n22.a(t.j(th, k42));
        m22.a(a5);
        k42.d(a5);
    }

    public static final <T> void f(k42<? super T> k42, T t) {
        v62.f(k42, "$this$resumeDirect");
        boolean z = k42 instanceof q0;
        k42<T> k422 = k42;
        if (z) {
            k422 = ((q0) k42).l;
        }
        m22.a aVar = m22.e;
        m22.a(t);
        k422.d(t);
    }

    public static final <T> void g(k42<? super T> k42, Throwable th) {
        v62.f(k42, "$this$resumeDirectWithException");
        v62.f(th, "exception");
        boolean z = k42 instanceof q0;
        k42<T> k422 = k42;
        if (z) {
            k422 = ((q0) k42).l;
        }
        m22.a aVar = m22.e;
        Object a2 = n22.a(t.j(th, k422));
        m22.a(a2);
        k422.d(a2);
    }

    private static final void h(t0<?> t0Var) {
        z0 a2 = k2.b.a();
        if (a2.e0()) {
            a2.Y(t0Var);
            return;
        }
        a2.c0(true);
        try {
            c(t0Var, t0Var.h(), 3);
            do {
            } while (a2.h0());
        } catch (Throwable th) {
            a2.U(true);
            throw th;
        }
        a2.U(true);
    }

    public static final boolean i(q0<? super u22> q0Var) {
        v62.f(q0Var, "$this$yieldUndispatched");
        u22 u22 = u22.a;
        z0 a2 = k2.b.a();
        if (a2.g0()) {
            return false;
        }
        if (a2.e0()) {
            q0Var.h = u22;
            q0Var.g = 1;
            a2.Y(q0Var);
            return true;
        }
        a2.c0(true);
        try {
            q0Var.run();
            do {
            } while (a2.h0());
        } catch (Throwable th) {
            a2.U(true);
            throw th;
        }
        a2.U(true);
        return false;
    }
}
