package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class l implements Executor {
    static final Executor e = new l();

    private l() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
