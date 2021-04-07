package com.afollestad.assent.rationale;

import android.app.Activity;
import android.view.View;
import com.afollestad.assent.g;
import com.google.android.material.snackbar.Snackbar;

public final class e extends b {
    private final View m;

    static final class a implements View.OnClickListener {
        final /* synthetic */ Snackbar e;
        final /* synthetic */ b f;
        final /* synthetic */ a g;

        a(Snackbar snackbar, b bVar, a aVar) {
            this.e = snackbar;
            this.f = bVar;
            this.g = aVar;
        }

        public final void onClick(View view) {
            this.e.M(this.f);
            this.g.a(true);
        }
    }

    public static final class b extends Snackbar.b {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        /* renamed from: d */
        public void a(Snackbar snackbar, int i) {
            this.a.a(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, Activity activity, f62<? super g[], ? super Integer, ? super b, ? super z52<? super com.afollestad.assent.b, u22>, u22> f62) {
        super(activity, f62, (d) null, 4, (r62) null);
        v62.f(view, "root");
        v62.f(activity, "context");
        v62.f(f62, "requester");
        this.m = view;
    }

    public void m() {
    }

    public void w(g gVar, CharSequence charSequence, a aVar) {
        v62.f(gVar, "permission");
        v62.f(charSequence, "message");
        v62.f(aVar, "confirm");
        b bVar = new b(aVar);
        Snackbar b0 = Snackbar.b0(this.m, charSequence, -2);
        b0.c0(17039370, new a(b0, bVar, aVar));
        b0.p(bVar);
        b0.R();
    }
}
