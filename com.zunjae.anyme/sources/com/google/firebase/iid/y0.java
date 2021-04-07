package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class y0 implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue<a> d;
    private v0 e;
    private boolean f;

    static class a {
        final Intent a;
        private final f81<Void> b = new f81<>();

        a(Intent intent) {
            this.a = intent;
        }

        /* access modifiers changed from: package-private */
        public void a(ScheduledExecutorService scheduledExecutorService) {
            c().c(scheduledExecutorService, new x0(scheduledExecutorService.schedule(new w0(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.b.e(null);
        }

        /* access modifiers changed from: package-private */
        public e81<Void> c() {
            return this.b.a();
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void d() {
            String action = this.a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            sb.toString();
            b();
        }
    }

    public y0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new r80("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    y0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.d = new ArrayDeque();
        this.f = false;
        this.a = context.getApplicationContext();
        this.b = new Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledExecutorService;
    }

    private void a() {
        while (!this.d.isEmpty()) {
            this.d.poll().b();
        }
    }

    private synchronized void b() {
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        while (!this.d.isEmpty()) {
            boolean isLoggable2 = Log.isLoggable("FirebaseInstanceId", 3);
            if (this.e == null || !this.e.isBinderAlive()) {
                d();
                return;
            }
            boolean isLoggable3 = Log.isLoggable("FirebaseInstanceId", 3);
            this.e.b(this.d.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f);
            sb.toString();
        }
        if (!this.f) {
            this.f = true;
            try {
                if (com.google.android.gms.common.stats.a.b().a(this.a, this.b, this, 65)) {
                    return;
                }
            } catch (SecurityException unused) {
            }
            this.f = false;
            a();
        }
    }

    public synchronized e81<Void> c(Intent intent) {
        a aVar;
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        aVar = new a(intent);
        aVar.a(this.c);
        this.d.add(aVar);
        b();
        return aVar.c();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        this.f = false;
        if (!(iBinder instanceof v0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            sb2.toString();
            a();
            return;
        }
        this.e = (v0) iBinder;
        b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        b();
    }
}
