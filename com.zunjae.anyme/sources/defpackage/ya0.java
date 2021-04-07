package defpackage;

import android.widget.TextView;
import com.google.android.gms.cast.framework.R$string;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;

/* renamed from: ya0  reason: default package */
public final class ya0 extends g60 implements i.e {
    private final TextView b;
    private final i60 c;

    public ya0(TextView textView, i60 i60) {
        this.b = textView;
        this.c = i60;
        g();
    }

    private final void g() {
        i b2 = b();
        if (b2 == null || !b2.o()) {
            TextView textView = this.b;
            textView.setText(textView.getContext().getString(R$string.cast_invalid_stream_duration_text));
        } else if (!b2.q() || this.c.m() != null) {
            this.b.setVisibility(0);
            TextView textView2 = this.b;
            i60 i60 = this.c;
            textView2.setText(i60.q(i60.s(i60.a())));
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void a(long j, long j2) {
        g();
    }

    public final void c() {
        g();
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
        super.f();
        g();
    }
}
