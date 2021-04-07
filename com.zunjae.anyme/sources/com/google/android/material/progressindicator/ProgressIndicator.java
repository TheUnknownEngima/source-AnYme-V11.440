package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;

public class ProgressIndicator extends ProgressBar {
    protected static final int p = R$style.Widget_MaterialComponents_ProgressIndicator_Linear_Determinate;
    private final l e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public boolean g;
    private boolean h;
    private int i;
    /* access modifiers changed from: private */
    public long j;
    private a k;
    /* access modifiers changed from: private */
    public boolean l;
    private final Runnable m;
    private final x6 n;
    private final x6 o;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ProgressIndicator.this.i();
            long unused = ProgressIndicator.this.j = -1;
        }
    }

    class b extends x6 {
        b() {
        }

        public void a(Drawable drawable) {
            ProgressIndicator.this.setIndeterminate(false);
            ProgressIndicator.this.p(0, false);
            ProgressIndicator progressIndicator = ProgressIndicator.this;
            progressIndicator.p(progressIndicator.f, ProgressIndicator.this.g);
        }
    }

    class c extends x6 {
        c() {
        }

        public void a(Drawable drawable) {
            super.a(drawable);
            if (!ProgressIndicator.this.l && ProgressIndicator.this.t()) {
                ProgressIndicator.this.setVisibility(4);
            }
        }
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.progressIndicatorStyle);
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, p);
    }

    public ProgressIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(bb1.c(context, attributeSet, i2, p), attributeSet, i2);
        this.l = false;
        this.m = new a();
        this.n = new b();
        this.o = new c();
        this.k = new a();
        this.h = true;
        Context context2 = getContext();
        l lVar = new l();
        this.e = lVar;
        lVar.b(context2, attributeSet, i2, i3);
        n(context2, attributeSet, i2, i3);
        if (this.e.a != 2) {
            h();
        }
    }

    private void g() {
        if (this.h) {
            getCurrentDrawable().setVisible(t(), false);
        }
    }

    private void h() {
        d dVar;
        if (this.e.a == 0) {
            i iVar = new i();
            setIndeterminateDrawable(new h(getContext(), this.e, iVar, l() ? new k() : new j(getContext())));
            dVar = new d(getContext(), this.e, iVar);
        } else {
            b bVar = new b();
            setIndeterminateDrawable(new h(getContext(), this.e, bVar, new c()));
            dVar = new d(getContext(), this.e, bVar);
        }
        setProgressDrawable(dVar);
        g();
    }

    /* access modifiers changed from: private */
    public void i() {
        getCurrentDrawable().setVisible(false, false);
        if (m()) {
            setVisibility(4);
        }
    }

    private boolean k() {
        if (isIndeterminate()) {
            l lVar = this.e;
            return lVar.a == 0 && lVar.d.length >= 3;
        }
    }

    private boolean m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void n(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ProgressIndicator, i2, i3);
        if (obtainStyledAttributes.hasValue(R$styleable.ProgressIndicator_minHideDelay)) {
            this.i = Math.min(obtainStyledAttributes.getInt(R$styleable.ProgressIndicator_minHideDelay, -1), 1000);
        }
        obtainStyledAttributes.recycle();
    }

    private void o() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().s().c(this.n);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().l(this.o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().l(this.o);
        }
    }

    private void r() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().q(this.o);
            getIndeterminateDrawable().s().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().q(this.o);
        }
    }

    private void s() {
        getProgressDrawable().k();
        getIndeterminateDrawable().k();
        getIndeterminateDrawable().s().b();
    }

    /* access modifiers changed from: private */
    public boolean t() {
        return o4.N(this) && getWindowVisibility() == 0 && j();
    }

    public int getCircularInset() {
        return this.e.h;
    }

    public int getCircularRadius() {
        return this.e.i;
    }

    public e getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public f getCurrentDrawingDelegate() {
        return isIndeterminate() ? getIndeterminateDrawable().t() : getProgressDrawable().t();
    }

    public int getGrowMode() {
        return this.e.g;
    }

    public h getIndeterminateDrawable() {
        return (h) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColors() {
        return this.e.d;
    }

    public int getIndicatorCornerRadius() {
        return this.e.c;
    }

    public int getIndicatorType() {
        return this.e.a;
    }

    public int getIndicatorWidth() {
        return this.e.b;
    }

    public d getProgressDrawable() {
        return (d) super.getProgressDrawable();
    }

    public l getSpec() {
        return this.e;
    }

    public int getTrackColor() {
        return this.e.e;
    }

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public boolean l() {
        return this.e.j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (t()) {
            q();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.m);
        getCurrentDrawable().h();
        r();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        f currentDrawingDelegate = getCurrentDrawingDelegate();
        int b2 = currentDrawingDelegate.b(this.e);
        int a2 = currentDrawingDelegate.a(this.e);
        setMeasuredDimension(b2 < 0 ? getMeasuredWidth() : b2 + getPaddingLeft() + getPaddingRight(), a2 < 0 ? getMeasuredHeight() : a2 + getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (this.e.a == 0) {
            int paddingLeft = i2 - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i3 - (getPaddingTop() + getPaddingBottom());
            h indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            d progressDrawable = getProgressDrawable();
            if (progressDrawable != null) {
                progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
                return;
            }
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        g();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        g();
    }

    public void p(int i2, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i2);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null && !l()) {
            this.f = i2;
            this.g = z;
            this.l = true;
            if (this.k.a(getContext().getContentResolver()) == Utils.FLOAT_EPSILON) {
                this.n.a(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().s().e();
            }
        }
    }

    public void q() {
        if (this.i > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.k = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().g = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().g = aVar;
        }
    }

    public void setCircularInset(int i2) {
        l lVar = this.e;
        if (lVar.a == 1 && lVar.h != i2) {
            lVar.h = i2;
            invalidate();
        }
    }

    public void setCircularRadius(int i2) {
        l lVar = this.e;
        if (lVar.a == 1 && lVar.i != i2) {
            lVar.i = i2;
            invalidate();
        }
    }

    public void setGrowMode(int i2) {
        l lVar = this.e;
        if (lVar.g != i2) {
            lVar.g = i2;
            invalidate();
        }
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            if (!z) {
                if (l()) {
                    return;
                }
            }
            if (t()) {
                if (z) {
                    throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
                }
            }
            e currentDrawable = getCurrentDrawable();
            if (currentDrawable != null) {
                currentDrawable.h();
            }
            super.setIndeterminate(z);
            e currentDrawable2 = getCurrentDrawable();
            if (currentDrawable2 != null) {
                currentDrawable2.p(t(), false, false);
            }
            this.l = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof h) {
            ((h) drawable).h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColors(int[] iArr) {
        this.e.d = iArr;
        s();
        if (!k()) {
            this.e.j = false;
        }
        invalidate();
    }

    public void setIndicatorCornerRadius(int i2) {
        l lVar = this.e;
        if (lVar.c != i2) {
            lVar.c = Math.min(i2, lVar.b / 2);
            if (this.e.j && i2 > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in linear seamless mode.");
            }
        }
    }

    public void setIndicatorType(int i2) {
        if (!t() || this.e.a == i2) {
            this.e.a = i2;
            h();
            requestLayout();
            return;
        }
        throw new IllegalStateException("Cannot change indicatorType while the progress indicator is visible.");
    }

    public void setIndicatorWidth(int i2) {
        l lVar = this.e;
        if (lVar.b != i2) {
            lVar.b = i2;
            requestLayout();
        }
    }

    public void setInverse(boolean z) {
        l lVar = this.e;
        if (lVar.f != z) {
            lVar.f = z;
            invalidate();
        }
    }

    public void setLinearSeamless(boolean z) {
        h hVar;
        g gVar;
        if (this.e.j != z) {
            if (!t() || !isIndeterminate()) {
                if (k()) {
                    l lVar = this.e;
                    lVar.j = z;
                    if (z) {
                        lVar.c = 0;
                    }
                    if (z) {
                        hVar = getIndeterminateDrawable();
                        gVar = new k();
                    } else {
                        hVar = getIndeterminateDrawable();
                        gVar = new j(getContext());
                    }
                    hVar.u(gVar);
                } else {
                    this.e.j = false;
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change linearSeamless while the progress indicator is shown in indeterminate mode.");
        }
    }

    public synchronized void setProgress(int i2) {
        p(i2, false);
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof d) {
            d dVar = (d) drawable;
            dVar.h();
            super.setProgressDrawable(dVar);
            dVar.w(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setTrackColor(int i2) {
        l lVar = this.e;
        if (lVar.e != i2) {
            lVar.e = i2;
            s();
            invalidate();
        }
    }
}
