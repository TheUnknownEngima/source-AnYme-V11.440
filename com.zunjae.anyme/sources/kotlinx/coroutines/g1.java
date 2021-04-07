package kotlinx.coroutines;

import java.util.concurrent.Executor;

final class g1 extends f1 {
    private final Executor f;

    public g1(Executor executor) {
        v62.f(executor, "executor");
        this.f = executor;
        V();
    }

    public Executor U() {
        return this.f;
    }
}
