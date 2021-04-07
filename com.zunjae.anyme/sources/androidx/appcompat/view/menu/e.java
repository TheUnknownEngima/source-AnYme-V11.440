package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {
    Context e;
    LayoutInflater f;
    g g;
    ExpandedMenuView h;
    int i;
    int j;
    int k;
    private m.a l;
    a m;
    private int n;

    private class a extends BaseAdapter {
        private int e = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i x = e.this.g.x();
            if (x != null) {
                ArrayList<i> B = e.this.g.B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.e = i;
                        return;
                    }
                }
            }
            this.e = -1;
        }

        /* renamed from: b */
        public i getItem(int i) {
            ArrayList<i> B = e.this.g.B();
            int i2 = i + e.this.i;
            int i3 = this.e;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        public int getCount() {
            int size = e.this.g.B().size() - e.this.i;
            return this.e < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f.inflate(eVar.k, viewGroup, false);
            }
            ((n.a) view).e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i2, int i3) {
        this.k = i2;
        this.j = i3;
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.e = context;
        this.f = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.m == null) {
            this.m = new a();
        }
        return this.m;
    }

    public n b(ViewGroup viewGroup) {
        if (this.h == null) {
            this.h = (ExpandedMenuView) this.f.inflate(R$layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.m == null) {
                this.m = new a();
            }
            this.h.setAdapter(this.m);
            this.h.setOnItemClickListener(this);
        }
        return this.h;
    }

    public void c(g gVar, boolean z) {
        m.a aVar = this.l;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    public void d(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.h.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void e(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.h;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public int f() {
        return this.n;
    }

    public void g(boolean z) {
        a aVar = this.m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public void k(m.a aVar) {
        this.l = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.j
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.j
            r0.<init>(r3, r1)
            r2.e = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.e
            if (r0 == 0) goto L_0x0023
            r2.e = r3
            android.view.LayoutInflater r0 = r2.f
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.g = r4
            androidx.appcompat.view.menu.e$a r3 = r2.m
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.l(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    public void m(Parcelable parcelable) {
        d((Bundle) parcelable);
    }

    public boolean o(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).b((IBinder) null);
        m.a aVar = this.l;
        if (aVar == null) {
            return true;
        }
        aVar.d(rVar);
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.g.O(this.m.getItem(i2), this, 0);
    }

    public Parcelable p() {
        if (this.h == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        e(bundle);
        return bundle;
    }
}
