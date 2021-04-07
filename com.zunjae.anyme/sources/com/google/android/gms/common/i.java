package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t0;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.p;
import com.google.android.gms.common.util.s;
import java.util.concurrent.atomic.AtomicBoolean;

public class i {
    @Deprecated
    public static final int a = 12451000;
    private static boolean b = false;
    private static boolean c = false;
    static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    public static String b(int i) {
        return b.n(i);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        if (!c) {
            try {
                PackageInfo e2 = v80.a(context).e("com.google.android.gms", 64);
                j.a(context);
                if (e2 == null || j.f(e2, false) || !j.f(e2, true)) {
                    b = false;
                } else {
                    b = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                c = true;
                throw th;
            }
            c = true;
        }
        return b || !com.google.android.gms.common.util.i.a();
    }

    @Deprecated
    public static int f(Context context, int i) {
        try {
            context.getResources().getString(R$string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !e.get()) {
            int b2 = t0.b(context);
            if (b2 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b2 != a) {
                int i2 = a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return l(context, !com.google.android.gms.common.util.i.d(context) && !com.google.android.gms.common.util.i.f(context), i);
    }

    @Deprecated
    public static boolean g(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return i(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((android.os.UserManager) r1.getSystemService("user")).getApplicationRestrictions(r1.getPackageName());
     */
    @android.annotation.TargetApi(18)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean h(android.content.Context r1) {
        /*
            boolean r0 = com.google.android.gms.common.util.m.e()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "user"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            java.lang.String r1 = r1.getPackageName()
            android.os.Bundle r1 = r0.getApplicationRestrictions(r1)
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "restricted_profile"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0028
            r1 = 1
            return r1
        L_0x0028:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.i.h(android.content.Context):boolean");
    }

    @TargetApi(21)
    static boolean i(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (m.h()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    @Deprecated
    public static boolean j(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean k(Context context, int i, String str) {
        return p.b(context, i, str);
    }

    private static int l(Context context, boolean z, int i) {
        String valueOf;
        String str;
        r.a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            j.a(context);
            if (!j.f(packageInfo2, true)) {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            } else if (z && (!j.f(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play Store, but its signature is invalid.";
            } else if (s.a(packageInfo2.versionCode) < s.a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 82);
                sb.append("Google Play services out of date for ");
                sb.append(packageName);
                sb.append(".  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                sb.toString();
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            valueOf.concat(str);
            return 9;
        } catch (PackageManager.NameNotFoundException unused2) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }
}
