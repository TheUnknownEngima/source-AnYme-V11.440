package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.view.menu.m;
import com.github.mikephil.charting.utils.Utils;

public class ActionBarOverlayLayout extends ViewGroup implements o, i4, g4, h4 {
    static final int[] F = {R$attr.actionBarSize, 16842841};
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B = new a();
    private final Runnable C = new b();
    private final Runnable D = new c();
    private final j4 E;
    private int e;
    private int f = 0;
    private ContentFrameLayout g;
    ActionBarContainer h;
    private p i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    boolean o;
    private int p;
    private int q;
    private final Rect r = new Rect();
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private final Rect x = new Rect();
    private d y;
    private OverScroller z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.o = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.h.animate().translationY(Utils.FLOAT_EPSILON).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.h.animate().translationY((float) (-ActionBarOverlayLayout.this.h.getHeight())).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void f(int i);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v(context);
        this.E = new j4(this);
    }

    private void A() {
        u();
        this.C.run();
    }

    private boolean B(float f2, float f3) {
        this.z.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.z.getFinalY() > this.h.getHeight();
    }

    private void p() {
        u();
        this.D.run();
    }

    private boolean q(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z2 || layoutParams.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            layoutParams.leftMargin = i5;
            z6 = true;
        }
        if (z3 && layoutParams.topMargin != (i4 = rect.top)) {
            layoutParams.topMargin = i4;
            z6 = true;
        }
        if (z5 && layoutParams.rightMargin != (i3 = rect.right)) {
            layoutParams.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || layoutParams.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        layoutParams.bottomMargin = i2;
        return true;
    }

    private p t(View view) {
        if (view instanceof p) {
            return (p) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        boolean z2 = false;
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.k = z2;
        this.z = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.D, 600);
    }

    private void y() {
        u();
        postDelayed(this.C, 600);
    }

    public void a(Menu menu, m.a aVar) {
        z();
        this.i.a(menu, aVar);
    }

    public boolean b() {
        z();
        return this.i.b();
    }

    public void c() {
        z();
        this.i.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean d() {
        z();
        return this.i.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.j != null && !this.k) {
            int bottom = this.h.getVisibility() == 0 ? (int) (((float) this.h.getBottom()) + this.h.getTranslationY() + 0.5f) : 0;
            this.j.setBounds(0, bottom, getWidth(), this.j.getIntrinsicHeight() + bottom);
            this.j.draw(canvas);
        }
    }

    public void e(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        k(view, i2, i3, i4, i5, i6);
    }

    public boolean f() {
        z();
        return this.i.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        z();
        int H = o4.H(this) & 256;
        boolean q2 = q(this.h, rect, true, true, false, true);
        this.u.set(rect);
        m0.a(this, this.u, this.r);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            q2 = true;
        }
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            q2 = true;
        }
        if (q2) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        z();
        return this.i.g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        z();
        return this.i.getTitle();
    }

    public boolean h() {
        z();
        return this.i.h();
    }

    public void i(int i2) {
        z();
        if (i2 == 2) {
            this.i.x();
        } else if (i2 == 5) {
            this.i.y();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public void j() {
        z();
        this.i.i();
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public boolean l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public void m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public void n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        o4.g0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = layoutParams.leftMargin + paddingLeft;
                int i8 = layoutParams.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        z();
        measureChildWithMargins(this.h, i2, 0, i3, 0);
        LayoutParams layoutParams = (LayoutParams) this.h.getLayoutParams();
        int max = Math.max(0, this.h.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.h.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.h.getMeasuredState());
        boolean z2 = (o4.H(this) & 256) != 0;
        if (z2) {
            i4 = this.e;
            if (this.m && this.h.getTabContainer() != null) {
                i4 += this.e;
            }
        } else {
            i4 = this.h.getVisibility() != 8 ? this.h.getMeasuredHeight() : 0;
        }
        this.t.set(this.r);
        this.w.set(this.u);
        Rect rect = (this.l || z2) ? this.w : this.t;
        rect.top += i4;
        rect.bottom += 0;
        q(this.g, this.t, true, true, true, true);
        if (!this.x.equals(this.w)) {
            this.x.set(this.w);
            this.g.a(this.w);
        }
        measureChildWithMargins(this.g, i2, 0, i3, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.g.getLayoutParams();
        int max3 = Math.max(max, this.g.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.g.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.n || !z2) {
            return false;
        }
        if (B(f2, f3)) {
            p();
        } else {
            A();
        }
        this.o = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.p + i3;
        this.p = i6;
        setActionBarHideOffset(i6);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.E.b(view, view2, i2);
        this.p = getActionBarHideOffset();
        u();
        d dVar = this.y;
        if (dVar != null) {
            dVar.e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.h.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    public void onStopNestedScroll(View view) {
        if (this.n && !this.o) {
            if (this.p <= this.h.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.y;
        if (dVar != null) {
            dVar.b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.q ^ i2;
        this.q = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        d dVar = this.y;
        if (dVar != null) {
            dVar.c(!z2);
            if (z3 || !z2) {
                this.y.a();
            } else {
                this.y.d();
            }
        }
        if ((i3 & 256) != 0 && this.y != null) {
            o4.g0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f = i2;
        d dVar = this.y;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: s */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.h.setTranslationY((float) (-Math.max(0, Math.min(i2, this.h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.y = dVar;
        if (getWindowToken() != null) {
            this.y.f(this.f);
            int i2 = this.q;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                o4.g0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.n) {
            this.n = z2;
            if (!z2) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        z();
        this.i.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.i.setIcon(drawable);
    }

    public void setLogo(int i2) {
        z();
        this.i.o(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.l = z2;
        this.k = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.i.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.i.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.g == null) {
            this.g = (ContentFrameLayout) findViewById(R$id.action_bar_activity_content);
            this.h = (ActionBarContainer) findViewById(R$id.action_bar_container);
            this.i = t(findViewById(R$id.action_bar));
        }
    }
}
