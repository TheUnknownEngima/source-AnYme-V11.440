package com.afollestad.assent;

import android.app.Activity;
import com.afollestad.assent.internal.g;
import com.afollestad.assent.rationale.b;
import com.afollestad.assent.rationale.c;

public final class a {

    /* renamed from: com.afollestad.assent.a$a  reason: collision with other inner class name */
    static final class C0070a extends w62 implements z52<Activity, g> {
        public static final C0070a f = new C0070a();

        C0070a() {
            super(1);
        }

        /* renamed from: a */
        public final g r(Activity activity) {
            v62.f(activity, "activity");
            return com.afollestad.assent.internal.a.f.a(activity);
        }
    }

    public static final void a(Activity activity, g[] gVarArr, int i, b bVar, z52<? super b, u22> z52) {
        v62.f(activity, "$this$askForPermissions");
        v62.f(gVarArr, "permissions");
        v62.f(z52, "callback");
        Activity activity2 = activity;
        d.a(activity2, C0070a.f, gVarArr, i, new c(activity, new i(activity)), bVar, z52);
    }

    public static /* synthetic */ void b(Activity activity, g[] gVarArr, int i, b bVar, z52 z52, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        if ((i2 & 4) != 0) {
            bVar = null;
        }
        a(activity, gVarArr, i, bVar, z52);
    }
}
