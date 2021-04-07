package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class OverlayListView extends ListView {
    private final List<a> e = new ArrayList();

    public static class a {
        private BitmapDrawable a;
        private float b = 1.0f;
        private Rect c;
        private Interpolator d;
        private long e;
        private Rect f;
        private int g;
        private float h = 1.0f;
        private float i = 1.0f;
        private long j;
        private boolean k;
        private boolean l;
        private C0029a m;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a  reason: collision with other inner class name */
        public interface C0029a {
            void a();
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            Rect rect2 = new Rect(rect);
            this.c = rect2;
            BitmapDrawable bitmapDrawable2 = this.a;
            if (bitmapDrawable2 != null && rect2 != null) {
                bitmapDrawable2.setAlpha((int) (this.b * 255.0f));
                this.a.setBounds(this.c);
            }
        }

        public BitmapDrawable a() {
            return this.a;
        }

        public boolean b() {
            return this.k;
        }

        public a c(float f2, float f3) {
            this.h = f2;
            this.i = f3;
            return this;
        }

        public a d(C0029a aVar) {
            this.m = aVar;
            return this;
        }

        public a e(long j2) {
            this.e = j2;
            return this;
        }

        public a f(Interpolator interpolator) {
            this.d = interpolator;
            return this;
        }

        public a g(int i2) {
            this.g = i2;
            return this;
        }

        public void h(long j2) {
            this.j = j2;
            this.k = true;
        }

        public void i() {
            this.k = true;
            this.l = true;
            C0029a aVar = this.m;
            if (aVar != null) {
                aVar.a();
            }
        }

        public boolean j(long j2) {
            if (this.l) {
                return false;
            }
            float min = Math.min(1.0f, ((float) (j2 - this.j)) / ((float) this.e));
            float f2 = Utils.FLOAT_EPSILON;
            float max = Math.max(Utils.FLOAT_EPSILON, min);
            if (this.k) {
                f2 = max;
            }
            Interpolator interpolator = this.d;
            float interpolation = interpolator == null ? f2 : interpolator.getInterpolation(f2);
            int i2 = (int) (((float) this.g) * interpolation);
            Rect rect = this.c;
            Rect rect2 = this.f;
            rect.top = rect2.top + i2;
            rect.bottom = rect2.bottom + i2;
            float f3 = this.h;
            float f4 = f3 + ((this.i - f3) * interpolation);
            this.b = f4;
            BitmapDrawable bitmapDrawable = this.a;
            if (!(bitmapDrawable == null || rect == null)) {
                bitmapDrawable.setAlpha((int) (f4 * 255.0f));
                this.a.setBounds(this.c);
            }
            if (this.k && f2 >= 1.0f) {
                this.l = true;
                C0029a aVar = this.m;
                if (aVar != null) {
                    aVar.a();
                }
            }
            return !this.l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(a aVar) {
        this.e.add(aVar);
    }

    public void b() {
        for (a next : this.e) {
            if (!next.b()) {
                next.h(getDrawingTime());
            }
        }
    }

    public void c() {
        for (a i : this.e) {
            i.i();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e.size() > 0) {
            Iterator<a> it = this.e.iterator();
            while (it.hasNext()) {
                a next = it.next();
                BitmapDrawable a2 = next.a();
                if (a2 != null) {
                    a2.draw(canvas);
                }
                if (!next.j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }
}
