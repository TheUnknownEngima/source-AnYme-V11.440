package com.google.android.gms.cast.framework.media.widget;

final /* synthetic */ class a implements Runnable {
    private final CastSeekBar e;

    a(CastSeekBar castSeekBar) {
        this.e = castSeekBar;
    }

    public final void run() {
        this.e.sendAccessibilityEvent(4);
    }
}
