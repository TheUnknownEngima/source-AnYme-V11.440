package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;

class a extends e {
    /* access modifiers changed from: private */
    public final TextWatcher d = new C0105a();
    /* access modifiers changed from: private */
    public final View.OnFocusChangeListener e = new b();
    private final TextInputLayout.f f = new c();
    private final TextInputLayout.g g = new d();
    private AnimatorSet h;
    private ValueAnimator i;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    class C0105a implements TextWatcher {
        C0105a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() == null) {
                a.this.i(a.l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            a aVar = a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.i(z2);
        }
    }

    class c implements TextInputLayout.f {
        c() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.e);
            editText.removeTextChangedListener(a.this.d);
            editText.addTextChangedListener(a.this.d);
        }
    }

    class d implements TextInputLayout.g {
        d() {
        }

        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.removeTextChangedListener(a.this.d);
                if (editText.getOnFocusChangeListener() == a.this.e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            Editable text = a.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.a.U();
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.a.setEndIconVisible(true);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.a.setEndIconVisible(false);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.c.setScaleX(floatValue);
            a.this.c.setScaleY(floatValue);
        }
    }

    a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    public void i(boolean z) {
        boolean z2 = this.a.J() == z;
        if (z) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
                return;
            }
            return;
        }
        this.h.cancel();
        this.i.start();
        if (z2) {
            this.i.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f91.a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(f91.d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    private void m() {
        ValueAnimator k = k();
        ValueAnimator j = j(Utils.FLOAT_EPSILON, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.h.addListener(new f());
        ValueAnimator j2 = j(1.0f, Utils.FLOAT_EPSILON);
        this.i = j2;
        j2.addListener(new g());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.a.setEndIconDrawable(defpackage.f.d(this.b, R$drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new e());
        this.a.e(this.f);
        this.a.f(this.g);
        m();
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        if (this.a.getSuffixText() != null) {
            i(z);
        }
    }
}
