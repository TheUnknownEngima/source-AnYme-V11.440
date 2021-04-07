package com.google.android.gms.measurement.internal;

final class g8 implements Runnable {
    private final /* synthetic */ a71 e;
    private final /* synthetic */ s f;
    private final /* synthetic */ String g;
    private final /* synthetic */ AppMeasurementDynamiteService h;

    g8(AppMeasurementDynamiteService appMeasurementDynamiteService, a71 a71, s sVar, String str) {
        this.h = appMeasurementDynamiteService;
        this.e = a71;
        this.f = sVar;
        this.g = str;
    }

    public final void run() {
        this.h.a.P().G(this.e, this.f, this.g);
    }
}
