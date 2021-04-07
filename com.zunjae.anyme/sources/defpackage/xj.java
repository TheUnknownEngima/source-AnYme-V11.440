package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: xj  reason: default package */
class xj implements ek {
    private final Set<fk> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    xj() {
    }

    public void a(fk fkVar) {
        this.a.add(fkVar);
        if (this.c) {
            fkVar.x();
        } else if (this.b) {
            fkVar.n();
        } else {
            fkVar.y();
        }
    }

    public void b(fk fkVar) {
        this.a.remove(fkVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.c = true;
        for (T x : km.j(this.a)) {
            x.x();
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.b = true;
        for (T n : km.j(this.a)) {
            n.n();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.b = false;
        for (T y : km.j(this.a)) {
            y.y();
        }
    }
}
