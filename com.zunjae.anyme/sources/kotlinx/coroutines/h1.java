package kotlinx.coroutines;

import java.util.concurrent.Executor;

public final class h1 {
    public static final a0 a(Executor executor) {
        a0 a0Var;
        v62.f(executor, "$this$asCoroutineDispatcher");
        u0 u0Var = (u0) (!(executor instanceof u0) ? null : executor);
        return (u0Var == null || (a0Var = u0Var.e) == null) ? new g1(executor) : a0Var;
    }
}
