package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.internal.r;
import defpackage.a5;
import defpackage.d5;
import defpackage.m5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int N = R$style.Widget_Design_BottomSheet_Modal;
    private int A;
    private boolean B;
    int C;
    int D;
    WeakReference<V> E;
    WeakReference<View> F;
    private final ArrayList<f> G = new ArrayList<>();
    private VelocityTracker H;
    int I;
    private int J;
    boolean K;
    private Map<View, Integer> L;
    private final m5.c M = new d();
    private int a = 0;
    /* access modifiers changed from: private */
    public boolean b = true;
    private boolean c = false;
    private float d;
    /* access modifiers changed from: private */
    public int e;
    private boolean f;
    private int g;
    private boolean h;
    /* access modifiers changed from: private */
    public ra1 i;
    private boolean j;
    private wa1 k;
    private boolean l;
    private BottomSheetBehavior<V>.h m = null;
    private ValueAnimator n;
    int o;
    int p;
    int q;
    float r = 0.5f;
    int s;
    float t = -1.0f;
    boolean u;
    /* access modifiers changed from: private */
    public boolean v;
    /* access modifiers changed from: private */
    public boolean w = true;
    int x = 4;
    m5 y;
    private boolean z;

    class a implements Runnable {
        final /* synthetic */ View e;
        final /* synthetic */ int f;

        a(View view, int i) {
            this.e = view;
            this.f = i;
        }

        public void run() {
            BottomSheetBehavior.this.n0(this.e, this.f);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.i != null) {
                BottomSheetBehavior.this.i.Z(floatValue);
            }
        }
    }

    class c implements r.d {
        c() {
        }

        public x4 a(View view, x4 x4Var, r.e eVar) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.g0(bottomSheetBehavior.e + x4Var.b().d);
            return x4Var;
        }
    }

    class d extends m5.c {
        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.D + bottomSheetBehavior.U()) / 2;
        }

        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        public int b(View view, int i, int i2) {
            int U = BottomSheetBehavior.this.U();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return y2.b(i, U, bottomSheetBehavior.u ? bottomSheetBehavior.D : bottomSheetBehavior.s);
        }

        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.u ? bottomSheetBehavior.D : bottomSheetBehavior.s;
        }

        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.w) {
                BottomSheetBehavior.this.l0(1);
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.R(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.a.o) < java.lang.Math.abs(r7.getTop() - r6.a.q)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.a.q) < java.lang.Math.abs(r8 - r6.a.s)) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.a.p) < java.lang.Math.abs(r8 - r6.a.s)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.s)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.a.s)) goto L_0x00b3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 4
                r2 = 6
                r3 = 3
                int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r4 >= 0) goto L_0x0027
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.b
                if (r8 == 0) goto L_0x0017
            L_0x0010:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.p
            L_0x0014:
                r1 = 3
                goto L_0x00ff
            L_0x0017:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.q
                if (r8 <= r0) goto L_0x0024
                r8 = r0
                goto L_0x00b7
            L_0x0024:
                int r8 = r9.o
                goto L_0x0014
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r4.u
                if (r5 == 0) goto L_0x007c
                boolean r4 = r4.p0(r7, r9)
                if (r4 == 0) goto L_0x007c
                float r8 = java.lang.Math.abs(r8)
                float r0 = java.lang.Math.abs(r9)
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0045
                r8 = 1140457472(0x43fa0000, float:500.0)
                int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
                if (r8 > 0) goto L_0x004b
            L_0x0045:
                boolean r8 = r6.n(r7)
                if (r8 == 0) goto L_0x0052
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.D
                r1 = 5
                goto L_0x00ff
            L_0x0052:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.b
                if (r8 == 0) goto L_0x005b
                goto L_0x0010
            L_0x005b:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.o
                int r8 = r8 - r9
                int r8 = java.lang.Math.abs(r8)
                int r9 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.q
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
            L_0x0077:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.o
                goto L_0x0014
            L_0x007c:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00b9
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x008d
                goto L_0x00b9
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.b
                if (r8 == 0) goto L_0x009a
            L_0x0095:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.s
                goto L_0x00ff
            L_0x009a:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.q
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.s
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
            L_0x00b3:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.q
            L_0x00b7:
                r1 = 6
                goto L_0x00ff
            L_0x00b9:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.b
                if (r9 == 0) goto L_0x00dc
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.p
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.s
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x0010
            L_0x00dc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.q
                if (r8 >= r0) goto L_0x00ed
                int r9 = r9.s
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
                goto L_0x0077
            L_0x00ed:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.s
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x00b3
            L_0x00ff:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.q0(r7, r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.x;
            if (i2 == 1 || bottomSheetBehavior.K) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.I == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.F;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.E;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements d5 {
        final /* synthetic */ int a;

        e(int i) {
            this.a = i;
        }

        public boolean a(View view, d5.a aVar) {
            BottomSheetBehavior.this.k0(this.a);
            return true;
        }
    }

    public static abstract class f {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    protected static class g extends j5 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        final int g;
        int h;
        boolean i;
        boolean j;
        boolean k;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            boolean z = false;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1 ? true : z;
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.g = bottomSheetBehavior.x;
            this.h = bottomSheetBehavior.e;
            this.i = bottomSheetBehavior.b;
            this.j = bottomSheetBehavior.u;
            this.k = bottomSheetBehavior.v;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
        }
    }

    private class h implements Runnable {
        private final View e;
        /* access modifiers changed from: private */
        public boolean f;
        int g;

        h(View view, int i) {
            this.e = view;
            this.g = i;
        }

        public void run() {
            m5 m5Var = BottomSheetBehavior.this.y;
            if (m5Var == null || !m5Var.n(true)) {
                BottomSheetBehavior.this.l0(this.g);
            } else {
                o4.b0(this.e, this);
            }
            this.f = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        r9 = r9.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            r0 = 0
            r7.a = r0
            r1 = 1
            r7.b = r1
            r7.c = r0
            r2 = 0
            r7.m = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.r = r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.t = r3
            r7.w = r1
            r4 = 4
            r7.x = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.G = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
            r4.<init>()
            r7.M = r4
            int[] r4 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r4)
            int r5 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_shapeAppearance
            boolean r5 = r4.hasValue(r5)
            r7.h = r5
            int r5 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_backgroundTint
            boolean r5 = r4.hasValue(r5)
            if (r5 == 0) goto L_0x0049
            int r6 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r6 = defpackage.ca1.a(r8, r4, r6)
            r7.P(r8, r9, r5, r6)
            goto L_0x004c
        L_0x0049:
            r7.O(r8, r9, r5)
        L_0x004c:
            r7.Q()
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r9 < r5) goto L_0x005d
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_android_elevation
            float r9 = r4.getDimension(r9, r3)
            r7.t = r9
        L_0x005d:
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r9 = r4.peekValue(r9)
            r3 = -1
            if (r9 == 0) goto L_0x006b
            int r9 = r9.data
            if (r9 != r3) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            int r9 = r4.getDimensionPixelSize(r9, r3)
        L_0x0071:
            r7.g0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_hideable
            boolean r9 = r4.getBoolean(r9, r0)
            r7.f0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored
            boolean r9 = r4.getBoolean(r9, r0)
            r7.d0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r9 = r4.getBoolean(r9, r1)
            r7.c0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r9 = r4.getBoolean(r9, r0)
            r7.j0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_draggable
            boolean r9 = r4.getBoolean(r9, r1)
            r7.a0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags
            int r9 = r4.getInt(r9, r0)
            r7.i0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r9 = r4.getFloat(r9, r2)
            r7.e0(r9)
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset
            android.util.TypedValue r9 = r4.peekValue(r9)
            if (r9 == 0) goto L_0x00c4
            int r1 = r9.type
            r2 = 16
            if (r1 != r2) goto L_0x00c4
            int r9 = r9.data
            goto L_0x00ca
        L_0x00c4:
            int r9 = com.google.android.material.R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r9 = r4.getDimensionPixelOffset(r9, r0)
        L_0x00ca:
            r7.b0(r9)
            r4.recycle()
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledMaximumFlingVelocity()
            float r8 = (float) r8
            r7.d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void J(V v2, a5.a aVar, int i2) {
        o4.f0(v2, aVar, (CharSequence) null, new e(i2));
    }

    private void L() {
        int N2 = N();
        if (this.b) {
            this.s = Math.max(this.D - N2, this.p);
        } else {
            this.s = this.D - N2;
        }
    }

    private void M() {
        this.q = (int) (((float) this.D) * (1.0f - this.r));
    }

    private int N() {
        return this.f ? Math.max(this.g, this.D - ((this.C * 9) / 16)) : this.e;
    }

    private void O(Context context, AttributeSet attributeSet, boolean z2) {
        P(context, attributeSet, z2, (ColorStateList) null);
    }

    private void P(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.h) {
            this.k = wa1.e(context, attributeSet, R$attr.bottomSheetStyle, N).m();
            ra1 ra1 = new ra1(this.k);
            this.i = ra1;
            ra1.N(context);
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
                return;
            }
            this.i.Y(colorStateList);
        }
    }

    private void Q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.n = ofFloat;
        ofFloat.setDuration(500);
        this.n.addUpdateListener(new b());
    }

    public static <V extends View> BottomSheetBehavior<V> T(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.Behavior f2 = ((CoordinatorLayout.e) layoutParams).f();
            if (f2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private float W() {
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker == null) {
            return Utils.FLOAT_EPSILON;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.H.getYVelocity(this.I);
    }

    private void Y() {
        this.I = -1;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
    }

    private void Z(g gVar) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.e = gVar.h;
            }
            int i3 = this.a;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.b = gVar.i;
            }
            int i4 = this.a;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.u = gVar.j;
            }
            int i5 = this.a;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.v = gVar.k;
            }
        }
    }

    private void m0(View view) {
        if (Build.VERSION.SDK_INT >= 29 && !X() && !this.f) {
            r.b(view, new c());
        }
    }

    private void o0(int i2) {
        View view = (View) this.E.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !o4.N(view)) {
                n0(view, i2);
            } else {
                view.post(new a(view, i2));
            }
        }
    }

    private void r0() {
        View view;
        a5.a aVar;
        WeakReference<V> weakReference = this.E;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            o4.d0(view, 524288);
            o4.d0(view, 262144);
            o4.d0(view, 1048576);
            if (this.u && this.x != 5) {
                J(view, a5.a.l, 5);
            }
            int i2 = this.x;
            int i3 = 6;
            if (i2 == 3) {
                if (this.b) {
                    i3 = 4;
                }
                aVar = a5.a.k;
            } else if (i2 == 4) {
                if (this.b) {
                    i3 = 3;
                }
                aVar = a5.a.j;
            } else if (i2 == 6) {
                J(view, a5.a.k, 4);
                J(view, a5.a.j, 3);
                return;
            } else {
                return;
            }
            J(view, aVar, i3);
        }
    }

    private void s0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.l != z2) {
                this.l = z2;
                if (this.i != null && (valueAnimator = this.n) != null) {
                    if (valueAnimator.isRunning()) {
                        this.n.reverse();
                        return;
                    }
                    float f2 = z2 ? Utils.FLOAT_EPSILON : 1.0f;
                    this.n.setFloatValues(new float[]{1.0f - f2, f2});
                    this.n.start();
                }
            }
        }
    }

    private void t0(boolean z2) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.E;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z2) {
                    if (this.L == null) {
                        this.L = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.E.get()) {
                        if (z2) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.L.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.c) {
                                intValue = 4;
                            }
                        } else if (this.c && (map = this.L) != null && map.containsKey(childAt)) {
                            intValue = this.L.get(childAt).intValue();
                        }
                        o4.s0(childAt, intValue);
                    }
                }
                if (!z2) {
                    this.L = null;
                } else if (this.c) {
                    ((View) this.E.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.A = 0;
        this.B = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.p) < java.lang.Math.abs(r3 - r2.s)) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.s)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.s)) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.q) < java.lang.Math.abs(r3 - r2.s)) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.U()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.l0(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.F
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00b1
            boolean r3 = r2.B
            if (r3 != 0) goto L_0x001f
            goto L_0x00b1
        L_0x001f:
            int r3 = r2.A
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L_0x003c
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x002d
        L_0x0029:
            int r3 = r2.p
            goto L_0x00ab
        L_0x002d:
            int r3 = r4.getTop()
            int r5 = r2.q
            if (r3 <= r5) goto L_0x0038
            r3 = r5
            goto L_0x00aa
        L_0x0038:
            int r3 = r2.o
            goto L_0x00ab
        L_0x003c:
            boolean r3 = r2.u
            if (r3 == 0) goto L_0x004e
            float r3 = r2.W()
            boolean r3 = r2.p0(r4, r3)
            if (r3 == 0) goto L_0x004e
            int r3 = r2.D
            r0 = 5
            goto L_0x00ab
        L_0x004e:
            int r3 = r2.A
            if (r3 != 0) goto L_0x008b
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L_0x006c
            int r6 = r2.p
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x008f
            goto L_0x0029
        L_0x006c:
            int r1 = r2.q
            if (r3 >= r1) goto L_0x007b
            int r5 = r2.s
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto L_0x00a8
            goto L_0x0038
        L_0x007b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
            goto L_0x00a8
        L_0x008b:
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x0093
        L_0x008f:
            int r3 = r2.s
            r0 = 4
            goto L_0x00ab
        L_0x0093:
            int r3 = r4.getTop()
            int r0 = r2.q
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
        L_0x00a8:
            int r3 = r2.q
        L_0x00aa:
            r0 = 6
        L_0x00ab:
            r5 = 0
            r2.q0(r4, r0, r3, r5)
            r2.B = r5
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean D(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.x == 1 && actionMasked == 0) {
            return true;
        }
        m5 m5Var = this.y;
        if (m5Var != null) {
            m5Var.F(motionEvent);
        }
        if (actionMasked == 0) {
            Y();
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        if (actionMasked == 2 && !this.z && Math.abs(((float) this.J) - motionEvent.getY()) > ((float) this.y.z())) {
            this.y.c(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.z;
    }

    public void K(f fVar) {
        if (!this.G.contains(fVar)) {
            this.G.add(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(int i2) {
        float f2;
        float f3;
        View view = (View) this.E.get();
        if (view != null && !this.G.isEmpty()) {
            int i3 = this.s;
            if (i2 > i3 || i3 == U()) {
                int i4 = this.s;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.D - i4);
            } else {
                int i5 = this.s;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - U());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.G.size(); i6++) {
                this.G.get(i6).a(view, f4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View S(View view) {
        if (o4.P(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View S = S(viewGroup.getChildAt(i2));
            if (S != null) {
                return S;
            }
        }
        return null;
    }

    public int U() {
        return this.b ? this.p : this.o;
    }

    public int V() {
        return this.x;
    }

    public boolean X() {
        return this.j;
    }

    public void a0(boolean z2) {
        this.w = z2;
    }

    public void b0(int i2) {
        if (i2 >= 0) {
            this.o = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void c0(boolean z2) {
        if (this.b != z2) {
            this.b = z2;
            if (this.E != null) {
                L();
            }
            l0((!this.b || this.x != 6) ? this.x : 3);
            r0();
        }
    }

    public void d0(boolean z2) {
        this.j = z2;
    }

    public void e0(float f2) {
        if (f2 <= Utils.FLOAT_EPSILON || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.r = f2;
        if (this.E != null) {
            M();
        }
    }

    public void f0(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            if (!z2 && this.x == 5) {
                k0(4);
            }
            r0();
        }
    }

    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.E = null;
        this.y = null;
    }

    public void g0(int i2) {
        h0(i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f
            if (r4 != 0) goto L_0x0015
            r3.f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.E
            if (r4 == 0) goto L_0x0042
            r3.L()
            int r4 = r3.x
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.E
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.x
            r3.o0(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h0(int, boolean):void");
    }

    public void i0(int i2) {
        this.a = i2;
    }

    public void j() {
        super.j();
        this.E = null;
        this.y = null;
    }

    public void j0(boolean z2) {
        this.v = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.w
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.Y()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.H
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.H = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.H
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.K = r1
            r9.I = r4
            boolean r11 = r9.z
            if (r11 == 0) goto L_0x007f
            r9.z = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.J = r7
            int r7 = r9.x
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.F
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.J
            boolean r7 = r10.F(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.I = r7
            r9.K = r2
        L_0x006e:
            int r7 = r9.I
            if (r7 != r4) goto L_0x007c
            int r4 = r9.J
            boolean r11 = r10.F(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.z = r11
        L_0x007f:
            boolean r11 = r9.z
            if (r11 != 0) goto L_0x008e
            m5 r11 = r9.y
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.O(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.F
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.z
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.x
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.F(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            m5 r10 = r9.y
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.J
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            m5 r11 = r9.y
            int r11 = r11.z()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = 1
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.z = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public void k0(int i2) {
        if (i2 != this.x) {
            if (this.E != null) {
                o0(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.u && i2 == 5)) {
                this.x = i2;
            }
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        ra1 ra1;
        if (o4.v(coordinatorLayout) && !o4.v(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.E == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            m0(v2);
            this.E = new WeakReference<>(v2);
            if (this.h && (ra1 = this.i) != null) {
                o4.l0(v2, ra1);
            }
            ra1 ra12 = this.i;
            if (ra12 != null) {
                float f2 = this.t;
                if (f2 == -1.0f) {
                    f2 = o4.t(v2);
                }
                ra12.X(f2);
                boolean z2 = this.x == 3;
                this.l = z2;
                this.i.Z(z2 ? Utils.FLOAT_EPSILON : 1.0f);
            }
            r0();
            if (o4.w(v2) == 0) {
                o4.s0(v2, 1);
            }
        }
        if (this.y == null) {
            this.y = m5.p(coordinatorLayout, this.M);
        }
        int top = v2.getTop();
        coordinatorLayout.M(v2, i2);
        this.C = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.D = height;
        this.p = Math.max(0, height - v2.getHeight());
        M();
        L();
        int i4 = this.x;
        if (i4 == 3) {
            i3 = U();
        } else if (i4 == 6) {
            i3 = this.q;
        } else if (!this.u || i4 != 5) {
            int i5 = this.x;
            if (i5 == 4) {
                i3 = this.s;
            } else {
                if (i5 == 1 || i5 == 2) {
                    o4.U(v2, top - v2.getTop());
                }
                this.F = new WeakReference<>(S(v2));
                return true;
            }
        } else {
            i3 = this.D;
        }
        o4.U(v2, i3);
        this.F = new WeakReference<>(S(v2));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void l0(int i2) {
        View view;
        if (this.x != i2) {
            this.x = i2;
            WeakReference<V> weakReference = this.E;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i2 == 3) {
                    t0(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    t0(false);
                }
                s0(i2);
                for (int i3 = 0; i3 < this.G.size(); i3++) {
                    this.G.get(i3).b(view, i2);
                }
                r0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n0(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.s;
        } else if (i2 == 6) {
            int i5 = this.q;
            if (!this.b || i5 > (i4 = this.p)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = U();
        } else if (!this.u || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i2);
        } else {
            i3 = this.D;
        }
        q0(view, i2, i3, false);
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.F;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.x != 3 || super.o(coordinatorLayout, v2, view, f2, f3);
    }

    /* access modifiers changed from: package-private */
    public boolean p0(View view, float f2) {
        if (this.v) {
            return true;
        }
        if (view.getTop() < this.s) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.s)) / ((float) N()) > 0.5f;
    }

    public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.F;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v2.getTop();
                int i6 = top - i3;
                if (i3 <= 0) {
                    if (i3 < 0 && !view.canScrollVertically(-1)) {
                        int i7 = this.s;
                        if (i6 > i7 && !this.u) {
                            iArr[1] = top - i7;
                            o4.U(v2, -iArr[1]);
                            i5 = 4;
                        } else if (this.w) {
                            iArr[1] = i3;
                            o4.U(v2, -i3);
                            l0(1);
                        } else {
                            return;
                        }
                    }
                    R(v2.getTop());
                    this.A = i3;
                    this.B = true;
                } else if (i6 < U()) {
                    iArr[1] = top - U();
                    o4.U(v2, -iArr[1]);
                    i5 = 3;
                } else if (this.w) {
                    iArr[1] = i3;
                    o4.U(v2, -i3);
                    l0(1);
                    R(v2.getTop());
                    this.A = i3;
                    this.B = true;
                } else {
                    return;
                }
                l0(i5);
                R(v2.getTop());
                this.A = i3;
                this.B = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q0(View view, int i2, int i3, boolean z2) {
        if (z2 ? this.y.N(view.getLeft(), i3) : this.y.P(view, view.getLeft(), i3)) {
            l0(2);
            s0(i2);
            if (this.m == null) {
                this.m = new h(view, i2);
            }
            if (!this.m.f) {
                BottomSheetBehavior<V>.h hVar = this.m;
                hVar.g = i2;
                o4.b0(view, hVar);
                boolean unused = this.m.f = true;
                return;
            }
            this.m.g = i2;
            return;
        }
        l0(i2);
    }

    public void t(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public void x(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, v2, gVar.a());
        Z(gVar);
        int i2 = gVar.g;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.x = i2;
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, V v2) {
        return new g(super.y(coordinatorLayout, v2), (BottomSheetBehavior<?>) this);
    }
}
