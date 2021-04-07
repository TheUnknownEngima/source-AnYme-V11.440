package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;

public class d {
    public static boolean a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (v80.a(context).c(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
