package kotlinx.coroutines;

import java.util.concurrent.Executor;

final class u0 implements Executor {
    public final a0 e;

    public void execute(Runnable runnable) {
        v62.f(runnable, "block");
        this.e.N(o42.e, runnable);
    }

    public String toString() {
        return this.e.toString();
    }
}
