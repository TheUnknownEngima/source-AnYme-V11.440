package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.i;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
public class PagerTitleStrip extends ViewGroup {
    private static final int[] s = {16842804, 16842901, 16842904, 16842927};
    private static final int[] t = {16843660};
    ViewPager e;
    TextView f;
    TextView g;
    TextView h;
    private int i = -1;
    float j = -1.0f;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private final a o = new a();
    private WeakReference<a> p;
    private int q;
    int r;

    private class a extends DataSetObserver implements ViewPager.i, ViewPager.h {
        private int e;

        a() {
        }

        public void a(int i, float f2, int i2) {
            if (f2 > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.d(i, f2, false);
        }

        public void b(ViewPager viewPager, a aVar, a aVar2) {
            PagerTitleStrip.this.b(aVar, aVar2);
        }

        public void d(int i) {
            this.e = i;
        }

        public void e(int i) {
            if (this.e == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.c(pagerTitleStrip.e.getCurrentItem(), PagerTitleStrip.this.e.getAdapter());
                float f2 = PagerTitleStrip.this.j;
                if (f2 < Utils.FLOAT_EPSILON) {
                    f2 = Utils.FLOAT_EPSILON;
                }
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                pagerTitleStrip2.d(pagerTitleStrip2.e.getCurrentItem(), f2, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.c(pagerTitleStrip.e.getCurrentItem(), PagerTitleStrip.this.e.getAdapter());
            float f2 = PagerTitleStrip.this.j;
            if (f2 < Utils.FLOAT_EPSILON) {
                f2 = Utils.FLOAT_EPSILON;
            }
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.d(pagerTitleStrip2.e.getCurrentItem(), f2, true);
        }
    }

    private static class b extends SingleLineTransformationMethod {
        private Locale e;

        b(Context context) {
            this.e = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.e);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        this.f = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.g = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            i.r(this.f, resourceId);
            i.r(this.g, resourceId);
            i.r(this.h, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f.setTextColor(color);
            this.g.setTextColor(color);
            this.h.setTextColor(color);
        }
        this.l = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.r = this.g.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f.setEllipsize(TextUtils.TruncateAt.END);
        this.g.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, t);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.f;
        if (z) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.g);
            setSingleLineAllCaps(this.h);
        } else {
            textView4.setSingleLine();
            this.g.setSingleLine();
            this.h.setSingleLine();
        }
        this.k = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i2, float f2) {
        this.f.setTextSize(i2, f2);
        this.g.setTextSize(i2, f2);
        this.h.setTextSize(i2, f2);
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar, a aVar2) {
        if (aVar != null) {
            aVar.u(this.o);
            this.p = null;
        }
        if (aVar2 != null) {
            aVar2.m(this.o);
            this.p = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.e;
        if (viewPager != null) {
            this.i = -1;
            this.j = -1.0f;
            c(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, a aVar) {
        int e2 = aVar != null ? aVar.e() : 0;
        this.m = true;
        CharSequence charSequence = null;
        this.f.setText((i2 < 1 || aVar == null) ? null : aVar.g(i2 - 1));
        this.g.setText((aVar == null || i2 >= e2) ? null : aVar.g(i2));
        int i3 = i2 + 1;
        if (i3 < e2 && aVar != null) {
            charSequence = aVar.g(i3);
        }
        this.h.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f.measure(makeMeasureSpec, makeMeasureSpec2);
        this.g.measure(makeMeasureSpec, makeMeasureSpec2);
        this.h.measure(makeMeasureSpec, makeMeasureSpec2);
        this.i = i2;
        if (!this.n) {
            d(i2, this.j, false);
        }
        this.m = false;
    }

    /* access modifiers changed from: package-private */
    public void d(int i2, float f2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        float f3 = f2;
        if (i7 != this.i) {
            c(i7, this.e.getAdapter());
        } else if (!z && f3 == this.j) {
            return;
        }
        this.n = true;
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredWidth2 = this.g.getMeasuredWidth();
        int measuredWidth3 = this.h.getMeasuredWidth();
        int i8 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i9 = paddingRight + i8;
        int i10 = (width - (paddingLeft + i8)) - i9;
        float f4 = 0.5f + f3;
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        int i11 = ((width - i9) - ((int) (((float) i10) * f4))) - i8;
        int i12 = measuredWidth2 + i11;
        int baseline = this.f.getBaseline();
        int baseline2 = this.g.getBaseline();
        int baseline3 = this.h.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i13 = max - baseline;
        int i14 = max - baseline2;
        int i15 = max - baseline3;
        int i16 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f.getMeasuredHeight() + i13, this.g.getMeasuredHeight() + i14), this.h.getMeasuredHeight() + i15);
        int i17 = this.l & 112;
        if (i17 == 16) {
            i6 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i17 != 80) {
            i5 = i13 + paddingTop;
            i3 = i14 + paddingTop;
            i4 = paddingTop + i15;
            TextView textView = this.g;
            textView.layout(i11, i3, i12, textView.getMeasuredHeight() + i3);
            int min = Math.min(paddingLeft, (i11 - this.k) - measuredWidth);
            TextView textView2 = this.f;
            textView2.layout(min, i5, measuredWidth + min, textView2.getMeasuredHeight() + i5);
            int max3 = Math.max((width - paddingRight) - i16, i12 + this.k);
            TextView textView3 = this.h;
            textView3.layout(max3, i4, max3 + i16, textView3.getMeasuredHeight() + i4);
            this.j = f2;
            this.n = false;
        } else {
            i6 = (height - paddingBottom) - max2;
        }
        i5 = i13 + i6;
        i3 = i14 + i6;
        i4 = i6 + i15;
        TextView textView4 = this.g;
        textView4.layout(i11, i3, i12, textView4.getMeasuredHeight() + i3);
        int min2 = Math.min(paddingLeft, (i11 - this.k) - measuredWidth);
        TextView textView22 = this.f;
        textView22.layout(min2, i5, measuredWidth + min2, textView22.getMeasuredHeight() + i5);
        int max32 = Math.max((width - paddingRight) - i16, i12 + this.k);
        TextView textView32 = this.h;
        textView32.layout(max32, i4, max32 + i16, textView32.getMeasuredHeight() + i4);
        this.j = f2;
        this.n = false;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            a adapter = viewPager.getAdapter();
            viewPager.Q(this.o);
            viewPager.b(this.o);
            this.e = viewPager;
            WeakReference<a> weakReference = this.p;
            b(weakReference != null ? (a) weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.e;
        if (viewPager != null) {
            b(viewPager.getAdapter(), (a) null);
            this.e.Q((ViewPager.i) null);
            this.e.I(this.o);
            this.e = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.e != null) {
            float f2 = this.j;
            if (f2 < Utils.FLOAT_EPSILON) {
                f2 = Utils.FLOAT_EPSILON;
            }
            d(this.i, f2, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i2);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, (int) (((float) size) * 0.2f), -2);
            this.f.measure(childMeasureSpec2, childMeasureSpec);
            this.g.measure(childMeasureSpec2, childMeasureSpec);
            this.h.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i3) == 1073741824) {
                i4 = View.MeasureSpec.getSize(i3);
            } else {
                i4 = Math.max(getMinHeight(), this.g.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i4, i3, this.g.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.m) {
            super.requestLayout();
        }
    }

    public void setGravity(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f2) {
        int i2 = ((int) (f2 * 255.0f)) & 255;
        this.q = i2;
        int i3 = (i2 << 24) | (this.r & 16777215);
        this.f.setTextColor(i3);
        this.h.setTextColor(i3);
    }

    public void setTextColor(int i2) {
        this.r = i2;
        this.g.setTextColor(i2);
        int i3 = (this.q << 24) | (this.r & 16777215);
        this.f.setTextColor(i3);
        this.h.setTextColor(i3);
    }

    public void setTextSpacing(int i2) {
        this.k = i2;
        requestLayout();
    }
}
