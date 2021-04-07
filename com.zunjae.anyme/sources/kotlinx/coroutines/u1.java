package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

final /* synthetic */ class u1 {
    public static final r a(o1 o1Var) {
        return new r1(o1Var);
    }

    public static /* synthetic */ r c(o1 o1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            o1Var = null;
        }
        return s1.a(o1Var);
    }

    public static /* synthetic */ o1 d(o1 o1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            o1Var = null;
        }
        return s1.a(o1Var);
    }

    public static final void e(n42 n42, CancellationException cancellationException) {
        v62.f(n42, "$this$cancel");
        o1 o1Var = (o1) n42.get(o1.d);
        if (o1Var != null) {
            o1Var.K(cancellationException);
        }
    }

    public static /* synthetic */ void f(n42 n42, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        s1.e(n42, cancellationException);
    }
}
