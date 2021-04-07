package defpackage;

import android.view.View;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.q;

/* renamed from: wa0  reason: default package */
public final class wa0 extends g60 {
    private final View b;
    private final int c;

    public wa0(View view, int i) {
        this.b = view;
        this.c = i;
        view.setEnabled(false);
    }

    private final void g() {
        boolean z;
        Integer n;
        i b2 = b();
        if (b2 != null) {
            if (b2.o()) {
                q k = b2.k();
                if (k.d0(64) || k.N() != 0 || ((n = k.n(k.l())) != null && n.intValue() < k.M() - 1)) {
                    z = true;
                    if (z && !b2.u()) {
                        this.b.setVisibility(0);
                        this.b.setEnabled(true);
                        return;
                    }
                }
            }
            z = false;
            this.b.setVisibility(0);
            this.b.setEnabled(true);
            return;
        }
        this.b.setVisibility(this.c);
        this.b.setEnabled(false);
    }

    public final void c() {
        g();
    }

    public final void d() {
        this.b.setEnabled(false);
    }

    public final void e(c cVar) {
        super.e(cVar);
        g();
    }

    public final void f() {
        this.b.setEnabled(false);
        super.f();
    }
}
