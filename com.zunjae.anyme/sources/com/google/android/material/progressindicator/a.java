package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;

public class a {
    private static float a = 1.0f;

    public float a(ContentResolver contentResolver) {
        int i = Build.VERSION.SDK_INT;
        return i >= 17 ? Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) : i == 16 ? Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f) : a;
    }
}
