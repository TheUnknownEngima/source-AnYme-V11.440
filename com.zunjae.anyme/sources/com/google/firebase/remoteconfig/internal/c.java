package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {
    private final n a;

    private c(n nVar) {
        this.a = nVar;
    }

    public static Callable a(n nVar) {
        return new c(nVar);
    }

    public Object call() {
        return this.a.d();
    }
}
