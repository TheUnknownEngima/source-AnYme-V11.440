package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: jq1  reason: default package */
public class jq1 extends kq1 {
    public jq1(Paint paint, vp1 vp1) {
        super(paint, vp1);
    }

    public void a(Canvas canvas, xo1 xo1, int i, int i2) {
        float f;
        RectF rectF;
        if (xo1 instanceof ep1) {
            ep1 ep1 = (ep1) xo1;
            int b = ep1.b();
            int a = ep1.a();
            int e = ep1.e() / 2;
            int l = this.b.l();
            int s = this.b.s();
            int o = this.b.o();
            if (this.b.f() == wp1.HORIZONTAL) {
                rectF = this.c;
                rectF.left = (float) b;
                rectF.right = (float) a;
                rectF.top = (float) (i2 - e);
                f = (float) (e + i2);
            } else {
                rectF = this.c;
                rectF.left = (float) (i - e);
                rectF.right = (float) (e + i);
                rectF.top = (float) b;
                f = (float) a;
            }
            rectF.bottom = f;
            this.a.setColor(s);
            float f2 = (float) i;
            float f3 = (float) i2;
            float f4 = (float) l;
            canvas.drawCircle(f2, f3, f4, this.a);
            this.a.setColor(o);
            canvas.drawRoundRect(this.c, f4, f4, this.a);
        }
    }
}
