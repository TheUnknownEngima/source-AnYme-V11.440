package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

class i0 {
    private static final o0 a;
    static final Property<View, Float> b = new a(Float.class, "translationAlpha");
    static final Property<View, Rect> c = new b(Rect.class, "clipBounds");

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(i0.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            i0.h(view, f.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return o4.r(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            o4.o0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 29 ? new n0() : i >= 23 ? new m0() : i >= 22 ? new l0() : i >= 21 ? new k0() : i >= 19 ? new j0() : new o0();
    }

    static void a(View view) {
        a.a(view);
    }

    static h0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new g0(view) : f0.e(view);
    }

    static float c(View view) {
        return a.c(view);
    }

    static s0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new r0(view) : new q0(view.getWindowToken());
    }

    static void e(View view) {
        a.d(view);
    }

    static void f(View view, Matrix matrix) {
        a.e(view, matrix);
    }

    static void g(View view, int i, int i2, int i3, int i4) {
        a.f(view, i, i2, i3, i4);
    }

    static void h(View view, float f) {
        a.g(view, f);
    }

    static void i(View view, int i) {
        a.h(view, i);
    }

    static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }

    static void k(View view, Matrix matrix) {
        a.j(view, matrix);
    }
}
