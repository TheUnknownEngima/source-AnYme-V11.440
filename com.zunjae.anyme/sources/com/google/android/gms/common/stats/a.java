package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.util.d;
import java.util.Collections;

public class a {
    private static final Object a = new Object();
    private static volatile a b;

    private a() {
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
    }

    public static a b() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : d.a(context, component.getPackageName())) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
