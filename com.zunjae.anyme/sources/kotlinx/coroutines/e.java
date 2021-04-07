package kotlinx.coroutines;

import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.y;

final /* synthetic */ class e {
    public static final o1 a(f0 f0Var, n42 n42, i0 i0Var, d62<? super f0, ? super k42<? super u22>, ? extends Object> d62) {
        v62.f(f0Var, "$this$launch");
        v62.f(n42, "context");
        v62.f(i0Var, "start");
        v62.f(d62, "block");
        n42 c = z.c(f0Var, n42);
        a y1Var = i0Var.isLazy() ? new y1(c, d62) : new g2(c, true);
        y1Var.u0(i0Var, y1Var, d62);
        return y1Var;
    }

    public static /* synthetic */ o1 b(f0 f0Var, n42 n42, i0 i0Var, d62 d62, int i, Object obj) {
        if ((i & 1) != 0) {
            n42 = o42.e;
        }
        if ((i & 2) != 0) {
            i0Var = i0.DEFAULT;
        }
        return d.a(f0Var, n42, i0Var, d62);
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object c(n42 n42, d62<? super f0, ? super k42<? super T>, ? extends Object> d62, k42<? super T> k42) {
        Object obj;
        n42 e = k42.e();
        n42 plus = e.plus(n42);
        p2.a(plus);
        if (plus == e) {
            r rVar = new r(plus, k42);
            obj = k92.c(rVar, rVar, d62);
        } else if (v62.a((l42) plus.get(l42.b), (l42) e.get(l42.b))) {
            o2 o2Var = new o2(plus, k42);
            Object c = y.c(plus, (Object) null);
            try {
                Object c2 = k92.c(o2Var, o2Var, d62);
                y.a(plus, c);
                obj = c2;
            } catch (Throwable th) {
                y.a(plus, c);
                throw th;
            }
        } else {
            r0 r0Var = new r0(plus, k42);
            r0Var.q0();
            j92.b(d62, r0Var, r0Var);
            obj = r0Var.v0();
        }
        if (obj == s42.d()) {
            a52.c(k42);
        }
        return obj;
    }
}
