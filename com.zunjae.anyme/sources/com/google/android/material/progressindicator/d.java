package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.github.mikephil.charting.utils.Utils;
import defpackage.o5;

public final class d extends e {
    private static final p5<d> v = new b("indicatorFraction");
    private final f q;
    private final r5 r;
    private final q5 s;
    private float t;
    private boolean u = false;

    class a implements o5.j {
        a() {
        }

        public void a(o5 o5Var, float f, float f2) {
            d.this.v(f / 10000.0f);
        }
    }

    static class b extends p5<d> {
        b(String str) {
            super(str);
        }

        /* renamed from: c */
        public float a(d dVar) {
            return dVar.u();
        }

        /* renamed from: d */
        public void b(d dVar, float f) {
            dVar.v(f);
        }
    }

    public d(Context context, l lVar, f fVar) {
        super(context, lVar);
        this.q = fVar;
        r5 r5Var = new r5();
        this.r = r5Var;
        r5Var.d(1.0f);
        this.r.f(50.0f);
        q5 q5Var = new q5(this, v);
        this.s = q5Var;
        q5Var.q(this.r);
        this.s.b(new a());
        m(1.0f);
    }

    /* access modifiers changed from: private */
    public float u() {
        return this.t;
    }

    /* access modifiers changed from: private */
    public void v(float f) {
        this.t = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.q.d(canvas, this.f, f());
            float f = ((float) this.f.b) * f();
            float f2 = ((float) this.f.c) * f();
            float f3 = f;
            float f4 = f2;
            this.q.c(canvas, this.n, this.f.e, Utils.FLOAT_EPSILON, 1.0f, f3, f4);
            this.q.c(canvas, this.n, this.m[0], Utils.FLOAT_EPSILON, u(), f3, f4);
            canvas.restore();
        }
    }

    public int getIntrinsicHeight() {
        return this.q.a(this.f);
    }

    public int getIntrinsicWidth() {
        return this.q.b(this.f);
    }

    public void jumpToCurrentState() {
        this.s.c();
        v(((float) getLevel()) / 10000.0f);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.u) {
            this.s.c();
            v(((float) i) / 10000.0f);
            return true;
        }
        this.s.j(u() * 10000.0f);
        this.s.n((float) i);
        return true;
    }

    public boolean p(boolean z, boolean z2, boolean z3) {
        boolean p = super.p(z, z2, z3);
        float a2 = this.g.a(this.e.getContentResolver());
        if (a2 == Utils.FLOAT_EPSILON) {
            this.u = true;
        } else {
            this.u = false;
            this.r.f(50.0f / a2);
        }
        return p;
    }

    public f t() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void w(float f) {
        setLevel((int) (f * 10000.0f));
    }
}
