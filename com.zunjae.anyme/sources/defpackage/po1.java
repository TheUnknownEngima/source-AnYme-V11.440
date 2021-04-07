package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import androidx.core.content.a;

/* renamed from: po1  reason: default package */
public class po1 {
    private int a = 0;
    private int b = -1;

    public static void c(po1 po1, TextView textView, ColorStateList colorStateList) {
        if (po1 != null && textView != null) {
            po1.b(textView, colorStateList);
        } else if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static void d(po1 po1, Context context, GradientDrawable gradientDrawable) {
        if (po1 != null && gradientDrawable != null) {
            po1.a(context, gradientDrawable);
        } else if (gradientDrawable != null) {
            gradientDrawable.setColor(0);
        }
    }

    public static int g(po1 po1, Context context, int i, int i2) {
        return po1 == null ? to1.m(context, i, i2) : po1.f(context, i, i2);
    }

    public void a(Context context, GradientDrawable gradientDrawable) {
        int i = this.a;
        if (i != 0) {
            gradientDrawable.setColor(i);
            return;
        }
        int i2 = this.b;
        if (i2 != -1) {
            gradientDrawable.setColor(a.d(context, i2));
        }
    }

    public void b(TextView textView, ColorStateList colorStateList) {
        int i = this.a;
        if (i != 0) {
            textView.setTextColor(i);
        } else if (this.b != -1) {
            textView.setTextColor(a.d(textView.getContext(), this.b));
        } else if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public int e(Context context) {
        int i;
        if (this.a == 0 && (i = this.b) != -1) {
            this.a = a.d(context, i);
        }
        return this.a;
    }

    public int f(Context context, int i, int i2) {
        int e = e(context);
        return e == 0 ? to1.m(context, i, i2) : e;
    }

    public void h(int i) {
        this.a = i;
    }

    public void i(int i) {
        this.b = i;
    }
}
