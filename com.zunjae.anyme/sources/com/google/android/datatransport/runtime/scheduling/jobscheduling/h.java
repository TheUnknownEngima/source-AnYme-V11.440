package com.google.android.datatransport.runtime.scheduling.jobscheduling;

final /* synthetic */ class h implements Runnable {
    private final m e;
    private final eo f;
    private final int g;
    private final Runnable h;

    private h(m mVar, eo eoVar, int i, Runnable runnable) {
        this.e = mVar;
        this.f = eoVar;
        this.g = i;
        this.h = runnable;
    }

    public static Runnable a(m mVar, eo eoVar, int i, Runnable runnable) {
        return new h(mVar, eoVar, i, runnable);
    }

    public void run() {
        m.e(this.e, this.f, this.g, this.h);
    }
}
