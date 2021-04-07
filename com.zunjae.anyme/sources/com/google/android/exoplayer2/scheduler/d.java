package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

public final class d {
    private final Context a;
    private final c b;
    private final c c;
    /* access modifiers changed from: private */
    public final Handler d = new Handler(v50.L());
    private b e;
    private int f;
    /* access modifiers changed from: private */
    public C0082d g;

    private class b extends BroadcastReceiver {
        private b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                d.this.e();
            }
        }
    }

    public interface c {
        void a(d dVar, int i);
    }

    /* renamed from: com.google.android.exoplayer2.scheduler.d$d  reason: collision with other inner class name */
    private final class C0082d extends ConnectivityManager.NetworkCallback {
        private boolean a;
        private boolean b;

        private C0082d() {
        }

        private void c() {
            d.this.d.post(new b(this));
        }

        private void d() {
            d.this.d.post(new a(this));
        }

        public /* synthetic */ void a() {
            if (d.this.g != null) {
                d.this.e();
            }
        }

        public /* synthetic */ void b() {
            if (d.this.g != null) {
                d.this.g();
            }
        }

        public void onAvailable(Network network) {
            c();
        }

        public void onBlockedStatusChanged(Network network, boolean z) {
            if (!z) {
                d();
            }
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (!this.a || this.b != hasCapability) {
                this.a = true;
                this.b = hasCapability;
                c();
            } else if (hasCapability) {
                d();
            }
        }

        public void onLost(Network network) {
            c();
        }
    }

    public d(Context context, c cVar, c cVar2) {
        this.a = context.getApplicationContext();
        this.b = cVar;
        this.c = cVar2;
    }

    /* access modifiers changed from: private */
    public void e() {
        int c2 = this.c.c(this.a);
        if (this.f != c2) {
            this.f = c2;
            this.b.a(this, c2);
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if ((this.f & 3) != 0) {
            e();
        }
    }

    @TargetApi(24)
    private void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        q40.e(connectivityManager);
        C0082d dVar = new C0082d();
        this.g = dVar;
        connectivityManager.registerDefaultNetworkCallback(dVar);
    }

    @TargetApi(24)
    private void k() {
        C0082d dVar = this.g;
        q40.e(dVar);
        ((ConnectivityManager) this.a.getSystemService("connectivity")).unregisterNetworkCallback(dVar);
        this.g = null;
    }

    public c f() {
        return this.c;
    }

    public int i() {
        String str;
        this.f = this.c.c(this.a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.c.i()) {
            if (v50.a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.c.d()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.c.g()) {
            if (v50.a >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        b bVar = new b();
        this.e = bVar;
        this.a.registerReceiver(bVar, intentFilter, (String) null, this.d);
        return this.f;
    }

    public void j() {
        Context context = this.a;
        b bVar = this.e;
        q40.e(bVar);
        context.unregisterReceiver(bVar);
        this.e = null;
        if (v50.a >= 24 && this.g != null) {
            k();
        }
    }
}
