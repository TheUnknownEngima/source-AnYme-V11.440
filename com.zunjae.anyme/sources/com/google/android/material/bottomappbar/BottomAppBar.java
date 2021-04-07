package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;
import defpackage.wa1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int r0 = R$style.Widget_MaterialComponents_BottomAppBar;
    /* access modifiers changed from: private */
    public final int T;
    /* access modifiers changed from: private */
    public final ra1 U;
    /* access modifiers changed from: private */
    public Animator V;
    /* access modifiers changed from: private */
    public Animator W;
    /* access modifiers changed from: private */
    public int a0;
    private int b0;
    private boolean c0;
    /* access modifiers changed from: private */
    public final boolean d0;
    /* access modifiers changed from: private */
    public final boolean e0;
    /* access modifiers changed from: private */
    public final boolean f0;
    private int g0;
    private ArrayList<i> h0;
    /* access modifiers changed from: private */
    public int i0;
    /* access modifiers changed from: private */
    public boolean j0;
    /* access modifiers changed from: private */
    public boolean k0;
    private Behavior l0;
    /* access modifiers changed from: private */
    public int m0;
    /* access modifiers changed from: private */
    public int n0;
    /* access modifiers changed from: private */
    public int o0;
    AnimatorListenerAdapter p0;
    p91<FloatingActionButton> q0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */
        public final Rect e = new Rect();
        /* access modifiers changed from: private */
        public WeakReference<BottomAppBar> f;
        /* access modifiers changed from: private */
        public int g;
        private final View.OnLayoutChangeListener h = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.e);
                int height = Behavior.this.e.height();
                bottomAppBar.P0(height);
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
                if (Behavior.this.g == 0) {
                    eVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    eVar.leftMargin = bottomAppBar.getLeftInset();
                    eVar.rightMargin = bottomAppBar.getRightInset();
                    if (r.h(floatingActionButton)) {
                        eVar.leftMargin += bottomAppBar.T;
                    } else {
                        eVar.rightMargin += bottomAppBar.T;
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f = new WeakReference<>(bottomAppBar);
            View o0 = bottomAppBar.F0();
            if (o0 != null && !o4.O(o0)) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) o0.getLayoutParams();
                eVar.d = 49;
                this.g = eVar.bottomMargin;
                if (o0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) o0;
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    bottomAppBar.x0(floatingActionButton);
                }
                bottomAppBar.N0();
            }
            coordinatorLayout.M(bottomAppBar, i);
            return super.l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.j0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.J0(bottomAppBar.a0, BottomAppBar.this.k0);
            }
        }
    }

    class b implements p91<FloatingActionButton> {
        b() {
        }

        /* renamed from: c */
        public void a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.U.Z(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : Utils.FLOAT_EPSILON);
        }

        /* renamed from: d */
        public void b(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().j() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().r(translationX);
                BottomAppBar.this.U.invalidateSelf();
            }
            float f = Utils.FLOAT_EPSILON;
            float max = Math.max(Utils.FLOAT_EPSILON, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().d() != max) {
                BottomAppBar.this.getTopEdgeTreatment().n(max);
                BottomAppBar.this.U.invalidateSelf();
            }
            ra1 q0 = BottomAppBar.this.U;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            q0.Z(f);
        }
    }

    class c implements r.d {
        c() {
        }

        public x4 a(View view, x4 x4Var, r.e eVar) {
            boolean z;
            if (BottomAppBar.this.d0) {
                int unused = BottomAppBar.this.m0 = x4Var.c();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.e0) {
                z = BottomAppBar.this.o0 != x4Var.d();
                int unused2 = BottomAppBar.this.o0 = x4Var.d();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f0) {
                if (BottomAppBar.this.n0 == x4Var.e()) {
                    z2 = false;
                }
                int unused3 = BottomAppBar.this.n0 = x4Var.e();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.y0();
                BottomAppBar.this.N0();
                BottomAppBar.this.M0();
            }
            return x4Var;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.C0();
            Animator unused = BottomAppBar.this.V = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.D0();
        }
    }

    class e extends FloatingActionButton.b {
        final /* synthetic */ int a;

        class a extends FloatingActionButton.b {
            a() {
            }

            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.C0();
            }
        }

        e(int i) {
            this.a = i;
        }

        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.H0(this.a));
            floatingActionButton.s(new a());
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.C0();
            boolean unused = BottomAppBar.this.j0 = false;
            Animator unused2 = BottomAppBar.this.W = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.D0();
        }
    }

    class g extends AnimatorListenerAdapter {
        public boolean e;
        final /* synthetic */ ActionMenuView f;
        final /* synthetic */ int g;
        final /* synthetic */ boolean h;

        g(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f = actionMenuView;
            this.g = i2;
            this.h = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.e = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.e) {
                BottomAppBar.this.Q0(this.f, this.g, this.h);
                if (BottomAppBar.this.i0 != 0) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.L0(bottomAppBar.i0);
                    int unused = BottomAppBar.this.i0 = 0;
                }
            }
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.p0.onAnimationStart(animator);
            FloatingActionButton h0 = BottomAppBar.this.E0();
            if (h0 != null) {
                h0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface i {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class j extends j5 {
        public static final Parcelable.Creator<j> CREATOR = new a();
        int g;
        boolean h;

        static class a implements Parcelable.ClassLoaderCreator<j> {
            a() {
            }

            /* renamed from: a */
            public j createFromParcel(Parcel parcel) {
                return new j(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }

            /* renamed from: c */
            public j[] newArray(int i) {
                return new j[i];
            }
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt();
            this.h = parcel.readInt() != 0;
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, r0), attributeSet, i2);
        this.U = new ra1();
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = true;
        this.p0 = new a();
        this.q0 = new b();
        Context context2 = getContext();
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.BottomAppBar, i2, r0, new int[0]);
        ColorStateList a2 = ca1.a(context2, h2, R$styleable.BottomAppBar_backgroundTint);
        int dimensionPixelSize = h2.getDimensionPixelSize(R$styleable.BottomAppBar_elevation, 0);
        this.a0 = h2.getInt(R$styleable.BottomAppBar_fabAlignmentMode, 0);
        this.b0 = h2.getInt(R$styleable.BottomAppBar_fabAnimationMode, 0);
        this.c0 = h2.getBoolean(R$styleable.BottomAppBar_hideOnScroll, false);
        this.d0 = h2.getBoolean(R$styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.e0 = h2.getBoolean(R$styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f0 = h2.getBoolean(R$styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        h2.recycle();
        this.T = getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fabOffsetEndMode);
        a aVar = new a((float) h2.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleMargin, 0), (float) h2.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0), (float) h2.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleVerticalOffset, 0));
        wa1.b a3 = wa1.a();
        a3.B(aVar);
        this.U.setShapeAppearanceModel(a3.m());
        this.U.g0(2);
        this.U.b0(Paint.Style.FILL);
        this.U.N(context2);
        setElevation((float) dimensionPixelSize);
        androidx.core.graphics.drawable.a.o(this.U, a2);
        o4.l0(this, this.U);
        r.a(this, attributeSet, i2, r0, new c());
    }

    private void A0(int i2, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(E0(), "translationX", new float[]{H0(i2)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void B0(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) G0(actionMenuView, i2, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new g(actionMenuView, i2, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public void C0() {
        ArrayList<i> arrayList;
        int i2 = this.g0 - 1;
        this.g0 = i2;
        if (i2 == 0 && (arrayList = this.h0) != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void D0() {
        ArrayList<i> arrayList;
        int i2 = this.g0;
        this.g0 = i2 + 1;
        if (i2 == 0 && (arrayList = this.h0) != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton E0() {
        View F0 = F0();
        if (F0 instanceof FloatingActionButton) {
            return (FloatingActionButton) F0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View F0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.w(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.F0():android.view.View");
    }

    /* access modifiers changed from: private */
    public float H0(int i2) {
        boolean h2 = r.h(this);
        int i3 = 1;
        if (i2 != 1) {
            return Utils.FLOAT_EPSILON;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.T + (h2 ? this.o0 : this.n0));
        if (h2) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    private boolean I0() {
        FloatingActionButton E0 = E0();
        return E0 != null && E0.o();
    }

    /* access modifiers changed from: private */
    public void J0(int i2, boolean z) {
        if (!o4.O(this)) {
            this.j0 = false;
            return;
        }
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!I0()) {
            i2 = 0;
            z = false;
        }
        B0(i2, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.W = animatorSet;
        animatorSet.addListener(new f());
        this.W.start();
    }

    private void K0(int i2) {
        if (this.a0 != i2 && o4.O(this)) {
            Animator animator = this.V;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.b0 == 1) {
                A0(i2, arrayList);
            } else {
                z0(i2, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.V = animatorSet;
            animatorSet.addListener(new d());
            this.V.start();
        }
    }

    /* access modifiers changed from: private */
    public void M0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.W == null) {
            actionMenuView.setAlpha(1.0f);
            if (!I0()) {
                Q0(actionMenuView, 0, false);
            } else {
                Q0(actionMenuView, this.a0, this.k0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void N0() {
        getTopEdgeTreatment().r(getFabTranslationX());
        View F0 = F0();
        this.U.Z((!this.k0 || !I0()) ? Utils.FLOAT_EPSILON : 1.0f);
        if (F0 != null) {
            F0.setTranslationY(getFabTranslationY());
            F0.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    public void Q0(ActionMenuView actionMenuView, int i2, boolean z) {
        actionMenuView.setTranslationX((float) G0(actionMenuView, i2, z));
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.m0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return H0(this.a0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.o0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.n0;
    }

    /* access modifiers changed from: private */
    public a getTopEdgeTreatment() {
        return (a) this.U.D().p();
    }

    /* access modifiers changed from: private */
    public void x0(FloatingActionButton floatingActionButton) {
        floatingActionButton.d(this.p0);
        floatingActionButton.e(new h());
        floatingActionButton.f(this.q0);
    }

    /* access modifiers changed from: private */
    public void y0() {
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.V;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public int G0(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 != 1 || !z) {
            return 0;
        }
        boolean h2 = r.h(this);
        int measuredWidth = h2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = h2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((h2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (h2 ? this.n0 : -this.o0));
    }

    public void L0(int i2) {
        getMenu().clear();
        x(i2);
    }

    public void O0(int i2, int i3) {
        this.i0 = i3;
        this.j0 = true;
        J0(i2, this.k0);
        K0(i2);
        this.a0 = i2;
    }

    /* access modifiers changed from: package-private */
    public boolean P0(int i2) {
        float f2 = (float) i2;
        if (f2 == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().q(f2);
        this.U.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.U.F();
    }

    public Behavior getBehavior() {
        if (this.l0 == null) {
            this.l0 = new Behavior();
        }
        return this.l0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.a0;
    }

    public int getFabAnimationMode() {
        return this.b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.c0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.f(this, this.U);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            y0();
            N0();
        }
        M0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.a());
        this.a0 = jVar.g;
        this.k0 = jVar.h;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.g = this.a0;
        jVar.h = this.k0;
        return jVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.U, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().n(f2);
            this.U.invalidateSelf();
            N0();
        }
    }

    public void setElevation(float f2) {
        this.U.X(f2);
        getBehavior().G(this, this.U.C() - this.U.B());
    }

    public void setFabAlignmentMode(int i2) {
        O0(i2, 0);
    }

    public void setFabAnimationMode(int i2) {
        this.b0 = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().o(f2);
            this.U.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().p(f2);
            this.U.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.c0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* access modifiers changed from: protected */
    public void z0(int i2, List<Animator> list) {
        FloatingActionButton E0 = E0();
        if (E0 != null && !E0.n()) {
            D0();
            E0.l(new e(i2));
        }
    }
}
