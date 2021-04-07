package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {
    private final Context a;
    private final Intent b;

    b(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final Object call() {
        return Integer.valueOf(q0.b().g(this.a, this.b));
    }
}
