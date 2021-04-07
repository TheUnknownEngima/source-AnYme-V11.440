package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ph2  reason: default package */
public final class ph2 {
    private final HashSet<sg2<?>> a = new HashSet<>();
    private final Map<String, sg2<?>> b = new ConcurrentHashMap();
    private final Map<y72<?>, sg2<?>> c = new ConcurrentHashMap();
    private final Map<y72<?>, ArrayList<sg2<?>>> d = new ConcurrentHashMap();
    private final HashSet<sg2<?>> e = new HashSet<>();

    private final void a(HashSet<sg2<?>> hashSet, sg2<?> sg2) {
        if (!hashSet.add(sg2) && !sg2.g().a()) {
            throw new yg2("Already existing definition or try to override an existing one: " + sg2);
        }
    }

    private final ArrayList<sg2<?>> c(y72<?> y72) {
        this.d.put(y72, new ArrayList());
        ArrayList<sg2<?>> arrayList = this.d.get(y72);
        if (arrayList != null) {
            return arrayList;
        }
        v62.l();
        throw null;
    }

    private final sg2<?> f(String str) {
        return this.b.get(str);
    }

    private final sg2<?> g(y72<?> y72) {
        ArrayList arrayList = this.d.get(y72);
        if (arrayList != null && arrayList.size() == 1) {
            return (sg2) arrayList.get(0);
        }
        if (arrayList == null || arrayList.size() <= 1) {
            return null;
        }
        throw new bh2("Found multiple definitions for type '" + yh2.a(y72) + "': " + arrayList + ". Please use the 'bind<P,S>()' function to bind your instance from primary and secondary types.");
    }

    private final sg2<?> h(y72<?> y72) {
        return this.c.get(y72);
    }

    private final void l(sg2<?> sg2) {
        oh2 j = sg2.j();
        if (j == null) {
            return;
        }
        if (this.b.get(j.toString()) == null || sg2.g().a()) {
            this.b.put(j.toString(), sg2);
            if (ng2.c.b().d(jh2.INFO)) {
                kh2 b2 = ng2.c.b();
                b2.c("bind qualifier:'" + sg2.j() + "' ~ " + sg2);
                return;
            }
            return;
        }
        throw new yg2("Already existing definition or try to override an existing one with qualifier '" + j + "' with " + sg2 + " but has already registered " + this.b.get(j.toString()));
    }

    private final void m(sg2<?> sg2, y72<?> y72) {
        ArrayList<sg2<?>> arrayList = this.d.get(y72);
        if (arrayList == null) {
            arrayList = c(y72);
        }
        arrayList.add(sg2);
        if (ng2.c.b().d(jh2.INFO)) {
            kh2 b2 = ng2.c.b();
            b2.c("bind secondary type:'" + yh2.a(y72) + "' ~ " + sg2);
        }
    }

    private final void n(sg2<?> sg2) {
        for (y72 m : sg2.l()) {
            m(sg2, m);
        }
    }

    private final void o(sg2<?> sg2) {
        this.e.add(sg2);
    }

    private final void p(y72<?> y72, sg2<?> sg2) {
        if (this.c.get(y72) == null || sg2.g().a()) {
            this.c.put(y72, sg2);
            if (ng2.c.b().d(jh2.INFO)) {
                kh2 b2 = ng2.c.b();
                b2.c("bind type:'" + yh2.a(y72) + "' ~ " + sg2);
                return;
            }
            return;
        }
        throw new yg2("Already existing definition or try to override an existing one with type '" + y72 + "' and " + sg2 + " but has already registered " + this.c.get(y72));
    }

    private final void q(sg2<?> sg2) {
        p(sg2.h(), sg2);
    }

    private final void r(lh2 lh2) {
        for (sg2 k : lh2.b()) {
            k(k);
        }
    }

    public final void b() {
        for (sg2 a2 : this.a) {
            a2.a();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.e.clear();
    }

    public final Set<sg2<?>> d() {
        return this.e;
    }

    public final sg2<?> e(oh2 oh2, y72<?> y72) {
        v62.f(y72, "clazz");
        if (oh2 != null) {
            return f(oh2.toString());
        }
        sg2<?> h = h(y72);
        return h != null ? h : g(y72);
    }

    public final Set<sg2<?>> i() {
        return this.a;
    }

    public final void j(Iterable<lh2> iterable) {
        v62.f(iterable, "modules");
        for (lh2 r : iterable) {
            r(r);
        }
    }

    public final void k(sg2<?> sg2) {
        v62.f(sg2, "definition");
        a(this.a, sg2);
        sg2.b();
        if (sg2.j() != null) {
            l(sg2);
        } else {
            q(sg2);
        }
        if (!sg2.l().isEmpty()) {
            n(sg2);
        }
        if (sg2.g().b()) {
            o(sg2);
        }
    }
}
