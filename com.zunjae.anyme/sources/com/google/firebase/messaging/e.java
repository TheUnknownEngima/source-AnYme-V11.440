package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class e implements Executor {
    static final Executor e = new e();

    private e() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
