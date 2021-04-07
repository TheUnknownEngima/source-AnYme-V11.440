package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.a;
import java.util.List;

public final class u4 {
    final h5 a;

    u4(h5 h5Var) {
        this.a = h5Var;
    }

    private final boolean c() {
        try {
            u80 a2 = v80.a(this.a.n());
            if (a2 != null) {
                return a2.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.h().M().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.h().M().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, wt0 wt0) {
        this.a.f().b();
        if (wt0 == null) {
            this.a.h().H().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle p = wt0.p(bundle);
            if (p != null) {
                return p;
            }
            this.a.h().E().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.a.h().E().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            this.a.h().I().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.f().b();
        if (!c()) {
            this.a.h().K().a("Install Referrer Reporter is not available");
            return;
        }
        x4 x4Var = new x4(this, str);
        this.a.f().b();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.n().getPackageManager();
        if (packageManager == null) {
            this.a.h().I().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.h().K().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !c()) {
                this.a.h().H().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.a.h().M().b("Install Referrer Service is", a.b().a(this.a.n(), new Intent(intent), x4Var, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.a.h().E().b("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
