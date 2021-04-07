package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

class j0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static j0 n;
    private static j0 o;
    private final View e;
    private final CharSequence f;
    private final int g;
    private final Runnable h = new a();
    private final Runnable i = new b();
    private int j;
    private int k;
    private k0 l;
    private boolean m;

    class a implements Runnable {
        a() {
        }

        public void run() {
            j0.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            j0.this.c();
        }
    }

    private j0(View view, CharSequence charSequence) {
        this.e = view;
        this.f = charSequence;
        this.g = p4.c(ViewConfiguration.get(view.getContext()));
        b();
        this.e.setOnLongClickListener(this);
        this.e.setOnHoverListener(this);
    }

    private void a() {
        this.e.removeCallbacks(this.h);
    }

    private void b() {
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
    }

    private void d() {
        this.e.postDelayed(this.h, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(j0 j0Var) {
        j0 j0Var2 = n;
        if (j0Var2 != null) {
            j0Var2.a();
        }
        n = j0Var;
        if (j0Var != null) {
            j0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        j0 j0Var = n;
        if (j0Var != null && j0Var.e == view) {
            e((j0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            j0 j0Var2 = o;
            if (j0Var2 != null && j0Var2.e == view) {
                j0Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new j0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.j) <= this.g && Math.abs(y - this.k) <= this.g) {
            return false;
        }
        this.j = x;
        this.k = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (o == this) {
            o = null;
            k0 k0Var = this.l;
            if (k0Var != null) {
                k0Var.c();
                this.l = null;
                b();
                this.e.removeOnAttachStateChangeListener(this);
            }
        }
        if (n == this) {
            e((j0) null);
        }
        this.e.removeCallbacks(this.i);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        long j2;
        if (o4.N(this.e)) {
            e((j0) null);
            j0 j0Var = o;
            if (j0Var != null) {
                j0Var.c();
            }
            o = this;
            this.m = z;
            k0 k0Var = new k0(this.e.getContext());
            this.l = k0Var;
            k0Var.e(this.e, this.j, this.k, this.m, this.f);
            this.e.addOnAttachStateChangeListener(this);
            if (this.m) {
                j2 = 2500;
            } else {
                j2 = ((o4.H(this.e) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.e.removeCallbacks(this.i);
            this.e.postDelayed(this.i, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.l != null && this.m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.e.isEnabled() && this.l == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.j = view.getWidth() / 2;
        this.k = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
