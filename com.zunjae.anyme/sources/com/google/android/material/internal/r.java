package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$styleable;

public class r {

    static class a implements d {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ d d;

        a(boolean z, boolean z2, boolean z3, d dVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = dVar;
        }

        public x4 a(View view, x4 x4Var, e eVar) {
            if (this.a) {
                eVar.d += x4Var.c();
            }
            boolean h = r.h(view);
            if (this.b) {
                if (h) {
                    eVar.c += x4Var.d();
                } else {
                    eVar.a += x4Var.d();
                }
            }
            if (this.c) {
                if (h) {
                    eVar.a += x4Var.e();
                } else {
                    eVar.c += x4Var.e();
                }
            }
            eVar.a(view);
            d dVar = this.d;
            return dVar != null ? dVar.a(view, x4Var, eVar) : x4Var;
        }
    }

    static class b implements k4 {
        final /* synthetic */ d a;
        final /* synthetic */ e b;

        b(d dVar, e eVar) {
            this.a = dVar;
            this.b = eVar;
        }

        public x4 a(View view, x4 x4Var) {
            return this.a.a(view, x4Var, new e(this.b));
        }
    }

    static class c implements View.OnAttachStateChangeListener {
        c() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            o4.g0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        x4 a(View view, x4 x4Var, e eVar);
    }

    public static class e {
        public int a;
        public int b;
        public int c;
        public int d;

        public e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public e(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
        }

        public void a(View view) {
            o4.w0(view, this.a, this.b, this.c, this.d);
        }
    }

    public static void a(View view, AttributeSet attributeSet, int i, int i2, d dVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R$styleable.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(R$styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(R$styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(R$styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        b(view, new a(z, z2, z3, dVar));
    }

    public static void b(View view, d dVar) {
        o4.v0(view, new b(dVar, new e(o4.D(view), view.getPaddingTop(), o4.C(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static q e(View view) {
        return f(d(view));
    }

    public static q f(View view) {
        if (view == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 18 ? new p(view) : o.c(view);
    }

    public static float g(View view) {
        float f = Utils.FLOAT_EPSILON;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += o4.t((View) parent);
        }
        return f;
    }

    public static boolean h(View view) {
        return o4.y(view) == 1;
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (o4.N(view)) {
            o4.g0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }
}
