package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class a7 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ l6 j;

    a7(l6 l6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.j = l6Var;
        this.e = atomicReference;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z;
    }

    public final void run() {
        this.j.a.P().T(this.e, this.f, this.g, this.h, this.i);
    }
}
