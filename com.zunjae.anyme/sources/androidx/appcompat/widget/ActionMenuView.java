package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.github.mikephil.charting.utils.Utils;

public class ActionMenuView extends LinearLayoutCompat implements g.b, n {
    private boolean A;
    private int B;
    private int C;
    private int D;
    d E;
    private g t;
    private Context u;
    private int v;
    private boolean w;
    private c x;
    private m.a y;
    g.a z;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty
        public boolean c;
        @ViewDebug.ExportedProperty
        public int d;
        @ViewDebug.ExportedProperty
        public int e;
        @ViewDebug.ExportedProperty
        public boolean f;
        @ViewDebug.ExportedProperty
        public boolean g;
        boolean h;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.c = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.c = layoutParams.c;
        }
    }

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements m.a {
        b() {
        }

        public void c(g gVar, boolean z) {
        }

        public boolean d(g gVar) {
            return false;
        }
    }

    private class c implements g.a {
        c() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            d dVar = ActionMenuView.this.E;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.z;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f);
        this.D = (int) (f * 4.0f);
        this.u = context;
        this.v = 0;
    }

    static int L(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.f();
        int i5 = 2;
        if (i2 <= 0 || (z3 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z3 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.c || !z3) {
            z2 = false;
        }
        layoutParams.f = z2;
        layoutParams.d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    private void M(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.C;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z6 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z7) {
                    int i19 = this.D;
                    i6 = i18;
                    z5 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z5 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.h = z5;
                layoutParams.e = z5 ? 1 : 0;
                layoutParams.d = z5;
                layoutParams.f = z5;
                layoutParams.leftMargin = z5;
                layoutParams.rightMargin = z5;
                layoutParams.g = z7 && ((ActionMenuItemView) childAt).f();
                int L = L(childAt, i11, layoutParams.c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (layoutParams.f) {
                    i16++;
                }
                if (layoutParams.c) {
                    z6 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z2 = z9;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z10 = z9;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (layoutParams2.f) {
                        int i26 = layoutParams2.d;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z9 = z10;
                }
                z2 = z9;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.d == i27) {
                            j |= j3;
                        }
                        z4 = z8;
                    } else {
                        if (!z8 || !layoutParams3.g || i9 != 1) {
                            z4 = z8;
                        } else {
                            int i31 = this.D;
                            z4 = z8;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        layoutParams3.d++;
                        layoutParams3.h = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z8 = z4;
                }
                i12 = i4;
                z9 = true;
            }
        }
        boolean z11 = !z6 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z11 && i15 <= 1)) {
            z3 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((LayoutParams) getChildAt(i32).getLayoutParams()).g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > Utils.FLOAT_EPSILON ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z3 = z2;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.e = i33;
                        layoutParams4.h = true;
                        if (i34 == 0 && !layoutParams4.g) {
                            layoutParams4.leftMargin = (-i33) / 2;
                        }
                    } else if (layoutParams4.c) {
                        layoutParams4.e = i33;
                        layoutParams4.h = true;
                        layoutParams4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            layoutParams4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            layoutParams4.rightMargin = i33 / 2;
                        }
                    }
                    z3 = true;
                }
            }
        }
        if (z3) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.d * i11) + layoutParams5.e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    public void B() {
        c cVar = this.x;
        if (cVar != null) {
            cVar.B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public LayoutParams m() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.b = 16;
        return layoutParams;
    }

    /* renamed from: D */
    public LayoutParams n(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public LayoutParams o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.b <= 0) {
            layoutParams2.b = 16;
        }
        return layoutParams2;
    }

    public LayoutParams F() {
        LayoutParams C2 = m();
        C2.c = true;
        return C2;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).b();
    }

    public boolean H() {
        c cVar = this.x;
        return cVar != null && cVar.E();
    }

    public boolean I() {
        c cVar = this.x;
        return cVar != null && cVar.G();
    }

    public boolean J() {
        c cVar = this.x;
        return cVar != null && cVar.H();
    }

    public boolean K() {
        return this.w;
    }

    public g N() {
        return this.t;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.y = aVar;
        this.z = aVar2;
    }

    public boolean P() {
        c cVar = this.x;
        return cVar != null && cVar.N();
    }

    public boolean a(i iVar) {
        return this.t.N(iVar, 0);
    }

    public void b(g gVar) {
        this.t = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.t == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.t = gVar;
            gVar.V(new c());
            c cVar = new c(context);
            this.x = cVar;
            cVar.M(true);
            c cVar2 = this.x;
            m.a aVar = this.y;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.k(aVar);
            this.t.c(this.x, this.u);
            this.x.K(this);
        }
        return this.t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.x.D();
    }

    public int getPopupTheme() {
        return this.v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.x;
        if (cVar != null) {
            cVar.g(false);
            if (this.x.H()) {
                this.x.E();
                this.x.N();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.A) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = m0.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    boolean G = G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.c) {
                    int i17 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.c) {
                int i20 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        g gVar;
        boolean z2 = this.A;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.A = z3;
        if (z2 != z3) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.A || (gVar = this.t) == null || size == this.B)) {
            this.B = size;
            gVar.M(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.x.J(z2);
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.E = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.x.L(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.w = z2;
    }

    public void setPopupTheme(int i) {
        if (this.v != i) {
            this.v = i;
            if (i == 0) {
                this.u = getContext();
            } else {
                this.u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.x = cVar;
        cVar.K(this);
    }
}
