package com.google.firebase.crashlytics;

import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements h {
    /* access modifiers changed from: private */
    public c b(e eVar) {
        return c.b((c) eVar.a(c.class), (g) eVar.a(g.class), (ib1) eVar.a(ib1.class), (eb1) eVar.a(eb1.class));
    }

    public List<d<?>> getComponents() {
        d.b<c> a = d.a(c.class);
        a.b(n.f(c.class));
        a.b(n.f(g.class));
        a.b(n.e(eb1.class));
        a.b(n.e(ib1.class));
        a.f(b.b(this));
        a.e();
        return Arrays.asList(new d[]{a.d(), oi1.a("fire-cls", "17.2.1")});
    }
}
