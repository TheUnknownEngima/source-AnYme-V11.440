package com.google.firebase.messaging;

import android.content.Intent;

final /* synthetic */ class d implements Runnable {
    private final EnhancedIntentService e;
    private final Intent f;
    private final f81 g;

    d(EnhancedIntentService enhancedIntentService, Intent intent, f81 f81) {
        this.e = enhancedIntentService;
        this.f = intent;
        this.g = f81;
    }

    public final void run() {
        this.e.g(this.f, this.g);
    }
}
