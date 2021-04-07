package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class c<T extends IInterface> {
    private static final com.google.android.gms.common.d[] w = new com.google.android.gms.common.d[0];
    private m0 a;
    private final Context b;
    private final Looper c;
    private final i d;
    private final com.google.android.gms.common.f e;
    final Handler f;
    private final Object g;
    /* access modifiers changed from: private */
    public final Object h;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")
    public o i;
    protected C0090c j;
    @GuardedBy("mLock")
    private T k;
    /* access modifiers changed from: private */
    public final ArrayList<h<?>> l;
    @GuardedBy("mLock")
    private i m;
    @GuardedBy("mLock")
    private int n;
    /* access modifiers changed from: private */
    public final a o;
    /* access modifiers changed from: private */
    public final b p;
    private final int q;
    private final String r;
    /* access modifiers changed from: private */
    public com.google.android.gms.common.b s;
    /* access modifiers changed from: private */
    public boolean t;
    private volatile h0 u;
    protected AtomicInteger v;

    public interface a {
        void i(int i);

        void j(Bundle bundle);
    }

    public interface b {
        void q(com.google.android.gms.common.b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface C0090c {
        void a(com.google.android.gms.common.b bVar);
    }

    protected class d implements C0090c {
        public d() {
        }

        public void a(com.google.android.gms.common.b bVar) {
            if (bVar.m()) {
                c cVar = c.this;
                cVar.b((k) null, cVar.C());
            } else if (c.this.p != null) {
                c.this.p.q(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    private abstract class f extends h<Boolean> {
        private final int d;
        private final Bundle e;

        protected f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.d = i;
            this.e = bundle;
        }

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void c(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.S(r0, null)
                return
            L_0x000c:
                int r5 = r4.d
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.S(r0, null)
                android.os.Bundle r5 = r4.e
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                com.google.android.gms.common.b r5 = new com.google.android.gms.common.b
                int r0 = r4.d
                r5.<init>(r0, r1)
                r4.f(r5)
                goto L_0x0076
            L_0x0031:
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.S(r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.c.this
                java.lang.String r2 = r2.p()
                r1[r0] = r2
                r0 = 2
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.c.this
                java.lang.String r2 = r2.j()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.g()
                if (r5 != 0) goto L_0x0076
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.c.this
                r5.S(r0, null)
                com.google.android.gms.common.b r5 = new com.google.android.gms.common.b
                r0 = 8
                r5.<init>(r0, r1)
                r4.f(r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.f.c(java.lang.Object):void");
        }

        /* access modifiers changed from: protected */
        public final void d() {
        }

        /* access modifiers changed from: protected */
        public abstract void f(com.google.android.gms.common.b bVar);

        /* access modifiers changed from: protected */
        public abstract boolean g();
    }

    final class g extends jp0 {
        public g(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.d();
            hVar.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.v
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x0015
                a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x002e
                r4 = 7
                if (r0 == r4) goto L_0x002e
                if (r0 != r1) goto L_0x002a
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                boolean r0 = r0.s()
                if (r0 == 0) goto L_0x002e
            L_0x002a:
                int r0 = r8.what
                if (r0 != r3) goto L_0x003a
            L_0x002e:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                boolean r0 = r0.u()
                if (r0 != 0) goto L_0x003a
                a(r8)
                return
            L_0x003a:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0085
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r1 = new com.google.android.gms.common.b
                int r8 = r8.arg2
                r1.<init>(r8)
                com.google.android.gms.common.b unused = r0.s = r1
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                boolean r8 = r8.i0()
                if (r8 == 0) goto L_0x0064
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                boolean r8 = r8.t
                if (r8 != 0) goto L_0x0064
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                r8.S(r5, null)
                return
            L_0x0064:
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.s
                if (r8 == 0) goto L_0x0073
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.s
                goto L_0x0078
            L_0x0073:
                com.google.android.gms.common.b r8 = new com.google.android.gms.common.b
                r8.<init>(r4)
            L_0x0078:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$c r0 = r0.j
                r0.a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                r0.H(r8)
                return
            L_0x0085:
                if (r0 != r3) goto L_0x00a8
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.s
                if (r8 == 0) goto L_0x0096
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.b r8 = r8.s
                goto L_0x009b
            L_0x0096:
                com.google.android.gms.common.b r8 = new com.google.android.gms.common.b
                r8.<init>(r4)
            L_0x009b:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$c r0 = r0.j
                r0.a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                r0.H(r8)
                return
            L_0x00a8:
                if (r0 != r5) goto L_0x00c7
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00b3
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00b3:
                com.google.android.gms.common.b r0 = new com.google.android.gms.common.b
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$c r8 = r8.j
                r8.a(r0)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                r8.H(r0)
                return
            L_0x00c7:
                r1 = 6
                if (r0 != r1) goto L_0x00ef
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                r0.S(r3, null)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$a r0 = r0.o
                if (r0 == 0) goto L_0x00e2
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                com.google.android.gms.common.internal.c$a r0 = r0.o
                int r1 = r8.arg2
                r0.i(r1)
            L_0x00e2:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                int r8 = r8.arg2
                r0.I(r8)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.c.this
                boolean unused = r8.X(r3, r2, r6)
                return
            L_0x00ef:
                r1 = 2
                if (r0 != r1) goto L_0x00fe
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.c.this
                boolean r0 = r0.y()
                if (r0 != 0) goto L_0x00fe
                a(r8)
                return
            L_0x00fe:
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x010c
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.c$h r8 = (com.google.android.gms.common.internal.c.h) r8
                r8.e()
                return
            L_0x010c:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.g.handleMessage(android.os.Message):void");
        }
    }

    protected abstract class h<TListener> {
        private TListener a;
        private boolean b = false;

        public h(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
        }

        public final void b() {
            a();
            synchronized (c.this.l) {
                c.this.l.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void c(TListener tlistener);

        /* access modifiers changed from: protected */
        public abstract void d();

        public final void e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    sb.toString();
                }
            }
            if (tlistener != null) {
                try {
                    c(tlistener);
                } catch (RuntimeException e) {
                    d();
                    throw e;
                }
            } else {
                d();
            }
            synchronized (this) {
                this.b = true;
            }
            b();
        }
    }

    public final class i implements ServiceConnection {
        private final int a;

        public i(int i) {
            this.a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o oVar;
            c cVar = c.this;
            if (iBinder == null) {
                cVar.Z(16);
                return;
            }
            synchronized (cVar.h) {
                c cVar2 = c.this;
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    oVar = (queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new n(iBinder) : (o) queryLocalInterface;
                }
                o unused = cVar2.i = oVar;
            }
            c.this.R(0, (Bundle) null, this.a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (c.this.h) {
                o unused = c.this.i = null;
            }
            Handler handler = c.this.f;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    public static final class j extends m.a {
        private c a;
        private final int b;

        public j(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        public final void q1(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        public final void r2(int i, IBinder iBinder, h0 h0Var) {
            r.k(this.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.j(h0Var);
            this.a.W(h0Var);
            y1(i, iBinder, h0Var.e);
        }

        public final void y1(int i, IBinder iBinder, Bundle bundle) {
            r.k(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.J(i, iBinder, bundle, this.b);
            this.a = null;
        }
    }

    protected final class k extends f {
        private final IBinder g;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        /* access modifiers changed from: protected */
        public final void f(com.google.android.gms.common.b bVar) {
            if (c.this.p != null) {
                c.this.p.q(bVar);
            }
            c.this.H(bVar);
        }

        /* access modifiers changed from: protected */
        public final boolean g() {
            try {
                String interfaceDescriptor = this.g.getInterfaceDescriptor();
                if (!c.this.j().equals(interfaceDescriptor)) {
                    String j = c.this.j();
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(j);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    sb.toString();
                    return false;
                }
                IInterface k = c.this.k(this.g);
                if (k == null) {
                    return false;
                }
                if (!c.this.X(2, 4, k) && !c.this.X(3, 4, k)) {
                    return false;
                }
                com.google.android.gms.common.b unused = c.this.s = null;
                Bundle w = c.this.w();
                if (c.this.o != null) {
                    c.this.o.j(w);
                }
                return true;
            } catch (RemoteException unused2) {
                return false;
            }
        }
    }

    protected final class l extends f {
        public l(int i, Bundle bundle) {
            super(i, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        public final void f(com.google.android.gms.common.b bVar) {
            if (!c.this.s() || !c.this.i0()) {
                c.this.j.a(bVar);
                c.this.H(bVar);
                return;
            }
            c.this.Z(16);
        }

        /* access modifiers changed from: protected */
        public final boolean g() {
            c.this.j.a(com.google.android.gms.common.b.i);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c.a r13, com.google.android.gms.common.internal.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.i.b(r10)
            com.google.android.gms.common.f r4 = com.google.android.gms.common.f.f()
            com.google.android.gms.common.internal.r.j(r13)
            r6 = r13
            com.google.android.gms.common.internal.c$a r6 = (com.google.android.gms.common.internal.c.a) r6
            com.google.android.gms.common.internal.r.j(r14)
            r7 = r14
            com.google.android.gms.common.internal.c$b r7 = (com.google.android.gms.common.internal.c.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    protected c(Context context, Looper looper, i iVar, com.google.android.gms.common.f fVar, int i2, a aVar, b bVar, String str) {
        this.g = new Object();
        this.h = new Object();
        this.l = new ArrayList<>();
        this.n = 1;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = new AtomicInteger(0);
        r.k(context, "Context must not be null");
        this.b = context;
        r.k(looper, "Looper must not be null");
        this.c = looper;
        r.k(iVar, "Supervisor must not be null");
        this.d = iVar;
        r.k(fVar, "API availability must not be null");
        this.e = fVar;
        this.f = new g(looper);
        this.q = i2;
        this.o = aVar;
        this.p = bVar;
        this.r = str;
    }

    /* access modifiers changed from: private */
    public final void S(int i2, T t2) {
        boolean z = false;
        if ((i2 == 4) == (t2 != null)) {
            z = true;
        }
        r.a(z);
        synchronized (this.g) {
            this.n = i2;
            this.k = t2;
            K(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.m == null || this.a == null)) {
                        String d2 = this.a.d();
                        String a2 = this.a.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(d2);
                        sb.append(" on ");
                        sb.append(a2);
                        sb.toString();
                        this.d.c(this.a.d(), this.a.a(), this.a.c(), this.m, g0(), this.a.b());
                        this.v.incrementAndGet();
                    }
                    this.m = new i(this.v.get());
                    m0 m0Var = (this.n != 3 || A() == null) ? new m0(E(), p(), false, i.a(), F()) : new m0(x().getPackageName(), A(), true, i.a(), false);
                    this.a = m0Var;
                    if (!m0Var.b() || m() >= 17895000) {
                        if (!this.d.d(new i.a(this.a.d(), this.a.a(), this.a.c(), this.a.b()), this.m, g0())) {
                            String d3 = this.a.d();
                            String a3 = this.a.a();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 34 + String.valueOf(a3).length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(d3);
                            sb2.append(" on ");
                            sb2.append(a3);
                            sb2.toString();
                            R(16, (Bundle) null, this.v.get());
                        }
                    } else {
                        String valueOf = String.valueOf(this.a.d());
                        throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                } else if (i2 == 4) {
                    G(t2);
                }
            } else if (this.m != null) {
                this.d.c(this.a.d(), this.a.a(), this.a.c(), this.m, g0(), this.a.b());
                this.m = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void W(h0 h0Var) {
        this.u = h0Var;
    }

    /* access modifiers changed from: private */
    public final boolean X(int i2, int i3, T t2) {
        synchronized (this.g) {
            if (this.n != i2) {
                return false;
            }
            S(i3, t2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void Z(int i2) {
        int i3;
        if (h0()) {
            i3 = 5;
            this.t = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(i3, this.v.get(), 16));
    }

    private final String g0() {
        String str = this.r;
        return str == null ? this.b.getClass().getName() : str;
    }

    private final boolean h0() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final boolean i0() {
        if (this.t || TextUtils.isEmpty(j()) || TextUtils.isEmpty(A())) {
            return false;
        }
        try {
            Class.forName(j());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public String A() {
        return null;
    }

    public final Looper B() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> C() {
        return Collections.emptySet();
    }

    public final T D() {
        T t2;
        synchronized (this.g) {
            if (this.n != 5) {
                r();
                r.n(this.k != null, "Client is connected but service is null");
                t2 = this.k;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public String E() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void G(T t2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void H(com.google.android.gms.common.b bVar) {
        bVar.i();
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void I(int i2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void J(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    public void K(int i2, T t2) {
    }

    public boolean L() {
        return false;
    }

    public void M(int i2) {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(6, this.v.get(), i2));
    }

    /* access modifiers changed from: protected */
    public void N(C0090c cVar, int i2, PendingIntent pendingIntent) {
        r.k(cVar, "Connection progress callbacks cannot be null.");
        this.j = cVar;
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(3, this.v.get(), i2, pendingIntent));
    }

    /* access modifiers changed from: protected */
    public final void R(int i2, Bundle bundle, int i3) {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2, (Bundle) null)));
    }

    public void b(k kVar, Set<Scope> set) {
        Bundle z = z();
        g gVar = new g(this.q);
        gVar.h = this.b.getPackageName();
        gVar.k = z;
        if (set != null) {
            gVar.j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (o()) {
            gVar.l = t() != null ? t() : new Account("<<default account>>", "com.google");
            if (kVar != null) {
                gVar.i = kVar.asBinder();
            }
        } else if (L()) {
            gVar.l = t();
        }
        gVar.m = w;
        gVar.n = v();
        try {
            synchronized (this.h) {
                if (this.i != null) {
                    this.i.C0(new j(this, this.v.get()), gVar);
                }
            }
        } catch (DeadObjectException unused) {
            M(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException unused2) {
            J(8, (IBinder) null, (Bundle) null, this.v.get());
        }
    }

    public void d() {
        this.v.incrementAndGet();
        synchronized (this.l) {
            int size = this.l.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.l.get(i2).a();
            }
            this.l.clear();
        }
        synchronized (this.h) {
            this.i = null;
        }
        S(1, (IInterface) null);
    }

    public String e() {
        m0 m0Var;
        if (y() && (m0Var = this.a) != null) {
            return m0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void f(C0090c cVar) {
        r.k(cVar, "Connection progress callbacks cannot be null.");
        this.j = cVar;
        S(2, (IInterface) null);
    }

    public void i(e eVar) {
        eVar.a();
    }

    /* access modifiers changed from: protected */
    public abstract String j();

    /* access modifiers changed from: protected */
    public abstract T k(IBinder iBinder);

    public boolean l() {
        return true;
    }

    public int m() {
        return com.google.android.gms.common.f.a;
    }

    public final com.google.android.gms.common.d[] n() {
        h0 h0Var = this.u;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f;
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract String p();

    public void q() {
        int h2 = this.e.h(this.b, m());
        if (h2 != 0) {
            S(1, (IInterface) null);
            N(new d(), h2, (PendingIntent) null);
            return;
        }
        f(new d());
    }

    /* access modifiers changed from: protected */
    public final void r() {
        if (!y()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean s() {
        return false;
    }

    public Account t() {
        return null;
    }

    public boolean u() {
        boolean z;
        synchronized (this.g) {
            if (this.n != 2) {
                if (this.n != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public com.google.android.gms.common.d[] v() {
        return w;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.b;
    }

    public boolean y() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public Bundle z() {
        return new Bundle();
    }
}
