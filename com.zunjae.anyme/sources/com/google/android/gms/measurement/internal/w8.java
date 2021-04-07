package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.stats.a;

public final class w8 implements ServiceConnection, c.a, c.b {
    /* access modifiers changed from: private */
    public volatile boolean a;
    private volatile z3 b;
    final /* synthetic */ c8 c;

    protected w8(c8 c8Var) {
        this.c = c8Var;
    }

    public final void a() {
        if (this.b != null && (this.b.y() || this.b.u())) {
            this.b.d();
        }
        this.b = null;
    }

    public final void b(Intent intent) {
        this.c.b();
        Context n = this.c.n();
        a b2 = a.b();
        synchronized (this) {
            if (this.a) {
                this.c.h().M().a("Connection attempt already in progress");
                return;
            }
            this.c.h().M().a("Using local app measurement service");
            this.a = true;
            b2.a(n, intent, this.c.c, 129);
        }
    }

    public final void d() {
        this.c.b();
        Context n = this.c.n();
        synchronized (this) {
            if (this.a) {
                this.c.h().M().a("Connection attempt already in progress");
            } else if (this.b == null || (!this.b.u() && !this.b.y())) {
                this.b = new z3(n, Looper.getMainLooper(), this, this);
                this.c.h().M().a("Connecting to remote service");
                this.a = true;
                this.b.q();
            } else {
                this.c.h().M().a("Already awaiting connection attempt");
            }
        }
    }

    public final void i(int i) {
        r.e("MeasurementServiceConnection.onConnectionSuspended");
        this.c.h().L().a("Service connection suspended");
        this.c.f().y(new a9(this));
    }

    public final void j(Bundle bundle) {
        r.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.f().y(new x8(this, (u3) this.b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.c.h().E().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.r.e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.c8 r4 = r3.c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.c4 r4 = r4.h()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.u3     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.u3) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.w3 r1 = new com.google.android.gms.measurement.internal.w3     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.c8 r5 = r3.c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.h()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.e4 r5 = r5.M()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.c8 r5 = r3.c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.h()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.c8 r5 = r3.c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.c4 r5 = r5.h()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.e4 r5 = r5.E()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.a.b()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.c8 r5 = r3.c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.n()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.c8 r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.w8 r0 = r0.c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.c8 r4 = r3.c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.a5 r4 = r4.f()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.v8 r5 = new com.google.android.gms.measurement.internal.v8     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.y(r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        r.e("MeasurementServiceConnection.onServiceDisconnected");
        this.c.h().L().a("Service disconnected");
        this.c.f().y(new y8(this, componentName));
    }

    public final void q(b bVar) {
        r.e("MeasurementServiceConnection.onConnectionFailed");
        c4 B = this.c.a.B();
        if (B != null) {
            B.H().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.f().y(new z8(this));
    }
}
