package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.a;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$drawable;
import java.lang.reflect.Field;

@SuppressLint({"PrivateResource"})
public class c {
    private static ColorStateList a(Context context, int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{x8.l(context, R$attr.colorControlNormal), x8.l(context, R$attr.colorControlNormal), i});
    }

    private static void b(EditText editText, int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {a.f(editText.getContext(), i2), a.f(editText.getContext(), i2)};
            drawableArr[0].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e) {
            "Device issue with cursor tinting: " + e.getMessage();
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void c(CheckBox checkBox, int i) {
        int d = x8.d(checkBox.getContext());
        d(checkBox, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{x8.l(checkBox.getContext(), R$attr.colorControlNormal), i, d, d}));
    }

    public static void d(CheckBox checkBox, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable r = androidx.core.graphics.drawable.a.r(a.f(checkBox.getContext(), R$drawable.abc_btn_check_material));
        androidx.core.graphics.drawable.a.o(r, colorStateList);
        checkBox.setButtonDrawable(r);
    }

    public static void e(EditText editText, int i) {
        ColorStateList a = a(editText.getContext(), i);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(a);
        } else if (Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(a);
        }
        b(editText, i);
    }

    public static void f(ProgressBar progressBar, int i) {
        g(progressBar, i, false);
    }

    private static void g(ProgressBar progressBar, int i, boolean z) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (Build.VERSION.SDK_INT >= 21) {
            progressBar.setProgressTintList(valueOf);
            progressBar.setSecondaryProgressTintList(valueOf);
            if (!z) {
                progressBar.setIndeterminateTintList(valueOf);
                return;
            }
            return;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (Build.VERSION.SDK_INT <= 10) {
            mode = PorterDuff.Mode.MULTIPLY;
        }
        if (!z && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(i, mode);
        }
        if (progressBar.getProgressDrawable() != null) {
            progressBar.getProgressDrawable().setColorFilter(i, mode);
        }
    }

    public static void h(RadioButton radioButton, int i) {
        int d = x8.d(radioButton.getContext());
        i(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{x8.l(radioButton.getContext(), R$attr.colorControlNormal), i, d, d}));
    }

    public static void i(RadioButton radioButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable r = androidx.core.graphics.drawable.a.r(a.f(radioButton.getContext(), R$drawable.abc_btn_radio_material));
        androidx.core.graphics.drawable.a.o(r, colorStateList);
        radioButton.setButtonDrawable(r);
    }
}
