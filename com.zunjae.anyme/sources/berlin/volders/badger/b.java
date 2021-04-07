package berlin.volders.badger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.Gravity;

public abstract class b {
    private final Rect a = new Rect();
    private final float b;
    private final float c;
    private final int d;

    static class a extends b {
        private final RectF e = new RectF();

        a(float f, float f2, int i) {
            super(f, f2, i);
        }

        /* access modifiers changed from: protected */
        public void d(Canvas canvas, Rect rect, Paint paint) {
            this.e.set(rect);
            canvas.drawOval(this.e, paint);
        }
    }

    protected b(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    private void a(int i, int i2, Rect rect, int i3) {
        if (Build.VERSION.SDK_INT < 17) {
            Gravity.apply(this.d, i, i2, rect, this.a);
            return;
        }
        Gravity.apply(this.d, i, i2, rect, this.a, i3);
    }

    public static b b(float f, int i) {
        return e(f, 1.0f, i);
    }

    public static b e(float f, float f2, int i) {
        return new a(f, f2, i);
    }

    public Rect c(Canvas canvas, Rect rect, Paint paint, int i) {
        float width = ((float) rect.width()) * this.b;
        float height = ((float) rect.height()) * this.b;
        float f = this.c;
        if (width < height * f) {
            height = width / f;
        } else {
            width = height * f;
        }
        a((int) width, (int) height, rect, i);
        d(canvas, this.a, paint);
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract void d(Canvas canvas, Rect rect, Paint paint);
}
