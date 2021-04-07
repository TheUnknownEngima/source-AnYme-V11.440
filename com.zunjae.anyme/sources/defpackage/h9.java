package defpackage;

import android.view.View;

/* renamed from: h9  reason: default package */
public final class h9 {

    /* renamed from: h9$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ z52 e;

        a(z52 z52) {
            this.e = z52;
        }

        public final void onClick(View view) {
            g9 g9Var = g9.c;
            v62.b(view, "it");
            if (g9Var.b(view)) {
                this.e.r(view);
            }
        }
    }

    public static final <T extends View> void a(T t, z52<? super T, u22> z52) {
        v62.f(t, "$this$onClickDebounced");
        v62.f(z52, "click");
        t.setOnClickListener(new a(z52));
    }
}
