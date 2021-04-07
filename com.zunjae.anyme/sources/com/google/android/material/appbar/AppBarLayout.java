package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$integer;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;
import defpackage.a5;
import defpackage.d5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int v = R$style.Widget_Design_AppBarLayout;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private x4 k;
    private List<c> l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private WeakReference<View> r;
    private ValueAnimator s;
    private int[] t;
    private Drawable u;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */
        public int k;
        private int l;
        private ValueAnimator m;
        private int n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private d r;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ CoordinatorLayout e;
            final /* synthetic */ AppBarLayout f;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.e = coordinatorLayout;
                this.f = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.e, this.f, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b implements d5 {
            final /* synthetic */ CoordinatorLayout a;
            final /* synthetic */ AppBarLayout b;
            final /* synthetic */ View c;
            final /* synthetic */ int d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
                this.c = view;
                this.d = i;
            }

            public boolean a(View view, d5.a aVar) {
                BaseBehavior.this.q(this.a, this.b, this.c, 0, this.d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class c implements d5 {
            final /* synthetic */ AppBarLayout a;
            final /* synthetic */ boolean b;

            c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
                this.a = appBarLayout;
                this.b = z;
            }

            public boolean a(View view, d5.a aVar) {
                this.a.setExpanded(this.b);
                return true;
            }
        }

        public static abstract class d<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        protected static class e extends j5 {
            public static final Parcelable.Creator<e> CREATOR = new a();
            int g;
            float h;
            boolean i;

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
                this.h = parcel.readFloat();
                this.i = parcel.readByte() != 0;
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.g);
                parcel.writeFloat(this.h);
                parcel.writeByte(this.i ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, t, a5.a.h, false);
            }
            if (M() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    o4.f0(coordinatorLayout, a5.a.i, (CharSequence) null, new b(coordinatorLayout, t, view, i));
                    return;
                }
                return;
            }
            T(coordinatorLayout, t, a5.a.i, true);
        }

        private void T(CoordinatorLayout coordinatorLayout, T t, a5.a aVar, boolean z) {
            o4.f0(coordinatorLayout, aVar, (CharSequence) null, new c(this, t, z));
        }

        private void U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(M() - i);
            float abs2 = Math.abs(f);
            V(coordinatorLayout, t, i, abs2 > Utils.FLOAT_EPSILON ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        private void V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = M();
            if (M == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(f91.e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration((long) Math.min(i2, 600));
            this.m.setIntValues(new int[]{M, i});
            this.m.start();
        }

        private boolean X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean Y(int i, int i2) {
            return (i & i2) == i2;
        }

        private View Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof e4) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (Y(layoutParams.a(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private int e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b2 = layoutParams.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b2 != null) {
                    int a2 = layoutParams.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= o4.z(childAt);
                        }
                    }
                    if (o4.v(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b2.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        private boolean p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> w = coordinatorLayout.w(t);
            int size = w.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior f = ((CoordinatorLayout.e) w.get(i).getLayoutParams()).f();
                if (f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f).K() != 0;
                }
            }
            return false;
        }

        private void q0(CoordinatorLayout coordinatorLayout, T t) {
            int M = M();
            int b0 = b0(t, M);
            if (b0 >= 0) {
                View childAt = t.getChildAt(b0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a2 = layoutParams.a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (Y(a2, 2)) {
                        i2 += o4.z(childAt);
                    } else if (Y(a2, 5)) {
                        int z = o4.z(childAt) + i2;
                        if (M < z) {
                            i = z;
                        } else {
                            i2 = z;
                        }
                    }
                    if (Y(a2, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    U(coordinatorLayout, t, y2.b(i, -t.getTotalScrollRange(), 0), Utils.FLOAT_EPSILON);
                }
            }
        }

        private void r0(CoordinatorLayout coordinatorLayout, T t) {
            o4.d0(coordinatorLayout, a5.a.h.b());
            o4.d0(coordinatorLayout, a5.a.i.b());
            View Z = Z(coordinatorLayout);
            if (Z != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.e) Z.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                S(coordinatorLayout, t, Z);
            }
        }

        private void s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a0 = a0(t, i);
            if (a0 != null) {
                int a2 = ((LayoutParams) a0.getLayoutParams()).a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int z3 = o4.z(a0);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (a0.getBottom() - z3) - t.getTopInset()) : (-i) >= (a0.getBottom() - z3) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.l()) {
                    z2 = t.w(Z(coordinatorLayout));
                }
                boolean u = t.u(z2);
                if (z || (u && p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int M() {
            return E() + this.k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public boolean H(T t) {
            d dVar = this.r;
            if (dVar != null) {
                return dVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public int K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public int L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f0 */
        public void N(CoordinatorLayout coordinatorLayout, T t) {
            q0(coordinatorLayout, t);
            if (t.l()) {
                t.u(t.w(Z(coordinatorLayout)));
            }
        }

        /* renamed from: g0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean l2 = super.l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                P(coordinatorLayout, t, (-childAt.getBottom()) + (this.o ? o4.z(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        U(coordinatorLayout, t, i3, Utils.FLOAT_EPSILON);
                    } else {
                        P(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        U(coordinatorLayout, t, 0, Utils.FLOAT_EPSILON);
                    } else {
                        P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.q();
            this.n = -1;
            G(y2.b(E(), -t.getTotalScrollRange(), 0));
            s0(coordinatorLayout, t, E(), 0, true);
            t.m(E());
            r0(coordinatorLayout, t);
            return l2;
        }

        /* renamed from: h0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.e) t.getLayoutParams()).height != -2) {
                return super.m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.N(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: i0 */
        public void q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.l()) {
                t.u(t.w(view));
            }
        }

        /* renamed from: j0 */
        public void t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                r0(coordinatorLayout, t);
            }
        }

        /* renamed from: k0 */
        public void x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof e) {
                e eVar = (e) parcelable;
                super.x(coordinatorLayout, t, eVar.a());
                this.n = eVar.g;
                this.p = eVar.h;
                this.o = eVar.i;
                return;
            }
            super.x(coordinatorLayout, t, parcelable);
            this.n = -1;
        }

        /* renamed from: l0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.y(coordinatorLayout, t);
            int E = E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    e eVar = new e(y);
                    eVar.g = i;
                    if (bottom == o4.z(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    eVar.i = z;
                    eVar.h = ((float) bottom) / ((float) childAt.getHeight());
                    return eVar;
                }
            }
            return y;
        }

        /* renamed from: m0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.l() || X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        /* renamed from: n0 */
        public void C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                q0(coordinatorLayout, t);
                if (t.l()) {
                    t.u(t.w(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.k = 0;
            } else {
                int b2 = y2.b(i, i2, i3);
                if (M != b2) {
                    int e0 = t.h() ? e0(t, b2) : b2;
                    boolean G = G(e0);
                    i4 = M - b2;
                    this.k = b2 - e0;
                    if (!G && t.h()) {
                        coordinatorLayout.p(t);
                    }
                    t.m(E());
                    s0(coordinatorLayout, t, b2, b2 < M ? -1 : 1, false);
                }
            }
            r0(coordinatorLayout, t);
            return i4;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        int a = 1;
        Interpolator b;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i = this.a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            O(obtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.e) view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                o4.U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.u(appBarLayout.w(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public float J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return Utils.FLOAT_EPSILON;
        }

        /* access modifiers changed from: package-private */
        public int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                o4.d0(coordinatorLayout, a5.a.h.b());
                o4.d0(coordinatorLayout, a5.a.i.b());
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = H(coordinatorLayout.v(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.r(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    class a implements k4 {
        a() {
        }

        public x4 a(View view, x4 x4Var) {
            AppBarLayout.this.n(x4Var);
            return x4Var;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ ra1 e;

        b(AppBarLayout appBarLayout, ra1 ra1) {
            this.e = ra1;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.X(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public interface d extends c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, v), attributeSet, i2);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.j = 0;
        Context context2 = getContext();
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            b.a(this);
            b.c(this, attributeSet, i2, v);
        }
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.AppBarLayout, i2, v, new int[0]);
        o4.l0(this, h2.getDrawable(R$styleable.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ra1 ra1 = new ra1();
            ra1.Y(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            ra1.N(context2);
            o4.l0(this, ra1);
        }
        if (h2.hasValue(R$styleable.AppBarLayout_expanded)) {
            s(h2.getBoolean(R$styleable.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && h2.hasValue(R$styleable.AppBarLayout_elevation)) {
            b.b(this, (float) h2.getDimensionPixelSize(R$styleable.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (h2.hasValue(R$styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(h2.getBoolean(R$styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (h2.hasValue(R$styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(h2.getBoolean(R$styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.p = h2.getBoolean(R$styleable.AppBarLayout_liftOnScroll, false);
        this.q = h2.getResourceId(R$styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(h2.getDrawable(R$styleable.AppBarLayout_statusBarForeground));
        h2.recycle();
        o4.v0(this, new a());
    }

    private void c() {
        WeakReference<View> weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r = null;
    }

    private View d(View view) {
        int i2;
        if (this.r == null && (i2 = this.q) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.q);
            }
            if (findViewById != null) {
                this.r = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((LayoutParams) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
    }

    private void s(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.j = i3 | i2;
        requestLayout();
    }

    private boolean t(boolean z) {
        if (this.n == z) {
            return false;
        }
        this.n = z;
        refreshDrawableState();
        return true;
    }

    private boolean v() {
        return this.u != null && getTopInset() > 0;
    }

    private boolean x() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !o4.v(childAt);
    }

    private void y(ra1 ra1, boolean z) {
        float dimension = getResources().getDimension(R$dimen.design_appbar_elevation);
        float f2 = z ? Utils.FLOAT_EPSILON : dimension;
        if (!z) {
            dimension = Utils.FLOAT_EPSILON;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, dimension});
        this.s = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(R$integer.app_bar_elevation_anim_duration));
        this.s.setInterpolator(f91.a);
        this.s.addUpdateListener(new b(this, ra1));
        this.s.start();
    }

    private void z() {
        setWillNotDraw(!v());
    }

    public void a(c cVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        if (cVar != null && !this.l.contains(cVar)) {
            this.l.add(cVar);
        }
    }

    public void b(d dVar) {
        a(dVar);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (v()) {
            int save = canvas.save();
            canvas.translate(Utils.FLOAT_EPSILON, (float) (-this.e));
            this.u.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: f */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams) : new LayoutParams((LinearLayout.LayoutParams) layoutParams);
    }

    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i2;
        int z;
        int i3 = this.g;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = layoutParams.a;
            if ((i5 & 5) == 5) {
                int i6 = layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i5 & 8) != 0) {
                    z = o4.z(childAt);
                } else if ((i5 & 2) != 0) {
                    z = measuredHeight - o4.z(childAt);
                } else {
                    i2 = i6 + measuredHeight;
                    if (childCount == 0 && o4.v(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
                i2 = i6 + z;
                i2 = Math.min(i2, measuredHeight - getTopInset());
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i2 = this.h;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i5 = layoutParams.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= o4.z(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.h = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.q;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int z = o4.z(this);
        if (z == 0) {
            int childCount = getChildCount();
            z = childCount >= 1 ? o4.z(getChildAt(childCount - 1)) : 0;
            if (z == 0) {
                return getHeight() / 3;
            }
        }
        return (z * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.j;
    }

    public Drawable getStatusBarForeground() {
        return this.u;
    }

    @Deprecated
    public float getTargetElevation() {
        return Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        x4 x4Var = this.k;
        if (x4Var != null) {
            return x4Var.f();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = layoutParams.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if (i3 == 0 && o4.v(childAt)) {
                i4 -= getTopInset();
            }
            if ((i5 & 2) != 0) {
                i4 -= o4.z(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void m(int i2) {
        this.e = i2;
        if (!willNotDraw()) {
            o4.Z(this);
        }
        List<c> list = this.l;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c cVar = this.l.get(i3);
                if (cVar != null) {
                    cVar.a(this, i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public x4 n(x4 x4Var) {
        x4 x4Var2 = o4.v(this) ? x4Var : null;
        if (!p3.a(this.k, x4Var2)) {
            this.k = x4Var2;
            z();
            requestLayout();
        }
        return x4Var;
    }

    public void o(c cVar) {
        List<c> list = this.l;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.t == null) {
            this.t = new int[4];
        }
        int[] iArr = this.t;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.n ? R$attr.state_liftable : -R$attr.state_liftable;
        iArr[1] = (!this.n || !this.o) ? -R$attr.state_lifted : R$attr.state_lifted;
        iArr[2] = this.n ? R$attr.state_collapsible : -R$attr.state_collapsible;
        iArr[3] = (!this.n || !this.o) ? -R$attr.state_collapsed : R$attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (o4.v(this) && x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                o4.U(getChildAt(childCount), topInset);
            }
        }
        k();
        this.i = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i6).getLayoutParams()).b() != null) {
                this.i = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.m) {
            if (!this.p && !i()) {
                z2 = false;
            }
            t(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && o4.v(this) && x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = y2.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(d dVar) {
        o(dVar);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.j = 0;
    }

    public void r(boolean z, boolean z2) {
        s(z, z2, true);
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        sa1.d(this, f2);
    }

    public void setExpanded(boolean z) {
        r(z, o4.O(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.p = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.q = i2;
        c();
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.u, o4.y(this));
                this.u.setVisible(getVisibility() == 0, false);
                this.u.setCallback(this);
            }
            z();
            o4.Z(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(f.d(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.b(this, f2);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean u(boolean z) {
        if (this.o == z) {
            return false;
        }
        this.o = z;
        refreshDrawableState();
        if (!this.p || !(getBackground() instanceof ra1)) {
            return true;
        }
        y((ra1) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    /* access modifiers changed from: package-private */
    public boolean w(View view) {
        View d2 = d(view);
        if (d2 != null) {
            view = d2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
}
