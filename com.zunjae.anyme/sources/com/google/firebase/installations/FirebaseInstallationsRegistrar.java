package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements h {
    static /* synthetic */ g lambda$getComponents$0(e eVar) {
        return new f((c) eVar.a(c.class), (pi1) eVar.a(pi1.class), (uh1) eVar.a(uh1.class));
    }

    public List<d<?>> getComponents() {
        d.b<g> a = d.a(g.class);
        a.b(n.f(c.class));
        a.b(n.f(uh1.class));
        a.b(n.f(pi1.class));
        a.f(i.b());
        return Arrays.asList(new d[]{a.d(), oi1.a("fire-installations", "16.3.3")});
    }
}
