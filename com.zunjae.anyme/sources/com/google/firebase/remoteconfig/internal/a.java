package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

final /* synthetic */ class a implements Callable {
    private final e a;
    private final f b;

    private a(e eVar, f fVar) {
        this.a = eVar;
        this.b = fVar;
    }

    public static Callable a(e eVar, f fVar) {
        return new a(eVar, fVar);
    }

    public Object call() {
        return this.a.b.e(this.b);
    }
}
