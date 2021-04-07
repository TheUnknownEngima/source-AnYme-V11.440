package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;

public class ScrimInsetsFrameLayout extends FrameLayout {
    Drawable e;
    Rect f;
    private Rect g;
    private boolean h;
    private boolean i;

    class a implements k4 {
        a() {
        }

        public x4 a(View view, x4 x4Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f == null) {
                scrimInsetsFrameLayout.f = new Rect();
            }
            ScrimInsetsFrameLayout.this.f.set(x4Var.d(), x4Var.f(), x4Var.e(), x4Var.c());
            ScrimInsetsFrameLayout.this.a(x4Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!x4Var.h() || ScrimInsetsFrameLayout.this.e == null);
            o4.Z(ScrimInsetsFrameLayout.this);
            return x4Var.a();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = new Rect();
        this.h = true;
        this.i = true;
        TypedArray h2 = m.h(context, attributeSet, R$styleable.ScrimInsetsFrameLayout, i2, R$style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.e = h2.getDrawable(R$styleable.ScrimInsetsFrameLayout_insetForeground);
        h2.recycle();
        setWillNotDraw(true);
        o4.v0(this, new a());
    }

    /* access modifiers changed from: protected */
    public void a(x4 x4Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f != null && this.e != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.h) {
                this.g.set(0, 0, width, this.f.top);
                this.e.setBounds(this.g);
                this.e.draw(canvas);
            }
            if (this.i) {
                this.g.set(0, height - this.f.bottom, width, height);
                this.e.setBounds(this.g);
                this.e.draw(canvas);
            }
            Rect rect = this.g;
            Rect rect2 = this.f;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.e.setBounds(this.g);
            this.e.draw(canvas);
            Rect rect3 = this.g;
            Rect rect4 = this.f;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.e.setBounds(this.g);
            this.e.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.i = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.h = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.e = drawable;
    }
}
