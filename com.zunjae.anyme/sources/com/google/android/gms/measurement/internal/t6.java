package com.google.android.gms.measurement.internal;

final class t6 implements Runnable {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ long h;
    private final /* synthetic */ l6 i;

    t6(l6 l6Var, String str, String str2, Object obj, long j) {
        this.i = l6Var;
        this.e = str;
        this.f = str2;
        this.g = obj;
        this.h = j;
    }

    public final void run() {
        this.i.Z(this.e, this.f, this.g, this.h);
    }
}
