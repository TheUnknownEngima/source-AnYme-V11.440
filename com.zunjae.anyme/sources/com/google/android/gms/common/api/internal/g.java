package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t0;
import com.google.android.gms.common.internal.x;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
public final class g {
    private static final Object d = new Object();
    @GuardedBy("sLock")
    private static g e;
    private final String a;
    private final Status b;
    private final boolean c;

    g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.c = false;
        }
        String a2 = t0.a(context);
        a2 = a2 == null ? new x(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = a2;
        this.b = Status.i;
    }

    private static g a(String str) {
        g gVar;
        synchronized (d) {
            if (e != null) {
                gVar = e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return gVar;
    }

    public static String b() {
        return a("getGoogleAppId").a;
    }

    public static Status c(Context context) {
        Status status;
        r.k(context, "Context must not be null.");
        synchronized (d) {
            if (e == null) {
                e = new g(context);
            }
            status = e.b;
        }
        return status;
    }

    public static boolean d() {
        return a("isMeasurementExplicitlyDisabled").c;
    }
}
