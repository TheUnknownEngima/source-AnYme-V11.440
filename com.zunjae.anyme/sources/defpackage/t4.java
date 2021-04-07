package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: t4  reason: default package */
public final class t4 {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    /* renamed from: t4$a */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ u4 e;
        final /* synthetic */ View f;

        a(t4 t4Var, u4 u4Var, View view) {
            this.e = u4Var;
            this.f = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.e.a(this.f);
        }

        public void onAnimationEnd(Animator animator) {
            this.e.b(this.f);
        }

        public void onAnimationStart(Animator animator) {
            this.e.c(this.f);
        }
    }

    /* renamed from: t4$b */
    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ w4 e;
        final /* synthetic */ View f;

        b(t4 t4Var, w4 w4Var, View view) {
            this.e = w4Var;
            this.f = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.a(this.f);
        }
    }

    /* renamed from: t4$c */
    static class c implements u4 {
        t4 a;
        boolean b;

        c(t4 t4Var) {
            this.a = t4Var;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            u4 u4Var = tag instanceof u4 ? (u4) tag : null;
            if (u4Var != null) {
                u4Var.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: u4} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                t4 r0 = r3.a
                int r0 = r0.d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                t4 r0 = r3.a
                r0.d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                t4 r0 = r3.a
                java.lang.Runnable r1 = r0.c
                if (r1 == 0) goto L_0x0024
                r0.c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof defpackage.u4
                if (r1 == 0) goto L_0x0031
                r2 = r0
                u4 r2 = (defpackage.u4) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.b(r4)
            L_0x0036:
                r4 = 1
                r3.b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.t4.c.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: u4} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.b = r0
                t4 r0 = r3.a
                int r0 = r0.d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                t4 r0 = r3.a
                java.lang.Runnable r2 = r0.b
                if (r2 == 0) goto L_0x001a
                r0.b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof defpackage.u4
                if (r2 == 0) goto L_0x0027
                r1 = r0
                u4 r1 = (defpackage.u4) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.t4.c.c(android.view.View):void");
        }
    }

    t4(View view) {
        this.a = new WeakReference<>(view);
    }

    private void h(View view, u4 u4Var) {
        if (u4Var != null) {
            view.animate().setListener(new a(this, u4Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public t4 a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public t4 d(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public t4 e(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public t4 f(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public t4 g(u4 u4Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, u4Var);
                u4Var = new c(this);
            }
            h(view, u4Var);
        }
        return this;
    }

    public t4 i(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public t4 j(w4 w4Var) {
        View view = (View) this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (w4Var != null) {
                bVar = new b(this, w4Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void k() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public t4 l(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public t4 m(Runnable runnable) {
        View view = (View) this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withEndAction(runnable);
            } else {
                h(view, new c(this));
                this.c = runnable;
            }
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public t4 n() {
        View view = (View) this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            } else {
                this.d = view.getLayerType();
                h(view, new c(this));
            }
        }
        return this;
    }
}
