package com.rd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;
import com.rd.a;
import defpackage.tp1;

public class PageIndicatorView extends View implements ViewPager.i, a.C0156a, ViewPager.h {
    private a e;
    private DataSetObserver f;
    private ViewPager g;
    private boolean h;

    class a extends DataSetObserver {
        a() {
        }

        public void onChanged() {
            PageIndicatorView.this.u();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                yp1[] r0 = defpackage.yp1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                yp1 r1 = defpackage.yp1.On     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                yp1 r1 = defpackage.yp1.Off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                yp1 r1 = defpackage.yp1.Auto     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.b.<clinit>():void");
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(attributeSet);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j(attributeSet);
    }

    private int g(int i) {
        int c = this.e.d().c() - 1;
        if (i < 0) {
            return 0;
        }
        return i > c ? c : i;
    }

    private ViewPager h(ViewGroup viewGroup, int i) {
        View findViewById;
        if (viewGroup.getChildCount() > 0 && (findViewById = viewGroup.findViewById(i)) != null && (findViewById instanceof ViewPager)) {
            return (ViewPager) findViewById;
        }
        return null;
    }

    private void i(ViewParent viewParent) {
        if (viewParent != null && (viewParent instanceof ViewGroup) && ((ViewGroup) viewParent).getChildCount() > 0) {
            ViewPager h2 = h((ViewGroup) viewParent, this.e.d().t());
            if (h2 != null) {
                setViewPager(h2);
            } else {
                i(viewParent.getParent());
            }
        }
    }

    private void j(AttributeSet attributeSet) {
        s();
        k(attributeSet);
    }

    private void k(AttributeSet attributeSet) {
        a aVar = new a(this);
        this.e = aVar;
        aVar.c().c(getContext(), attributeSet);
        vp1 d = this.e.d();
        d.J(getPaddingLeft());
        d.L(getPaddingTop());
        d.K(getPaddingRight());
        d.I(getPaddingBottom());
        this.h = d.x();
    }

