package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.stats.a;
import java.util.HashMap;
import java.util.Map;

final class j0 implements ServiceConnection {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    private int b = 2;
    private boolean c;
    private IBinder d;
    private final i.a e;
    private ComponentName f;
    private final /* synthetic */ k0 g;

    public j0(k0 k0Var, i.a aVar) {
        this.g = k0Var;
        this.e = aVar;
    }

    public final IBinder a() {
        return this.d;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        a unused = this.g.k;
        Context unused2 = this.g.i;
        this.e.c(this.g.i);
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        a unused = this.g.k;
        Context unused2 = this.g.i;
        this.a.remove(serviceConnection);
    }

    public final boolean g(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final void h(String str) {
        this.b = 3;
        boolean d2 = this.g.k.d(this.g.i, str, this.e.c(this.g.i), this, this.e.e());
        this.c = d2;
        if (d2) {
            this.g.j.sendMessageDelayed(this.g.j.obtainMessage(1, this.e), this.g.m);
            return;
        }
        this.b = 2;
        try {
            this.g.k.c(this.g.i, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void i(String str) {
        this.g.j.removeMessages(1, this.e);
        this.g.k.c(this.g.i, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean j() {
        return this.a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.h) {
            this.g.j.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.h) {
            this.g.j.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
