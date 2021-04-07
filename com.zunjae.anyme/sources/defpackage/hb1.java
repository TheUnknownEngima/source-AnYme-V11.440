package defpackage;

import java.util.concurrent.Executor;

/* renamed from: hb1  reason: default package */
final /* synthetic */ class hb1 implements Executor {
    static final Executor e = new hb1();

    private hb1() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
