package com.google.android.gms.common;

import java.util.concurrent.Callable;

final /* synthetic */ class p implements Callable {
    private final boolean a;
    private final String b;
    private final o c;

    p(boolean z, String str, o oVar) {
        this.a = z;
        this.b = str;
        this.c = oVar;
    }

    public final Object call() {
        return n.b(this.a, this.b, this.c);
    }
}
