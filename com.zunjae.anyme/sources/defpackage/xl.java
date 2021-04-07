package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bumptech.glide.load.g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: xl  reason: default package */
public final class xl {
    private static final ConcurrentMap<String, g> a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            "Cannot resolve info for" + context.getPackageName();
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static g c(Context context) {
        String packageName = context.getPackageName();
        g gVar = (g) a.get(packageName);
        if (gVar != null) {
            return gVar;
        }
        g d = d(context);
        g putIfAbsent = a.putIfAbsent(packageName, d);
        return putIfAbsent == null ? d : putIfAbsent;
    }

    private static g d(Context context) {
        return new zl(b(a(context)));
    }
}
