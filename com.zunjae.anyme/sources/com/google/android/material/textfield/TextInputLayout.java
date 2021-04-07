package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.q;
import androidx.core.widget.i;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    private static final int M0 = R$style.Widget_Design_TextInputLayout;
    private CharSequence A;
    private ColorStateList A0;
    private final TextView B;
    private int B0;
    private boolean C;
    private int C0;
    private CharSequence D;
    private int D0;
    private boolean E;
    private int E0;
    private ra1 F;
    private int F0;
    private ra1 G;
    private boolean G0;
    private wa1 H;
    final com.google.android.material.internal.a H0;
    private final int I;
    private boolean I0;
    private int J;
    private ValueAnimator J0;
    private final int K;
    private boolean K0;
    private int L;
    /* access modifiers changed from: private */
    public boolean L0;
    private int M;
    private int N;
    private int O;
    private int P;
    private final Rect Q;
    private final Rect R;
    private final RectF S;
    private Typeface T;
    private final CheckableImageButton U;
    private ColorStateList V;
    private boolean W;
    private PorterDuff.Mode a0;
    private boolean b0;
    private Drawable c0;
    private int d0;
    private final FrameLayout e;
    private View.OnLongClickListener e0;
    private final LinearLayout f;
    private final LinkedHashSet<f> f0;
    private final LinearLayout g;
    private int g0;
    private final FrameLayout h;
    private final SparseArray<e> h0;
    EditText i;
    /* access modifiers changed from: private */
    public final CheckableImageButton i0;
    private CharSequence j;
    private final LinkedHashSet<g> j0;
    private final f k;
    private ColorStateList k0;
    boolean l;
    private boolean l0;
    private int m;
    private PorterDuff.Mode m0;
    private boolean n;
    private boolean n0;
    private TextView o;
    private Drawable o0;
    private int p;
    private int p0;
    private int q;
    private Drawable q0;
    private CharSequence r;
    private View.OnLongClickListener r0;
    /* access modifiers changed from: private */
    public boolean s;
    private View.OnLongClickListener s0;
    private TextView t;
    private final CheckableImageButton t0;
    private ColorStateList u;
    private ColorStateList u0;
    private int v;
    private ColorStateList v0;
    private ColorStateList w;
    private ColorStateList w0;
    private ColorStateList x;
    private int x0;
    private CharSequence y;
    private int y0;
    private final TextView z;
    private int z0;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s0(!textInputLayout.L0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.l) {
                textInputLayout2.l0(editable.length());
            }
            if (TextInputLayout.this.s) {
                TextInputLayout.this.w0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.i0.performClick();
            TextInputLayout.this.i0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            TextInputLayout.this.i.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.H0.d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends w3 {
        private final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            EditText editText = this.d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                a5Var.E0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                a5Var.E0(charSequence);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a5Var.o0(charSequence);
                } else {
                    if (z) {
                        charSequence = text + ", " + charSequence;
                    }
                    a5Var.E0(charSequence);
                }
                a5Var.B0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            a5Var.q0(counterMaxLength);
            if (z4) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                a5Var.k0(error);
            }
            if (Build.VERSION.SDK_INT >= 17 && editText != null) {
                editText.setLabelFor(R$id.textinput_helper_text);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    static class h extends j5 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        CharSequence g;
        boolean h;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = parcel.readInt() != 1 ? false : true;
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.g + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r1 = M0
            r2 = r21
            android.content.Context r1 = defpackage.bb1.c(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.k = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.Q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.R = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.S = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f0 = r1
            r9 = 0
            r0.g0 = r9
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.h0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.j0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.H0 = r1
            android.content.Context r10 = r20.getContext()
            r11 = 1
            r0.setOrientation(r11)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.e = r1
            r1.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = r0.e
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.f = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.f
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r12 = -2
            r13 = -1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.e
            android.widget.LinearLayout r2 = r0.f
            r1.addView(r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.g = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.g
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388613(0x800005, float:1.175495E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.e
            android.widget.LinearLayout r2 = r0.g
            r1.addView(r2)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.h = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r13)
            r1.setLayoutParams(r2)
            com.google.android.material.internal.a r1 = r0.H0
            android.animation.TimeInterpolator r2 = defpackage.f91.a
            r1.j0(r2)
            com.google.android.material.internal.a r1 = r0.H0
            android.animation.TimeInterpolator r2 = defpackage.f91.a
            r1.g0(r2)
            com.google.android.material.internal.a r1 = r0.H0
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.R(r2)
            int[] r3 = com.google.android.material.R$styleable.TextInputLayout
            int r5 = M0
            r1 = 5
            int[] r6 = new int[r1]
            int r1 = com.google.android.material.R$styleable.TextInputLayout_counterTextAppearance
            r6[r9] = r1
            int r1 = com.google.android.material.R$styleable.TextInputLayout_counterOverflowTextAppearance
            r6[r11] = r1
            int r1 = com.google.android.material.R$styleable.TextInputLayout_errorTextAppearance
            r14 = 2
            r6[r14] = r1
            int r1 = com.google.android.material.R$styleable.TextInputLayout_helperTextTextAppearance
            r15 = 3
            r6[r15] = r1
            int r1 = com.google.android.material.R$styleable.TextInputLayout_hintTextAppearance
            r2 = 4
            r6[r2] = r1
            r1 = r10
            r2 = r22
            r4 = r23
            androidx.appcompat.widget.g0 r1 = com.google.android.material.internal.m.i(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R$styleable.TextInputLayout_hintEnabled
            boolean r2 = r1.a(r2, r11)
            r0.C = r2
            int r2 = com.google.android.material.R$styleable.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setHint(r2)
            int r2 = com.google.android.material.R$styleable.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.a(r2, r11)
            r0.I0 = r2
            int r2 = M0
            wa1$b r2 = defpackage.wa1.e(r10, r7, r8, r2)
            wa1 r2 = r2.m()
            r0.H = r2
            android.content.res.Resources r2 = r10.getResources()
            int r3 = com.google.android.material.R$dimen.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.I = r2
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.e(r2, r9)
            r0.K = r2
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r10.getResources()
            int r4 = com.google.android.material.R$dimen.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.M = r2
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r10.getResources()
            int r4 = com.google.android.material.R$dimen.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.N = r2
            int r2 = r0.M
            r0.L = r2
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.d(r2, r3)
            int r4 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.d(r4, r3)
            int r5 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.d(r5, r3)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.d(r6, r3)
            wa1 r6 = r0.H
            wa1$b r6 = r6.v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x017c
            r6.E(r2)
        L_0x017c:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0183
            r6.I(r4)
        L_0x0183:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x018a
            r6.z(r5)
        L_0x018a:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0191
            r6.v(r3)
        L_0x0191:
            wa1 r2 = r6.m()
            r0.H = r2
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = defpackage.ca1.b(r10, r1, r2)
            if (r2 == 0) goto L_0x01f1
            int r3 = r2.getDefaultColor()
            r0.B0 = r3
            r0.P = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01cf
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.C0 = r3
            int[] r3 = new int[r14]
            r3 = {16842908, 16842910} // fill-array
            int r3 = r2.getColorForState(r3, r13)
            r0.D0 = r3
            int[] r3 = new int[r14]
            r3 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r3, r13)
            goto L_0x01ee
        L_0x01cf:
            int r2 = r0.B0
            r0.D0 = r2
            int r2 = com.google.android.material.R$color.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = defpackage.f.c(r10, r2)
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.C0 = r3
            int[] r3 = new int[r11]
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r3[r9] = r4
            int r2 = r2.getColorForState(r3, r13)
        L_0x01ee:
            r0.E0 = r2
            goto L_0x01fb
        L_0x01f1:
            r0.P = r9
            r0.B0 = r9
            r0.C0 = r9
            r0.D0 = r9
            r0.E0 = r9
        L_0x01fb:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_android_textColorHint
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x020d
            int r2 = com.google.android.material.R$styleable.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.w0 = r2
            r0.v0 = r2
        L_0x020d:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = defpackage.ca1.b(r10, r1, r2)
            int r3 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeColor
            int r3 = r1.b(r3, r9)
            r0.z0 = r3
            int r3 = com.google.android.material.R$color.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.a.d(r10, r3)
            r0.x0 = r3
            int r3 = com.google.android.material.R$color.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.a.d(r10, r3)
            r0.F0 = r3
            int r3 = com.google.android.material.R$color.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.a.d(r10, r3)
            r0.y0 = r3
            if (r2 == 0) goto L_0x0238
            r0.setBoxStrokeColorStateList(r2)
        L_0x0238:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeErrorColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x0249
            int r2 = com.google.android.material.R$styleable.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r2 = defpackage.ca1.b(r10, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0249:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_hintTextAppearance
            int r2 = r1.n(r2, r13)
            if (r2 == r13) goto L_0x025a
            int r2 = com.google.android.material.R$styleable.TextInputLayout_hintTextAppearance
            int r2 = r1.n(r2, r9)
            r0.setHintTextAppearance(r2)
        L_0x025a:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_errorTextAppearance
            int r2 = r1.n(r2, r9)
            int r3 = com.google.android.material.R$styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r3 = r1.p(r3)
            int r4 = com.google.android.material.R$styleable.TextInputLayout_errorEnabled
            boolean r4 = r1.a(r4, r9)
            android.content.Context r5 = r20.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r6 = com.google.android.material.R$layout.design_text_input_end_icon
            android.widget.LinearLayout r7 = r0.g
            android.view.View r5 = r5.inflate(r6, r7, r9)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.t0 = r5
            r6 = 8
            r5.setVisibility(r6)
            int r5 = com.google.android.material.R$styleable.TextInputLayout_errorIconDrawable
            boolean r5 = r1.r(r5)
            if (r5 == 0) goto L_0x0296
            int r5 = com.google.android.material.R$styleable.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r5 = r1.g(r5)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r5)
        L_0x0296:
            int r5 = com.google.android.material.R$styleable.TextInputLayout_errorIconTint
            boolean r5 = r1.r(r5)
            if (r5 == 0) goto L_0x02a7
            int r5 = com.google.android.material.R$styleable.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r5 = defpackage.ca1.b(r10, r1, r5)
            r0.setErrorIconTintList(r5)
        L_0x02a7:
            int r5 = com.google.android.material.R$styleable.TextInputLayout_errorIconTintMode
            boolean r5 = r1.r(r5)
            r7 = 0
            if (r5 == 0) goto L_0x02bd
            int r5 = com.google.android.material.R$styleable.TextInputLayout_errorIconTintMode
            int r5 = r1.k(r5, r13)
            android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.r.i(r5, r7)
            r0.setErrorIconTintMode(r5)
        L_0x02bd:
            com.google.android.material.internal.CheckableImageButton r5 = r0.t0
            android.content.res.Resources r8 = r20.getResources()
            int r12 = com.google.android.material.R$string.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r12)
            r5.setContentDescription(r8)
            com.google.android.material.internal.CheckableImageButton r5 = r0.t0
            defpackage.o4.s0(r5, r14)
            com.google.android.material.internal.CheckableImageButton r5 = r0.t0
            r5.setClickable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.t0
            r5.setPressable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.t0
            r5.setFocusable(r9)
            int r5 = com.google.android.material.R$styleable.TextInputLayout_helperTextTextAppearance
            int r5 = r1.n(r5, r9)
            int r8 = com.google.android.material.R$styleable.TextInputLayout_helperTextEnabled
            boolean r8 = r1.a(r8, r9)
            int r12 = com.google.android.material.R$styleable.TextInputLayout_helperText
            java.lang.CharSequence r12 = r1.p(r12)
            int r15 = com.google.android.material.R$styleable.TextInputLayout_placeholderTextAppearance
            int r15 = r1.n(r15, r9)
            int r14 = com.google.android.material.R$styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r14 = r1.p(r14)
            int r11 = com.google.android.material.R$styleable.TextInputLayout_prefixTextAppearance
            int r11 = r1.n(r11, r9)
            int r7 = com.google.android.material.R$styleable.TextInputLayout_prefixText
            java.lang.CharSequence r7 = r1.p(r7)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_suffixTextAppearance
            int r6 = r1.n(r6, r9)
            int r13 = com.google.android.material.R$styleable.TextInputLayout_suffixText
            java.lang.CharSequence r13 = r1.p(r13)
            r16 = r6
            int r6 = com.google.android.material.R$styleable.TextInputLayout_counterEnabled
            boolean r6 = r1.a(r6, r9)
            int r9 = com.google.android.material.R$styleable.TextInputLayout_counterMaxLength
            r17 = r6
            r6 = -1
            int r9 = r1.k(r9, r6)
            r0.setCounterMaxLength(r9)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_counterTextAppearance
            r9 = 0
            int r6 = r1.n(r6, r9)
            r0.q = r6
            int r6 = com.google.android.material.R$styleable.TextInputLayout_counterOverflowTextAppearance
            int r6 = r1.n(r6, r9)
            r0.p = r6
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r18 = r13
            int r13 = com.google.android.material.R$layout.design_text_input_start_icon
            r19 = r11
            android.widget.LinearLayout r11 = r0.f
            android.view.View r6 = r6.inflate(r13, r11, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.U = r6
            r9 = 8
            r6.setVisibility(r9)
            r6 = 0
            r0.setStartIconOnClickListener(r6)
            r0.setStartIconOnLongClickListener(r6)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconDrawable
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x038b
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r6 = r1.g(r6)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconContentDescription
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x0381
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r6 = r1.p(r6)
            r0.setStartIconContentDescription((java.lang.CharSequence) r6)
        L_0x0381:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconCheckable
            r9 = 1
            boolean r6 = r1.a(r6, r9)
            r0.setStartIconCheckable(r6)
        L_0x038b:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconTint
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x039c
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconTint
            android.content.res.ColorStateList r6 = defpackage.ca1.b(r10, r1, r6)
            r0.setStartIconTintList(r6)
        L_0x039c:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconTintMode
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x03b3
            int r6 = com.google.android.material.R$styleable.TextInputLayout_startIconTintMode
            r9 = -1
            int r6 = r1.k(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.r.i(r6, r9)
            r0.setStartIconTintMode(r6)
        L_0x03b3:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_boxBackgroundMode
            r9 = 0
            int r6 = r1.k(r6, r9)
            r0.setBoxBackgroundMode(r6)
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r11 = com.google.android.material.R$layout.design_text_input_end_icon
            android.widget.FrameLayout r13 = r0.h
            android.view.View r6 = r6.inflate(r11, r13, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.i0 = r6
            android.widget.FrameLayout r9 = r0.h
            r9.addView(r6)
            com.google.android.material.internal.CheckableImageButton r6 = r0.i0
            r9 = 8
            r6.setVisibility(r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.h0
            com.google.android.material.textfield.b r9 = new com.google.android.material.textfield.b
            r9.<init>(r0)
            r11 = -1
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.h0
            com.google.android.material.textfield.g r9 = new com.google.android.material.textfield.g
            r9.<init>(r0)
            r11 = 0
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.h0
            com.google.android.material.textfield.h r9 = new com.google.android.material.textfield.h
            r9.<init>(r0)
            r11 = 1
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.h0
            com.google.android.material.textfield.a r9 = new com.google.android.material.textfield.a
            r9.<init>(r0)
            r11 = 2
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.h0
            com.google.android.material.textfield.d r9 = new com.google.android.material.textfield.d
            r9.<init>(r0)
            r11 = 3
            r6.append(r11, r9)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconMode
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x0453
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconMode
            r9 = 0
            int r6 = r1.k(r6, r9)
            r0.setEndIconMode(r6)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconDrawable
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x0437
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconDrawable
            android.graphics.drawable.Drawable r6 = r1.g(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
        L_0x0437:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconContentDescription
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x0448
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r6 = r1.p(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
        L_0x0448:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconCheckable
            r9 = 1
            boolean r6 = r1.a(r6, r9)
            r0.setEndIconCheckable(r6)
            goto L_0x049f
        L_0x0453:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x049f
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleEnabled
            r9 = 0
            boolean r6 = r1.a(r6, r9)
            r0.setEndIconMode(r6)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r6 = r1.g(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r6 = r1.p(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleTint
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x0488
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r6 = defpackage.ca1.b(r10, r1, r6)
            r0.setEndIconTintList(r6)
        L_0x0488:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleTintMode
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x049f
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleTintMode
            r9 = -1
            int r6 = r1.k(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.r.i(r6, r9)
            r0.setEndIconTintMode(r6)
        L_0x049f:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.r(r6)
            if (r6 != 0) goto L_0x04cf
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconTint
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x04b8
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconTint
            android.content.res.ColorStateList r6 = defpackage.ca1.b(r10, r1, r6)
            r0.setEndIconTintList(r6)
        L_0x04b8:
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconTintMode
            boolean r6 = r1.r(r6)
            if (r6 == 0) goto L_0x04cf
            int r6 = com.google.android.material.R$styleable.TextInputLayout_endIconTintMode
            r9 = -1
            int r6 = r1.k(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.r.i(r6, r9)
            r0.setEndIconTintMode(r6)
        L_0x04cf:
            androidx.appcompat.widget.AppCompatTextView r6 = new androidx.appcompat.widget.AppCompatTextView
            r6.<init>(r10)
            r0.z = r6
            int r9 = com.google.android.material.R$id.textinput_prefix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.z
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r11 = -2
            r9.<init>(r11, r11)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.z
            r9 = 1
            defpackage.o4.k0(r6, r9)
            android.widget.LinearLayout r6 = r0.f
            com.google.android.material.internal.CheckableImageButton r9 = r0.U
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.f
            android.widget.TextView r9 = r0.z
            r6.addView(r9)
            androidx.appcompat.widget.AppCompatTextView r6 = new androidx.appcompat.widget.AppCompatTextView
            r6.<init>(r10)
            r0.B = r6
            int r9 = com.google.android.material.R$id.textinput_suffix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.B
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r10 = 80
            r11 = -2
            r9.<init>(r11, r11, r10)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.B
            r9 = 1
            defpackage.o4.k0(r6, r9)
            android.widget.LinearLayout r6 = r0.g
            android.widget.TextView r9 = r0.B
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.g
            com.google.android.material.internal.CheckableImageButton r9 = r0.t0
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.g
            android.widget.FrameLayout r9 = r0.h
            r6.addView(r9)
            r0.setHelperTextEnabled(r8)
            r0.setHelperText(r12)
            r0.setHelperTextTextAppearance(r5)
            r0.setErrorEnabled(r4)
            r0.setErrorTextAppearance(r2)
            r0.setErrorContentDescription(r3)
            int r2 = r0.q
            r0.setCounterTextAppearance(r2)
            int r2 = r0.p
            r0.setCounterOverflowTextAppearance(r2)
            r0.setPlaceholderText(r14)
            r0.setPlaceholderTextAppearance(r15)
            r0.setPrefixText(r7)
            r2 = r19
            r0.setPrefixTextAppearance(r2)
            r2 = r18
            r0.setSuffixText(r2)
            r2 = r16
            r0.setSuffixTextAppearance(r2)
            int r2 = com.google.android.material.R$styleable.TextInputLayout_errorTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x0573
            int r2 = com.google.android.material.R$styleable.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setErrorTextColor(r2)
        L_0x0573:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_helperTextTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x0584
            int r2 = com.google.android.material.R$styleable.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHelperTextColor(r2)
        L_0x0584:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_hintTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x0595
            int r2 = com.google.android.material.R$styleable.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHintTextColor(r2)
        L_0x0595:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_counterTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x05a6
            int r2 = com.google.android.material.R$styleable.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterTextColor(r2)
        L_0x05a6:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_counterOverflowTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x05b7
            int r2 = com.google.android.material.R$styleable.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05b7:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_placeholderTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x05c8
            int r2 = com.google.android.material.R$styleable.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05c8:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_prefixTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x05d9
            int r2 = com.google.android.material.R$styleable.TextInputLayout_prefixTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05d9:
            int r2 = com.google.android.material.R$styleable.TextInputLayout_suffixTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x05ea
            int r2 = com.google.android.material.R$styleable.TextInputLayout_suffixTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05ea:
            r2 = r17
            r0.setCounterEnabled(r2)
            int r2 = com.google.android.material.R$styleable.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEnabled(r2)
            r1.v()
            r1 = 2
            defpackage.o4.s0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A() {
        Iterator it = this.f0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void A0() {
        if (this.i != null) {
            o4.w0(this.B, 0, this.i.getPaddingTop(), (J() || K()) ? 0 : o4.C(this.i), this.i.getPaddingBottom());
        }
    }

    private void B(int i2) {
        Iterator it = this.j0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i2);
        }
    }

    private void B0() {
        int visibility = this.B.getVisibility();
        int i2 = 0;
        boolean z2 = this.A != null && !M();
        TextView textView = this.B;
        if (!z2) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (visibility != this.B.getVisibility()) {
            getEndIconDelegate().c(z2);
        }
        o0();
    }

    private void C(Canvas canvas) {
        ra1 ra1 = this.G;
        if (ra1 != null) {
            Rect bounds = ra1.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.G.draw(canvas);
        }
    }

    private void D(Canvas canvas) {
        if (this.C) {
            this.H0.j(canvas);
        }
    }

    private void E(boolean z2) {
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.J0.cancel();
        }
        if (!z2 || !this.I0) {
            this.H0.d0(Utils.FLOAT_EPSILON);
        } else {
            h(Utils.FLOAT_EPSILON);
        }
        if (z() && ((c) this.F).o0()) {
            x();
        }
        this.G0 = true;
        I();
        y0();
        B0();
    }

    private int F(int i2, boolean z2) {
        int compoundPaddingLeft = i2 + this.i.getCompoundPaddingLeft();
        return (this.y == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - this.z.getMeasuredWidth()) + this.z.getPaddingLeft();
    }

    private int G(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.i.getCompoundPaddingRight();
        return (this.y == null || !z2) ? compoundPaddingRight : compoundPaddingRight + (this.z.getMeasuredWidth() - this.z.getPaddingRight());
    }

    private boolean H() {
        return this.g0 != 0;
    }

    private void I() {
        TextView textView = this.t;
        if (textView != null && this.s) {
            textView.setText((CharSequence) null);
            this.t.setVisibility(4);
        }
    }

    private boolean K() {
        return this.t0.getVisibility() == 0;
    }

    private boolean O() {
        return this.J == 1 && (Build.VERSION.SDK_INT < 16 || this.i.getMinLines() <= 1);
    }

    private int[] Q(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    private void R() {
        o();
        Z();
        C0();
        if (this.J != 0) {
            r0();
        }
    }

    private void S() {
        if (z()) {
            RectF rectF = this.S;
            this.H0.m(rectF, this.i.getWidth(), this.i.getGravity());
            k(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((c) this.F).u0(rectF);
        }
    }

    private static void T(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt, z2);
            }
        }
    }

    private void W(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(Q(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private void Y() {
        TextView textView = this.t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        if (g0()) {
            o4.l0(this.i, this.F);
        }
    }

    private static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean J2 = o4.J(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (J2 || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(J2);
        checkableImageButton.setPressable(J2);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        o4.s0(checkableImageButton, i2);
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0(checkableImageButton, onLongClickListener);
    }

    private boolean e0() {
        return (this.t0.getVisibility() == 0 || ((H() && J()) || this.A != null)) && this.g.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return !(getStartIconDrawable() == null && this.y == null) && this.f.getMeasuredWidth() > 0;
    }

    private void g() {
        TextView textView = this.t;
        if (textView != null) {
            this.e.addView(textView);
            this.t.setVisibility(0);
        }
    }

    private boolean g0() {
        EditText editText = this.i;
        return (editText == null || this.F == null || editText.getBackground() != null || this.J == 0) ? false : true;
    }

    private e getEndIconDelegate() {
        e eVar = this.h0.get(this.g0);
        return eVar != null ? eVar : this.h0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.t0.getVisibility() == 0) {
            return this.t0;
        }
        if (!H() || !J()) {
            return null;
        }
        return this.i0;
    }

    private void h0() {
        TextView textView = this.t;
        if (textView != null && this.s) {
            textView.setText(this.r);
            this.t.setVisibility(0);
            this.t.bringToFront();
        }
    }

    private void i() {
        ra1 ra1 = this.F;
        if (ra1 != null) {
            ra1.setShapeAppearanceModel(this.H);
            if (v()) {
                this.F.h0((float) this.L, this.O);
            }
            int p2 = p();
            this.P = p2;
            this.F.Y(ColorStateList.valueOf(p2));
            if (this.g0 == 3) {
                this.i.getBackground().invalidateSelf();
            }
            j();
            invalidate();
        }
    }

    private void i0(boolean z2) {
        if (!z2 || getEndIconDrawable() == null) {
            l();
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.k.o());
        this.i0.setImageDrawable(mutate);
    }

    private void j() {
        if (this.G != null) {
            if (w()) {
                this.G.Y(ColorStateList.valueOf(this.O));
            }
            invalidate();
        }
    }

    private void j0(Rect rect) {
        ra1 ra1 = this.G;
        if (ra1 != null) {
            int i2 = rect.bottom;
            ra1.setBounds(rect.left, i2 - this.N, rect.right, i2);
        }
    }

    private void k(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.I;
        rectF.left = f2 - ((float) i2);
        rectF.top -= (float) i2;
        rectF.right += (float) i2;
        rectF.bottom += (float) i2;
    }

    private void k0() {
        if (this.o != null) {
            EditText editText = this.i;
            l0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void l() {
        m(this.i0, this.l0, this.k0, this.n0, this.m0);
    }

    private void m(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z2) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z3) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static void m0(Context context, TextView textView, int i2, int i3, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? R$string.character_counter_overflowed_content_description : R$string.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    private void n() {
        m(this.U, this.W, this.V, this.b0, this.a0);
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            d0(textView, this.n ? this.p : this.q);
            if (!this.n && (colorStateList2 = this.w) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (this.n && (colorStateList = this.x) != null) {
                this.o.setTextColor(colorStateList);
            }
        }
    }

    private void o() {
        int i2 = this.J;
        if (i2 == 0) {
            this.F = null;
        } else if (i2 == 1) {
            this.F = new ra1(this.H);
            this.G = new ra1();
            return;
        } else if (i2 == 2) {
            this.F = (!this.C || (this.F instanceof c)) ? new ra1(this.H) : new c(this.H);
        } else {
            throw new IllegalArgumentException(this.J + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.G = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean o0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.f0()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.i
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.c0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.d0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.c0 = r6
            r10.d0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.i
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.c0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.i
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.i.l(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.c0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.i
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            android.widget.EditText r6 = r10.i
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.i.l(r6, r2, r7, r8, r0)
            r10.c0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.e0()
            if (r6 == 0) goto L_0x00d5
            android.widget.TextView r2 = r10.B
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.i
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = defpackage.b4.b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.i
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.p0
            if (r8 == r2) goto L_0x00ad
            r10.p0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.i
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.o0
            r3 = r6[r3]
            androidx.core.widget.i.l(r0, r1, r2, r4, r3)
            goto L_0x00f6
        L_0x00ad:
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r7 != 0) goto L_0x00bd
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.o0 = r7
            r10.p0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bd:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r2 == r7) goto L_0x00d3
            r0 = r6[r4]
            r10.q0 = r0
            android.widget.EditText r0 = r10.i
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.i.l(r0, r1, r2, r7, r3)
            goto L_0x00f6
        L_0x00d3:
            r5 = r0
            goto L_0x00f6
        L_0x00d5:
            android.graphics.drawable.Drawable r6 = r10.o0
            if (r6 == 0) goto L_0x00f7
            android.widget.EditText r6 = r10.i
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r4 != r7) goto L_0x00f3
            android.widget.EditText r0 = r10.i
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.q0
            r3 = r6[r3]
            androidx.core.widget.i.l(r0, r1, r4, r7, r3)
            goto L_0x00f4
        L_0x00f3:
            r5 = r0
        L_0x00f4:
            r10.o0 = r2
        L_0x00f6:
            r0 = r5
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o0():boolean");
    }

    private int p() {
        return this.J == 1 ? t91.f(t91.e(this, R$attr.colorSurface, 0), this.P) : this.P;
    }

    private Rect q(Rect rect) {
        int i2;
        int i3;
        if (this.i != null) {
            Rect rect2 = this.R;
            boolean z2 = o4.y(this) == 1;
            rect2.bottom = rect.bottom;
            int i4 = this.J;
            if (i4 == 1) {
                rect2.left = F(rect.left, z2);
                i2 = rect.top + this.K;
            } else if (i4 != 2) {
                rect2.left = F(rect.left, z2);
                i2 = getPaddingTop();
            } else {
                rect2.left = rect.left + this.i.getPaddingLeft();
                rect2.top = rect.top - u();
                i3 = rect.right - this.i.getPaddingRight();
                rect2.right = i3;
                return rect2;
            }
            rect2.top = i2;
            i3 = G(rect.right, z2);
            rect2.right = i3;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private boolean q0() {
        int max;
        if (this.i == null || this.i.getMeasuredHeight() >= (max = Math.max(this.g.getMeasuredHeight(), this.f.getMeasuredHeight()))) {
            return false;
        }
        this.i.setMinimumHeight(max);
        return true;
    }

    private int r(Rect rect, Rect rect2, float f2) {
        return O() ? (int) (((float) rect2.top) + f2) : rect.bottom - this.i.getCompoundPaddingBottom();
    }

    private void r0() {
        if (this.J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            int u2 = u();
            if (u2 != layoutParams.topMargin) {
                layoutParams.topMargin = u2;
                this.e.requestLayout();
            }
        }
    }

    private int s(Rect rect, float f2) {
        return O() ? (int) (((float) rect.centerY()) - (f2 / 2.0f)) : rect.top + this.i.getCompoundPaddingTop();
    }

    private void setEditText(EditText editText) {
        if (this.i == null) {
            if (this.g0 != 3) {
                boolean z2 = editText instanceof TextInputEditText;
            }
            this.i = editText;
            R();
            setTextInputAccessibilityDelegate(new e(this));
            this.H0.k0(this.i.getTypeface());
            this.H0.a0(this.i.getTextSize());
            int gravity = this.i.getGravity();
            this.H0.R((gravity & -113) | 48);
            this.H0.Z(gravity);
            this.i.addTextChangedListener(new a());
            if (this.v0 == null) {
                this.v0 = this.i.getHintTextColors();
            }
            if (this.C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.i.getHint();
                    this.j = hint;
                    setHint(hint);
                    this.i.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.o != null) {
                l0(this.i.getText().length());
            }
            p0();
            this.k.e();
            this.f.bringToFront();
            this.g.bringToFront();
            this.h.bringToFront();
            this.t0.bringToFront();
            A();
            x0();
            A0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z2) {
        int i2 = 0;
        this.t0.setVisibility(z2 ? 0 : 8);
        FrameLayout frameLayout = this.h;
        if (z2) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        A0();
        if (!H()) {
            o0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D)) {
            this.D = charSequence;
            this.H0.i0(charSequence);
            if (!this.G0) {
                S();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.s != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.t = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_placeholder);
                o4.k0(this.t, 1);
                setPlaceholderTextAppearance(this.v);
                setPlaceholderTextColor(this.u);
                g();
            } else {
                Y();
                this.t = null;
            }
            this.s = z2;
        }
    }

    private Rect t(Rect rect) {
        if (this.i != null) {
            Rect rect2 = this.R;
            float x2 = this.H0.x();
            rect2.left = rect.left + this.i.getCompoundPaddingLeft();
            rect2.top = s(rect, x2);
            rect2.right = rect.right - this.i.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, x2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.i;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.i;
        boolean z5 = editText2 != null && editText2.hasFocus();
        boolean k2 = this.k.k();
        ColorStateList colorStateList2 = this.v0;
        if (colorStateList2 != null) {
            this.H0.Q(colorStateList2);
            this.H0.Y(this.v0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.v0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.F0) : this.F0;
            this.H0.Q(ColorStateList.valueOf(colorForState));
            this.H0.Y(ColorStateList.valueOf(colorForState));
        } else if (k2) {
            this.H0.Q(this.k.p());
        } else {
            if (this.n && (textView = this.o) != null) {
                aVar = this.H0;
                colorStateList = textView.getTextColors();
            } else if (z5 && (colorStateList = this.w0) != null) {
                aVar = this.H0;
            }
            aVar.Q(colorStateList);
        }
        if (z4 || (isEnabled() && (z5 || k2))) {
            if (z3 || this.G0) {
                y(z2);
            }
        } else if (z3 || !this.G0) {
            E(z2);
        }
    }

    private int u() {
        float p2;
        if (!this.C) {
            return 0;
        }
        int i2 = this.J;
        if (i2 == 0 || i2 == 1) {
            p2 = this.H0.p();
        } else if (i2 != 2) {
            return 0;
        } else {
            p2 = this.H0.p() / 2.0f;
        }
        return (int) p2;
    }

    private void u0() {
        EditText editText;
        if (this.t != null && (editText = this.i) != null) {
            this.t.setGravity(editText.getGravity());
            this.t.setPadding(this.i.getCompoundPaddingLeft(), this.i.getCompoundPaddingTop(), this.i.getCompoundPaddingRight(), this.i.getCompoundPaddingBottom());
        }
    }

    private boolean v() {
        return this.J == 2 && w();
    }

    private void v0() {
        EditText editText = this.i;
        w0(editText == null ? 0 : editText.getText().length());
    }

    private boolean w() {
        return this.L > -1 && this.O != 0;
    }

    /* access modifiers changed from: private */
    public void w0(int i2) {
        if (i2 != 0 || this.G0) {
            I();
        } else {
            h0();
        }
    }

    private void x() {
        if (z()) {
            ((c) this.F).r0();
        }
    }

    private void x0() {
        if (this.i != null) {
            o4.w0(this.z, P() ? 0 : o4.D(this.i), this.i.getCompoundPaddingTop(), 0, this.i.getCompoundPaddingBottom());
        }
    }

    private void y(boolean z2) {
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.J0.cancel();
        }
        if (!z2 || !this.I0) {
            this.H0.d0(1.0f);
        } else {
            h(1.0f);
        }
        this.G0 = false;
        if (z()) {
            S();
        }
        v0();
        y0();
        B0();
    }

    private void y0() {
        this.z.setVisibility((this.y == null || M()) ? 8 : 0);
        o0();
    }

    private boolean z() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof c);
    }

    private void z0(boolean z2, boolean z3) {
        int defaultColor = this.A0.getDefaultColor();
        int colorForState = this.A0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.A0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.O = colorForState2;
        } else if (z3) {
            this.O = colorForState;
        } else {
            this.O = defaultColor;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.i;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0() {
        /*
            r6 = this;
            ra1 r0 = r6.F
            if (r0 == 0) goto L_0x00db
            int r0 = r6.J
            if (r0 != 0) goto L_0x000a
            goto L_0x00db
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.i
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.i
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.F0
        L_0x003c:
            r6.O = r4
            goto L_0x0075
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.k
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0056
            android.content.res.ColorStateList r4 = r6.A0
            if (r4 == 0) goto L_0x004f
        L_0x004b:
            r6.z0(r0, r3)
            goto L_0x0075
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.k
            int r4 = r4.o()
            goto L_0x003c
        L_0x0056:
            boolean r4 = r6.n
            if (r4 == 0) goto L_0x0068
            android.widget.TextView r4 = r6.o
            if (r4 == 0) goto L_0x0068
            android.content.res.ColorStateList r5 = r6.A0
            if (r5 == 0) goto L_0x0063
            goto L_0x004b
        L_0x0063:
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            int r4 = r6.z0
            goto L_0x003c
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            int r4 = r6.y0
            goto L_0x003c
        L_0x0072:
            int r4 = r6.x0
            goto L_0x003c
        L_0x0075:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.k
            boolean r4 = r4.w()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.k
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x008c
            r1 = 1
        L_0x008c:
            r6.setErrorIconVisible(r1)
            r6.V()
            r6.X()
            r6.U()
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00ab
            com.google.android.material.textfield.f r1 = r6.k
            boolean r1 = r1.k()
            r6.i0(r1)
        L_0x00ab:
            if (r0 == 0) goto L_0x00b6
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00b6
            int r1 = r6.N
            goto L_0x00b8
        L_0x00b6:
            int r1 = r6.M
        L_0x00b8:
            r6.L = r1
            int r1 = r6.J
            if (r1 != r2) goto L_0x00d8
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00c9
            int r0 = r6.C0
        L_0x00c6:
            r6.P = r0
            goto L_0x00d8
        L_0x00c9:
            if (r3 == 0) goto L_0x00d0
            if (r0 != 0) goto L_0x00d0
            int r0 = r6.E0
            goto L_0x00c6
        L_0x00d0:
            if (r0 == 0) goto L_0x00d5
            int r0 = r6.D0
            goto L_0x00c6
        L_0x00d5:
            int r0 = r6.B0
            goto L_0x00c6
        L_0x00d8:
            r6.i()
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.C0():void");
    }

    public boolean J() {
        return this.h.getVisibility() == 0 && this.i0.getVisibility() == 0;
    }

    public boolean L() {
        return this.k.x();
    }

    /* access modifiers changed from: package-private */
    public final boolean M() {
        return this.G0;
    }

    public boolean N() {
        return this.E;
    }

    public boolean P() {
        return this.U.getVisibility() == 0;
    }

    public void U() {
        W(this.i0, this.k0);
    }

    public void V() {
        W(this.t0, this.u0);
    }

    public void X() {
        W(this.U, this.V);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.e.addView(view, layoutParams2);
            this.e.setLayoutParams(layoutParams);
            r0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d0(TextView textView, int i2) {
        boolean z2 = true;
        try {
            i.r(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            i.r(textView, R$style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.a.d(getContext(), R$color.design_error));
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.j == null || (editText = this.i) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.E;
        this.E = false;
        CharSequence hint = editText.getHint();
        this.i.setHint(this.j);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.i.setHint(hint);
            this.E = z2;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.L0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        D(canvas);
        C(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.K0) {
            boolean z2 = true;
            this.K0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.H0;
            boolean h02 = aVar != null ? aVar.h0(drawableState) | false : false;
            if (this.i != null) {
                if (!o4.O(this) || !isEnabled()) {
                    z2 = false;
                }
                s0(z2);
            }
            p0();
            C0();
            if (h02) {
                invalidate();
            }
            this.K0 = false;
        }
    }

    public void e(f fVar) {
        this.f0.add(fVar);
        if (this.i != null) {
            fVar.a(this);
        }
    }

    public void f(g gVar) {
        this.j0.add(gVar);
    }

    public int getBaseline() {
        EditText editText = this.i;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public ra1 getBoxBackground() {
        int i2 = this.J;
        if (i2 == 1 || i2 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.P;
    }

    public int getBoxBackgroundMode() {
        return this.J;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.F.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.F.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.F.H();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.F.G();
    }

    public int getBoxStrokeColor() {
        return this.z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0;
    }

    public int getBoxStrokeWidth() {
        return this.M;
    }

    public int getBoxStrokeWidthFocused() {
        return this.N;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.l || !this.n || (textView = this.o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.w;
    }

    public ColorStateList getCounterTextColor() {
        return this.w;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.v0;
    }

    public EditText getEditText() {
        return this.i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.i0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.i0.getDrawable();
    }

    public int getEndIconMode() {
        return this.g0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.i0;
    }

    public CharSequence getError() {
        if (this.k.w()) {
            return this.k.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.k.m();
    }

    public int getErrorCurrentTextColors() {
        return this.k.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.t0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.k.o();
    }

    public CharSequence getHelperText() {
        if (this.k.x()) {
            return this.k.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.k.r();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.H0.p();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.H0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.w0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.i0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.i0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.z.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.z;
    }

    public CharSequence getStartIconContentDescription() {
        return this.U.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.U.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.T;
    }

    /* access modifiers changed from: package-private */
    public void h(float f2) {
        if (this.H0.z() != f2) {
            if (this.J0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.J0 = valueAnimator;
                valueAnimator.setInterpolator(f91.b);
                this.J0.setDuration(167);
                this.J0.addUpdateListener(new d());
            }
            this.J0.setFloatValues(new float[]{this.H0.z(), f2});
            this.J0.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void l0(int i2) {
        boolean z2 = this.n;
        int i3 = this.m;
        if (i3 == -1) {
            this.o.setText(String.valueOf(i2));
            this.o.setContentDescription((CharSequence) null);
            this.n = false;
        } else {
            this.n = i2 > i3;
            m0(getContext(), this.o, i2, this.m, this.n);
            if (z2 != this.n) {
                n0();
            }
            this.o.setText(h3.c().j(getContext().getString(R$string.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.m)})));
        }
        if (this.i != null && z2 != this.n) {
            s0(false);
            C0();
            p0();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.i;
        if (editText != null) {
            Rect rect = this.Q;
            com.google.android.material.internal.b.a(this, editText, rect);
            j0(rect);
            if (this.C) {
                this.H0.a0(this.i.getTextSize());
                int gravity = this.i.getGravity();
                this.H0.R((gravity & -113) | 48);
                this.H0.Z(gravity);
                this.H0.N(q(rect));
                this.H0.V(t(rect));
                this.H0.K();
                if (z() && !this.G0) {
                    S();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean q02 = q0();
        boolean o02 = o0();
        if (q02 || o02) {
            this.i.post(new c());
        }
        u0();
        x0();
        A0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.g);
        if (hVar.h) {
            this.i0.post(new b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.k.k()) {
            hVar.g = getError();
        }
        hVar.h = H() && this.i0.isChecked();
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.i;
        if (editText != null && this.J == 0 && (background = editText.getBackground()) != null) {
            if (q.a(background)) {
                background = background.mutate();
            }
            if (this.k.k()) {
                currentTextColor = this.k.o();
            } else if (!this.n || (textView = this.o) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.i.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.g.e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    public void s0(boolean z2) {
        t0(z2, false);
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.P != i2) {
            this.P = i2;
            this.B0 = i2;
            this.D0 = i2;
            this.E0 = i2;
            i();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(androidx.core.content.a.d(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.B0 = defaultColor;
        this.P = defaultColor;
        this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        i();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.J) {
            this.J = i2;
            if (this.i != null) {
                R();
            }
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.z0 != i2) {
            this.z0 = i2;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.x0 = colorStateList.getDefaultColor();
            this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.z0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            C0();
        }
        this.z0 = defaultColor;
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.M = i2;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.N = i2;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.l != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.o = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_counter);
                Typeface typeface = this.T;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.k.d(this.o, 2);
                b4.d((ViewGroup.MarginLayoutParams) this.o.getLayoutParams(), getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_counter_margin_start));
                n0();
                k0();
            } else {
                this.k.y(this.o, 2);
                this.o = null;
            }
            this.l = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.m != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.m = i2;
            if (this.l) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.p != i2) {
            this.p = i2;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.q != i2) {
            this.q = i2;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            n0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = colorStateList;
        if (this.i != null) {
            s0(false);
        }
    }

    public void setEnabled(boolean z2) {
        T(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.i0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.i0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.i0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? defpackage.f.d(getContext(), i2) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
        U();
    }

    public void setEndIconMode(int i2) {
        int i3 = this.g0;
        this.g0 = i2;
        B(i3);
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.J)) {
            getEndIconDelegate().a();
            l();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.J + " is not supported by the end icon mode " + i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.i0, onClickListener, this.r0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.r0 = onLongClickListener;
        c0(this.i0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            this.k0 = colorStateList;
            this.l0 = true;
            l();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.m0 != mode) {
            this.m0 = mode;
            this.n0 = true;
            l();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (J() != z2) {
            this.i0.setVisibility(z2 ? 0 : 8);
            A0();
            o0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.k.w()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.k.L(charSequence);
        } else {
            this.k.s();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.k.A(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.k.B(z2);
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? defpackage.f.d(getContext(), i2) : null);
        V();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.t0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.k.w());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.t0, onClickListener, this.s0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.s0 = onLongClickListener;
        c0(this.t0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        Drawable drawable = this.t0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.t0.getDrawable() != drawable) {
            this.t0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.t0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.t0.getDrawable() != drawable) {
            this.t0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        this.k.C(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.k.D(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!L()) {
                setHelperTextEnabled(true);
            }
            this.k.M(charSequence);
        } else if (L()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.k.G(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.k.F(z2);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.k.E(i2);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.I0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.C) {
            this.C = z2;
            if (!z2) {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.i.getHint())) {
                    this.i.setHint(this.D);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.i.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.i != null) {
                r0();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.H0.O(i2);
        this.w0 = this.H0.n();
        if (this.i != null) {
            s0(false);
            r0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            if (this.v0 == null) {
                this.H0.Q(colorStateList);
            }
            this.w0 = colorStateList;
            if (this.i != null) {
                s0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.i0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? defpackage.f.d(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.g0 != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        this.l0 = true;
        l();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.m0 = mode;
        this.n0 = true;
        l();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.s || !TextUtils.isEmpty(charSequence)) {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        v0();
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.v = i2;
        TextView textView = this.t;
        if (textView != null) {
            i.r(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.z.setText(charSequence);
        y0();
    }

    public void setPrefixTextAppearance(int i2) {
        i.r(this.z, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.U.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.U.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? defpackage.f.d(getContext(), i2) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.U.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            X();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        b0(this.U, onClickListener, this.e0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e0 = onLongClickListener;
        c0(this.U, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            this.W = true;
            n();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.a0 != mode) {
            this.a0 = mode;
            this.b0 = true;
            n();
        }
    }

    public void setStartIconVisible(boolean z2) {
        if (P() != z2) {
            this.U.setVisibility(z2 ? 0 : 8);
            x0();
            o0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        B0();
    }

    public void setSuffixTextAppearance(int i2) {
        i.r(this.B, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.i;
        if (editText != null) {
            o4.i0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.T) {
            this.T = typeface;
            this.H0.k0(typeface);
            this.k.I(typeface);
            TextView textView = this.o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}
