package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.github.mikephil.charting.utils.Utils;

public class b extends Drawable implements Animatable {
    private static final Interpolator k = new LinearInterpolator();
    private static final Interpolator l = new u5();
    private static final int[] m = {-16777216};
    private final c e;
    private float f;
    private Resources g;
    private Animator h;
    float i;
    boolean j;

    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ c e;

        a(c cVar) {
            this.e = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.e);
            b.this.b(floatValue, this.e, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    class C0057b implements Animator.AnimatorListener {
        final /* synthetic */ c e;

        C0057b(c cVar) {
            this.e = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.e, true);
            this.e.A();
            this.e.l();
            b bVar = b.this;
            if (bVar.j) {
                bVar.j = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.e.x(false);
                return;
            }
            bVar.i += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            b.this.i = Utils.FLOAT_EPSILON;
        }
    }

    private static class c {
        final RectF a = new RectF();
        final Paint b = new Paint();
        final Paint c = new Paint();
        final Paint d = new Paint();
        float e = Utils.FLOAT_EPSILON;
        float f = Utils.FLOAT_EPSILON;
        float g = Utils.FLOAT_EPSILON;
        float h = 5.0f;
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p = 1.0f;
        float q;
        int r;
        int s;
        int t = 255;
        int u;

        c() {
            this.b.setStrokeCap(Paint.Cap.SQUARE);
            this.b.setAntiAlias(true);
            this.b.setStyle(Paint.Style.STROKE);
            this.c.setStyle(Paint.Style.FILL);
            this.c.setAntiAlias(true);
            this.d.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void A() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f2 = this.q;
            float f3 = (this.h / 2.0f) + f2;
            if (f2 <= Utils.FLOAT_EPSILON) {
                f3 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.r) * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f3, ((float) rect.centerY()) - f3, ((float) rect.centerX()) + f3, ((float) rect.centerY()) + f3);
            float f4 = this.e;
            float f5 = this.g;
            float f6 = (f4 + f5) * 360.0f;
            float f7 = ((this.f + f5) * 360.0f) - f6;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f8 = this.h / 2.0f;
            rectF.inset(f8, f8);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f9 = -f8;
            rectF.inset(f9, f9);
            canvas.drawArc(rectF, f6, f7, false, this.b);
            b(canvas, f6, f7, rectF);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, float f2, float f3, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.o.moveTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                this.o.lineTo(((float) this.r) * this.p, Utils.FLOAT_EPSILON);
                Path path3 = this.o;
                float f4 = this.p;
                path3.lineTo((((float) this.r) * f4) / 2.0f, ((float) this.s) * f4);
                this.o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.r) * this.p) / 2.0f), rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.t;
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.i[f()];
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return (this.j + 1) % this.i.length;
        }

        /* access modifiers changed from: package-private */
        public float g() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.i[this.j];
        }

        /* access modifiers changed from: package-private */
        public float i() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public float j() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public float k() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            t(f());
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.k = Utils.FLOAT_EPSILON;
            this.l = Utils.FLOAT_EPSILON;
            this.m = Utils.FLOAT_EPSILON;
            y(Utils.FLOAT_EPSILON);
            v(Utils.FLOAT_EPSILON);
            w(Utils.FLOAT_EPSILON);
        }

        /* access modifiers changed from: package-private */
        public void n(int i2) {
            this.t = i2;
        }

        /* access modifiers changed from: package-private */
        public void o(float f2, float f3) {
            this.r = (int) f2;
            this.s = (int) f3;
        }

        /* access modifiers changed from: package-private */
        public void p(float f2) {
            if (f2 != this.p) {
                this.p = f2;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(float f2) {
            this.q = f2;
        }

        /* access modifiers changed from: package-private */
        public void r(int i2) {
            this.u = i2;
        }

        /* access modifiers changed from: package-private */
        public void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void t(int i2) {
            this.j = i2;
            this.u = this.i[i2];
        }

        /* access modifiers changed from: package-private */
        public void u(int[] iArr) {
            this.i = iArr;
            t(0);
        }

        /* access modifiers changed from: package-private */
        public void v(float f2) {
            this.f = f2;
        }

        /* access modifiers changed from: package-private */
        public void w(float f2) {
            this.g = f2;
        }

        /* access modifiers changed from: package-private */
        public void x(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(float f2) {
            this.e = f2;
        }

        /* access modifiers changed from: package-private */
        public void z(float f2) {
            this.h = f2;
            this.b.setStrokeWidth(f2);
        }
    }

    public b(Context context) {
        u3.c(context);
        this.g = context.getResources();
        c cVar = new c();
        this.e = cVar;
        cVar.u(m);
        k(2.5f);
        m();
    }

    private void a(float f2, c cVar) {
        n(f2, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f2));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor((double) (cVar.j() / 0.8f)) + 1.0d)) - cVar.j()) * f2));
    }

    private int c(float f2, int i2, int i3) {
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        return ((i4 + ((int) (((float) (((i3 >> 24) & 255) - i4)) * f2))) << 24) | ((i5 + ((int) (((float) (((i3 >> 16) & 255) - i5)) * f2))) << 16) | ((i6 + ((int) (((float) (((i3 >> 8) & 255) - i6)) * f2))) << 8) | (i7 + ((int) (f2 * ((float) ((i3 & 255) - i7)))));
    }

    private void h(float f2) {
        this.f = f2;
    }

    private void i(float f2, float f3, float f4, float f5) {
        c cVar = this.e;
        float f6 = this.g.getDisplayMetrics().density;
        cVar.z(f3 * f6);
        cVar.q(f2 * f6);
        cVar.t(0);
        cVar.o(f4 * f6, f5 * f6);
    }

    private void m() {
        c cVar = this.e;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(k);
        ofFloat.addListener(new C0057b(cVar));
        this.h = ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void b(float f2, c cVar, boolean z) {
        float f3;
        float f4;
        if (this.j) {
            a(f2, cVar);
        } else if (f2 != 1.0f || z) {
            float j2 = cVar.j();
            if (f2 < 0.5f) {
                f3 = cVar.k();
                f4 = (l.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + f3;
            } else {
                float k2 = cVar.k() + 0.79f;
                float f5 = k2;
                f3 = k2 - (((1.0f - l.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f4 = f5;
            }
            cVar.y(f3);
            cVar.v(f4);
            cVar.w(j2 + (0.20999998f * f2));
            h((f2 + this.i) * 216.0f);
        }
    }

    public void d(boolean z) {
        this.e.x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f, bounds.exactCenterX(), bounds.exactCenterY());
        this.e.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f2) {
        this.e.p(f2);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.e.u(iArr);
        this.e.t(0);
        invalidateSelf();
    }

    public void g(float f2) {
        this.e.w(f2);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.e.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.h.isRunning();
    }

    public void j(float f2, float f3) {
        this.e.y(f2);
        this.e.v(f3);
        invalidateSelf();
    }

    public void k(float f2) {
        this.e.z(f2);
        invalidateSelf();
    }

    public void l(int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (i2 == 0) {
            f2 = 11.0f;
            f5 = 3.0f;
            f4 = 12.0f;
            f3 = 6.0f;
        } else {
            f2 = 7.5f;
            f5 = 2.5f;
            f4 = 10.0f;
            f3 = 5.0f;
        }
        i(f2, f5, f4, f3);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void n(float f2, c cVar) {
        cVar.r(f2 > 0.75f ? c((f2 - 0.75f) / 0.25f, cVar.h(), cVar.e()) : cVar.h());
    }

    public void setAlpha(int i2) {
        this.e.n(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j2;
        Animator animator;
        this.h.cancel();
        this.e.A();
        if (this.e.d() != this.e.g()) {
            this.j = true;
            animator = this.h;
            j2 = 666;
        } else {
            this.e.t(0);
            this.e.m();
            animator = this.h;
            j2 = 1332;
        }
        animator.setDuration(j2);
        this.h.start();
    }

    public void stop() {
        this.h.cancel();
        h(Utils.FLOAT_EPSILON);
        this.e.x(false);
        this.e.t(0);
        this.e.m();
        invalidateSelf();
    }
}
