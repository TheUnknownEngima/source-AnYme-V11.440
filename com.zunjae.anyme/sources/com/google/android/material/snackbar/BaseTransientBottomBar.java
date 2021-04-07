package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler s = new Handler(Looper.getMainLooper(), new i());
    /* access modifiers changed from: private */
    public static final boolean t;
    private static final int[] u = {R$attr.snackbarStyle};
    /* access modifiers changed from: private */
    public static final String v = BaseTransientBottomBar.class.getSimpleName();
    private final ViewGroup a;
    /* access modifiers changed from: private */
    public final Context b;
    protected final v c;
    /* access modifiers changed from: private */
    public final a d;
    private int e;
    private boolean f;
    private View g;
    private final Runnable h = new j();
    private Rect i;
    /* access modifiers changed from: private */
    public int j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */
    public int l;
    /* access modifiers changed from: private */
    public int m;
    private int n;
    private List<r<B>> o;
    private Behavior p;
    private final AccessibilityManager q;
    b.C0104b r = new m();

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final s k = new s(this);

        /* access modifiers changed from: private */
        public void P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.k.c(baseTransientBottomBar);
        }

        public boolean E(View view) {
            return this.k.a(view);
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }
    }

    class b extends AnimatorListenerAdapter {
        final /* synthetic */ int e;

        b(int i) {
            this.e = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.e);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.c.setScaleX(floatValue);
            BaseTransientBottomBar.this.c.setScaleY(floatValue);
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.a(70, 180);
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {
        private int e = this.f;
        final /* synthetic */ int f;

        f(int i) {
            this.f = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.t) {
                o4.U(BaseTransientBottomBar.this.c, intValue - this.e);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY((float) intValue);
            }
            this.e = intValue;
        }
    }

    class g extends AnimatorListenerAdapter {
        final /* synthetic */ int e;

        g(int i) {
            this.e = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.e);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.b(0, 180);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        private int e = 0;

        h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.t) {
                o4.U(BaseTransientBottomBar.this.c, intValue - this.e);
            } else {
                BaseTransientBottomBar.this.c.setTranslationY((float) intValue);
            }
            this.e = intValue;
        }
    }

    static class i implements Handler.Callback {
        i() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).S();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).G(message.arg1);
                return true;
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        public void run() {
            int b;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.c != null && baseTransientBottomBar.b != null && (b = (BaseTransientBottomBar.this.A() - BaseTransientBottomBar.this.E()) + ((int) BaseTransientBottomBar.this.c.getTranslationY())) < BaseTransientBottomBar.this.m) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    String unused = BaseTransientBottomBar.v;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.m - b;
                BaseTransientBottomBar.this.c.requestLayout();
            }
        }
    }

    class k implements k4 {
        k() {
        }

        public x4 a(View view, x4 x4Var) {
            int unused = BaseTransientBottomBar.this.j = x4Var.c();
            int unused2 = BaseTransientBottomBar.this.k = x4Var.d();
            int unused3 = BaseTransientBottomBar.this.l = x4Var.e();
            BaseTransientBottomBar.this.Y();
            return x4Var;
        }
    }

    class l extends w3 {
        l() {
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            a5Var.a(1048576);
            a5Var.i0(true);
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.j(view, i, bundle);
            }
            BaseTransientBottomBar.this.t();
            return true;
        }
    }

    class m implements b.C0104b {
        m() {
        }

        public void a(int i) {
            Handler handler = BaseTransientBottomBar.s;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        public void b() {
            Handler handler = BaseTransientBottomBar.s;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class n implements t {

        class a implements Runnable {
            a() {
            }

            public void run() {
                BaseTransientBottomBar.this.K(3);
            }
        }

        n() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.Y();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.I()) {
                BaseTransientBottomBar.s.post(new a());
            }
        }
    }

    class o implements u {
        o() {
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.c.setOnLayoutChangeListener((u) null);
            BaseTransientBottomBar.this.T();
        }
    }

    class p implements SwipeDismissBehavior.c {
        p() {
        }

        public void a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.u(0);
        }

        public void b(int i) {
            if (i == 0) {
                b.c().l(BaseTransientBottomBar.this.r);
            } else if (i == 1 || i == 2) {
                b.c().k(BaseTransientBottomBar.this.r);
            }
        }
    }

    class q implements Runnable {
        q() {
        }

        public void run() {
            v vVar = BaseTransientBottomBar.this.c;
            if (vVar != null) {
                vVar.setVisibility(0);
                if (BaseTransientBottomBar.this.c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.U();
                } else {
                    BaseTransientBottomBar.this.W();
                }
            }
        }
    }

    public static abstract class r<B> {
        public void a(B b, int i) {
        }

        public void b(B b) {
        }
    }

    public static class s {
        private b.C0104b a;

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof v;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b.c().l(this.a);
                }
            } else if (coordinatorLayout.F(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b.c().k(this.a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.r;
        }
    }

    protected interface t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    protected interface u {
        void a(View view, int i, int i2, int i3, int i4);
    }

    protected static class v extends FrameLayout {
        private static final View.OnTouchListener l = new a();
        private u e;
        private t f;
        private int g;
        private final float h;
        private final float i;
        private ColorStateList j;
        private PorterDuff.Mode k;

        static class a implements View.OnTouchListener {
            a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected v(Context context, AttributeSet attributeSet) {
            super(bb1.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
                o4.p0(this, (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0));
            }
            this.g = obtainStyledAttributes.getInt(R$styleable.SnackbarLayout_animationMode, 0);
            this.h = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(ca1.a(context2, obtainStyledAttributes, R$styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(com.google.android.material.internal.r.i(obtainStyledAttributes.getInt(R$styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.i = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(l);
            setFocusable(true);
            if (getBackground() == null) {
                o4.l0(this, a());
            }
        }

        private Drawable a() {
            float dimension = getResources().getDimension(R$dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(t91.h(this, R$attr.colorSurface, R$attr.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.j == null) {
                return androidx.core.graphics.drawable.a.r(gradientDrawable);
            }
            Drawable r = androidx.core.graphics.drawable.a.r(gradientDrawable);
            androidx.core.graphics.drawable.a.o(r, this.j);
            return r;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.h;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            t tVar = this.f;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            o4.g0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            t tVar = this.f;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            u uVar = this.e;
            if (uVar != null) {
                uVar.a(this, i2, i3, i4, i5);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i2) {
            this.g = i2;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.j == null)) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.j);
                androidx.core.graphics.drawable.a.p(drawable, this.k);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.j = colorStateList;
            if (getBackground() != null) {
                Drawable r = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r, colorStateList);
                androidx.core.graphics.drawable.a.p(r, this.k);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.k = mode;
            if (getBackground() != null) {
                Drawable r = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(t tVar) {
            this.f = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : l);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(u uVar) {
            this.e = uVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        t = i2 >= 16 && i2 <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.a = viewGroup;
            this.d = aVar;
            Context context = viewGroup.getContext();
            this.b = context;
            com.google.android.material.internal.m.a(context);
            v vVar = (v) LayoutInflater.from(this.b).inflate(B(), this.a, false);
            this.c = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).c(vVar.getActionTextColorAlpha());
            }
            this.c.addView(view);
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            o4.k0(this.c, 1);
            o4.s0(this.c, 1);
            o4.q0(this.c, true);
            o4.v0(this.c, new k());
            o4.i0(this.c, new l());
            this.q = (AccessibilityManager) this.b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* access modifiers changed from: private */
    public int A() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int C() {
        int height = this.c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    public int E() {
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        return iArr[1] + this.c.getHeight();
    }

    private boolean J() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void O(CoordinatorLayout.e eVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.p;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = y();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).P(this);
        }
        swipeDismissBehavior.K(new p());
        eVar.o(swipeDismissBehavior);
        if (this.g == null) {
            eVar.g = 80;
        }
    }

    private boolean Q() {
        return this.m > 0 && !this.f && J();
    }

    /* access modifiers changed from: private */
    public void T() {
        if (P()) {
            q();
            return;
        }
        this.c.setVisibility(0);
        L();
    }

    /* access modifiers changed from: private */
    public void U() {
        ValueAnimator v2 = v(Utils.FLOAT_EPSILON, 1.0f);
        ValueAnimator z = z(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{v2, z});
        animatorSet.setDuration(150);
        animatorSet.addListener(new a());
        animatorSet.start();
    }

    private void V(int i2) {
        ValueAnimator v2 = v(1.0f, Utils.FLOAT_EPSILON);
        v2.setDuration(75);
        v2.addListener(new b(i2));
        v2.start();
    }

    /* access modifiers changed from: private */
    public void W() {
        int C = C();
        if (t) {
            o4.U(this.c, C);
        } else {
            this.c.setTranslationY((float) C);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{C, 0});
        valueAnimator.setInterpolator(f91.b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new e());
        valueAnimator.addUpdateListener(new f(C));
        valueAnimator.start();
    }

    private void X(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, C()});
        valueAnimator.setInterpolator(f91.b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new g(i2));
        valueAnimator.addUpdateListener(new h());
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    public void Y() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.i != null) {
            int i2 = this.g != null ? this.n : this.j;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = this.i;
            marginLayoutParams.bottomMargin = rect.bottom + i2;
            marginLayoutParams.leftMargin = rect.left + this.k;
            marginLayoutParams.rightMargin = rect.right + this.l;
            this.c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && Q()) {
                this.c.removeCallbacks(this.h);
                this.c.post(this.h);
            }
        }
    }

    private void r(int i2) {
        if (this.c.getAnimationMode() == 1) {
            V(i2);
        } else {
            X(i2);
        }
    }

    private int s() {
        View view = this.g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.a.getHeight()) - i2;
    }

    private ValueAnimator v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f91.a);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private ValueAnimator z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f91.d);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    /* access modifiers changed from: protected */
    public int B() {
        return F() ? R$layout.mtrl_layout_snackbar : R$layout.design_layout_snackbar;
    }

    public View D() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public boolean F() {
        TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(u);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* access modifiers changed from: package-private */
    public final void G(int i2) {
        if (!P() || this.c.getVisibility() != 0) {
            K(i2);
        } else {
            r(i2);
        }
    }

    public boolean H() {
        return b.c().e(this.r);
    }

    public boolean I() {
        return b.c().f(this.r);
    }

    /* access modifiers changed from: package-private */
    public void K(int i2) {
        b.c().i(this.r);
        List<r<B>> list = this.o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.o.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void L() {
        b.c().j(this.r);
        List<r<B>> list = this.o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.o.get(size).b(this);
            }
        }
    }

    public B M(r<B> rVar) {
        List<r<B>> list;
        if (rVar == null || (list = this.o) == null) {
            return this;
        }
        list.remove(rVar);
        return this;
    }

    public B N(int i2) {
        this.e = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean P() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.q.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void R() {
        b.c().n(x(), this.r);
    }

    /* access modifiers changed from: package-private */
    public final void S() {
        this.c.setOnAttachStateChangeListener(new n());
        if (this.c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                O((CoordinatorLayout.e) layoutParams);
            }
            this.n = s();
            Y();
            this.c.setVisibility(4);
            this.a.addView(this.c);
        }
        if (o4.O(this.c)) {
            T();
        } else {
            this.c.setOnLayoutChangeListener(new o());
        }
    }

    public B p(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(rVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.c.post(new q());
    }

    public void t() {
        u(3);
    }

    /* access modifiers changed from: protected */
    public void u(int i2) {
        b.c().b(this.r, i2);
    }

    public Context w() {
        return this.b;
    }

    public int x() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public SwipeDismissBehavior<? extends View> y() {
        return new Behavior();
    }
}
