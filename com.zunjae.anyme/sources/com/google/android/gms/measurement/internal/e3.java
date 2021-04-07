package com.google.android.gms.measurement.internal;

final class e3 implements Runnable {
    private final /* synthetic */ long e;
    private final /* synthetic */ a f;

    e3(a aVar, long j) {
        this.f = aVar;
        this.e = j;
    }

    public final void run() {
        this.f.B(this.e);
    }
}
