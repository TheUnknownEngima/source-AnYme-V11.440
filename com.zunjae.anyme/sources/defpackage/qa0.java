package defpackage;

import android.view.View;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;

/* renamed from: qa0  reason: default package */
public final class qa0 extends g60 {
    private final View b;

    public qa0(View view) {
        this.b = view;
    }

    private final void g() {
        View view;
        int i;
        i b2 = b();
        if (b2 == null || !b2.o() || b2.p()) {
            view = this.b;
            i = 0;
        } else {
            view = this.b;
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void c() {
        g();
    }

    public final void d() {
        this.b.setVisibility(0);
    }

    public final void e(c cVar) {
        super.e(cVar);
        g();
    }

    public final void f() {
        this.b.setVisibility(8);
        super.f();
    }
}
