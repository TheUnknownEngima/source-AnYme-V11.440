package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends j> extends g<R> {
    private final Object a;
    private final a<R> b;
    private final CountDownLatch c;
    private final ArrayList<g.a> d;
    private k<? super R> e;
    private final AtomicReference<s0> f;
    /* access modifiers changed from: private */
    public R g;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private boolean k;
    private l l;
    private volatile q0<R> m;
    @KeepName
    private b mResultGuardian;

    public static class a<R extends j> extends l90 {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(k<? super R> kVar, R r) {
            k unused = BasePendingResult.i(kVar);
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                k kVar = (k) pair.first;
                j jVar = (j) pair.second;
                try {
                    kVar.a(jVar);
                } catch (RuntimeException e) {
                    BasePendingResult.l(jVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).m(Status.k);
            }
        }
    }

    private final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, z0 z0Var) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.l(BasePendingResult.this.g);
            super.finalize();
        }
    }

    static {
        new z0();
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.b = new a<>(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    protected BasePendingResult(f fVar) {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.b = new a<>(fVar != null ? fVar.a() : Looper.getMainLooper());
        new WeakReference(fVar);
    }

    private final R d() {
        R r;
        synchronized (this.a) {
            r.n(!this.i, "Result has already been consumed.");
            r.n(f(), "Result is not ready.");
            r = this.g;
            this.g = null;
            this.e = null;
            this.i = true;
        }
        s0 andSet = this.f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    /* access modifiers changed from: private */
    public static <R extends j> k<R> i(k<R> kVar) {
        return kVar;
    }

    private final void j(R r) {
        this.g = r;
        this.l = null;
        this.c.countDown();
        this.h = this.g.g();
        if (this.j) {
            this.e = null;
        } else if (this.e != null) {
            this.b.removeMessages(2);
            this.b.a(this.e, d());
        } else if (this.g instanceof h) {
            this.mResultGuardian = new b(this, (z0) null);
        }
        ArrayList<g.a> arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            g.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.h);
        }
        this.d.clear();
    }

    public static void l(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).a();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.j     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.i     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.l r1 = r2.l     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.l r1 = r2.l     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.g     // Catch:{ all -> 0x002a }
            l(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.j = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.l     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.j r1 = r2.c(r1)     // Catch:{ all -> 0x002a }
            r2.j(r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.common.api.k<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.e = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.i     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.r.n(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.q0<R> r1 = r5.m     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.r.n(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.e()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.f()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r5.b     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.j r2 = r5.d()     // Catch:{ all -> 0x003f }
            r1.a(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.e = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.b(com.google.android.gms.common.api.k):void");
    }

    /* access modifiers changed from: protected */
    public abstract R c(Status status);

    public boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.j;
        }
        return z;
    }

    public final boolean f() {
        return this.c.getCount() == 0;
    }

    public final void g(R r) {
        synchronized (this.a) {
            if (this.k || this.j) {
                l(r);
                return;
            }
            f();
            boolean z = true;
            r.n(!f(), "Results have already been set");
            if (this.i) {
                z = false;
            }
            r.n(z, "Result has already been consumed");
            j(r);
        }
    }

    public final void m(Status status) {
        synchronized (this.a) {
            if (!f()) {
                g(c(status));
                this.k = true;
            }
        }
    }
}
