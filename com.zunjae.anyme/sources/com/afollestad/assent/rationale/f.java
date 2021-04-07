package com.afollestad.assent.rationale;

import android.app.Activity;
import android.view.View;
import com.afollestad.assent.b;
import com.afollestad.assent.g;

public final class f {

    static final /* synthetic */ class a extends t62 implements f62<g[], Integer, b, z52<? super b, ? extends u22>, u22> {
        a(Activity activity) {
            super(4, activity);
        }

        public /* bridge */ /* synthetic */ Object B(Object obj, Object obj2, Object obj3, Object obj4) {
            k((g[]) obj, ((Number) obj2).intValue(), (b) obj3, (z52) obj4);
            return u22.a;
        }

        public final String a() {
            return "askForPermissions";
        }

        public final z72 f() {
            return f72.d(com.afollestad.assent.a.class, "rationales");
        }

        public final String h() {
            return "askForPermissions(Landroid/app/Activity;[Lcom/afollestad/assent/Permission;ILcom/afollestad/assent/rationale/RationaleHandler;Lkotlin/jvm/functions/Function1;)V";
        }

        public final void k(g[] gVarArr, int i, b bVar, z52<? super b, u22> z52) {
            v62.f(gVarArr, "p1");
            v62.f(z52, "p4");
            com.afollestad.assent.a.a((Activity) this.f, gVarArr, i, bVar, z52);
        }
    }

    public static final b a(Activity activity, View view, z52<? super b, u22> z52) {
        v62.f(activity, "$this$createSnackBarRationale");
        v62.f(view, "root");
        v62.f(z52, "block");
        e eVar = new e(view, activity, new a(activity));
        z52.r(eVar);
        return eVar;
    }
}
