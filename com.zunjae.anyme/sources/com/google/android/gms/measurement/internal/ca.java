package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.r;

public final class ca {
    final Context a;

    public ca(Context context) {
        r.j(context);
        Context applicationContext = context.getApplicationContext();
        r.j(applicationContext);
        this.a = applicationContext;
    }
}
