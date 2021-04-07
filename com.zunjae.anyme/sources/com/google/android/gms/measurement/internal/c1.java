package com.google.android.gms.measurement.internal;

final class c1 implements Runnable {
    private final /* synthetic */ String e;
    private final /* synthetic */ long f;
    private final /* synthetic */ a g;

    c1(a aVar, String str, long j) {
        this.g = aVar;
        this.e = str;
        this.f = j;
    }

    public final void run() {
        this.g.E(this.e, this.f);
    }
}
