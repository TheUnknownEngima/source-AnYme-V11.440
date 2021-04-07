package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.f0;
import java.io.IOException;

class a0 implements Runnable {
    private static final Object j = new Object();
    private static Boolean k;
    private static Boolean l;
    /* access modifiers changed from: private */
    public final Context e;
    private final f0 f;
    private final PowerManager.WakeLock g;
    /* access modifiers changed from: private */
    public final z h;
    private final long i;

    class a extends BroadcastReceiver {
        private a0 a;

        public a(a0 a0Var) {
            this.a = a0Var;
        }

        public void a() {
            boolean b2 = a0.j();
            a0.this.e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (this.a != null) {
                if (this.a.i()) {
                    boolean b2 = a0.j();
                    this.a.h.m(this.a, 0);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            }
        }
    }

    a0(z zVar, Context context, f0 f0Var, long j2) {
        this.h = zVar;
        this.e = context;
        this.i = j2;
        this.f = f0Var;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (j) {
            Boolean valueOf = Boolean.valueOf(l == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", l) : l.booleanValue());
            l = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            e(str);
        }
        return z;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (j) {
            Boolean valueOf = Boolean.valueOf(k == null ? g(context, "android.permission.WAKE_LOCK", k) : k.booleanValue());
            k = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.e.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public static boolean j() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.e)) {
            this.g.acquire(b.a);
        }
        try {
            this.h.o(true);
            if (!this.f.g()) {
                this.h.o(false);
                if (h(this.e)) {
                    try {
                        this.g.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (!f(this.e) || i()) {
                if (this.h.s()) {
                    this.h.o(false);
                } else {
                    this.h.t(this.i);
                }
                if (h(this.e)) {
                    try {
                        this.g.release();
                    } catch (RuntimeException unused2) {
                    }
                }
            } else {
                new a(this).a();
                if (h(this.e)) {
                    try {
                        this.g.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            }
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            } else {
                new String("Failed to sync topics. Won't retry sync. ");
            }
            this.h.o(false);
            if (h(this.e)) {
                try {
                    this.g.release();
                } catch (RuntimeException unused4) {
                }
            }
        } catch (Throwable th) {
            if (h(this.e)) {
                try {
                    this.g.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }
}
