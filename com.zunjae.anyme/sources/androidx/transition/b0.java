package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class b0 implements c0 {
    private final ViewGroupOverlay a;

    b0(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }

    public void c(View view) {
        this.a.add(view);
    }

    public void d(View view) {
        this.a.remove(view);
    }
}
