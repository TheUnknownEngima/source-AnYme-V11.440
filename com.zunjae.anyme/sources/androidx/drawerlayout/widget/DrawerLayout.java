package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.github.mikephil.charting.utils.Utils;
import defpackage.a5;
import defpackage.m5;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    private static final int[] O = {16843828};
    static final int[] P = {16842931};
    static final boolean Q = (Build.VERSION.SDK_INT >= 19);
    private static final boolean R;
    private Drawable A;
    private Drawable B;
    private Drawable C;
    private CharSequence D;
    private CharSequence E;
    private Object F;
    private boolean G;
    private Drawable H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private final ArrayList<View> L;
    private Rect M;
    private Matrix N;
    private final c e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final m5 k;
    private final m5 l;
    private final g m;
    private final g n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private d w;
    private List<d> x;
    private float y;
    private float z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a = 0;
        float b;
        boolean c;
        int d;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.P);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = layoutParams.a;
        }
    }

    class a implements View.OnApplyWindowInsetsListener {
        a(DrawerLayout drawerLayout) {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class b extends w3 {
        private final Rect d = new Rect();

        b() {
        }

        private void n(a5 a5Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.A(childAt)) {
                    a5Var.c(childAt);
                }
            }
        }

        private void o(a5 a5Var, a5 a5Var2) {
            Rect rect = this.d;
            a5Var2.m(rect);
            a5Var.Y(rect);
            a5Var2.n(rect);
            a5Var.Z(rect);
            a5Var.G0(a5Var2.O());
            a5Var.s0(a5Var2.w());
            a5Var.d0(a5Var2.p());
            a5Var.h0(a5Var2.s());
            a5Var.j0(a5Var2.G());
            a5Var.e0(a5Var2.F());
            a5Var.l0(a5Var2.H());
            a5Var.m0(a5Var2.I());
            a5Var.W(a5Var2.C());
            a5Var.A0(a5Var2.M());
            a5Var.p0(a5Var2.J());
            a5Var.a(a5Var2.k());
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View p = DrawerLayout.this.p();
            if (p == null || (s = DrawerLayout.this.s(DrawerLayout.this.t(p))) == null) {
                return true;
            }
            text.add(s);
            return true;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public void g(View view, a5 a5Var) {
            if (DrawerLayout.Q) {
                super.g(view, a5Var);
            } else {
                a5 R = a5.R(a5Var);
                super.g(view, R);
                a5Var.C0(view);
                ViewParent E = o4.E(view);
                if (E instanceof View) {
                    a5Var.u0((View) E);
                }
                o(a5Var, R);
                R.T();
                n(a5Var, (ViewGroup) view);
            }
            a5Var.d0(DrawerLayout.class.getName());
            a5Var.l0(false);
            a5Var.m0(false);
            a5Var.U(a5.a.e);
            a5Var.U(a5.a.f);
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.Q || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class c extends w3 {
        c() {
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            if (!DrawerLayout.A(view)) {
                a5Var.u0((View) null);
            }
        }
    }

    public interface d {
        void a(View view);

        void b(View view);

        void c(View view, float f);

        void d(int i);
    }

    protected static class e extends j5 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        int g = 0;
        int h;
        int i;
        int j;
        int k;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            /* renamed from: c */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }
    }

    public static abstract class f implements d {
        public void a(View view) {
        }

        public void b(View view) {
        }

        public void c(View view, float f) {
        }
    }

    private class g extends m5.c {
        private final int a;
        private m5 b;
        private final Runnable c = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                g.this.o();
            }
        }

        g(int i) {
            this.a = i;
        }

        private void n() {
            int i = 3;
            if (this.a == 3) {
                i = 5;
            }
            View n = DrawerLayout.this.n(i);
            if (n != null) {
                DrawerLayout.this.f(n);
            }
        }

        public int a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View n = drawerLayout.n(i3);
            if (n != null && DrawerLayout.this.r(n) == 0) {
                this.b.c(n, i2);
            }
        }

        public boolean g(int i) {
            return false;
        }

        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160);
        }

        public void i(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            n();
        }

        public void j(int i) {
            DrawerLayout.this.Y(this.a, i, this.b.w());
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.W(view, width2);
            view.setVisibility(width2 == Utils.FLOAT_EPSILON ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void l(View view, float f, float f2) {
            int i;
            float u = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                int i2 = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < Utils.FLOAT_EPSILON || (f == Utils.FLOAT_EPSILON && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.N(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public boolean m(View view, int i) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.a) && DrawerLayout.this.r(view) == 0;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            View view;
            int i;
            int x = this.b.x();
            int i2 = 0;
            boolean z = this.a == 3;
            if (z) {
                view = DrawerLayout.this.n(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + x;
            } else {
                view = DrawerLayout.this.n(5);
                i = DrawerLayout.this.getWidth() - x;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.r(view) == 0) {
                this.b.P(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(m5 m5Var) {
            this.b = m5Var;
        }
    }

    static {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 21) {
            z2 = false;
        }
        R = z2;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new c();
        this.h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.g = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.m = new g(3);
        this.n = new g(5);
        m5 o2 = m5.o(this, 1.0f, this.m);
        this.k = o2;
        o2.L(1);
        this.k.M(f3);
        this.m.q(this.k);
        m5 o3 = m5.o(this, 1.0f, this.n);
        this.l = o3;
        o3.L(2);
        this.l.M(f3);
        this.n.q(this.l);
        setFocusableInTouchMode(true);
        o4.s0(this, 1);
        o4.i0(this, new b());
        setMotionEventSplittingEnabled(false);
        if (o4.v(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(O);
                try {
                    this.A = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.A = null;
            }
        }
        this.f = f2 * 10.0f;
        this.L = new ArrayList<>();
    }

    static boolean A(View view) {
        return (o4.w(view) == 4 || o4.w(view) == 2) ? false : true;
    }

    private boolean H(float f2, float f3, View view) {
        if (this.M == null) {
            this.M = new Rect();
        }
        view.getHitRect(this.M);
        return this.M.contains((int) f2, (int) f3);
    }

    private boolean I(Drawable drawable, int i2) {
        if (drawable == null || !androidx.core.graphics.drawable.a.h(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.m(drawable, i2);
        return true;
    }

    private Drawable P() {
        int y2 = o4.y(this);
        if (y2 == 0) {
            Drawable drawable = this.H;
            if (drawable != null) {
                I(drawable, y2);
                return this.H;
            }
        } else {
            Drawable drawable2 = this.I;
            if (drawable2 != null) {
                I(drawable2, y2);
                return this.I;
            }
        }
        return this.J;
    }

    private Drawable Q() {
        int y2 = o4.y(this);
        if (y2 == 0) {
            Drawable drawable = this.I;
            if (drawable != null) {
                I(drawable, y2);
                return this.I;
            }
        } else {
            Drawable drawable2 = this.H;
            if (drawable2 != null) {
                I(drawable2, y2);
                return this.H;
            }
        }
        return this.K;
    }

    private void R() {
        if (!R) {
            this.B = P();
            this.C = Q();
        }
    }

    private void X(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            o4.s0(childAt, ((z2 || E(childAt)) && (!z2 || childAt != view)) ? 4 : 1);
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v2 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v2);
            v2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.N == null) {
                this.N = new Matrix();
            }
            matrix.invert(this.N);
            obtain.transform(this.N);
        }
        return obtain;
    }

    static String w(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((LayoutParams) getChildAt(i2).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    /* access modifiers changed from: package-private */
    public boolean B(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    public boolean C(int i2) {
        View n2 = n(i2);
        if (n2 != null) {
            return D(n2);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean E(View view) {
        int b2 = y3.b(((LayoutParams) view.getLayoutParams()).a, o4.y(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean F(int i2) {
        View n2 = n(i2);
        if (n2 != null) {
            return G(n2);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > Utils.FLOAT_EPSILON;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public void J(View view, float f2) {
        float u2 = u(view);
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (u2 * width));
        if (!c(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        W(view, f2);
    }

    public void K(int i2) {
        L(i2, true);
    }

    public void L(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            N(n2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z2) {
        if (E(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.q) {
                layoutParams.b = 1.0f;
                layoutParams.d = 1;
                X(view, true);
            } else if (z2) {
                layoutParams.d |= 2;
                if (c(view, 3)) {
                    this.k.P(view, 0, view.getTop());
                } else {
                    this.l.P(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                Y(layoutParams.a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(d dVar) {
        List<d> list;
        if (dVar != null && (list = this.x) != null) {
            list.remove(dVar);
        }
    }

    public void S(Object obj, boolean z2) {
        this.F = obj;
        this.G = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void T(int i2, int i3) {
        View n2;
        int b2 = y3.b(i3, o4.y(this));
        if (i3 == 3) {
            this.r = i2;
        } else if (i3 == 5) {
            this.s = i2;
        } else if (i3 == 8388611) {
            this.t = i2;
        } else if (i3 == 8388613) {
            this.u = i2;
        }
        if (i2 != 0) {
            (b2 == 3 ? this.k : this.l).b();
        }
        if (i2 == 1) {
            View n3 = n(b2);
            if (n3 != null) {
                f(n3);
            }
        } else if (i2 == 2 && (n2 = n(b2)) != null) {
            M(n2);
        }
    }

    public void U(int i2, int i3) {
        V(androidx.core.content.a.f(getContext(), i2), i3);
    }

    public void V(Drawable drawable, int i2) {
        if (!R) {
            if ((i2 & 8388611) == 8388611) {
                this.H = drawable;
            } else if ((i2 & 8388613) == 8388613) {
                this.I = drawable;
            } else if ((i2 & 3) == 3) {
                this.J = drawable;
            } else if ((i2 & 5) == 5) {
                this.K = drawable;
            } else {
                return;
            }
            R();
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void W(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 != layoutParams.b) {
            layoutParams.b = f2;
            l(view, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y(int i2, int i3, View view) {
        int A2 = this.k.A();
        int A3 = this.l.A();
        int i4 = 2;
        if (A2 == 1 || A3 == 1) {
            i4 = 1;
        } else if (!(A2 == 2 || A3 == 2)) {
            i4 = 0;
        }
        if (view != null && i3 == 0) {
            float f2 = ((LayoutParams) view.getLayoutParams()).b;
            if (f2 == Utils.FLOAT_EPSILON) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i4 != this.o) {
            this.o = i4;
            List<d> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).d(i4);
                }
            }
        }
    }

    public void a(d dVar) {
        if (dVar != null) {
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(dVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!E(childAt)) {
                    this.L.add(childAt);
                } else if (D(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.L.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.L.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.L.clear();
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        o4.s0(view, (o() != null || E(view)) ? 4 : 1);
        if (!Q) {
            o4.i0(view, this.e);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.v) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.v = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view, int i2) {
        return (t(view) & i2) == i2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = Utils.FLOAT_EPSILON;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i2).getLayoutParams()).b);
        }
        this.i = f2;
        boolean n2 = this.k.n(true);
        boolean n3 = this.l.n(true);
        if (n2 || n3) {
            o4.Z(this);
        }
    }

    public void d(int i2) {
        e(i2, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.i <= Utils.FLOAT_EPSILON) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (H(x2, y2, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B2 = B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (B2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.i;
        if (f2 <= Utils.FLOAT_EPSILON || !B2) {
            if (this.B != null && c(view2, 3)) {
                int intrinsicWidth = this.B.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(Utils.FLOAT_EPSILON, Math.min(((float) right2) / ((float) this.k.x()), 1.0f));
                this.B.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.B.setAlpha((int) (max * 255.0f));
                drawable = this.B;
            } else if (this.C != null && c(view2, 5)) {
                int intrinsicWidth2 = this.C.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(Utils.FLOAT_EPSILON, Math.min(((float) (getWidth() - left2)) / ((float) this.l.x()), 1.0f));
                this.C.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.C.setAlpha((int) (max2 * 255.0f));
                drawable = this.C;
            }
            drawable.draw(canvas);
        } else {
            int i5 = this.h;
            this.j.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i2, Utils.FLOAT_EPSILON, (float) width, (float) getHeight(), this.j);
        }
        return drawChild;
    }

    public void e(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            g(n2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z2) {
        m5 m5Var;
        int i2;
        if (E(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.q) {
                layoutParams.b = Utils.FLOAT_EPSILON;
                layoutParams.d = 0;
            } else if (z2) {
                layoutParams.d |= 4;
                if (c(view, 3)) {
                    m5Var = this.k;
                    i2 = -view.getWidth();
                } else {
                    m5Var = this.l;
                    i2 = getWidth();
                }
                m5Var.P(view, i2, view.getTop());
            } else {
                J(view, Utils.FLOAT_EPSILON);
                Y(layoutParams.a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        return R ? this.f : Utils.FLOAT_EPSILON;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.A;
    }

    public void h() {
        i(false);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z2) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (E(childAt) && (!z2 || layoutParams.c)) {
                z3 |= c(childAt, 3) ? this.k.P(childAt, -childAt.getWidth(), childAt.getTop()) : this.l.P(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        this.m.p();
        this.n.p();
        if (z3) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) == 1) {
            layoutParams.d = 0;
            List<d> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).b(view);
                }
            }
            X(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.d & 1) == 0) {
            layoutParams.d = 1;
            List<d> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).a(view);
                }
            }
            X(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(View view, float f2) {
        List<d> list = this.x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.x.get(size).c(view, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View n(int i2) {
        int b2 = y3.b(i2, o4.y(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((t(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.G
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.A
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.F
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.A
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.A
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.k.u((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            m5 r1 = r6.k
            boolean r1 = r1.O(r7)
            m5 r2 = r6.l
            boolean r2 = r2.O(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            m5 r7 = r6.k
            boolean r7 = r7.e(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.m
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.n
            r7.p()
            goto L_0x0036
        L_0x0031:
            r6.i(r2)
            r6.v = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.y = r0
            r6.z = r7
            float r4 = r6.i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            m5 r4 = r6.k
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.u(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.v = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.y()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.v
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !z()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View p2 = p();
        if (p2 != null && r(p2) == 0) {
            h();
        }
        return p2 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        this.p = true;
        int i9 = i4 - i2;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i11 = layoutParams.leftMargin;
                    childAt.layout(i11, layoutParams.topMargin, childAt.getMeasuredWidth() + i11, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i12 = i9 - ((int) (layoutParams.b * f4));
                        f2 = ((float) (i9 - i12)) / f4;
                        i6 = i12;
                    }
                    boolean z3 = f2 != layoutParams.b;
                    int i13 = layoutParams.a & 112;
                    if (i13 != 16) {
                        if (i13 != 80) {
                            measuredHeight = layoutParams.topMargin;
                            i7 = measuredWidth + i6;
                            i8 = measuredHeight2 + measuredHeight;
                        } else {
                            int i14 = i5 - i3;
                            measuredHeight = (i14 - layoutParams.bottomMargin) - childAt.getMeasuredHeight();
                            i7 = measuredWidth + i6;
                            i8 = i14 - layoutParams.bottomMargin;
                        }
                        childAt.layout(i6, measuredHeight, i7, i8);
                    } else {
                        int i15 = i5 - i3;
                        int i16 = (i15 - measuredHeight2) / 2;
                        int i17 = layoutParams.topMargin;
                        if (i16 < i17) {
                            i16 = i17;
                        } else {
                            int i18 = i16 + measuredHeight2;
                            int i19 = layoutParams.bottomMargin;
                            if (i18 > i15 - i19) {
                                i16 = (i15 - i19) - measuredHeight2;
                            }
                        }
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight2 + i16);
                    }
                    if (z3) {
                        W(childAt, f2);
                    }
                    int i20 = layoutParams.b > Utils.FLOAT_EPSILON ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.F != null && o4.v(this);
        int y2 = o4.y(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int b2 = y3.b(layoutParams.a, y2);
                    boolean v2 = o4.v(childAt);
                    int i6 = Build.VERSION.SDK_INT;
                    if (v2) {
                        if (i6 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.F;
                            if (b2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (b2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i6 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.F;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (R) {
                        float t2 = o4.t(childAt);
                        float f2 = this.f;
                        if (t2 != f2) {
                            o4.p0(childAt, f2);
                        }
                    }
                    int t3 = t(childAt) & 7;
                    boolean z5 = t3 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.g + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i3, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i5++;
                        i4 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t3) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i7 = i2;
            int i8 = i3;
            i5++;
            i4 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        int i2 = eVar.g;
        if (!(i2 == 0 || (n2 = n(i2)) == null)) {
            M(n2);
        }
        int i3 = eVar.h;
        if (i3 != 3) {
            T(i3, 3);
        }
        int i4 = eVar.i;
        if (i4 != 3) {
            T(i4, 5);
        }
        int i5 = eVar.j;
        if (i5 != 3) {
            T(i5, 8388611);
        }
        int i6 = eVar.k;
        if (i6 != 3) {
            T(i6, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        R();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            boolean z3 = layoutParams.d == 1;
            if (layoutParams.d != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                eVar.g = layoutParams.a;
            } else {
                i2++;
            }
        }
        eVar.h = this.r;
        eVar.i = this.s;
        eVar.j = this.t;
        eVar.k = this.u;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            m5 r0 = r6.k
            r0.F(r7)
            m5 r0 = r6.l
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x001e
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.i(r2)
            goto L_0x006c
        L_0x001e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            m5 r3 = r6.k
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.u(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.y
            float r0 = r0 - r3
            float r3 = r6.z
            float r7 = r7 - r3
            m5 r3 = r6.k
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.i(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.y = r0
            r6.z = r7
        L_0x006c:
            r6.v = r1
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public View p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i2) {
        int y2 = o4.y(this);
        if (i2 == 3) {
            int i3 = this.r;
            if (i3 != 3) {
                return i3;
            }
            int i4 = y2 == 0 ? this.t : this.u;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.s;
            if (i5 != 3) {
                return i5;
            }
            int i6 = y2 == 0 ? this.u : this.t;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.t;
            if (i7 != 3) {
                return i7;
            }
            int i8 = y2 == 0 ? this.r : this.s;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.u;
            if (i9 != 3) {
                return i9;
            }
            int i10 = y2 == 0 ? this.s : this.r;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (E(view)) {
            return q(((LayoutParams) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            i(true);
        }
    }

    public void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i2) {
        int b2 = y3.b(i2, o4.y(this));
        if (b2 == 3) {
            return this.D;
        }
        if (b2 == 5) {
            return this.E;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.f = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt)) {
                o4.p0(childAt, this.f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.w;
        if (dVar2 != null) {
            O(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.w = dVar;
    }

    public void setDrawerLockMode(int i2) {
        T(i2, 3);
        T(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.h = i2;
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.A = i2 != 0 ? androidx.core.content.a.f(getContext(), i2) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.A = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.A = new ColorDrawable(i2);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public int t(View view) {
        return y3.b(((LayoutParams) view.getLayoutParams()).a, o4.y(this));
    }

    /* access modifiers changed from: package-private */
    public float u(View view) {
        return ((LayoutParams) view.getLayoutParams()).b;
    }
}
