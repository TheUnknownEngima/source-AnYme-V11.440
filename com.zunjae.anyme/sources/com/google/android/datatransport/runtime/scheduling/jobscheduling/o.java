package com.google.android.datatransport.runtime.scheduling.jobscheduling;

final /* synthetic */ class o implements Runnable {
    private final q e;

    private o(q qVar) {
        this.e = qVar;
    }

    public static Runnable a(q qVar) {
        return new o(qVar);
    }

    public void run() {
        this.e.d.a(p.a(this.e));
    }
}
