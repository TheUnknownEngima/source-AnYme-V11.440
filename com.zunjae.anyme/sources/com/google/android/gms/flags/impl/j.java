package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;

public final class j {
    private static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) mq0.a(new k(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
