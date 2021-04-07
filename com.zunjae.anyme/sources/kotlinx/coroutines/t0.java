package kotlinx.coroutines;

import defpackage.m22;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.y;

public abstract class t0<T> extends t92 {
    public int g;

    public t0(int i) {
        this.g = i;
    }

    public void b(Object obj, Throwable th) {
        v62.f(th, "cause");
    }

    public abstract k42<T> h();

    public final Throwable i(Object obj) {
        if (!(obj instanceof s)) {
            obj = null;
        }
        s sVar = (s) obj;
        if (sVar != null) {
            return sVar.a;
        }
        return null;
    }

    public <T> T k(Object obj) {
        return obj;
    }

    public final void l(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                z12.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th != null) {
                c0.a(h().e(), new j0(str, th));
                return;
            }
            v62.l();
            throw null;
        }
    }

    public abstract Object m();

    public final void run() {
        Object obj;
        n42 e;
        Object c;
        Object k;
        Object obj2;
        u92 u92 = this.f;
        try {
            k42 h = h();
            if (h != null) {
                q0 q0Var = (q0) h;
                k42<T> k42 = q0Var.l;
                e = k42.e();
                Object m = m();
                c = y.c(e, q0Var.j);
                Throwable i = i(m);
                o1 o1Var = e2.a(this.g) ? (o1) e.get(o1.d) : null;
                if (i == null && o1Var != null && !o1Var.b()) {
                    CancellationException A = o1Var.A();
                    b(m, A);
                    m22.a aVar = m22.e;
                    k = n22.a(t.j(A, k42));
                    m22.a(k);
                } else if (i != null) {
                    m22.a aVar2 = m22.e;
                    k = n22.a(t.j(i, k42));
                    m22.a(k);
                } else {
                    k = k(m);
                    m22.a aVar3 = m22.e;
                    m22.a(k);
                }
                k42.d(k);
                u22 u22 = u22.a;
                y.a(e, c);
                try {
                    m22.a aVar4 = m22.e;
                    u92.t();
                    obj2 = u22.a;
                    m22.a(obj2);
                } catch (Throwable th) {
                    m22.a aVar5 = m22.e;
                    obj2 = n22.a(th);
                    m22.a(obj2);
                }
                l((Throwable) null, m22.b(obj2));
                return;
            }
            throw new r22("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                m22.a aVar6 = m22.e;
                u92.t();
                obj = u22.a;
                m22.a(obj);
            } catch (Throwable th3) {
                m22.a aVar7 = m22.e;
                obj = n22.a(th3);
                m22.a(obj);
            }
            l(th2, m22.b(obj));
        }
    }
}
