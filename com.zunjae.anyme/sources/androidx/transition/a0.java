package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

class a0 extends f0 implements c0 {
    a0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static a0 g(ViewGroup viewGroup) {
        return (a0) f0.e(viewGroup);
    }

    public void c(View view) {
        this.a.b(view);
    }

    public void d(View view) {
        this.a.g(view);
    }
}
