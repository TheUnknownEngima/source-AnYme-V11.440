package defpackage;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rh2  reason: default package */
public final class rh2 {
    private final ConcurrentHashMap<String, uh2> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, sh2> b = new ConcurrentHashMap<>();

    private final void a(lh2 lh2) {
        for (xh2 f : lh2.c()) {
            f(f);
        }
    }

    private final void f(xh2 xh2) {
        uh2 uh2 = this.a.get(xh2.c().toString());
        if (uh2 == null) {
            this.a.put(xh2.c().toString(), xh2.a());
        } else {
            uh2.a().addAll(xh2.b());
        }
    }

    private final void g(sh2 sh2) {
        this.b.put(sh2.g(), sh2);
    }

    public final void b(String str) {
        v62.f(str, "id");
        this.b.remove(str);
    }

    public final Collection<uh2> c() {
        Collection<uh2> values = this.a.values();
        v62.b(values, "definitions.values");
        return values;
    }

    public final void d(mg2 mg2) {
        v62.f(mg2, "koin");
        g(mg2.c());
    }

    public final void e(Iterable<lh2> iterable) {
        v62.f(iterable, "modules");
        for (lh2 a2 : iterable) {
            a(a2);
        }
    }
}
