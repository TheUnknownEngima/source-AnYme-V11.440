package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import defpackage.zj;

/* renamed from: bk  reason: default package */
final class bk implements zj {
    private final Context e;
    final zj.a f;
    boolean g;
    private boolean h;
    private final BroadcastReceiver i = new a();

    /* renamed from: bk$a */
    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            bk bkVar = bk.this;
            boolean z = bkVar.g;
            bkVar.g = bkVar.a(context);
            if (z != bk.this.g) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    "connectivity changed, isConnected: " + bk.this.g;
                }
                bk bkVar2 = bk.this;
                bkVar2.f.a(bkVar2.g);
            }
        }
    }

    bk(Context context, zj.a aVar) {
        this.e = context.getApplicationContext();
        this.f = aVar;
    }

    private void b() {
        if (!this.h) {
            this.g = a(this.e);
            try {
                this.e.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.h = true;
            } catch (SecurityException unused) {
                boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 5);
            }
        }
    }

    private void k() {
        if (this.h) {
            this.e.unregisterReceiver(this.i);
            this.h = false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        jm.d(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    public void n() {
        b();
    }

    public void x() {
    }

    public void y() {
        k();
    }
}
