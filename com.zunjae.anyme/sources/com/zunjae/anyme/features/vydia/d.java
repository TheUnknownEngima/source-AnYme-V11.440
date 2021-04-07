package com.zunjae.anyme.features.vydia;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public abstract class d implements View.OnTouchListener, n {
    /* access modifiers changed from: private */
    public float e = -1.0f;
    /* access modifiers changed from: private */
    public float f = -1.0f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public float h;
    /* access modifiers changed from: private */
    public final int i;
    /* access modifiers changed from: private */
    public v j;
    private final GestureDetector k;
    /* access modifiers changed from: private */
    public final boolean l;
    /* access modifiers changed from: private */
    public final int m;

    private final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            v62.e(motionEvent, "e");
            d.this.e(motionEvent);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            v62.e(motionEvent, "e");
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            v62.e(motionEvent, "e1");
            v62.e(motionEvent2, "e2");
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            d dVar;
            int i;
            d dVar2;
            int i2;
            v62.e(motionEvent, "e1");
            v62.e(motionEvent2, "e2");
            float y = motionEvent2.getY() - motionEvent.getY();
            float x = motionEvent2.getX() - motionEvent.getX();
            float x2 = motionEvent2.getX();
            float y2 = motionEvent2.getY();
            if (d.this.j == v.None && motionEvent.getY() < ((float) d.this.m)) {
                return false;
            }
            "DeltaX = " + x + " | DeltaY = " + y;
            if (Math.abs(x) > Math.abs(y)) {
                if (d.this.j == v.None) {
                    d.this.c(v.Horizontal);
                    d.this.j = v.Horizontal;
                }
                if (Math.abs(x) > ((float) d.this.i)) {
                    m mVar = x2 >= d.this.e ? m.Right : m.Left;
                    if (Math.abs(x2 - d.this.e) > d.this.h) {
                        if (mVar == m.Right) {
                            dVar2 = d.this;
                            i2 = dVar2.g + 1;
                        } else {
                            dVar2 = d.this;
                            i2 = dVar2.g - 1;
                        }
                        dVar2.g = i2;
                        d dVar3 = d.this;
                        dVar3.b(motionEvent2, x, mVar, dVar3.g);
                        d.this.e = motionEvent2.getX();
                    }
                }
            } else {
                if (d.this.j == v.None) {
                    d.this.c(v.Vertical);
                    d.this.j = v.Vertical;
                }
                if (Math.abs(y) > ((float) d.this.i)) {
                    w wVar = y2 >= d.this.f ? w.Down : w.Up;
                    if (Math.abs(y2 - d.this.f) > d.this.h) {
                        if (wVar == w.Up) {
                            dVar = d.this;
                            i = dVar.g + 1;
                        } else {
                            dVar = d.this;
                            i = dVar.g - 1;
                        }
                        dVar.g = i;
                        if (d.this.l) {
                            d dVar4 = d.this;
                            dVar4.a(motionEvent2, y, wVar, dVar4.g);
                        }
                        d.this.f = motionEvent2.getY();
                    }
                }
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            v62.e(motionEvent, "e");
            d.this.d();
            return false;
        }
    }

    public d(Context context, o oVar, q qVar) {
        v62.e(context, "context");
        v62.e(oVar, "settings");
        v62.e(qVar, "info");
        float f2 = 5.0f;
        this.h = 5.0f;
        this.i = 100;
        this.j = v.None;
        this.k = new GestureDetector(context, new a());
        this.l = oVar.c();
        int i2 = e.a[oVar.a().ordinal()];
        if (i2 == 1) {
            f2 = 3.0f;
        } else if (i2 != 2) {
            if (i2 == 3) {
                f2 = 8.0f;
            } else {
                throw new j22();
            }
        }
        this.h = f2;
        this.m = (int) (((double) qVar.a()) * 0.2d);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        v62.e(motionEvent, "motionEvent");
        "OnTouch: " + motionEvent.getAction();
        if (motionEvent.getAction() == 1) {
            f(this.j, this.g);
            this.e = -1.0f;
            this.f = -1.0f;
            this.g = 0;
            this.j = v.None;
        }
        return this.k.onTouchEvent(motionEvent);
    }
}
