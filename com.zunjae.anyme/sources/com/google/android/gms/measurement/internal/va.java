package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

public final class va {
    va(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
