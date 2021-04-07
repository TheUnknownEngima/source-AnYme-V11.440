package defpackage;

import java.util.concurrent.Executor;

/* renamed from: q8  reason: default package */
enum q8 implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
