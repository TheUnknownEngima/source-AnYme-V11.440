package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: m5  reason: default package */
public class m5 {
    private static final Interpolator w = new a();
    private int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private OverScroller q;
    private final c r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable v = new b();

    /* renamed from: m5$a */
    static class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: m5$b */
    class b implements Runnable {
        b() {
        }

        public void run() {
            m5.this.K(0);
        }
    }

    /* renamed from: m5$c */
    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(int i) {
            return i;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i, int i2) {
        }

        public boolean g(int i) {
            return false;
        }

        public void h(int i, int i2) {
        }

        public void i(View view, int i) {
        }

        public abstract void j(int i);

        public abstract void k(View view, int i, int i2, int i3, int i4);

        public abstract void l(View view, float f, float f2);

        public abstract boolean m(View view, int i);
    }

    private m5(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.u = viewGroup;
            this.r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private boolean D(int i2) {
        if (C(i2)) {
            return true;
        }
        "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.";
        return false;
    }

    private void G() {
        this.l.computeCurrentVelocity(1000, this.m);
        q(h(this.l.getXVelocity(this.c), this.n, this.m), h(this.l.getYVelocity(this.c), this.n, this.m));
    }

    private void H(float f2, float f3, int i2) {
        int i3 = 1;
        if (!d(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (d(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (d(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (d(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.i;
            iArr[i2] = iArr[i2] | i3;
            this.r.f(i3, i2);
        }
    }

    private void I(float f2, float f3, int i2) {
        t(i2);
        float[] fArr = this.d;
        this.f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.e;
        this.g[i2] = f3;
        fArr2[i2] = f3;
        this.h[i2] = y((int) f2, (int) f3);
        this.k |= 1 << i2;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (D(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private boolean d(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i2] & i3) != i3 || (this.p & i3) == 0 || (this.j[i2] & i3) == i3 || (this.i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.r.g(i3)) {
            return (this.i[i2] & i3) == 0 && abs > ((float) this.b);
        }
        int[] iArr = this.j;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean g(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.d(view) > 0;
        boolean z2 = this.r.e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.b) : z2 && Math.abs(f3) > ((float) this.b);
        }
        int i2 = this.b;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    private float h(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        return abs < f3 ? Utils.FLOAT_EPSILON : abs > f4 ? f2 > Utils.FLOAT_EPSILON ? f4 : -f4 : f2;
    }

    private int i(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private void j() {
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            Arrays.fill(this.e, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f, Utils.FLOAT_EPSILON);
            Arrays.fill(this.g, Utils.FLOAT_EPSILON);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    private void k(int i2) {
        if (this.d != null && C(i2)) {
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k = (~(1 << i2)) & this.k;
        }
    }

    private int l(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f2 = (float) (width / 2);
        float r2 = f2 + (r(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(r2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    private int m(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int i6 = i(i4, (int) this.n, (int) this.m);
        int i7 = i(i5, (int) this.n, (int) this.m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(i6);
        int abs4 = Math.abs(i7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (i6 != 0) {
            f3 = (float) abs3;
            f2 = (float) i8;
        } else {
            f3 = (float) abs;
            f2 = (float) i9;
        }
        float f6 = f3 / f2;
        if (i7 != 0) {
            f5 = (float) abs4;
            f4 = (float) i8;
        } else {
            f5 = (float) abs2;
            f4 = (float) i9;
        }
        float f7 = f5 / f4;
        return (int) ((((float) l(i2, i6, this.r.d(view))) * f6) + (((float) l(i3, i7, this.r.e(view))) * f7));
    }

    public static m5 o(ViewGroup viewGroup, float f2, c cVar) {
        m5 p2 = p(viewGroup, cVar);
        p2.b = (int) (((float) p2.b) * (1.0f / f2));
        return p2;
    }

    public static m5 p(ViewGroup viewGroup, c cVar) {
        return new m5(viewGroup.getContext(), viewGroup, cVar);
    }

    private void q(float f2, float f3) {
        this.t = true;
        this.r.l(this.s, f2, f3);
        this.t = false;
        if (this.a == 1) {
            K(0);
        }
    }

    private float r(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private void s(int i2, int i3, int i4, int i5) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (i4 != 0) {
            i2 = this.r.a(this.s, i2, i4);
            o4.T(this.s, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.r.b(this.s, i3, i5);
            o4.U(this.s, i3 - top);
        }
        int i7 = i3;
        if (i4 != 0 || i5 != 0) {
            this.r.k(this.s, i6, i7, i6 - left, i7 - top);
        }
    }

    private void t(int i2) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private boolean v(int i2, int i3, int i4, int i5) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.q.abortAnimation();
            K(0);
            return false;
        }
        this.q.startScroll(left, top, i6, i7, m(this.s, i6, i7, i4, i5));
        K(2);
        return true;
    }

    private int y(int i2, int i3) {
        int i4 = i2 < this.u.getLeft() + this.o ? 1 : 0;
        if (i3 < this.u.getTop() + this.o) {
            i4 |= 4;
        }
        if (i2 > this.u.getRight() - this.o) {
            i4 |= 2;
        }
        return i3 > this.u.getBottom() - this.o ? i4 | 8 : i4;
    }

    public int A() {
        return this.a;
    }

    public boolean B(int i2, int i3) {
        return E(this.s, i2, i3);
    }

    public boolean C(int i2) {
        return ((1 << i2) & this.k) != 0;
    }

    public boolean E(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (D(pointerId)) {
                                float x = motionEvent.getX(i3);
                                float y = motionEvent.getY(i3);
                                float f2 = x - this.d[pointerId];
                                float f3 = y - this.e[pointerId];
                                H(f2, f3, pointerId);
                                if (this.a != 1) {
                                    View u2 = u((int) x, (int) y);
                                    if (g(u2, f2, f3) && Q(u2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (D(this.c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f;
                        int i4 = this.c;
                        int i5 = (int) (x2 - fArr[i4]);
                        int i6 = (int) (y2 - this.g[i4]);
                        s(this.s.getLeft() + i5, this.s.getTop() + i6, i5, i6);
                    } else {
                        return;
                    }
                    J(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        I(x3, y3, pointerId2);
                        if (this.a == 0) {
                            Q(u((int) x3, (int) y3), pointerId2);
                            int i7 = this.h[pointerId2];
                            int i8 = this.p;
                            if ((i7 & i8) != 0) {
                                this.r.h(i7 & i8, pointerId2);
                                return;
                            }
                            return;
                        } else if (B((int) x3, (int) y3)) {
                            Q(this.s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.a == 1 && pointerId3 == this.c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i3);
                                if (pointerId4 != this.c) {
                                    View u3 = u((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view = this.s;
                                    if (u3 == view && Q(view, pointerId4)) {
                                        i2 = this.c;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                G();
                            }
                        }
                        k(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.a == 1) {
                    q(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
            } else if (this.a == 1) {
                G();
            }
            b();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View u4 = u((int) x4, (int) y4);
        I(x4, y4, pointerId5);
        Q(u4, pointerId5);
        int i9 = this.h[pointerId5];
        int i10 = this.p;
        if ((i9 & i10) != 0) {
            this.r.h(i9 & i10, pointerId5);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(int i2) {
        this.u.removeCallbacks(this.v);
        if (this.a != i2) {
            this.a = i2;
            this.r.j(i2);
            if (this.a == 0) {
                this.s = null;
            }
        }
    }

    public void L(int i2) {
        this.p = i2;
    }

    public void M(float f2) {
        this.n = f2;
    }

    public boolean N(int i2, int i3) {
        if (this.t) {
            return v(i2, i3, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean O(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.k(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.I(r7, r1, r2)
            int r3 = r0.a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.h
            r1 = r1[r2]
            int r3 = r0.p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            m5$c r4 = r0.r
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.u(r3, r1)
            android.view.View r3 = r0.s
            if (r1 != r3) goto L_0x0031
            r0.Q(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.D(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.u(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.g(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            m5$c r14 = r0.r
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            m5$c r5 = r0.r
            int r5 = r5.b(r7, r15, r14)
            m5$c r14 = r0.r
            int r14 = r14.d(r7)
            m5$c r15 = r0.r
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.H(r9, r10, r4)
            int r5 = r0.a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.Q(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.J(r17)
            goto L_0x0031
        L_0x00ff:
            r16.b()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.I(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.u(r2, r3)
            android.view.View r3 = r0.s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.a
            if (r3 != r4) goto L_0x0125
            r0.Q(r2, r1)
        L_0x0125:
            int[] r2 = r0.h
            r2 = r2[r1]
            int r3 = r0.p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            m5$c r4 = r0.r
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5.O(android.view.MotionEvent):boolean");
    }

    public boolean P(View view, int i2, int i3) {
        this.s = view;
        this.c = -1;
        boolean v2 = v(i2, i3, 0, 0);
        if (!v2 && this.a == 0 && this.s != null) {
            this.s = null;
        }
        return v2;
    }

    /* access modifiers changed from: package-private */
    public boolean Q(View view, int i2) {
        if (view == this.s && this.c == i2) {
            return true;
        }
        if (view == null || !this.r.m(view, i2)) {
            return false;
        }
        this.c = i2;
        c(view, i2);
        return true;
    }

    public void a() {
        b();
        if (this.a == 2) {
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            this.q.abortAnimation();
            int currX2 = this.q.getCurrX();
            int currY2 = this.q.getCurrY();
            this.r.k(this.s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        K(0);
    }

    public void b() {
        this.c = -1;
        j();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void c(View view, int i2) {
        if (view.getParent() == this.u) {
            this.s = view;
            this.c = i2;
            this.r.i(view, i2);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    public boolean e(int i2) {
        int length = this.d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (f(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i2, int i3) {
        if (!C(i3)) {
            return false;
        }
        boolean z = (i2 & 1) == 1;
        boolean z2 = (i2 & 2) == 2;
        float f2 = this.f[i3] - this.d[i3];
        float f3 = this.g[i3] - this.e[i3];
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.b) : z2 && Math.abs(f3) > ((float) this.b);
        }
        int i4 = this.b;
        return (f2 * f2) + (f3 * f3) > ((float) (i4 * i4));
    }

    public boolean n(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                o4.T(this.s, left);
            }
            if (top != 0) {
                o4.U(this.s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.k(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.u.post(this.v);
                } else {
                    K(0);
                }
            }
        }
        return this.a == 2;
    }

    public View u(int i2, int i3) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.u;
            this.r.c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View w() {
        return this.s;
    }

    public int x() {
        return this.o;
    }

    public int z() {
        return this.b;
    }
}
