package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;

/* renamed from: xv1  reason: default package */
public final class xv1 {
    public static final xv1 a = new xv1();

    private xv1() {
    }

    private final String a(Activity activity) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
                return null;
            }
            return applicationInfo.packageName;
        } catch (Exception unused) {
            return "com.zunjae.anyme";
        }
    }

    public final wv1 b() {
        return wv1.Beta;
    }

    public final void c(Activity activity) {
        v62.e(activity, "activity");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a(activity)));
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
        }
    }
}
