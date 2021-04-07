package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.material.circularreveal.c;

public class CircularRevealRelativeLayout extends RelativeLayout implements c {
    private final b e = new b(this);

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        this.e.a();
    }

    public void b() {
        this.e.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.e;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.e.e();
    }

    public int getCircularRevealScrimColor() {
        return this.e.f();
    }

    public c.e getRevealInfo() {
        return this.e.h();
    }

    public boolean isOpaque() {
        b bVar = this.e;
        return bVar != null ? bVar.j() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.e.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.e.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.e.m(eVar);
    }
}
