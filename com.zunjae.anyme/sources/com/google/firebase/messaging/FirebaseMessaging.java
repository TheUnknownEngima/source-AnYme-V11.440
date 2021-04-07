package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.f0;
import com.google.firebase.installations.g;

public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})
    static an d;
    private final Context a;
    private final FirebaseInstanceId b;
    private final e81<z> c;

    FirebaseMessaging(c cVar, FirebaseInstanceId firebaseInstanceId, pi1 pi1, uh1 uh1, g gVar, an anVar) {
        d = anVar;
        this.b = firebaseInstanceId;
        Context g = cVar.g();
        this.a = g;
        e81<z> e = z.e(cVar, firebaseInstanceId, new f0(g), pi1, uh1, gVar, this.a, g.d());
        this.c = e;
        e.g(g.e(), new h(this));
    }

    public static synchronized FirebaseMessaging a() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(c.h());
        }
        return instance;
    }

    public static an b() {
        return d;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(c cVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) cVar.f(cls);
        }
        return firebaseMessaging;
    }

    public boolean c() {
        return this.b.u();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(z zVar) {
        if (c()) {
            zVar.q();
        }
    }

    public e81<Void> g(String str) {
        return this.c.r(new i(str));
    }

    public e81<Void> h(String str) {
        return this.c.r(new j(str));
    }
}
