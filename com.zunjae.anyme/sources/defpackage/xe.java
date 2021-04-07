package defpackage;

import android.util.Log;
import com.bumptech.glide.e;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import defpackage.bg;
import defpackage.cf;
import defpackage.ig;
import defpackage.lm;
import defpackage.ue;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: xe  reason: default package */
public class xe implements ze, ig.a, cf.a {
    private static final boolean i = Log.isLoggable("Engine", 2);
    private final ff a;
    private final bf b;
    private final ig c;
    private final b d;
    private final lf e;
    private final c f;
    private final a g;
    private final ne h;

    /* renamed from: xe$a */
    static class a {
        final ue.e a;
        final r3<ue<?>> b = lm.d(150, new C0144a());
        private int c;

        /* renamed from: xe$a$a  reason: collision with other inner class name */
        class C0144a implements lm.d<ue<?>> {
            C0144a() {
            }

            /* renamed from: b */
            public ue<?> a() {
                a aVar = a.this;
                return new ue<>(aVar.a, aVar.b);
            }
        }

        a(ue.e eVar) {
            this.a = eVar;
        }

        /* access modifiers changed from: package-private */
        public <R> ue<R> a(e eVar, Object obj, af afVar, g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, we weVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, boolean z3, i iVar, ue.b<R> bVar) {
            ue<R> b2 = this.b.b();
            jm.d(b2);
            ue<R> ueVar = b2;
            int i3 = this.c;
            int i4 = i3;
            this.c = i3 + 1;
            ueVar.w(eVar, obj, afVar, gVar, i, i2, cls, cls2, gVar2, weVar, map, z, z2, z3, iVar, bVar, i4);
            return ueVar;
        }
    }

    /* renamed from: xe$b */
    static class b {
        final lg a;
        final lg b;
        final lg c;
        final lg d;
        final ze e;
        final cf.a f;
        final r3<ye<?>> g = lm.d(150, new a());

        /* renamed from: xe$b$a */
        class a implements lm.d<ye<?>> {
            a() {
            }

