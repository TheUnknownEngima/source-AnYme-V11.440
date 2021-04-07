package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class t {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    private static final v b = (Build.VERSION.SDK_INT >= 21 ? new u() : null);
    private static final v c = x();

    static class a implements Runnable {
        final /* synthetic */ g e;
        final /* synthetic */ Fragment f;
        final /* synthetic */ b3 g;

        a(g gVar, Fragment fragment, b3 b3Var) {
            this.e = gVar;
            this.f = fragment;
            this.g = b3Var;
        }

        public void run() {
            this.e.a(this.f, this.g);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ ArrayList e;

        b(ArrayList arrayList) {
            this.e = arrayList;
        }

        public void run() {
            t.B(this.e, 4);
        }
    }

    static class c implements Runnable {
        final /* synthetic */ g e;
        final /* synthetic */ Fragment f;
        final /* synthetic */ b3 g;

        c(g gVar, Fragment fragment, b3 b3Var) {
            this.e = gVar;
            this.f = fragment;
            this.g = b3Var;
        }

        public void run() {
            this.e.a(this.f, this.g);
        }
    }

    static class d implements Runnable {
        final /* synthetic */ Object e;
        final /* synthetic */ v f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ ArrayList i;
        final /* synthetic */ ArrayList j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;

        d(Object obj, v vVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.e = obj;
            this.f = vVar;
            this.g = view;
            this.h = fragment;
            this.i = arrayList;
            this.j = arrayList2;
            this.k = arrayList3;
            this.l = obj2;
        }

        public void run() {
            Object obj = this.e;
            if (obj != null) {
                this.f.p(obj, this.g);
                this.j.addAll(t.k(this.f, this.e, this.h, this.i, this.g));
            }
            if (this.k != null) {
                if (this.l != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.g);
                    this.f.q(this.l, this.k, arrayList);
                }
                this.k.clear();
                this.k.add(this.g);
            }
        }
    }

    static class e implements Runnable {
        final /* synthetic */ Fragment e;
        final /* synthetic */ Fragment f;
        final /* synthetic */ boolean g;
        final /* synthetic */ b0 h;
        final /* synthetic */ View i;
        final /* synthetic */ v j;
        final /* synthetic */ Rect k;

        e(Fragment fragment, Fragment fragment2, boolean z, b0 b0Var, View view, v vVar, Rect rect) {
            this.e = fragment;
            this.f = fragment2;
            this.g = z;
            this.h = b0Var;
            this.i = view;
            this.j = vVar;
            this.k = rect;
        }

        public void run() {
            t.f(this.e, this.f, this.g, this.h, false);
            View view = this.i;
            if (view != null) {
                this.j.k(view, this.k);
            }
        }
    }

    static class f implements Runnable {
        final /* synthetic */ v e;
        final /* synthetic */ b0 f;
        final /* synthetic */ Object g;
        final /* synthetic */ h h;
        final /* synthetic */ ArrayList i;
        final /* synthetic */ View j;
        final /* synthetic */ Fragment k;
        final /* synthetic */ Fragment l;
        final /* synthetic */ boolean m;
        final /* synthetic */ ArrayList n;
        final /* synthetic */ Object o;
        final /* synthetic */ Rect p;

        f(v vVar, b0 b0Var, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.e = vVar;
            this.f = b0Var;
            this.g = obj;
            this.h = hVar;
            this.i = arrayList;
            this.j = view;
            this.k = fragment;
            this.l = fragment2;
            this.m = z;
            this.n = arrayList2;
            this.o = obj2;
            this.p = rect;
        }

        public void run() {
            b0<String, View> h2 = t.h(this.e, this.f, this.g, this.h);
            if (h2 != null) {
                this.i.addAll(h2.values());
                this.i.add(this.j);
            }
            t.f(this.k, this.l, this.m, h2, false);
            Object obj = this.g;
            if (obj != null) {
                this.e.A(obj, this.n, this.i);
                View t = t.t(h2, this.h, this.o, this.m);
                if (t != null) {
                    this.e.k(t, this.p);
                }
            }
        }
    }

    interface g {
        void a(Fragment fragment, b3 b3Var);

        void b(Fragment fragment, b3 b3Var);
    }

    static class h {
        public Fragment a;
        public boolean b;
        public a c;
        public Fragment d;
        public boolean e;
        public a f;

        h() {
        }
    }

    private static void A(v vVar, Object obj, Object obj2, b0<String, View> b0Var, boolean z, a aVar) {
        ArrayList<String> arrayList = aVar.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = b0Var.get((z ? aVar.o : aVar.n).get(0));
            vVar.v(obj, view);
            if (obj2 != null) {
                vVar.v(obj2, view);
            }
        }
    }

    static void B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    static void C(k kVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        k kVar2 = kVar;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (kVar2.n >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                a aVar = arrayList3.get(i4);
                if (arrayList4.get(i4).booleanValue()) {
                    e(aVar, sparseArray, z2);
                } else {
                    c(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(kVar2.o.g());
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    b0<String, String> d2 = d(keyAt, arrayList3, arrayList4, i, i3);
                    h hVar = (h) sparseArray.valueAt(i5);
                    k kVar3 = kVar;
                    View view2 = view;
                    g gVar2 = gVar;
                    if (z2) {
                        o(kVar3, keyAt, hVar, view2, d2, gVar2);
                    } else {
                        n(kVar3, keyAt, hVar, view2, d2, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, b0<String, View> b0Var, Collection<String> collection) {
        for (int size = b0Var.size() - 1; size >= 0; size--) {
            View m = b0Var.m(size);
            if (collection.contains(o4.F(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.o != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.C == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.s.a r9, android.util.SparseArray<androidx.fragment.app.t.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.A
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = a
            int r9 = r9.a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.P
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.o
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.C
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.P
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.o
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.C
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.o
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.o
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.K
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.Q
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.O
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.o
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0090:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.t$h r6 = (androidx.fragment.app.t.h) r6
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.t$h r6 = p(r6, r10, r1)
            r6.a = r0
            r6.b = r11
            r6.c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r9 == 0) goto L_0x00c3
            if (r6 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r9 = r6.d
            if (r9 != r0) goto L_0x00af
            r6.d = r2
        L_0x00af:
            androidx.fragment.app.k r9 = r8.r
            int r7 = r0.e
            if (r7 >= r3) goto L_0x00c3
            int r7 = r9.n
            if (r7 < r3) goto L_0x00c3
            boolean r7 = r8.p
            if (r7 != 0) goto L_0x00c3
            r9.y0(r0)
            r9.E0(r0, r3)
        L_0x00c3:
            if (r5 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r9 = r6.d
            if (r9 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.t$h r6 = p(r6, r10, r1)
            r6.d = r0
            r6.e = r11
            r6.f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r6.a
            if (r8 != r0) goto L_0x00e1
            r6.a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.b(androidx.fragment.app.a, androidx.fragment.app.s$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.a.get(i), sparseArray, false, z);
        }
    }

    private static b0<String, String> d(int i, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b0<String, String> b0Var = new b0<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            a aVar = arrayList.get(i4);
            if (aVar.E(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.n;
                        arrayList4 = aVar.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar.n;
                        arrayList3 = aVar.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = b0Var.remove(str2);
                        if (remove != null) {
                            b0Var.put(str, remove);
                        } else {
                            b0Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return b0Var;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.r.p.e()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, b0<String, View> b0Var, boolean z2) {
        m w = z ? fragment2.w() : fragment.w();
        if (w != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = b0Var == null ? 0 : b0Var.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(b0Var.i(i));
                arrayList.add(b0Var.m(i));
            }
            if (z2) {
                w.c(arrayList2, arrayList, (List<View>) null);
            } else {
                w.b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    private static boolean g(v vVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!vVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static b0<String, View> h(v vVar, b0<String, String> b0Var, Object obj, h hVar) {
        m mVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.a;
        View Q = fragment.Q();
        if (b0Var.isEmpty() || obj == null || Q == null) {
            b0Var.clear();
            return null;
        }
        b0<String, View> b0Var2 = new b0<>();
        vVar.j(b0Var2, Q);
        a aVar = hVar.c;
        if (hVar.b) {
            mVar = fragment.y();
            arrayList = aVar.n;
        } else {
            mVar = fragment.w();
            arrayList = aVar.o;
        }
        if (arrayList != null) {
            b0Var2.o(arrayList);
            b0Var2.o(b0Var.values());
        }
        if (mVar != null) {
            mVar.a(arrayList, b0Var2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = b0Var2.get(str);
                if (view == null) {
                    String q2 = q(b0Var, str);
                    if (q2 != null) {
                        b0Var.remove(q2);
                    }
                } else if (!str.equals(o4.F(view)) && (q = q(b0Var, str)) != null) {
                    b0Var.put(q, o4.F(view));
                }
            }
        } else {
            y(b0Var, b0Var2);
        }
        return b0Var2;
    }

    private static b0<String, View> i(v vVar, b0<String, String> b0Var, Object obj, h hVar) {
        m mVar;
        ArrayList<String> arrayList;
        if (b0Var.isEmpty() || obj == null) {
            b0Var.clear();
            return null;
        }
        Fragment fragment = hVar.d;
        b0<String, View> b0Var2 = new b0<>();
        vVar.j(b0Var2, fragment.p1());
        a aVar = hVar.f;
        if (hVar.e) {
            mVar = fragment.w();
            arrayList = aVar.o;
        } else {
            mVar = fragment.y();
            arrayList = aVar.n;
        }
        if (arrayList != null) {
            b0Var2.o(arrayList);
        }
        if (mVar != null) {
            mVar.a(arrayList, b0Var2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = b0Var2.get(str);
                if (view == null) {
                    b0Var.remove(str);
                } else if (!str.equals(o4.F(view))) {
                    b0Var.put(o4.F(view), b0Var.remove(str));
                }
            }
        } else {
            b0Var.o(b0Var2.keySet());
        }
        return b0Var2;
    }

    private static v j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object x = fragment.x();
            if (x != null) {
                arrayList.add(x);
            }
            Object K = fragment.K();
            if (K != null) {
                arrayList.add(K);
            }
            Object M = fragment.M();
            if (M != null) {
                arrayList.add(M);
            }
        }
        if (fragment2 != null) {
            Object v = fragment2.v();
            if (v != null) {
                arrayList.add(v);
            }
            Object H = fragment2.H();
            if (H != null) {
                arrayList.add(H);
            }
            Object L = fragment2.L();
            if (L != null) {
                arrayList.add(L);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        v vVar = b;
        if (vVar != null && g(vVar, arrayList)) {
            return b;
        }
        v vVar2 = c;
        if (vVar2 != null && g(vVar2, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View Q = fragment.Q();
        if (Q != null) {
            vVar.f(arrayList2, Q);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        vVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(v vVar, ViewGroup viewGroup, View view, b0<String, String> b0Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        b0<String, String> b0Var2;
        Object obj3;
        Object obj4;
        Rect rect;
        v vVar2 = vVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.b;
        if (b0Var.isEmpty()) {
            b0Var2 = b0Var;
            obj3 = null;
        } else {
            obj3 = u(vVar2, fragment, fragment2, z);
            b0Var2 = b0Var;
        }
        b0<String, View> i = i(vVar2, b0Var2, obj3, hVar2);
        if (b0Var.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            vVar2.z(obj4, view, arrayList3);
            A(vVar, obj4, obj2, i, hVar2.e, hVar2.f);
            if (obj5 != null) {
                vVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(vVar, b0Var, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        l4.a(viewGroup, fVar);
        return obj4;
    }

    private static Object m(v vVar, ViewGroup viewGroup, View view, b0<String, String> b0Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        v vVar2 = vVar;
        View view3 = view;
        b0<String, String> b0Var2 = b0Var;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.a;
        Fragment fragment2 = hVar2.d;
        if (fragment != null) {
            fragment.p1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.b;
        Object u = b0Var.isEmpty() ? null : u(vVar, fragment, fragment2, z);
        b0<String, View> i = i(vVar, b0Var2, u, hVar2);
        b0<String, View> h2 = h(vVar, b0Var2, u, hVar2);
        if (b0Var.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList3, i, b0Var.keySet());
            a(arrayList4, h2, b0Var.values());
            obj3 = u;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            vVar.z(obj3, view3, arrayList3);
            A(vVar, obj3, obj2, i, hVar2.e, hVar2.f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar2, obj4, z);
            if (t != null) {
                vVar.u(obj4, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        l4.a(viewGroup, new e(fragment, fragment2, z, h2, view2, vVar, rect));
        return obj3;
    }

    private static void n(k kVar, int i, h hVar, View view, b0<String, String> b0Var, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        v j;
        Object obj;
        k kVar2 = kVar;
        h hVar2 = hVar;
        View view2 = view;
        b0<String, String> b0Var2 = b0Var;
        g gVar2 = gVar;
        ViewGroup viewGroup = kVar2.p.e() ? (ViewGroup) kVar2.p.d(i) : null;
        if (viewGroup != null && (j = j(fragment2, fragment)) != null) {
            boolean z = hVar2.b;
            boolean z2 = hVar2.e;
            Object r = r(j, (fragment = hVar2.a), z);
            Object s = s(j, (fragment2 = hVar2.d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            Object obj3 = r;
            v vVar = j;
            Fragment fragment3 = fragment2;
            Object l = l(j, viewGroup, view, b0Var, hVar, arrayList3, arrayList2, obj3, obj2);
            Object obj4 = obj3;
            if (obj4 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = k(vVar, obj, fragment3, arrayList4, view2);
            Object obj5 = (k == null || k.isEmpty()) ? null : obj;
            vVar.a(obj4, view2);
            Object v = v(vVar, obj4, obj5, l, fragment, hVar2.b);
            if (!(fragment3 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                b3 b3Var = new b3();
                gVar2.b(fragment3, b3Var);
                vVar.w(fragment3, v, b3Var, new c(gVar2, fragment3, b3Var));
            }
            if (v != null) {
                ArrayList arrayList5 = new ArrayList();
                v vVar2 = vVar;
                vVar2.t(v, obj4, arrayList5, obj5, k, l, arrayList2);
                z(vVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, k);
                ArrayList arrayList6 = arrayList2;
                b0<String, String> b0Var3 = b0Var;
                vVar.x(viewGroup, arrayList6, b0Var3);
                vVar.c(viewGroup, v);
                vVar.s(viewGroup, arrayList6, b0Var3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r12 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o(androidx.fragment.app.k r17, int r18, androidx.fragment.app.t.h r19, android.view.View r20, defpackage.b0<java.lang.String, java.lang.String> r21, androidx.fragment.app.t.g r22) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            r10 = r22
            androidx.fragment.app.e r1 = r0.p
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x001b
            androidx.fragment.app.e r0 = r0.p
            r1 = r18
            android.view.View r0 = r0.d(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r11 = r0
            if (r11 != 0) goto L_0x0020
            return
        L_0x0020:
            androidx.fragment.app.Fragment r12 = r4.a
            androidx.fragment.app.Fragment r13 = r4.d
            androidx.fragment.app.v r14 = j(r13, r12)
            if (r14 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r15 = r4.b
            boolean r0 = r4.e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r6 = r(r14, r12, r15)
            java.lang.Object r5 = s(r14, r13, r0)
            r0 = r14
            r1 = r11
            r2 = r20
            r3 = r21
            r4 = r19
            r17 = r5
            r5 = r7
            r18 = r6
            r6 = r8
            r16 = r11
            r11 = r7
            r7 = r18
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0066
            if (r8 != 0) goto L_0x0066
            r7 = r17
            if (r7 != 0) goto L_0x0068
            return
        L_0x0066:
            r7 = r17
        L_0x0068:
            java.util.ArrayList r5 = k(r14, r7, r13, r11, r9)
            java.util.ArrayList r9 = k(r14, r6, r12, r10, r9)
            r0 = 4
            B(r9, r0)
            r0 = r14
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r12
            r12 = r5
            r5 = r15
            java.lang.Object r15 = v(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x00a1
            if (r12 == 0) goto L_0x00a1
            int r0 = r12.size()
            if (r0 > 0) goto L_0x008f
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00a1
        L_0x008f:
            b3 r0 = new b3
            r0.<init>()
            r1 = r22
            r1.b(r13, r0)
            androidx.fragment.app.t$a r2 = new androidx.fragment.app.t$a
            r2.<init>(r1, r13, r0)
            r14.w(r13, r15, r0, r2)
        L_0x00a1:
            if (r15 == 0) goto L_0x00cb
            w(r14, r7, r13, r12)
            java.util.ArrayList r13 = r14.o(r10)
            r0 = r14
            r1 = r15
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r12
            r6 = r8
            r7 = r10
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r14.c(r0, r15)
            r1 = r14
            r2 = r0
            r3 = r11
            r4 = r10
            r5 = r13
            r6 = r21
            r1.y(r2, r3, r4, r5, r6)
            r0 = 0
            B(r9, r0)
            r14.A(r8, r11, r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.o(androidx.fragment.app.k, int, androidx.fragment.app.t$h, android.view.View, b0, androidx.fragment.app.t$g):void");
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    private static String q(b0<String, String> b0Var, String str) {
        int size = b0Var.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(b0Var.m(i))) {
                return b0Var.i(i);
            }
        }
        return null;
    }

    private static Object r(v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.g(z ? fragment.H() : fragment.v());
    }

    private static Object s(v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.g(z ? fragment.K() : fragment.x());
    }

    static View t(b0<String, View> b0Var, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar = hVar.c;
        if (obj == null || b0Var == null || (arrayList = aVar.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return b0Var.get((z ? aVar.n : aVar.o).get(0));
    }

    private static Object u(v vVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return vVar.B(vVar.g(z ? fragment2.M() : fragment.L()));
    }

    private static Object v(v vVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.p() : fragment.o() ? vVar.n(obj2, obj, obj3) : vVar.m(obj2, obj, obj3);
    }

    private static void w(v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.o && fragment.C && fragment.P) {
            fragment.v1(true);
            vVar.r(obj, fragment.Q(), arrayList);
            l4.a(fragment.J, new b(arrayList));
        }
    }

    private static v x() {
        try {
            return (v) Class.forName("androidx.transition.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(b0<String, String> b0Var, b0<String, View> b0Var2) {
        for (int size = b0Var.size() - 1; size >= 0; size--) {
            if (!b0Var2.containsKey(b0Var.m(size))) {
                b0Var.k(size);
            }
        }
    }

    private static void z(v vVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        l4.a(viewGroup, new d(obj, vVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
