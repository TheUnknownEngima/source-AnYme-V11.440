package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.internal.l;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.wa1;

class d extends e {
    /* access modifiers changed from: private */
    public static final boolean q = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */
    public final TextWatcher d = new a();
    /* access modifiers changed from: private */
    public final View.OnFocusChangeListener e = new c();
    /* access modifiers changed from: private */
    public final TextInputLayout.e f = new C0107d(this.a);
    private final TextInputLayout.f g = new e();
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.g h = new f();
    /* access modifiers changed from: private */
    public boolean i = false;
    /* access modifiers changed from: private */
    public boolean j = false;
    /* access modifiers changed from: private */
    public long k = Long.MAX_VALUE;
    private StateListDrawable l;
    private ra1 m;
    /* access modifiers changed from: private */
    public AccessibilityManager n;
    private ValueAnimator o;
    /* access modifiers changed from: private */
    public ValueAnimator p;

    class a extends l {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        class C0106a implements Runnable {
            final /* synthetic */ AutoCompleteTextView e;

            C0106a(AutoCompleteTextView autoCompleteTextView) {
                this.e = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.e.isPopupShowing();
                d.this.C(isPopupShowing);
                boolean unused = d.this.i = isPopupShowing;
            }
        }

        a() {
        }

        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView e2 = dVar.x(dVar.a.getEditText());
            e2.post(new C0106a(e2));
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements View.OnFocusChangeListener {
        c() {
        }

        public void onFocusChange(View view, boolean z) {
            d.this.a.setEndIconActivated(z);
            if (!z) {
                d.this.C(false);
                boolean unused = d.this.i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    class C0107d extends TextInputLayout.e {
        C0107d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            if (d.this.a.getEditText().getKeyListener() == null) {
                a5Var.d0(Spinner.class.getName());
            }
            if (a5Var.N()) {
                a5Var.o0((CharSequence) null);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView e2 = dVar.x(dVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.n.isTouchExplorationEnabled()) {
                d.this.F(e2);
            }
        }
    }

    class e implements TextInputLayout.f {
        e() {
        }

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e = d.this.x(textInputLayout.getEditText());
            d.this.D(e);
            d.this.u(e);
            d.this.E(e);
            e.setThreshold(0);
            e.removeTextChangedListener(d.this.d);
            e.addTextChangedListener(d.this.d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class f implements TextInputLayout.g {
        f() {
        }

        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.removeTextChangedListener(d.this.d);
                if (autoCompleteTextView.getOnFocusChangeListener() == d.this.e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (d.q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        public void onClick(View view) {
            d.this.F((AutoCompleteTextView) d.this.a.getEditText());
        }
    }

    class h implements View.OnTouchListener {
        final /* synthetic */ AutoCompleteTextView e;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.e = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.B()) {
                    boolean unused = d.this.i = false;
                }
                d.this.F(this.e);
            }
            return false;
        }
    }

    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        public void onDismiss() {
            boolean unused = d.this.i = true;
            long unused2 = d.this.k = System.currentTimeMillis();
            d.this.C(false);
        }
    }

    class j extends AnimatorListenerAdapter {
        j() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.c.setChecked(dVar.j);
            d.this.p.start();
        }
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private void A() {
        this.p = y(67, Utils.FLOAT_EPSILON, 1.0f);
        ValueAnimator y = y(50, 1.0f, Utils.FLOAT_EPSILON);
        this.o = y;
        y.addListener(new j());
    }

    /* access modifiers changed from: private */
    public boolean B() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    public void C(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }

    /* access modifiers changed from: private */
    public void D(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (q) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.m;
            } else if (boxBackgroundMode == 1) {
                drawable = this.l;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void E(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.e);
        if (q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* access modifiers changed from: private */
    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (B()) {
                this.i = false;
            }
            if (!this.i) {
                if (q) {
                    C(!this.j);
                } else {
                    this.j = !this.j;
                    this.c.toggle();
                }
                if (this.j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.i = false;
        }
    }

    /* access modifiers changed from: private */
    public void u(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            ra1 boxBackground = this.a.getBoxBackground();
            int d2 = t91.d(autoCompleteTextView, R$attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                w(autoCompleteTextView, d2, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                v(autoCompleteTextView, d2, iArr, boxBackground);
            }
        }
    }

    private void v(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, ra1 ra1) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {t91.g(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (q) {
            o4.l0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), ra1, ra1));
            return;
        }
        ra1 ra12 = new ra1(ra1.D());
        ra12.Y(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{ra1, ra12});
        int D = o4.D(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int C = o4.C(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        o4.l0(autoCompleteTextView, layerDrawable);
        o4.w0(autoCompleteTextView, D, paddingTop, C, paddingBottom);
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, ra1 ra1) {
        LayerDrawable layerDrawable;
        int d2 = t91.d(autoCompleteTextView, R$attr.colorSurface);
        ra1 ra12 = new ra1(ra1.D());
        int g2 = t91.g(i2, d2, 0.1f);
        ra12.Y(new ColorStateList(iArr, new int[]{g2, 0}));
        if (q) {
            ra12.setTint(d2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{g2, d2});
            ra1 ra13 = new ra1(ra1.D());
            ra13.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ra12, ra13), ra1});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{ra12, ra1});
        }
        o4.l0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    public AutoCompleteTextView x(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator y(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f91.a);
        ofFloat.setDuration((long) i2);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ra1 z(float f2, float f3, float f4, int i2) {
        wa1.b a2 = wa1.a();
        a2.E(f2);
        a2.I(f2);
        a2.v(f3);
        a2.z(f3);
        wa1 m2 = a2.m();
        ra1 m3 = ra1.m(this.b, f4);
        m3.setShapeAppearanceModel(m2);
        m3.a0(0, i2, 0, i2);
        return m3;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float dimensionPixelOffset = (float) this.b.getResources().getDimensionPixelOffset(R$dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.b.getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ra1 z = z(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        ra1 z2 = z(Utils.FLOAT_EPSILON, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, z);
        this.l.addState(new int[0], z2);
        this.a.setEndIconDrawable(defpackage.f.d(this.b, q ? R$drawable.mtrl_dropdown_arrow : R$drawable.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new g());
        this.a.e(this.g);
        this.a.f(this.h);
        A();
        o4.s0(this.c, 2);
        this.n = (AccessibilityManager) this.b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        return i2 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return true;
    }
}
