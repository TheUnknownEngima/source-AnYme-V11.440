package androidx.work.impl;

import androidx.lifecycle.t;
import androidx.work.k;

public class b implements k {
    private final t<k.b> c = new t<>();
    private final r8<k.b.c> d = r8.t();

    public b() {
        a(k.b);
    }

    public void a(k.b bVar) {
        this.c.k(bVar);
        if (bVar instanceof k.b.c) {
            this.d.p((k.b.c) bVar);
        } else if (bVar instanceof k.b.a) {
            this.d.q(((k.b.a) bVar).a());
        }
    }
}
