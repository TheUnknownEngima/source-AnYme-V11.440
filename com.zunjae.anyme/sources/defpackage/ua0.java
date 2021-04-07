package defpackage;

import android.view.View;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;

/* renamed from: ua0  reason: default package */
public final class ua0 extends g60 implements i.e {
    private final View b;
    private final i60 c;

    public ua0(View view, i60 i60) {
        this.b = view;
        this.c = i60;
        view.setEnabled(false);
    }

    private final void g() {
        View view;
        i b2 = b();
        boolean z = true;
        if (b2 == null || !b2.o() || b2.u()) {
            view = this.b;
        } else {
            if (!b2.q()) {
                view = this.b;
            } else {
                View view2 = this.b;
                if (!b2.v() || this.c.g()) {
                    view = view2;
                } else {
                    view = view2;
                }
            }
            view.setEnabled(z);
        }
        z = false;
        view.setEnabled(z);
    }

    public final void a(long j, long j2) {
        g();
    }

    public final void c() {
        g();
    }

    public final void d() {
        this.b.setEnabled(false);
    }

    public final void e(c cVar) {
        super.e(cVar);
        if (b() != null) {
            b().c(this, 1000);
        }
        g();
    }

    public final void f() {
        if (b() != null) {
            b().E(this);
        }
        this.b.setEnabled(false);
        super.f();
        g();
    }
}
