package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import defpackage.x3;
import java.util.ArrayList;

class c extends androidx.appcompat.view.menu.b implements x3.a {
    private final SparseBooleanArray A = new SparseBooleanArray();
    e B;
    a C;
    C0010c D;
    private b E;
    final f F = new f();
    int G;
    d n;
    private Drawable o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    private class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, R$attr.actionOverflowMenuStyle);
            if (!((i) rVar.getItem()).l()) {
                View view2 = c.this.n;
                f(view2 == null ? (View) c.this.l : view2);
            }
            j(c.this.F);
        }

        /* access modifiers changed from: protected */
        public void e() {
            c cVar = c.this;
            cVar.C = null;
            cVar.G = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        public p a() {
            a aVar = c.this.C;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    private class C0010c implements Runnable {
        private e e;

        public C0010c(e eVar) {
            this.e = eVar;
        }

        public void run() {
            if (c.this.g != null) {
                c.this.g.d();
            }
            View view = (View) c.this.l;
            if (!(view == null || view.getWindowToken() == null || !this.e.m())) {
                c.this.B = this.e;
            }
            c.this.D = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends t {
            a(View view, c cVar) {
                super(view);
            }

            public p b() {
                e eVar = c.this.B;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                c.this.N();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.D != null) {
                    return false;
                }
                cVar.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R$attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            i0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.N();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z) {
            super(context, gVar, view, z, R$attr.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.F);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (c.this.g != null) {
                c.this.g.close();
            }
            c.this.B = null;
            super.e();
        }
    }

    private class f implements m.a {
        f() {
        }

        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.F().e(false);
            }
            m.a q = c.this.q();
            if (q != null) {
                q.c(gVar, z);
            }
        }

        public boolean d(androidx.appcompat.view.menu.g gVar) {
            if (gVar == null) {
                return false;
            }
            c.this.G = ((r) gVar).getItem().getItemId();
            m.a q = c.this.q();
            if (q != null) {
                return q.d(gVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int e;

        static class a implements Parcelable.Creator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            /* renamed from: b */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        g() {
        }

        g(Parcel parcel) {
            this.e = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.e);
        }
    }

    public c(Context context) {
        super(context, R$layout.abc_action_menu_layout, R$layout.abc_action_menu_item_layout);
    }

    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.p) {
            return this.o;
        }
        return null;
    }

    public boolean E() {
        n nVar;
        C0010c cVar = this.D;
        if (cVar == null || (nVar = this.l) == null) {
            e eVar = this.B;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.D = null;
        return true;
    }

    public boolean F() {
        a aVar = this.C;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean G() {
        return this.D != null || H();
    }

    public boolean H() {
        e eVar = this.B;
        return eVar != null && eVar.d();
    }

    public void I(Configuration configuration) {
        if (!this.v) {
            this.u = m.b(this.f).d();
        }
        androidx.appcompat.view.menu.g gVar = this.g;
        if (gVar != null) {
            gVar.M(true);
        }
    }

    public void J(boolean z2) {
        this.y = z2;
    }

    public void K(ActionMenuView actionMenuView) {
        this.l = actionMenuView;
        actionMenuView.b(this.g);
    }

    public void L(Drawable drawable) {
        d dVar = this.n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.p = true;
        this.o = drawable;
    }

    public void M(boolean z2) {
        this.q = z2;
        this.r = true;
    }

    public boolean N() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.q || H() || (gVar = this.g) == null || this.l == null || this.D != null || gVar.B().isEmpty()) {
            return false;
        }
        C0010c cVar = new C0010c(new e(this.f, this.g, this.n, true));
        this.D = cVar;
        ((View) this.l).post(cVar);
        super.o((r) null);
        return true;
    }

    public void a(boolean z2) {
        if (z2) {
            super.o((r) null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.g;
        if (gVar != null) {
            gVar.e(false);
        }
    }

    public void c(androidx.appcompat.view.menu.g gVar, boolean z2) {
        B();
        super.c(gVar, z2);
    }

    public void d(i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.l);
        if (this.E == null) {
            this.E = new b();
        }
        actionMenuItemView.setPopupCallback(this.E);
    }

    public void g(boolean z2) {
        n nVar;
        super.g(z2);
        ((View) this.l).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.g;
        boolean z3 = false;
        if (gVar != null) {
            ArrayList<i> u2 = gVar.u();
            int size = u2.size();
            for (int i = 0; i < size; i++) {
                x3 b2 = u2.get(i).b();
                if (b2 != null) {
                    b2.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.g;
        ArrayList<i> B2 = gVar2 != null ? gVar2.B() : null;
        if (this.q && B2 != null) {
            int size2 = B2.size();
            if (size2 == 1) {
                z3 = !B2.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.n;
        if (z3) {
            if (dVar == null) {
                this.n = new d(this.e);
            }
            ViewGroup viewGroup = (ViewGroup) this.n.getParent();
            if (viewGroup != this.l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.l;
                actionMenuView.addView(this.n, actionMenuView.F());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.l)) {
            ((ViewGroup) nVar).removeView(this.n);
        }
        ((ActionMenuView) this.l).setOverflowReserved(this.q);
    }

    public boolean h() {
        int i;
        ArrayList<i> arrayList;
        int i2;
        int i3;
        int i4;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.g;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.u;
        int i7 = cVar.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.l;
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i iVar = arrayList.get(i10);
            if (iVar.o()) {
                i8++;
            } else if (iVar.n()) {
                i9++;
            } else {
                z2 = true;
            }
            if (cVar.y && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.q && (z2 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.A;
        sparseBooleanArray.clear();
        if (cVar.w) {
            int i12 = cVar.z;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            i iVar2 = arrayList.get(i13);
            if (iVar2.o()) {
                View r2 = cVar.r(iVar2, view, viewGroup);
                if (cVar.w) {
                    i2 -= ActionMenuView.L(r2, i3, i2, makeMeasureSpec, i5);
                } else {
                    r2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r2.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i4 = i;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i11 > 0 || z3) && i7 > 0 && (!cVar.w || i2 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View r3 = cVar.r(iVar2, (View) null, viewGroup);
                    if (cVar.w) {
                        int L = ActionMenuView.L(r3, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z5 = false;
                        }
                    } else {
                        r3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = r3.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z4 = z6 & (!cVar.w ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i11++;
                            }
                            iVar3.u(false);
                        }
                        i15++;
                    }
                }
                if (z4) {
                    i11--;
                }
                iVar2.u(z4);
            } else {
                i4 = i;
                iVar2.u(false);
                i13++;
                view = null;
                cVar = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            cVar = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    public void l(Context context, androidx.appcompat.view.menu.g gVar) {
        super.l(context, gVar);
        Resources resources = context.getResources();
        m b2 = m.b(context);
        if (!this.r) {
            this.q = b2.h();
        }
        if (!this.x) {
            this.s = b2.c();
        }
        if (!this.v) {
            this.u = b2.d();
        }
        int i = this.s;
        if (this.q) {
            if (this.n == null) {
                d dVar = new d(this.e);
                this.n = dVar;
                if (this.p) {
                    dVar.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = i;
        this.z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void m(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).e) > 0 && (findItem = this.g.findItem(i)) != null) {
            o((r) findItem.getSubMenu());
        }
    }

    public boolean n(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.n) {
            return false;
        }
        return super.n(viewGroup, i);
    }

    public boolean o(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.i0() != this.g) {
            rVar2 = (r) rVar2.i0();
        }
        View C2 = C(rVar2.getItem());
        if (C2 == null) {
            return false;
        }
        this.G = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.f, rVar, C2);
        this.C = aVar;
        aVar.g(z2);
        this.C.k();
        super.o(rVar);
        return true;
    }

    public Parcelable p() {
        g gVar = new g();
        gVar.e = this.G;
        return gVar;
    }

    public View r(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.r(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public n s(ViewGroup viewGroup) {
        n nVar = this.l;
        n s2 = super.s(viewGroup);
        if (nVar != s2) {
            ((ActionMenuView) s2).setPresenter(this);
        }
        return s2;
    }

    public boolean u(int i, i iVar) {
        return iVar.l();
    }
}
