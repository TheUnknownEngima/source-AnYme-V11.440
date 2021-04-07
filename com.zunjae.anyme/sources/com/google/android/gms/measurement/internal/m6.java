package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;

public final class m6 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    sq0 g;
    boolean h = true;
    Long i;

    public m6(Context context, sq0 sq0, Long l) {
        r.j(context);
        Context applicationContext = context.getApplicationContext();
        r.j(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (sq0 != null) {
            this.g = sq0;
            this.b = sq0.j;
            this.c = sq0.i;
            this.d = sq0.h;
            this.h = sq0.g;
            this.f = sq0.f;
            Bundle bundle = sq0.k;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
