package com.google.android.datatransport.runtime.scheduling.jobscheduling;

final /* synthetic */ class b implements Runnable {
    private static final b e = new b();

    private b() {
    }

    public static Runnable a() {
        return e;
    }

    public void run() {
        AlarmManagerSchedulerBroadcastReceiver.a();
    }
}
