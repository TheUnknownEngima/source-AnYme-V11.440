package com.google.android.gms.measurement.internal;

final class h9 implements Runnable {
    private final /* synthetic */ a71 e;
    private final /* synthetic */ AppMeasurementDynamiteService f;

    h9(AppMeasurementDynamiteService appMeasurementDynamiteService, a71 a71) {
        this.f = appMeasurementDynamiteService;
        this.e = a71;
    }

    public final void run() {
        this.f.a.G().T(this.e, this.f.a.T());
    }
}
