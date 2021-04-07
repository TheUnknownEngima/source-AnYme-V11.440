package defpackage;

import android.view.View;

/* renamed from: p60  reason: default package */
final class p60 implements View.OnClickListener {
    private final /* synthetic */ long e;
    private final /* synthetic */ h60 f;

    p60(h60 h60, long j) {
        this.f = h60;
        this.e = j;
    }

    public final void onClick(View view) {
        this.f.H(view, this.e);
    }
}
