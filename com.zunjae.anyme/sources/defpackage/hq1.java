package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: hq1  reason: default package */
public class hq1 extends aq1 {
    public hq1(Paint paint, vp1 vp1) {
        super(paint, vp1);
    }

    public void a(Canvas canvas, xo1 xo1, int i, int i2) {
        if (xo1 instanceof cp1) {
            int a = ((cp1) xo1).a();
            int s = this.b.s();
            int o = this.b.o();
            int l = this.b.l();
            this.a.setColor(s);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = (float) l;
            canvas.drawCircle(f, f2, f3, this.a);
            this.a.setColor(o);
            float f4 = (float) a;
            if (this.b.f() == wp1.HORIZONTAL) {
                canvas.drawCircle(f4, f2, f3, this.a);
            } else {
                canvas.drawCircle(f, f4, f3, this.a);
            }
        }
    }
}
