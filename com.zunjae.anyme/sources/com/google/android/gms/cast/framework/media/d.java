package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

public class d {
    private final u60 a;
    long b;
    private final i c;
    List<Integer> d;
    final SparseIntArray e;
    LruCache<Integer, o> f;
    final List<Integer> g;
    private final Deque<Integer> h;
    private final Handler i;
    private TimerTask j;
    private g<i.c> k;
    private g<i.c> l;
    private Set<a> m;

    public static abstract class a {
        public void a(int i, int i2) {
        }

        public void b() {
        }

        public void c(int[] iArr) {
        }

        public void d(int[] iArr) {
        }

        public void e() {
        }

        public void f() {
        }
    }

    public class b extends i.a {
        public b() {
        }

        public final void g() {
            long z = d.this.p();
            d dVar = d.this;
            if (z != dVar.b) {
                dVar.b = z;
                dVar.a();
                d dVar2 = d.this;
                if (dVar2.b != 0) {
                    dVar2.b();
                }
            }
        }

        public final void h(int[] iArr) {
            List<Integer> j = t60.j(iArr);
            if (!d.this.d.equals(j)) {
                d.this.s();
                d.this.f.evictAll();
                d.this.g.clear();
                d dVar = d.this;
                dVar.d = j;
                dVar.r();
                d.this.u();
                d.this.t();
            }
        }

        public final void i(int[] iArr, int i) {
            int i2;
            int length = iArr.length;
            if (i == 0) {
                i2 = d.this.d.size();
            } else {
                i2 = d.this.e.get(i, -1);
                if (i2 == -1) {
                    d.this.b();
                    return;
                }
            }
            d.this.s();
            d.this.d.addAll(i2, t60.j(iArr));
            d.this.r();
            d.this.g(i2, length);
            d.this.t();
        }

        public final void j(o[] oVarArr) {
            HashSet hashSet = new HashSet();
            d.this.g.clear();
            int length = oVarArr.length;
            int i = 0;
            while (i < length) {
                o oVar = oVarArr[i];
                int l = oVar.l();
                d.this.f.put(Integer.valueOf(l), oVar);
                int i2 = d.this.e.get(l, -1);
                if (i2 == -1) {
                    d.this.b();
                    return;
                } else {
                    hashSet.add(Integer.valueOf(i2));
                    i++;
                }
            }
            for (Integer intValue : d.this.g) {
                int i3 = d.this.e.get(intValue.intValue(), -1);
                if (i3 != -1) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            d.this.g.clear();
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            d.this.s();
            d.this.w(t60.g(arrayList));
            d.this.t();
        }

        public final void k(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                d.this.f.remove(Integer.valueOf(i2));
                int i3 = d.this.e.get(i2, -1);
                if (i3 == -1) {
                    d.this.b();
                    return;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    i++;
                }
            }
            Collections.sort(arrayList);
            d.this.s();
            d.this.w(t60.g(arrayList));
            d.this.t();
        }

        public final void l(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                d.this.f.remove(Integer.valueOf(i));
                int i2 = d.this.e.get(i, -1);
                if (i2 == -1) {
                    d.this.b();
                    return;
                }
                d.this.e.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                d.this.s();
                d.this.d.removeAll(t60.j(iArr));
                d.this.r();
                d.this.y(t60.g(arrayList));
                d.this.t();
            }
        }
    }

    d(i iVar) {
        this(iVar, 20, 20);
    }

    private d(i iVar, int i2, int i3) {
        this.m = new HashSet();
        this.a = new u60("MediaQueue");
        this.c = iVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new mb0(Looper.getMainLooper());
        this.j = new m0(this);
        iVar.C(new b());
        A(20);
        this.b = p();
        b();
    }

    private final void A(int i2) {
        this.f = new o0(this, i2);
    }

    /* access modifiers changed from: private */
    public final void g(int i2, int i3) {
        for (a a2 : this.m) {
            a2.a(i2, i3);
        }
    }

    private final void k() {
        l();
        this.i.postDelayed(this.j, 500);
    }

    private final void l() {
        this.i.removeCallbacks(this.j);
    }

    private final void m() {
        g<i.c> gVar = this.l;
        if (gVar != null) {
            gVar.a();
            this.l = null;
        }
    }

    private final void n() {
        g<i.c> gVar = this.k;
        if (gVar != null) {
            gVar.a();
            this.k = null;
        }
    }

    /* access modifiers changed from: private */
    public final long p() {
        q k2 = this.c.k();
        if (k2 == null || k2.A0()) {
            return 0;
        }
        return k2.y0();
    }

    /* access modifiers changed from: private */
    public final void q() {
        if (!this.h.isEmpty() && this.k == null && this.b != 0) {
            g<i.c> c0 = this.c.c0(t60.g(this.h));
            this.k = c0;
            c0.b(new n0(this));
            this.h.clear();
        }
    }

    /* access modifiers changed from: private */
    public final void r() {
        this.e.clear();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            this.e.put(this.d.get(i2).intValue(), i2);
        }
    }

    /* access modifiers changed from: private */
    public final void s() {
        for (a f2 : this.m) {
            f2.f();
        }
    }

    /* access modifiers changed from: private */
    public final void t() {
        for (a e2 : this.m) {
            e2.e();
        }
    }

    /* access modifiers changed from: private */
    public final void u() {
        for (a b2 : this.m) {
            b2.b();
        }
    }

    /* access modifiers changed from: private */
    public final void w(int[] iArr) {
        for (a d2 : this.m) {
            d2.d(iArr);
        }
    }

    /* access modifiers changed from: private */
    public final void y(int[] iArr) {
        for (a c2 : this.m) {
            c2.c(iArr);
        }
    }

    public final void a() {
        s();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        l();
        this.h.clear();
        m();
        n();
        u();
        t();
    }

    public final void b() {
        r.e("Must be called from the main thread.");
        if (this.b != 0 && this.l == null) {
            m();
            n();
            g<i.c> V = this.c.V();
            this.l = V;
            V.b(new l0(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(i.c cVar) {
        Status g2 = cVar.g();
        int i2 = g2.i();
        if (i2 != 0) {
            this.a.g(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i2), g2.j()}), new Object[0]);
        }
        this.k = null;
        if (!this.h.isEmpty()) {
            k();
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(i.c cVar) {
        Status g2 = cVar.g();
        int i2 = g2.i();
        if (i2 != 0) {
            this.a.g(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i2), g2.j()}), new Object[0]);
        }
        this.l = null;
        if (!this.h.isEmpty()) {
            k();
        }
    }
}
