package defpackage;

import java.util.ArrayList;

/* renamed from: lh2  reason: default package */
public final class lh2 {
    private final ArrayList<sg2<?>> a = new ArrayList<>();
    private final ArrayList<xh2> b = new ArrayList<>();
    private final boolean c;
    private final boolean d;

    public lh2(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
    }

    private final void d(sg2<?> sg2, vg2 vg2) {
        boolean z = false;
        sg2.g().c(vg2.b() || this.c);
        vg2 g = sg2.g();
        if (vg2.a() || this.d) {
            z = true;
        }
        g.d(z);
    }

    public final <T> void a(sg2<T> sg2, vg2 vg2) {
        v62.f(sg2, "definition");
        v62.f(vg2, "options");
        d(sg2, vg2);
        this.a.add(sg2);
    }

    public final ArrayList<sg2<?>> b() {
        return this.a;
    }

    public final ArrayList<xh2> c() {
        return this.b;
    }
}
