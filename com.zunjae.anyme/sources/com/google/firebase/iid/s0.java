package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.r0;
import java.io.IOException;
import javax.annotation.Nullable;

class s0 implements Runnable {
    private final long e;
    private final PowerManager.WakeLock f;
    /* access modifiers changed from: private */
    public final FirebaseInstanceId g;

    static class a extends BroadcastReceiver {
        @Nullable
        private s0 a;

        public a(s0 s0Var) {
            this.a = s0Var;
        }

        public void a() {
            boolean t = FirebaseInstanceId.t();
            this.a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            s0 s0Var = this.a;
            if (s0Var != null && s0Var.d()) {
                boolean t = FirebaseInstanceId.t();
                this.a.g.g(this.a, 0);
                this.a.b().unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    s0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.g = firebaseInstanceId;
        this.e = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private void c(String str) {
        if ("[DEFAULT]".equals(this.g.i().i())) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(this.g.i().i());
                if (valueOf.length() != 0) {
                    "Invoking onNewToken for app: ".concat(valueOf);
                } else {
                    new String("Invoking onNewToken for app: ");
                }
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            q0.h(b(), intent);
        }
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.g.i().g();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        r0.a r = this.g.r();
        if (!this.g.J(r)) {
            return true;
        }
        try {
            String e2 = this.g.e();
            if (e2 == null) {
                return false;
            }
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
            if (r == null || (r != null && !e2.equals(r.a))) {
                c(e2);
            }
            return true;
        } catch (IOException e3) {
            if (s.f(e3.getMessage())) {
                String message = e3.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                sb.toString();
                return false;
            } else if (e3.getMessage() == null) {
                return false;
            } else {
                throw e3;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (q0.b().e(b())) {
            this.f.acquire();
        }
        try {
            this.g.F(true);
            if (!this.g.v()) {
                this.g.F(false);
                if (q0.b().e(b())) {
                    this.f.release();
                }
            } else if (!q0.b().d(b()) || d()) {
                if (e()) {
                    this.g.F(false);
                } else {
                    this.g.I(this.e);
                }
                if (!q0.b().e(b())) {
                    return;
                }
                this.f.release();
            } else {
                new a(this).a();
                if (q0.b().e(b())) {
                    this.f.release();
                }
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            sb.toString();
            this.g.F(false);
            if (!q0.b().e(b())) {
            }
        } catch (Throwable th) {
            if (q0.b().e(b())) {
                this.f.release();
            }
            throw th;
        }
    }
}
