package com.google.android.gms.measurement.internal;

final class g7 implements Runnable {
    private final /* synthetic */ a71 e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ AppMeasurementDynamiteService i;

    g7(AppMeasurementDynamiteService appMeasurementDynamiteService, a71 a71, String str, String str2, boolean z) {
        this.i = appMeasurementDynamiteService;
        this.e = a71;
        this.f = str;
        this.g = str2;
        this.h = z;
    }

    public final void run() {
        this.i.a.P().I(this.e, this.f, this.g, this.h);
    }
}
