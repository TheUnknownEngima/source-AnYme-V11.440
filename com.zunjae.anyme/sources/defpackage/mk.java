package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: mk  reason: default package */
public final class mk implements fk {
    private final Set<pl<?>> e = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.e.clear();
    }

    public List<pl<?>> b() {
        return km.j(this.e);
    }

    public void k(pl<?> plVar) {
        this.e.add(plVar);
    }

    public void l(pl<?> plVar) {
        this.e.remove(plVar);
    }

    public void n() {
        for (T n : km.j(this.e)) {
            n.n();
        }
    }

    public void x() {
        for (T x : km.j(this.e)) {
            x.x();
        }
    }

    public void y() {
        for (T y : km.j(this.e)) {
            y.y();
        }
    }
}
