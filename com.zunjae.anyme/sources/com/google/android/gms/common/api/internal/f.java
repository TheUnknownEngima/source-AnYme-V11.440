package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public class f implements Handler.Callback {
    public static final Status r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object t = new Object();
    @GuardedBy("lock")
    private static f u;
    /* access modifiers changed from: private */
    public long e = 5000;
    /* access modifiers changed from: private */
    public long f = 120000;
    /* access modifiers changed from: private */
    public long g = 10000;
    /* access modifiers changed from: private */
    public final Context h;
    /* access modifiers changed from: private */
    public final e i;
    /* access modifiers changed from: private */
    public final j j;
    private final AtomicInteger k = new AtomicInteger(1);
    private final AtomicInteger l = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map<b<?>, a<?>> m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public u n = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final Set<b<?>> o = new c0();
    private final Set<b<?>> p = new c0();
    /* access modifiers changed from: private */
    public final Handler q;

    public class a<O extends a.d> implements f.a, f.b {
        private final Queue<i0> a = new LinkedList();
        /* access modifiers changed from: private */
        public final a.f b;
        private final a.b c;
        private final b<O> d;
        private final a1 e;
        private final Set<x0> f = new HashSet();
        private final Map<j.a<?>, f0> g = new HashMap();
        private final int h;
        private final l0 i;
        private boolean j;
        private final List<c> k = new ArrayList();
        private com.google.android.gms.common.b l = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            a.f u = eVar.u(f.this.q.getLooper(), this);
            this.b = u;
            this.c = u instanceof w ? ((w) u).n0() : u;
            this.d = eVar.q();
            this.e = new a1();
            this.h = eVar.r();
            if (this.b.o()) {
                this.i = eVar.v(f.this.h, f.this.q);
            } else {
                this.i = null;
            }
        }

        private final void A() {
            if (this.j) {
                f.this.q.removeMessages(11, this.d);
                f.this.q.removeMessages(9, this.d);
                this.j = false;
            }
        }

        private final void B() {
            f.this.q.removeMessages(12, this.d);
            f.this.q.sendMessageDelayed(f.this.q.obtainMessage(12, this.d), f.this.g);
        }

        private final void E(i0 i0Var) {
            i0Var.c(this.e, d());
            try {
                i0Var.f(this);
            } catch (DeadObjectException unused) {
                i(1);
                this.b.d();
            }
        }

        /* access modifiers changed from: private */
        public final boolean F(boolean z) {
            r.c(f.this.q);
            if (!this.b.y() || this.g.size() != 0) {
                return false;
            }
            if (this.e.c()) {
                if (z) {
                    B();
                }
                return false;
            }
            this.b.d();
            return true;
        }

        private final boolean K(com.google.android.gms.common.b bVar) {
            synchronized (f.t) {
                if (f.this.n != null) {
                    if (f.this.o.contains(this.d)) {
                        f.this.n.a(bVar, this.h);
                        throw null;
                    }
                }
            }
            return false;
        }

        private final void L(com.google.android.gms.common.b bVar) {
            for (x0 next : this.f) {
                String str = null;
                if (q.a(bVar, com.google.android.gms.common.b.i)) {
                    str = this.b.e();
                }
                next.a(this.d, bVar, str);
            }
            this.f.clear();
        }

        private final d f(d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                d[] n = this.b.n();
                if (n == null) {
                    n = new d[0];
                }
                b0 b0Var = new b0(n.length);
                for (d dVar : n) {
                    b0Var.put(dVar.i(), Long.valueOf(dVar.j()));
                }
                for (d dVar2 : dVarArr) {
                    if (!b0Var.containsKey(dVar2.i()) || ((Long) b0Var.get(dVar2.i())).longValue() < dVar2.j()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final void h(c cVar) {
            if (!this.k.contains(cVar) || this.j) {
                return;
            }
            if (!this.b.y()) {
                a();
            } else {
                v();
            }
        }

        /* access modifiers changed from: private */
        public final void r(c cVar) {
            d[] g2;
            if (this.k.remove(cVar)) {
                f.this.q.removeMessages(15, cVar);
                f.this.q.removeMessages(16, cVar);
                d b2 = cVar.b;
                ArrayList arrayList = new ArrayList(this.a.size());
                for (i0 i0Var : this.a) {
                    if ((i0Var instanceof w) && (g2 = ((w) i0Var).g(this)) != null && com.google.android.gms.common.util.b.b(g2, b2)) {
                        arrayList.add(i0Var);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    i0 i0Var2 = (i0) obj;
                    this.a.remove(i0Var2);
                    i0Var2.d(new m(b2));
                }
            }
        }

        private final boolean s(i0 i0Var) {
            if (!(i0Var instanceof w)) {
                E(i0Var);
                return true;
            }
            w wVar = (w) i0Var;
            d f2 = f(wVar.g(this));
            if (f2 == null) {
                E(i0Var);
                return true;
            } else if (wVar.h(this)) {
                c cVar = new c(this.d, f2, (x) null);
                int indexOf = this.k.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.k.get(indexOf);
                    f.this.q.removeMessages(15, cVar2);
                    f.this.q.sendMessageDelayed(Message.obtain(f.this.q, 15, cVar2), f.this.e);
                    return false;
                }
                this.k.add(cVar);
                f.this.q.sendMessageDelayed(Message.obtain(f.this.q, 15, cVar), f.this.e);
                f.this.q.sendMessageDelayed(Message.obtain(f.this.q, 16, cVar), f.this.f);
                com.google.android.gms.common.b bVar = new com.google.android.gms.common.b(2, (PendingIntent) null);
                if (K(bVar)) {
                    return false;
                }
                f.this.n(bVar, this.h);
                return false;
            } else {
                wVar.d(new m(f2));
                return false;
            }
        }

        /* access modifiers changed from: private */
        public final void t() {
            y();
            L(com.google.android.gms.common.b.i);
            A();
            Iterator<f0> it = this.g.values().iterator();
            while (it.hasNext()) {
                f0 next = it.next();
                if (f(next.a.c()) == null) {
                    try {
                        next.a.d(this.c, new f81());
                    } catch (DeadObjectException unused) {
                        i(1);
                        this.b.d();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            v();
            B();
        }

        /* access modifiers changed from: private */
        public final void u() {
            y();
            this.j = true;
            this.e.e();
            f.this.q.sendMessageDelayed(Message.obtain(f.this.q, 9, this.d), f.this.e);
            f.this.q.sendMessageDelayed(Message.obtain(f.this.q, 11, this.d), f.this.f);
            f.this.j.a();
        }

        private final void v() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i0 i0Var = (i0) obj;
                if (!this.b.y()) {
                    return;
                }
                if (s(i0Var)) {
                    this.a.remove(i0Var);
                }
            }
        }

        public final boolean C() {
            return F(true);
        }

        public final void D(Status status) {
            r.c(f.this.q);
            for (i0 b2 : this.a) {
                b2.b(status);
            }
            this.a.clear();
        }

        public final void J(com.google.android.gms.common.b bVar) {
            r.c(f.this.q);
            this.b.d();
            q(bVar);
        }

        public final void a() {
            r.c(f.this.q);
            if (!this.b.y() && !this.b.u()) {
                int b2 = f.this.j.b(f.this.h, this.b);
                if (b2 != 0) {
                    q(new com.google.android.gms.common.b(b2, (PendingIntent) null));
                    return;
                }
                b bVar = new b(this.b, this.d);
                if (this.b.o()) {
                    this.i.s3(bVar);
                }
                this.b.f(bVar);
            }
        }

        public final int b() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            return this.b.y();
        }

        public final boolean d() {
            return this.b.o();
        }

        public final void e() {
            r.c(f.this.q);
            if (this.j) {
                a();
            }
        }

        public final void i(int i2) {
            if (Looper.myLooper() == f.this.q.getLooper()) {
                u();
            } else {
                f.this.q.post(new z(this));
            }
        }

        public final void j(Bundle bundle) {
            if (Looper.myLooper() == f.this.q.getLooper()) {
                t();
            } else {
                f.this.q.post(new y(this));
            }
        }

        public final void k(i0 i0Var) {
            r.c(f.this.q);
            if (!this.b.y()) {
                this.a.add(i0Var);
                com.google.android.gms.common.b bVar = this.l;
                if (bVar == null || !bVar.l()) {
                    a();
                } else {
                    q(this.l);
                }
            } else if (s(i0Var)) {
                B();
            } else {
                this.a.add(i0Var);
            }
        }

        public final void l(x0 x0Var) {
            r.c(f.this.q);
            this.f.add(x0Var);
        }

        public final a.f n() {
            return this.b;
        }

        public final void o() {
            r.c(f.this.q);
            if (this.j) {
                A();
                D(f.this.i.g(f.this.h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.b.d();
            }
        }

        public final void q(com.google.android.gms.common.b bVar) {
            r.c(f.this.q);
            l0 l0Var = this.i;
            if (l0Var != null) {
                l0Var.t3();
            }
            y();
            f.this.j.a();
            L(bVar);
            if (bVar.i() == 4) {
                D(f.s);
            } else if (this.a.isEmpty()) {
                this.l = bVar;
            } else if (!K(bVar) && !f.this.n(bVar, this.h)) {
                if (bVar.i() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    f.this.q.sendMessageDelayed(Message.obtain(f.this.q, 9, this.d), f.this.e);
                    return;
                }
                String a2 = this.d.a();
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 63 + String.valueOf(valueOf).length());
                sb.append("API: ");
                sb.append(a2);
                sb.append(" is not available on this device. Connection failed with: ");
                sb.append(valueOf);
                D(new Status(17, sb.toString()));
            }
        }

        public final void w() {
            r.c(f.this.q);
            D(f.r);
            this.e.d();
            for (j.a w0Var : (j.a[]) this.g.keySet().toArray(new j.a[this.g.size()])) {
                k(new w0(w0Var, new f81()));
            }
            L(new com.google.android.gms.common.b(4));
            if (this.b.y()) {
                this.b.i(new b0(this));
            }
        }

        public final Map<j.a<?>, f0> x() {
            return this.g;
        }

        public final void y() {
            r.c(f.this.q);
            this.l = null;
        }

        public final com.google.android.gms.common.b z() {
            r.c(f.this.q);
            return this.l;
        }
    }

    private class b implements m0, c.C0090c {
        /* access modifiers changed from: private */
        public final a.f a;
        /* access modifiers changed from: private */
        public final b<?> b;
        private k c = null;
        private Set<Scope> d = null;
        /* access modifiers changed from: private */
        public boolean e = false;

        public b(a.f fVar, b<?> bVar) {
            this.a = fVar;
            this.b = bVar;
        }

        /* access modifiers changed from: private */
        public final void g() {
            k kVar;
            if (this.e && (kVar = this.c) != null) {
                this.a.b(kVar, this.d);
            }
        }

        public final void a(com.google.android.gms.common.b bVar) {
            f.this.q.post(new c0(this, bVar));
        }

        public final void b(k kVar, Set<Scope> set) {
            if (kVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                c(new com.google.android.gms.common.b(4));
                return;
            }
            this.c = kVar;
            this.d = set;
            g();
        }

        public final void c(com.google.android.gms.common.b bVar) {
            ((a) f.this.m.get(this.b)).J(bVar);
        }
    }

    private static class c {
        /* access modifiers changed from: private */
        public final b<?> a;
        /* access modifiers changed from: private */
        public final d b;

        private c(b<?> bVar, d dVar) {
            this.a = bVar;
            this.b = dVar;
        }

        /* synthetic */ c(b bVar, d dVar, x xVar) {
            this(bVar, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                return q.a(this.a, cVar.a) && q.a(this.b, cVar.b);
            }
        }

        public final int hashCode() {
            return q.b(this.a, this.b);
        }

        public final String toString() {
            q.a c = q.c(this);
            c.a("key", this.a);
            c.a("feature", this.b);
            return c.toString();
        }
    }

    private f(Context context, Looper looper, e eVar) {
        this.h = context;
        this.q = new l90(looper, this);
        this.i = eVar;
        this.j = new com.google.android.gms.common.internal.j(eVar);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static f h(Context context) {
        f fVar;
        synchronized (t) {
            if (u == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                u = new f(context.getApplicationContext(), handlerThread.getLooper(), e.m());
            }
            fVar = u;
        }
        return fVar;
    }

    private final void i(com.google.android.gms.common.api.e<?> eVar) {
        b<?> q2 = eVar.q();
        a aVar = this.m.get(q2);
        if (aVar == null) {
            aVar = new a(eVar);
            this.m.put(q2, aVar);
        }
        if (aVar.d()) {
            this.p.add(q2);
        }
        aVar.a();
    }

    public final <O extends a.d> e81<Boolean> b(com.google.android.gms.common.api.e<O> eVar, j.a<?> aVar) {
        f81 f81 = new f81();
        w0 w0Var = new w0(aVar, f81);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(13, new e0(w0Var, this.l.get(), eVar)));
        return f81.a();
    }

    public final <O extends a.d> e81<Void> c(com.google.android.gms.common.api.e<O> eVar, m<a.b, ?> mVar, s<a.b, ?> sVar) {
        f81 f81 = new f81();
        v0 v0Var = new v0(new f0(mVar, sVar), f81);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(8, new e0(v0Var, this.l.get(), eVar)));
        return f81.a();
    }

    public final void d(com.google.android.gms.common.b bVar, int i2) {
        if (!n(bVar, i2)) {
            Handler handler = this.q;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
        }
    }

    public final void e(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d, ResultT> void f(com.google.android.gms.common.api.e<O> eVar, int i2, q<a.b, ResultT> qVar, f81<ResultT> f81, p pVar) {
        u0 u0Var = new u0(i2, qVar, f81, pVar);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(4, new e0(u0Var, this.l.get(), eVar)));
    }

    public boolean handleMessage(Message message) {
        f81<Boolean> f81;
        Boolean bool;
        int i2 = message.what;
        long j2 = 300000;
        a aVar = null;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.g = j2;
                this.q.removeMessages(12);
                for (b<?> obtainMessage : this.m.keySet()) {
                    Handler handler = this.q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.g);
                }
                break;
            case 2:
                x0 x0Var = (x0) message.obj;
                Iterator<b<?>> it = x0Var.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b next = it.next();
                        a aVar2 = this.m.get(next);
                        if (aVar2 == null) {
                            x0Var.a(next, new com.google.android.gms.common.b(13), (String) null);
                            break;
                        } else if (aVar2.c()) {
                            x0Var.a(next, com.google.android.gms.common.b.i, aVar2.n().e());
                        } else if (aVar2.z() != null) {
                            x0Var.a(next, aVar2.z(), (String) null);
                        } else {
                            aVar2.l(x0Var);
                            aVar2.a();
                        }
                    }
                }
            case 3:
                for (a next2 : this.m.values()) {
                    next2.y();
                    next2.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                e0 e0Var = (e0) message.obj;
                a aVar3 = this.m.get(e0Var.c.q());
                if (aVar3 == null) {
                    i(e0Var.c);
                    aVar3 = this.m.get(e0Var.c.q());
                }
                if (aVar3.d() && this.l.get() != e0Var.b) {
                    e0Var.a.b(r);
                    aVar3.w();
                    break;
                } else {
                    aVar3.k(e0Var.a);
                    break;
                }
            case 5:
                int i3 = message.arg1;
                com.google.android.gms.common.b bVar = (com.google.android.gms.common.b) message.obj;
                Iterator<a<?>> it2 = this.m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a next3 = it2.next();
                        if (next3.b() == i3) {
                            aVar = next3;
                        }
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String e2 = this.i.e(bVar.i());
                    String j3 = bVar.j();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 69 + String.valueOf(j3).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(e2);
                    sb2.append(": ");
                    sb2.append(j3);
                    aVar.D(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (com.google.android.gms.common.util.m.a() && (this.h.getApplicationContext() instanceof Application)) {
                    c.c((Application) this.h.getApplicationContext());
                    c.b().a(new x(this));
                    if (!c.b().f(true)) {
                        this.g = 300000;
                        break;
                    }
                }
                break;
            case 7:
                i((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (b<?> remove : this.p) {
                    this.m.remove(remove).w();
                }
                this.p.clear();
                break;
            case 11:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).o();
                    break;
                }
                break;
            case 12:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).C();
                    break;
                }
                break;
            case 14:
                v vVar = (v) message.obj;
                b<?> a2 = vVar.a();
                if (!this.m.containsKey(a2)) {
                    f81 = vVar.b();
                    bool = Boolean.FALSE;
                } else {
                    boolean m2 = this.m.get(a2).F(false);
                    f81 = vVar.b();
                    bool = Boolean.valueOf(m2);
                }
                f81.c(bool);
                break;
            case 15:
                c cVar = (c) message.obj;
                if (this.m.containsKey(cVar.a)) {
                    this.m.get(cVar.a).h(cVar);
                    break;
                }
                break;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.m.containsKey(cVar2.a)) {
                    this.m.get(cVar2.a).r(cVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                sb3.toString();
                return false;
        }
        return true;
    }

    public final int j() {
        return this.k.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final boolean n(com.google.android.gms.common.b bVar, int i2) {
        return this.i.t(this.h, bVar, i2);
    }

    public final void v() {
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
