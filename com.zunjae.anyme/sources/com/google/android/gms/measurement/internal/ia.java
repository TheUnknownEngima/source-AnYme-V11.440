package com.google.android.gms.measurement.internal;

final class ia implements Runnable {
    private final /* synthetic */ a71 e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ AppMeasurementDynamiteService h;

    ia(AppMeasurementDynamiteService appMeasurementDynamiteService, a71 a71, String str, String str2) {
        this.h = appMeasurementDynamiteService;
        this.e = a71;
        this.f = str;
        this.g = str2;
    }

    public final void run() {
        this.h.a.P().H(this.e, this.f, this.g);
    }
}
