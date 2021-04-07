package com.cunoraz.tagview;

import android.content.Context;
import android.util.TypedValue;

public class c {
    public static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
