package com.zunjae.zapplib;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

public final class a {
    public static String a(Context context, String... strArr) {
        for (String str : strArr) {
            if (c(context, str)) {
                return str;
            }
        }
        return null;
    }

    public static boolean b(Context context, String... strArr) {
        for (String c : strArr) {
            if (c(context, c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean d(Context context, Intent intent) {
        return intent != null && context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static double e(Context context) {
        try {
            return Double.parseDouble(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1.0d;
        }
    }

    public static String f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }
}
