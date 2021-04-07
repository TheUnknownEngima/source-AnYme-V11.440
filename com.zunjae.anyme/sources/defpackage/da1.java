package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$styleable;
import defpackage.h2;

/* renamed from: da1  reason: default package */
public class da1 {
    public final ColorStateList a;
    public final ColorStateList b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public float i;
    private final int j;
    /* access modifiers changed from: private */
    public boolean k = false;
    /* access modifiers changed from: private */
    public Typeface l;

    /* renamed from: da1$a */
    class a extends h2.a {
        final /* synthetic */ fa1 a;

        a(fa1 fa1) {
            this.a = fa1;
        }

        public void c(int i) {
            boolean unused = da1.this.k = true;
            this.a.a(i);
        }

        public void d(Typeface typeface) {
            da1 da1 = da1.this;
            Typeface unused = da1.l = Typeface.create(typeface, da1.d);
            boolean unused2 = da1.this.k = true;
            this.a.b(da1.this.l, false);
        }
    }

    /* renamed from: da1$b */
    class b extends fa1 {
        final /* synthetic */ TextPaint a;
        final /* synthetic */ fa1 b;

        b(TextPaint textPaint, fa1 fa1) {
            this.a = textPaint;
            this.b = fa1;
        }

        public void a(int i) {
            this.b.a(i);
        }

        public void b(Typeface typeface, boolean z) {
            da1.this.k(this.a, typeface);
            this.b.b(typeface, z);
        }
    }

    public da1(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, R$styleable.TextAppearance);
        this.i = obtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, Utils.FLOAT_EPSILON);
        this.a = ca1.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
        ca1.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
        ca1.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
        this.d = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.e = obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int e2 = ca1.e(obtainStyledAttributes, R$styleable.TextAppearance_fontFamily, R$styleable.TextAppearance_android_fontFamily);
        this.j = obtainStyledAttributes.getResourceId(e2, 0);
        this.c = obtainStyledAttributes.getString(e2);
        obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.b = ca1.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
        this.f = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, Utils.FLOAT_EPSILON);
        this.g = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, Utils.FLOAT_EPSILON);
        this.h = obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.l == null && (str = this.c) != null) {
            this.l = Typeface.create(str, this.d);
        }
        if (this.l == null) {
            int i2 = this.e;
            this.l = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.d);
        }
    }

    public Typeface e() {
        d();
        return this.l;
    }

    public Typeface f(Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface c2 = h2.c(context, this.j);
                this.l = c2;
                if (c2 != null) {
                    this.l = Typeface.create(c2, this.d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                "Error loading font " + this.c;
            }
        }
        d();
        this.k = true;
        return this.l;
    }

    public void g(Context context, TextPaint textPaint, fa1 fa1) {
        k(textPaint, e());
        h(context, new b(textPaint, fa1));
    }

    public void h(Context context, fa1 fa1) {
        if (ea1.a()) {
            f(context);
        } else {
            d();
        }
        if (this.j == 0) {
            this.k = true;
        }
        if (this.k) {
            fa1.b(this.l, true);
            return;
        }
        try {
            h2.e(context, this.j, new a(fa1), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            fa1.a(1);
        } catch (Exception unused2) {
            "Error loading font " + this.c;
            this.k = true;
            fa1.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, fa1 fa1) {
        j(context, textPaint, fa1);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.h;
        float f3 = this.f;
        float f4 = this.g;
        ColorStateList colorStateList2 = this.b;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, fa1 fa1) {
        if (ea1.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fa1);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : Utils.FLOAT_EPSILON);
        textPaint.setTextSize(this.i);
    }
}
