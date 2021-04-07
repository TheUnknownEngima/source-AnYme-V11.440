package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: bq1  reason: default package */
public class bq1 extends aq1 {
    private Paint c;

    public bq1(Paint paint, vp1 vp1) {
        super(paint, vp1);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
        this.c.setStrokeWidth((float) vp1.r());
    }

    public void a(Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float l = (float) this.b.l();
        int r = this.b.r();
        float n = this.b.n();
        int o = this.b.o();
        int s = this.b.s();
        int p = this.b.p();
        gp1 b = this.b.b();
        if ((b == gp1.SCALE && !z) || (b == gp1.SCALE_DOWN && z)) {
            l *= n;
        }
        if (i != p) {
            o = s;
        }
        if (b != gp1.FILL || i == p) {
            paint = this.a;
        } else {
            paint = this.c;
            paint.setStrokeWidth((float) r);
        }
        paint.setColor(o);
        canvas.drawCircle((float) i2, (float) i3, l, paint);
    }
}
