package com.mikepenz.fastadapter.expandable;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.c;
import com.mikepenz.fastadapter.d;
import com.mikepenz.fastadapter.g;
import com.mikepenz.fastadapter.l;
import com.mikepenz.fastadapter.m;
import com.mikepenz.fastadapter.p;
import java.util.ArrayList;
import java.util.List;

public class a<Item extends l> implements d<Item> {
    private b<Item> a;
    private boolean b = false;

    /* renamed from: com.mikepenz.fastadapter.expandable.a$a  reason: collision with other inner class name */
    class C0151a implements km1<Item> {
        c0<l> a = new c0<>();
        final /* synthetic */ int[] b;

        C0151a(a aVar, int[] iArr) {
            this.b = iArr;
        }

        public boolean a(c<Item> cVar, int i, Item item, int i2) {
            l parent;
            if (i2 == -1) {
                return false;
            }
            if (this.a.size() > 0 && (item instanceof p) && ((parent = ((p) item).getParent()) == null || !this.a.contains(parent))) {
                return true;
            }
            if (item instanceof g) {
                g gVar = (g) item;
                if (gVar.g()) {
                    gVar.n(false);
                    if (gVar.i() != null) {
                        int[] iArr = this.b;
                        iArr[0] = iArr[0] + gVar.i().size();
                        this.a.add(item);
                    }
                }
            }
            return false;
        }
    }

    public a() {
        new SparseIntArray();
    }

    public void a(int i, int i2) {
    }

    public boolean b(View view, int i, b<Item> bVar, Item item) {
        return false;
    }

    public void c(int i, int i2) {
    }

    public boolean d(View view, MotionEvent motionEvent, int i, b<Item> bVar, Item item) {
        return false;
    }

    public void e(Bundle bundle, String str) {
        if (bundle != null) {
            ArrayList arrayList = new ArrayList();
            int g = this.a.g();
            for (int i = 0; i < g; i++) {
                Item Y = this.a.Y(i);
                if ((Y instanceof g) && ((g) Y).g()) {
                    arrayList.add(String.valueOf(Y.c()));
                }
            }
            bundle.putStringArrayList("bundle_expanded" + str, arrayList);
        }
    }

    public boolean f(View view, int i, b<Item> bVar, Item item) {
        if (item instanceof g) {
            g gVar = (g) item;
            if (gVar.v() && gVar.i() != null) {
                v(i);
            }
        }
        if (!this.b || !(item instanceof g)) {
            return false;
        }
        g gVar2 = (g) item;
        if (gVar2.i() == null || gVar2.i().size() <= 0) {
            return false;
        }
        int[] t = t(i);
        for (int length = t.length - 1; length >= 0; length--) {
            if (t[length] != i) {
                n(t[length], true);
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ d g(b bVar) {
        u(bVar);
        return this;
    }

    public void h(List<Item> list, boolean z) {
        o(false);
    }

    public void i(Bundle bundle, String str) {
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("bundle_expanded" + str);
            int g = this.a.g();
            for (int i = 0; i < g; i++) {
                String valueOf = String.valueOf(this.a.Y(i).c());
                if (stringArrayList != null && stringArrayList.contains(valueOf)) {
                    p(i);
                    g = this.a.g();
                }
            }
        }
    }

    public void j(CharSequence charSequence) {
        o(false);
    }

    public void k() {
    }

    public void l(int i, int i2, Object obj) {
        for (int i3 = i; i3 < i + i2; i3++) {
            Item Y = this.a.Y(i);
            if ((Y instanceof g) && ((g) Y).g()) {
                m(i);
            }
        }
    }

    public void m(int i) {
        n(i, false);
    }

    public void n(int i, boolean z) {
        int[] iArr = {0};
        this.a.s0(new C0151a(this, iArr), i, true);
        c<Item> R = this.a.R(i);
        if (R != null && (R instanceof m)) {
            ((m) R).g(i + 1, iArr[0]);
        }
        if (z) {
            this.a.m(i);
        }
    }

    public void o(boolean z) {
        int[] r = r();
        for (int length = r.length - 1; length >= 0; length--) {
            n(r[length], z);
        }
    }

    public void p(int i) {
        q(i, false);
    }

    public void q(int i, boolean z) {
        Item Y = this.a.Y(i);
        if (Y != null && (Y instanceof g)) {
            g gVar = (g) Y;
            if (!gVar.g() && gVar.i() != null && gVar.i().size() > 0) {
                c<Item> R = this.a.R(i);
                if (R != null && (R instanceof m)) {
                    ((m) R).c(i + 1, gVar.i());
                }
                gVar.n(true);
                if (z) {
                    this.a.m(i);
                }
            }
        }
    }

    public int[] r() {
        ArrayList arrayList = new ArrayList();
        int g = this.a.g();
        for (int i = 0; i < g; i++) {
            Item Y = this.a.Y(i);
            if ((Y instanceof g) && ((g) Y).g()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public int[] s(int i) {
        c0 c0Var = new c0();
        Item Y = this.a.Y(i);
        int g = this.a.g();
        int i2 = 0;
        while (i2 < g) {
            Item Y2 = this.a.Y(i2);
            if (Y2 instanceof p) {
                Item parent = ((p) Y2).getParent();
                if (parent instanceof g) {
                    g gVar = (g) parent;
                    if (gVar.g()) {
                        i2 += gVar.i().size();
                        if (parent != Y) {
                            c0Var.add(Integer.valueOf(this.a.c0(parent)));
                        }
                    }
                }
            }
            i2++;
        }
        int size = c0Var.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((Integer) c0Var.k(i3)).intValue();
        }
        return iArr;
    }

    public int[] t(int i) {
        Item Y = this.a.Y(i);
        if (!(Y instanceof p)) {
            return s(i);
        }
        l parent = ((p) Y).getParent();
        if (!(parent instanceof g)) {
            return s(i);
        }
        ArrayList arrayList = new ArrayList();
        for (Item next : ((g) parent).i()) {
            if ((next instanceof g) && ((g) next).g() && next != Y) {
                arrayList.add(Integer.valueOf(this.a.c0((l) next)));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public a<Item> u(b<Item> bVar) {
        this.a = bVar;
        return this;
    }

    public void v(int i) {
        Item Y = this.a.Y(i);
        if (!(Y instanceof g) || !((g) Y).g()) {
            p(i);
        } else {
            m(i);
        }
    }
}
