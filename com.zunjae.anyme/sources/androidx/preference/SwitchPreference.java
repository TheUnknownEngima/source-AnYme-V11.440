package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {
    private final a Y;
    private CharSequence Z;
    private CharSequence a0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.e(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.W0(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i2.a(context, R$attr.switchPreferenceStyle, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SwitchPreference, i, i2);
        Z0(i2.o(obtainStyledAttributes, R$styleable.SwitchPreference_summaryOn, R$styleable.SwitchPreference_android_summaryOn));
        Y0(i2.o(obtainStyledAttributes, R$styleable.SwitchPreference_summaryOff, R$styleable.SwitchPreference_android_summaryOff));
        d1(i2.o(obtainStyledAttributes, R$styleable.SwitchPreference_switchTextOn, R$styleable.SwitchPreference_android_switchTextOn));
        c1(i2.o(obtainStyledAttributes, R$styleable.SwitchPreference_switchTextOff, R$styleable.SwitchPreference_android_switchTextOff));
        X0(i2.b(obtainStyledAttributes, R$styleable.SwitchPreference_disableDependentsState, R$styleable.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    private void e1(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.T);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.Z);
            switchR.setTextOff(this.a0);
            switchR.setOnCheckedChangeListener(this.Y);
        }
    }

    private void f1(View view) {
        if (((AccessibilityManager) q().getSystemService("accessibility")).isEnabled()) {
            e1(view.findViewById(16908352));
            a1(view.findViewById(16908304));
        }
    }

    public void c0(l lVar) {
        super.c0(lVar);
        e1(lVar.M(16908352));
        b1(lVar);
    }

    public void c1(CharSequence charSequence) {
        this.a0 = charSequence;
        V();
    }

    public void d1(CharSequence charSequence) {
        this.Z = charSequence;
        V();
    }

    /* access modifiers changed from: protected */
    public void t0(View view) {
        super.t0(view);
        f1(view);
    }
}
