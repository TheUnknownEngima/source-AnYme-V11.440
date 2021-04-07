package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.r;

/* renamed from: sa1  reason: default package */
public class sa1 {
    static na1 a(int i) {
        return i != 0 ? i != 1 ? b() : new oa1() : new va1();
    }

    static na1 b() {
        return new va1();
    }

    static pa1 c() {
        return new pa1();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof ra1) {
            ((ra1) background).X(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof ra1) {
            f(view, (ra1) background);
        }
    }

    public static void f(View view, ra1 ra1) {
        if (ra1.P()) {
            ra1.c0(r.g(view));
        }
    }
}
