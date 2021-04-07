package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: fd  reason: default package */
public class fd implements ua {
    private final Context a;
    private final hd b;
    private final SharedPreferences c;

    public fd(Context context, hd hdVar, SharedPreferences sharedPreferences) {
        ra.a(context, "Context must be not null");
        this.c = sharedPreferences;
        this.b = hdVar;
        this.a = context;
    }

    private int c(int i) {
        return i / 100;
    }

    private PackageInfo t() {
        return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
    }

    public String a() {
        String string = this.c.getString("bg_device_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = this.c.edit();
        edit.putString("bg_device_id", uuid);
        edit.commit();
        return uuid;
    }

    public String b() {
        return this.a.getPackageName();
    }

    public String c() {
        try {
            return String.valueOf(t().versionCode);
        } catch (Exception unused) {
            return String.valueOf(20200526);
        }
    }

    public long d() {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong();
            j2 = statFs.getAvailableBlocksLong();
        } else {
            j = (long) statFs.getBlockSize();
            j2 = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    public boolean e() {
        return "true".equals(Settings.System.getString(this.a.getContentResolver(), "firebase.test.lab"));
    }

    public String f() {
        String str;
        try {
            str = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        } catch (Exception unused) {
            str = null;
        }
        return str != null ? str : "";
    }

    public long g() {
        return this.b.b();
    }

    public float h() {
        int c2;
        Intent registerReceiver = this.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (!(intExtra == -1 || intExtra2 == -1)) {
                c2 = c(intExtra);
                return (float) c2;
            }
        }
        c2 = c(50);
        return (float) c2;
    }

    public int i() {
        return this.a.getResources().getConfiguration().orientation;
    }

    public String j() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            return "GMT+00:00";
        }
    }

    public String k() {
        return Build.MODEL;
    }

    public long l() {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong();
            j2 = statFs.getBlockCountLong();
        } else {
            j = (long) statFs.getBlockSize();
            j2 = (long) statFs.getBlockCount();
        }
        return j2 * j;
    }

    public long m() {
        return this.b.c();
    }

    public String n() {
        return Locale.getDefault().getLanguage();
    }

    public String o(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (gd.a()) {
            ContentResolver contentResolver = this.a.getContentResolver();
            gd.b();
            str2 = Settings.Global.getString(contentResolver, "device_name");
        } else {
            str2 = Settings.System.getString(this.a.getContentResolver(), "device_name");
        }
        return TextUtils.isEmpty(str2) ? Build.MANUFACTURER : str2;
    }

    public String p() {
        return "Android";
    }

    public String q() {
        return Build.VERSION.RELEASE;
    }

    public String r() {
        try {
            return String.valueOf(t().versionName);
        } catch (Exception unused) {
            return "3.0.5";
        }
    }

    public long s() {
        return this.b.a();
    }
}
