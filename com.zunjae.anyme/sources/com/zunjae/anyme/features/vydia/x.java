package com.zunjae.anyme.features.vydia;

import android.content.Context;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.features.vydia.l;

public final class x implements o {
    private final Context a;

    public x(Context context) {
        v62.e(context, "context");
        this.a = context;
    }

    public l a() {
        String l = l02.l(this.a.getString(C0283R$string.preference_vydia_enable_vertical_gesture_sensitivity), l.Medium.getCode());
        l.a aVar = l.Companion;
        v62.d(l, "value");
        return aVar.a(l);
    }

    public boolean b() {
        return l02.e(this.a.getString(C0283R$string.preference_vydia_remember_progress), true);
    }

    public boolean c() {
        return l02.e(this.a.getString(C0283R$string.preference_vydia_enable_vertical_gesture), true);
    }
}
