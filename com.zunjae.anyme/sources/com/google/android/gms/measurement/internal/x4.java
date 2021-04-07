package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class x4 implements ServiceConnection {
    /* access modifiers changed from: private */
    public final String a;
    final /* synthetic */ u4 b;

    x4(u4 u4Var, String str) {
        this.b = u4Var;
        this.a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.h().H().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            wt0 q3 = yw0.q3(iBinder);
            if (q3 == null) {
                this.b.a.h().H().a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.h().M().a("Install Referrer Service connected");
            this.b.a.f().y(new w4(this, q3, this));
        } catch (Exception e) {
            this.b.a.h().H().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.h().M().a("Install Referrer Service disconnected");
    }
}
