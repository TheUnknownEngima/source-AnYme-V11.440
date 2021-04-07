package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: xt0  reason: default package */
public final class xt0 {
    private static volatile uu0<Boolean> a = uu0.d();
    private static final Object b = new Object();

    private static boolean a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean b(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            sb.toString();
            return false;
        }
        if (!a.b()) {
            synchronized (b) {
                if (a.b()) {
                    boolean booleanValue = a.c().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && a(context)) {
                            z2 = true;
                        }
                        a = uu0.a(Boolean.valueOf(z2));
                    }
                }
                z = true;
                z2 = true;
                a = uu0.a(Boolean.valueOf(z2));
            }
        }
        return a.c().booleanValue();
    }
}
