package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class b7 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ l6 i;

    b7(l6 l6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.i = l6Var;
        this.e = atomicReference;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public final void run() {
        this.i.a.P().S(this.e, this.f, this.g, this.h);
    }
}
