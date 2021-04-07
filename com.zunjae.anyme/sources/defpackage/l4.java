package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: l4  reason: default package */
public final class l4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View e;
    private ViewTreeObserver f;
    private final Runnable g;

    private l4(View view, Runnable runnable) {
        this.e = view;
        this.f = view.getViewTreeObserver();
        this.g = runnable;
    }

    public static l4 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            l4 l4Var = new l4(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(l4Var);
            view.addOnAttachStateChangeListener(l4Var);
            return l4Var;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        (this.f.isAlive() ? this.f : this.e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.e.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