            /* renamed from: b */
            public ye<?> a() {
                b bVar = b.this;
                return new ye(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        b(lg lgVar, lg lgVar2, lg lgVar3, lg lgVar4, ze zeVar, cf.a aVar) {
            this.a = lgVar;
            this.b = lgVar2;
            this.c = lgVar3;
            this.d = lgVar4;
            this.e = zeVar;
            this.f = aVar;
        }

        /* access modifiers changed from: package-private */
        public <R> ye<R> a(g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            ye<R> b2 = this.g.b();
            jm.d(b2);
            ye<R> yeVar = b2;
            yeVar.l(gVar, z, z2, z3, z4);
            return yeVar;
        }
    }

    /* renamed from: xe$c */
    private static class c implements ue.e {
        private final bg.a a;
        private volatile bg b;

        c(bg.a aVar) {
            this.a = aVar;
        }

        public bg a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.a();
                    }
                    if (this.b == null) {
                        this.b = new cg();
                    }
                }
            }
            return this.b;
        }
    }

    /* renamed from: xe$d */
    public class d {
        private final ye<?> a;
        private final dl b;

        d(dl dlVar, ye<?> yeVar) {
            this.b = dlVar;
            this.a = yeVar;
        }

        public void a() {
            synchronized (xe.this) {
                this.a.r(this.b);
            }
        }
    }

    xe(ig igVar, bg.a aVar, lg lgVar, lg lgVar2, lg lgVar3, lg lgVar4, ff ffVar, bf bfVar, ne neVar, b bVar, a aVar2, lf lfVar, boolean z) {
        this.c = igVar;
        bg.a aVar3 = aVar;
        this.f = new c(aVar);
        ne neVar2 = neVar == null ? new ne(z) : neVar;
        this.h = neVar2;
        neVar2.f(this);
        this.b = bfVar == null ? new bf() : bfVar;
        this.a = ffVar == null ? new ff() : ffVar;
        this.d = bVar == null ? new b(lgVar, lgVar2, lgVar3, lgVar4, this, this) : bVar;
        this.g = aVar2 == null ? new a(this.f) : aVar2;
        this.e = lfVar == null ? new lf() : lfVar;
        igVar.e(this);
    }

    public xe(ig igVar, bg.a aVar, lg lgVar, lg lgVar2, lg lgVar3, lg lgVar4, boolean z) {
        this(igVar, aVar, lgVar, lgVar2, lgVar3, lgVar4, (ff) null, (bf) null, (ne) null, (b) null, (a) null, (lf) null, z);
    }

    private cf<?> f(g gVar) {
        Cif<?> d2 = this.c.d(gVar);
        if (d2 == null) {
            return null;
        }
        return d2 instanceof cf ? (cf) d2 : new cf<>(d2, true, true, gVar, this);
    }

    private cf<?> h(g gVar) {
        cf<?> e2 = this.h.e(gVar);
        if (e2 != null) {
            e2.b();
        }
        return e2;
    }

    private cf<?> i(g gVar) {
        cf<?> f2 = f(gVar);
        if (f2 != null) {
            f2.b();
            this.h.a(gVar, f2);
        }
        return f2;
    }

    private cf<?> j(af afVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        cf<?> h2 = h(afVar);
        if (h2 != null) {
            if (i) {
                k("Loaded resource from active resources", j, afVar);
            }
            return h2;
        }
        cf<?> i2 = i(afVar);
        if (i2 == null) {
            return null;
        }
        if (i) {
            k("Loaded resource from cache", j, afVar);
        }
        return i2;
    }

    private static void k(String str, long j, g gVar) {
        str + " in " + fm.a(j) + "ms, key: " + gVar;
    }

    private <R> d m(e eVar, Object obj, g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, we weVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, i iVar, boolean z3, boolean z4, boolean z5, boolean z6, dl dlVar, Executor executor, af afVar, long j) {
        dl dlVar2 = dlVar;
        Executor executor2 = executor;
        af afVar2 = afVar;
        long j2 = j;
        ye<?> a2 = this.a.a(afVar2, z6);
        if (a2 != null) {
            a2.b(dlVar2, executor2);
            if (i) {
                k("Added to existing load", j2, afVar2);
            }
            return new d(dlVar2, a2);
        }
        ye a3 = this.d.a(afVar, z3, z4, z5, z6);
        ye yeVar = a3;
        af afVar3 = afVar2;
        ue<R> a4 = this.g.a(eVar, obj, afVar, gVar, i2, i3, cls, cls2, gVar2, weVar, map, z, z2, z6, iVar, a3);
        this.a.c(afVar3, yeVar);
        ye yeVar2 = yeVar;
        af afVar4 = afVar3;
        dl dlVar3 = dlVar;
        yeVar2.b(dlVar3, executor);
        yeVar2.s(a4);
        if (i) {
            k("Started new load", j, afVar4);
        }
        return new d(dlVar3, yeVar2);
    }

    public void a(Cif<?> ifVar) {
        this.e.a(ifVar, true);
    }

    public synchronized void b(ye<?> yeVar, g gVar, cf<?> cfVar) {
        if (cfVar != null) {
            if (cfVar.f()) {
                this.h.a(gVar, cfVar);
            }
        }
        this.a.d(gVar, yeVar);
    }

    public synchronized void c(ye<?> yeVar, g gVar) {
        this.a.d(gVar, yeVar);
    }

    public void d(g gVar, cf<?> cfVar) {
        this.h.d(gVar);
        if (cfVar.f()) {
            this.c.c(gVar, cfVar);
        } else {
            this.e.a(cfVar, false);
        }
    }

    public void e() {
        this.f.a().clear();
    }

    public <R> d g(e eVar, Object obj, g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, we weVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, i iVar, boolean z3, boolean z4, boolean z5, boolean z6, dl dlVar, Executor executor) {
        long b2 = i ? fm.b() : 0;
        af a2 = this.b.a(obj, gVar, i2, i3, map, cls, cls2, iVar);
        synchronized (this) {
            cf<?> j = j(a2, z3, b2);
            if (j == null) {
                d m = m(eVar, obj, gVar, i2, i3, cls, cls2, gVar2, weVar, map, z, z2, iVar, z3, z4, z5, z6, dlVar, executor, a2, b2);
                return m;
            }
            dlVar.c(j, com.bumptech.glide.load.a.MEMORY_CACHE);
            return null;
        }
    }

    public void l(Cif<?> ifVar) {
        if (ifVar instanceof cf) {
            ((cf) ifVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
