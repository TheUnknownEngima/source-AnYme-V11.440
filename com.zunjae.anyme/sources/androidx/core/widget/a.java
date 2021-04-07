package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.github.mikephil.charting.utils.Utils;

public abstract class a implements View.OnTouchListener {
    private static final int v = ViewConfiguration.getTapTimeout();
    final C0022a e = new C0022a();
    private final Interpolator f = new AccelerateInterpolator();
    final View g;
    private Runnable h;
    private float[] i = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};
    private float[] j = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int k;
    private int l;
    private float[] m = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};
    private float[] n = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};
    private float[] o = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    private static class C0022a {
        private int a;
        private int b;
        private float c;
        private float d;
        private long e = Long.MIN_VALUE;
        private long f = 0;
        private int g = 0;
        private int h = 0;
        private long i = -1;
        private float j;
        private int k;

        C0022a() {
        }

        private float e(long j2) {
            if (j2 < this.e) {
                return Utils.FLOAT_EPSILON;
            }
            long j3 = this.i;
            if (j3 < 0 || j2 < j3) {
                return a.e(((float) (j2 - this.e)) / ((float) this.a), Utils.FLOAT_EPSILON, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.j;
            return (1.0f - f2) + (f2 * a.e(((float) j4) / ((float) this.k), Utils.FLOAT_EPSILON, 1.0f));
        }

        private float g(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f)) * g2;
                this.g = (int) (this.c * f2);
                this.h = (int) (f2 * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f2 = this.c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f2, float f3) {
            this.c = f2;
            this.d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.s) {
                if (aVar.q) {
                    aVar.q = false;
                    aVar.e.m();
                }
                C0022a aVar2 = a.this.e;
                if (aVar2.h() || !a.this.u()) {
                    a.this.s = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.r) {
                    aVar3.r = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                o4.b0(a.this.g, this);
            }
        }
    }

    public a(View view) {
        this.g = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float) ((int) ((1575.0f * f2) + 0.5f));
        o(f3, f3);
        float f4 = (float) ((int) ((f2 * 315.0f) + 0.5f));
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(v);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.i[i2], f3, this.j[i2], f2);
        int i3 = (h2 > Utils.FLOAT_EPSILON ? 1 : (h2 == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i3 == 0) {
            return Utils.FLOAT_EPSILON;
        }
        float f5 = this.m[i2];
        float f6 = this.n[i2];
        float f7 = this.o[i2];
        float f8 = f5 * f4;
        return i3 > 0 ? e(h2 * f8, f6, f7) : -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        int i2 = this.k;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= Utils.FLOAT_EPSILON) {
                    return 1.0f - (f2 / f3);
                }
                if (!this.s || this.k != 1) {
                    return Utils.FLOAT_EPSILON;
                }
                return 1.0f;
            }
        } else if (i2 == 2 && f2 < Utils.FLOAT_EPSILON) {
            return f2 / (-f3);
        }
        return Utils.FLOAT_EPSILON;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, Utils.FLOAT_EPSILON, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < Utils.FLOAT_EPSILON) {
            f6 = -this.f.getInterpolation(-g2);
        } else if (g2 <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        } else {
            f6 = this.f.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    private void i() {
        if (this.q) {
            this.s = false;
        } else {
            this.e.i();
        }
    }

    private void v() {
        int i2;
        if (this.h == null) {
            this.h = new b();
        }
        this.s = true;
        this.q = true;
        if (this.p || (i2 = this.l) <= 0) {
            this.h.run();
        } else {
            o4.c0(this.g, this.h, (long) i2);
        }
        this.p = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
        this.g.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.l = i2;
        return this;
    }

    public a l(int i2) {
        this.k = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.t && !z) {
            i();
        }
        this.t = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.j;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.r = r2
            r5.p = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.e
            r7.l(r0, r6)
            boolean r6 = r5.s
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.u
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.s
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.n;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.e.j(i2);
        return this;
    }

    public a r(int i2) {
        this.e.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.i;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.m;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0022a aVar = this.e;
        int f2 = aVar.f();
        int d = aVar.d();
        return (f2 != 0 && b(f2)) || (d != 0 && a(d));
    }
}
