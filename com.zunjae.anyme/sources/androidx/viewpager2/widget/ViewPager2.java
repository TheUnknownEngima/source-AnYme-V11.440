package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R$styleable;
import defpackage.a5;
import defpackage.d5;

public final class ViewPager2 extends ViewGroup {
    static boolean y = true;
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private b g = new b(3);
    int h;
    boolean i = false;
    private RecyclerView.i j = new a();
    private LinearLayoutManager k;
    private int l = -1;
    private Parcelable m;
    RecyclerView n;
    private androidx.recyclerview.widget.o o;
    e p;
    private b q;
    private c r;
    private d s;
    private RecyclerView.l t = null;
    private boolean u = false;
    private boolean v = true;
    private int w = -1;
    e x;

    class a extends g {
        a() {
            super((a) null);
        }

        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.i = true;
            viewPager2.p.l();
        }
    }

    class b extends i {
        b() {
        }

        public void a(int i) {
            if (i == 0) {
                ViewPager2.this.m();
            }
        }

        public void c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.h != i) {
                viewPager2.h = i;
                viewPager2.x.q();
            }
        }
    }

    class c extends i {
        c() {
        }

        public void c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.n.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.p {
        d(ViewPager2 viewPager2) {
        }

        public void a(View view) {
        }

        public void b(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.width != -1 || layoutParams.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e(ViewPager2 viewPager2) {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this(viewPager2);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(RecyclerView.g<?> gVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(RecyclerView.g<?> gVar) {
        }

        /* access modifiers changed from: package-private */
        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void h(b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        public void j(a5 a5Var) {
        }

        /* access modifiers changed from: package-private */
        public boolean k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void m() {
        }

        /* access modifiers changed from: package-private */
        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public void o(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        public void p() {
        }

        /* access modifiers changed from: package-private */
        public void q() {
        }

        /* access modifiers changed from: package-private */
        public void r() {
        }

        /* access modifiers changed from: package-private */
        public void s() {
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, (a) null);
        }

        public boolean b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.e();
        }

        public boolean d() {
            return true;
        }

        public void j(a5 a5Var) {
            if (!ViewPager2.this.e()) {
                a5Var.U(a5.a.i);
                a5Var.U(a5.a.h);
                a5Var.z0(false);
            }
        }

        public boolean k(int i) {
            if (b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.i {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        public final void b(int i, int i2) {
            a();
        }

        public final void c(int i, int i2, Object obj) {
            a();
        }

        public final void d(int i, int i2) {
            a();
        }

        public final void e(int i, int i2, int i3) {
            a();
        }

        public final void f(int i, int i2) {
            a();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        public boolean A1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        public void U0(RecyclerView.u uVar, RecyclerView.z zVar, a5 a5Var) {
            super.U0(uVar, zVar, a5Var);
            ViewPager2.this.x.j(a5Var);
        }

        /* access modifiers changed from: protected */
        public void V1(RecyclerView.z zVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.V1(zVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public boolean o1(RecyclerView.u uVar, RecyclerView.z zVar, int i, Bundle bundle) {
            return ViewPager2.this.x.b(i) ? ViewPager2.this.x.k(i) : super.o1(uVar, zVar, i, bundle);
        }
    }

    public static abstract class i {
        public void a(int i) {
        }

        public void b(int i, float f, int i2) {
        }

        public void c(int i) {
        }
    }

    class j extends e {
        private final d5 a = new a();
        private final d5 b = new b();
        private RecyclerView.i c;

        class a implements d5 {
            a() {
            }

            public boolean a(View view, d5.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements d5 {
            b() {
            }

            public boolean a(View view, d5.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super((a) null);
            }

            public void a() {
                j.this.w();
            }
        }

        j() {
            super(ViewPager2.this, (a) null);
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().g();
            } else {
                i = ViewPager2.this.getAdapter().g();
                i2 = 0;
                a5.I0(accessibilityNodeInfo).f0(a5.b.b(i2, i, false, 0));
            }
            i = 0;
            a5.I0(accessibilityNodeInfo).f0(a5.b.b(i2, i, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int g;
            RecyclerView.g adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (g = adapter.g()) != 0 && ViewPager2.this.e()) {
                if (ViewPager2.this.h > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.h < g - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        public boolean a() {
            return true;
        }

        public boolean c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        public void e(RecyclerView.g<?> gVar) {
            w();
            if (gVar != null) {
                gVar.E(this.c);
            }
        }

        public void f(RecyclerView.g<?> gVar) {
            if (gVar != null) {
                gVar.G(this.c);
            }
        }

        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public void h(b bVar, RecyclerView recyclerView) {
            o4.s0(recyclerView, 2);
            this.c = new c();
            if (o4.w(ViewPager2.this) == 0) {
                o4.s0(ViewPager2.this, 1);
            }
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                u(accessibilityNodeInfo);
            }
        }

        public boolean l(int i, Bundle bundle) {
            if (c(i, bundle)) {
                v(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        public void m() {
            w();
        }

        public void o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        public void p() {
            w();
        }

        public void q() {
            w();
        }

        public void r() {
            w();
        }

        public void s() {
            w();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.j(i, true);
            }
        }

        /* access modifiers changed from: package-private */
        public void w() {
            int g;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            o4.d0(viewPager2, 16908360);
            o4.d0(viewPager2, 16908361);
            o4.d0(viewPager2, 16908358);
            o4.d0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (g = ViewPager2.this.getAdapter().g()) != 0 && ViewPager2.this.e()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean d2 = ViewPager2.this.d();
                    int i2 = d2 ? 16908360 : 16908361;
                    if (d2) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.h < g - 1) {
                        o4.f0(viewPager2, new a5.a(i2, (CharSequence) null), (CharSequence) null, this.a);
                    }
                    if (ViewPager2.this.h > 0) {
                        o4.f0(viewPager2, new a5.a(i, (CharSequence) null), (CharSequence) null, this.b);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.h < g - 1) {
                    o4.f0(viewPager2, new a5.a(16908359, (CharSequence) null), (CharSequence) null, this.a);
                }
                if (ViewPager2.this.h > 0) {
                    o4.f0(viewPager2, new a5.a(16908358, (CharSequence) null), (CharSequence) null, this.b);
                }
            }
        }
    }

    public interface k {
        void a(View view, float f);
    }

    private class l extends androidx.recyclerview.widget.o {
        l() {
        }

        public View h(RecyclerView.o oVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.x.d() ? ViewPager2.this.x.n() : super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.h);
            accessibilityEvent.setToIndex(ViewPager2.this.h);
            ViewPager2.this.x.o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();
        int e;
        int f;
        Parcelable g;

        static class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new n(parcel, classLoader) : new n(parcel);
            }

            /* renamed from: c */
            public n[] newArray(int i) {
                return new n[i];
            }
        }

        n(Parcel parcel) {
            super(parcel);
            a(parcel, (ClassLoader) null);
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeParcelable(this.g, i);
        }
    }

    private static class o implements Runnable {
        private final int e;
        private final RecyclerView f;

        o(int i, RecyclerView recyclerView) {
            this.e = i;
            this.f = recyclerView;
        }

        public void run() {
            this.f.r1(this.e);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b(context, attributeSet);
    }

    private RecyclerView.p a() {
        return new d(this);
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.x = y ? new j() : new f();
        m mVar = new m(context);
        this.n = mVar;
        mVar.setId(o4.i());
        this.n.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.k = hVar;
        this.n.setLayoutManager(hVar);
        this.n.setScrollingTouchSlop(1);
        k(context, attributeSet);
        this.n.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.n.j(a());
        e eVar = new e(this);
        this.p = eVar;
        this.r = new c(this, eVar, this.n);
        l lVar = new l();
        this.o = lVar;
        lVar.b(this.n);
        this.n.l(this.p);
        b bVar = new b(3);
        this.q = bVar;
        this.p.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.q.d(bVar2);
        this.q.d(cVar);
        this.x.h(this.q, this.n);
        this.q.d(this.g);
        d dVar = new d(this.k);
        this.s = dVar;
        this.q.d(dVar);
        RecyclerView recyclerView = this.n;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.E(this.j);
        }
    }

    private void h() {
        RecyclerView.g adapter;
        if (this.l != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.m;
            if (parcelable != null) {
                if (adapter instanceof androidx.viewpager2.adapter.c) {
                    ((androidx.viewpager2.adapter.c) adapter).c(parcelable);
                }
                this.m = null;
            }
            int max = Math.max(0, Math.min(this.l, adapter.g() - 1));
            this.h = max;
            this.l = -1;
            this.n.j1(max);
            this.x.m();
        }
    }

    private void k(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewPager2);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, R$styleable.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(R$styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void l(RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.G(this.j);
        }
    }

    public boolean c() {
        return this.r.a();
    }

    public boolean canScrollHorizontally(int i2) {
        return this.n.canScrollHorizontally(i2);
    }

    public boolean canScrollVertically(int i2) {
        return this.n.canScrollVertically(i2);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.k.j0() == 1;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i2 = ((n) parcelable).e;
            sparseArray.put(this.n.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        h();
    }

    public boolean e() {
        return this.v;
    }

    public void g() {
        if (this.s.d() != null) {
            double g2 = this.p.g();
            int i2 = (int) g2;
            float f2 = (float) (g2 - ((double) i2));
            this.s.b(i2, f2, Math.round(((float) getPageSize()) * f2));
        }
    }

    public CharSequence getAccessibilityClassName() {
        return this.x.a() ? this.x.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.g getAdapter() {
        return this.n.getAdapter();
    }

    public int getCurrentItem() {
        return this.h;
    }

    public int getItemDecorationCount() {
        return this.n.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.w;
    }

    public int getOrientation() {
        return this.k.z2();
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int i2;
        int i3;
        RecyclerView recyclerView = this.n;
        if (getOrientation() == 0) {
            i2 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i3 = recyclerView.getPaddingRight();
        } else {
            i2 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i3 = recyclerView.getPaddingBottom();
        }
        return i2 - i3;
    }

    public int getScrollState() {
        return this.p.h();
    }

    public void i(int i2, boolean z) {
        if (!c()) {
            j(i2, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    public void j(int i2, boolean z) {
        RecyclerView.g adapter = getAdapter();
        if (adapter == null) {
            if (this.l != -1) {
                this.l = Math.max(i2, 0);
            }
        } else if (adapter.g() > 0) {
            int min = Math.min(Math.max(i2, 0), adapter.g() - 1);
            if (min == this.h && this.p.j()) {
                return;
            }
            if (min != this.h || !z) {
                double d2 = (double) this.h;
                this.h = min;
                this.x.q();
                if (!this.p.j()) {
                    d2 = this.p.g();
                }
                this.p.m(min, z);
                if (!z) {
                    this.n.j1(min);
                    return;
                }
                double d3 = (double) min;
                if (Math.abs(d3 - d2) > 3.0d) {
                    this.n.j1(d3 > d2 ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.n;
                    recyclerView.post(new o(min, recyclerView));
                    return;
                }
                this.n.r1(min);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        androidx.recyclerview.widget.o oVar = this.o;
        if (oVar != null) {
            View h2 = oVar.h(this.k);
            if (h2 != null) {
                int n0 = this.k.n0(h2);
                if (n0 != this.h && getScrollState() == 0) {
                    this.q.c(n0);
                }
                this.i = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.x.i(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.n.getMeasuredWidth();
        int measuredHeight = this.n.getMeasuredHeight();
        this.e.left = getPaddingLeft();
        this.e.right = (i4 - i2) - getPaddingRight();
        this.e.top = getPaddingTop();
        this.e.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.e, this.f);
        RecyclerView recyclerView = this.n;
        Rect rect = this.f;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.i) {
            m();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        measureChild(this.n, i2, i3);
        int measuredWidth = this.n.getMeasuredWidth();
        int measuredHeight = this.n.getMeasuredHeight();
        int measuredState = this.n.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.l = nVar.f;
        this.m = nVar.g;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.e = this.n.getId();
        int i2 = this.l;
        if (i2 == -1) {
            i2 = this.h;
        }
        nVar.f = i2;
        Parcelable parcelable = this.m;
        if (parcelable == null) {
            RecyclerView.g adapter = this.n.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.c) {
                parcelable = ((androidx.viewpager2.adapter.c) adapter).a();
            }
            return nVar;
        }
        nVar.g = parcelable;
        return nVar;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        return this.x.c(i2, bundle) ? this.x.l(i2, bundle) : super.performAccessibilityAction(i2, bundle);
    }

    public void setAdapter(RecyclerView.g gVar) {
        RecyclerView.g adapter = this.n.getAdapter();
        this.x.f(adapter);
        l(adapter);
        this.n.setAdapter(gVar);
        this.h = 0;
        h();
        this.x.e(gVar);
        f(gVar);
    }

    public void setCurrentItem(int i2) {
        i(i2, true);
    }

    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.x.p();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 >= 1 || i2 == -1) {
            this.w = i2;
            this.n.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i2) {
        this.k.M2(i2);
        this.x.r();
    }

    public void setPageTransformer(k kVar) {
        boolean z = this.u;
        if (kVar != null) {
            if (!z) {
                this.t = this.n.getItemAnimator();
                this.u = true;
            }
            this.n.setItemAnimator((RecyclerView.l) null);
        } else if (z) {
            this.n.setItemAnimator(this.t);
            this.t = null;
            this.u = false;
        }
        if (kVar != this.s.d()) {
            this.s.e(kVar);
            g();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.v = z;
        this.x.s();
    }
}
