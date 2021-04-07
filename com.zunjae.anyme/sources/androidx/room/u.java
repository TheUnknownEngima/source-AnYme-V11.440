package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class u implements Executor {
    private final Executor e;
    private final ArrayDeque<Runnable> f = new ArrayDeque<>();
    private Runnable g;

    class a implements Runnable {
        final /* synthetic */ Runnable e;

        a(Runnable runnable) {
            this.e = runnable;
        }

        public void run() {
            try {
                this.e.run();
            } finally {
                u.this.a();
            }
        }
    }

    u(Executor executor) {
        this.e = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        Runnable poll = this.f.poll();
        this.g = poll;
        if (poll != null) {
            this.e.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f.offer(new a(runnable));
        if (this.g == null) {
            a();
        }
    }
}
