package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.h;

/* renamed from: w7  reason: default package */
public class w7 extends v7<h7> {
    static final String i = h.f("NetworkStateTracker");
    private final ConnectivityManager f = ((ConnectivityManager) this.a.getSystemService("connectivity"));
    private b g;
    private a h;

    /* renamed from: w7$a */
    private class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                h.c().a(w7.i, "Network broadcast received", new Throwable[0]);
                w7 w7Var = w7.this;
                w7Var.d(w7Var.g());
            }
        }
    }

    /* renamed from: w7$b */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h.c().a(w7.i, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            w7 w7Var = w7.this;
            w7Var.d(w7Var.g());
        }

        public void onLost(Network network) {
            h.c().a(w7.i, "Network connection lost", new Throwable[0]);
            w7 w7Var = w7.this;
            w7Var.d(w7Var.g());
        }
    }

    public w7(Context context) {
        super(context);
        if (j()) {
            this.g = new b();
        } else {
            this.h = new a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.f.getNetworkCapabilities(r3.f.getActiveNetwork());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean i() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            android.net.ConnectivityManager r0 = r3.f
            android.net.Network r0 = r0.getActiveNetwork()
            android.net.ConnectivityManager r2 = r3.f
            android.net.NetworkCapabilities r0 = r2.getNetworkCapabilities(r0)
            if (r0 == 0) goto L_0x001f
            r2 = 16
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L_0x001f
            r1 = 1
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7.i():boolean");
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void e() {
        if (j()) {
            h.c().a(i, "Registering network callback", new Throwable[0]);
            this.f.registerDefaultNetworkCallback(this.g);
            return;
        }
        h.c().a(i, "Registering broadcast receiver", new Throwable[0]);
        this.a.registerReceiver(this.h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void f() {
        if (j()) {
            try {
                h.c().a(i, "Unregistering network callback", new Throwable[0]);
                this.f.unregisterNetworkCallback(this.g);
            } catch (IllegalArgumentException e) {
                h.c().b(i, "Received exception while unregistering network callback", e);
            }
        } else {
            h.c().a(i, "Unregistering broadcast receiver", new Throwable[0]);
            this.a.unregisterReceiver(this.h);
        }
    }

    /* access modifiers changed from: package-private */
    public h7 g() {
        NetworkInfo activeNetworkInfo = this.f.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i2 = i();
        boolean a2 = z2.a(this.f);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new h7(z2, i2, a2, z);
    }

    /* renamed from: h */
    public h7 b() {
        return g();
    }
}
