package kotlinx.coroutines;

import defpackage.m22;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.y;

public final class e2 {
    public static final boolean a(int i) {
        return i == 1;
    }

    public static final boolean b(int i) {
        return i == 0 || i == 1;
    }

    public static final <T> void c(k42<? super T> k42, T t, int i) {
        v62.f(k42, "$this$resumeMode");
        if (i == 0) {
            m22.a aVar = m22.e;
            m22.a(t);
            k42.d(t);
        } else if (i == 1) {
            s0.d(k42, t);
        } else if (i == 2) {
            s0.f(k42, t);
        } else if (i == 3) {
            q0 q0Var = (q0) k42;
            n42 e = q0Var.e();
            Object c = y.c(e, q0Var.j);
            try {
                k42<T> k422 = q0Var.l;
                m22.a aVar2 = m22.e;
                m22.a(t);
                k422.d(t);
                u22 u22 = u22.a;
            } finally {
                y.a(e, c);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }

    public static final <T> void d(k42<? super T> k42, T t, int i) {
        v62.f(k42, "$this$resumeUninterceptedMode");
        if (i == 0) {
            k42 = r42.c(k42);
        } else if (i == 1) {
            s0.d(r42.c(k42), t);
            return;
        } else if (i != 2) {
            if (i == 3) {
                n42 e = k42.e();
                Object c = y.c(e, (Object) null);
                try {
                    m22.a aVar = m22.e;
                    m22.a(t);
                    k42.d(t);
                    u22 u22 = u22.a;
                    return;
                } finally {
                    y.a(e, c);
                }
            } else if (i != 4) {
                throw new IllegalStateException(("Invalid mode " + i).toString());
            } else {
                return;
            }
        }
        m22.a aVar2 = m22.e;
        m22.a(t);
        k42.d(t);
    }

    public static final <T> void e(k42<? super T> k42, Throwable th, int i) {
        v62.f(k42, "$this$resumeUninterceptedWithExceptionMode");
        v62.f(th, "exception");
        if (i == 0) {
            k42 = r42.c(k42);
        } else if (i == 1) {
            s0.e(r42.c(k42), th);
            return;
        } else if (i != 2) {
            if (i == 3) {
                n42 e = k42.e();
                Object c = y.c(e, (Object) null);
                try {
                    m22.a aVar = m22.e;
                    Object a = n22.a(th);
                    m22.a(a);
                    k42.d(a);
                    u22 u22 = u22.a;
                    return;
                } finally {
                    y.a(e, c);
                }
            } else if (i != 4) {
                throw new IllegalStateException(("Invalid mode " + i).toString());
            } else {
                return;
            }
        }
        m22.a aVar2 = m22.e;
        Object a2 = n22.a(th);
        m22.a(a2);
        k42.d(a2);
    }

    public static final <T> void f(k42<? super T> k42, Throwable th, int i) {
        v62.f(k42, "$this$resumeWithExceptionMode");
        v62.f(th, "exception");
        if (i == 0) {
            m22.a aVar = m22.e;
            Object a = n22.a(th);
            m22.a(a);
            k42.d(a);
        } else if (i == 1) {
            s0.e(k42, th);
        } else if (i == 2) {
            s0.g(k42, th);
        } else if (i == 3) {
            q0 q0Var = (q0) k42;
            n42 e = q0Var.e();
            Object c = y.c(e, q0Var.j);
            try {
                k42<T> k422 = q0Var.l;
                m22.a aVar2 = m22.e;
                Object a2 = n22.a(t.j(th, k422));
                m22.a(a2);
                k422.d(a2);
                u22 u22 = u22.a;
            } finally {
                y.a(e, c);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }
}
