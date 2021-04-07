package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class i {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static boolean a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        return c(context.getPackageManager());
    }

    @TargetApi(20)
    public static boolean c(PackageManager packageManager) {
        if (a == null) {
            a = Boolean.valueOf(m.g() && packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (!b(context)) {
            return false;
        }
        if (m.j()) {
            return e(context) && !m.k();
        }
        return true;
    }

    @TargetApi(21)
    private static boolean e(Context context) {
        if (b == null) {
            b = Boolean.valueOf(m.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }

    public static boolean f(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return c.booleanValue();
    }
}
