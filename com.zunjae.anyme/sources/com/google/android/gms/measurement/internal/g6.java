package com.google.android.gms.measurement.internal;

final class g6 implements Runnable {
    private final /* synthetic */ a71 e;
    private final /* synthetic */ AppMeasurementDynamiteService f;

    g6(AppMeasurementDynamiteService appMeasurementDynamiteService, a71 a71) {
        this.f = appMeasurementDynamiteService;
        this.e = a71;
    }

    public final void run() {
        this.f.a.P().F(this.e);
    }
}
