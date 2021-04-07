package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.core.widget.b;
import androidx.core.widget.i;
import com.github.mikephil.charting.utils.Utils;
import defpackage.h2;
import java.lang.ref.WeakReference;
import java.util.Locale;

class m {
    private final TextView a;
    private e0 b;
    private e0 c;
    private e0 d;
    private e0 e;
    private e0 f;
    private e0 g;
    private e0 h;
    private final n i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    private static class a extends h2.a {
        private final WeakReference<m> a;
        private final int b;
        private final int c;

        /* renamed from: androidx.appcompat.widget.m$a$a  reason: collision with other inner class name */
        private class C0011a implements Runnable {
            private final WeakReference<m> e;
            private final Typeface f;

            C0011a(a aVar, WeakReference<m> weakReference, Typeface typeface) {
                this.e = weakReference;
                this.f = typeface;
            }

            public void run() {
                m mVar = (m) this.e.get();
                if (mVar != null) {
                    mVar.B(this.f);
                }
            }
        }

        a(m mVar, int i, int i2) {
            this.a = new WeakReference<>(mVar);
            this.b = i;
            this.c = i2;
        }

        public void c(int i) {
        }

        public void d(Typeface typeface) {
            int i;
            m mVar = (m) this.a.get();
            if (mVar != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
                    typeface = Typeface.create(typeface, i, (this.c & 2) != 0);
                }
                mVar.q(new C0011a(this, this.a, typeface));
            }
        }
    }

    m(TextView textView) {
        this.a = textView;
        this.i = new n(this.a);
    }

    private void A(int i2, float f2) {
        this.i.y(i2, f2);
    }

    private void C(Context context, g0 g0Var) {
        String o;
        Typeface typeface;
        Typeface typeface2;
        this.j = g0Var.k(R$styleable.TextAppearance_android_textStyle, this.j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int k2 = g0Var.k(R$styleable.TextAppearance_android_textFontWeight, -1);
            this.k = k2;
            if (k2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (g0Var.r(R$styleable.TextAppearance_android_fontFamily) || g0Var.r(R$styleable.TextAppearance_fontFamily)) {
            this.l = null;
            int i2 = g0Var.r(R$styleable.TextAppearance_fontFamily) ? R$styleable.TextAppearance_fontFamily : R$styleable.TextAppearance_android_fontFamily;
            int i3 = this.k;
            int i4 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface j2 = g0Var.j(i2, this.j, new a(this, i3, i4));
                    if (j2 != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                            j2 = Typeface.create(Typeface.create(j2, 0), this.k, (this.j & 2) != 0);
                        }
                        this.l = j2;
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (o = g0Var.o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    typeface = Typeface.create(o, this.j);
                } else {
                    Typeface create = Typeface.create(o, 0);
                    int i5 = this.k;
                    if ((this.j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i5, z);
                }
                this.l = typeface;
            }
        } else if (g0Var.r(R$styleable.TextAppearance_android_typeface)) {
            this.m = false;
            int k3 = g0Var.k(R$styleable.TextAppearance_android_typeface, 1);
            if (k3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (k3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (k3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.l = typeface2;
        }
    }

    private void a(Drawable drawable, e0 e0Var) {
        if (drawable != null && e0Var != null) {
            g.i(drawable, e0Var, this.a.getDrawableState());
        }
    }

    private static e0 d(Context context, g gVar, int i2) {
        ColorStateList f2 = gVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        e0 e0Var = new e0();
        e0Var.d = true;
        e0Var.a = f2;
        return e0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void y() {
        e0 e0Var = this.h;
        this.b = e0Var;
        this.c = e0Var;
        this.d = e0Var;
        this.e = e0Var;
        this.f = e0Var;
        this.g = e0Var;
    }

    public void B(Typeface typeface) {
        if (this.m) {
            this.a.setTypeface(typeface);
            this.l = typeface;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.b == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.i.b();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.i.j();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.i.k();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.i.l();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.i.m();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.i.n();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        e0 e0Var = this.h;
        if (e0Var != null) {
            return e0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        e0 e0Var = this.h;
        if (e0Var != null) {
            return e0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.i.s();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        g gVar;
        int i3;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i2;
        Context context = this.a.getContext();
        g b2 = g.b();
        g0 u = g0.u(context, attributeSet2, R$styleable.AppCompatTextHelper, i4, 0);
        int n = u.n(R$styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (u.r(R$styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.b = d(context, b2, u.n(R$styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (u.r(R$styleable.AppCompatTextHelper_android_drawableTop)) {
            this.c = d(context, b2, u.n(R$styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (u.r(R$styleable.AppCompatTextHelper_android_drawableRight)) {
            this.d = d(context, b2, u.n(R$styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (u.r(R$styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.e = d(context, b2, u.n(R$styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (u.r(R$styleable.AppCompatTextHelper_android_drawableStart)) {
                this.f = d(context, b2, u.n(R$styleable.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (u.r(R$styleable.AppCompatTextHelper_android_drawableEnd)) {
                this.g = d(context, b2, u.n(R$styleable.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        u.v();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n != -1) {
            g0 s = g0.s(context, n, R$styleable.TextAppearance);
            if (z3 || !s.r(R$styleable.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = s.a(R$styleable.TextAppearance_textAllCaps, false);
                z = true;
            }
            C(context, s);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = s.r(R$styleable.TextAppearance_android_textColor) ? s.c(R$styleable.TextAppearance_android_textColor) : null;
                colorStateList3 = s.r(R$styleable.TextAppearance_android_textColorHint) ? s.c(R$styleable.TextAppearance_android_textColorHint) : null;
                colorStateList2 = s.r(R$styleable.TextAppearance_android_textColorLink) ? s.c(R$styleable.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str2 = s.r(R$styleable.TextAppearance_textLocale) ? s.o(R$styleable.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !s.r(R$styleable.TextAppearance_fontVariationSettings)) ? null : s.o(R$styleable.TextAppearance_fontVariationSettings);
            s.v();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            colorStateList2 = null;
            z2 = false;
            z = false;
            colorStateList = null;
        }
        g0 u2 = g0.u(context, attributeSet2, R$styleable.TextAppearance, i4, 0);
        if (!z3 && u2.r(R$styleable.TextAppearance_textAllCaps)) {
            z2 = u2.a(R$styleable.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (u2.r(R$styleable.TextAppearance_android_textColor)) {
                colorStateList = u2.c(R$styleable.TextAppearance_android_textColor);
            }
            if (u2.r(R$styleable.TextAppearance_android_textColorHint)) {
                colorStateList3 = u2.c(R$styleable.TextAppearance_android_textColorHint);
            }
            if (u2.r(R$styleable.TextAppearance_android_textColorLink)) {
                colorStateList2 = u2.c(R$styleable.TextAppearance_android_textColorLink);
            }
        }
        if (u2.r(R$styleable.TextAppearance_textLocale)) {
            str2 = u2.o(R$styleable.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && u2.r(R$styleable.TextAppearance_fontVariationSettings)) {
            str = u2.o(R$styleable.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT < 28 || !u2.r(R$styleable.TextAppearance_android_textSize) || u2.f(R$styleable.TextAppearance_android_textSize, -1) != 0) {
            gVar = b2;
        } else {
            gVar = b2;
            this.a.setTextSize(0, Utils.FLOAT_EPSILON);
        }
        C(context, u2);
        u2.v();
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z) {
            r(z2);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.a.setTypeface(typeface, this.j);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                this.a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i5 >= 21) {
                this.a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.i.t(attributeSet2, i4);
        if (b.a && this.i.n() != 0) {
            int[] m2 = this.i.m();
            if (m2.length > 0) {
                if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.i.k(), this.i.j(), this.i.l(), 0);
                } else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(m2, 0);
                }
            }
        }
        g0 t = g0.t(context, attributeSet2, R$styleable.AppCompatTextView);
        int n2 = t.n(R$styleable.AppCompatTextView_drawableLeftCompat, -1);
        g gVar2 = gVar;
        Drawable c2 = n2 != -1 ? gVar2.c(context, n2) : null;
        int n3 = t.n(R$styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable c3 = n3 != -1 ? gVar2.c(context, n3) : null;
        int n4 = t.n(R$styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable c4 = n4 != -1 ? gVar2.c(context, n4) : null;
        int n5 = t.n(R$styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable c5 = n5 != -1 ? gVar2.c(context, n5) : null;
        int n6 = t.n(R$styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable c6 = n6 != -1 ? gVar2.c(context, n6) : null;
        int n7 = t.n(R$styleable.AppCompatTextView_drawableEndCompat, -1);
        x(c2, c3, c4, c5, c6, n7 != -1 ? gVar2.c(context, n7) : null);
        if (t.r(R$styleable.AppCompatTextView_drawableTint)) {
            i.j(this.a, t.c(R$styleable.AppCompatTextView_drawableTint));
        }
        if (t.r(R$styleable.AppCompatTextView_drawableTintMode)) {
            i3 = -1;
            i.k(this.a, q.e(t.k(R$styleable.AppCompatTextView_drawableTintMode, -1), (PorterDuff.Mode) null));
        } else {
            i3 = -1;
        }
        int f2 = t.f(R$styleable.AppCompatTextView_firstBaselineToTopHeight, i3);
        int f3 = t.f(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, i3);
        int f4 = t.f(R$styleable.AppCompatTextView_lineHeight, i3);
        t.v();
        if (f2 != i3) {
            i.n(this.a, f2);
        }
        if (f3 != i3) {
            i.o(this.a, f3);
        }
        if (f4 != i3) {
            i.p(this.a, f4);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z, int i2, int i3, int i4, int i5) {
        if (!b.a) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void p(Context context, int i2) {
        String o;
        ColorStateList c2;
        g0 s = g0.s(context, i2, R$styleable.TextAppearance);
        if (s.r(R$styleable.TextAppearance_textAllCaps)) {
            r(s.a(R$styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && s.r(R$styleable.TextAppearance_android_textColor) && (c2 = s.c(R$styleable.TextAppearance_android_textColor)) != null) {
            this.a.setTextColor(c2);
        }
        if (s.r(R$styleable.TextAppearance_android_textSize) && s.f(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, Utils.FLOAT_EPSILON);
        }
        C(context, s);
        if (Build.VERSION.SDK_INT >= 26 && s.r(R$styleable.TextAppearance_fontVariationSettings) && (o = s.o(R$styleable.TextAppearance_fontVariationSettings)) != null) {
            this.a.setFontVariationSettings(o);
        }
        s.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void q(Runnable runnable) {
        this.a.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z) {
        this.a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void s(int i2, int i3, int i4, int i5) {
        this.i.u(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void t(int[] iArr, int i2) {
        this.i.v(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void u(int i2) {
        this.i.w(i2);
    }

    /* access modifiers changed from: package-private */
    public void v(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new e0();
        }
        e0 e0Var = this.h;
        e0Var.a = colorStateList;
        e0Var.d = colorStateList != null;
        y();
    }

    /* access modifiers changed from: package-private */
    public void w(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new e0();
        }
        e0 e0Var = this.h;
        e0Var.b = mode;
        e0Var.c = mode != null;
        y();
    }

    /* access modifiers changed from: package-private */
    public void z(int i2, float f2) {
        if (!b.a && !l()) {
            A(i2, f2);
        }
    }
}
