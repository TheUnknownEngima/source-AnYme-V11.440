package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

final /* synthetic */ class d9 implements Runnable {
    private final b9 e;
    private final c4 f;
    private final JobParameters g;

    d9(b9 b9Var, c4 c4Var, JobParameters jobParameters) {
        this.e = b9Var;
        this.f = c4Var;
        this.g = jobParameters;
    }

    public final void run() {
        this.e.e(this.f, this.g);
    }
}
