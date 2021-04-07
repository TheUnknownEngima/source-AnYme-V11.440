package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.a;

/* renamed from: hi1  reason: default package */
public class hi1 {
    private final Context a;
    private final SharedPreferences b;
    private boolean c = c();

    public hi1(Context context, String str, qh1 qh1) {
        Context a2 = a(context);
        this.a = a2;
        this.b = a2.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : a.b(context);
    }

    private boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.c;
    }
}
