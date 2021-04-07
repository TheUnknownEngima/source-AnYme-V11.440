package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.g;

class a extends c {

    /* renamed from: androidx.cardview.widget.a$a  reason: collision with other inner class name */
    class C0012a implements g.a {
        C0012a(a aVar) {
        }

        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    a() {
    }

    public void j() {
        g.r = new C0012a(this);
    }
}
