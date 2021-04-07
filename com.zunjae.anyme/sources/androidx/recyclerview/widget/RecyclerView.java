package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.R$attr;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.u;
import com.github.mikephil.charting.utils.Utils;
import defpackage.a5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements e4 {
    private static final int[] C0 = {16843830};
    static final boolean D0;
    static final boolean E0 = (Build.VERSION.SDK_INT >= 23);
    static final boolean F0 = (Build.VERSION.SDK_INT >= 16);
    static final boolean G0 = (Build.VERSION.SDK_INT >= 21);
    private static final boolean H0 = (Build.VERSION.SDK_INT <= 15);
    private static final boolean I0 = (Build.VERSION.SDK_INT <= 15);
    private static final Class<?>[] J0;
    static final Interpolator K0 = new c();
    boolean A;
    private Runnable A0;
    boolean B;
    private final u.b B0;
    private boolean C;
    private int D;
    boolean E;
    private final AccessibilityManager F;
    private List<p> G;
    boolean H;
    boolean I;
    private int J;
    private int K;
    private k L;
    private EdgeEffect M;
    private EdgeEffect N;
    private EdgeEffect O;
    private EdgeEffect P;
    l Q;
    private int R;
    private int S;
    private VelocityTracker T;
    private int U;
    private int V;
    private int W;
    private int a0;
    private int b0;
    private q c0;
    private final int d0;
    private final w e;
    private final int e0;
    final u f;
    private float f0;
    private x g;
    private float g0;
    a h;
    private boolean h0;
    d i;
    final b0 i0;
    final u j;
    h j0;
    boolean k;
    h.b k0;
    final Runnable l;
    final z l0;
    final Rect m;
    private s m0;
    private final Rect n;
    private List<s> n0;
    final RectF o;
    boolean o0;
    g p;
    boolean p0;
    o q;
    private l.b q0;
    v r;
    boolean r0;
    final ArrayList<n> s;
    p s0;
    private final ArrayList<r> t;
    private j t0;
    private r u;
    private final int[] u0;
    boolean v;
    private f4 v0;
    boolean w;
    private final int[] w0;
    boolean x;
    private final int[] x0;
    boolean y;
    final int[] y0;
    private int z;
    final List<c0> z0;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        c0 e;
        final Rect f = new Rect();
        boolean g = true;
        boolean h = false;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.e.m();
        }

        public boolean b() {
            return this.e.y();
        }

        public boolean c() {
            return this.e.v();
        }

        public boolean d() {
            return this.e.t();
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.y && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.v) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.B) {
                    recyclerView2.A = true;
                } else {
                    recyclerView2.v();
                }
            }
        }
    }

    public static abstract class a0 {
        public abstract View a(u uVar, int i, int i2);
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            l lVar = RecyclerView.this.Q;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.r0 = false;
        }
    }

    class b0 implements Runnable {
        private int e;
        private int f;
        OverScroller g;
        Interpolator h = RecyclerView.K0;
        private boolean i = false;
        private boolean j = false;

        b0() {
            this.g = new OverScroller(RecyclerView.this.getContext(), RecyclerView.K0);
        }

        private int a(int i2, int i3, int i4, int i5) {
            int i6;
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i4 * i4) + (i5 * i5)));
            int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i3 * i3)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i7 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i7;
            float b = f3 + (b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i6 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i6, 2000);
        }

        private float b(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            o4.b0(RecyclerView.this, this);
        }

        public void c(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f = 0;
            this.e = 0;
            Interpolator interpolator = this.h;
            Interpolator interpolator2 = RecyclerView.K0;
            if (interpolator != interpolator2) {
                this.h = interpolator2;
                this.g = new OverScroller(RecyclerView.this.getContext(), RecyclerView.K0);
            }
            this.g.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.i) {
                this.j = true;
            } else {
                d();
            }
        }

        public void f(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = a(i2, i3, 0, 0);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.K0;
            }
            if (this.h != interpolator) {
                this.h = interpolator;
                this.g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f = 0;
            this.e = 0;
            RecyclerView.this.setScrollState(2);
            this.g.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.g.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.g.abortAnimation();
        }

        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.q == null) {
                g();
                return;
            }
            this.j = false;
            this.i = true;
            recyclerView.v();
            OverScroller overScroller = this.g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.e;
                int i5 = currY - this.f;
                this.e = currX;
                this.f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.y0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.y0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.p != null) {
                    int[] iArr3 = recyclerView3.y0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.i1(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.y0;
                    i2 = iArr4[0];
                    i3 = iArr4[1];
                    i4 -= i2;
                    i5 -= i3;
                    y yVar = recyclerView4.q.k;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int b = RecyclerView.this.l0.b();
                        if (b == 0) {
                            yVar.r();
                        } else {
                            if (yVar.f() >= b) {
                                yVar.p(b - 1);
                            }
                            yVar.j(i2, i3);
                        }
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.s.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.y0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i2, i3, i4, i5, (int[]) null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.y0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i2 == 0 && i3 == 0)) {
                    RecyclerView.this.J(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                y yVar2 = RecyclerView.this.q.k;
                if ((yVar2 != null && yVar2.g()) || !z) {
                    e();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    h hVar = recyclerView6.j0;
                    if (hVar != null) {
                        hVar.f(recyclerView6, i2, i3);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i8, currVelocity);
                    }
                    if (RecyclerView.G0) {
                        RecyclerView.this.k0.b();
                    }
                }
            }
            y yVar3 = RecyclerView.this.q.k;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.i = false;
            if (this.j) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.v1(1);
        }
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public static abstract class c0 {
        private static final List<Object> w = Collections.emptyList();
        public final View e;
        WeakReference<RecyclerView> f;
        int g = -1;
        int h = -1;
        long i = -1;
        int j = -1;
        int k = -1;
        c0 l = null;
        c0 m = null;
        int n;
        List<Object> o = null;
        List<Object> p = null;
        private int q = 0;
        u r = null;
        boolean s = false;
        private int t = 0;
        int u = -1;
        RecyclerView v;

        public c0(View view) {
            if (view != null) {
                this.e = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.o == null) {
                ArrayList arrayList = new ArrayList();
                this.o = arrayList;
                this.p = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i2, boolean z) {
            if (this.h == -1) {
                this.h = this.g;
            }
            if (this.k == -1) {
                this.k = this.g;
            }
            if (z) {
                this.k += i2;
            }
            this.g += i2;
            if (this.e.getLayoutParams() != null) {
                ((LayoutParams) this.e.getLayoutParams()).g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void B(RecyclerView recyclerView) {
            int i2 = this.u;
            if (i2 == -1) {
                i2 = o4.w(this.e);
            }
            this.t = i2;
            recyclerView.l1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void C(RecyclerView recyclerView) {
            recyclerView.l1(this, this.t);
            this.t = 0;
        }

        /* access modifiers changed from: package-private */
        public void D() {
            this.n = 0;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.k = -1;
            this.q = 0;
            this.l = null;
            this.m = null;
            d();
            this.t = 0;
            this.u = -1;
            RecyclerView.s(this);
        }

        /* access modifiers changed from: package-private */
        public void E() {
            if (this.h == -1) {
                this.h = this.g;
            }
        }

        /* access modifiers changed from: package-private */
        public void F(int i2, int i3) {
            this.n = (i2 & i3) | (this.n & (~i3));
        }

        public final void G(boolean z) {
            int i2;
            int i3 = this.q;
            int i4 = z ? i3 - 1 : i3 + 1;
            this.q = i4;
            if (i4 < 0) {
                this.q = 0;
                "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
                return;
            }
            if (!z && i4 == 1) {
                i2 = this.n | 16;
            } else if (z && this.q == 0) {
                i2 = this.n & -17;
            } else {
                return;
            }
            this.n = i2;
        }

        /* access modifiers changed from: package-private */
        public void H(u uVar, boolean z) {
            this.r = uVar;
            this.s = z;
        }

        /* access modifiers changed from: package-private */
        public boolean I() {
            return (this.n & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean J() {
            return (this.n & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void K() {
            this.r.J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean L() {
            return (this.n & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.n) == 0) {
                g();
                this.o.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            this.n = i2 | this.n;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.h = -1;
            this.k = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            List<Object> list = this.o;
            if (list != null) {
                list.clear();
            }
            this.n &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.n &= -33;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.n &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return (this.n & 16) == 0 && o4.L(this.e);
        }

        /* access modifiers changed from: package-private */
        public void i(int i2, int i3, boolean z) {
            b(8);
            A(i3, z);
            this.g = i2;
        }

        public final int j() {
            RecyclerView recyclerView = this.v;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c0(this);
        }

        public final long k() {
            return this.i;
        }

        public final int l() {
            return this.j;
        }

        public final int m() {
            int i2 = this.k;
            return i2 == -1 ? this.g : i2;
        }

        public final int n() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public List<Object> o() {
            if ((this.n & 1024) != 0) {
                return w;
            }
            List<Object> list = this.o;
            return (list == null || list.size() == 0) ? w : this.p;
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i2) {
            return (i2 & this.n) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return (this.n & 512) != 0 || t();
        }

        /* access modifiers changed from: package-private */
        public boolean r() {
            return (this.e.getParent() == null || this.e.getParent() == this.v) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.n & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            return (this.n & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.g + " id=" + this.i + ", oldPos=" + this.h + ", pLpos:" + this.k);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.s ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.q + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.e.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.n & 16) == 0 && !o4.L(this.e);
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return (this.n & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return this.r != null;
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            return (this.n & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean y() {
            return (this.n & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            return (this.n & 2) != 0;
        }
    }

    class d implements u.b {
        d() {
        }

        public void a(c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.q.u1(c0Var.e, recyclerView.f);
        }

        public void b(c0 c0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.m(c0Var, cVar, cVar2);
        }

        public void c(c0 c0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.f.J(c0Var);
            RecyclerView.this.o(c0Var, cVar, cVar2);
        }

        public void d(c0 c0Var, l.c cVar, l.c cVar2) {
            c0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.H;
            l lVar = recyclerView.Q;
            if (z) {
                if (!lVar.b(c0Var, c0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.d(c0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.O0();
        }
    }

    class e implements d.b {
        e() {
        }

        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public void b(View view) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 != null) {
                h0.B(RecyclerView.this);
            }
        }

        public int c() {
            return RecyclerView.this.getChildCount();
        }

        public void d() {
            int c = c();
            for (int i = 0; i < c; i++) {
                View a2 = a(i);
                RecyclerView.this.A(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public c0 f(View view) {
            return RecyclerView.h0(view);
        }

        public void g(int i) {
            c0 h0;
            View a2 = a(i);
            if (!(a2 == null || (h0 = RecyclerView.h0(a2)) == null)) {
                if (!h0.x() || h0.J()) {
                    h0.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + h0 + RecyclerView.this.Q());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        public void h(View view) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 != null) {
                h0.C(RecyclerView.this);
            }
        }

        public void i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.z(view);
        }

        public void j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        public void k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 != null) {
                if (h0.x() || h0.J()) {
                    h0.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + h0 + RecyclerView.this.Q());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    class f implements a.C0048a {
        f() {
        }

        public void a(int i, int i2) {
            RecyclerView.this.E0(i, i2);
            RecyclerView.this.o0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(int i, int i2, Object obj) {
            RecyclerView.this.y1(i, i2, obj);
            RecyclerView.this.p0 = true;
        }

        public void d(a.b bVar) {
            i(bVar);
        }

        public c0 e(int i) {
            c0 a0 = RecyclerView.this.a0(i, true);
            if (a0 != null && !RecyclerView.this.i.n(a0.e)) {
                return a0;
            }
            return null;
        }

        public void f(int i, int i2) {
            RecyclerView.this.F0(i, i2, false);
            RecyclerView.this.o0 = true;
        }

        public void g(int i, int i2) {
            RecyclerView.this.D0(i, i2);
            RecyclerView.this.o0 = true;
        }

        public void h(int i, int i2) {
            RecyclerView.this.F0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.o0 = true;
            recyclerView.l0.d += i2;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.q.Y0(recyclerView, bVar.b, bVar.d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.q.b1(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.q.d1(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.q.a1(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    public static abstract class g<VH extends c0> {
        private final h a = new h();
        private boolean b = false;

        public boolean A(VH vh) {
            return false;
        }

        public void B(VH vh) {
        }

        public void C(VH vh) {
        }

        public void D(VH vh) {
        }

        public void E(i iVar) {
            this.a.registerObserver(iVar);
        }

        public void F(boolean z) {
            if (!j()) {
                this.b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void G(i iVar) {
            this.a.unregisterObserver(iVar);
        }

        public final void e(VH vh, int i) {
            vh.g = i;
            if (k()) {
                vh.i = h(i);
            }
            vh.F(1, 519);
            c3.a("RV OnBindView");
            x(vh, i, vh.o());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.e.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).g = true;
            }
            c3.b();
        }

        public final VH f(ViewGroup viewGroup, int i) {
            try {
                c3.a("RV CreateView");
                VH y = y(viewGroup, i);
                if (y.e.getParent() == null) {
                    y.j = i;
                    return y;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                c3.b();
            }
        }

        public abstract int g();

        public long h(int i) {
            return -1;
        }

        public int i(int i) {
            return 0;
        }

        public final boolean j() {
            return this.a.a();
        }

        public final boolean k() {
            return this.b;
        }

        public final void l() {
            this.a.b();
        }

        public final void m(int i) {
            this.a.d(i, 1);
        }

        public final void n(int i, Object obj) {
            this.a.e(i, 1, obj);
        }

        public final void o(int i) {
            this.a.f(i, 1);
        }

        public final void p(int i, int i2) {
            this.a.c(i, i2);
        }

        public final void q(int i, int i2) {
            this.a.d(i, i2);
        }

        public final void r(int i, int i2, Object obj) {
            this.a.e(i, i2, obj);
        }

        public final void s(int i, int i2) {
            this.a.f(i, i2);
        }

        public final void t(int i, int i2) {
            this.a.g(i, i2);
        }

        public final void u(int i) {
            this.a.g(i, 1);
        }

        public void v(RecyclerView recyclerView) {
        }

        public abstract void w(VH vh, int i);

        public void x(VH vh, int i, List<Object> list) {
            w(vh, i);
        }

        public abstract VH y(ViewGroup viewGroup, int i);

        public void z(RecyclerView recyclerView) {
        }
    }

    static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).e(i, i2, 1);
            }
        }

        public void d(int i, int i2) {
            e(i, i2, (Object) null);
        }

        public void e(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).d(i, i2);
            }
        }

        public void g(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).f(i, i2);
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2, int i3) {
        }

        public void f(int i, int i2) {
        }
    }

    public interface j {
        int a(int i, int i2);
    }

    public static class k {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        private b a = null;
        private ArrayList<a> b = new ArrayList<>();
        private long c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(c0 c0Var);
        }

        public static class c {
            public int a;
            public int b;

            public c a(c0 c0Var) {
                b(c0Var, 0);
                return this;
            }

            public c b(c0 c0Var, int i) {
                View view = c0Var.e;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(c0 c0Var) {
            int i = c0Var.n & 14;
            if (c0Var.t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = c0Var.n();
            int j = c0Var.j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        public abstract boolean a(c0 c0Var, c cVar, c cVar2);

        public abstract boolean b(c0 c0Var, c0 c0Var2, c cVar, c cVar2);

        public abstract boolean c(c0 c0Var, c cVar, c cVar2);

        public abstract boolean d(c0 c0Var, c cVar, c cVar2);

        public abstract boolean f(c0 c0Var);

        public boolean g(c0 c0Var, List<Object> list) {
            return f(c0Var);
        }

        public final void h(c0 c0Var) {
            r(c0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(c0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract void j(c0 c0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(c0 c0Var) {
        }

        public c s(z zVar, c0 c0Var) {
            c q = q();
            q.a(c0Var);
            return q;
        }

        public c t(z zVar, c0 c0Var, int i, List<Object> list) {
            c q = q();
            q.a(c0Var);
            return q;
        }

        public abstract void u();

        /* access modifiers changed from: package-private */
        public void v(b bVar) {
            this.a = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }

        public void a(c0 c0Var) {
            c0Var.G(true);
            if (c0Var.l != null && c0Var.m == null) {
                c0Var.l = null;
            }
            c0Var.m = null;
            if (!c0Var.I() && !RecyclerView.this.X0(c0Var.e) && c0Var.x()) {
                RecyclerView.this.removeDetachedView(c0Var.e, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((LayoutParams) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {
        d e;
        RecyclerView f;
        private final t.b g = new a();
        private final t.b h = new b();
        t i = new t(this.g);
        t j = new t(this.h);
        y k;
        boolean l = false;
        boolean m = false;
        boolean n = false;
        private boolean o = true;
        private boolean p = true;
        int q;
        boolean r;
        private int s;
        private int t;
        private int u;
        private int v;

        class a implements t.b {
            a() {
            }

            public View a(int i) {
                return o.this.S(i);
            }

            public int b(View view) {
                return o.this.a0(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            public int c() {
                return o.this.getPaddingLeft();
            }

            public int d() {
                return o.this.u0() - o.this.getPaddingRight();
            }

            public int e(View view) {
                return o.this.d0(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements t.b {
            b() {
            }

            public View a(int i) {
                return o.this.S(i);
            }

            public int b(View view) {
                return o.this.e0(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            public int c() {
                return o.this.getPaddingTop();
            }

            public int d() {
                return o.this.g0() - o.this.getPaddingBottom();
            }

            public int e(View view) {
                return o.this.Y(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        private static boolean D0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void D1(u uVar, int i2, View view) {
            c0 h0 = RecyclerView.h0(view);
            if (!h0.J()) {
                if (!h0.t() || h0.v() || this.f.p.k()) {
                    H(i2);
                    uVar.D(view);
                    this.f.j.k(h0);
                    return;
                }
                y1(i2);
                uVar.C(h0);
            }
        }

        private void I(int i2, View view) {
            this.e.d(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int U(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.U(int, int, int, int, boolean):int");
        }

        private int[] V(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int u0 = u0() - getPaddingRight();
            int g0 = g0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - paddingLeft;
            int min = Math.min(0, i2);
            int i3 = top - paddingTop;
            int min2 = Math.min(0, i3);
            int i4 = width - u0;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - g0);
            if (j0() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d o0(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(R$styleable.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void p(View view, int i2, boolean z) {
            c0 h0 = RecyclerView.h0(view);
            if (z || h0.v()) {
                this.f.j.b(h0);
            } else {
                this.f.j.p(h0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (h0.L() || h0.w()) {
                if (h0.w()) {
                    h0.K();
                } else {
                    h0.e();
                }
                this.e.c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f) {
                int m2 = this.e.m(view);
                if (i2 == -1) {
                    i2 = this.e.g();
                }
                if (m2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f.indexOfChild(view) + this.f.Q());
                } else if (m2 != i2) {
                    this.f.q.I0(m2, i2);
                }
            } else {
                this.e.a(view, i2, false);
                layoutParams.g = true;
                y yVar = this.k;
                if (yVar != null && yVar.h()) {
                    this.k.k(view);
                }
            }
            if (layoutParams.h) {
                h0.e.invalidate();
                layoutParams.h = false;
            }
        }

        public static int x(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        private boolean z0(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int u0 = u0() - getPaddingRight();
            int g0 = g0() - getPaddingBottom();
            Rect rect = this.f.m;
            Z(focusedChild, rect);
            return rect.left - i2 < u0 && rect.right - i2 > paddingLeft && rect.top - i3 < g0 && rect.bottom - i3 > paddingTop;
        }

        public int A(z zVar) {
            return 0;
        }

        public final boolean A0() {
            return this.p;
        }

        public boolean A1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] V = V(view, rect);
            int i2 = V[0];
            int i3 = V[1];
            if ((z2 && !z0(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.n1(i2, i3);
            }
            return true;
        }

        public int B(z zVar) {
            return 0;
        }

        public boolean B0(u uVar, z zVar) {
            return false;
        }

        public void B1() {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int C(z zVar) {
            return 0;
        }

        public boolean C0() {
            return this.o;
        }

        public void C1() {
            this.l = true;
        }

        public int D(z zVar) {
            return 0;
        }

        public int E(z zVar) {
            return 0;
        }

        public boolean E0() {
            y yVar = this.k;
            return yVar != null && yVar.h();
        }

        public int E1(int i2, u uVar, z zVar) {
            return 0;
        }

        public int F(z zVar) {
            return 0;
        }

        public boolean F0(View view, boolean z, boolean z2) {
            boolean z3 = this.i.b(view, 24579) && this.j.b(view, 24579);
            return z ? z3 : !z3;
        }

        public void F1(int i2) {
        }

        public void G(u uVar) {
            for (int T = T() - 1; T >= 0; T--) {
                D1(uVar, T, S(T));
            }
        }

        public void G0(View view, int i2, int i3, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f;
            view.layout(i2 + rect.left + layoutParams.leftMargin, i3 + rect.top + layoutParams.topMargin, (i4 - rect.right) - layoutParams.rightMargin, (i5 - rect.bottom) - layoutParams.bottomMargin);
        }

        public int G1(int i2, u uVar, z zVar) {
            return 0;
        }

        public void H(int i2) {
            I(i2, S(i2));
        }

        public void H0(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect l0 = this.f.l0(view);
            int i4 = i2 + l0.left + l0.right;
            int i5 = i3 + l0.top + l0.bottom;
            int U = U(u0(), v0(), getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin + i4, layoutParams.width, u());
            int U2 = U(g0(), h0(), getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin + i5, layoutParams.height, v());
            if (O1(view, U, U2, layoutParams)) {
                view.measure(U, U2);
            }
        }

        @Deprecated
        public void H1(boolean z) {
            this.n = z;
        }

        public void I0(int i2, int i3) {
            View S = S(i2);
            if (S != null) {
                H(i2);
                r(S, i3);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f.toString());
        }

        /* access modifiers changed from: package-private */
        public void I1(RecyclerView recyclerView) {
            J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* access modifiers changed from: package-private */
        public void J(RecyclerView recyclerView) {
            this.m = true;
            N0(recyclerView);
        }

        public void J0(int i2) {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                recyclerView.B0(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void J1(int i2, int i3) {
            this.u = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.s = mode;
            if (mode == 0 && !RecyclerView.E0) {
                this.u = 0;
            }
            this.v = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.t = mode2;
            if (mode2 == 0 && !RecyclerView.E0) {
                this.v = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void K(RecyclerView recyclerView, u uVar) {
            this.m = false;
            P0(recyclerView, uVar);
        }

        public void K0(int i2) {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                recyclerView.C0(i2);
            }
        }

        public void K1(int i2, int i3) {
            this.f.setMeasuredDimension(i2, i3);
        }

        public View L(View view) {
            View S;
            RecyclerView recyclerView = this.f;
            if (recyclerView == null || (S = recyclerView.S(view)) == null || this.e.n(S)) {
                return null;
            }
            return S;
        }

        public void L0(g gVar, g gVar2) {
        }

        public void L1(Rect rect, int i2, int i3) {
            K1(x(i2, rect.width() + getPaddingLeft() + getPaddingRight(), m0()), x(i3, rect.height() + getPaddingTop() + getPaddingBottom(), l0()));
        }

        public View M(int i2) {
            int T = T();
            for (int i3 = 0; i3 < T; i3++) {
                View S = S(i3);
                c0 h0 = RecyclerView.h0(S);
                if (h0 != null && h0.m() == i2 && !h0.J() && (this.f.l0.e() || !h0.v())) {
                    return S;
                }
            }
            return null;
        }

        public boolean M0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void M1(int i2, int i3) {
            int T = T();
            if (T == 0) {
                this.f.x(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < T; i8++) {
                View S = S(i8);
                Rect rect = this.f.m;
                Z(S, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f.m.set(i6, i7, i4, i5);
            L1(this.f.m, i2, i3);
        }

        public abstract LayoutParams N();

        public void N0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public void N1(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.f = null;
                this.e = null;
                i2 = 0;
                this.u = 0;
            } else {
                this.f = recyclerView;
                this.e = recyclerView.i;
                this.u = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.v = i2;
            this.s = 1073741824;
            this.t = 1073741824;
        }

        public LayoutParams O(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        @Deprecated
        public void O0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean O1(View view, int i2, int i3, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.o || !D0(view.getWidth(), i2, layoutParams.width) || !D0(view.getHeight(), i3, layoutParams.height);
        }

        public LayoutParams P(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public void P0(RecyclerView recyclerView, u uVar) {
            O0(recyclerView);
        }

        /* access modifiers changed from: package-private */
        public boolean P1() {
            return false;
        }

        public int Q() {
            return -1;
        }

        public View Q0(View view, int i2, u uVar, z zVar) {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean Q1(View view, int i2, int i3, LayoutParams layoutParams) {
            return !this.o || !D0(view.getMeasuredWidth(), i2, layoutParams.width) || !D0(view.getMeasuredHeight(), i3, layoutParams.height);
        }

        public int R(View view) {
            return ((LayoutParams) view.getLayoutParams()).f.bottom;
        }

        public void R0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f;
            S0(recyclerView.f, recyclerView.l0, accessibilityEvent);
        }

        public void R1(RecyclerView recyclerView, z zVar, int i2) {
        }

        public View S(int i2) {
            d dVar = this.e;
            if (dVar != null) {
                return dVar.f(i2);
            }
            return null;
        }

        public void S0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f.canScrollVertically(-1) && !this.f.canScrollHorizontally(-1) && !this.f.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                g gVar = this.f.p;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.g());
                }
            }
        }

        public void S1(y yVar) {
            y yVar2 = this.k;
            if (!(yVar2 == null || yVar == yVar2 || !yVar2.h())) {
                this.k.r();
            }
            this.k = yVar;
            yVar.q(this.f, this);
        }

        public int T() {
            d dVar = this.e;
            if (dVar != null) {
                return dVar.g();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void T0(a5 a5Var) {
            RecyclerView recyclerView = this.f;
            U0(recyclerView.f, recyclerView.l0, a5Var);
        }

        /* access modifiers changed from: package-private */
        public void T1() {
            y yVar = this.k;
            if (yVar != null) {
                yVar.r();
            }
        }

        public void U0(u uVar, z zVar, a5 a5Var) {
            if (this.f.canScrollVertically(-1) || this.f.canScrollHorizontally(-1)) {
                a5Var.a(8192);
                a5Var.z0(true);
            }
            if (this.f.canScrollVertically(1) || this.f.canScrollHorizontally(1)) {
                a5Var.a(4096);
                a5Var.z0(true);
            }
            a5Var.f0(a5.b.b(q0(uVar, zVar), X(uVar, zVar), B0(uVar, zVar), r0(uVar, zVar)));
        }

        public boolean U1() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void V0(View view, a5 a5Var) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 != null && !h0.v() && !this.e.n(h0.e)) {
                RecyclerView recyclerView = this.f;
                W0(recyclerView.f, recyclerView.l0, view, a5Var);
            }
        }

        public boolean W() {
            RecyclerView recyclerView = this.f;
            return recyclerView != null && recyclerView.k;
        }

        public void W0(u uVar, z zVar, View view, a5 a5Var) {
            a5Var.g0(a5.c.f(v() ? n0(view) : 0, 1, u() ? n0(view) : 0, 1, false, false));
        }

        public int X(u uVar, z zVar) {
            RecyclerView recyclerView = this.f;
            if (recyclerView == null || recyclerView.p == null || !u()) {
                return 1;
            }
            return this.f.p.g();
        }

        public View X0(View view, int i2) {
            return null;
        }

        public int Y(View view) {
            return view.getBottom() + R(view);
        }

        public void Y0(RecyclerView recyclerView, int i2, int i3) {
        }

        public void Z(View view, Rect rect) {
            RecyclerView.i0(view, rect);
        }

        public void Z0(RecyclerView recyclerView) {
        }

        public int a0(View view) {
            return view.getLeft() - k0(view);
        }

        public void a1(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int b0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void b1(RecyclerView recyclerView, int i2, int i3) {
        }

        public int c0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void c1(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d0(View view) {
            return view.getRight() + p0(view);
        }

        public void d1(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c1(recyclerView, i2, i3);
        }

        public int e0(View view) {
            return view.getTop() - s0(view);
        }

        public void e1(u uVar, z zVar) {
        }

        public View f0() {
            View focusedChild;
            RecyclerView recyclerView = this.f;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.e.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void f1(z zVar) {
        }

        public int g0() {
            return this.v;
        }

        public void g1(u uVar, z zVar, int i2, int i3) {
            this.f.x(i2, i3);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                return o4.C(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                return o4.D(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0() {
            return this.t;
        }

        @Deprecated
        public boolean h1(RecyclerView recyclerView, View view, View view2) {
            return E0() || recyclerView.w0();
        }

        public int i0() {
            RecyclerView recyclerView = this.f;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.g();
            }
            return 0;
        }

        public boolean i1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return h1(recyclerView, view, view2);
        }

        public int j0() {
            return o4.y(this.f);
        }

        public void j1(Parcelable parcelable) {
        }

        public int k0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f.left;
        }

        public Parcelable k1() {
            return null;
        }

        public void l(View view) {
            m(view, -1);
        }

        public int l0() {
            return o4.z(this.f);
        }

        public void l1(int i2) {
        }

        public void m(View view, int i2) {
            p(view, i2, true);
        }

        public int m0() {
            return o4.A(this.f);
        }

        /* access modifiers changed from: package-private */
        public void m1(y yVar) {
            if (this.k == yVar) {
                this.k = null;
            }
        }

        public void n(View view) {
            o(view, -1);
        }

        public int n0(View view) {
            return ((LayoutParams) view.getLayoutParams()).a();
        }

        /* access modifiers changed from: package-private */
        public boolean n1(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f;
            return o1(recyclerView.f, recyclerView.l0, i2, bundle);
        }

        public void o(View view, int i2) {
            p(view, i2, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean o1(androidx.recyclerview.widget.RecyclerView.u r8, androidx.recyclerview.widget.RecyclerView.z r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.g0()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.u0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.g0()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.u0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.q1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.o1(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        public int p0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f.right;
        }

        /* access modifiers changed from: package-private */
        public boolean p1(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f;
            return q1(recyclerView.f, recyclerView.l0, view, i2, bundle);
        }

        public void q(String str) {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int q0(u uVar, z zVar) {
            RecyclerView recyclerView = this.f;
            if (recyclerView == null || recyclerView.p == null || !v()) {
                return 1;
            }
            return this.f.p.g();
        }

        public boolean q1(u uVar, z zVar, View view, int i2, Bundle bundle) {
            return false;
        }

        public void r(View view, int i2) {
            s(view, i2, (LayoutParams) view.getLayoutParams());
        }

        public int r0(u uVar, z zVar) {
            return 0;
        }

        public void r1() {
            for (int T = T() - 1; T >= 0; T--) {
                this.e.q(T);
            }
        }

        public void s(View view, int i2, LayoutParams layoutParams) {
            c0 h0 = RecyclerView.h0(view);
            if (h0.v()) {
                this.f.j.b(h0);
            } else {
                this.f.j.p(h0);
            }
            this.e.c(view, i2, layoutParams, h0.v());
        }

        public int s0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f.top;
        }

        public void s1(u uVar) {
            for (int T = T() - 1; T >= 0; T--) {
                if (!RecyclerView.h0(S(T)).J()) {
                    v1(T, uVar);
                }
            }
        }

        public void t(View view, Rect rect) {
            RecyclerView recyclerView = this.f;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.l0(view));
            }
        }

        public void t0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f.o;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* access modifiers changed from: package-private */
        public void t1(u uVar) {
            int j2 = uVar.j();
            for (int i2 = j2 - 1; i2 >= 0; i2--) {
                View n2 = uVar.n(i2);
                c0 h0 = RecyclerView.h0(n2);
                if (!h0.J()) {
                    h0.G(false);
                    if (h0.x()) {
                        this.f.removeDetachedView(n2, false);
                    }
                    l lVar = this.f.Q;
                    if (lVar != null) {
                        lVar.j(h0);
                    }
                    h0.G(true);
                    uVar.y(n2);
                }
            }
            uVar.e();
            if (j2 > 0) {
                this.f.invalidate();
            }
        }

        public boolean u() {
            return false;
        }

        public int u0() {
            return this.u;
        }

        public void u1(View view, u uVar) {
            x1(view);
            uVar.B(view);
        }

        public boolean v() {
            return false;
        }

        public int v0() {
            return this.s;
        }

        public void v1(int i2, u uVar) {
            View S = S(i2);
            y1(i2);
            uVar.B(S);
        }

        public boolean w(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* access modifiers changed from: package-private */
        public boolean w0() {
            int T = T();
            for (int i2 = 0; i2 < T; i2++) {
                ViewGroup.LayoutParams layoutParams = S(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean w1(Runnable runnable) {
            RecyclerView recyclerView = this.f;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean x0() {
            return this.m;
        }

        public void x1(View view) {
            this.e.p(view);
        }

        public void y(int i2, int i3, z zVar, c cVar) {
        }

        public boolean y0() {
            return this.n;
        }

        public void y1(int i2) {
            if (S(i2) != null) {
                this.e.q(i2);
            }
        }

        public void z(int i2, c cVar) {
        }

        public boolean z1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return A1(recyclerView, view, rect, z, false);
        }
    }

    public interface p {
        void a(View view);

        void b(View view);
    }

    public static abstract class q {
        public abstract boolean a(int i, int i2);
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class t {
        SparseArray<a> a = new SparseArray<>();
        private int b = 0;

        static class a {
            final ArrayList<c0> a = new ArrayList<>();
            int b = 5;
            long c = 0;
            long d = 0;

            a() {
            }
        }

        private a g(int i) {
            a aVar = this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.b++;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                this.a.valueAt(i).a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.b--;
        }

        /* access modifiers changed from: package-private */
        public void d(int i, long j) {
            a g = g(i);
            g.d = j(g.d, j);
        }

        /* access modifiers changed from: package-private */
        public void e(int i, long j) {
            a g = g(i);
            g.c = j(g.c, j);
        }

        public c0 f(int i) {
            a aVar = this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<c0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(c0 c0Var) {
            int l = c0Var.l();
            ArrayList<c0> arrayList = g(l).a;
            if (this.a.get(l).b > arrayList.size()) {
                c0Var.D();
                arrayList.add(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean k(int i, long j, long j2) {
            long j3 = g(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i, long j, long j2) {
            long j3 = g(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class u {
        final ArrayList<c0> a = new ArrayList<>();
        ArrayList<c0> b = null;
        final ArrayList<c0> c = new ArrayList<>();
        private final List<c0> d = Collections.unmodifiableList(this.a);
        private int e = 2;
        int f = 2;
        t g;
        private a0 h;

        public u() {
        }

        private boolean H(c0 c0Var, int i2, int i3, long j) {
            c0Var.v = RecyclerView.this;
            int l = c0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.g.k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.p.e(c0Var, i2);
            this.g.d(c0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c0Var);
            if (!RecyclerView.this.l0.e()) {
                return true;
            }
            c0Var.k = i3;
            return true;
        }

        private void b(c0 c0Var) {
            if (RecyclerView.this.v0()) {
                View view = c0Var.e;
                if (o4.w(view) == 0) {
                    o4.s0(view, 1);
                }
                p pVar = RecyclerView.this.s0;
                if (pVar != null) {
                    w3 n = pVar.n();
                    if (n instanceof p.a) {
                        ((p.a) n).o(view);
                    }
                    o4.i0(view, n);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(c0 c0Var) {
            View view = c0Var.e;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i2) {
            a(this.c.get(i2), true);
            this.c.remove(i2);
        }

        public void B(View view) {
            c0 h0 = RecyclerView.h0(view);
            if (h0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (h0.w()) {
                h0.K();
            } else if (h0.L()) {
                h0.e();
            }
            C(h0);
            if (RecyclerView.this.Q != null && !h0.u()) {
                RecyclerView.this.Q.j(h0);
            }
        }

        /* access modifiers changed from: package-private */
        public void C(c0 c0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (c0Var.w() || c0Var.e.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.w());
                sb.append(" isAttached:");
                if (c0Var.e.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb.toString());
            } else if (c0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.Q());
            } else if (!c0Var.J()) {
                boolean h2 = c0Var.h();
                g gVar = RecyclerView.this.p;
                if ((gVar != null && h2 && gVar.A(c0Var)) || c0Var.u()) {
                    if (this.f <= 0 || c0Var.p(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.G0 && size > 0 && !RecyclerView.this.k0.d(c0Var.g)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.k0.d(this.c.get(i2).g)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.c.add(size, c0Var);
                        z = true;
                    }
                    if (!z) {
                        a(c0Var, true);
                        z2 = z;
                        RecyclerView.this.j.q(c0Var);
                        if (!z2 && !z3 && h2) {
                            c0Var.v = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.j.q(c0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            }
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            ArrayList<c0> arrayList;
            c0 h0 = RecyclerView.h0(view);
            if (!h0.p(12) && h0.y() && !RecyclerView.this.q(h0)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                h0.H(this, true);
                arrayList = this.b;
            } else if (!h0.t() || h0.v() || RecyclerView.this.p.k()) {
                h0.H(this, false);
                arrayList = this.a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
            }
            arrayList.add(h0);
        }

        /* access modifiers changed from: package-private */
        public void E(t tVar) {
            t tVar2 = this.g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.g = tVar;
            if (tVar != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(a0 a0Var) {
            this.h = a0Var;
        }

        public void G(int i2) {
            this.e = i2;
            K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.c0 I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.l0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.l0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.e
                r5.removeDetachedView(r9, r8)
                r1.K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.L()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.h
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.p
                int r9 = r9.g()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.p
                int r9 = r9.i(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.p
                boolean r10 = r10.k()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.p
                long r10 = r1.h(r5)
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.g = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r6.h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r1.g0(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.J()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$t r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r0.f(r9)
                if (r0 == 0) goto L_0x0101
                r0.D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.D0
                if (r1 == 0) goto L_0x0101
                r6.r(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$t r10 = r6.g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.l(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.p
                androidx.recyclerview.widget.RecyclerView$c0 r2 = r5.f(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.G0
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.W(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r5 = r6.g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.l0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.l0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.p(r0)
                if (r1 == 0) goto L_0x01bb
                r9.F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.l0
                boolean r0 = r0.k
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.l.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.Q
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.l0
                java.util.List r4 = r9.o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.T0(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.l0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x01ce
                r9.k = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.z()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = 0
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.h
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.H(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.e
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0204:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.e
                r2.setLayoutParams(r1)
                goto L_0x021d
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x0204
            L_0x021b:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x021d:
                r1.e = r9
                if (r10 == 0) goto L_0x0224
                if (r0 == 0) goto L_0x0224
                goto L_0x0225
            L_0x0224:
                r7 = 0
            L_0x0225:
                r1.h = r7
                return r9
            L_0x0228:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.l0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        /* access modifiers changed from: package-private */
        public void J(c0 c0Var) {
            (c0Var.s ? this.b : this.a).remove(c0Var);
            c0Var.r = null;
            c0Var.s = false;
            c0Var.e();
        }

        /* access modifiers changed from: package-private */
        public void K() {
            o oVar = RecyclerView.this.q;
            this.f = this.e + (oVar != null ? oVar.q : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                A(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean L(c0 c0Var) {
            if (c0Var.v()) {
                return RecyclerView.this.l0.e();
            }
            int i2 = c0Var.g;
            if (i2 < 0 || i2 >= RecyclerView.this.p.g()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.Q());
            } else if (RecyclerView.this.l0.e() || RecyclerView.this.p.i(c0Var.g) == c0Var.l()) {
                return !RecyclerView.this.p.k() || c0Var.k() == RecyclerView.this.p.h(c0Var.g);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.c.get(size);
                if (c0Var != null && (i4 = c0Var.g) >= i2 && i4 < i5) {
                    c0Var.b(2);
                    A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(c0 c0Var, boolean z) {
            RecyclerView.s(c0Var);
            View view = c0Var.e;
            p pVar = RecyclerView.this.s0;
            if (pVar != null) {
                w3 n = pVar.n();
                o4.i0(view, n instanceof p.a ? ((p.a) n).n(view) : null);
            }
            if (z) {
                g(c0Var);
            }
            c0Var.v = null;
            i().i(c0Var);
        }

        public void c() {
            this.a.clear();
            z();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.c.get(i2).c();
            }
            int size2 = this.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.get(i3).c();
            }
            ArrayList<c0> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.b.get(i4).c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.a.clear();
            ArrayList<c0> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.l0.b()) {
                return !RecyclerView.this.l0.e() ? i2 : RecyclerView.this.h.m(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.l0.b() + RecyclerView.this.Q());
        }

        /* access modifiers changed from: package-private */
        public void g(c0 c0Var) {
            v vVar = RecyclerView.this.r;
            if (vVar != null) {
                vVar.a(c0Var);
            }
            g gVar = RecyclerView.this.p;
            if (gVar != null) {
                gVar.D(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.l0 != null) {
                recyclerView.j.q(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public c0 h(int i2) {
            int size;
            int m;
            ArrayList<c0> arrayList = this.b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    c0 c0Var = this.b.get(i4);
                    if (c0Var.L() || c0Var.m() != i2) {
                        i4++;
                    } else {
                        c0Var.b(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.p.k() && (m = RecyclerView.this.h.m(i2)) > 0 && m < RecyclerView.this.p.g()) {
                    long h2 = RecyclerView.this.p.h(m);
                    while (i3 < size) {
                        c0 c0Var2 = this.b.get(i3);
                        if (c0Var2.L() || c0Var2.k() != h2) {
                            i3++;
                        } else {
                            c0Var2.b(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public t i() {
            if (this.g == null) {
                this.g = new t();
            }
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.a.size();
        }

        public List<c0> k() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public c0 l(long j, int i2, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                c0 c0Var = this.a.get(size);
                if (c0Var.k() == j && !c0Var.L()) {
                    if (i2 == c0Var.l()) {
                        c0Var.b(32);
                        if (c0Var.v() && !RecyclerView.this.l0.e()) {
                            c0Var.F(2, 14);
                        }
                        return c0Var;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.e, false);
                        y(c0Var.e);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                c0 c0Var2 = this.c.get(size2);
                if (c0Var2.k() == j && !c0Var2.r()) {
                    if (i2 == c0Var2.l()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return c0Var2;
                    } else if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public c0 m(int i2, boolean z) {
            View e2;
            int size = this.a.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                c0 c0Var = this.a.get(i4);
                if (c0Var.L() || c0Var.m() != i2 || c0Var.t() || (!RecyclerView.this.l0.h && c0Var.v())) {
                    i4++;
                } else {
                    c0Var.b(32);
                    return c0Var;
                }
            }
            if (z || (e2 = RecyclerView.this.i.e(i2)) == null) {
                int size2 = this.c.size();
                while (i3 < size2) {
                    c0 c0Var2 = this.c.get(i3);
                    if (c0Var2.t() || c0Var2.m() != i2 || c0Var2.r()) {
                        i3++;
                    } else {
                        if (!z) {
                            this.c.remove(i3);
                        }
                        return c0Var2;
                    }
                }
                return null;
            }
            c0 h0 = RecyclerView.h0(e2);
            RecyclerView.this.i.s(e2);
            int m = RecyclerView.this.i.m(e2);
            if (m != -1) {
                RecyclerView.this.i.d(m);
                D(e2);
                h0.b(8224);
                return h0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + h0 + RecyclerView.this.Q());
        }

        /* access modifiers changed from: package-private */
        public View n(int i2) {
            return this.a.get(i2).e;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i2, boolean z) {
            return I(i2, z, Long.MAX_VALUE).e;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutParams layoutParams = (LayoutParams) this.c.get(i2).e.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.g = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0 c0Var = this.c.get(i2);
                if (c0Var != null) {
                    c0Var.b(6);
                    c0Var.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.p;
            if (gVar == null || !gVar.k()) {
                z();
            }
        }

        /* access modifiers changed from: package-private */
        public void u(int i2, int i3) {
            int size = this.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                c0 c0Var = this.c.get(i4);
                if (c0Var != null && c0Var.g >= i2) {
                    c0Var.A(i3, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i6 = -1;
                i5 = i2;
                i4 = i3;
            } else {
                i6 = 1;
                i4 = i2;
                i5 = i3;
            }
            int size = this.c.size();
            for (int i8 = 0; i8 < size; i8++) {
                c0 c0Var = this.c.get(i8);
                if (c0Var != null && (i7 = c0Var.g) >= i5 && i7 <= i4) {
                    if (i7 == i2) {
                        c0Var.A(i3 - i2, false);
                    } else {
                        c0Var.A(i6, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.c.get(size);
                if (c0Var != null) {
                    int i5 = c0Var.g;
                    if (i5 >= i4) {
                        c0Var.A(-i3, z);
                    } else if (i5 >= i2) {
                        c0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        public void y(View view) {
            c0 h0 = RecyclerView.h0(view);
            h0.r = null;
            h0.s = false;
            h0.e();
            C(h0);
        }

        /* access modifiers changed from: package-private */
        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.G0) {
                RecyclerView.this.k0.b();
            }
        }
    }

    public interface v {
        void a(c0 c0Var);
    }

    private class w extends i {
        w() {
        }

        public void a() {
            RecyclerView.this.p((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l0.g = true;
            recyclerView.R0(true);
            if (!RecyclerView.this.h.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i, int i2, Object obj) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.h.r(i, i2, obj)) {
                g();
            }
        }

        public void d(int i, int i2) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.h.s(i, i2)) {
                g();
            }
        }

        public void e(int i, int i2, int i3) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.h.t(i, i2, i3)) {
                g();
            }
        }

        public void f(int i, int i2) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.h.u(i, i2)) {
                g();
            }
        }

        /* access modifiers changed from: package-private */
        public void g() {
            if (RecyclerView.F0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.w && recyclerView.v) {
                    o4.b0(recyclerView, recyclerView.l);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.E = true;
            recyclerView2.requestLayout();
        }
    }

    public static class x extends j5 {
        public static final Parcelable.Creator<x> CREATOR = new a();
        Parcelable g;

        static class a implements Parcelable.ClassLoaderCreator<x> {
            a() {
            }

            /* renamed from: a */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            /* renamed from: c */
            public x[] newArray(int i) {
                return new x[i];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        public void b(x xVar) {
            this.g = xVar.g;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.g, 0);
        }
    }

    public static abstract class y {
        private int a = -1;
        private RecyclerView b;
        private o c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a(0, 0);
        private boolean h;

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }

            private void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.y0(i);
                    this.f = false;
                } else if (this.f) {
                    e();
                    recyclerView.i0.f(this.a, this.b, this.c, this.e);
                    this.g++;
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }
        }

        public interface b {
            PointF a(int i);
        }

        public PointF a(int i) {
            o e2 = e();
            if (e2 instanceof b) {
                return ((b) e2).a(i);
            }
            "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName();
            return null;
        }

        public View b(int i) {
            return this.b.q.M(i);
        }

        public int c() {
            return this.b.q.T();
        }

        public int d(View view) {
            return this.b.f0(view);
        }

        public o e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (!(!this.d || this.f != null || this.c == null || (a2 = a(this.a)) == null || (a2.x == Utils.FLOAT_EPSILON && a2.y == Utils.FLOAT_EPSILON))) {
                recyclerView.i1((int) Math.signum(a2.x), (int) Math.signum(a2.y), (int[]) null);
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.l0, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.l0, this.g);
                boolean a3 = this.g.a();
                this.g.c(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.i0.e();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i, int i2, z zVar, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, z zVar, a aVar);

        public void p(int i) {
            this.a = i;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.i0.g();
            if (this.h) {
                "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.";
            }
            this.b = recyclerView;
            this.c = oVar;
            int i = this.a;
            if (i != -1) {
                recyclerView.l0.a = i;
                this.e = true;
                this.d = true;
                this.f = b(f());
                m();
                this.b.i0.e();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.l0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.m1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class z {
        int a = -1;
        private SparseArray<Object> b;
        int c = 0;
        int d = 0;
        int e = 1;
        int f = 0;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if ((this.e & i2) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.e));
            }
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public void f(g gVar) {
            this.e = 1;
            this.f = gVar.g();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            C0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            D0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0027
            r1 = 1
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            E0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            F0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            G0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 15
            if (r1 > r2) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            H0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r2) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            I0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            J0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            K0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new w();
        this.f = new u();
        this.j = new u();
        this.l = new a();
        this.m = new Rect();
        this.n = new Rect();
        this.o = new RectF();
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        this.z = 0;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = new k();
        this.Q = new e();
        this.R = 0;
        this.S = -1;
        this.f0 = Float.MIN_VALUE;
        this.g0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.h0 = true;
        this.i0 = new b0();
        this.k0 = G0 ? new h.b() : null;
        this.l0 = new z();
        this.o0 = false;
        this.p0 = false;
        this.q0 = new m();
        this.r0 = false;
        this.u0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new int[2];
        this.z0 = new ArrayList();
        this.A0 = new b();
        this.B0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b0 = viewConfiguration.getScaledTouchSlop();
        this.f0 = p4.b(viewConfiguration, context);
        this.g0 = p4.d(viewConfiguration, context);
        this.d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.Q.v(this.q0);
        p0();
        r0();
        q0();
        if (o4.w(this) == 0) {
            o4.s0(this, 1);
        }
        this.F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new p(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, R$styleable.RecyclerView, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(R$styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.k = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_android_clipToPadding, true);
        boolean z3 = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_fastScrollEnabled, false);
        this.x = z3;
        if (z3) {
            s0((StateListDrawable) obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        w(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0, i2, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, C0, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void B() {
        int i2 = this.D;
        this.D = 0;
        if (i2 != 0 && v0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            z4.b(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void D() {
        boolean z2 = true;
        this.l0.a(1);
        R(this.l0);
        this.l0.j = false;
        s1();
        this.j.f();
        I0();
        Q0();
        f1();
        z zVar = this.l0;
        if (!zVar.k || !this.p0) {
            z2 = false;
        }
        zVar.i = z2;
        this.p0 = false;
        this.o0 = false;
        z zVar2 = this.l0;
        zVar2.h = zVar2.l;
        zVar2.f = this.p.g();
        V(this.u0);
        if (this.l0.k) {
            int g2 = this.i.g();
            for (int i2 = 0; i2 < g2; i2++) {
                c0 h02 = h0(this.i.f(i2));
                if (!h02.J() && (!h02.t() || this.p.k())) {
                    this.j.e(h02, this.Q.t(this.l0, h02, l.e(h02), h02.o()));
                    if (this.l0.i && h02.y() && !h02.v() && !h02.J() && !h02.t()) {
                        this.j.c(d0(h02), h02);
                    }
                }
            }
        }
        if (this.l0.l) {
            g1();
            z zVar3 = this.l0;
            boolean z3 = zVar3.g;
            zVar3.g = false;
            this.q.e1(this.f, zVar3);
            this.l0.g = z3;
            for (int i3 = 0; i3 < this.i.g(); i3++) {
                c0 h03 = h0(this.i.f(i3));
                if (!h03.J() && !this.j.i(h03)) {
                    int e2 = l.e(h03);
                    boolean p2 = h03.p(8192);
                    if (!p2) {
                        e2 |= 4096;
                    }
                    l.c t2 = this.Q.t(this.l0, h03, e2, h03.o());
                    if (p2) {
                        T0(h03, t2);
                    } else {
                        this.j.a(h03, t2);
                    }
                }
            }
        }
        t();
        J0();
        u1(false);
        this.l0.e = 2;
    }

    private void E() {
        s1();
        I0();
        this.l0.a(6);
        this.h.j();
        this.l0.f = this.p.g();
        z zVar = this.l0;
        zVar.d = 0;
        zVar.h = false;
        this.q.e1(this.f, zVar);
        z zVar2 = this.l0;
        zVar2.g = false;
        this.g = null;
        zVar2.k = zVar2.k && this.Q != null;
        this.l0.e = 4;
        J0();
        u1(false);
    }

    private void F() {
        this.l0.a(4);
        s1();
        I0();
        z zVar = this.l0;
        zVar.e = 1;
        if (zVar.k) {
            for (int g2 = this.i.g() - 1; g2 >= 0; g2--) {
                c0 h02 = h0(this.i.f(g2));
                if (!h02.J()) {
                    long d02 = d0(h02);
                    l.c s2 = this.Q.s(this.l0, h02);
                    c0 g3 = this.j.g(d02);
                    if (g3 != null && !g3.J()) {
                        boolean h2 = this.j.h(g3);
                        boolean h3 = this.j.h(h02);
                        if (!h2 || g3 != h02) {
                            l.c n2 = this.j.n(g3);
                            this.j.d(h02, s2);
                            l.c m2 = this.j.m(h02);
                            if (n2 == null) {
                                m0(d02, h02, g3);
                            } else {
                                n(g3, h02, n2, m2, h2, h3);
                            }
                        }
                    }
                    this.j.d(h02, s2);
                }
            }
            this.j.o(this.B0);
        }
        this.q.t1(this.f);
        z zVar2 = this.l0;
        zVar2.c = zVar2.f;
        this.H = false;
        this.I = false;
        zVar2.k = false;
        zVar2.l = false;
        this.q.l = false;
        ArrayList<c0> arrayList = this.f.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.q;
        if (oVar.r) {
            oVar.q = 0;
            oVar.r = false;
            this.f.K();
        }
        this.q.f1(this.l0);
        J0();
        u1(false);
        this.j.f();
        int[] iArr = this.u0;
        if (y(iArr[0], iArr[1])) {
            J(0, 0);
        }
        U0();
        d1();
    }

    private boolean L(MotionEvent motionEvent) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.u = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return U(motionEvent);
        }
    }

    private void L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.W = x2;
            this.U = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.a0 = y2;
            this.V = y2;
        }
    }

    private boolean P0() {
        return this.Q != null && this.q.U1();
    }

    private void Q0() {
        if (this.H) {
            this.h.y();
            if (this.I) {
                this.q.Z0(this);
            }
        }
        if (P0()) {
            this.h.w();
        } else {
            this.h.j();
        }
        boolean z2 = false;
        boolean z3 = this.o0 || this.p0;
        this.l0.k = this.y && this.Q != null && (this.H || z3 || this.q.l) && (!this.H || this.p.k());
        z zVar = this.l0;
        if (zVar.k && z3 && !this.H && P0()) {
            z2 = true;
        }
        zVar.l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void S0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.N()
            android.widget.EdgeEffect r3 = r6.M
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.d.a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.O()
            android.widget.EdgeEffect r3 = r6.O
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.P()
            android.widget.EdgeEffect r9 = r6.N
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.M()
            android.widget.EdgeEffect r9 = r6.P
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            defpackage.o4.Z(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S0(float, float, float, float):void");
    }

    private boolean U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.t.size();
        int i2 = 0;
        while (i2 < size) {
            r rVar = this.t.get(i2);
            if (!rVar.b(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.u = rVar;
                return true;
            }
        }
        return false;
    }

    private void U0() {
        View findViewById;
        if (this.h0 && this.p != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!I0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.i.n(focusedChild)) {
                            return;
                        }
                    } else if (this.i.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                c0 Z = (this.l0.n == -1 || !this.p.k()) ? null : Z(this.l0.n);
                if (Z != null && !this.i.n(Z.e) && Z.e.hasFocusable()) {
                    view = Z.e;
                } else if (this.i.g() > 0) {
                    view = X();
                }
                if (view != null) {
                    int i2 = this.l0.o;
                    if (!(((long) i2) == -1 || (findViewById = view.findViewById(i2)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void V(int[] iArr) {
        int g2 = this.i.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            c0 h02 = h0(this.i.f(i4));
            if (!h02.J()) {
                int m2 = h02.m();
                if (m2 < i2) {
                    i2 = m2;
                }
                if (m2 > i3) {
                    i3 = m2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private void V0() {
        boolean z2;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.M.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.P.isFinished();
        }
        if (z2) {
            o4.Z(this);
        }
    }

    static RecyclerView W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView W2 = W(viewGroup.getChildAt(i2));
            if (W2 != null) {
                return W2;
            }
        }
        return null;
    }

    private View X() {
        c0 Y;
        int i2 = this.l0.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = this.l0.b();
        int i3 = i2;
        while (i3 < b2) {
            c0 Y2 = Y(i3);
            if (Y2 == null) {
                break;
            } else if (Y2.e.hasFocusable()) {
                return Y2.e;
            } else {
                i3++;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (Y = Y(min)) == null) {
                return null;
            }
            if (Y.e.hasFocusable()) {
                return Y.e;
            }
        }
    }

    private void c1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.m.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.g) {
                Rect rect = layoutParams2.f;
                Rect rect2 = this.m;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.m);
            offsetRectIntoDescendantCoords(view, this.m);
        }
        this.q.A1(this, view, this.m, !this.y, view2 == null);
    }

    private void d1() {
        z zVar = this.l0;
        zVar.n = -1;
        zVar.m = -1;
        zVar.o = -1;
    }

    private void e1() {
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        v1(0);
        V0();
    }

    private void f1() {
        c0 c0Var = null;
        View focusedChild = (!this.h0 || !hasFocus() || this.p == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            c0Var = T(focusedChild);
        }
        if (c0Var == null) {
            d1();
            return;
        }
        this.l0.n = this.p.k() ? c0Var.k() : -1;
        this.l0.m = this.H ? -1 : c0Var.v() ? c0Var.h : c0Var.j();
        this.l0.o = j0(c0Var.e);
    }

    private void g(c0 c0Var) {
        View view = c0Var.e;
        boolean z2 = view.getParent() == this;
        this.f.J(g0(view));
        if (c0Var.x()) {
            this.i.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        d dVar = this.i;
        if (!z2) {
            dVar.b(view, true);
        } else {
            dVar.k(view);
        }
    }

    private f4 getScrollingChildHelper() {
        if (this.v0 == null) {
            this.v0 = new f4(this);
        }
        return this.v0;
    }

    static c0 h0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).e;
    }

    static void i0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    private int j0(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    private String k0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private void k1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.p;
        if (gVar2 != null) {
            gVar2.G(this.e);
            this.p.z(this);
        }
        if (!z2 || z3) {
            W0();
        }
        this.h.y();
        g gVar3 = this.p;
        this.p = gVar;
        if (gVar != null) {
            gVar.E(this.e);
            gVar.v(this);
        }
        o oVar = this.q;
        if (oVar != null) {
            oVar.L0(gVar3, this.p);
        }
        this.f.x(gVar3, this.p, z2);
        this.l0.g = true;
    }

    private void m0(long j2, c0 c0Var, c0 c0Var2) {
        int g2 = this.i.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 h02 = h0(this.i.f(i2));
            if (h02 != c0Var && d0(h02) == j2) {
                g gVar = this.p;
                if (gVar == null || !gVar.k()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + h02 + " \n View Holder 2:" + c0Var + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + h02 + " \n View Holder 2:" + c0Var + Q());
            }
        }
        "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + Q();
    }

    private void n(c0 c0Var, c0 c0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        c0Var.G(false);
        if (z2) {
            g(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z3) {
                g(c0Var2);
            }
            c0Var.l = c0Var2;
            g(c0Var);
            this.f.J(c0Var);
            c0Var2.G(false);
            c0Var2.m = c0Var;
        }
        if (this.Q.b(c0Var, c0Var2, cVar, cVar2)) {
            O0();
        }
    }

    private boolean o0() {
        int g2 = this.i.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 h02 = h0(this.i.f(i2));
            if (h02 != null && !h02.J() && h02.y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void q0() {
        if (o4.x(this) == 0) {
            o4.t0(this, 8);
        }
    }

    private void r() {
        e1();
        setScrollState(0);
    }

    private void r0() {
        this.i = new d(new e());
    }

    static void s(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.f;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        c0Var.f = null;
                        return;
                    } else if (view != c0Var.e) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void w(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String k02 = k0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(k02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(J0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + k02, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + k02, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + k02, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + k02, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + k02, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + k02, e8);
                }
            }
        }
    }

    private boolean x0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || S(view2) == null) {
            return false;
        }
        if (view == null || S(view) == null) {
            return true;
        }
        this.m.set(0, 0, view.getWidth(), view.getHeight());
        this.n.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.m);
        offsetDescendantRectToMyCoords(view2, this.n);
        char c2 = 65535;
        int i4 = this.q.j0() == 1 ? -1 : 1;
        Rect rect = this.m;
        int i5 = rect.left;
        int i6 = this.n.left;
        if ((i5 < i6 || rect.right <= i6) && this.m.right < this.n.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.m;
            int i7 = rect2.right;
            int i8 = this.n.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.m.left > this.n.left) ? -1 : 0;
        }
        Rect rect3 = this.m;
        int i9 = rect3.top;
        int i10 = this.n.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.m.bottom < this.n.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.m;
            int i11 = rect4.bottom;
            int i12 = this.n.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.m.top <= this.n.top) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + Q());
    }

    private void x1() {
        this.i0.g();
        o oVar = this.q;
        if (oVar != null) {
            oVar.T1();
        }
    }

    private boolean y(int i2, int i3) {
        V(this.u0);
        int[] iArr = this.u0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void A(View view) {
        c0 h02 = h0(view);
        H0(view);
        g gVar = this.p;
        if (!(gVar == null || h02 == null)) {
            gVar.C(h02);
        }
        List<p> list = this.G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.G.get(size).a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A0() {
        int j2 = this.i.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 h02 = h0(this.i.i(i2));
            if (h02 != null && !h02.J()) {
                h02.b(6);
            }
        }
        z0();
        this.f.t();
    }

    public void B0(int i2) {
        int g2 = this.i.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.i.f(i3).offsetLeftAndRight(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        if (this.p != null && this.q != null) {
            z zVar = this.l0;
            zVar.j = false;
            if (zVar.e == 1) {
                D();
            } else if (!this.h.q() && this.q.u0() == getWidth() && this.q.g0() == getHeight()) {
                this.q.I1(this);
                F();
            }
            this.q.I1(this);
            E();
            F();
        }
    }

    public void C0(int i2) {
        int g2 = this.i.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.i.f(i3).offsetTopAndBottom(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void D0(int i2, int i3) {
        int j2 = this.i.j();
        for (int i4 = 0; i4 < j2; i4++) {
            c0 h02 = h0(this.i.i(i4));
            if (h02 != null && !h02.J() && h02.g >= i2) {
                h02.A(i3, false);
                this.l0.g = true;
            }
        }
        this.f.u(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void E0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.i.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            c0 h02 = h0(this.i.i(i8));
            if (h02 != null && (i7 = h02.g) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    h02.A(i3 - i2, false);
                } else {
                    h02.A(i6, false);
                }
                this.l0.g = true;
            }
        }
        this.f.v(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void F0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.i.j();
        for (int i5 = 0; i5 < j2; i5++) {
            c0 h02 = h0(this.i.i(i5));
            if (h02 != null && !h02.J()) {
                int i6 = h02.g;
                if (i6 >= i4) {
                    h02.A(-i3, z2);
                } else if (i6 >= i2) {
                    h02.i(i2 - 1, -i3, z2);
                }
                this.l0.g = true;
            }
        }
        this.f.w(i2, i3, z2);
        requestLayout();
    }

    public boolean G(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void G0(View view) {
    }

    public final void H(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void H0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void I(int i2) {
        o oVar = this.q;
        if (oVar != null) {
            oVar.l1(i2);
        }
        M0(i2);
        s sVar = this.m0;
        if (sVar != null) {
            sVar.a(this, i2);
        }
        List<s> list = this.n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.n0.get(size).a(this, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I0() {
        this.J++;
    }

    /* access modifiers changed from: package-private */
    public void J(int i2, int i3) {
        this.K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        N0(i2, i3);
        s sVar = this.m0;
        if (sVar != null) {
            sVar.b(this, i2, i3);
        }
        List<s> list = this.n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.n0.get(size).b(this, i2, i3);
            }
        }
        this.K--;
    }

    /* access modifiers changed from: package-private */
    public void J0() {
        K0(true);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        int i2;
        for (int size = this.z0.size() - 1; size >= 0; size--) {
            c0 c0Var = this.z0.get(size);
            if (c0Var.e.getParent() == this && !c0Var.J() && (i2 = c0Var.u) != -1) {
                o4.s0(c0Var.e, i2);
                c0Var.u = -1;
            }
        }
        this.z0.clear();
    }

    /* access modifiers changed from: package-private */
    public void K0(boolean z2) {
        int i2 = this.J - 1;
        this.J = i2;
        if (i2 < 1) {
            this.J = 0;
            if (z2) {
                B();
                K();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        int i2;
        int i3;
        if (this.P == null) {
            EdgeEffect a2 = this.L.a(this, 3);
            this.P = a2;
            if (this.k) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    public void M0(int i2) {
    }

    /* access modifiers changed from: package-private */
    public void N() {
        int i2;
        int i3;
        if (this.M == null) {
            EdgeEffect a2 = this.L.a(this, 0);
            this.M = a2;
            if (this.k) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public void N0(int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    public void O() {
        int i2;
        int i3;
        if (this.O == null) {
            EdgeEffect a2 = this.L.a(this, 2);
            this.O = a2;
            if (this.k) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void O0() {
        if (!this.r0 && this.v) {
            o4.b0(this, this.A0);
            this.r0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void P() {
        int i2;
        int i3;
        if (this.N == null) {
            EdgeEffect a2 = this.L.a(this, 1);
            this.N = a2;
            if (this.k) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public String Q() {
        return " " + super.toString() + ", adapter:" + this.p + ", layout:" + this.q + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void R(z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.i0.g;
            zVar.p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        zVar.p = 0;
        zVar.q = 0;
    }

    /* access modifiers changed from: package-private */
    public void R0(boolean z2) {
        this.I = z2 | this.I;
        this.H = true;
        A0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View S(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S(android.view.View):android.view.View");
    }

    public c0 T(View view) {
        View S2 = S(view);
        if (S2 == null) {
            return null;
        }
        return g0(S2);
    }

    /* access modifiers changed from: package-private */
    public void T0(c0 c0Var, l.c cVar) {
        c0Var.F(0, 8192);
        if (this.l0.i && c0Var.y() && !c0Var.v() && !c0Var.J()) {
            this.j.c(d0(c0Var), c0Var);
        }
        this.j.e(c0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void W0() {
        l lVar = this.Q;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.q;
        if (oVar != null) {
            oVar.s1(this.f);
            this.q.t1(this.f);
        }
        this.f.c();
    }

    /* access modifiers changed from: package-private */
    public boolean X0(View view) {
        s1();
        boolean r2 = this.i.r(view);
        if (r2) {
            c0 h02 = h0(view);
            this.f.J(h02);
            this.f.C(h02);
        }
        u1(!r2);
        return r2;
    }

    public c0 Y(int i2) {
        c0 c0Var = null;
        if (this.H) {
            return null;
        }
        int j2 = this.i.j();
        for (int i3 = 0; i3 < j2; i3++) {
            c0 h02 = h0(this.i.i(i3));
            if (h02 != null && !h02.v() && c0(h02) == i2) {
                if (!this.i.n(h02.e)) {
                    return h02;
                }
                c0Var = h02;
            }
        }
        return c0Var;
    }

    public void Y0(n nVar) {
        o oVar = this.q;
        if (oVar != null) {
            oVar.q("Cannot remove item decoration during a scroll  or layout");
        }
        this.s.remove(nVar);
        if (this.s.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        z0();
        requestLayout();
    }

    public c0 Z(long j2) {
        g gVar = this.p;
        c0 c0Var = null;
        if (gVar != null && gVar.k()) {
            int j3 = this.i.j();
            for (int i2 = 0; i2 < j3; i2++) {
                c0 h02 = h0(this.i.i(i2));
                if (h02 != null && !h02.v() && h02.k() == j2) {
                    if (!this.i.n(h02.e)) {
                        return h02;
                    }
                    c0Var = h02;
                }
            }
        }
        return c0Var;
    }

    public void Z0(r rVar) {
        this.t.remove(rVar);
        if (this.u == rVar) {
            this.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (i2 < 0) {
            N();
            if (this.M.isFinished()) {
                this.M.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            O();
            if (this.O.isFinished()) {
                this.O.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            P();
            if (this.N.isFinished()) {
                this.N.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            M();
            if (this.P.isFinished()) {
                this.P.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            o4.Z(this);
        }
    }

    /* access modifiers changed from: package-private */
    public c0 a0(int i2, boolean z2) {
        int j2 = this.i.j();
        c0 c0Var = null;
        for (int i3 = 0; i3 < j2; i3++) {
            c0 h02 = h0(this.i.i(i3));
            if (h02 != null && !h02.v()) {
                if (z2) {
                    if (h02.g != i2) {
                        continue;
                    }
                } else if (h02.m() != i2) {
                    continue;
                }
                if (!this.i.n(h02.e)) {
                    return h02;
                }
                c0Var = h02;
            }
        }
        return c0Var;
    }

    public void a1(s sVar) {
        List<s> list = this.n0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.q;
        if (oVar == null || !oVar.M0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public boolean b0(int i2, int i3) {
        o oVar = this.q;
        int i4 = 0;
        if (oVar == null || this.B) {
            return false;
        }
        boolean u2 = oVar.u();
        boolean v2 = this.q.v();
        if (!u2 || Math.abs(i2) < this.d0) {
            i2 = 0;
        }
        if (!v2 || Math.abs(i3) < this.d0) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = (float) i2;
        float f3 = (float) i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = u2 || v2;
            dispatchNestedFling(f2, f3, z2);
            q qVar = this.c0;
            if (qVar != null && qVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                if (u2) {
                    i4 = 1;
                }
                if (v2) {
                    i4 |= 2;
                }
                t1(i4, 1);
                int i5 = this.e0;
                int max = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.e0;
                this.i0.c(max, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b1() {
        c0 c0Var;
        int g2 = this.i.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.i.f(i2);
            c0 g02 = g0(f2);
            if (!(g02 == null || (c0Var = g02.m) == null)) {
                View view = c0Var.e;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int c0(c0 c0Var) {
        if (c0Var.p(524) || !c0Var.s()) {
            return -1;
        }
        return this.h.e(c0Var.g);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.q.w((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.q;
        if (oVar != null && oVar.u()) {
            return this.q.A(this.l0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.q;
        if (oVar != null && oVar.u()) {
            return this.q.B(this.l0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.q;
        if (oVar != null && oVar.u()) {
            return this.q.C(this.l0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.q;
        if (oVar != null && oVar.v()) {
            return this.q.D(this.l0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.q;
        if (oVar != null && oVar.v()) {
            return this.q.E(this.l0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.q;
        if (oVar != null && oVar.v()) {
            return this.q.F(this.l0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public long d0(c0 c0Var) {
        return this.p.k() ? c0Var.k() : (long) c0Var.g;
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        int i2;
        float f2;
        super.draw(canvas);
        int size = this.s.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.s.get(i3).i(canvas, this, this.l0);
        }
        EdgeEffect edgeEffect = this.M;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), Utils.FLOAT_EPSILON);
            EdgeEffect edgeEffect2 = this.M;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.k) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.N;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.O;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.k) {
                f2 = (float) ((-getWidth()) + getPaddingRight());
                i2 = (-getHeight()) + getPaddingBottom();
            } else {
                f2 = (float) (-getWidth());
                i2 = -getHeight();
            }
            canvas.translate(f2, (float) i2);
            EdgeEffect edgeEffect8 = this.P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.Q == null || this.s.size() <= 0 || !this.Q.p()) {
            z4 = z2;
        }
        if (z4) {
            o4.Z(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public int e0(View view) {
        c0 h02 = h0(view);
        if (h02 != null) {
            return h02.j();
        }
        return -1;
    }

    public int f0(View view) {
        c0 h02 = h0(view);
        if (h02 != null) {
            return h02.m();
        }
        return -1;
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View X0 = this.q.X0(view, i2);
        if (X0 != null) {
            return X0;
        }
        boolean z3 = true;
        boolean z4 = this.p != null && this.q != null && !w0() && !this.B;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                v();
                if (S(view) == null) {
                    return null;
                }
                s1();
                view2 = this.q.Q0(view, i2, this.f, this.l0);
                u1(false);
            }
        } else {
            if (this.q.v()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (H0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.q.u()) {
                int i4 = (this.q.j0() == 1) ^ (i2 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i4) != null) {
                    z3 = false;
                }
                if (H0) {
                    i2 = i4;
                }
                z2 = z3;
            }
            if (z2) {
                v();
                if (S(view) == null) {
                    return null;
                }
                s1();
                this.q.Q0(view, i2, this.f, this.l0);
                u1(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return x0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        c1(view2, (View) null);
        return view;
    }

    public c0 g0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return h0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    public void g1() {
        int j2 = this.i.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 h02 = h0(this.i.i(i2));
            if (!h02.J()) {
                h02.E();
            }
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.q;
        if (oVar != null) {
            return oVar.N();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.q;
        if (oVar != null) {
            return oVar.O(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.q;
        if (oVar != null) {
            return oVar.P(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.p;
    }

    public int getBaseline() {
        o oVar = this.q;
        return oVar != null ? oVar.Q() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.t0;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.k;
    }

    public p getCompatAccessibilityDelegate() {
        return this.s0;
    }

    public k getEdgeEffectFactory() {
        return this.L;
    }

    public l getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.s.size();
    }

    public o getLayoutManager() {
        return this.q;
    }

    public int getMaxFlingVelocity() {
        return this.e0;
    }

    public int getMinFlingVelocity() {
        return this.d0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (G0) {
            return System.nanoTime();
        }
        return 0;
    }

    public q getOnFlingListener() {
        return this.c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.h0;
    }

    public t getRecycledViewPool() {
        return this.f.i();
    }

    public int getScrollState() {
        return this.R;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    /* access modifiers changed from: package-private */
    public boolean h1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        MotionEvent motionEvent2 = motionEvent;
        v();
        if (this.p != null) {
            int[] iArr = this.y0;
            iArr[0] = 0;
            iArr[1] = 0;
            i1(i8, i9, iArr);
            int[] iArr2 = this.y0;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.s.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.y0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i6, i7, i5, i4, this.w0, 0, iArr3);
        int[] iArr4 = this.y0;
        int i12 = i5 - iArr4[0];
        int i13 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.W;
        int[] iArr5 = this.w0;
        this.W = i14 - iArr5[0];
        this.a0 -= iArr5[1];
        int[] iArr6 = this.x0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !d4.a(motionEvent2, 8194)) {
                S0(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            u(i2, i3);
        }
        if (!(i6 == 0 && i7 == 0)) {
            J(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i7 == 0) ? false : true;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i2) {
        o oVar = this.q;
        if (oVar != null) {
            oVar.q("Cannot add item decoration during a scroll  or layout");
        }
        if (this.s.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.s.add(nVar);
        } else {
            this.s.add(i2, nVar);
        }
        z0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void i1(int i2, int i3, int[] iArr) {
        s1();
        I0();
        c3.a("RV Scroll");
        R(this.l0);
        int E1 = i2 != 0 ? this.q.E1(i2, this.f, this.l0) : 0;
        int G1 = i3 != 0 ? this.q.G1(i3, this.f, this.l0) : 0;
        c3.b();
        b1();
        J0();
        u1(false);
        if (iArr != null) {
            iArr[0] = E1;
            iArr[1] = G1;
        }
    }

    public boolean isAttachedToWindow() {
        return this.v;
    }

    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(p pVar) {
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.add(pVar);
    }

    public void j1(int i2) {
        if (!this.B) {
            w1();
            o oVar = this.q;
            if (oVar != null) {
                oVar.F1(i2);
                awakenScrollBars();
            }
        }
    }

    public void k(r rVar) {
        this.t.add(rVar);
    }

    public void l(s sVar) {
        if (this.n0 == null) {
            this.n0 = new ArrayList();
        }
        this.n0.add(sVar);
    }

    /* access modifiers changed from: package-private */
    public Rect l0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.g) {
            return layoutParams.f;
        }
        if (this.l0.e() && (layoutParams.b() || layoutParams.d())) {
            return layoutParams.f;
        }
        Rect rect = layoutParams.f;
        rect.set(0, 0, 0, 0);
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.m.set(0, 0, 0, 0);
            this.s.get(i2).e(this.m, view, this, this.l0);
            int i3 = rect.left;
            Rect rect2 = this.m;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.g = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public boolean l1(c0 c0Var, int i2) {
        if (w0()) {
            c0Var.u = i2;
            this.z0.add(c0Var);
            return false;
        }
        o4.s0(c0Var.e, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void m(c0 c0Var, l.c cVar, l.c cVar2) {
        c0Var.G(false);
        if (this.Q.a(c0Var, cVar, cVar2)) {
            O0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m1(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (!w0()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? z4.a(accessibilityEvent) : 0;
        if (a2 != 0) {
            i2 = a2;
        }
        this.D |= i2;
        return true;
    }

    public boolean n0() {
        return !this.y || this.H || this.h.p();
    }

    public void n1(int i2, int i3) {
        o1(i2, i3, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    public void o(c0 c0Var, l.c cVar, l.c cVar2) {
        g(c0Var);
        c0Var.G(false);
        if (this.Q.c(c0Var, cVar, cVar2)) {
            O0();
        }
    }

    public void o1(int i2, int i3, Interpolator interpolator) {
        p1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = 0;
        boolean z2 = true;
        this.v = true;
        if (!this.y || isLayoutRequested()) {
            z2 = false;
        }
        this.y = z2;
        o oVar = this.q;
        if (oVar != null) {
            oVar.J(this);
        }
        this.r0 = false;
        if (G0) {
            h hVar = h.i.get();
            this.j0 = hVar;
            if (hVar == null) {
                this.j0 = new h();
                Display s2 = o4.s(this);
                float f2 = 60.0f;
                if (!isInEditMode() && s2 != null) {
                    float refreshRate = s2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                h hVar2 = this.j0;
                hVar2.g = (long) (1.0E9f / f2);
                h.i.set(hVar2);
            }
            this.j0.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        h hVar;
        super.onDetachedFromWindow();
        l lVar = this.Q;
        if (lVar != null) {
            lVar.k();
        }
        w1();
        this.v = false;
        o oVar = this.q;
        if (oVar != null) {
            oVar.K(this, this.f);
        }
        this.z0.clear();
        removeCallbacks(this.A0);
        this.j.j();
        if (G0 && (hVar = this.j0) != null) {
            hVar.j(this);
            this.j0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.get(i2).g(canvas, this, this.l0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.q != null && !this.B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.q.v() ? -motionEvent.getAxisValue(9) : Utils.FLOAT_EPSILON;
                if (this.q.u()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == Utils.FLOAT_EPSILON && f2 == Utils.FLOAT_EPSILON)) {
                        h1((int) (f2 * this.f0), (int) (f3 * this.g0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.q.v()) {
                        f3 = -axisValue;
                    } else if (this.q.u()) {
                        f2 = axisValue;
                        f3 = Utils.FLOAT_EPSILON;
                        h1((int) (f2 * this.f0), (int) (f3 * this.g0), motionEvent);
                    }
                }
                f3 = Utils.FLOAT_EPSILON;
            }
            f2 = Utils.FLOAT_EPSILON;
            h1((int) (f2 * this.f0), (int) (f3 * this.g0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.B) {
            return false;
        }
        this.u = null;
        if (U(motionEvent)) {
            r();
            return true;
        }
        o oVar = this.q;
        if (oVar == null) {
            return false;
        }
        boolean u2 = oVar.u();
        boolean v2 = this.q.v();
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.C) {
                this.C = false;
            }
            this.S = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.W = x2;
            this.U = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.a0 = y2;
            this.V = y2;
            if (this.R == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                v1(1);
            }
            int[] iArr = this.x0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = u2 ? 1 : 0;
            if (v2) {
                i2 |= 2;
            }
            t1(i2, 0);
        } else if (actionMasked == 1) {
            this.T.clear();
            v1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.S);
            if (findPointerIndex < 0) {
                "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?";
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.R != 1) {
                int i3 = x3 - this.U;
                int i4 = y3 - this.V;
                if (!u2 || Math.abs(i3) <= this.b0) {
                    z2 = false;
                } else {
                    this.W = x3;
                    z2 = true;
                }
                if (v2 && Math.abs(i4) > this.b0) {
                    this.a0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.S = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.W = x4;
            this.U = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.a0 = y4;
            this.V = y4;
        } else if (actionMasked == 6) {
            L0(motionEvent);
        }
        return this.R == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c3.a("RV OnLayout");
        C();
        c3.b();
        this.y = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        o oVar = this.q;
        if (oVar == null) {
            x(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.y0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.q.g1(this.f, this.l0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.p != null) {
                if (this.l0.e == 1) {
                    D();
                }
                this.q.J1(i2, i3);
                this.l0.j = true;
                E();
                this.q.M1(i2, i3);
                if (this.q.P1()) {
                    this.q.J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.l0.j = true;
                    E();
                    this.q.M1(i2, i3);
                }
            }
        } else if (this.w) {
            this.q.g1(this.f, this.l0, i2, i3);
        } else {
            if (this.E) {
                s1();
                I0();
                Q0();
                J0();
                z zVar = this.l0;
                if (zVar.l) {
                    zVar.h = true;
                } else {
                    this.h.j();
                    this.l0.h = false;
                }
                this.E = false;
                u1(false);
            } else if (this.l0.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.p;
            if (gVar != null) {
                this.l0.f = gVar.g();
            } else {
                this.l0.f = 0;
            }
            s1();
            this.q.g1(this.f, this.l0, i2, i3);
            u1(false);
            this.l0.h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (w0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.g = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.q;
        if (oVar != null && (parcelable2 = this.g.g) != null) {
            oVar.j1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.g;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            o oVar = this.q;
            xVar.g = oVar != null ? oVar.k1() : null;
        }
        return xVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            t0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.B
            r8 = 0
            if (r0 != 0) goto L_0x01de
            boolean r0 = r6.C
            if (r0 == 0) goto L_0x000f
            goto L_0x01de
        L_0x000f:
            boolean r0 = r17.L(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.r()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.q
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.u()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.q
            boolean r11 = r0.v()
            android.view.VelocityTracker r0 = r6.T
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.T = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.x0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.x0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01ad
            if (r0 == r9) goto L_0x016b
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d3
        L_0x0066:
            r17.L0(r18)
            goto L_0x01d3
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.S = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.W = r0
            r6.U = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.a0 = r0
            r6.V = r0
            goto L_0x01d3
        L_0x0087:
            r17.r()
            goto L_0x01d3
        L_0x008c:
            int r0 = r6.S
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.S
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            r0.toString()
            return r8
        L_0x00ac:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.W
            int r0 = r0 - r13
            int r1 = r6.a0
            int r1 = r1 - r14
            int r2 = r6.R
            if (r2 == r9) goto L_0x00f1
            if (r10 == 0) goto L_0x00d7
            int r2 = r6.b0
            if (r0 <= 0) goto L_0x00ce
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d3
        L_0x00ce:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d3:
            if (r0 == 0) goto L_0x00d7
            r2 = 1
            goto L_0x00d8
        L_0x00d7:
            r2 = 0
        L_0x00d8:
            if (r11 == 0) goto L_0x00ec
            int r3 = r6.b0
            if (r1 <= 0) goto L_0x00e4
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00e9
        L_0x00e4:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00e9:
            if (r1 == 0) goto L_0x00ec
            r2 = 1
        L_0x00ec:
            if (r2 == 0) goto L_0x00f1
            r6.setScrollState(r9)
        L_0x00f1:
            r15 = r0
            r16 = r1
            int r0 = r6.R
            if (r0 != r9) goto L_0x01d3
            int[] r0 = r6.y0
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x0102
            r1 = r15
            goto L_0x0103
        L_0x0102:
            r1 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x0108
            r2 = r16
            goto L_0x0109
        L_0x0108:
            r2 = 0
        L_0x0109:
            int[] r3 = r6.y0
            int[] r4 = r6.w0
            r5 = 0
            r0 = r17
            boolean r0 = r0.G(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0138
            int[] r0 = r6.y0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.x0
            r1 = r0[r8]
            int[] r2 = r6.w0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0138:
            r0 = r16
            int[] r1 = r6.w0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.W = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.a0 = r14
            if (r10 == 0) goto L_0x014a
            r1 = r15
            goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            if (r11 == 0) goto L_0x014f
            r2 = r0
            goto L_0x0150
        L_0x014f:
            r2 = 0
        L_0x0150:
            boolean r1 = r6.h1(r1, r2, r7)
            if (r1 == 0) goto L_0x015d
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x015d:
            androidx.recyclerview.widget.h r1 = r6.j0
            if (r1 == 0) goto L_0x01d3
            if (r15 != 0) goto L_0x0165
            if (r0 == 0) goto L_0x01d3
        L_0x0165:
            androidx.recyclerview.widget.h r1 = r6.j0
            r1.f(r6, r15, r0)
            goto L_0x01d3
        L_0x016b:
            android.view.VelocityTracker r0 = r6.T
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.T
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.e0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0187
            android.view.VelocityTracker r1 = r6.T
            int r2 = r6.S
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0188
        L_0x0187:
            r1 = 0
        L_0x0188:
            if (r11 == 0) goto L_0x0194
            android.view.VelocityTracker r2 = r6.T
            int r3 = r6.S
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0195
        L_0x0194:
            r2 = 0
        L_0x0195:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a5
        L_0x019d:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.b0(r0, r1)
            if (r0 != 0) goto L_0x01a8
        L_0x01a5:
            r6.setScrollState(r8)
        L_0x01a8:
            r17.e1()
            r8 = 1
            goto L_0x01d3
        L_0x01ad:
            int r0 = r7.getPointerId(r8)
            r6.S = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.W = r0
            r6.U = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.a0 = r0
            r6.V = r0
            if (r10 == 0) goto L_0x01cb
            r0 = 1
            goto L_0x01cc
        L_0x01cb:
            r0 = 0
        L_0x01cc:
            if (r11 == 0) goto L_0x01d0
            r0 = r0 | 2
        L_0x01d0:
            r6.t1(r0, r8)
        L_0x01d3:
            if (r8 != 0) goto L_0x01da
            android.view.VelocityTracker r0 = r6.T
            r0.addMovement(r12)
        L_0x01da:
            r12.recycle()
            return r9
        L_0x01de:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void p(String str) {
        if (w0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
            }
            throw new IllegalStateException(str);
        } else if (this.K > 0) {
            new IllegalStateException("" + Q());
        }
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        this.h = new a(new f());
    }

    public void p1(int i2, int i3, Interpolator interpolator, int i4) {
        q1(i2, i3, interpolator, i4, false);
    }

    /* access modifiers changed from: package-private */
    public boolean q(c0 c0Var) {
        l lVar = this.Q;
        return lVar == null || lVar.g(c0Var, c0Var.o());
    }

    /* access modifiers changed from: package-private */
    public void q1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.q;
        if (oVar != null && !this.B) {
            int i5 = 0;
            if (!oVar.u()) {
                i2 = 0;
            }
            if (!this.q.v()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        t1(i5, 1);
                    }
                    this.i0.f(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public void r1(int i2) {
        o oVar;
        if (!this.B && (oVar = this.q) != null) {
            oVar.R1(this, this.l0, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        c0 h02 = h0(view);
        if (h02 != null) {
            if (h02.x()) {
                h02.f();
            } else if (!h02.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + h02 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.q.i1(this, this.l0, view, view2) && view2 != null) {
            c1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.q.z1(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.t.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void s0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
        }
        Resources resources = getContext().getResources();
        new g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R$dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R$dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R$dimen.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void s1() {
        int i2 = this.z + 1;
        this.z = i2;
        if (i2 == 1 && !this.B) {
            this.A = false;
        }
    }

    public void scrollBy(int i2, int i3) {
        o oVar = this.q;
        if (oVar != null && !this.B) {
            boolean u2 = oVar.u();
            boolean v2 = this.q.v();
            if (u2 || v2) {
                if (!u2) {
                    i2 = 0;
                }
                if (!v2) {
                    i3 = 0;
                }
                h1(i2, i3, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(p pVar) {
        this.s0 = pVar;
        o4.i0(this, pVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        k1(gVar, false, true);
        R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.t0) {
            this.t0 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.k) {
            t0();
        }
        this.k = z2;
        super.setClipToPadding(z2);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        u3.c(kVar);
        this.L = kVar;
        t0();
    }

    public void setHasFixedSize(boolean z2) {
        this.w = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.Q;
        if (lVar2 != null) {
            lVar2.k();
            this.Q.v((l.b) null);
        }
        this.Q = lVar;
        if (lVar != null) {
            lVar.v(this.q0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.f.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.q) {
            w1();
            if (this.q != null) {
                l lVar = this.Q;
                if (lVar != null) {
                    lVar.k();
                }
                this.q.s1(this.f);
                this.q.t1(this.f);
                this.f.c();
                if (this.v) {
                    this.q.K(this, this.f);
                }
                this.q.N1((RecyclerView) null);
                this.q = null;
            } else {
                this.f.c();
            }
            this.i.o();
            this.q = oVar;
            if (oVar != null) {
                if (oVar.f == null) {
                    oVar.N1(this);
                    if (this.v) {
                        this.q.J(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f.Q());
                }
            }
            this.f.K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(q qVar) {
        this.c0 = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.m0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.h0 = z2;
    }

    public void setRecycledViewPool(t tVar) {
        this.f.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
        this.r = vVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (i2 != this.R) {
            this.R = i2;
            if (i2 != 2) {
                x1();
            }
            I(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value";
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.b0 = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.b0 = i3;
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.f.F(a0Var);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.B) {
            p("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.B = false;
                if (!(!this.A || this.q == null || this.p == null)) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0));
            this.B = true;
            this.C = true;
            w1();
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        int j2 = this.i.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 h02 = h0(this.i.i(i2));
            if (!h02.J()) {
                h02.c();
            }
        }
        this.f.d();
    }

    /* access modifiers changed from: package-private */
    public void t0() {
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    public boolean t1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void u(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.M.onRelease();
            z2 = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.O.onRelease();
            z2 |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.N.onRelease();
            z2 |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.P.onRelease();
            z2 |= this.P.isFinished();
        }
        if (z2) {
            o4.Z(this);
        }
    }

    public void u0() {
        if (this.s.size() != 0) {
            o oVar = this.q;
            if (oVar != null) {
                oVar.q("Cannot invalidate item decorations during a scroll or layout");
            }
            z0();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void u1(boolean z2) {
        if (this.z < 1) {
            this.z = 1;
        }
        if (!z2 && !this.B) {
            this.A = false;
        }
        if (this.z == 1) {
            if (z2 && this.A && !this.B && this.q != null && this.p != null) {
                C();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.z--;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (!this.y || this.H) {
            c3.a("RV FullInvalidate");
            C();
            c3.b();
        } else if (this.h.p()) {
            if (this.h.o(4) && !this.h.o(11)) {
                c3.a("RV PartialInvalidate");
                s1();
                I0();
                this.h.w();
                if (!this.A) {
                    if (o0()) {
                        C();
                    } else {
                        this.h.i();
                    }
                }
                u1(true);
                J0();
            } else if (this.h.p()) {
                c3.a("RV FullInvalidate");
                C();
            } else {
                return;
            }
            c3.b();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean v0() {
        AccessibilityManager accessibilityManager = this.F;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void v1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    public boolean w0() {
        return this.J > 0;
    }

    public void w1() {
        setScrollState(0);
        x1();
    }

    /* access modifiers changed from: package-private */
    public void x(int i2, int i3) {
        setMeasuredDimension(o.x(i2, getPaddingLeft() + getPaddingRight(), o4.A(this)), o.x(i3, getPaddingTop() + getPaddingBottom(), o4.z(this)));
    }

    /* access modifiers changed from: package-private */
    public void y0(int i2) {
        if (this.q != null) {
            setScrollState(2);
            this.q.F1(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void y1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.i.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.i.i(i6);
            c0 h02 = h0(i7);
            if (h02 != null && !h02.J() && (i4 = h02.g) >= i2 && i4 < i5) {
                h02.b(2);
                h02.a(obj);
                ((LayoutParams) i7.getLayoutParams()).g = true;
            }
        }
        this.f.M(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void z(View view) {
        c0 h02 = h0(view);
        G0(view);
        g gVar = this.p;
        if (!(gVar == null || h02 == null)) {
            gVar.B(h02);
        }
        List<p> list = this.G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.G.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        int j2 = this.i.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((LayoutParams) this.i.i(i2).getLayoutParams()).g = true;
        }
        this.f.s();
    }
}
