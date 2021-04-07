package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.mikephil.charting.utils.Utils;

public final class h extends e {
    private final f q;
    /* access modifiers changed from: private */
    public g<AnimatorSet> r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            h.this.r.a();
            h.this.r.f();
        }
    }

    public h(Context context, l lVar, f fVar, g<AnimatorSet> gVar) {
        super(context, lVar);
        this.q = fVar;
        u(gVar);
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.q.d(canvas, this.f, f());
            float f = ((float) this.f.b) * f();
            float f2 = ((float) this.f.c) * f();
            this.q.c(canvas, this.n, this.l, Utils.FLOAT_EPSILON, 1.0f, f, f2);
            int i = 0;
            while (true) {
                g<AnimatorSet> gVar = this.r;
                int[] iArr = gVar.c;
                if (i < iArr.length) {
                    f fVar = this.q;
                    Paint paint = this.n;
                    int i2 = iArr[i];
                    float[] fArr = gVar.b;
                    int i3 = i * 2;
                    fVar.c(canvas, paint, i2, fArr[i3], fArr[i3 + 1], f, f2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public int getIntrinsicHeight() {
        return this.q.a(this.f);
    }

    public int getIntrinsicWidth() {
        return this.q.b(this.f);
    }

    public boolean p(boolean z, boolean z2, boolean z3) {
        boolean p = super.p(z, z2, z3);
        if (!isRunning()) {
            this.r.a();
            this.r.f();
        }
        if (z && z3) {
            this.r.g();
        }
        return p;
    }

    public g<AnimatorSet> s() {
        return this.r;
    }

    public f t() {
        return this.q;
    }

    public void u(g<AnimatorSet> gVar) {
        this.r = gVar;
        gVar.d(this);
        g().addListener(new a());
        m(1.0f);
    }
}
