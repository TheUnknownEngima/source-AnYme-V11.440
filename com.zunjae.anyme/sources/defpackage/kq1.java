package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: kq1  reason: default package */
public class kq1 extends aq1 {
    public RectF c = new RectF();

    public kq1(Paint paint, vp1 vp1) {
        super(paint, vp1);
    }

    public void a(Canvas canvas, xo1 xo1, int i, int i2) {
        RectF rectF;
        if (xo1 instanceof fp1) {
            fp1 fp1 = (fp1) xo1;
            int b = fp1.b();
            int a = fp1.a();
            int l = this.b.l();
            int s = this.b.s();
            int o = this.b.o();
            if (this.b.f() == wp1.HORIZONTAL) {
                rectF = this.c;
                rectF.left = (float) b;
                rectF.right = (float) a;
                rectF.top = (float) (i2 - l);
                a = i2 + l;
            } else {
                rectF = this.c;
                rectF.left = (float) (i - l);
                rectF.right = (float) (i + l);
                rectF.top = (float) b;
            }
            rectF.bottom = (float) a;
            this.a.setColor(s);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) l;
            canvas.drawCircle(f, f2, f3, this.a);
            this.a.setColor(o);
            canvas.drawRoundRect(this.c, f3, f3, this.a);
        }
    }
}
