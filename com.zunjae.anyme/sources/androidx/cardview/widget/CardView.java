package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.R$attr;
import androidx.cardview.R$color;
import androidx.cardview.R$style;
import androidx.cardview.R$styleable;
import com.github.mikephil.charting.utils.Utils;

public class CardView extends FrameLayout {
    private static final int[] l = {16842801};
    private static final e m;
    private boolean e;
    private boolean f;
    int g;
    int h;
    final Rect i;
    final Rect j;
    private final d k;

    class a implements d {
        private Drawable a;

        a() {
        }

        public void a(int i, int i2, int i3, int i4) {
            CardView.this.j.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.i;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        public void b(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.g) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.h) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        public void c(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable f() {
            return this.a;
        }

        public View g() {
            return CardView.this;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        m = i2 >= 21 ? new b() : i2 >= 17 ? new a() : new c();
        m.j();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources;
        int i3;
        ColorStateList valueOf;
        this.i = new Rect();
        this.j = new Rect();
        this.k = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CardView, i2, R$style.CardView);
        if (obtainStyledAttributes.hasValue(R$styleable.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(R$styleable.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(l);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = R$color.cardview_light_background;
            } else {
                resources = getResources();
                i3 = R$color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, Utils.FLOAT_EPSILON);
        float dimension2 = obtainStyledAttributes.getDimension(R$styleable.CardView_cardElevation, Utils.FLOAT_EPSILON);
        float dimension3 = obtainStyledAttributes.getDimension(R$styleable.CardView_cardMaxElevation, Utils.FLOAT_EPSILON);
        this.e = obtainStyledAttributes.getBoolean(R$styleable.CardView_cardUseCompatPadding, false);
        this.f = obtainStyledAttributes.getBoolean(R$styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPadding, 0);
        this.i.left = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        this.i.top = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingTop, dimensionPixelSize);
        this.i.right = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingRight, dimensionPixelSize);
        this.i.bottom = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.g = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minWidth, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        m.a(this.k, context, colorStateList, dimension, dimension2, f2);
    }

    public ColorStateList getCardBackgroundColor() {
        return m.h(this.k);
    }

    public float getCardElevation() {
        return m.c(this.k);
    }

    public int getContentPaddingBottom() {
        return this.i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.i.left;
    }

    public int getContentPaddingRight() {
        return this.i.right;
    }

    public int getContentPaddingTop() {
        return this.i.top;
    }

    public float getMaxCardElevation() {
        return m.g(this.k);
    }

    public boolean getPreventCornerOverlap() {
        return this.f;
    }

    public float getRadius() {
        return m.d(this.k);
    }

    public boolean getUseCompatPadding() {
        return this.e;
    }

    public void h(int i2, int i3, int i4, int i5) {
        this.i.set(i2, i3, i4, i5);
        m.i(this.k);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!(m instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) m.l(this.k)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) m.k(this.k)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        m.n(this.k, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        m.n(this.k, colorStateList);
    }

    public void setCardElevation(float f2) {
        m.f(this.k, f2);
    }

    public void setMaxCardElevation(float f2) {
        m.o(this.k, f2);
    }

    public void setMinimumHeight(int i2) {
        this.h = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.g = i2;
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f) {
            this.f = z;
            m.m(this.k);
        }
    }

    public void setRadius(float f2) {
        m.b(this.k, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.e != z) {
            this.e = z;
            m.e(this.k);
        }
    }
}
