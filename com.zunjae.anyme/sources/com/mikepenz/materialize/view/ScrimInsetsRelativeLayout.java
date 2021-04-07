package com.mikepenz.materialize.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mikepenz.materialize.R$style;
import com.mikepenz.materialize.R$styleable;

public class ScrimInsetsRelativeLayout extends RelativeLayout implements a {
    /* access modifiers changed from: private */
    public Drawable e;
    /* access modifiers changed from: private */
    public Rect f;
    private Rect g;
    /* access modifiers changed from: private */
    public b h;
    private boolean i;
    private boolean j;
    private boolean k;

    class a implements k4 {
        a() {
        }

        public x4 a(View view, x4 x4Var) {
            if (ScrimInsetsRelativeLayout.this.f == null) {
                Rect unused = ScrimInsetsRelativeLayout.this.f = new Rect();
            }
            ScrimInsetsRelativeLayout.this.f.set(x4Var.d(), x4Var.f(), x4Var.e(), x4Var.c());
            ScrimInsetsRelativeLayout scrimInsetsRelativeLayout = ScrimInsetsRelativeLayout.this;
            scrimInsetsRelativeLayout.setWillNotDraw(scrimInsetsRelativeLayout.e == null);
            o4.Z(ScrimInsetsRelativeLayout.this);
            if (ScrimInsetsRelativeLayout.this.h != null) {
                ScrimInsetsRelativeLayout.this.h.a(x4Var);
            }
            return x4Var.a();
        }
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = new Rect();
        this.i = true;
        this.j = true;
        this.k = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrimInsetsRelativeLayout, i2, R$style.Widget_Materialize_ScrimInsetsRelativeLayout);
        this.e = obtainStyledAttributes.getDrawable(R$styleable.ScrimInsetsRelativeLayout_sirl_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        o4.v0(this, new a());
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f != null && this.e != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (!this.k) {
                Rect rect = this.f;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.left = 0;
            }
            if (this.i) {
                this.g.set(0, 0, width, this.f.top);
                this.e.setBounds(this.g);
                this.e.draw(canvas);
            }
            if (this.j) {
                this.g.set(0, height - this.f.bottom, width, height);
                this.e.setBounds(this.g);
                this.e.draw(canvas);
            }
            Rect rect2 = this.g;
            Rect rect3 = this.f;
            rect2.set(0, rect3.top, rect3.left, height - rect3.bottom);
            this.e.setBounds(this.g);
            this.e.draw(canvas);
            Rect rect4 = this.g;
            Rect rect5 = this.f;
            rect4.set(width - rect5.right, rect5.top, width, height - rect5.bottom);
            this.e.setBounds(this.g);
            this.e.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public Drawable getInsetForeground() {
        return this.e;
    }

    public b getOnInsetsCallback() {
        return this.h;
    }

    public ViewGroup getView() {
        return this;
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

    public void setInsetForeground(int i2) {
        this.e = new ColorDrawable(i2);
    }

    public void setInsetForeground(Drawable drawable) {
        this.e = drawable;
    }

    public void setOnInsetsCallback(b bVar) {
        this.h = bVar;
    }

    public void setSystemUIVisible(boolean z) {
        this.k = z;
    }

    public void setTintNavigationBar(boolean z) {
        this.j = z;
    }

    public void setTintStatusBar(boolean z) {
        this.i = z;
    }
}
