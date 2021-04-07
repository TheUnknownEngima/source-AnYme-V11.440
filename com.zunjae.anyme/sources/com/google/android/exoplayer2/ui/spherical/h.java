package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.ui.spherical.d;

class h extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {
    private final PointF e = new PointF();
    private final PointF f = new PointF();
    private final a g;
    private final float h;
    private final GestureDetector i;
    private volatile float j;
    private g k;

    interface a {
        void b(PointF pointF);
    }

    public h(Context context, a aVar, float f2) {
        this.g = aVar;
        this.h = f2;
        this.i = new GestureDetector(context, this);
        this.j = 3.1415927f;
    }

    public void a(float[] fArr, float f2) {
        this.j = -f2;
    }

    public void b(g gVar) {
        this.k = gVar;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.e.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = (motionEvent2.getX() - this.e.x) / this.h;
        float y = motionEvent2.getY();
        PointF pointF = this.e;
        float f4 = (y - pointF.y) / this.h;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.j;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f;
        pointF2.x -= (cos * x) - (sin * f4);
        float f5 = pointF2.y + (sin * x) + (cos * f4);
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        this.g.b(this.f);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        g gVar = this.k;
        if (gVar != null) {
            return gVar.onSingleTapUp(motionEvent);
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.i.onTouchEvent(motionEvent);
    }
}
