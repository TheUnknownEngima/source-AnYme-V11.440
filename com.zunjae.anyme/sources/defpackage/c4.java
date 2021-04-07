package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: c4  reason: default package */
public final class c4 {
    public static x3 a(MenuItem menuItem) {
        if (menuItem instanceof w2) {
            return ((w2) menuItem).b();
        }
        return null;
    }

    public static MenuItem b(MenuItem menuItem, x3 x3Var) {
        return menuItem instanceof w2 ? ((w2) menuItem).a(x3Var) : menuItem;
    }

    public static void c(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof w2) {
            ((w2) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static void d(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof w2) {
            ((w2) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void e(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof w2) {
            ((w2) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void f(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof w2) {
            ((w2) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void g(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof w2) {
            ((w2) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void h(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof w2) {
            ((w2) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
