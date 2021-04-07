package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import defpackage.a5;
import java.util.ArrayList;

public class e implements m {
    private NavigationMenuView e;
    LinearLayout f;
    private m.a g;
    androidx.appcompat.view.menu.g h;
    private int i;
    c j;
    LayoutInflater k;
    int l;
    boolean m;
    ColorStateList n;
    ColorStateList o;
    Drawable p;
    int q;
    int r;
    int s;
    boolean t;
    boolean u = true;
    /* access modifiers changed from: private */
    public int v;
    private int w;
    int x;
    private int y = -1;
    final View.OnClickListener z = new a();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            boolean z = true;
            e.this.K(true);
            androidx.appcompat.view.menu.i itemData = ((NavigationMenuItemView) view).getItemData();
            e eVar = e.this;
            boolean O = eVar.h.O(itemData, eVar, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z = false;
            } else {
                e.this.j.Q(itemData);
            }
            e.this.K(false);
            if (z) {
                e.this.g(false);
            }
        }
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    private class c extends RecyclerView.g<l> {
        private final ArrayList<C0102e> c = new ArrayList<>();
        private androidx.appcompat.view.menu.i d;
        private boolean e;

        c() {
            O();
        }

        private void H(int i, int i2) {
            while (i < i2) {
                ((g) this.c.get(i)).b = true;
                i++;
            }
        }

        private void O() {
            if (!this.e) {
                this.e = true;
                this.c.clear();
                this.c.add(new d());
                int i = -1;
                int size = e.this.h.G().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    androidx.appcompat.view.menu.i iVar = e.this.h.G().get(i3);
                    if (iVar.isChecked()) {
                        Q(iVar);
                    }
                    if (iVar.isCheckable()) {
                        iVar.t(false);
                    }
                    if (iVar.hasSubMenu()) {
                        SubMenu subMenu = iVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.c.add(new f(e.this.x, 0));
                            }
                            this.c.add(new g(iVar));
                            int size2 = this.c.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) subMenu.getItem(i4);
                                if (iVar2.isVisible()) {
                                    if (!z2 && iVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (iVar2.isCheckable()) {
                                        iVar2.t(false);
                                    }
                                    if (iVar.isChecked()) {
                                        Q(iVar);
                                    }
                                    this.c.add(new g(iVar2));
                                }
                            }
                            if (z2) {
                                H(size2, this.c.size());
                            }
                        }
                    } else {
                        int groupId = iVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.c.size();
                            z = iVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<C0102e> arrayList = this.c;
                                int i5 = e.this.x;
                                arrayList.add(new f(i5, i5));
                            }
                        } else if (!z && iVar.getIcon() != null) {
                            H(i2, this.c.size());
                            z = true;
                        }
                        g gVar = new g(iVar);
                        gVar.b = z;
                        this.c.add(gVar);
                        i = groupId;
                    }
                }
                this.e = false;
            }
        }

        public Bundle I() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.i iVar = this.d;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                C0102e eVar = this.c.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.i a = ((g) eVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        g gVar = new g();
                        actionView.saveHierarchyState(gVar);
                        sparseArray.put(a.getItemId(), gVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.i J() {
            return this.d;
        }

        /* access modifiers changed from: package-private */
        public int K() {
            int i = e.this.f.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < e.this.j.g(); i2++) {
                if (e.this.j.i(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: L */
        public void w(l lVar, int i) {
            int i2 = i(i);
            if (i2 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.e;
                navigationMenuItemView.setIconTintList(e.this.o);
                e eVar = e.this;
                if (eVar.m) {
                    navigationMenuItemView.setTextAppearance(eVar.l);
                }
                ColorStateList colorStateList = e.this.n;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = e.this.p;
                o4.l0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                g gVar = (g) this.c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
                navigationMenuItemView.setHorizontalPadding(e.this.q);
                navigationMenuItemView.setIconPadding(e.this.r);
                e eVar2 = e.this;
                if (eVar2.t) {
                    navigationMenuItemView.setIconSize(eVar2.s);
                }
                navigationMenuItemView.setMaxLines(e.this.v);
                navigationMenuItemView.e(gVar.a(), 0);
            } else if (i2 == 1) {
                ((TextView) lVar.e).setText(((g) this.c.get(i)).a().getTitle());
            } else if (i2 == 2) {
                f fVar = (f) this.c.get(i);
                lVar.e.setPadding(0, fVar.b(), 0, fVar.a());
            }
        }

        /* renamed from: M */
        public l y(ViewGroup viewGroup, int i) {
            if (i == 0) {
                e eVar = e.this;
                return new i(eVar.k, viewGroup, eVar.z);
            } else if (i == 1) {
                return new k(e.this.k, viewGroup);
            } else {
                if (i == 2) {
                    return new j(e.this.k, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new b(e.this.f);
            }
        }

        /* renamed from: N */
        public void D(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.e).D();
            }
        }

        public void P(Bundle bundle) {
            androidx.appcompat.view.menu.i a;
            View actionView;
            g gVar;
            androidx.appcompat.view.menu.i a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.e = true;
                int size = this.c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C0102e eVar = this.c.get(i2);
                    if ((eVar instanceof g) && (a2 = ((g) eVar).a()) != null && a2.getItemId() == i) {
                        Q(a2);
                        break;
                    }
                    i2++;
                }
                this.e = false;
                O();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0102e eVar2 = this.c.get(i3);
                    if (!(!(eVar2 instanceof g) || (a = ((g) eVar2).a()) == null || (actionView = a.getActionView()) == null || (gVar = (g) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(gVar);
                    }
                }
            }
        }

        public void Q(androidx.appcompat.view.menu.i iVar) {
            if (this.d != iVar && iVar.isCheckable()) {
                androidx.appcompat.view.menu.i iVar2 = this.d;
                if (iVar2 != null) {
                    iVar2.setChecked(false);
                }
                this.d = iVar;
                iVar.setChecked(true);
            }
        }

        public void R(boolean z) {
            this.e = z;
        }

        public void S() {
            O();
            l();
        }

        public int g() {
            return this.c.size();
        }

        public long h(int i) {
            return (long) i;
        }

        public int i(int i) {
            C0102e eVar = this.c.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    private static class d implements C0102e {
        d() {
        }
    }

    /* renamed from: com.google.android.material.internal.e$e  reason: collision with other inner class name */
    private interface C0102e {
    }

    private static class f implements C0102e {
        private final int a;
        private final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    private static class g implements C0102e {
        private final androidx.appcompat.view.menu.i a;
        boolean b;

        g(androidx.appcompat.view.menu.i iVar) {
            this.a = iVar;
        }

        public androidx.appcompat.view.menu.i a() {
            return this.a;
        }
    }

    private class h extends p {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            a5Var.f0(a5.b.a(e.this.j.K(), 0, false));
        }
    }

    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R$layout.design_navigation_item, viewGroup, false));
            this.e.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R$layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R$layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class l extends RecyclerView.c0 {
        public l(View view) {
            super(view);
        }
    }

    private void L() {
        int i2 = (this.f.getChildCount() != 0 || !this.u) ? 0 : this.w;
        NavigationMenuView navigationMenuView = this.e;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public void A(int i2) {
        this.i = i2;
    }

    public void B(Drawable drawable) {
        this.p = drawable;
        g(false);
    }

    public void C(int i2) {
        this.q = i2;
        g(false);
    }

    public void D(int i2) {
        this.r = i2;
        g(false);
    }

    public void E(int i2) {
        if (this.s != i2) {
            this.s = i2;
            this.t = true;
            g(false);
        }
    }

    public void F(ColorStateList colorStateList) {
        this.o = colorStateList;
        g(false);
    }

    public void G(int i2) {
        this.v = i2;
        g(false);
    }

    public void H(int i2) {
        this.l = i2;
        this.m = true;
        g(false);
    }

    public void I(ColorStateList colorStateList) {
        this.n = colorStateList;
        g(false);
    }

    public void J(int i2) {
        this.y = i2;
        NavigationMenuView navigationMenuView = this.e;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void K(boolean z2) {
        c cVar = this.j;
        if (cVar != null) {
            cVar.R(z2);
        }
    }

    public void b(View view) {
        this.f.addView(view);
        NavigationMenuView navigationMenuView = this.e;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void c(androidx.appcompat.view.menu.g gVar, boolean z2) {
        m.a aVar = this.g;
        if (aVar != null) {
            aVar.c(gVar, z2);
        }
    }

    public void d(x4 x4Var) {
        int f2 = x4Var.f();
        if (this.w != f2) {
            this.w = f2;
            L();
        }
        NavigationMenuView navigationMenuView = this.e;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, x4Var.c());
        o4.f(this.f, x4Var);
    }

    public androidx.appcompat.view.menu.i e() {
        return this.j.J();
    }

    public int f() {
        return this.i;
    }

    public void g(boolean z2) {
        c cVar = this.j;
        if (cVar != null) {
            cVar.S();
        }
    }

    public boolean h() {
        return false;
    }

    public boolean i(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    public boolean j(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    public void k(m.a aVar) {
        this.g = aVar;
    }

    public void l(Context context, androidx.appcompat.view.menu.g gVar) {
        this.k = LayoutInflater.from(context);
        this.h = gVar;
        this.x = context.getResources().getDimensionPixelOffset(R$dimen.design_navigation_separator_vertical_padding);
    }

    public void m(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.e.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.j.P(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public int n() {
        return this.f.getChildCount();
    }

    public boolean o(r rVar) {
        return false;
    }

    public Parcelable p() {
        Bundle bundle = new Bundle();
        if (this.e != null) {
            SparseArray sparseArray = new SparseArray();
            this.e.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.j;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.I());
        }
        if (this.f != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public Drawable q() {
        return this.p;
    }

    public int r() {
        return this.q;
    }

    public int s() {
        return this.r;
    }

    public int t() {
        return this.v;
    }

    public ColorStateList u() {
        return this.n;
    }

    public ColorStateList v() {
        return this.o;
    }

    public n w(ViewGroup viewGroup) {
        if (this.e == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.k.inflate(R$layout.design_navigation_menu, viewGroup, false);
            this.e = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.e));
            if (this.j == null) {
                this.j = new c();
            }
            int i2 = this.y;
            if (i2 != -1) {
                this.e.setOverScrollMode(i2);
            }
            this.f = (LinearLayout) this.k.inflate(R$layout.design_navigation_item_header, this.e, false);
            this.e.setAdapter(this.j);
        }
        return this.e;
    }

    public View x(int i2) {
        View inflate = this.k.inflate(i2, this.f, false);
        b(inflate);
        return inflate;
    }

    public void y(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            L();
        }
    }

    public void z(androidx.appcompat.view.menu.i iVar) {
        this.j.Q(iVar);
    }
}
