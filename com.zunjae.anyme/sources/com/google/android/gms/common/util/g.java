package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.internal.r;

public final class g {
    public static boolean a(Context context, Throwable th) {
        return b(context, th, 536870912);
    }

    private static boolean b(Context context, Throwable th, int i) {
        try {
            r.j(context);
            r.j(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
