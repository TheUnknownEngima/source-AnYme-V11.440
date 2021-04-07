package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements h {

    private static class a implements wh1 {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(e eVar) {
        return new FirebaseInstanceId((c) eVar.a(c.class), (rh1) eVar.a(rh1.class), (pi1) eVar.a(pi1.class), (uh1) eVar.a(uh1.class), (g) eVar.a(g.class));
    }

    static final /* synthetic */ wh1 lambda$getComponents$1$Registrar(e eVar) {
        return new a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }

    @Keep
    public final List<d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        d.b<FirebaseInstanceId> a2 = d.a(cls);
        a2.b(n.f(c.class));
        a2.b(n.f(rh1.class));
        a2.b(n.f(pi1.class));
        a2.b(n.f(uh1.class));
        a2.b(n.f(g.class));
        a2.f(g0.a);
        a2.c();
        d<FirebaseInstanceId> d = a2.d();
        d.b<wh1> a3 = d.a(wh1.class);
        a3.b(n.f(cls));
        a3.f(h0.a);
        return Arrays.asList(new d[]{d, a3.d(), oi1.a("fire-iid", "20.2.3")});
    }
}
