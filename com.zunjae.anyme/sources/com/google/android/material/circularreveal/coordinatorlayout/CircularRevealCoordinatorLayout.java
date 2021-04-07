package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {
    private final b D = new b(this);

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        this.D.a();
    }

    public void b() {
        this.D.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.D;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.D.e();
    }

    public int getCircularRevealScrimColor() {
        return this.D.f();
    }

    public c.e getRevealInfo() {
        return this.D.h();
    }

    public boolean isOpaque() {
        b bVar = this.D;
        return bVar != null ? bVar.j() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.D.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.D.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.D.m(eVar);
    }
}
