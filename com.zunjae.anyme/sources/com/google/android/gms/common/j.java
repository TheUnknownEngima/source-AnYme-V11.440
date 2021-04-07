package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.internal.r;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public class j {
    private static j b;
    private final Context a;

    private j(Context context) {
        this.a = context.getApplicationContext();
    }

    public static j a(Context context) {
        r.j(context);
        synchronized (j.class) {
            if (b == null) {
                n.c(context);
                b = new j(context);
            }
        }
        return b;
    }

    private static o d(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        r rVar = new r(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < oVarArr.length; i++) {
            if (oVarArr[i].equals(rVar)) {
                return oVarArr[i];
            }
        }
        return null;
    }

    private final w e(String str, int i) {
        try {
            PackageInfo h = v80.a(this.a).h(str, 64, i);
            boolean e = i.e(this.a);
            if (h == null) {
                return w.d("null pkg");
            }
            if (h.signatures != null) {
                if (h.signatures.length == 1) {
                    r rVar = new r(h.signatures[0].toByteArray());
                    String str2 = h.packageName;
                    w a2 = n.a(str2, rVar, e, false);
                    return (!a2.a || h.applicationInfo == null || (h.applicationInfo.flags & 2) == 0 || !n.a(str2, rVar, false, true).a) ? a2 : w.d("debuggable release cert app rejected");
                }
            }
            return w.d("single cert required");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return w.d(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    public static boolean f(PackageInfo packageInfo, boolean z) {
        o oVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                oVar = d(packageInfo, t.a);
            } else {
                oVar = d(packageInfo, t.a[0]);
            }
            if (oVar != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        return f(packageInfo, true) && i.e(this.a);
    }

    public boolean c(int i) {
        w wVar;
        String[] f = v80.a(this.a).f(i);
        if (f != null && f.length != 0) {
            wVar = null;
            for (String e : f) {
                wVar = e(e, i);
                if (wVar.a) {
                    break;
                }
            }
        } else {
            wVar = w.d("no pkgs");
        }
        wVar.g();
        return wVar.a;
    }
}
