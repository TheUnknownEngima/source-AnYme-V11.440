package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.content.a;
import defpackage.a5;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i2.a(context, R$attr.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public boolean Q() {
        return false;
    }

    public boolean Q0() {
        return !super.Q();
    }

    public void c0(l lVar) {
        TextView textView;
        super.c0(lVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            lVar.e.setAccessibilityHeading(true);
        } else if (i < 21) {
            TypedValue typedValue = new TypedValue();
            if (q().getTheme().resolveAttribute(R$attr.colorAccent, typedValue, true) && (textView = (TextView) lVar.M(16908310)) != null && textView.getCurrentTextColor() == a.d(q(), R$color.preference_fallback_accent_color)) {
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Deprecated
    public void h0(a5 a5Var) {
        a5.c r;
        super.h0(a5Var);
        if (Build.VERSION.SDK_INT < 28 && (r = a5Var.r()) != null) {
            a5Var.g0(a5.c.f(r.c(), r.d(), r.a(), r.b(), true, r.e()));
        }
    }
}
