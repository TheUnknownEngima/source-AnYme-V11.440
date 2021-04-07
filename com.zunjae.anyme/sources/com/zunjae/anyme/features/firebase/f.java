package com.zunjae.anyme.features.firebase;

import com.google.firebase.analytics.FirebaseAnalytics;

public final class f {
    public static final f a = new f();

    private f() {
    }

    public final void a(c cVar, Object obj, FirebaseAnalytics firebaseAnalytics) {
        v62.e(cVar, "fup");
        v62.e(obj, "value");
        v62.e(firebaseAnalytics, "firebaseAnalytics");
        firebaseAnalytics.a(cVar.getKey(), obj.toString());
        uj2.a("Set user property [" + obj + "] for [" + cVar.getKey() + ']', new Object[0]);
    }
}
