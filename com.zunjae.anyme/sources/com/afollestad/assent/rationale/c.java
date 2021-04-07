package com.afollestad.assent.rationale;

import android.app.Activity;
import androidx.core.content.a;
import com.afollestad.assent.g;
import com.afollestad.assent.h;

public final class c implements d {
    private final Activity a;
    private final h b;

    public c(Activity activity, h hVar) {
        v62.f(activity, "activity");
        v62.f(hVar, "prefs");
        this.a = activity;
        this.b = hVar;
    }

    private final boolean c(g gVar) {
        return a.a(this.a, gVar.getValue()) == 0;
    }

    private final String d(g gVar) {
        return "show_rationale__" + gVar.getValue();
    }

    public boolean a(g gVar) {
        v62.f(gVar, "permission");
        boolean p = androidx.core.app.a.p(this.a, gVar.getValue());
        if (p) {
            this.b.b(d(gVar), Boolean.valueOf(p));
        }
        return p;
    }

    public boolean b(g gVar) {
        v62.f(gVar, "permission");
        Boolean bool = (Boolean) this.b.a(d(gVar));
        return (bool != null ? bool.booleanValue() : false) && !c(gVar) && !a(gVar);
    }
}
