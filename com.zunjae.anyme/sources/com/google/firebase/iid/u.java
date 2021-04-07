package com.google.firebase.iid;

import android.content.Intent;
import java.util.concurrent.Callable;

final /* synthetic */ class u implements Callable {
    private final Intent a;

    u(Intent intent) {
        this.a = intent;
    }

    public final Object call() {
        return Integer.valueOf(v.c(this.a));
    }
}
