package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.q;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R$styleable;
import com.github.mikephil.charting.utils.Utils;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MotionLayout extends ConstraintLayout implements h4 {
    public static boolean H0;
    private int A = -1;
    float A0;
    int B = -1;
    private e B0 = new e();
    /* access modifiers changed from: private */
    public int C = -1;
    d C0 = new d();
    /* access modifiers changed from: private */
    public int D = 0;
    private boolean D0 = false;
    /* access modifiers changed from: private */
    public int E = 0;
    private RectF E0 = new RectF();
    private boolean F = true;
    private View F0 = null;
    HashMap<View, n> G = new HashMap<>();
    ArrayList<Integer> G0 = new ArrayList<>();
    private long H = 0;
    private float I = 1.0f;
    float J = Utils.FLOAT_EPSILON;
    float K = Utils.FLOAT_EPSILON;
    private long L;
    float M = Utils.FLOAT_EPSILON;
    private boolean N;
    boolean O = false;
    private g P;
    private float Q;
    private float R;
    int S = 0;
    c T;
    private boolean U = false;
    private p0 V = new p0();
    private b W = new b();
    private b a0;
    int b0;
    int c0;
    boolean d0 = false;
    View e0;
    float f0;
    float g0;
    long h0;
    float i0;
    private boolean j0 = false;
    private ArrayList<MotionHelper> k0 = null;
    private ArrayList<MotionHelper> l0 = null;
    private ArrayList<g> m0 = null;
    private int n0 = 0;
    private long o0 = -1;
    private float p0 = Utils.FLOAT_EPSILON;
    private int q0 = 0;
    private float r0 = Utils.FLOAT_EPSILON;
    boolean s0 = false;
    protected boolean t0 = false;
    int u0;
    int v0;
    int w0;
    q x;
    int x0;
    Interpolator y;
    int y0;
    float z = Utils.FLOAT_EPSILON;
    int z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            MotionLayout.this.e0.setNestedScrollingEnabled(true);
        }
    }

    class b extends o {
        float a = Utils.FLOAT_EPSILON;
        float b = Utils.FLOAT_EPSILON;
        float c;

        b() {
        }

        public float a() {
            return MotionLayout.this.z;
        }

        public void b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3 = this.a;
            if (f3 > Utils.FLOAT_EPSILON) {
                float f4 = this.c;
                if (f3 / f4 < f) {
                    f = f3 / f4;
                }
                MotionLayout motionLayout = MotionLayout.this;
                float f5 = this.a;
                float f6 = this.c;
                motionLayout.z = f5 - (f6 * f);
                f2 = (f5 * f) - (((f6 * f) * f) / 2.0f);
            } else {
                float f7 = this.c;
                if ((-f3) / f7 < f) {
                    f = (-f3) / f7;
                }
                MotionLayout motionLayout2 = MotionLayout.this;
                float f8 = this.a;
                float f9 = this.c;
                motionLayout2.z = (f9 * f) + f8;
                f2 = (f8 * f) + (((f9 * f) * f) / 2.0f);
            }
            return f2 + this.b;
        }
    }

    private class c {
        float[] a;
        int[] b;
        float[] c;
        Path d;
        Paint e;
        Paint f;
        Paint g;
        Paint h;
        Paint i;
        private float[] j;
        DashPathEffect k;
        int l;
        Rect m = new Rect();
        boolean n = false;
        int o = 1;

        public c() {
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            this.e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.h = paint4;
            paint4.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, Utils.FLOAT_EPSILON);
            this.k = dashPathEffect;
            this.g.setPathEffect(dashPathEffect);
            this.c = new float[100];
            this.b = new int[50];
            if (this.n) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.o = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.a, this.e);
        }

        private void d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < this.l; i2++) {
                if (this.b[i2] == 1) {
                    z = true;
                }
                if (this.b[i2] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                g(canvas);
            }
            if (z2) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.a;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f2, f4), Math.max(f3, f5), Math.max(f2, f4), Math.max(f3, f5), this.g);
            canvas.drawLine(Math.min(f2, f4), Math.min(f3, f5), Math.min(f2, f4), Math.max(f3, f5), this.g);
        }

        private void f(Canvas canvas, float f2, float f3) {
            Canvas canvas2 = canvas;
            float[] fArr = this.a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float min = Math.min(f4, f6);
            float max = Math.max(f5, f7);
            float min2 = f2 - Math.min(f4, f6);
            float max2 = Math.max(f5, f7) - f3;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            l(str, this.h);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.m.width() / 2))) + min, f3 - 20.0f, this.h);
            canvas.drawLine(f2, f3, Math.min(f4, f6), f3, this.g);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f7 - f5))) + 0.5d))) / 100.0f);
            l(str2, this.h);
            canvas2.drawText(str2, f2 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.m.height() / 2))), this.h);
            canvas.drawLine(f2, f3, f2, Math.max(f5, f7), this.g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        private void h(Canvas canvas, float f2, float f3) {
            float[] fArr = this.a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f4 - f6), (double) (f5 - f7));
            float f8 = f6 - f4;
            float f9 = f7 - f5;
            float f10 = (((f2 - f4) * f8) + ((f3 - f5) * f9)) / (hypot * hypot);
            float f11 = f4 + (f8 * f10);
            float f12 = f5 + (f10 * f9);
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f11, f12);
            float hypot2 = (float) Math.hypot((double) (f11 - f2), (double) (f12 - f3));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            l(str, this.h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.m.width() / 2)), -20.0f, this.h);
            canvas.drawLine(f2, f3, f11, f12, this.g);
        }

        private void i(Canvas canvas, float f2, float f3, int i2, int i3) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i2)))) + 0.5d))) / 100.0f);
            l(str, this.h);
            canvas2.drawText(str, ((f2 / 2.0f) - ((float) (this.m.width() / 2))) + Utils.FLOAT_EPSILON, f3 - 20.0f, this.h);
            canvas.drawLine(f2, f3, Math.min(Utils.FLOAT_EPSILON, 1.0f), f3, this.g);
            String str2 = "" + (((float) ((int) (((double) (((f3 - ((float) (i3 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i3)))) + 0.5d))) / 100.0f);
            l(str2, this.h);
            canvas2.drawText(str2, f2 + 5.0f, Utils.FLOAT_EPSILON - ((f3 / 2.0f) - ((float) (this.m.height() / 2))), this.h);
            canvas.drawLine(f2, f3, f2, Math.max(Utils.FLOAT_EPSILON, 1.0f), this.g);
        }

        private void j(Canvas canvas, n nVar) {
            this.d.reset();
            for (int i2 = 0; i2 <= 50; i2++) {
                nVar.e(((float) i2) / ((float) 50), this.j, 0);
                Path path = this.d;
                float[] fArr = this.j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.d;
                float[] fArr2 = this.j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.d;
                float[] fArr3 = this.j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.d;
                float[] fArr4 = this.j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.d.close();
            }
            this.e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.d, this.e);
            canvas.translate(-2.0f, -2.0f);
            this.e.setColor(-65536);
            canvas.drawPath(this.d, this.e);
        }

        private void k(Canvas canvas, int i2, int i3, n nVar) {
            int i4;
            int i5;
            float f2;
            float f3;
            int i6;
            Canvas canvas2 = canvas;
            int i7 = i2;
            n nVar2 = nVar;
            View view = nVar2.a;
            if (view != null) {
                i5 = view.getWidth();
                i4 = nVar2.a.getHeight();
            } else {
                i5 = 0;
                i4 = 0;
            }
            for (int i8 = 1; i8 < i3 - 1; i8++) {
                if (i7 != 4 || this.b[i8 - 1] != 0) {
                    float[] fArr = this.c;
                    int i9 = i8 * 2;
                    float f4 = fArr[i9];
                    float f5 = fArr[i9 + 1];
                    this.d.reset();
                    this.d.moveTo(f4, f5 + 10.0f);
                    this.d.lineTo(f4 + 10.0f, f5);
                    this.d.lineTo(f4, f5 - 10.0f);
                    this.d.lineTo(f4 - 10.0f, f5);
                    this.d.close();
                    int i10 = i8 - 1;
                    nVar2.k(i10);
                    if (i7 == 4) {
                        int[] iArr = this.b;
                        if (iArr[i10] == 1) {
                            h(canvas2, f4 - Utils.FLOAT_EPSILON, f5 - Utils.FLOAT_EPSILON);
                        } else if (iArr[i10] == 2) {
                            f(canvas2, f4 - Utils.FLOAT_EPSILON, f5 - Utils.FLOAT_EPSILON);
                        } else if (iArr[i10] == 3) {
                            i6 = 3;
                            f3 = f5;
                            f2 = f4;
                            i(canvas, f4 - Utils.FLOAT_EPSILON, f5 - Utils.FLOAT_EPSILON, i5, i4);
                            canvas2.drawPath(this.d, this.i);
                        }
                        f3 = f5;
                        f2 = f4;
                        i6 = 3;
                        canvas2.drawPath(this.d, this.i);
                    } else {
                        f3 = f5;
                        f2 = f4;
                        i6 = 3;
                    }
                    if (i7 == 2) {
                        h(canvas2, f2 - Utils.FLOAT_EPSILON, f3 - Utils.FLOAT_EPSILON);
                    }
                    if (i7 == i6) {
                        f(canvas2, f2 - Utils.FLOAT_EPSILON, f3 - Utils.FLOAT_EPSILON);
                    }
                    if (i7 == 6) {
                        i(canvas, f2 - Utils.FLOAT_EPSILON, f3 - Utils.FLOAT_EPSILON, i5, i4);
                    }
                    canvas2.drawPath(this.d, this.i);
                }
            }
            float[] fArr2 = this.a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        public void a(Canvas canvas, HashMap<View, n> hashMap, int i2, int i3) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i3 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.C) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.e);
                }
                for (n next : hashMap.values()) {
                    int h2 = next.h();
                    if (i3 > 0 && h2 == 0) {
                        h2 = 1;
                    }
                    if (h2 != 0) {
                        this.l = next.c(this.c, this.b);
                        if (h2 >= 1) {
                            int i4 = i2 / 16;
                            float[] fArr = this.a;
                            if (fArr == null || fArr.length != i4 * 2) {
                                this.a = new float[(i4 * 2)];
                                this.d = new Path();
                            }
                            int i5 = this.o;
                            canvas.translate((float) i5, (float) i5);
                            this.e.setColor(1996488704);
                            this.i.setColor(1996488704);
                            this.f.setColor(1996488704);
                            this.g.setColor(1996488704);
                            next.d(this.a, i4);
                            b(canvas, h2, this.l, next);
                            this.e.setColor(-21965);
                            this.f.setColor(-2067046);
                            this.i.setColor(-2067046);
                            this.g.setColor(-13391360);
                            int i6 = this.o;
                            canvas.translate((float) (-i6), (float) (-i6));
                            b(canvas, h2, this.l, next);
                            if (h2 == 5) {
                                j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i2, int i3, n nVar) {
            if (i2 == 4) {
                d(canvas);
            }
            if (i2 == 2) {
                g(canvas);
            }
            if (i2 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i2, i3, nVar);
        }

        /* access modifiers changed from: package-private */
        public void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.m);
        }
    }

    class d {
        f1 a = new f1();
        f1 b = new f1();
        androidx.constraintlayout.widget.c c = null;
        androidx.constraintlayout.widget.c d = null;
        int e;
        int f;

        d() {
        }

        private void i(f1 f1Var, androidx.constraintlayout.widget.c cVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, f1Var);
            sparseArray.put(MotionLayout.this.getId(), f1Var);
            Iterator<e1> it = f1Var.I0().iterator();
            while (it.hasNext()) {
                e1 next = it.next();
                sparseArray.put(((View) next.q()).getId(), next);
            }
            Iterator<e1> it2 = f1Var.I0().iterator();
            while (it2.hasNext()) {
                e1 next2 = it2.next();
                View view = (View) next2.q();
                cVar.g(view.getId(), layoutParams);
                next2.C0(cVar.v(view.getId()));
                next2.g0(cVar.q(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.e((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).t();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.g(false, view, next2, layoutParams, sparseArray);
                next2.B0(cVar.u(view.getId()) == 1 ? view.getVisibility() : cVar.t(view.getId()));
            }
            Iterator<e1> it3 = f1Var.I0().iterator();
            while (it3.hasNext()) {
                e1 next3 = it3.next();
                if (next3 instanceof i1) {
                    i1 i1Var = (i1) next3;
                    i1Var.b();
                    ((ConstraintHelper) next3.q()).r(f1Var, i1Var, sparseArray);
                    if (i1Var instanceof l1) {
                        ((l1) i1Var).J0();
                    }
                }
            }
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.G.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.G.put(childAt, new n(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                n nVar = MotionLayout.this.G.get(childAt2);
                if (nVar != null) {
                    if (this.c != null) {
                        e1 c2 = c(this.a, childAt2);
                        if (c2 != null) {
                            nVar.t(c2, this.c);
                        } else {
                            a.a() + "no widget for  " + a.c(childAt2) + " (" + childAt2.getClass().getName() + ")";
                        }
                    }
                    if (this.d != null) {
                        e1 c3 = c(this.b, childAt2);
                        if (c3 != null) {
                            nVar.q(c3, this.d);
                        } else {
                            a.a() + "no widget for  " + a.c(childAt2) + " (" + childAt2.getClass().getName() + ")";
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(f1 f1Var, f1 f1Var2) {
            ArrayList<e1> I0 = f1Var.I0();
            HashMap hashMap = new HashMap();
            hashMap.put(f1Var, f1Var2);
            f1Var2.I0().clear();
            f1Var2.k(f1Var, hashMap);
            Iterator<e1> it = I0.iterator();
            while (it.hasNext()) {
                e1 next = it.next();
                e1 a1Var = next instanceof a1 ? new a1() : next instanceof h1 ? new h1() : next instanceof g1 ? new g1() : next instanceof i1 ? new j1() : new e1();
                f1Var2.a(a1Var);
                hashMap.put(next, a1Var);
            }
            Iterator<e1> it2 = I0.iterator();
            while (it2.hasNext()) {
                e1 next2 = it2.next();
                ((e1) hashMap.get(next2)).k(next2, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        public e1 c(f1 f1Var, View view) {
            if (f1Var.q() == view) {
                return f1Var;
            }
            ArrayList<e1> I0 = f1Var.I0();
            int size = I0.size();
            for (int i = 0; i < size; i++) {
                e1 e1Var = I0.get(i);
                if (e1Var.q() == view) {
                    return e1Var;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void d(f1 f1Var, androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.c = cVar;
            this.d = cVar2;
            this.a.e1(MotionLayout.this.g.T0());
            this.b.e1(MotionLayout.this.g.T0());
            this.a.L0();
            this.b.L0();
            b(MotionLayout.this.g, this.a);
            b(MotionLayout.this.g, this.b);
            if (cVar != null) {
                i(this.a, cVar);
            }
            i(this.b, cVar2);
            this.a.g1(MotionLayout.this.t());
            this.a.i1();
            this.b.g1(MotionLayout.this.t());
            this.b.i1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.a.k0(e1.b.WRAP_CONTENT);
                    this.b.k0(e1.b.WRAP_CONTENT);
                }
                if (layoutParams.height == -2) {
                    this.a.y0(e1.b.WRAP_CONTENT);
                    this.b.y0(e1.b.WRAP_CONTENT);
                }
            }
        }

        public boolean e(int i, int i2) {
            return (i == this.e && i2 == this.f) ? false : true;
        }

        public void f(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.y0 = mode;
            motionLayout.z0 = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.B == motionLayout2.getStartState()) {
                MotionLayout.this.x(this.b, optimizationLevel, i, i2);
                if (this.c != null) {
                    MotionLayout.this.x(this.a, optimizationLevel, i, i2);
                }
            } else {
                if (this.c != null) {
                    MotionLayout.this.x(this.a, optimizationLevel, i, i2);
                }
                MotionLayout.this.x(this.b, optimizationLevel, i, i2);
            }
            MotionLayout.this.u0 = this.a.P();
            MotionLayout.this.v0 = this.a.v();
            MotionLayout.this.w0 = this.b.P();
            MotionLayout.this.x0 = this.b.v();
            MotionLayout motionLayout3 = MotionLayout.this;
            boolean z = true;
            motionLayout3.t0 = (motionLayout3.u0 == motionLayout3.w0 && motionLayout3.v0 == motionLayout3.x0) ? false : true;
            MotionLayout motionLayout4 = MotionLayout.this;
            int i3 = motionLayout4.u0;
            int i4 = motionLayout4.v0;
            if (motionLayout4.y0 == Integer.MIN_VALUE) {
                i3 = (int) (((float) i3) + (motionLayout4.A0 * ((float) (motionLayout4.w0 - i3))));
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            if (motionLayout5.z0 == Integer.MIN_VALUE) {
                int i5 = motionLayout5.v0;
                i4 = (int) (((float) i5) + (motionLayout5.A0 * ((float) (motionLayout5.x0 - i5))));
            }
            boolean z2 = this.a.a1() || this.b.a1();
            if (!this.a.Y0() && !this.b.Y0()) {
                z = false;
            }
            MotionLayout.this.w(i, i2, i3, i4, z2, z);
        }

        public void g() {
            f(MotionLayout.this.D, MotionLayout.this.E);
            MotionLayout.this.o0();
        }

        public void h(int i, int i2) {
            this.e = i;
            this.f = i2;
        }
    }

    protected interface e {
        void a();

        void b(MotionEvent motionEvent);

        float c();

        float d();

        void e(int i);
    }

    private static class f implements e {
        private static f b = new f();
        VelocityTracker a;

        private f() {
        }

        public static f f() {
            b.a = VelocityTracker.obtain();
            return b;
        }

        public void a() {
            this.a.recycle();
            this.a = null;
        }

        public void b(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public float c() {
            return this.a.getYVelocity();
        }

        public float d() {
            return this.a.getXVelocity();
        }

        public void e(int i) {
            this.a.computeCurrentVelocity(i);
        }
    }

    public interface g {
        void a(MotionLayout motionLayout, int i, int i2, float f);

        void b(MotionLayout motionLayout, int i, int i2);

        void c(MotionLayout motionLayout, int i, boolean z, float f);

        void d(MotionLayout motionLayout, int i);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h0(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h0(attributeSet);
    }

    private void T() {
        q qVar = this.x;
        if (qVar != null) {
            int x2 = qVar.x();
            q qVar2 = this.x;
            U(x2, qVar2.i(qVar2.x()));
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<q.b> it = this.x.l().iterator();
            while (it.hasNext()) {
                q.b next = it.next();
                q.b bVar = this.x.c;
                V(next);
                int A2 = next.A();
                int y2 = next.y();
                String b2 = a.b(getContext(), A2);
                String b3 = a.b(getContext(), y2);
                if (sparseIntArray.get(A2) == y2) {
                    "CHECK: two transitions with the same start and end " + b2 + "->" + b3;
                }
                if (sparseIntArray2.get(y2) == A2) {
                    "CHECK: you can't have reverse transitions" + b2 + "->" + b3;
                }
                sparseIntArray.put(A2, y2);
                sparseIntArray2.put(y2, A2);
                if (this.x.i(A2) == null) {
                    " no such constraintSetStart " + b2;
                }
                if (this.x.i(y2) == null) {
                    " no such constraintSetEnd " + b2;
                }
            }
        }
    }

    private void U(int i, androidx.constraintlayout.widget.c cVar) {
        String b2 = a.b(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                "CHECK: " + b2 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!";
            }
            if (cVar.p(id) == null) {
                "CHECK: " + b2 + " NO CONSTRAINTS for " + a.c(childAt);
            }
        }
        int[] r = cVar.r();
        for (int i3 = 0; i3 < r.length; i3++) {
            int i4 = r[i3];
            String b3 = a.b(getContext(), i4);
            if (findViewById(r[i3]) == null) {
                "CHECK: " + b2 + " NO View matches id " + b3;
            }
            if (cVar.q(i4) == -1) {
                "CHECK: " + b2 + "(" + b3 + ") no LAYOUT_HEIGHT";
            }
            if (cVar.v(i4) == -1) {
                "CHECK: " + b2 + "(" + b3 + ") no LAYOUT_HEIGHT";
            }
        }
    }

    private void V(q.b bVar) {
        "CHECK: transition = " + bVar.u(getContext());
        "CHECK: transition.setDuration = " + bVar.x();
        int A2 = bVar.A();
        int y2 = bVar.y();
    }

    private void W() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            n nVar = this.G.get(childAt);
            if (nVar != null) {
                nVar.s(childAt);
            }
        }
    }

    private void Y() {
        boolean z2;
        float signum = Math.signum(this.M - this.K);
        long nanoTime = getNanoTime();
        float f2 = this.K + (!(this.y instanceof p0) ? ((((float) (nanoTime - this.L)) * signum) * 1.0E-9f) / this.I : Utils.FLOAT_EPSILON);
        if (this.N) {
            f2 = this.M;
        }
        int i = (signum > Utils.FLOAT_EPSILON ? 1 : (signum == Utils.FLOAT_EPSILON ? 0 : -1));
        if ((i <= 0 || f2 < this.M) && (signum > Utils.FLOAT_EPSILON || f2 > this.M)) {
            z2 = false;
        } else {
            f2 = this.M;
            z2 = true;
        }
        Interpolator interpolator = this.y;
        if (interpolator != null && !z2) {
            f2 = this.U ? interpolator.getInterpolation(((float) (nanoTime - this.H)) * 1.0E-9f) : interpolator.getInterpolation(f2);
        }
        if ((i > 0 && f2 >= this.M) || (signum <= Utils.FLOAT_EPSILON && f2 <= this.M)) {
            f2 = this.M;
        }
        this.A0 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            n nVar = this.G.get(childAt);
            if (nVar != null) {
                nVar.o(childAt, f2, nanoTime2, this.B0);
            }
        }
        if (this.t0) {
            requestLayout();
        }
    }

    private void Z() {
        ArrayList<g> arrayList;
        if ((this.P != null || ((arrayList = this.m0) != null && !arrayList.isEmpty())) && this.r0 != this.J) {
            if (this.q0 != -1) {
                g gVar = this.P;
                if (gVar != null) {
                    gVar.b(this, this.A, this.C);
                }
                ArrayList<g> arrayList2 = this.m0;
                if (arrayList2 != null) {
                    Iterator<g> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, this.A, this.C);
                    }
                }
                this.s0 = true;
            }
            this.q0 = -1;
            float f2 = this.J;
            this.r0 = f2;
            g gVar2 = this.P;
            if (gVar2 != null) {
                gVar2.a(this, this.A, this.C, f2);
            }
            ArrayList<g> arrayList3 = this.m0;
            if (arrayList3 != null) {
                Iterator<g> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.A, this.C, this.J);
                }
            }
            this.s0 = true;
        }
    }

    private void b0(MotionLayout motionLayout, int i, int i2) {
        g gVar = this.P;
        if (gVar != null) {
            gVar.b(this, i, i2);
        }
        ArrayList<g> arrayList = this.m0;
        if (arrayList != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(motionLayout, i, i2);
            }
        }
    }

    private boolean g0(float f2, float f3, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (g0(((float) view.getLeft()) + f2, ((float) view.getTop()) + f3, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.E0.set(((float) view.getLeft()) + f2, ((float) view.getTop()) + f3, f2 + ((float) view.getRight()), f3 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            return this.E0.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent);
        }
        if (view.onTouchEvent(motionEvent)) {
            return true;
        }
    }

    private void h0(AttributeSet attributeSet) {
        q qVar;
        int i;
        H0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z2 = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R$styleable.MotionLayout_layoutDescription) {
                    this.x = new q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R$styleable.MotionLayout_currentState) {
                    this.B = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R$styleable.MotionLayout_motionProgress) {
                    this.M = obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON);
                    this.O = true;
                } else if (index == R$styleable.MotionLayout_applyMotionScene) {
                    z2 = obtainStyledAttributes.getBoolean(index, z2);
                } else {
                    if (index == R$styleable.MotionLayout_showPaths) {
                        if (this.S == 0) {
                            i = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        }
                    } else if (index == R$styleable.MotionLayout_motionDebug) {
                        i = obtainStyledAttributes.getInt(index, 0);
                    }
                    this.S = i;
                }
            }
            obtainStyledAttributes.recycle();
            q qVar2 = this.x;
            if (!z2) {
                this.x = null;
            }
        }
        if (this.S != 0) {
            T();
        }
        if (this.B == -1 && (qVar = this.x) != null) {
            this.B = qVar.x();
            this.A = this.x.x();
            this.C = this.x.n();
        }
    }

    private void k0() {
        q qVar = this.x;
        if (qVar != null && !qVar.f(this, this.B)) {
            int i = this.B;
            if (i != -1) {
                this.x.e(this, i);
            }
            if (this.x.Q()) {
                this.x.O();
            }
        }
    }

    private void l0() {
        ArrayList<g> arrayList;
        if (this.P != null || ((arrayList = this.m0) != null && !arrayList.isEmpty())) {
            this.s0 = false;
            Iterator<Integer> it = this.G0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                g gVar = this.P;
                if (gVar != null) {
                    gVar.d(this, next.intValue());
                }
                ArrayList<g> arrayList2 = this.m0;
                if (arrayList2 != null) {
                    Iterator<g> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(this, next.intValue());
                    }
                }
            }
            this.G0.clear();
        }
    }

    /* access modifiers changed from: private */
    public void o0() {
        int childCount = getChildCount();
        this.C0.a();
        boolean z2 = true;
        this.O = true;
        int width = getWidth();
        int height = getHeight();
        int h = this.x.h();
        int i = 0;
        if (h != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                n nVar = this.G.get(getChildAt(i2));
                if (nVar != null) {
                    nVar.r(h);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            n nVar2 = this.G.get(getChildAt(i3));
            if (nVar2 != null) {
                this.x.q(nVar2);
                nVar2.v(width, height, this.I, getNanoTime());
            }
        }
        float w = this.x.w();
        if (w != Utils.FLOAT_EPSILON) {
            boolean z3 = ((double) w) < Utils.DOUBLE_EPSILON;
            float abs = Math.abs(w);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            int i4 = 0;
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            while (true) {
                if (i4 >= childCount) {
                    z2 = false;
                    break;
                }
                n nVar3 = this.G.get(getChildAt(i4));
                if (!Float.isNaN(nVar3.j)) {
                    break;
                }
                float i5 = nVar3.i();
                float j = nVar3.j();
                float f6 = z3 ? j - i5 : j + i5;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
                i4++;
            }
            if (z2) {
                for (int i6 = 0; i6 < childCount; i6++) {
                    n nVar4 = this.G.get(getChildAt(i6));
                    if (!Float.isNaN(nVar4.j)) {
                        f3 = Math.min(f3, nVar4.j);
                        f2 = Math.max(f2, nVar4.j);
                    }
                }
                while (i < childCount) {
                    n nVar5 = this.G.get(getChildAt(i));
                    if (!Float.isNaN(nVar5.j)) {
                        nVar5.l = 1.0f / (1.0f - abs);
                        float f7 = nVar5.j;
                        nVar5.k = abs - (z3 ? ((f2 - f7) / (f2 - f3)) * abs : ((f7 - f3) * abs) / (f2 - f3));
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                n nVar6 = this.G.get(getChildAt(i));
                float i7 = nVar6.i();
                float j2 = nVar6.j();
                float f8 = z3 ? j2 - i7 : j2 + i7;
                nVar6.l = 1.0f / (1.0f - abs);
                nVar6.k = abs - (((f8 - f4) * abs) / (f5 - f4));
                i++;
            }
        }
    }

    private static boolean u0(float f2, float f3, float f4) {
        if (f2 > Utils.FLOAT_EPSILON) {
            float f5 = f2 / f4;
            return f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) > 1.0f;
        }
        float f6 = (-f2) / f4;
        return f3 + ((f2 * f6) + (((f4 * f6) * f6) / 2.0f)) < Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public void S(float f2) {
        if (this.x != null) {
            float f3 = this.K;
            float f4 = this.J;
            if (f3 != f4 && this.N) {
                this.K = f4;
            }
            float f5 = this.K;
            if (f5 != f2) {
                this.U = false;
                this.M = f2;
                this.I = ((float) this.x.m()) / 1000.0f;
                setProgress(this.M);
                this.y = this.x.p();
                this.N = false;
                this.H = getNanoTime();
                this.O = true;
                this.J = f5;
                this.K = f5;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X(boolean r21) {
        /*
            r20 = this;
            r0 = r20
            long r1 = r0.L
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = r20.getNanoTime()
            r0.L = r1
        L_0x0010:
            float r1 = r0.K
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0020
            r0.B = r2
        L_0x0020:
            boolean r1 = r0.j0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7 = 1
            r8 = 0
            if (r1 != 0) goto L_0x0036
            boolean r1 = r0.O
            if (r1 == 0) goto L_0x018d
            if (r21 != 0) goto L_0x0036
            float r1 = r0.M
            float r9 = r0.K
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x018d
        L_0x0036:
            float r1 = r0.M
            float r9 = r0.K
            float r1 = r1 - r9
            float r1 = java.lang.Math.signum(r1)
            long r9 = r20.getNanoTime()
            android.view.animation.Interpolator r11 = r0.y
            boolean r11 = r11 instanceof androidx.constraintlayout.motion.widget.o
            r12 = 814313567(0x3089705f, float:1.0E-9)
            if (r11 != 0) goto L_0x0059
            long r13 = r0.L
            long r13 = r9 - r13
            float r11 = (float) r13
            float r11 = r11 * r1
            float r11 = r11 * r12
            float r13 = r0.I
            float r11 = r11 / r13
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            float r13 = r0.K
            float r13 = r13 + r11
            boolean r11 = r0.N
            if (r11 == 0) goto L_0x0063
            float r13 = r0.M
        L_0x0063:
            int r11 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x006d
            float r14 = r0.M
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0077
        L_0x006d:
            int r14 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x007d
            float r14 = r0.M
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x007d
        L_0x0077:
            float r13 = r0.M
            r0.O = r8
            r14 = 1
            goto L_0x007e
        L_0x007d:
            r14 = 0
        L_0x007e:
            r0.K = r13
            r0.J = r13
            r0.L = r9
            androidx.constraintlayout.motion.widget.MotionLayout$g r15 = r0.P
            if (r15 != 0) goto L_0x0092
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionLayout$g> r15 = r0.m0
            if (r15 == 0) goto L_0x009e
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x009e
        L_0x0092:
            r20.Z()
            r0.s0 = r7
            if (r14 == 0) goto L_0x009e
            if (r7 == 0) goto L_0x009e
            r20.a0()
        L_0x009e:
            android.view.animation.Interpolator r15 = r0.y
            if (r15 == 0) goto L_0x00f2
            if (r14 != 0) goto L_0x00f2
            boolean r14 = r0.U
            if (r14 == 0) goto L_0x00ee
            long r13 = r0.H
            long r13 = r9 - r13
            float r13 = (float) r13
            float r13 = r13 * r12
            float r12 = r15.getInterpolation(r13)
            r0.K = r12
            r0.L = r9
            android.view.animation.Interpolator r9 = r0.y
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.o
            if (r10 == 0) goto L_0x00ec
            androidx.constraintlayout.motion.widget.o r9 = (androidx.constraintlayout.motion.widget.o) r9
            float r9 = r9.a()
            float r10 = java.lang.Math.abs(r9)
            r13 = 953267991(0x38d1b717, float:1.0E-4)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 > 0) goto L_0x00d0
            r0.O = r8
        L_0x00d0:
            int r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x00de
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x00de
            r0.K = r3
            r0.O = r8
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x00de:
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ec
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x00ec
            r0.K = r4
            r0.O = r8
            r13 = 0
            goto L_0x00f2
        L_0x00ec:
            r13 = r12
            goto L_0x00f2
        L_0x00ee:
            float r13 = r15.getInterpolation(r13)
        L_0x00f2:
            if (r11 <= 0) goto L_0x00fa
            float r9 = r0.M
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0104
        L_0x00fa:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0108
            float r1 = r0.M
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0108
        L_0x0104:
            float r13 = r0.M
            r0.O = r8
        L_0x0108:
            int r1 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0110
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0112
        L_0x0110:
            r0.O = r8
        L_0x0112:
            int r1 = r20.getChildCount()
            r0.j0 = r8
            long r9 = r20.getNanoTime()
            r0.A0 = r13
            r11 = 0
        L_0x011f:
            if (r11 >= r1) goto L_0x0145
            android.view.View r15 = r0.getChildAt(r11)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.n> r12 = r0.G
            java.lang.Object r12 = r12.get(r15)
            r14 = r12
            androidx.constraintlayout.motion.widget.n r14 = (androidx.constraintlayout.motion.widget.n) r14
            if (r14 == 0) goto L_0x0141
            boolean r12 = r0.j0
            androidx.constraintlayout.motion.widget.e r7 = r0.B0
            r16 = r13
            r17 = r9
            r19 = r7
            boolean r7 = r14.o(r15, r16, r17, r19)
            r7 = r7 | r12
            r0.j0 = r7
        L_0x0141:
            int r11 = r11 + 1
            r7 = 1
            goto L_0x011f
        L_0x0145:
            boolean r1 = r0.t0
            if (r1 == 0) goto L_0x014c
            r20.requestLayout()
        L_0x014c:
            boolean r1 = r0.j0
            if (r1 == 0) goto L_0x0153
            r20.invalidate()
        L_0x0153:
            boolean r1 = r0.O
            if (r1 == 0) goto L_0x015a
            r20.invalidate()
        L_0x015a:
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0174
            int r1 = r0.A
            if (r1 == r2) goto L_0x0174
            int r2 = r0.B
            if (r2 == r1) goto L_0x0167
            r8 = 1
        L_0x0167:
            int r1 = r0.A
            r0.B = r1
            androidx.constraintlayout.motion.widget.q r2 = r0.x
            androidx.constraintlayout.widget.c r1 = r2.i(r1)
            r1.c(r0)
        L_0x0174:
            double r1 = (double) r13
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x018d
            int r1 = r0.B
            int r2 = r0.C
            if (r1 == r2) goto L_0x0180
            r8 = 1
        L_0x0180:
            int r1 = r0.C
            r0.B = r1
            androidx.constraintlayout.motion.widget.q r2 = r0.x
            androidx.constraintlayout.widget.c r1 = r2.i(r1)
            r1.c(r0)
        L_0x018d:
            float r1 = r0.K
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x019f
            int r1 = r0.B
            int r2 = r0.C
            if (r1 == r2) goto L_0x019a
            r8 = 1
        L_0x019a:
            int r1 = r0.C
        L_0x019c:
            r0.B = r1
            goto L_0x01ad
        L_0x019f:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x01ad
            int r1 = r0.B
            int r2 = r0.A
            if (r1 == r2) goto L_0x01aa
            r8 = 1
        L_0x01aa:
            int r1 = r0.A
            goto L_0x019c
        L_0x01ad:
            boolean r1 = r0.s0
            if (r1 == 0) goto L_0x01d0
            float r1 = r0.K
            double r1 = (double) r1
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x01c1
            int r1 = r0.q0
            int r2 = r0.A
            if (r1 != r2) goto L_0x01c1
            r8 = 1
        L_0x01c1:
            float r1 = r0.K
            double r1 = (double) r1
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x01d0
            int r1 = r0.q0
            int r2 = r0.C
            if (r1 != r2) goto L_0x01d0
            r7 = 1
            goto L_0x01d1
        L_0x01d0:
            r7 = r8
        L_0x01d1:
            boolean r1 = r0.D0
            r1 = r1 | r7
            r0.D0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 < r2) goto L_0x01e7
            if (r7 == 0) goto L_0x01e7
            boolean r1 = r20.isInLayout()
            if (r1 != 0) goto L_0x01e7
            r20.requestLayout()
        L_0x01e7:
            float r1 = r0.K
            r0.J = r1
            if (r7 != 0) goto L_0x01f1
            boolean r1 = r0.s0
            if (r1 == 0) goto L_0x01f9
        L_0x01f1:
            r20.Z()
            if (r7 == 0) goto L_0x01f9
            r20.a0()
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.X(boolean):void");
    }

    /* access modifiers changed from: protected */
    public void a0() {
        int i;
        ArrayList<g> arrayList;
        if ((this.P != null || ((arrayList = this.m0) != null && !arrayList.isEmpty())) && this.q0 == -1) {
            this.q0 = this.B;
            if (!this.G0.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.G0;
                i = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.B;
            if (i != i2 && i2 != -1) {
                this.G0.add(Integer.valueOf(i2));
            }
        }
    }

    public void c0(int i, boolean z2, float f2) {
        g gVar = this.P;
        if (gVar != null) {
            gVar.c(this, i, z2, f2);
        }
        ArrayList<g> arrayList = this.m0;
        if (arrayList != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(this, i, z2, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d0(int i, float f2, float f3, float f4, float[] fArr) {
        String str;
        HashMap<View, n> hashMap = this.G;
        View q = q(i);
        n nVar = hashMap.get(q);
        if (nVar != null) {
            nVar.g(f2, f3, f4, fArr);
            float y2 = q.getY();
            int i2 = ((f2 - this.Q) > Utils.FLOAT_EPSILON ? 1 : ((f2 - this.Q) == Utils.FLOAT_EPSILON ? 0 : -1));
            this.Q = f2;
            this.R = y2;
            return;
        }
        if (q == null) {
            str = "" + i;
        } else {
            str = q.getContext().getResources().getResourceName(i);
        }
        "WARNING could not find view id " + str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            r0 = 0
            r9.X(r0)
            super.dispatchDraw(r10)
            androidx.constraintlayout.motion.widget.q r1 = r9.x
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            int r1 = r9.S
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x00d3
            boolean r1 = r9.isInEditMode()
            if (r1 != 0) goto L_0x00d3
            int r1 = r9.n0
            int r1 = r1 + r2
            r9.n0 = r1
            long r3 = r9.getNanoTime()
            long r5 = r9.o0
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0047
            long r5 = r3 - r5
            r7 = 200000000(0xbebc200, double:9.8813129E-316)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0049
            int r1 = r9.n0
            float r1 = (float) r1
            float r5 = (float) r5
            r6 = 814313567(0x3089705f, float:1.0E-9)
            float r5 = r5 * r6
            float r1 = r1 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            float r1 = (float) r1
            float r1 = r1 / r5
            r9.p0 = r1
            r9.n0 = r0
        L_0x0047:
            r9.o0 = r3
        L_0x0049:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1109917696(0x42280000, float:42.0)
            r0.setTextSize(r1)
            float r1 = r9.getProgress()
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r5 = r9.p0
            r4.append(r5)
            java.lang.String r5 = " fps "
            r4.append(r5)
            int r5 = r9.A
            java.lang.String r5 = androidx.constraintlayout.motion.widget.a.d(r9, r5)
            r4.append(r5)
            java.lang.String r5 = " -> "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            int r4 = r9.C
            java.lang.String r4 = androidx.constraintlayout.motion.widget.a.d(r9, r4)
            r5.append(r4)
            java.lang.String r4 = " (progress: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " ) state="
            r5.append(r1)
            int r1 = r9.B
            r4 = -1
            if (r1 != r4) goto L_0x00a7
            java.lang.String r1 = "undefined"
            goto L_0x00ab
        L_0x00a7:
            java.lang.String r1 = androidx.constraintlayout.motion.widget.a.d(r9, r1)
        L_0x00ab:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r4)
            r4 = 1093664768(0x41300000, float:11.0)
            int r5 = r9.getHeight()
            int r5 = r5 + -29
            float r5 = (float) r5
            r10.drawText(r1, r4, r5, r0)
            r4 = -7864184(0xffffffffff880088, float:NaN)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + -30
            float r4 = (float) r4
            r10.drawText(r1, r3, r4, r0)
        L_0x00d3:
            int r0 = r9.S
            if (r0 <= r2) goto L_0x00f1
            androidx.constraintlayout.motion.widget.MotionLayout$c r0 = r9.T
            if (r0 != 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.MotionLayout$c r0 = new androidx.constraintlayout.motion.widget.MotionLayout$c
            r0.<init>()
            r9.T = r0
        L_0x00e2:
            androidx.constraintlayout.motion.widget.MotionLayout$c r0 = r9.T
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.n> r1 = r9.G
            androidx.constraintlayout.motion.widget.q r2 = r9.x
            int r2 = r2.m()
            int r3 = r9.S
            r0.a(r10, r1, r2, r3)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.d0 && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.d0 = false;
    }

    public q.b e0(int i) {
        return this.x.y(i);
    }

    public void f0(View view, float f2, float f3, float[] fArr, int i) {
        float f4;
        float f5 = this.z;
        float f6 = this.K;
        if (this.y != null) {
            float signum = Math.signum(this.M - f6);
            float interpolation = this.y.getInterpolation(this.K + 1.0E-5f);
            float interpolation2 = this.y.getInterpolation(this.K);
            f5 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.I;
            f4 = interpolation2;
        } else {
            f4 = f6;
        }
        Interpolator interpolator = this.y;
        if (interpolator instanceof o) {
            f5 = ((o) interpolator).a();
        }
        n nVar = this.G.get(view);
        if ((i & 1) == 0) {
            nVar.l(f4, view.getWidth(), view.getHeight(), f2, f3, fArr);
        } else {
            nVar.g(f4, f2, f3, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f5;
            fArr[1] = fArr[1] * f5;
        }
    }

    public int[] getConstraintSetIds() {
        q qVar = this.x;
        if (qVar == null) {
            return null;
        }
        return qVar.k();
    }

    public int getCurrentState() {
        return this.B;
    }

    public ArrayList<q.b> getDefinedTransitions() {
        q qVar = this.x;
        if (qVar == null) {
            return null;
        }
        return qVar.l();
    }

    public b getDesignTool() {
        if (this.a0 == null) {
            this.a0 = new b(this);
        }
        return this.a0;
    }

    public int getEndState() {
        return this.C;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.K;
    }

    public int getStartState() {
        return this.A;
    }

    public float getTargetPosition() {
        return this.M;
    }

    public long getTransitionTimeMs() {
        q qVar = this.x;
        if (qVar != null) {
            this.I = ((float) qVar.m()) / 1000.0f;
        }
        return (long) (this.I * 1000.0f);
    }

    public float getVelocity() {
        Interpolator interpolator = this.y;
        return interpolator == null ? this.z : interpolator instanceof o ? ((o) interpolator).a() : Utils.FLOAT_EPSILON;
    }

    public boolean i0() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    public e j0() {
        return f.f();
    }

    public void k(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            r0.e0 = r2
            androidx.constraintlayout.motion.widget.q r1 = r0.x
            if (r1 == 0) goto L_0x0023
            androidx.constraintlayout.motion.widget.q$b r1 = r1.c
            if (r1 == 0) goto L_0x0023
            androidx.constraintlayout.motion.widget.t r1 = r1.B()
            if (r1 == 0) goto L_0x0023
            androidx.constraintlayout.motion.widget.q r1 = r0.x
            androidx.constraintlayout.motion.widget.q$b r1 = r1.c
            androidx.constraintlayout.motion.widget.t r1 = r1.B()
            int r1 = r1.d()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 1
            return r1
        L_0x0023:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.l(android.view.View, android.view.View, int, int):boolean");
    }

    public void m(View view, View view2, int i, int i2) {
    }

    public void m0() {
        this.C0.g();
        invalidate();
    }

    public void n(View view, int i) {
        this.e0 = null;
        q qVar = this.x;
        if (qVar != null) {
            float f2 = this.f0;
            float f3 = this.i0;
            qVar.G(f2 / f3, this.g0 / f3);
        }
    }

    public void n0(int i, int i2) {
        q qVar = this.x;
        if (qVar != null) {
            this.A = i;
            this.C = i2;
            qVar.M(i, i2);
            this.C0.d(this.g, this.x.i(i), this.x.i(i2));
            m0();
            this.K = Utils.FLOAT_EPSILON;
            r0();
        }
    }

    public void o(View view, int i, int i2, int[] iArr, int i3) {
        q.b bVar;
        t B2;
        int k;
        q qVar = this.x;
        if (qVar != null && (bVar = qVar.c) != null && bVar.C()) {
            q.b bVar2 = this.x.c;
            if (bVar2 == null || !bVar2.C() || (B2 = bVar2.B()) == null || (k = B2.k()) == -1 || this.e0.getId() == k) {
                q qVar2 = this.x;
                if (qVar2 != null && qVar2.t()) {
                    float f2 = this.J;
                    if ((f2 == 1.0f || f2 == Utils.FLOAT_EPSILON) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
                if (!(bVar2.B() == null || (this.x.c.B().d() & 1) == 0)) {
                    float u = this.x.u((float) i, (float) i2);
                    if ((this.K <= Utils.FLOAT_EPSILON && u < Utils.FLOAT_EPSILON) || (this.K >= 1.0f && u > Utils.FLOAT_EPSILON)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.e0.setNestedScrollingEnabled(false);
                            this.e0.post(new a());
                            return;
                        }
                        return;
                    }
                }
                float f3 = this.J;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.f0 = f4;
                float f5 = (float) i2;
                this.g0 = f5;
                this.i0 = (float) (((double) (nanoTime - this.h0)) * 1.0E-9d);
                this.h0 = nanoTime;
                this.x.F(f4, f5);
                if (f3 != this.J) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                X(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.d0 = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        q qVar = this.x;
        if (!(qVar == null || (i = this.B) == -1)) {
            androidx.constraintlayout.widget.c i2 = qVar.i(i);
            this.x.J(this);
            if (i2 != null) {
                i2.d(this);
            }
            this.A = this.B;
        }
        k0();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q.b bVar;
        t B2;
        int k;
        RectF j;
        q qVar = this.x;
        if (qVar != null && this.F && (bVar = qVar.c) != null && bVar.C() && (B2 = bVar.B()) != null && ((motionEvent.getAction() != 0 || (j = B2.j(this, new RectF())) == null || j.contains(motionEvent.getX(), motionEvent.getY())) && (k = B2.k()) != -1)) {
            View view = this.F0;
            if (view == null || view.getId() != k) {
                this.F0 = findViewById(k);
            }
            View view2 = this.F0;
            if (view2 != null) {
                this.E0.set((float) view2.getLeft(), (float) this.F0.getTop(), (float) this.F0.getRight(), (float) this.F0.getBottom());
                if (this.E0.contains(motionEvent.getX(), motionEvent.getY()) && !g0(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.F0, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        if (this.x == null) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!(this.b0 == i5 && this.c0 == i6)) {
            m0();
            X(true);
        }
        this.b0 = i5;
        this.c0 = i6;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.x == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.D == i && this.E == i2) ? false : true;
        if (this.D0) {
            this.D0 = false;
            k0();
            if (this.s0) {
                l0();
            }
            z3 = true;
        }
        if (!this.l) {
            z2 = z3;
        }
        this.D = i;
        this.E = i2;
        int x2 = this.x.x();
        int n = this.x.n();
        if ((z2 || this.C0.e(x2, n)) && this.A != -1) {
            super.onMeasure(i, i2);
            this.C0.d(this.g, this.x.i(x2), this.x.i(n));
            this.C0.g();
            this.C0.h(x2, n);
        } else {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int P2 = this.g.P() + getPaddingLeft() + getPaddingRight();
            int v = this.g.v() + paddingTop;
            if (this.y0 == Integer.MIN_VALUE) {
                int i3 = this.u0;
                P2 = (int) (((float) i3) + (this.A0 * ((float) (this.w0 - i3))));
                requestLayout();
            }
            if (this.z0 == Integer.MIN_VALUE) {
                int i4 = this.v0;
                v = (int) (((float) i4) + (this.A0 * ((float) (this.x0 - i4))));
                requestLayout();
            }
            setMeasuredDimension(P2, v);
        }
        Y();
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onRtlPropertiesChanged(int i) {
        q qVar = this.x;
        if (qVar != null) {
            qVar.L(t());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        q qVar = this.x;
        if (qVar == null || !this.F || !qVar.Q()) {
            return super.onTouchEvent(motionEvent);
        }
        q.b bVar = this.x.c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.x.H(motionEvent, getCurrentState(), this);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.m0 == null) {
                this.m0 = new ArrayList<>();
            }
            this.m0.add(motionHelper);
            if (motionHelper.v()) {
                if (this.k0 == null) {
                    this.k0 = new ArrayList<>();
                }
                this.k0.add(motionHelper);
            }
            if (motionHelper.u()) {
                if (this.l0 == null) {
                    this.l0 = new ArrayList<>();
                }
                this.l0.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.k0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.l0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
        if (this.e0 == view) {
            this.e0 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r13 == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r13 == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p0(int r12, float r13, float r14) {
        /*
            r11 = this;
            androidx.constraintlayout.motion.widget.q r0 = r11.x
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r11.K
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r11.U = r0
            long r1 = r11.getNanoTime()
            r11.H = r1
            androidx.constraintlayout.motion.widget.q r1 = r11.x
            int r1 = r1.m()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r11.I = r1
            r11.M = r13
            r11.O = r0
            r1 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r12 == 0) goto L_0x0081
            if (r12 == r0) goto L_0x0081
            if (r12 == r1) goto L_0x0081
            r0 = 4
            if (r12 == r0) goto L_0x006f
            r0 = 5
            if (r12 == r0) goto L_0x0037
            goto L_0x00a7
        L_0x0037:
            float r12 = r11.K
            androidx.constraintlayout.motion.widget.q r0 = r11.x
            float r0 = r0.r()
            boolean r12 = u0(r14, r12, r0)
            if (r12 == 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            p0 r4 = r11.V
            float r5 = r11.K
            float r8 = r11.I
            androidx.constraintlayout.motion.widget.q r12 = r11.x
            float r9 = r12.r()
            androidx.constraintlayout.motion.widget.q r12 = r11.x
            float r10 = r12.s()
            r6 = r13
            r7 = r14
            r4.c(r5, r6, r7, r8, r9, r10)
            r11.z = r3
            int r12 = r11.B
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            r11.setProgress(r2)
            r11.B = r12
            p0 r12 = r11.V
            goto L_0x007e
        L_0x006f:
            androidx.constraintlayout.motion.widget.MotionLayout$b r12 = r11.W
            float r13 = r11.K
            androidx.constraintlayout.motion.widget.q r0 = r11.x
            float r0 = r0.r()
            r12.b(r14, r13, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$b r12 = r11.W
        L_0x007e:
            r11.y = r12
            goto L_0x00a7
        L_0x0081:
            if (r12 != r0) goto L_0x0085
            r13 = 0
            goto L_0x0089
        L_0x0085:
            if (r12 != r1) goto L_0x0089
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x0089:
            p0 r4 = r11.V
            float r5 = r11.K
            float r8 = r11.I
            androidx.constraintlayout.motion.widget.q r12 = r11.x
            float r9 = r12.r()
            androidx.constraintlayout.motion.widget.q r12 = r11.x
            float r10 = r12.s()
            r6 = r13
            r7 = r14
            r4.c(r5, r6, r7, r8, r9, r10)
            int r12 = r11.B
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0066
            goto L_0x0067
        L_0x00a7:
            r12 = 0
            r11.N = r12
            long r12 = r11.getNanoTime()
            r11.H = r12
            r11.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.p0(int, float, float):void");
    }

    public void q0() {
        S(1.0f);
    }

    public void r0() {
        S(Utils.FLOAT_EPSILON);
    }

    public void requestLayout() {
        q qVar;
        q.b bVar;
        if (this.t0 || this.B != -1 || (qVar = this.x) == null || (bVar = qVar.c) == null || bVar.z() != 0) {
            super.requestLayout();
        }
    }

    public void s0(int i) {
        t0(i, -1, -1);
    }

    public void setDebugMode(int i) {
        this.S = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z2) {
        this.F = z2;
    }

    public void setInterpolatedProgress(float f2) {
        Interpolator p;
        q qVar = this.x;
        if (qVar == null || (p = qVar.p()) == null) {
            setProgress(f2);
        } else {
            setProgress(p.getInterpolation(f2));
        }
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.l0.get(i).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.k0.get(i).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        this.B = f2 <= Utils.FLOAT_EPSILON ? this.A : f2 >= 1.0f ? this.C : -1;
        if (this.x != null) {
            this.N = true;
            this.M = f2;
            this.J = f2;
            this.L = -1;
            this.H = -1;
            this.y = null;
            this.O = true;
            invalidate();
        }
    }

    public void setScene(q qVar) {
        this.x = qVar;
        qVar.L(t());
        m0();
    }

    public void setTransition(int i) {
        if (this.x != null) {
            q.b e02 = e0(i);
            this.A = e02.A();
            int y2 = e02.y();
            this.C = y2;
            float f2 = Float.NaN;
            int i2 = this.B;
            int i3 = this.A;
            float f3 = Utils.FLOAT_EPSILON;
            if (i2 == i3) {
                f2 = Utils.FLOAT_EPSILON;
            } else if (i2 == y2) {
                f2 = 1.0f;
            }
            this.x.N(e02);
            this.C0.d(this.g, this.x.i(this.A), this.x.i(this.C));
            m0();
            if (!Float.isNaN(f2)) {
                f3 = f2;
            }
            this.K = f3;
            if (Float.isNaN(f2)) {
                a.a() + " transitionToStart ";
                r0();
                return;
            }
            setProgress(f2);
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(q.b bVar) {
        this.x.N(bVar);
        float f2 = this.B == this.x.n() ? 1.0f : Utils.FLOAT_EPSILON;
        this.K = f2;
        this.J = f2;
        this.M = f2;
        this.L = -1;
        int x2 = this.x.x();
        int n = this.x.n();
        if (x2 != this.A || n != this.C) {
            this.A = x2;
            this.C = n;
            this.x.M(x2, n);
            this.C0.d(this.g, this.x.i(this.A), this.x.i(this.C));
            this.C0.h(this.A, this.C);
            this.C0.g();
            m0();
            b0(this, this.A, this.C);
        }
    }

    public void setTransitionDuration(int i) {
        q qVar = this.x;
        if (qVar != null) {
            qVar.K(i);
        }
    }

    public void setTransitionListener(g gVar) {
        this.P = gVar;
    }

    public void t0(int i, int i2, int i3) {
        androidx.constraintlayout.widget.e eVar;
        int a2;
        q qVar = this.x;
        if (!(qVar == null || (eVar = qVar.b) == null || (a2 = eVar.a(this.B, i, (float) i2, (float) i3)) == -1)) {
            i = a2;
        }
        int i4 = this.B;
        if (i4 != i) {
            if (this.A == i) {
                S(Utils.FLOAT_EPSILON);
            } else if (this.C == i) {
                S(1.0f);
            } else {
                this.C = i;
                if (i4 != -1) {
                    n0(i4, i);
                    S(1.0f);
                    this.K = Utils.FLOAT_EPSILON;
                    q0();
                    return;
                }
                this.U = false;
                this.M = 1.0f;
                this.J = Utils.FLOAT_EPSILON;
                this.K = Utils.FLOAT_EPSILON;
                this.L = getNanoTime();
                this.H = getNanoTime();
                this.N = false;
                this.y = null;
                this.I = ((float) this.x.m()) / 1000.0f;
                this.A = -1;
                this.x.M(-1, this.C);
                this.x.x();
                int childCount = getChildCount();
                this.G.clear();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    this.G.put(childAt, new n(childAt));
                }
                this.O = true;
                this.C0.d(this.g, (androidx.constraintlayout.widget.c) null, this.x.i(i));
                m0();
                this.C0.a();
                W();
                int width = getWidth();
                int height = getHeight();
                for (int i6 = 0; i6 < childCount; i6++) {
                    n nVar = this.G.get(getChildAt(i6));
                    this.x.q(nVar);
                    nVar.v(width, height, this.I, getNanoTime());
                }
                float w = this.x.w();
                if (w != Utils.FLOAT_EPSILON) {
                    float f2 = Float.MAX_VALUE;
                    float f3 = -3.4028235E38f;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        n nVar2 = this.G.get(getChildAt(i7));
                        float j = nVar2.j() + nVar2.i();
                        f2 = Math.min(f2, j);
                        f3 = Math.max(f3, j);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        n nVar3 = this.G.get(getChildAt(i8));
                        float i9 = nVar3.i();
                        float j2 = nVar3.j();
                        nVar3.l = 1.0f / (1.0f - w);
                        nVar3.k = w - ((((i9 + j2) - f2) * w) / (f3 - f2));
                    }
                }
                this.J = Utils.FLOAT_EPSILON;
                this.K = Utils.FLOAT_EPSILON;
                this.O = true;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void v(int i) {
        this.o = null;
    }
}
