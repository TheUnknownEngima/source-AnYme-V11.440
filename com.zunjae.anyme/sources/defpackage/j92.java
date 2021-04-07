package defpackage;

import defpackage.m22;
import kotlinx.coroutines.s0;

/* renamed from: j92  reason: default package */
public final class j92 {
    public static final <T> void a(z52<? super k42<? super T>, ? extends Object> z52, k42<? super T> k42) {
        v62.f(z52, "$this$startCoroutineCancellable");
        v62.f(k42, "completion");
        try {
            s0.d(r42.c(r42.a(z52, k42)), u22.a);
        } catch (Throwable th) {
            m22.a aVar = m22.e;
            Object a = n22.a(th);
            m22.a(a);
            k42.d(a);
        }
    }

    public static final <R, T> void b(d62<? super R, ? super k42<? super T>, ? extends Object> d62, R r, k42<? super T> k42) {
        v62.f(d62, "$this$startCoroutineCancellable");
        v62.f(k42, "completion");
        try {
            s0.d(r42.c(r42.b(d62, r, k42)), u22.a);
        } catch (Throwable th) {
            m22.a aVar = m22.e;
            Object a = n22.a(th);
            m22.a(a);
            k42.d(a);
        }
    }
}
