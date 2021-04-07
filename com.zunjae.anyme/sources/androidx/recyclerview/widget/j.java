package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

public class j extends RecyclerView.y {
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    protected PointF k;
    private final DisplayMetrics l;
    private boolean m = false;
    private float n;
    protected int o = 0;
    protected int p = 0;

    public j(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.m) {
            this.n = v(this.l);
            this.m = true;
        }
        return this.n;
    }

    private int y(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public int B() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != Utils.FLOAT_EPSILON) {
                return f > Utils.FLOAT_EPSILON ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void C(RecyclerView.y.a aVar) {
        PointF a = a(f());
        if (a == null || (a.x == Utils.FLOAT_EPSILON && a.y == Utils.FLOAT_EPSILON)) {
            aVar.b(f());
            r();
            return;
        }
        i(a);
        this.k = a;
        this.o = (int) (a.x * 10000.0f);
        this.p = (int) (a.y * 10000.0f);
        aVar.d((int) (((float) this.o) * 1.2f), (int) (((float) this.p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.i);
    }

    /* access modifiers changed from: protected */
    public void l(int i2, int i3, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.o = y(this.o, i2);
        int y = y(this.p, i3);
        this.p = y;
        if (this.o == 0 && y == 0) {
            C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        int t = t(view, z());
        int u = u(view, B());
        int w = w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.d(-t, -u, w, this.j);
        }
    }

    public int s(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int t(View view, int i2) {
        RecyclerView.o e = e();
        if (e == null || !e.u()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return s(e.a0(view) - layoutParams.leftMargin, e.d0(view) + layoutParams.rightMargin, e.getPaddingLeft(), e.u0() - e.getPaddingRight(), i2);
    }

    public int u(View view, int i2) {
        RecyclerView.o e = e();
        if (e == null || !e.v()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return s(e.e0(view) - layoutParams.topMargin, e.Y(view) + layoutParams.bottomMargin, e.getPaddingTop(), e.g0() - e.getPaddingBottom(), i2);
    }

    /* access modifiers changed from: protected */
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int w(int i2) {
        return (int) Math.ceil(((double) x(i2)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int x(int i2) {
        return (int) Math.ceil((double) (((float) Math.abs(i2)) * A()));
    }

    /* access modifiers changed from: protected */
    public int z() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != Utils.FLOAT_EPSILON) {
                return f > Utils.FLOAT_EPSILON ? 1 : -1;
            }
        }
        return 0;
    }
}
