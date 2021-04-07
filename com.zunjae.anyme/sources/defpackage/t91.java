package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* renamed from: t91  reason: default package */
public class t91 {
    public static int a(int i, int i2) {
        return j2.m(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(Context context, int i, int i2) {
        TypedValue a = ba1.a(context, i);
        return a != null ? a.data : i2;
    }

    public static int c(Context context, int i, String str) {
        return ba1.c(context, i, str);
    }

    public static int d(View view, int i) {
        return ba1.d(view, i);
    }

    public static int e(View view, int i, int i2) {
        return b(view.getContext(), i, i2);
    }

    public static int f(int i, int i2) {
        return j2.i(i2, i);
    }

    public static int g(int i, int i2, float f) {
        return f(i, j2.m(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    public static int h(View view, int i, int i2, float f) {
        return g(d(view, i), d(view, i2), f);
    }
}
