package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class h implements f {
    private static Class<?> f;
    private static boolean g;
    private static Method h;
    private static boolean i;
    private static Method j;
    private static boolean k;
    private final View e;

    private h(View view) {
        this.e = view;
    }

    static f b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = h;
        if (method != null) {
            try {
                return new h((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (!i) {
            try {
                d();
                Method declaredMethod = f.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                h = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            i = true;
        }
    }

    private static void d() {
        if (!g) {
            try {
                f = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            g = true;
        }
    }

    private static void e() {
        if (!k) {
            try {
                d();
                Method declaredMethod = f.getDeclaredMethod("removeGhost", new Class[]{View.class});
                j = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            k = true;
        }
    }

    static void f(View view) {
        e();
        Method method = j;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i2) {
        this.e.setVisibility(i2);
    }
}
