package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class y extends f {
    private final /* synthetic */ Intent e;
    private final /* synthetic */ Activity f;
    private final /* synthetic */ int g;

    y(Intent intent, Activity activity, int i) {
        this.e = intent;
        this.f = activity;
        this.g = i;
    }

    public final void b() {
        Intent intent = this.e;
        if (intent != null) {
            this.f.startActivityForResult(intent, this.g);
        }
    }
}
