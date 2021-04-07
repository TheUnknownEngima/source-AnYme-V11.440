package com.google.android.gms.cast.framework.media;

final /* synthetic */ class i0 implements Runnable {
    private final MediaNotificationService e;
    private final int f;

    i0(MediaNotificationService mediaNotificationService, int i) {
        this.e = mediaNotificationService;
        this.f = i;
    }

    public final void run() {
        this.e.stopSelf(this.f);
    }
}
