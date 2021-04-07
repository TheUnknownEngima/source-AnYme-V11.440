package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: xb1  reason: default package */
class xb1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xb1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static xb1 a(Context context, tc1 tc1, String str, String str2) {
        String packageName = context.getPackageName();
        String e2 = tc1.e();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new xb1(str, str2, e2, packageName, num, str3);
    }
}
