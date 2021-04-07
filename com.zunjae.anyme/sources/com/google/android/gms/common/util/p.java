package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.j;

public final class p {
    public static boolean a(Context context, int i) {
        if (!b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return j.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            boolean isLoggable = Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i, String str) {
        return v80.a(context).i(i, str);
    }
}
