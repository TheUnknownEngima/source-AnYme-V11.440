package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;
import defpackage.a5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    private static final int S = R$style.Widget_Design_TabLayout;
    private static final r3<g> T = new t3(16);
    int A;
    int B;
    int C;
    int D;
    boolean E;
    boolean F;
    boolean G;
    private c H;
    private final ArrayList<c> I;
    private c J;
    private ValueAnimator K;
    ViewPager L;
    private androidx.viewpager.widget.a M;
    private DataSetObserver N;
    private h O;
    private b P;
    private boolean Q;
    private final r3<i> R;
    private final ArrayList<g> e;
    private g f;
    /* access modifiers changed from: private */
    public final RectF g;
    final f h;
    int i;
    int j;
    int k;
    int l;
    int m;
    ColorStateList n;
    ColorStateList o;
    ColorStateList p;
    Drawable q;
    PorterDuff.Mode r;
    float s;
    float t;
    final int u;
    int v;
    private final int w;
    private final int x;
    private final int y;
    private int z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.h {
        private boolean e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.e = z;
        }

        public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.L == viewPager) {
                tabLayout.F(aVar2, this.e);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<g> {
    }

    private class e extends DataSetObserver {
        e() {
        }

        public void onChanged() {
            TabLayout.this.y();
        }

        public void onInvalidated() {
            TabLayout.this.y();
        }
    }

    class f extends LinearLayout {
        private int e;
        private final Paint f;
        private final GradientDrawable g;
        int h = -1;
        float i;
        private int j = -1;
        int k = -1;
        int l = -1;
        ValueAnimator m;
        /* access modifiers changed from: private */
        public int n = -1;
        /* access modifiers changed from: private */
        public int o = -1;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ int e;
            final /* synthetic */ int f;

            a(int i, int i2) {
                this.e = i;
                this.f = i2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                f fVar = f.this;
                fVar.f(f91.b(fVar.n, this.e, animatedFraction), f91.b(f.this.o, this.f, animatedFraction));
            }
        }

        class b extends AnimatorListenerAdapter {
            final /* synthetic */ int e;

            b(int i) {
                this.e = i;
            }

            public void onAnimationEnd(Animator animator) {
                f fVar = f.this;
                fVar.h = this.e;
                fVar.i = Utils.FLOAT_EPSILON;
            }

            public void onAnimationStart(Animator animator) {
                f.this.h = this.e;
            }
        }

        f(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f = new Paint();
            this.g = new GradientDrawable();
        }

        private void d(i iVar, RectF rectF) {
            int b2 = iVar.getContentWidth();
            int c = (int) r.c(getContext(), 24);
            if (b2 < c) {
                b2 = c;
            }
            int left = (iVar.getLeft() + iVar.getRight()) / 2;
            int i2 = b2 / 2;
            rectF.set((float) (left - i2), Utils.FLOAT_EPSILON, (float) (left + i2), Utils.FLOAT_EPSILON);
        }

        private void j() {
            int i2;
            int i3;
            View childAt = getChildAt(this.h);
            if (childAt == null || childAt.getWidth() <= 0) {
                i3 = -1;
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.F && (childAt instanceof i)) {
                    d((i) childAt, tabLayout.g);
                    i3 = (int) TabLayout.this.g.left;
                    i2 = (int) TabLayout.this.g.right;
                }
                if (this.i > Utils.FLOAT_EPSILON && this.h < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.h + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.F && (childAt2 instanceof i)) {
                        d((i) childAt2, tabLayout2.g);
                        left = (int) TabLayout.this.g.left;
                        right = (int) TabLayout.this.g.right;
                    }
                    float f2 = this.i;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            f(i3, i2);
        }

        private void k(boolean z, int i2, int i3) {
            View childAt = getChildAt(i2);
            if (childAt == null) {
                j();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.F && (childAt instanceof i)) {
                d((i) childAt, tabLayout.g);
                left = (int) TabLayout.this.g.left;
                right = (int) TabLayout.this.g.right;
            }
            int i4 = this.k;
            int i5 = this.l;
            if (i4 != left || i5 != right) {
                if (z) {
                    this.n = i4;
                    this.o = i5;
                }
                a aVar = new a(left, right);
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.m = valueAnimator;
                    valueAnimator.setInterpolator(f91.b);
                    valueAnimator.setDuration((long) i3);
                    valueAnimator.setFloatValues(new float[]{Utils.FLOAT_EPSILON, 1.0f});
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.addListener(new b(i2));
                    valueAnimator.start();
                    return;
                }
                this.m.removeAllUpdateListeners();
                this.m.addUpdateListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i2, int i3) {
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.m.cancel();
            }
            k(true, i2, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.q
                r1 = 0
                if (r0 == 0) goto L_0x000c
                int r0 = r0.getIntrinsicHeight()
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                int r2 = r5.e
                if (r2 < 0) goto L_0x0012
                r0 = r2
            L_0x0012:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.C
                if (r2 == 0) goto L_0x0031
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L_0x0023
                if (r2 == r4) goto L_0x003a
                r0 = 3
                if (r2 == r0) goto L_0x0036
                r0 = 0
                goto L_0x003a
            L_0x0023:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r1 = r1 / r4
                int r2 = r5.getHeight()
                int r2 = r2 + r0
                int r0 = r2 / 2
                goto L_0x003a
            L_0x0031:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
            L_0x0036:
                int r0 = r5.getHeight()
            L_0x003a:
                int r2 = r5.k
                if (r2 < 0) goto L_0x0074
                int r3 = r5.l
                if (r3 <= r2) goto L_0x0074
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r2 = r2.q
                if (r2 == 0) goto L_0x0049
                goto L_0x004b
            L_0x0049:
                android.graphics.drawable.GradientDrawable r2 = r5.g
            L_0x004b:
                android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.a.r(r2)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                int r3 = r5.k
                int r4 = r5.l
                r2.setBounds(r3, r1, r4, r0)
                android.graphics.Paint r0 = r5.f
                if (r0 == 0) goto L_0x0071
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                int r0 = r0.getColor()
                if (r1 != r3) goto L_0x006e
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.setColorFilter(r0, r1)
                goto L_0x0071
            L_0x006e:
                androidx.core.graphics.drawable.a.n(r2, r0)
            L_0x0071:
                r2.draw(r6)
            L_0x0074:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f.draw(android.graphics.Canvas):void");
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void f(int i2, int i3) {
            if (i2 != this.k || i3 != this.l) {
                this.k = i2;
                this.l = i3;
                o4.Z(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(int i2, float f2) {
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.m.cancel();
            }
            this.h = i2;
            this.i = f2;
            j();
        }

        /* access modifiers changed from: package-private */
        public void h(int i2) {
            if (this.f.getColor() != i2) {
                this.f.setColor(i2);
                o4.Z(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void i(int i2) {
            if (this.e != i2) {
                this.e = i2;
                o4.Z(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                j();
            } else {
                k(false, this.h, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.A == 1 || tabLayout.D == 2) {
                    int childCount = getChildCount();
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (((int) r.c(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i6 = 0; i6 < childCount; i6++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != Utils.FLOAT_EPSILON) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = Utils.FLOAT_EPSILON;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.A = 0;
                            tabLayout2.M(false);
                        }
                        if (z) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.j != i2) {
                requestLayout();
                this.j = i2;
            }
        }
    }

    public static class g {
        private Object a;
        private Drawable b;
        /* access modifiers changed from: private */
        public CharSequence c;
        /* access modifiers changed from: private */
        public CharSequence d;
        private int e = -1;
        private View f;
        /* access modifiers changed from: private */
        public int g = 1;
        public TabLayout h;
        public i i;

        public View d() {
            return this.f;
        }

        public Drawable e() {
            return this.b;
        }

        public int f() {
            return this.e;
        }

        public int g() {
            return this.g;
        }

        public Object h() {
            return this.a;
        }

        public CharSequence i() {
            return this.c;
        }

        public boolean j() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.h = null;
            this.i = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void l() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                tabLayout.D(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g m(CharSequence charSequence) {
            this.d = charSequence;
            t();
            return this;
        }

        public g n(int i2) {
            o(LayoutInflater.from(this.i.getContext()).inflate(i2, this.i, false));
            return this;
        }

        public g o(View view) {
            this.f = view;
            t();
            return this;
        }

        public g p(Drawable drawable) {
            this.b = drawable;
            TabLayout tabLayout = this.h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                this.h.M(true);
            }
            t();
            if (r91.a && this.i.m() && this.i.i.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public void q(int i2) {
            this.e = i2;
        }

        public g r(Object obj) {
            this.a = obj;
            return this;
        }

        public g s(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.c = charSequence;
            t();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            i iVar = this.i;
            if (iVar != null) {
                iVar.u();
            }
        }
    }

    public static class h implements ViewPager.i {
        private final WeakReference<TabLayout> e;
        private int f;
        private int g;

        public h(TabLayout tabLayout) {
            this.e = new WeakReference<>(tabLayout);
        }

        public void a(int i, float f2, int i2) {
            TabLayout tabLayout = (TabLayout) this.e.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.g != 2 || this.f == 1;
                if (!(this.g == 2 && this.f == 0)) {
                    z = true;
                }
                tabLayout.H(i, f2, z2, z);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.g = 0;
            this.f = 0;
        }

        public void d(int i) {
            this.f = this.g;
            this.g = i;
        }

        public void e(int i) {
            TabLayout tabLayout = (TabLayout) this.e.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.g;
                tabLayout.E(tabLayout.w(i), i2 == 0 || (i2 == 2 && this.f == 0));
            }
        }
    }

    public final class i extends LinearLayout {
        private g e;
        private TextView f;
        private ImageView g;
        private View h;
        /* access modifiers changed from: private */
        public q91 i;
        private View j;
        private TextView k;
        private ImageView l;
        private Drawable m;
        private int n = 2;

        class a implements View.OnLayoutChangeListener {
            final /* synthetic */ View e;

            a(View view) {
                this.e = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.e.getVisibility() == 0) {
                    i.this.t(this.e);
                }
            }
        }

        public i(Context context) {
            super(context);
            v(context);
            o4.w0(this, TabLayout.this.i, TabLayout.this.j, TabLayout.this.k, TabLayout.this.l);
            setGravity(17);
            setOrientation(TabLayout.this.E ^ true ? 1 : 0);
            setClickable(true);
            o4.x0(this, m4.b(getContext(), 1002));
        }

        private void g(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new a(view));
            }
        }

        private q91 getBadge() {
            return this.i;
        }

        /* access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f, this.g, this.j};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        private q91 getOrCreateBadge() {
            if (this.i == null) {
                this.i = q91.c(getContext());
            }
            s();
            q91 q91 = this.i;
            if (q91 != null) {
                return q91;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private float h(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }

        private void i(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        private FrameLayout j() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        public void k(Canvas canvas) {
            Drawable drawable = this.m;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.m.draw(canvas);
            }
        }

        private FrameLayout l(View view) {
            if ((view == this.g || view == this.f) && r91.a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        public boolean m() {
            return this.i != null;
        }

        private void n() {
            ViewGroup viewGroup;
            if (r91.a) {
                viewGroup = j();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_icon, viewGroup, false);
            this.g = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void o() {
            ViewGroup viewGroup;
            if (r91.a) {
                viewGroup = j();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_text, viewGroup, false);
            this.f = textView;
            viewGroup.addView(textView);
        }

        private void q(View view) {
            if (m() && view != null) {
                i(false);
                r91.a(this.i, view, l(view));
                this.h = view;
            }
        }

        private void r() {
            if (m()) {
                i(true);
                View view = this.h;
                if (view != null) {
                    r91.d(this.i, view, l(view));
                    this.h = null;
                }
            }
        }

        private void s() {
            g gVar;
            View view;
            View view2;
            g gVar2;
            if (m()) {
                if (this.j == null) {
                    if (this.g != null && (gVar2 = this.e) != null && gVar2.e() != null) {
                        View view3 = this.h;
                        view = this.g;
                        if (view3 != view) {
                            r();
                            view2 = this.g;
                        }
                        t(view);
                        return;
                    } else if (!(this.f == null || (gVar = this.e) == null || gVar.g() != 1)) {
                        View view4 = this.h;
                        view = this.f;
                        if (view4 != view) {
                            r();
                            view2 = this.f;
                        }
                        t(view);
                        return;
                    }
                    q(view2);
                    return;
                }
                r();
            }
        }

        /* access modifiers changed from: private */
        public void t(View view) {
            if (m() && view == this.h) {
                r91.e(this.i, view, l(view));
            }
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void v(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.u
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = defpackage.f.d(r7, r0)
                r6.m = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.m
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.m = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.p
                if (r2 == 0) goto L_0x0078
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.p
                android.content.res.ColorStateList r3 = defpackage.ha1.a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x0063
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.G
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.G
                if (r4 == 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r1 = r2
            L_0x005e:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0078
            L_0x0063:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.a.r(r2)
                androidx.core.graphics.drawable.a.o(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0078:
                defpackage.o4.l0(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.v(android.content.Context):void");
        }

        private void x(TextView textView, ImageView imageView) {
            g gVar = this.e;
            CharSequence charSequence = null;
            Drawable mutate = (gVar == null || gVar.e() == null) ? null : androidx.core.graphics.drawable.a.r(this.e.e()).mutate();
            g gVar2 = this.e;
            CharSequence i2 = gVar2 != null ? gVar2.i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(i2);
            if (textView != null) {
                if (z) {
                    textView.setText(i2);
                    if (this.e.g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int c = (!z || imageView.getVisibility() != 0) ? 0 : (int) r.c(getContext(), 8);
                if (TabLayout.this.E) {
                    if (c != b4.a(marginLayoutParams)) {
                        b4.c(marginLayoutParams, c);
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (c != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = c;
                    b4.c(marginLayoutParams, 0);
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
            g gVar3 = this.e;
            CharSequence a2 = gVar3 != null ? gVar3.d : null;
            if (!z) {
                charSequence = a2;
            }
            i0.a(this, charSequence);
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.m;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.m.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public g getTab() {
            return this.e;
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            q91 q91 = this.i;
            if (q91 != null && q91.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.i.h());
            }
            a5 I0 = a5.I0(accessibilityNodeInfo);
            I0.g0(a5.c.f(0, 1, this.e.f(), 1, false, isSelected()));
            if (isSelected()) {
                I0.e0(false);
                I0.U(a5.a.g);
            }
            I0.x0("Tab");
        }

        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.v, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f != null) {
                float f2 = TabLayout.this.s;
                int i4 = this.n;
                ImageView imageView = this.g;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.t;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f.getTextSize();
                int lineCount = this.f.getLineCount();
                int d = androidx.core.widget.i.d(this.f);
                int i5 = (f2 > textSize ? 1 : (f2 == textSize ? 0 : -1));
                if (i5 != 0 || (d >= 0 && i4 != d)) {
                    if (TabLayout.this.D == 1 && i5 > 0 && lineCount == 1 && ((layout = this.f.getLayout()) == null || h(layout, 0, f2) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f.setTextSize(0, f2);
                        this.f.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p() {
            setTab((g) null);
            setSelected(false);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.e == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.e.l();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.g;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.j;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(g gVar) {
            if (gVar != this.e) {
                this.e = gVar;
                u();
            }
        }

        /* access modifiers changed from: package-private */
        public final void u() {
            g gVar = this.e;
            Drawable drawable = null;
            View d = gVar != null ? gVar.d() : null;
            if (d != null) {
                ViewParent parent = d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d);
                    }
                    addView(d);
                }
                this.j = d;
                TextView textView = this.f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.g.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) d.findViewById(16908308);
                this.k = textView2;
                if (textView2 != null) {
                    this.n = androidx.core.widget.i.d(textView2);
                }
                this.l = (ImageView) d.findViewById(16908294);
            } else {
                View view = this.j;
                if (view != null) {
                    removeView(view);
                    this.j = null;
                }
                this.k = null;
                this.l = null;
            }
            if (this.j == null) {
                if (this.g == null) {
                    n();
                }
                if (!(gVar == null || gVar.e() == null)) {
                    drawable = androidx.core.graphics.drawable.a.r(gVar.e()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.o(drawable, TabLayout.this.o);
                    PorterDuff.Mode mode = TabLayout.this.r;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.p(drawable, mode);
                    }
                }
                if (this.f == null) {
                    o();
                    this.n = androidx.core.widget.i.d(this.f);
                }
                androidx.core.widget.i.r(this.f, TabLayout.this.m);
                ColorStateList colorStateList = TabLayout.this.n;
                if (colorStateList != null) {
                    this.f.setTextColor(colorStateList);
                }
                x(this.f, this.g);
                s();
                g(this.g);
                g(this.f);
            } else if (!(this.k == null && this.l == null)) {
                x(this.k, this.l);
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.d)) {
                setContentDescription(gVar.d);
            }
            setSelected(gVar != null && gVar.j());
        }

        /* access modifiers changed from: package-private */
        public final void w() {
            ImageView imageView;
            TextView textView;
            setOrientation(TabLayout.this.E ^ true ? 1 : 0);
            if (this.k == null && this.l == null) {
                textView = this.f;
                imageView = this.g;
            } else {
                textView = this.k;
                imageView = this.l;
            }
            x(textView, imageView);
        }
    }

    public static class j implements d {
        private final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        public void a(g gVar) {
        }

        public void b(g gVar) {
            this.a.setCurrentItem(gVar.f());
        }

        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, S), attributeSet, i2);
        this.e = new ArrayList<>();
        this.g = new RectF();
        this.v = Integer.MAX_VALUE;
        this.I = new ArrayList<>();
        this.R = new s3(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.h = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.TabLayout, i2, S, R$styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ra1 ra1 = new ra1();
            ra1.Y(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            ra1.N(context2);
            ra1.X(o4.t(this));
            o4.l0(this, ra1);
        }
        this.h.i(h2.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, -1));
        this.h.h(h2.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(ca1.d(context2, h2, R$styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(h2.getInt(R$styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(h2.getBoolean(R$styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = h2.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.i = h2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.j = h2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.j);
        this.k = h2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.k);
        this.l = h2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.l);
        int resourceId = h2.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.TextAppearance_Design_Tab);
        this.m = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, androidx.appcompat.R$styleable.TextAppearance);
        try {
            this.s = (float) obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R$styleable.TextAppearance_android_textSize, 0);
            this.n = ca1.a(context2, obtainStyledAttributes, androidx.appcompat.R$styleable.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (h2.hasValue(R$styleable.TabLayout_tabTextColor)) {
                this.n = ca1.a(context2, h2, R$styleable.TabLayout_tabTextColor);
            }
            if (h2.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                this.n = o(this.n.getDefaultColor(), h2.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.o = ca1.a(context2, h2, R$styleable.TabLayout_tabIconTint);
            this.r = r.i(h2.getInt(R$styleable.TabLayout_tabIconTintMode, -1), (PorterDuff.Mode) null);
            this.p = ca1.a(context2, h2, R$styleable.TabLayout_tabRippleColor);
            this.B = h2.getInt(R$styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.w = h2.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.x = h2.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.u = h2.getResourceId(R$styleable.TabLayout_tabBackground, 0);
            this.z = h2.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.D = h2.getInt(R$styleable.TabLayout_tabMode, 1);
            this.A = h2.getInt(R$styleable.TabLayout_tabGravity, 0);
            this.E = h2.getBoolean(R$styleable.TabLayout_tabInlineLabel, false);
            this.G = h2.getBoolean(R$styleable.TabLayout_tabUnboundedRipple, false);
            h2.recycle();
            Resources resources = getResources();
            this.t = (float) resources.getDimensionPixelSize(R$dimen.design_tab_text_size_2line);
            this.y = resources.getDimensionPixelSize(R$dimen.design_tab_scrollable_min_width);
            l();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void C(int i2) {
        i iVar = (i) this.h.getChildAt(i2);
        this.h.removeViewAt(i2);
        if (iVar != null) {
            iVar.p();
            this.R.c(iVar);
        }
        requestLayout();
    }

    private void J(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.L;
        if (viewPager2 != null) {
            h hVar = this.O;
            if (hVar != null) {
                viewPager2.J(hVar);
            }
            b bVar = this.P;
            if (bVar != null) {
                this.L.I(bVar);
            }
        }
        c cVar = this.J;
        if (cVar != null) {
            B(cVar);
            this.J = null;
        }
        if (viewPager != null) {
            this.L = viewPager;
            if (this.O == null) {
                this.O = new h(this);
            }
            this.O.b();
            viewPager.c(this.O);
            j jVar = new j(viewPager);
            this.J = jVar;
            b(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                F(adapter, z2);
            }
            if (this.P == null) {
                this.P = new b();
            }
            this.P.a(z2);
            viewPager.b(this.P);
            G(viewPager.getCurrentItem(), Utils.FLOAT_EPSILON, true);
        } else {
            this.L = null;
            F((androidx.viewpager.widget.a) null, false);
        }
        this.Q = z3;
    }

    private void K() {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.e.get(i2).t();
        }
    }

    private void L(LinearLayout.LayoutParams layoutParams) {
        float f2;
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            f2 = 1.0f;
        } else {
            layoutParams.width = -2;
            f2 = Utils.FLOAT_EPSILON;
        }
        layoutParams.weight = f2;
    }

    private void g(TabItem tabItem) {
        g x2 = x();
        CharSequence charSequence = tabItem.e;
        if (charSequence != null) {
            x2.s(charSequence);
        }
        Drawable drawable = tabItem.f;
        if (drawable != null) {
            x2.p(drawable);
        }
        int i2 = tabItem.g;
        if (i2 != 0) {
            x2.n(i2);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            x2.m(tabItem.getContentDescription());
        }
        d(x2);
    }

    private int getDefaultHeight() {
        int size = this.e.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                g gVar = this.e.get(i2);
                if (gVar != null && gVar.e() != null && !TextUtils.isEmpty(gVar.i())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.E) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.w;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.D;
        if (i3 == 0 || i3 == 2) {
            return this.y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.h.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(g gVar) {
        i iVar = gVar.i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.h.addView(iVar, gVar.f(), p());
    }

    private void i(View view) {
        if (view instanceof TabItem) {
            g((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void j(int i2) {
        if (i2 != -1) {
            if (getWindowToken() == null || !o4.O(this) || this.h.e()) {
                G(i2, Utils.FLOAT_EPSILON, true);
                return;
            }
            int scrollX = getScrollX();
            int m2 = m(i2, Utils.FLOAT_EPSILON);
            if (scrollX != m2) {
                v();
                this.K.setIntValues(new int[]{scrollX, m2});
                this.K.start();
            }
            this.h.c(i2, this.B);
        }
    }

    private void k(int i2) {
        f fVar;
        int i3;
        if (i2 != 0) {
            i3 = 1;
            if (i2 == 1) {
                fVar = this.h;
                fVar.setGravity(i3);
            } else if (i2 != 2) {
                return;
            }
        }
        fVar = this.h;
        i3 = 8388611;
        fVar.setGravity(i3);
    }

    private void l() {
        int i2 = this.D;
        o4.w0(this.h, (i2 == 0 || i2 == 2) ? Math.max(0, this.z - this.i) : 0, 0, 0, 0);
        int i3 = this.D;
        if (i3 == 0) {
            k(this.A);
        } else if (i3 == 1 || i3 == 2) {
            int i4 = this.A;
            this.h.setGravity(1);
        }
        M(true);
    }

    private int m(int i2, float f2) {
        int i3 = this.D;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.h.getChildAt(i2);
        int i5 = i2 + 1;
        View childAt2 = i5 < this.h.getChildCount() ? this.h.getChildAt(i5) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i4 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (width + i4)) * 0.5f * f2);
        return o4.y(this) == 0 ? left + i6 : left - i6;
    }

    private void n(g gVar, int i2) {
        gVar.q(i2);
        this.e.add(i2, gVar);
        int size = this.e.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.e.get(i2).q(i2);
            } else {
                return;
            }
        }
    }

    private static ColorStateList o(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private LinearLayout.LayoutParams p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        L(layoutParams);
        return layoutParams;
    }

    private i r(g gVar) {
        r3<i> r3Var = this.R;
        i b2 = r3Var != null ? r3Var.b() : null;
        if (b2 == null) {
            b2 = new i(getContext());
        }
        b2.setTab(gVar);
        b2.setFocusable(true);
        b2.setMinimumWidth(getTabMinWidth());
        b2.setContentDescription(TextUtils.isEmpty(gVar.d) ? gVar.c : gVar.d);
        return b2;
    }

    private void s(g gVar) {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).a(gVar);
        }
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.h.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.h.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    private void t(g gVar) {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).b(gVar);
        }
    }

    private void u(g gVar) {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).c(gVar);
        }
    }

    private void v() {
        if (this.K == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.K = valueAnimator;
            valueAnimator.setInterpolator(f91.b);
            this.K.setDuration((long) this.B);
            this.K.addUpdateListener(new a());
        }
    }

    public void A() {
        for (int childCount = this.h.getChildCount() - 1; childCount >= 0; childCount--) {
            C(childCount);
        }
        Iterator<g> it = this.e.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.k();
            z(next);
        }
        this.f = null;
    }

    @Deprecated
    public void B(c cVar) {
        this.I.remove(cVar);
    }

    public void D(g gVar) {
        E(gVar, true);
    }

    public void E(g gVar, boolean z2) {
        g gVar2 = this.f;
        if (gVar2 != gVar) {
            int f2 = gVar != null ? gVar.f() : -1;
            if (z2) {
                if ((gVar2 == null || gVar2.f() == -1) && f2 != -1) {
                    G(f2, Utils.FLOAT_EPSILON, true);
                } else {
                    j(f2);
                }
                if (f2 != -1) {
                    setSelectedTabView(f2);
                }
            }
            this.f = gVar;
            if (gVar2 != null) {
                u(gVar2);
            }
            if (gVar != null) {
                t(gVar);
            }
        } else if (gVar2 != null) {
            s(gVar);
            j(gVar.f());
        }
    }

    /* access modifiers changed from: package-private */
    public void F(androidx.viewpager.widget.a aVar, boolean z2) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.M;
        if (!(aVar2 == null || (dataSetObserver = this.N) == null)) {
            aVar2.u(dataSetObserver);
        }
        this.M = aVar;
        if (z2 && aVar != null) {
            if (this.N == null) {
                this.N = new e();
            }
            aVar.m(this.N);
        }
        y();
    }

    public void G(int i2, float f2, boolean z2) {
        H(i2, f2, z2, true);
    }

    public void H(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.h.getChildCount()) {
            if (z3) {
                this.h.g(i2, f2);
            }
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.K.cancel();
            }
            scrollTo(m(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    public void I(ViewPager viewPager, boolean z2) {
        J(viewPager, z2, false);
    }

    /* access modifiers changed from: package-private */
    public void M(boolean z2) {
        for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
            View childAt = this.h.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            L((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        i(view);
    }

    public void addView(View view, int i2) {
        i(view);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    @Deprecated
    public void b(c cVar) {
        if (!this.I.contains(cVar)) {
            this.I.add(cVar);
        }
    }

    public void c(d dVar) {
        b(dVar);
    }

    public void d(g gVar) {
        f(gVar, this.e.isEmpty());
    }

    public void e(g gVar, int i2, boolean z2) {
        if (gVar.h == this) {
            n(gVar, i2);
            h(gVar);
            if (z2) {
                gVar.l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void f(g gVar, boolean z2) {
        e(gVar, this.e.size(), z2);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar.f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.e.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.o;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.p;
    }

    public Drawable getTabSelectedIndicator() {
        return this.q;
    }

    public ColorStateList getTabTextColors() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.e(this);
        if (this.L == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                J((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.Q) {
            setupWithViewPager((ViewPager) null);
            this.Q = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
            View childAt = this.h.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).k(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a5.I0(accessibilityNodeInfo).f0(a5.b.b(1, getTabCount(), false, 1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.r.c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.x
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.r.c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.v = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.D
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public g q() {
        g b2 = T.b();
        return b2 == null ? new g() : b2;
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        sa1.d(this, f2);
    }

    public void setInlineLabel(boolean z2) {
        if (this.E != z2) {
            this.E = z2;
            for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
                View childAt = this.h.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).w();
                }
            }
            l();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.H;
        if (cVar2 != null) {
            B(cVar2);
        }
        this.H = cVar;
        if (cVar != null) {
            b(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        v();
        this.K.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i2) {
        setSelectedTabIndicator(i2 != 0 ? defpackage.f.d(getContext(), i2) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            o4.Z(this.h);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.h.h(i2);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.C != i2) {
            this.C = i2;
            o4.Z(this.h);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.h.i(i2);
    }

    public void setTabGravity(int i2) {
        if (this.A != i2) {
            this.A = i2;
            l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            K();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(defpackage.f.c(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.F = z2;
        o4.Z(this.h);
    }

    public void setTabMode(int i2) {
        if (i2 != this.D) {
            this.D = i2;
            l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
                View childAt = this.h.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).v(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(defpackage.f.c(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            K();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        F(aVar, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.G != z2) {
            this.G = z2;
            for (int i2 = 0; i2 < this.h.getChildCount(); i2++) {
                View childAt = this.h.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).v(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        I(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public g w(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.e.get(i2);
    }

    public g x() {
        g q2 = q();
        q2.h = this;
        q2.i = r(q2);
        return q2;
    }

    /* access modifiers changed from: package-private */
    public void y() {
        int currentItem;
        A();
        androidx.viewpager.widget.a aVar = this.M;
        if (aVar != null) {
            int e2 = aVar.e();
            for (int i2 = 0; i2 < e2; i2++) {
                g x2 = x();
                x2.s(this.M.g(i2));
                f(x2, false);
            }
            ViewPager viewPager = this.L;
            if (viewPager != null && e2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                D(w(currentItem));
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean z(g gVar) {
        return T.c(gVar);
    }
}
