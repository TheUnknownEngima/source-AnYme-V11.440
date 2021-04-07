package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.util.i;

public class f {
    public static final int a = i.a;
    private static final f b = new f();

    f() {
    }

    public static f f() {
        return b;
    }

    private static String j(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(v80.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context) {
        return i.a(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !i.d(context)) ? l0.a("com.google.android.gms", j(context, str)) : l0.c();
        }
        if (i != 3) {
            return null;
        }
        return l0.b("com.google.android.gms");
    }

    public PendingIntent c(Context context, int i, int i2) {
        return d(context, i, i2, (String) null);
    }

    public PendingIntent d(Context context, int i, int i2, String str) {
        Intent b2 = b(context, i, str);
        if (b2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b2, 134217728);
    }

    public String e(int i) {
        return i.b(i);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i) {
        int f = i.f(context, i);
        if (i.g(context, f)) {
            return 18;
        }
        return f;
    }

    public boolean i(int i) {
        return i.j(i);
    }
}
