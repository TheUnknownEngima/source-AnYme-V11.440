package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.github.mikephil.charting.utils.Utils;
import defpackage.m5;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    private boolean A;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private final int i;
    private boolean j;
    View k;
    float l;
    private float m;
    int n;
    boolean o;
    private int p;
    private float q;
    private float r;
    private d s;
    final m5 t;
    boolean u;
    private boolean v;
    private final Rect w;
    final ArrayList<b> x;
    private Method y;
    private Field z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] e = {16843137};
        public float a = Utils.FLOAT_EPSILON;
        boolean b;
        boolean c;
        Paint d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = obtainStyledAttributes.getFloat(0, Utils.FLOAT_EPSILON);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    class a extends w3 {
        private final Rect d = new Rect();

        a() {
        }

        private void n(a5 a5Var, a5 a5Var2) {
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
            a5Var.r0(a5Var2.u());
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public void g(View view, a5 a5Var) {
            a5 R = a5.R(a5Var);
            super.g(view, R);
            n(a5Var, R);
            R.T();
            a5Var.d0(SlidingPaneLayout.class.getName());
            a5Var.C0(view);
            ViewParent E = o4.E(view);
            if (E instanceof View) {
                a5Var.u0((View) E);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    o4.s0(childAt, 1);
                    a5Var.c(childAt);
                }
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!o(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public boolean o(View view) {
            return SlidingPaneLayout.this.h(view);
        }
    }

    private class b implements Runnable {
        final View e;

        b(View view) {
            this.e = view;
        }

        public void run() {
            if (this.e.getParent() == SlidingPaneLayout.this) {
                this.e.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.g(this.e);
            }
            SlidingPaneLayout.this.x.remove(this);
        }
    }

    private class c extends m5.c {
        c() {
        }

        public int a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.k.getLayoutParams();
            if (SlidingPaneLayout.this.i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.k.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.n);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.n + paddingLeft);
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public int d(View view) {
            return SlidingPaneLayout.this.n;
        }

        public void f(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.t.c(slidingPaneLayout.k, i2);
        }

        public void i(View view, int i) {
            SlidingPaneLayout.this.p();
        }

        public void j(int i) {
            SlidingPaneLayout slidingPaneLayout;
            boolean z;
            if (SlidingPaneLayout.this.t.A() == 0) {
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                if (slidingPaneLayout2.l == Utils.FLOAT_EPSILON) {
                    slidingPaneLayout2.r(slidingPaneLayout2.k);
                    SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
                    slidingPaneLayout3.d(slidingPaneLayout3.k);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = false;
                } else {
                    slidingPaneLayout2.e(slidingPaneLayout2.k);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = true;
                }
                slidingPaneLayout.u = z;
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.l(i);
            SlidingPaneLayout.this.invalidate();
        }

        public void l(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < Utils.FLOAT_EPSILON || (f == Utils.FLOAT_EPSILON && SlidingPaneLayout.this.l > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.n;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.k.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.l > 0.5f)) {
                    i += SlidingPaneLayout.this.n;
                }
            }
            SlidingPaneLayout.this.t.N(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public boolean m(View view, int i) {
            if (SlidingPaneLayout.this.o) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).b;
        }
    }

    public interface d {
        void a(View view, float f);

        void b(View view);

        void c(View view);
    }

    static class e extends j5 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        boolean g;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt() != 0;
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = -858993460;
        this.v = true;
        this.w = new Rect();
        this.x = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.i = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        o4.i0(this, new a());
        o4.s0(this, 1);
        m5 o2 = m5.o(this, 0.5f, new c());
        this.t = o2;
        o2.M(f2 * 400.0f);
    }

    private boolean b(View view, int i2) {
        if (!this.v && !q(Utils.FLOAT_EPSILON, i2)) {
            return false;
        }
        this.u = false;
        return true;
    }

    private void c(View view, float f2, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 > Utils.FLOAT_EPSILON && i2 != 0) {
            int i3 = (((int) (((float) ((-16777216 & i2) >>> 24)) * f2)) << 24) | (i2 & 16777215);
            if (layoutParams.d == null) {
                layoutParams.d = new Paint();
            }
            layoutParams.d.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.d);
            }
            g(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.d;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            b bVar = new b(view);
            this.x.add(bVar);
            o4.b0(this, bVar);
        }
    }

    private boolean n(View view, int i2) {
        if (!this.v && !q(1.0f, i2)) {
            return false;
        }
        this.u = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.i()
            android.view.View r1 = r9.k
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.k
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.m
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.p
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.m = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.m
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f
            r9.c(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.o(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r4 = r4.getBackground();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean s(android.view.View r4) {
        /*
            boolean r0 = r4.isOpaque()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            r3 = 0
            if (r0 < r2) goto L_0x0010
            return r3
        L_0x0010:
            android.graphics.drawable.Drawable r4 = r4.getBackground()
            if (r4 == 0) goto L_0x0020
            int r4 = r4.getOpacity()
            r0 = -1
            if (r4 != r0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            return r1
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.s(android.view.View):boolean");
    }

    public boolean a() {
        return b(this.k, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.t.n(true)) {
            return;
        }
        if (!this.j) {
            this.t.a();
        } else {
            o4.Z(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.c(view);
        }
        sendAccessibilityEvent(32);
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3;
        super.draw(canvas);
        Drawable drawable = i() ? this.h : this.g;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (i()) {
                i3 = childAt.getRight();
                i2 = intrinsicWidth + i3;
            } else {
                int left = childAt.getLeft();
                int i4 = left - intrinsicWidth;
                i2 = left;
                i3 = i4;
            }
            drawable.setBounds(i3, top, i2, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.j && !layoutParams.b && this.k != null) {
            canvas.getClipBounds(this.w);
            if (i()) {
                Rect rect = this.w;
                rect.left = Math.max(rect.left, this.k.getRight());
            } else {
                Rect rect2 = this.w;
                rect2.right = Math.min(rect2.right, this.k.getLeft());
            }
            canvas.clipRect(this.w);
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public void e(View view) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        d dVar = this.s;
        if (dVar != null) {
            dVar.a(view, this.l);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(View view) {
        Field field;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            o4.u0(view, ((LayoutParams) view.getLayoutParams()).d);
            return;
        }
        if (i2 >= 16) {
            if (!this.A) {
                try {
                    this.y = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.z = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.A = true;
            }
            if (this.y == null || (field = this.z) == null) {
                view.invalidate();
                return;
            } else {
                try {
                    field.setBoolean(view, true);
                    this.y.invoke(view, (Object[]) null);
                } catch (Exception unused3) {
                }
            }
        }
        o4.a0(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f;
    }

    public int getParallaxDistance() {
        return this.p;
    }

    public int getSliderFadeColor() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public boolean h(View view) {
        if (view == null) {
            return false;
        }
        return this.j && ((LayoutParams) view.getLayoutParams()).c && this.l > Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return o4.y(this) == 1;
    }

    public boolean j() {
        return !this.j || this.l == 1.0f;
    }

    public boolean k() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void l(int i2) {
        if (this.k == null) {
            this.l = Utils.FLOAT_EPSILON;
            return;
        }
        boolean i3 = i();
        LayoutParams layoutParams = (LayoutParams) this.k.getLayoutParams();
        int width = this.k.getWidth();
        if (i3) {
            i2 = (getWidth() - i2) - width;
        }
        float paddingRight = ((float) (i2 - ((i3 ? getPaddingRight() : getPaddingLeft()) + (i3 ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.n);
        this.l = paddingRight;
        if (this.p != 0) {
            o(paddingRight);
        }
        if (layoutParams.c) {
            c(this.k, this.l, this.e);
        }
        f(this.k);
    }

    public boolean m() {
        return n(this.k, 0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = true;
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).run();
        }
        this.x.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.j && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.u = !this.t.E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.j || (this.o && actionMasked != 0)) {
            this.t.b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.t.b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.o = false;
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                this.q = x2;
                this.r = y2;
                if (this.t.E(this.k, (int) x2, (int) y2) && h(this.k)) {
                    z2 = true;
                    return this.t.O(motionEvent) || z2;
                }
            } else if (actionMasked == 2) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                float abs = Math.abs(x3 - this.q);
                float abs2 = Math.abs(y3 - this.r);
                if (abs > ((float) this.t.z()) && abs2 > abs) {
                    this.t.b();
                    this.o = true;
                    return false;
                }
            }
            z2 = false;
            if (this.t.O(motionEvent)) {
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean i10 = i();
        m5 m5Var = this.t;
        if (i10) {
            m5Var.L(2);
        } else {
            m5Var.L(1);
        }
        int i11 = i4 - i2;
        int paddingRight = i10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = i10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.v) {
            this.l = (!this.j || !this.u) ? Utils.FLOAT_EPSILON : 1.0f;
        }
        int i12 = paddingRight;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.b) {
                    int i14 = i11 - paddingLeft;
                    int min = (Math.min(paddingRight, i14 - this.i) - i12) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.n = min;
                    int i15 = i10 ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.c = ((i12 + i15) + min) + (measuredWidth / 2) > i14;
                    int i16 = (int) (((float) min) * this.l);
                    i12 += i15 + i16;
                    this.l = ((float) i16) / ((float) this.n);
                    i6 = 0;
                } else if (!this.j || (i9 = this.p) == 0) {
                    i12 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.l) * ((float) i9));
                    i12 = paddingRight;
                }
                if (i10) {
                    i7 = (i11 - i12) + i6;
                    i8 = i7 - measuredWidth;
                } else {
                    i8 = i12 - i6;
                    i7 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i7, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.v) {
            if (this.j) {
                if (this.p != 0) {
                    o(this.l);
                }
                if (((LayoutParams) this.k.getLayoutParams()).c) {
                    c(this.k, this.l, this.e);
                }
            } else {
                for (int i17 = 0; i17 < childCount; i17++) {
                    c(getChildAt(i17), Utils.FLOAT_EPSILON, this.e);
                }
            }
            r(this.k);
        }
        this.v = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x0030
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0028
            if (r1 != r6) goto L_0x0023
            goto L_0x0047
        L_0x0023:
            if (r1 != 0) goto L_0x0047
            r2 = 300(0x12c, float:4.2E-43)
            goto L_0x0047
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            if (r3 != 0) goto L_0x0047
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003f
            if (r3 != 0) goto L_0x0047
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x0047
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            r1 = 0
            if (r3 == r6) goto L_0x005b
            if (r3 == r7) goto L_0x004f
            r4 = 0
            r5 = 0
            goto L_0x0067
        L_0x004f:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            goto L_0x0067
        L_0x005b:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = 0
        L_0x0067:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 2
            r10 = 0
            r0.k = r10
            r14 = r8
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x007e:
            r15 = 8
            r16 = 1
            if (r11 >= r9) goto L_0x011e
            android.view.View r6 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r17 = r6.getLayoutParams()
            r7 = r17
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x009a
            r7.c = r1
            goto L_0x0115
        L_0x009a:
            float r10 = r7.a
            r15 = 0
            int r18 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x00a8
            float r13 = r13 + r10
            int r10 = r7.width
            if (r10 != 0) goto L_0x00a8
            goto L_0x0115
        L_0x00a8:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00c1
            int r10 = r8 - r10
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r15 = r10
            r22 = r13
            r1 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00d8
        L_0x00c1:
            r22 = r13
            r1 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r1) goto L_0x00d2
            int r10 = r8 - r10
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r15 = r10
            goto L_0x00d8
        L_0x00d2:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00d8:
            int r10 = r7.height
            r1 = -2
            if (r10 != r1) goto L_0x00e2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            goto L_0x00f3
        L_0x00e2:
            r1 = -1
            if (r10 != r1) goto L_0x00ec
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            goto L_0x00f2
        L_0x00ec:
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
        L_0x00f2:
            r1 = r10
        L_0x00f3:
            r6.measure(r15, r1)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            if (r3 != r13) goto L_0x0106
            if (r10 <= r4) goto L_0x0106
            int r4 = java.lang.Math.min(r10, r5)
        L_0x0106:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x010b
            r1 = 1
            goto L_0x010c
        L_0x010b:
            r1 = 0
        L_0x010c:
            r7.b = r1
            r12 = r12 | r1
            if (r1 == 0) goto L_0x0113
            r0.k = r6
        L_0x0113:
            r13 = r22
        L_0x0115:
            int r11 = r11 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x007e
        L_0x011e:
            if (r12 != 0) goto L_0x0125
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x020a
        L_0x0125:
            int r1 = r0.i
            int r1 = r8 - r1
            r3 = 0
        L_0x012a:
            if (r3 >= r9) goto L_0x020a
            android.view.View r6 = r0.getChildAt(r3)
            int r7 = r6.getVisibility()
            if (r7 != r15) goto L_0x013d
        L_0x0136:
            r19 = r1
        L_0x0138:
            r1 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0202
        L_0x013d:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x014a
            goto L_0x0136
        L_0x014a:
            int r10 = r7.width
            if (r10 != 0) goto L_0x0157
            float r10 = r7.a
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0157
            r10 = 1
            goto L_0x0158
        L_0x0157:
            r10 = 0
        L_0x0158:
            if (r10 == 0) goto L_0x015c
            r11 = 0
            goto L_0x0160
        L_0x015c:
            int r11 = r6.getMeasuredWidth()
        L_0x0160:
            if (r12 == 0) goto L_0x01a2
            android.view.View r15 = r0.k
            if (r6 == r15) goto L_0x01a2
            int r15 = r7.width
            if (r15 >= 0) goto L_0x0136
            if (r11 > r1) goto L_0x0173
            float r11 = r7.a
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x0136
        L_0x0173:
            if (r10 == 0) goto L_0x0190
            int r7 = r7.height
            r10 = -2
            if (r7 != r10) goto L_0x0183
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x019a
        L_0x0183:
            r10 = -1
            if (r7 != r10) goto L_0x018d
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x019a
        L_0x018d:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0196
        L_0x0190:
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = r6.getMeasuredHeight()
        L_0x0196:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
        L_0x019a:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r6.measure(r11, r7)
            goto L_0x0136
        L_0x01a2:
            float r10 = r7.a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0136
            int r10 = r7.width
            if (r10 != 0) goto L_0x01c8
            int r10 = r7.height
            r15 = -2
            if (r10 != r15) goto L_0x01bb
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01d2
        L_0x01bb:
            r15 = -1
            if (r10 != r15) goto L_0x01c5
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            goto L_0x01d2
        L_0x01c5:
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01ce
        L_0x01c8:
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = r6.getMeasuredHeight()
        L_0x01ce:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
        L_0x01d2:
            if (r12 == 0) goto L_0x01ea
            int r15 = r7.leftMargin
            int r7 = r7.rightMargin
            int r15 = r15 + r7
            int r7 = r8 - r15
            r19 = r1
            r15 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r15)
            if (r11 == r7) goto L_0x0138
            r6.measure(r1, r10)
            goto L_0x0138
        L_0x01ea:
            r19 = r1
            r1 = 0
            int r15 = java.lang.Math.max(r1, r14)
            float r7 = r7.a
            float r15 = (float) r15
            float r7 = r7 * r15
            float r7 = r7 / r13
            int r7 = (int) r7
            int r11 = r11 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r7)
            r6.measure(r11, r10)
        L_0x0202:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x012a
        L_0x020a:
            int r1 = r20.getPaddingTop()
            int r4 = r4 + r1
            int r1 = r20.getPaddingBottom()
            int r4 = r4 + r1
            r0.setMeasuredDimension(r2, r4)
            r0.j = r12
            m5 r1 = r0.t
            int r1 = r1.A()
            if (r1 == 0) goto L_0x0228
            if (r12 != 0) goto L_0x0228
            m5 r1 = r0.t
            r1.a()
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        if (eVar.g) {
            m();
        } else {
            a();
        }
        this.u = eVar.g;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.g = k() ? j() : this.u;
        return eVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.v = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j) {
            return super.onTouchEvent(motionEvent);
        }
        this.t.F(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.q = x2;
            this.r = y2;
        } else if (actionMasked == 1 && h(this.k)) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f2 = x3 - this.q;
            float f3 = y3 - this.r;
            int z2 = this.t.z();
            if ((f2 * f2) + (f3 * f3) < ((float) (z2 * z2)) && this.t.E(this.k, (int) x3, (int) y3)) {
                b(this.k, 0);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q(float f2, int i2) {
        int i3;
        if (!this.j) {
            return false;
        }
        boolean i4 = i();
        LayoutParams layoutParams = (LayoutParams) this.k.getLayoutParams();
        if (i4) {
            i3 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f2 * ((float) this.n))) + ((float) this.k.getWidth())));
        } else {
            i3 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f2 * ((float) this.n)));
        }
        m5 m5Var = this.t;
        View view = this.k;
        if (!m5Var.P(view, i3, view.getTop())) {
            return false;
        }
        p();
        o4.Z(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void r(View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        View childAt;
        boolean z2;
        View view2 = view;
        boolean i6 = i();
        int width = i6 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = i6 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !s(view)) {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            i5 = view.getLeft();
            i4 = view.getRight();
            i3 = view.getTop();
            i2 = view.getBottom();
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount && (childAt = getChildAt(i7)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z2 = i6;
                } else {
                    z2 = i6;
                    childAt.setVisibility((Math.max(i6 ? paddingLeft : width, childAt.getLeft()) < i5 || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(i6 ? width : paddingLeft, childAt.getRight()) > i4 || Math.min(height, childAt.getBottom()) > i2) ? 0 : 4);
                }
                i7++;
                view2 = view;
                i6 = z2;
            } else {
                return;
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.j) {
            this.u = view == this.k;
        }
    }

    public void setCoveredFadeColor(int i2) {
        this.f = i2;
    }

    public void setPanelSlideListener(d dVar) {
        this.s = dVar;
    }

    public void setParallaxDistance(int i2) {
        this.p = i2;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.g = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.h = drawable;
    }

    @Deprecated
    public void setShadowResource(int i2) {
        setShadowDrawable(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(androidx.core.content.a.f(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(androidx.core.content.a.f(getContext(), i2));
    }

    public void setSliderFadeColor(int i2) {
        this.e = i2;
    }
}
