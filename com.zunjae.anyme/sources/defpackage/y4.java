package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: y4  reason: default package */
public final class y4 extends ClickableSpan {
    private final int e;
    private final a5 f;
    private final int g;

    public y4(int i, a5 a5Var, int i2) {
        this.e = i;
        this.f = a5Var;
        this.g = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.e);
        this.f.S(this.g, bundle);
    }
}
