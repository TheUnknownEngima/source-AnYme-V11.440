package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.h;

class p {
    private final j a;
    private final Fragment b;
    private int c = -1;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.h$b[] r0 = androidx.lifecycle.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p.a.<clinit>():void");
        }
    }

    p(j jVar, Fragment fragment) {
        this.a = jVar;
        this.b = fragment;
    }

    p(j jVar, Fragment fragment, o oVar) {
        this.a = jVar;
        this.b = fragment;
        fragment.g = null;
        fragment.u = 0;
        fragment.r = false;
        fragment.o = false;
        Fragment fragment2 = fragment.k;
        fragment.l = fragment2 != null ? fragment2.i : null;
        Fragment fragment3 = this.b;
        fragment3.k = null;
        Bundle bundle = oVar.q;
        fragment3.f = bundle == null ? new Bundle() : bundle;
    }

    p(j jVar, ClassLoader classLoader, g gVar, o oVar) {
        this.a = jVar;
        this.b = gVar.a(classLoader, oVar.e);
        Bundle bundle = oVar.n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.b.u1(oVar.n);
        Fragment fragment = this.b;
        fragment.i = oVar.f;
        fragment.q = oVar.g;
        fragment.s = true;
        fragment.z = oVar.h;
        fragment.A = oVar.i;
        fragment.B = oVar.j;
        fragment.E = oVar.k;
        fragment.p = oVar.l;
        fragment.D = oVar.m;
        fragment.C = oVar.o;
        fragment.T = h.b.values()[oVar.p];
        Bundle bundle2 = oVar.q;
        if (bundle2 != null) {
            this.b.f = bundle2;
        } else {
            this.b.f = new Bundle();
        }
        if (k.s0(2)) {
            "Instantiated fragment " + this.b;
        }
    }

    private Bundle n() {
        Bundle bundle = new Bundle();
        this.b.i1(bundle);
        this.a.j(this.b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.b.K != null) {
            q();
        }
        if (this.b.g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.b.g);
        }
        if (!this.b.M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.b.M);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (k.s0(3)) {
            "moveto ACTIVITY_CREATED: " + this.b;
        }
        Fragment fragment = this.b;
        fragment.O0(fragment.f);
        j jVar = this.a;
        Fragment fragment2 = this.b;
        jVar.a(fragment2, fragment2.f, false);
    }

    /* access modifiers changed from: package-private */
    public void b(h<?> hVar, k kVar, Fragment fragment) {
        Fragment fragment2 = this.b;
        fragment2.w = hVar;
        fragment2.y = fragment;
        fragment2.v = kVar;
        this.a.g(fragment2, hVar.g(), false);
        this.b.P0();
        Fragment fragment3 = this.b;
        Fragment fragment4 = fragment3.y;
        if (fragment4 == null) {
            hVar.k(fragment3);
        } else {
            fragment4.l0(fragment3);
        }
        this.a.b(this.b, hVar.g(), false);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        int i = this.c;
        Fragment fragment = this.b;
        if (fragment.q) {
            i = fragment.r ? Math.max(i, 1) : i < 2 ? Math.min(i, fragment.e) : Math.min(i, 1);
        }
        if (!this.b.o) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.b;
        if (fragment2.p) {
            i = fragment2.Z() ? Math.min(i, 1) : Math.min(i, -1);
        }
        Fragment fragment3 = this.b;
        if (fragment3.L && fragment3.e < 3) {
            i = Math.min(i, 2);
        }
        int i2 = a.a[this.b.T.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(i, -1) : Math.min(i, 1) : Math.min(i, 3) : i;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (k.s0(3)) {
            "moveto CREATED: " + this.b;
        }
        Fragment fragment = this.b;
        if (!fragment.S) {
            this.a.h(fragment, fragment.f, false);
            Fragment fragment2 = this.b;
            fragment2.S0(fragment2.f);
            j jVar = this.a;
            Fragment fragment3 = this.b;
            jVar.c(fragment3, fragment3.f, false);
            return;
        }
        fragment.q1(fragment.f);
        this.b.e = 1;
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(androidx.fragment.app.e r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.b
            boolean r0 = r0.q
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.k.s0(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.b
            r0.append(r1)
            r0.toString()
        L_0x0020:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.b
            android.view.ViewGroup r2 = r1.J
            if (r2 == 0) goto L_0x002a
            r0 = r2
            goto L_0x009f
        L_0x002a:
            int r1 = r1.A
            if (r1 == 0) goto L_0x009f
            r0 = -1
            if (r1 == r0) goto L_0x0081
            android.view.View r5 = r5.d(r1)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x009f
            androidx.fragment.app.Fragment r5 = r4.b
            boolean r1 = r5.s
            if (r1 == 0) goto L_0x0041
            goto L_0x009f
        L_0x0041:
            android.content.res.Resources r5 = r5.I()     // Catch:{ NotFoundException -> 0x004e }
            androidx.fragment.app.Fragment r0 = r4.b     // Catch:{ NotFoundException -> 0x004e }
            int r0 = r0.A     // Catch:{ NotFoundException -> 0x004e }
            java.lang.String r5 = r5.getResourceName(r0)     // Catch:{ NotFoundException -> 0x004e }
            goto L_0x0050
        L_0x004e:
            java.lang.String r5 = "unknown"
        L_0x0050:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No view found for id 0x"
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r4.b
            int r2 = r2.A
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") for fragment "
            r1.append(r5)
            androidx.fragment.app.Fragment r5 = r4.b
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0081:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x009f:
            androidx.fragment.app.Fragment r5 = r4.b
            r5.J = r0
            android.os.Bundle r1 = r5.f
            android.view.LayoutInflater r1 = r5.Y0(r1)
            androidx.fragment.app.Fragment r2 = r4.b
            android.os.Bundle r2 = r2.f
            r5.U0(r1, r0, r2)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r5 = r5.K
            if (r5 == 0) goto L_0x0107
            r1 = 0
            r5.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r2 = r5.K
            int r3 = androidx.fragment.R$id.fragment_container_view_tag
            r2.setTag(r3, r5)
            if (r0 == 0) goto L_0x00cc
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r5 = r5.K
            r0.addView(r5)
        L_0x00cc:
            androidx.fragment.app.Fragment r5 = r4.b
            boolean r0 = r5.C
            if (r0 == 0) goto L_0x00d9
            android.view.View r5 = r5.K
            r0 = 8
            r5.setVisibility(r0)
        L_0x00d9:
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r5 = r5.K
            defpackage.o4.g0(r5)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r0 = r5.K
            android.os.Bundle r2 = r5.f
            r5.M0(r0, r2)
            androidx.fragment.app.j r5 = r4.a
            androidx.fragment.app.Fragment r0 = r4.b
            android.view.View r2 = r0.K
            android.os.Bundle r3 = r0.f
            r5.m(r0, r2, r3, r1)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r0 = r5.K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0105
            androidx.fragment.app.Fragment r0 = r4.b
            android.view.ViewGroup r0 = r0.J
            if (r0 == 0) goto L_0x0105
            r1 = 1
        L_0x0105:
            r5.O = r1
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p.e(androidx.fragment.app.e):void");
    }

    /* access modifiers changed from: package-private */
    public void f(h<?> hVar, n nVar) {
        if (k.s0(3)) {
            "movefrom CREATED: " + this.b;
        }
        Fragment fragment = this.b;
        boolean z = true;
        boolean z2 = fragment.p && !fragment.Z();
        if (z2 || nVar.o(this.b)) {
            if (hVar instanceof e0) {
                z = nVar.m();
            } else if (hVar.g() instanceof Activity) {
                z = true ^ ((Activity) hVar.g()).isChangingConfigurations();
            }
            if (z2 || z) {
                nVar.g(this.b);
            }
            this.b.V0();
            this.a.d(this.b, false);
            return;
        }
        this.b.e = 0;
    }

    /* access modifiers changed from: package-private */
    public void g(n nVar) {
        if (k.s0(3)) {
            "movefrom ATTACHED: " + this.b;
        }
        this.b.X0();
        boolean z = false;
        this.a.e(this.b, false);
        Fragment fragment = this.b;
        fragment.e = -1;
        fragment.w = null;
        fragment.y = null;
        fragment.v = null;
        if (fragment.p && !fragment.Z()) {
            z = true;
        }
        if (z || nVar.o(this.b)) {
            if (k.s0(3)) {
                "initState called for fragment: " + this.b;
            }
            this.b.T();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Fragment fragment = this.b;
        if (fragment.q && fragment.r && !fragment.t) {
            if (k.s0(3)) {
                "moveto CREATE_VIEW: " + this.b;
            }
            Fragment fragment2 = this.b;
            fragment2.U0(fragment2.Y0(fragment2.f), (ViewGroup) null, this.b.f);
            View view = this.b.K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.b;
                fragment3.K.setTag(R$id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.b;
                if (fragment4.C) {
                    fragment4.K.setVisibility(8);
                }
                Fragment fragment5 = this.b;
                fragment5.M0(fragment5.K, fragment5.f);
                j jVar = this.a;
                Fragment fragment6 = this.b;
                jVar.m(fragment6, fragment6.K, fragment6.f, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment i() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (k.s0(3)) {
            "movefrom RESUMED: " + this.b;
        }
        this.b.d1();
        this.a.f(this.b, false);
    }

    /* access modifiers changed from: package-private */
    public void k(ClassLoader classLoader) {
        Bundle bundle = this.b.f;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.b;
            fragment.g = fragment.f.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.b;
            fragment2.l = fragment2.f.getString("android:target_state");
            Fragment fragment3 = this.b;
            if (fragment3.l != null) {
                fragment3.m = fragment3.f.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.b;
            Boolean bool = fragment4.h;
            if (bool != null) {
                fragment4.M = bool.booleanValue();
                this.b.h = null;
            } else {
                fragment4.M = fragment4.f.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.b;
            if (!fragment5.M) {
                fragment5.L = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (k.s0(3)) {
            "moveto RESTORE_VIEW_STATE: " + this.b;
        }
        Fragment fragment = this.b;
        if (fragment.K != null) {
            fragment.r1(fragment.f);
        }
        this.b.f = null;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (k.s0(3)) {
            "moveto RESUMED: " + this.b;
        }
        this.b.h1();
        this.a.i(this.b, false);
        Fragment fragment = this.b;
        fragment.f = null;
        fragment.g = null;
    }

    /* access modifiers changed from: package-private */
    public Fragment.f o() {
        Bundle n;
        if (this.b.e <= -1 || (n = n()) == null) {
            return null;
        }
        return new Fragment.f(n);
    }

    /* access modifiers changed from: package-private */
    public o p() {
        o oVar = new o(this.b);
        if (this.b.e <= -1 || oVar.q != null) {
            oVar.q = this.b.f;
        } else {
            Bundle n = n();
            oVar.q = n;
            if (this.b.l != null) {
                if (n == null) {
                    oVar.q = new Bundle();
                }
                oVar.q.putString("android:target_state", this.b.l);
                int i = this.b.m;
                if (i != 0) {
                    oVar.q.putInt("android:target_req_state", i);
                }
            }
        }
        return oVar;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (this.b.K != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.b.K.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.b.g = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i) {
        this.c = i;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (k.s0(3)) {
            "moveto STARTED: " + this.b;
        }
        this.b.j1();
        this.a.k(this.b, false);
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (k.s0(3)) {
            "movefrom STARTED: " + this.b;
        }
        this.b.k1();
        this.a.l(this.b, false);
    }
}
