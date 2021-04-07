package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
    private CharSequence T;
    private CharSequence U;
    private Drawable V;
    private CharSequence W;
    private CharSequence X;
    private int Y;

    public interface a {
        <T extends Preference> T b(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i2.a(context, R$attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DialogPreference, i, i2);
        String o = i2.o(obtainStyledAttributes, R$styleable.DialogPreference_dialogTitle, R$styleable.DialogPreference_android_dialogTitle);
        this.T = o;
        if (o == null) {
            this.T = M();
        }
        this.U = i2.o(obtainStyledAttributes, R$styleable.DialogPreference_dialogMessage, R$styleable.DialogPreference_android_dialogMessage);
        this.V = i2.c(obtainStyledAttributes, R$styleable.DialogPreference_dialogIcon, R$styleable.DialogPreference_android_dialogIcon);
        this.W = i2.o(obtainStyledAttributes, R$styleable.DialogPreference_positiveButtonText, R$styleable.DialogPreference_android_positiveButtonText);
        this.X = i2.o(obtainStyledAttributes, R$styleable.DialogPreference_negativeButtonText, R$styleable.DialogPreference_android_negativeButtonText);
        this.Y = i2.n(obtainStyledAttributes, R$styleable.DialogPreference_dialogLayout, R$styleable.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    public Drawable V0() {
        return this.V;
    }

    public int W0() {
        return this.Y;
    }

    public CharSequence X0() {
        return this.U;
    }

    public CharSequence Y0() {
        return this.T;
    }

    public CharSequence Z0() {
        return this.X;
    }

    public CharSequence a1() {
        return this.W;
    }

    /* access modifiers changed from: protected */
    public void d0() {
        I().s(this);
    }
}
