package defpackage;

import java.util.concurrent.Executor;

/* renamed from: co  reason: default package */
class co implements Executor {
    private final Executor e;

    /* renamed from: co$a */
    static class a implements Runnable {
        private final Runnable e;

        a(Runnable runnable) {
            this.e = runnable;
        }

        public void run() {
            try {
                this.e.run();
            } catch (Exception e2) {
                mo.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    co(Executor executor) {
        this.e = executor;
    }

    public void execute(Runnable runnable) {
        this.e.execute(new a(runnable));
    }
}
