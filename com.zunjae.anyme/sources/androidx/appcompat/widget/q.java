package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import androidx.core.graphics.drawable.c;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedAPI"})
public class q {
    private static final int[] a = {16842912};
    private static final int[] b = new int[0];
    public static final Rect c = new Rect();
    private static Class<?> d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static boolean a(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a2)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof c) {
            drawable2 = ((c) drawable).b();
        } else if (drawable instanceof i) {
            drawable2 = ((i) drawable).a();
        } else if (!(drawable instanceof ScaleDrawable)) {
            return true;
        } else {
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return a(drawable2);
    }

    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(a);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (d != null) {
            try {
                Drawable q = a.q(drawable);
                Object invoke = q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : d.getFields()) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c2 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c2 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c2 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return c;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
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
}
