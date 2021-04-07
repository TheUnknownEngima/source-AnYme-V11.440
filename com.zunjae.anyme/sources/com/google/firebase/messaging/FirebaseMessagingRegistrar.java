package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements h {

    private static class b<T> implements zm<T> {
        private b() {
        }

        public void a(wm<T> wmVar) {
        }

        public void b(wm<T> wmVar, bn bnVar) {
            bnVar.a((Exception) null);
        }
    }

    public static class c implements an {
        public <T> zm<T> a(String str, Class<T> cls, ym<T, byte[]> ymVar) {
            return new b();
        }

        public <T> zm<T> b(String str, Class<T> cls, vm vmVar, ym<T, byte[]> ymVar) {
            return new b();
        }
    }

    static an determineFactory(an anVar) {
        return (anVar == null || !com.google.android.datatransport.cct.a.h.b().contains(vm.b("json"))) ? new c() : anVar;
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(e eVar) {
        return new FirebaseMessaging((com.google.firebase.c) eVar.a(com.google.firebase.c.class), (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class), (pi1) eVar.a(pi1.class), (uh1) eVar.a(uh1.class), (g) eVar.a(g.class), determineFactory((an) eVar.a(an.class)));
    }

    @Keep
    public List<d<?>> getComponents() {
        d.b<FirebaseMessaging> a2 = d.a(FirebaseMessaging.class);
        a2.b(n.f(com.google.firebase.c.class));
        a2.b(n.f(FirebaseInstanceId.class));
        a2.b(n.f(pi1.class));
        a2.b(n.f(uh1.class));
        a2.b(n.e(an.class));
        a2.b(n.f(g.class));
        a2.f(k.a);
        a2.c();
        return Arrays.asList(new d[]{a2.d(), oi1.a("fire-fcm", "20.2.4")});
    }
}
