package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.g;
import com.github.mikephil.charting.utils.Utils;

class c implements e {
    final RectF a = new RectF();

    class a implements g.a {
        a() {
        }

        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                c.this.a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, Utils.FLOAT_EPSILON);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, Utils.FLOAT_EPSILON);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, Utils.FLOAT_EPSILON);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    c() {
    }

    private g p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new g(context.getResources(), colorStateList, f, f2, f3);
    }

    private g q(d dVar) {
        return (g) dVar.f();
    }

    public void a(d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        g p = p(context, colorStateList, f, f2, f3);
        p.m(dVar.d());
        dVar.c(p);
        i(dVar);
    }

    public void b(d dVar, float f) {
        q(dVar).p(f);
        i(dVar);
    }

    public float c(d dVar) {
        return q(dVar).l();
    }

    public float d(d dVar) {
        return q(dVar).g();
    }

    public void e(d dVar) {
    }

    public void f(d dVar, float f) {
        q(dVar).r(f);
    }

    public float g(d dVar) {
        return q(dVar).i();
    }

    public ColorStateList h(d dVar) {
        return q(dVar).f();
    }

    public void i(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.b((int) Math.ceil((double) l(dVar)), (int) Math.ceil((double) k(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void j() {
        g.r = new a();
    }

    public float k(d dVar) {
        return q(dVar).j();
    }

    public float l(d dVar) {
        return q(dVar).k();
    }

    public void m(d dVar) {
        q(dVar).m(dVar.d());
        i(dVar);
    }

    public void n(d dVar, ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    public void o(d dVar, float f) {
        q(dVar).q(f);
        i(dVar);
    }
}
