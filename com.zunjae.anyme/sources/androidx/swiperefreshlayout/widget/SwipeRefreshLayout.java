package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.github.mikephil.charting.utils.Utils;

public class SwipeRefreshLayout extends ViewGroup implements i4, e4 {
    private static final String S = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] T = {16842766};
    protected int A;
    float B;
    protected int C;
    int D;
    int E;
    b F;
    private Animation G;
    private Animation H;
    private Animation I;
    private Animation J;
    private Animation K;
    boolean L;
    private int M;
    boolean N;
    private i O;
    private Animation.AnimationListener P = new a();
    private final Animation Q = new f();
    private final Animation R = new g();
    private View e;
    j f;
    boolean g = false;
    private int h;
    private float i = -1.0f;
    private float j;
    private final j4 k;
    private final f4 l;
    private final int[] m = new int[2];
    private final int[] n = new int[2];
    private boolean o;
    private int p;
    int q;
    private float r;
    private float s;
    private boolean t;
    private int u = -1;
    boolean v;
    private boolean w;
    private final DecelerateInterpolator x;
    a y;
    private int z = -1;

    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.g) {
                swipeRefreshLayout.F.setAlpha(255);
                SwipeRefreshLayout.this.F.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.L && (jVar = swipeRefreshLayout2.f) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.q = swipeRefreshLayout3.y.getTop();
                return;
            }
            swipeRefreshLayout.r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    class c extends Animation {
        c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    class d extends Animation {
        final /* synthetic */ int e;
        final /* synthetic */ int f;

        d(int i, int i2) {
            this.e = i;
            this.f = i2;
        }

        public void applyTransformation(float f2, Transformation transformation) {
            b bVar = SwipeRefreshLayout.this.F;
            int i = this.e;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f - i)) * f2)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.v) {
                swipeRefreshLayout.x((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.N ? swipeRefreshLayout.D - Math.abs(swipeRefreshLayout.C) : swipeRefreshLayout.D;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.A;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.y.getTop());
            SwipeRefreshLayout.this.F.e(1.0f - f);
        }
    }

    class g extends Animation {
        g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.p(f);
        }
    }

    class h extends Animation {
        h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.B;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.p(f);
        }
    }

    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.p = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.M = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.D = i2;
        this.i = (float) i2;
        this.k = new j4(this);
        this.l = new f4(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.M;
        this.q = i3;
        this.C = i3;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        this.A = i2;
        this.Q.reset();
        this.Q.setDuration(200);
        this.Q.setInterpolator(this.x);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.Q);
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        if (this.v) {
            y(i2, animationListener);
            return;
        }
        this.A = i2;
        this.R.reset();
        this.R.setDuration(200);
        this.R.setInterpolator(this.x);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.R);
    }

    private void d() {
        this.y = new a(getContext(), -328966);
        b bVar = new b(getContext());
        this.F = bVar;
        bVar.l(1);
        this.y.setImageDrawable(this.F);
        this.y.setVisibility(8);
        addView(this.y);
    }

    private void f() {
        if (this.e == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.y)) {
                    this.e = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f2) {
        if (f2 > this.i) {
            s(true, true);
            return;
        }
        this.g = false;
        this.F.j(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        e eVar = null;
        if (!this.v) {
            eVar = new e();
        }
        b(this.q, eVar);
        this.F.d(false);
    }

    private boolean h(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void j(float f2) {
        this.F.d(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.i));
        float max = (((float) Math.max(((double) min) - 0.4d, Utils.DOUBLE_EPSILON)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.i;
        int i2 = this.E;
        if (i2 <= 0) {
            i2 = this.N ? this.D - this.C : this.D;
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(Utils.FLOAT_EPSILON, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.C + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        if (!this.v) {
            this.y.setScaleX(1.0f);
            this.y.setScaleY(1.0f);
        }
        if (this.v) {
            setAnimationProgress(Math.min(1.0f, f2 / this.i));
        }
        if (f2 < this.i) {
            if (this.F.getAlpha() > 76 && !h(this.I)) {
                w();
            }
        } else if (this.F.getAlpha() < 255 && !h(this.J)) {
            v();
        }
        this.F.j(Utils.FLOAT_EPSILON, Math.min(0.8f, max * 0.8f));
        this.F.e(Math.min(1.0f, max));
        this.F.g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.q);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.u) {
            this.u = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void s(boolean z2, boolean z3) {
        if (this.g != z2) {
            this.L = z3;
            f();
            this.g = z2;
            if (z2) {
                a(this.q, this.P);
            } else {
                x(this.P);
            }
        }
    }

    private void setColorViewAlpha(int i2) {
        this.y.getBackground().setAlpha(i2);
        this.F.setAlpha(i2);
    }

    private Animation t(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300);
        this.y.b((Animation.AnimationListener) null);
        this.y.clearAnimation();
        this.y.startAnimation(dVar);
        return dVar;
    }

    private void u(float f2) {
        float f3 = this.s;
        int i2 = this.h;
        if (f2 - f3 > ((float) i2) && !this.t) {
            this.r = f3 + ((float) i2);
            this.t = true;
            this.F.setAlpha(76);
        }
    }

    private void v() {
        this.J = t(this.F.getAlpha(), 255);
    }

    private void w() {
        this.I = t(this.F.getAlpha(), 76);
    }

    private void y(int i2, Animation.AnimationListener animationListener) {
        this.A = i2;
        this.B = this.y.getScaleX();
        h hVar = new h();
        this.K = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.K);
    }

    private void z(Animation.AnimationListener animationListener) {
        this.y.setVisibility(0);
        this.F.setAlpha(255);
        b bVar = new b();
        this.G = bVar;
        bVar.setDuration((long) this.p);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.G);
    }

    public boolean c() {
        i iVar = this.O;
        if (iVar != null) {
            return iVar.a(this, this.e);
        }
        View view = this.e;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.l.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.l.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.l.c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.l.f(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.z;
        return i4 < 0 ? i3 : i3 == i2 + -1 ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    public int getNestedScrollAxes() {
        return this.k.a();
    }

    public int getProgressCircleDiameter() {
        return this.M;
    }

    public int getProgressViewEndOffset() {
        return this.D;
    }

    public int getProgressViewStartOffset() {
        return this.C;
    }

    public boolean hasNestedScrollingParent() {
        return this.l.j();
    }

    public boolean i() {
        return this.g;
    }

    public boolean isNestedScrollingEnabled() {
        return this.l.l();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.w && actionMasked == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || c() || this.g || this.o) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.u;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    u(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.t = false;
            this.u = -1;
        } else {
            setTargetOffsetTopAndBottom(this.C - this.y.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.u = pointerId;
            this.t = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.s = motionEvent.getY(findPointerIndex2);
        }
        return this.t;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.e == null) {
                f();
            }
            View view = this.e;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.y.getMeasuredWidth();
                int measuredHeight2 = this.y.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.q;
                this.y.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.e == null) {
            f();
        }
        View view = this.e;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.y.measure(View.MeasureSpec.makeMeasureSpec(this.M, 1073741824), View.MeasureSpec.makeMeasureSpec(this.M, 1073741824));
            this.z = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.y) {
                    this.z = i4;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.j;
            if (f2 > Utils.FLOAT_EPSILON) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.j = Utils.FLOAT_EPSILON;
                } else {
                    this.j = f2 - f3;
                    iArr[1] = i3;
                }
                j(this.j);
            }
        }
        if (this.N && i3 > 0 && this.j == Utils.FLOAT_EPSILON && Math.abs(i3 - iArr[1]) > 0) {
            this.y.setVisibility(8);
        }
        int[] iArr2 = this.m;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.n);
        int i6 = i5 + this.n[1];
        if (i6 < 0 && !c()) {
            float abs = this.j + ((float) Math.abs(i6));
            this.j = abs;
            j(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.k.b(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.j = Utils.FLOAT_EPSILON;
        this.o = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.w && !this.g && (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.k.d(view);
        this.o = false;
        float f2 = this.j;
        if (f2 > Utils.FLOAT_EPSILON) {
            g(f2);
            this.j = Utils.FLOAT_EPSILON;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.w && actionMasked == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || c() || this.g || this.o) {
            return false;
        }
        if (actionMasked == 0) {
            this.u = motionEvent.getPointerId(0);
            this.t = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.u);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.t) {
                this.t = false;
                g((motionEvent.getY(findPointerIndex) - this.r) * 0.5f);
            }
            this.u = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.u);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            u(y2);
            if (this.t) {
                float f2 = (y2 - this.r) * 0.5f;
                if (f2 <= Utils.FLOAT_EPSILON) {
                    return false;
                }
                j(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        int i2 = this.A;
        setTargetOffsetTopAndBottom((i2 + ((int) (((float) (this.C - i2)) * f2))) - this.y.getTop());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.y.clearAnimation();
        this.F.stop();
        this.y.setVisibility(8);
        setColorViewAlpha(255);
        if (this.v) {
            setAnimationProgress(Utils.FLOAT_EPSILON);
        } else {
            setTargetOffsetTopAndBottom(this.C - this.q);
        }
        this.q = this.y.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.e instanceof AbsListView)) {
            View view = this.e;
            if (view == null || o4.P(view)) {
                super.requestDisallowInterceptTouchEvent(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        this.y.setScaleX(f2);
        this.y.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.F.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = androidx.core.content.a.d(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.i = (float) i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            r();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.l.m(z2);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.O = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.y.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.d(getContext(), i2));
    }

    public void setRefreshing(boolean z2) {
        if (!z2 || this.g == z2) {
            s(z2, false);
            return;
        }
        this.g = z2;
        setTargetOffsetTopAndBottom((!this.N ? this.D + this.C : this.D) - this.q);
        this.L = false;
        z(this.P);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.M = (int) (getResources().getDisplayMetrics().density * (i2 == 0 ? 56.0f : 40.0f));
            this.y.setImageDrawable((Drawable) null);
            this.F.l(i2);
            this.y.setImageDrawable(this.F);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.E = i2;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i2) {
        this.y.bringToFront();
        o4.U(this.y, i2);
        this.q = this.y.getTop();
    }

    public boolean startNestedScroll(int i2) {
        return this.l.o(i2);
    }

    public void stopNestedScroll() {
        this.l.q();
    }

    /* access modifiers changed from: package-private */
    public void x(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.H = cVar;
        cVar.setDuration(150);
        this.y.b(animationListener);
        this.y.clearAnimation();
        this.y.startAnimation(this.H);
    }
}