    private boolean l() {
        int i = b.a[this.e.d().m().ordinal()];
        if (i != 1) {
            return i == 3 && m3.b(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    private boolean m() {
        return (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
    }

    private void n(int i, float f2) {
        vp1 d = this.e.d();
        if (m() && d.x() && d.b() != gp1.NONE) {
            Pair<Integer, Float> e2 = lq1.e(d, i, f2, l());
            r(((Integer) e2.first).intValue(), ((Float) e2.second).floatValue());
        }
    }

    private void o(int i) {
        vp1 d = this.e.d();
        boolean m = m();
        int c = d.c();
        if (m) {
            if (l()) {
                i = (c - 1) - i;
            }
            setSelection(i);
        }
    }

    private void p() {
        ViewPager viewPager;
        if (this.f == null && (viewPager = this.g) != null && viewPager.getAdapter() != null) {
            this.f = new a();
            try {
                this.g.getAdapter().m(this.f);
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void s() {
        if (getId() == -1) {
            setId(nq1.b());
        }
    }

    private void t() {
        ViewPager viewPager;
        if (this.f != null && (viewPager = this.g) != null && viewPager.getAdapter() != null) {
            try {
                this.g.getAdapter().u(this.f);
                this.f = null;
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        ViewPager viewPager = this.g;
        if (viewPager != null && viewPager.getAdapter() != null) {
            int e2 = this.g.getAdapter().e();
            int currentItem = l() ? (e2 - 1) - this.g.getCurrentItem() : this.g.getCurrentItem();
            this.e.d().Q(currentItem);
            this.e.d().R(currentItem);
            this.e.d().F(currentItem);
            this.e.d().B(e2);
            this.e.b().b();
            v();
            requestLayout();
        }
    }

    private void v() {
        if (this.e.d().v()) {
            int c = this.e.d().c();
            int visibility = getVisibility();
            if (visibility != 0 && c > 1) {
                setVisibility(0);
            } else if (visibility != 4 && c <= 1) {
                setVisibility(4);
            }
        }
    }

    public void a(int i, float f2, int i2) {
        n(i, f2);
    }

    public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        u();
    }

    public void c() {
        invalidate();
    }

    public void d(int i) {
        if (i == 0) {
            this.e.d().E(this.h);
        }
    }

    public void e(int i) {
        o(i);
    }

    public long getAnimationDuration() {
        return this.e.d().a();
    }

    public int getCount() {
        return this.e.d().c();
    }

    public int getPadding() {
        return this.e.d().g();
    }

    public int getRadius() {
        return this.e.d().l();
    }

    public float getScaleFactor() {
        return this.e.d().n();
    }

    public int getSelectedColor() {
        return this.e.d().o();
    }

    public int getSelection() {
        return this.e.d().p();
    }

    public int getStrokeWidth() {
        return this.e.d().r();
    }

    public int getUnselectedColor() {
        return this.e.d().s();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i(getParent());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        t();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.e.c().a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Pair<Integer, Integer> d = this.e.c().d(i, i2);
        setMeasuredDimension(((Integer) d.first).intValue(), ((Integer) d.second).intValue());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof xp1) {
            vp1 d = this.e.d();
            xp1 xp1 = (xp1) parcelable;
            d.Q(xp1.b());
            d.R(xp1.c());
            d.F(xp1.a());
            parcelable = xp1.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        vp1 d = this.e.d();
        xp1 xp1 = new xp1(super.onSaveInstanceState());
        xp1.e(d.p());
        xp1.f(d.q());
        xp1.d(d.e());
        return xp1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.e.c().f(motionEvent);
        return true;
    }

    public void q() {
        ViewPager viewPager = this.g;
        if (viewPager != null) {
            viewPager.J(this);
            this.g = null;
        }
    }

    public void r(int i, float f2) {
        vp1 d = this.e.d();
        if (d.x()) {
            int c = d.c();
            if (c <= 0 || i < 0) {
                i = 0;
            } else {
                int i2 = c - 1;
                if (i > i2) {
                    i = i2;
                }
            }
            if (f2 < Utils.FLOAT_EPSILON) {
                f2 = Utils.FLOAT_EPSILON;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 == 1.0f) {
                d.F(d.p());
                d.Q(i);
            }
            d.R(i);
            this.e.b().c(f2);
        }
    }

    public void setAnimationDuration(long j) {
        this.e.d().y(j);
    }

    public void setAnimationType(gp1 gp1) {
        this.e.a((xo1) null);
        if (gp1 != null) {
            this.e.d().z(gp1);
        } else {
            this.e.d().z(gp1.NONE);
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.e.d().A(z);
        v();
    }

    public void setClickListener(tp1.b bVar) {
        this.e.c().e(bVar);
    }

    public void setCount(int i) {
        if (i >= 0 && this.e.d().c() != i) {
            this.e.d().B(i);
            v();
            requestLayout();
        }
    }

    public void setDynamicCount(boolean z) {
        this.e.d().C(z);
        if (z) {
            p();
        } else {
            t();
        }
    }

    public void setInteractiveAnimation(boolean z) {
        this.e.d().E(z);
        this.h = z;
    }

    public void setOrientation(wp1 wp1) {
        if (wp1 != null) {
            this.e.d().G(wp1);
            requestLayout();
        }
    }

    public void setPadding(float f2) {
        if (f2 < Utils.FLOAT_EPSILON) {
            f2 = Utils.FLOAT_EPSILON;
        }
        this.e.d().H((int) f2);
        invalidate();
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.e.d().H(mq1.a(i));
        invalidate();
    }

    public void setRadius(float f2) {
        if (f2 < Utils.FLOAT_EPSILON) {
            f2 = Utils.FLOAT_EPSILON;
        }
        this.e.d().M((int) f2);
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.e.d().M(mq1.a(i));
        invalidate();
    }

    public void setRtlMode(yp1 yp1) {
        vp1 d = this.e.d();
        if (yp1 == null) {
            yp1 = yp1.Off;
        }
        d.N(yp1);
        if (this.g != null) {
            int p = d.p();
            if (l()) {
                p = (d.c() - 1) - p;
            } else {
                ViewPager viewPager = this.g;
                if (viewPager != null) {
                    p = viewPager.getCurrentItem();
                }
            }
            d.F(p);
            d.R(p);
            d.Q(p);
            invalidate();
        }
    }

    public void setScaleFactor(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.3f) {
            f2 = 0.3f;
        }
        this.e.d().O(f2);
    }

    public void setSelected(int i) {
        vp1 d = this.e.d();
        gp1 b2 = d.b();
        d.z(gp1.NONE);
        setSelection(i);
        d.z(b2);
    }

    public void setSelectedColor(int i) {
        this.e.d().P(i);
        invalidate();
    }

    public void setSelection(int i) {
        vp1 d = this.e.d();
        int g2 = g(i);
        if (g2 != d.p() && g2 != d.q()) {
            d.E(false);
            d.F(d.p());
            d.R(g2);
            d.Q(g2);
            this.e.b().a();
        }
    }

    public void setStrokeWidth(float f2) {
        int l = this.e.d().l();
        if (f2 < Utils.FLOAT_EPSILON) {
            f2 = Utils.FLOAT_EPSILON;
        } else {
            float f3 = (float) l;
            if (f2 > f3) {
                f2 = f3;
            }
        }
        this.e.d().S((int) f2);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int a2 = mq1.a(i);
        int l = this.e.d().l();
        if (a2 < 0) {
            a2 = 0;
        } else if (a2 > l) {
            a2 = l;
        }
        this.e.d().S(a2);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.e.d().T(i);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        q();
        if (viewPager != null) {
            this.g = viewPager;
            viewPager.c(this);
            this.g.b(this);
            this.e.d().U(this.g.getId());
            setDynamicCount(this.e.d().w());
            u();
        }
    }
}
