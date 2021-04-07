package defpackage;

import com.bumptech.glide.e;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.m;
import defpackage.ah;
import defpackage.ue;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: te  reason: default package */
final class te<Transcode> {
    private final List<ah.a<?>> a = new ArrayList();
    private final List<g> b = new ArrayList();
    private e c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private ue.e h;
    private i i;
    private Map<Class<?>, m<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private g n;
    private com.bumptech.glide.g o;
    private we p;
    private boolean q;
    private boolean r;

    te() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    /* access modifiers changed from: package-private */
    public of b() {
        return this.c.b();
    }

    /* access modifiers changed from: package-private */
    public List<g> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<ah.a<?>> g2 = g();
            int size = g2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ah.a aVar = g2.get(i2);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.b.size(); i3++) {
                    if (!this.b.contains(aVar.b.get(i3))) {
                        this.b.add(aVar.b.get(i3));
                    }
                }
            }
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public bg d() {
        return this.h.a();
    }

    /* access modifiers changed from: package-private */
    public we e() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public List<ah.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List i2 = this.c.h().i(this.d);
            int size = i2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ah.a b2 = ((ah) i2.get(i3)).b(this.d, this.e, this.f, this.i);
                if (b2 != null) {
                    this.a.add(b2);
                }
            }
        }
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public <Data> gf<Data, ?, Transcode> h(Class<Data> cls) {
        return this.c.h().h(cls, this.g, this.k);
    }

    /* access modifiers changed from: package-private */
    public Class<?> i() {
        return this.d.getClass();
    }

    /* access modifiers changed from: package-private */
    public List<ah<File, ?>> j(File file) {
        return this.c.h().i(file);
    }

    /* access modifiers changed from: package-private */
    public i k() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public com.bumptech.glide.g l() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.c.h().j(this.d.getClass(), this.g, this.k);
    }

    /* access modifiers changed from: package-private */
    public <Z> l<Z> n(Cif<Z> ifVar) {
        return this.c.h().k(ifVar);
    }

    /* access modifiers changed from: package-private */
    public g o() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public <X> d<X> p(X x) {
        return this.c.h().m(x);
    }

    /* access modifiers changed from: package-private */
    public Class<?> q() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public <Z> m<Z> r(Class<Z> cls) {
        m<Z> mVar = this.j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, m<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return th.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    public <R> void u(e eVar, Object obj, g gVar, int i2, int i3, we weVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, i iVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, ue.e eVar2) {
        this.c = eVar;
        this.d = obj;
        this.n = gVar;
        this.e = i2;
        this.f = i3;
        this.p = weVar;
        this.g = cls;
        this.h = eVar2;
        this.k = cls2;
        this.o = gVar2;
        this.i = iVar;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    /* access modifiers changed from: package-private */
    public boolean v(Cif<?> ifVar) {
        return this.c.h().n(ifVar);
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public boolean x(g gVar) {
        List<ah.a<?>> g2 = g();
        int size = g2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (g2.get(i2).a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
