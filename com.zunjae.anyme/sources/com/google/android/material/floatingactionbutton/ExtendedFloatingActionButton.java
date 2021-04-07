package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$animator;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.m;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int E = R$style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final Property<View, Float> F;
    static final Property<View, Float> G;
    /* access modifiers changed from: private */
    public final f A;
    /* access modifiers changed from: private */
    public final f B;
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> C;
    /* access modifiers changed from: private */
    public boolean D;
    /* access modifiers changed from: private */
    public int w;
    private final a x;
    /* access modifiers changed from: private */
    public final f y;
    /* access modifiers changed from: private */
    public final f z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private Rect a;
        private h b;
        private h c;
        private boolean d;
        private boolean e;

        public ExtendedFloatingActionButtonBehavior() {
            this.d = false;
            this.e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.d = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.e = obtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.d || this.e) && ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.x(this.e ? extendedFloatingActionButton.z : extendedFloatingActionButton.A, this.e ? this.c : this.b);
        }

        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!G(view)) {
                return false;
            } else {
                M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> v = coordinatorLayout.v(extendedFloatingActionButton);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.M(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.x(this.e ? extendedFloatingActionButton.y : extendedFloatingActionButton.B, this.e ? this.c : this.b);
        }

        public void g(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }
    }

    class a implements j {
        a() {
        }

        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getMeasuredWidth();
        }
    }

    class b implements j {
        b() {
        }

        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    class c extends AnimatorListenerAdapter {
        private boolean e;
        final /* synthetic */ f f;
        final /* synthetic */ h g;

        c(ExtendedFloatingActionButton extendedFloatingActionButton, f fVar, h hVar) {
            this.f = fVar;
            this.g = hVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.e = true;
            this.f.b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f.a();
            if (!this.e) {
                this.f.j(this.g);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f.onAnimationStart(animator);
            this.e = false;
        }
    }

    static class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    static class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    class f extends b {
        private final j g;
        private final boolean h;

        f(a aVar, j jVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.g = jVar;
            this.h = z;
        }

        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.g.a().width;
                layoutParams.height = this.g.a().height;
            }
        }

        public int c() {
            return R$animator.mtrl_extended_fab_change_size_motion_spec;
        }

        public void d() {
            boolean unused = ExtendedFloatingActionButton.this.D = this.h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.g.a().width;
                layoutParams.height = this.g.a().height;
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        public boolean f() {
            return this.h == ExtendedFloatingActionButton.this.D || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        public AnimatorSet h() {
            m91 l = l();
            if (l.j("width")) {
                PropertyValuesHolder[] g2 = l.g("width");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.g.getWidth()});
                l.l("width", g2);
            }
            if (l.j("height")) {
                PropertyValuesHolder[] g3 = l.g("height");
                g3[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.g.getHeight()});
                l.l("height", g3);
            }
            return super.k(l);
        }

        public void j(h hVar) {
            if (hVar != null) {
                if (this.h) {
                    hVar.a(ExtendedFloatingActionButton.this);
                } else {
                    hVar.d(ExtendedFloatingActionButton.this);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.D = this.h;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class g extends b {
        private boolean g;

        public g(a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        public void a() {
            super.a();
            int unused = ExtendedFloatingActionButton.this.w = 0;
            if (!this.g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        public void b() {
            super.b();
            this.g = true;
        }

        public int c() {
            return R$animator.mtrl_extended_fab_hide_motion_spec;
        }

        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        public boolean f() {
            return ExtendedFloatingActionButton.this.v();
        }

        public void j(h hVar) {
            if (hVar != null) {
                hVar.b(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.w = 1;
        }
    }

    public static abstract class h {
        public abstract void a(ExtendedFloatingActionButton extendedFloatingActionButton);

        public abstract void b(ExtendedFloatingActionButton extendedFloatingActionButton);

        public abstract void c(ExtendedFloatingActionButton extendedFloatingActionButton);

        public abstract void d(ExtendedFloatingActionButton extendedFloatingActionButton);
    }

    class i extends b {
        public i(a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        public void a() {
            super.a();
            int unused = ExtendedFloatingActionButton.this.w = 0;
        }

        public int c() {
            return R$animator.mtrl_extended_fab_show_motion_spec;
        }

        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        public boolean f() {
            return ExtendedFloatingActionButton.this.w();
        }

        public void j(h hVar) {
            if (hVar != null) {
                hVar.c(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.w = 2;
        }
    }

    interface j {
        ViewGroup.LayoutParams a();

        int getHeight();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        F = new d(cls, "width");
        G = new e(cls, "height");
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, E), attributeSet, i2);
        this.w = 0;
        a aVar = new a();
        this.x = aVar;
        this.A = new i(aVar);
        this.B = new g(this.x);
        this.D = true;
        Context context2 = getContext();
        this.C = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.ExtendedFloatingActionButton, i2, E, new int[0]);
        m91 c2 = m91.c(context2, h2, R$styleable.ExtendedFloatingActionButton_showMotionSpec);
        m91 c3 = m91.c(context2, h2, R$styleable.ExtendedFloatingActionButton_hideMotionSpec);
        m91 c4 = m91.c(context2, h2, R$styleable.ExtendedFloatingActionButton_extendMotionSpec);
        m91 c5 = m91.c(context2, h2, R$styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        a aVar2 = new a();
        this.z = new f(aVar2, new a(), true);
        this.y = new f(aVar2, new b(), false);
        this.A.g(c2);
        this.B.g(c3);
        this.z.g(c4);
        this.y.g(c5);
        h2.recycle();
        setShapeAppearanceModel(wa1.g(context2, attributeSet, i2, E, wa1.m).m());
    }

    /* access modifiers changed from: private */
    public boolean v() {
        return getVisibility() == 0 ? this.w == 1 : this.w != 2;
    }

    /* access modifiers changed from: private */
    public boolean w() {
        return getVisibility() != 0 ? this.w == 2 : this.w != 1;
    }

    /* access modifiers changed from: private */
    public void x(f fVar, h hVar) {
        if (!fVar.f()) {
            if (!y()) {
                fVar.d();
                fVar.j(hVar);
                return;
            }
            measure(0, 0);
            AnimatorSet h2 = fVar.h();
            h2.addListener(new c(this, fVar, hVar));
            for (Animator.AnimatorListener addListener : fVar.i()) {
                h2.addListener(addListener);
            }
            h2.start();
        }
    }

    private boolean y() {
        return o4.O(this) && !isInEditMode();
    }

    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(o4.D(this), o4.C(this)) * 2) + getIconSize();
    }

    public m91 getExtendMotionSpec() {
        return this.z.e();
    }

    public m91 getHideMotionSpec() {
        return this.B.e();
    }

    public m91 getShowMotionSpec() {
        return this.A.e();
    }

    public m91 getShrinkMotionSpec() {
        return this.y.e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.D = false;
            this.y.d();
        }
    }

    public void setExtendMotionSpec(m91 m91) {
        this.z.g(m91);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(m91.d(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (this.D != z2) {
            f fVar = z2 ? this.z : this.y;
            if (!fVar.f()) {
                fVar.d();
            }
        }
    }

    public void setHideMotionSpec(m91 m91) {
        this.B.g(m91);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(m91.d(getContext(), i2));
    }

    public void setShowMotionSpec(m91 m91) {
        this.A.g(m91);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(m91.d(getContext(), i2));
    }

    public void setShrinkMotionSpec(m91 m91) {
        this.y.g(m91);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(m91.d(getContext(), i2));
    }
}
