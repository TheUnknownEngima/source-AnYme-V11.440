package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.m;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

public class f implements a {
    private static final Object c = new Object();
    @GuardedBy("lock")
    private static y0 d;
    private final Context a;
    private final ExecutorService b;

    public f(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    private static e81<Integer> b(Context context, Intent intent) {
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        return c(context, "com.google.firebase.MESSAGING_EVENT").c(intent).i(h.a(), d.a);
    }

    private static y0 c(Context context, String str) {
        y0 y0Var;
        synchronized (c) {
            if (d == null) {
                d = new y0(context, str);
            }
            y0Var = d;
        }
        return y0Var;
    }

    static final /* synthetic */ Integer d(e81 e81) {
        return -1;
    }

    static final /* synthetic */ Integer f(e81 e81) {
        return 403;
    }

    static final /* synthetic */ e81 g(Context context, Intent intent, e81 e81) {
        return (!m.k() || ((Integer) e81.m()).intValue() != 402) ? e81 : b(context, intent).i(h.a(), e.a);
    }

    public e81<Integer> a(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public e81<Integer> h(Context context, Intent intent) {
        boolean z = true;
        boolean z2 = m.k() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        return (!z2 || z) ? h81.c(this.b, new b(context, intent)).k(this.b, new c(context, intent)) : b(context, intent);
    }
}
