package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.zj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class j implements ComponentCallbacks2, fk {
    private static final cl q = ((cl) cl.x0(Bitmap.class).Z());
    protected final c e;
    protected final Context f;
    final ek g;
    private final kk h;
    private final jk i;
    private final mk j;
    private final Runnable k;
    private final Handler l;
    private final zj m;
    private final CopyOnWriteArrayList<bl<Object>> n;
    private cl o;
    private boolean p;

    class a implements Runnable {
        a() {
        }

        public void run() {
            j jVar = j.this;
            jVar.g.a(jVar);
        }
    }

    private static class b extends jl<View, Object> {
        b(View view) {
            super(view);
        }

        public void e(Object obj, ul<? super Object> ulVar) {
        }

        public void g(Drawable drawable) {
        }

        /* access modifiers changed from: protected */
        public void l(Drawable drawable) {
        }
    }

    private class c implements zj.a {
        private final kk a;

        c(kk kkVar) {
            this.a = kkVar;
        }

        public void a(boolean z) {
            if (z) {
                synchronized (j.this) {
                    this.a.e();
                }
            }
        }
    }

    static {
        cl clVar = (cl) cl.x0(ij.class).Z();
        cl clVar2 = (cl) ((cl) cl.y0(we.b).i0(g.LOW)).r0(true);
    }

    public j(c cVar, ek ekVar, jk jkVar, Context context) {
        this(cVar, ekVar, jkVar, new kk(), cVar.h(), context);
    }

    j(c cVar, ek ekVar, jk jkVar, kk kkVar, ak akVar, Context context) {
        this.j = new mk();
        this.k = new a();
        this.l = new Handler(Looper.getMainLooper());
        this.e = cVar;
        this.g = ekVar;
        this.i = jkVar;
        this.h = kkVar;
        this.f = context;
        this.m = akVar.a(context.getApplicationContext(), new c(kkVar));
        if (km.p()) {
            this.l.post(this.k);
        } else {
            ekVar.a(this);
        }
        ekVar.a(this.m);
        this.n = new CopyOnWriteArrayList<>(cVar.j().c());
        A(cVar.j().d());
        cVar.p(this);
    }

    private void D(pl<?> plVar) {
        boolean C = C(plVar);
        zk c2 = plVar.c();
        if (!C && !this.e.q(plVar) && c2 != null) {
            plVar.f((zk) null);
            c2.clear();
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void A(cl clVar) {
        this.o = (cl) ((cl) clVar.clone()).c();
    }

    /* access modifiers changed from: package-private */
    public synchronized void B(pl<?> plVar, zk zkVar) {
        this.j.k(plVar);
        this.h.g(zkVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean C(pl<?> plVar) {
        zk c2 = plVar.c();
        if (c2 == null) {
            return true;
        }
        if (!this.h.a(c2)) {
            return false;
        }
        this.j.l(plVar);
        plVar.f((zk) null);
        return true;
    }

    public <ResourceType> i<ResourceType> a(Class<ResourceType> cls) {
        return new i<>(this.e, this, cls, this.f);
    }

    public i<Bitmap> b() {
        return a(Bitmap.class).b(q);
    }

    public i<Drawable> k() {
        return a(Drawable.class);
    }

    public void l(View view) {
        m(new b(view));
    }

    public void m(pl<?> plVar) {
        if (plVar != null) {
            D(plVar);
        }
    }

    public synchronized void n() {
        z();
        this.j.n();
    }

    /* access modifiers changed from: package-private */
    public List<bl<Object>> o() {
        return this.n;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i2) {
        if (i2 == 60 && this.p) {
            v();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized cl p() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public <T> k<?, T> q(Class<T> cls) {
        return this.e.j().e(cls);
    }

    public i<Drawable> r(Uri uri) {
        return k().M0(uri);
    }

    public i<Drawable> s(Integer num) {
        return k().N0(num);
    }

    public i<Drawable> t(String str) {
        return k().P0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.h + ", treeNode=" + this.i + "}";
    }

    public synchronized void u() {
        this.h.c();
    }

    public synchronized void v() {
        u();
        for (j u : this.i.a()) {
            u.u();
        }
    }

    public synchronized void w() {
        this.h.d();
    }

    public synchronized void x() {
        this.j.x();
        for (pl<?> m2 : this.j.b()) {
            m(m2);
        }
        this.j.a();
        this.h.b();
        this.g.b(this);
        this.g.b(this.m);
        this.l.removeCallbacks(this.k);
        this.e.t(this);
    }

    public synchronized void y() {
        w();
        this.j.y();
    }

    public synchronized void z() {
        this.h.f();
    }
}
