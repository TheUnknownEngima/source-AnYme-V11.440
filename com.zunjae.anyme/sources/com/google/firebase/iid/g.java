package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class g implements Executor {
    static final Executor e = new g();

    private g() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
