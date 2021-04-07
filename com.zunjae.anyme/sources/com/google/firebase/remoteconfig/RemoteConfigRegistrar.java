package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.a;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class RemoteConfigRegistrar implements h {
    static /* synthetic */ m lambda$getComponents$0(e eVar) {
        return new m((Context) eVar.a(Context.class), (c) eVar.a(c.class), (g) eVar.a(g.class), ((a) eVar.a(a.class)).b("frc"), (eb1) eVar.a(eb1.class));
    }

    public List<d<?>> getComponents() {
        d.b<m> a = d.a(m.class);
        a.b(n.f(Context.class));
        a.b(n.f(c.class));
        a.b(n.f(g.class));
        a.b(n.f(a.class));
        a.b(n.e(eb1.class));
        a.f(n.b());
        a.e();
        return Arrays.asList(new d[]{a.d(), oi1.a("fire-rc", "19.2.0")});
    }
}
