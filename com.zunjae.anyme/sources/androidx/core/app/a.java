package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class a extends androidx.core.content.a {
    private static c c;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    static class C0017a implements Runnable {
        final /* synthetic */ String[] e;
        final /* synthetic */ Activity f;
        final /* synthetic */ int g;

        C0017a(String[] strArr, Activity activity, int i) {
            this.e = strArr;
            this.f = activity;
            this.g = i;
        }

        public void run() {
            int[] iArr = new int[this.e.length];
            PackageManager packageManager = this.f.getPackageManager();
            String packageName = this.f.getPackageName();
            int length = this.e.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.e[i], packageName);
            }
            ((b) this.f).onRequestPermissionsResult(this.g, this.e, iArr);
        }
    }

    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface c {
        boolean a(Activity activity, int i, int i2, Intent intent);

        boolean b(Activity activity, String[] strArr, int i);
    }

    public interface d {
        void b(int i);
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c m() {
        return c;
    }

    public static void n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28 || !c.i(activity)) {
            activity.recreate();
        }
    }

    public static void o(Activity activity, String[] strArr, int i) {
        c cVar = c;
        if (cVar != null && cVar.b(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).b(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new C0017a(strArr, activity, i));
        }
    }

    public static boolean p(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void q(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
