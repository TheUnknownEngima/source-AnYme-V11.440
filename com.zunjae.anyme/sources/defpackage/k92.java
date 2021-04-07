package defpackage;

import defpackage.m22;
import kotlinx.coroutines.a;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.s;
import kotlinx.coroutines.x1;

/* renamed from: k92  reason: default package */
public final class k92 {
    public static final <T> void a(z52<? super k42<? super T>, ? extends Object> z52, k42<? super T> k42) {
        Object obj;
        n42 e;
        Object c;
        v62.f(z52, "$this$startCoroutineUndispatched");
        v62.f(k42, "completion");
        a52.a(k42);
        try {
            e = k42.e();
            c = y.c(e, (Object) null);
            i72.c(z52, 1);
            obj = z52.r(k42);
            y.a(e, c);
            if (obj != s42.d()) {
                m22.a aVar = m22.e;
                m22.a(obj);
                k42.d(obj);
            }
        } catch (Throwable th) {
            m22.a aVar2 = m22.e;
            obj = n22.a(th);
        }
    }

    public static final <R, T> void b(d62<? super R, ? super k42<? super T>, ? extends Object> d62, R r, k42<? super T> k42) {
        Object obj;
        n42 e;
        Object c;
        v62.f(d62, "$this$startCoroutineUndispatched");
        v62.f(k42, "completion");
        a52.a(k42);
        try {
            e = k42.e();
            c = y.c(e, (Object) null);
            i72.c(d62, 2);
            obj = d62.G(r, k42);
            y.a(e, c);
            if (obj != s42.d()) {
                m22.a aVar = m22.e;
                m22.a(obj);
                k42.d(obj);
            }
        } catch (Throwable th) {
            m22.a aVar2 = m22.e;
            obj = n22.a(th);
        }
    }

    public static final <T, R> Object c(a<? super T> aVar, R r, d62<? super R, ? super k42<? super T>, ? extends Object> d62) {
        Object obj;
        v62.f(aVar, "$this$startUndispatchedOrReturn");
        v62.f(d62, "block");
        aVar.q0();
        try {
            i72.c(d62, 2);
            obj = d62.G(r, aVar);
        } catch (Throwable th) {
            obj = new s(th, false, 2, (r62) null);
        }
        if (obj == s42.d() || !aVar.S(obj, 4)) {
            return s42.d();
        }
        Object H = aVar.H();
        if (!(H instanceof s)) {
            return x1.e(H);
        }
        throw kotlinx.coroutines.internal.s.a(aVar, ((s) H).a);
    }
}
