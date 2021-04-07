package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.o;
import java.util.concurrent.Callable;

final /* synthetic */ class l implements Callable {
    private final o a;

    private l(o oVar) {
        this.a = oVar;
    }

    public static Callable a(o oVar) {
        return new l(oVar);
    }

    public Object call() {
        return Boolean.valueOf(this.a.j());
    }
}
