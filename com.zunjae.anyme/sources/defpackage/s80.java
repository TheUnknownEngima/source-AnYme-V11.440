package defpackage;

import android.os.Process;

/* renamed from: s80  reason: default package */
final class s80 implements Runnable {
    private final Runnable e;
    private final int f;

    public s80(Runnable runnable, int i) {
        this.e = runnable;
        this.f = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f);
        this.e.run();
    }
}
