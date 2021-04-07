package com.zunjae.anyme.features.firebase;

import com.google.firebase.remoteconfig.e;
import java.util.HashMap;

public final class a {
    public static final a a = new a();

    /* renamed from: com.zunjae.anyme.features.firebase.a$a  reason: collision with other inner class name */
    static final class C0192a<TResult> implements z71<Void> {
        final /* synthetic */ e a;

        C0192a(e eVar) {
            this.a = eVar;
        }

        public final void a(e81<Void> e81) {
            v62.e(e81, "it");
            if (e81.q()) {
                uj2.a("//Done fetching!!", new Object[0]);
                v62.d(this.a.b(), "firebaseRemoteConfig.activate()");
                return;
            }
            uj2.a("//Could not fetch", new Object[0]);
        }
    }

    private a() {
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        for (b bVar : b.values()) {
            hashMap.put(bVar.getKey(), bVar.getValue());
        }
        e e = e.e();
        v62.d(e, "FirebaseRemoteConfig.getInstance()");
        e.n(hashMap);
        e.c(1800).b(new C0192a(e));
    }
}
