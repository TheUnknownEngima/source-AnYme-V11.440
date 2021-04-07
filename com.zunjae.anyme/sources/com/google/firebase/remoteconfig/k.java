package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

final /* synthetic */ class k implements Callable {
    private final m a;

    private k(m mVar) {
        this.a = mVar;
    }

    public static Callable a(m mVar) {
        return new k(mVar);
    }

    public Object call() {
        return this.a.e();
    }
}
