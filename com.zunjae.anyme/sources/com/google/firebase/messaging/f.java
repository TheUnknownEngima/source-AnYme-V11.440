package com.google.firebase.messaging;

import android.content.Intent;

final /* synthetic */ class f implements z71 {
    private final EnhancedIntentService a;
    private final Intent b;

    f(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.a = enhancedIntentService;
        this.b = intent;
    }

    public final void a(e81 e81) {
        this.a.f(this.b, e81);
    }
}
