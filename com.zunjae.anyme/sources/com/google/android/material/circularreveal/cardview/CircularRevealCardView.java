package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

public class CircularRevealCardView extends MaterialCardView implements c {
    private final b w = new b(this);

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        this.w.a();
    }

    public void b() {
        this.w.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.w;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.w.e();
    }

    public int getCircularRevealScrimColor() {
        return this.w.f();
    }

    public c.e getRevealInfo() {
        return this.w.h();
    }

    public boolean isOpaque() {
        b bVar = this.w;
        return bVar != null ? bVar.j() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.w.k(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.w.l(i);
    }

    public void setRevealInfo(c.e eVar) {
        this.w.m(eVar);
    }
}
