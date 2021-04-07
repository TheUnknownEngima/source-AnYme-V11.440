package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: dq1  reason: default package */
public class dq1 extends aq1 {
    public dq1(Paint paint, vp1 vp1) {
        super(paint, vp1);
    }

    public void a(Canvas canvas, xo1 xo1, int i, int i2) {
        int i3;
        float f;
        if (xo1 instanceof zo1) {
            zo1 zo1 = (zo1) xo1;
            int s = this.b.s();
            int o = this.b.o();
            this.a.setColor(s);
            canvas.drawCircle((float) i, (float) i2, (float) this.b.l(), this.a);
            this.a.setColor(o);
            if (this.b.f() == wp1.HORIZONTAL) {
                f = (float) zo1.c();
                i3 = zo1.a();
            } else {
                f = (float) zo1.a();
                i3 = zo1.c();
            }
            canvas.drawCircle(f, (float) i3, (float) zo1.b(), this.a);
        }
    }
}
