package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import defpackage.a5;
import defpackage.d5;
import defpackage.m5;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    m5 a;
    c b;
    private boolean c;
    private float d = Utils.FLOAT_EPSILON;
    private boolean e;
    int f = 2;
    float g = 0.5f;
    float h = Utils.FLOAT_EPSILON;
    float i = 0.5f;
    private final m5.c j = new a();

    class a extends m5.c {
        private int a;
        private int b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = defpackage.o4.y(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.n(android.view.View, float):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.a;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = defpackage.o4.y(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.h);
            float width2 = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(Utils.FLOAT_EPSILON);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(Utils.FLOAT_EPSILON, 1.0f - SwipeDismissBehavior.I(width, width2, f), 1.0f));
            }
        }

        public void l(View view, float f, float f2) {
            boolean z;
            int i;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.N(i, view.getTop())) {
                o4.b0(view, new d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.b) != null) {
                cVar.a(view);
            }
        }

        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.E(view);
        }
    }

    class b implements d5 {
        b() {
        }

        public boolean a(View view, d5.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z2 = o4.y(view) == 1;
            if ((SwipeDismissBehavior.this.f == 0 && z2) || (SwipeDismissBehavior.this.f == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            o4.T(view, width);
            view.setAlpha(Utils.FLOAT_EPSILON);
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i);
    }

    private class d implements Runnable {
        private final View e;
        private final boolean f;

        d(View view, boolean z) {
            this.e = view;
            this.f = z;
        }

        public void run() {
            c cVar;
            m5 m5Var = SwipeDismissBehavior.this.a;
            if (m5Var != null && m5Var.n(true)) {
                o4.b0(this.e, this);
            } else if (this.f && (cVar = SwipeDismissBehavior.this.b) != null) {
                cVar.a(this.e);
            }
        }
    }

    static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int G(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void H(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.e ? m5.o(viewGroup, this.d, this.j) : m5.p(viewGroup, this.j);
        }
    }

    static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    private void N(View view) {
        o4.d0(view, 1048576);
        if (E(view)) {
            o4.f0(view, a5.a.l, (CharSequence) null, new b());
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        m5 m5Var = this.a;
        if (m5Var == null) {
            return false;
        }
        m5Var.F(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f2) {
        this.i = F(Utils.FLOAT_EPSILON, f2, 1.0f);
    }

    public void K(c cVar) {
        this.b = cVar;
    }

    public void L(float f2) {
        this.h = F(Utils.FLOAT_EPSILON, f2, 1.0f);
    }

    public void M(int i2) {
        this.f = i2;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.F(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        H(coordinatorLayout);
        return this.a.O(motionEvent);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean l = super.l(coordinatorLayout, v, i2);
        if (o4.w(v) == 0) {
            o4.s0(v, 1);
            N(v);
        }
        return l;
    }
}
