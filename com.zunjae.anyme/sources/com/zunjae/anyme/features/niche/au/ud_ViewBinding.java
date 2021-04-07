package com.zunjae.anyme.features.niche.au;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.zunjae.anyme.C0275R$id;

public final class ud_ViewBinding implements Unbinder {

    class a extends v8 {
        final /* synthetic */ ud g;

        a(ud_ViewBinding ud_viewbinding, ud udVar) {
            this.g = udVar;
        }

        public void a(View view) {
            this.g.onUb();
        }
    }

    class b extends v8 {
        final /* synthetic */ ud g;

        b(ud_ViewBinding ud_viewbinding, ud udVar) {
            this.g = udVar;
        }

        public void a(View view) {
            this.g.onRc();
        }
    }

    public ud_ViewBinding(ud udVar, View view) {
        udVar.sD = (TextView) w8.c(view, C0275R$id.sD, "field 'sD'", TextView.class);
        udVar.diff = (TextView) w8.c(view, C0275R$id.diff, "field 'diff'", TextView.class);
        w8.b(view, C0275R$id.ub, "method 'onUb'").setOnClickListener(new a(this, udVar));
        w8.b(view, C0275R$id.rC, "method 'onRc'").setOnClickListener(new b(this, udVar));
    }
}
