package defpackage;

import android.view.View;

/* renamed from: q60  reason: default package */
final class q60 implements View.OnClickListener {
    private final /* synthetic */ long e;
    private final /* synthetic */ h60 f;

    q60(h60 h60, long j) {
        this.f = h60;
        this.e = j;
    }

    public final void onClick(View view) {
        this.f.E(view, this.e);
    }
}
