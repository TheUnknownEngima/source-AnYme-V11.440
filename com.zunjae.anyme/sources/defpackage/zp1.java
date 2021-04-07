package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: zp1  reason: default package */
public class zp1 {
    private bq1 a;
    private cq1 b;
    private gq1 c;
    private kq1 d;
    private hq1 e;
    private eq1 f;
    private jq1 g;
    private dq1 h;
    private iq1 i;
    private fq1 j;
    private int k;
    private int l;
    private int m;

    public zp1(vp1 vp1) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.a = new bq1(paint, vp1);
        this.b = new cq1(paint, vp1);
        this.c = new gq1(paint, vp1);
        this.d = new kq1(paint, vp1);
        this.e = new hq1(paint, vp1);
        this.f = new eq1(paint, vp1);
        this.g = new jq1(paint, vp1);
        this.h = new dq1(paint, vp1);
        this.i = new iq1(paint, vp1);
        this.j = new fq1(paint, vp1);
    }

    public void a(Canvas canvas, boolean z) {
        if (this.b != null) {
            this.a.a(canvas, this.k, z, this.l, this.m);
        }
    }

    public void b(Canvas canvas, xo1 xo1) {
        cq1 cq1 = this.b;
        if (cq1 != null) {
            cq1.a(canvas, xo1, this.k, this.l, this.m);
        }
    }

    public void c(Canvas canvas, xo1 xo1) {
        dq1 dq1 = this.h;
        if (dq1 != null) {
            dq1.a(canvas, xo1, this.l, this.m);
        }
    }

    public void d(Canvas canvas, xo1 xo1) {
        eq1 eq1 = this.f;
        if (eq1 != null) {
            eq1.a(canvas, xo1, this.k, this.l, this.m);
        }
    }

    public void e(Canvas canvas, xo1 xo1) {
        gq1 gq1 = this.c;
        if (gq1 != null) {
            gq1.a(canvas, xo1, this.k, this.l, this.m);
        }
    }

    public void f(Canvas canvas, xo1 xo1) {
        fq1 fq1 = this.j;
        if (fq1 != null) {
            fq1.a(canvas, xo1, this.k, this.l, this.m);
        }
    }

    public void g(Canvas canvas, xo1 xo1) {
        hq1 hq1 = this.e;
        if (hq1 != null) {
            hq1.a(canvas, xo1, this.l, this.m);
        }
    }

    public void h(Canvas canvas, xo1 xo1) {
        iq1 iq1 = this.i;
        if (iq1 != null) {
            iq1.a(canvas, xo1, this.k, this.l, this.m);
        }
    }

    public void i(Canvas canvas, xo1 xo1) {
        jq1 jq1 = this.g;
        if (jq1 != null) {
            jq1.a(canvas, xo1, this.l, this.m);
        }
    }

    public void j(Canvas canvas, xo1 xo1) {
        kq1 kq1 = this.d;
        if (kq1 != null) {
            kq1.a(canvas, xo1, this.l, this.m);
        }
    }

    public void k(int i2, int i3, int i4) {
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }
}
