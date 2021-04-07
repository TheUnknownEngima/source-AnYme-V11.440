package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.stats.a;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class k0 extends i implements Handler.Callback {
    /* access modifiers changed from: private */
    @GuardedBy("mConnectionStatus")
    public final HashMap<i.a, j0> h = new HashMap<>();
    /* access modifiers changed from: private */
    public final Context i;
    /* access modifiers changed from: private */
    public final Handler j;
    /* access modifiers changed from: private */
    public final a k;
    private final long l;
    /* access modifiers changed from: private */
    public final long m;

    k0(Context context) {
        this.i = context.getApplicationContext();
        this.j = new jp0(context.getMainLooper(), this);
        this.k = a.b();
        this.l = 5000;
        this.m = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean d(i.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        r.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.h) {
            j0 j0Var = this.h.get(aVar);
            if (j0Var == null) {
                j0Var = new j0(this, aVar);
                j0Var.e(serviceConnection, serviceConnection, str);
                j0Var.h(str);
                this.h.put(aVar, j0Var);
            } else {
                this.j.removeMessages(0, aVar);
                if (!j0Var.g(serviceConnection)) {
                    j0Var.e(serviceConnection, serviceConnection, str);
                    int c = j0Var.c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(j0Var.b(), j0Var.a());
                    } else if (c == 2) {
                        j0Var.h(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = j0Var.d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    public final void e(i.a aVar, ServiceConnection serviceConnection, String str) {
        r.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.h) {
            j0 j0Var = this.h.get(aVar);
            if (j0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (j0Var.g(serviceConnection)) {
                j0Var.f(serviceConnection, str);
                if (j0Var.j()) {
                    this.j.sendMessageDelayed(this.j.obtainMessage(0, aVar), this.l);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.h) {
                i.a aVar = (i.a) message.obj;
                j0 j0Var = this.h.get(aVar);
                if (j0Var != null && j0Var.j()) {
                    if (j0Var.d()) {
                        j0Var.i("GmsClientSupervisor");
                    }
                    this.h.remove(aVar);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.h) {
                i.a aVar2 = (i.a) message.obj;
                j0 j0Var2 = this.h.get(aVar2);
                if (j0Var2 != null && j0Var2.c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    sb.toString();
                    new Exception();
                    ComponentName b = j0Var2.b();
                    if (b == null) {
                        b = aVar2.a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.b(), "unknown");
                    }
                    j0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
