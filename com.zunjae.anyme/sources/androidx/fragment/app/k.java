package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.t;
import androidx.lifecycle.d0;
import androidx.lifecycle.h;
import com.github.mikephil.charting.utils.Utils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class k {
    private static boolean F = false;
    private ArrayList<Boolean> A;
    private ArrayList<Fragment> B;
    private ArrayList<j> C;
    private n D;
    private Runnable E = new d();
    private final ArrayList<h> a = new ArrayList<>();
    private boolean b;
    private final r c = new r();
    ArrayList<a> d;
    private ArrayList<Fragment> e;
    private final i f = new i(this);
    private OnBackPressedDispatcher g;
    private final androidx.activity.b h = new a(false);
    private final AtomicInteger i = new AtomicInteger();
    private ArrayList<g> j;
    private ConcurrentHashMap<Fragment, HashSet<b3>> k = new ConcurrentHashMap<>();
    private final t.g l = new b();
    private final j m = new j(this);
    int n = -1;
    h<?> o;
    e p;
    private Fragment q;
    Fragment r;
    private g s = null;
    private g t = new c();
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList<a> z;

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        public void b() {
            k.this.p0();
        }
    }

    class b implements t.g {
        b() {
        }

        public void a(Fragment fragment, b3 b3Var) {
            if (!b3Var.b()) {
                k.this.N0(fragment, b3Var);
            }
        }

        public void b(Fragment fragment, b3 b3Var) {
            k.this.c(fragment, b3Var);
        }
    }

    class c extends g {
        c() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            h<?> hVar = k.this.o;
            return hVar.b(hVar.g(), str, (Bundle) null);
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            k.this.R(true);
        }
    }

    class e extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup e;
        final /* synthetic */ View f;
        final /* synthetic */ Fragment g;

        e(k kVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.e = viewGroup;
            this.f = view;
            this.g = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.e.endViewTransition(this.f);
            animator.removeListener(this);
            Fragment fragment = this.g;
            View view = fragment.K;
            if (view != null && fragment.C) {
                view.setVisibility(8);
            }
        }
    }

    public static abstract class f {
        public abstract void a(k kVar, Fragment fragment, Bundle bundle);

        public abstract void b(k kVar, Fragment fragment, Context context);

        public abstract void c(k kVar, Fragment fragment, Bundle bundle);

        public abstract void d(k kVar, Fragment fragment);

        public abstract void e(k kVar, Fragment fragment);

        public abstract void f(k kVar, Fragment fragment);

        public abstract void g(k kVar, Fragment fragment, Context context);

        public abstract void h(k kVar, Fragment fragment, Bundle bundle);

        public abstract void i(k kVar, Fragment fragment);

        public abstract void j(k kVar, Fragment fragment, Bundle bundle);

        public abstract void k(k kVar, Fragment fragment);

        public abstract void l(k kVar, Fragment fragment);

        public abstract void m(k kVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(k kVar, Fragment fragment);
    }

    public interface g {
        void a();
    }

    interface h {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class i implements h {
        final String a;
        final int b;
        final int c;

        i(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = k.this.r;
            if (fragment != null && this.b < 0 && this.a == null && fragment.t().I0()) {
                return false;
            }
            return k.this.K0(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    static class j implements Fragment.e {
        final boolean a;
        final a b;
        private int c;

        j(a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        public void a() {
            this.c++;
        }

        public void b() {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b.r.W0();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.b;
            aVar.r.o(aVar, this.a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z = this.c > 0;
            for (Fragment next : this.b.r.i0()) {
                next.A1((Fragment.e) null);
                if (z && next.b0()) {
                    next.I1();
                }
            }
            a aVar = this.b;
            aVar.r.o(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    private void A0(c0<Fragment> c0Var) {
        int size = c0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment k2 = c0Var.k(i2);
            if (!k2.o) {
                View p1 = k2.p1();
                k2.Q = p1.getAlpha();
                p1.setAlpha(Utils.FLOAT_EPSILON);
            }
        }
    }

    private void D(Fragment fragment) {
        if (fragment != null && fragment.equals(X(fragment.i))) {
            fragment.g1();
        }
    }

    private boolean J0(String str, int i2, int i3) {
        R(false);
        Q(true);
        Fragment fragment = this.r;
        if (fragment != null && i2 < 0 && str == null && fragment.t().I0()) {
            return true;
        }
        boolean K0 = K0(this.z, this.A, str, i2, i3);
        if (K0) {
            this.b = true;
            try {
                P0(this.z, this.A);
            } finally {
                n();
            }
        }
        e1();
        M();
        this.c.b();
        return K0;
    }

    /* JADX INFO: finally extract failed */
    private void K(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            C0(i2, false);
            this.b = false;
            R(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private int L0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, c0<Fragment> c0Var) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.H() && !aVar.F(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                j jVar = new j(aVar, booleanValue);
                this.C.add(jVar);
                aVar.J(jVar);
                if (booleanValue) {
                    aVar.A();
                } else {
                    aVar.B(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(c0Var);
            }
        }
        return i4;
    }

    private void M() {
        if (this.y) {
            this.y = false;
            c1();
        }
    }

    private void O() {
        if (!this.k.isEmpty()) {
            for (Fragment next : this.k.keySet()) {
                k(next);
                E0(next, next.N());
            }
        }
    }

    private void P0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                W(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).p) {
                        if (i3 != i2) {
                            U(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                                i3++;
                            }
                        }
                        U(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    U(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void Q(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.o == null) {
            if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.o.i().getLooper()) {
            if (!z2) {
                m();
            }
            if (this.z == null) {
                this.z = new ArrayList<>();
                this.A = new ArrayList<>();
            }
            this.b = true;
            try {
                W((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void R0() {
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).a();
            }
        }
    }

    private static void T(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.w(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.B(z2);
            } else {
                aVar.w(1);
                aVar.A();
            }
            i2++;
        }
    }

    static int T0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void U(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = arrayList3.get(i5).p;
        ArrayList<Fragment> arrayList5 = this.B;
        if (arrayList5 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.B.addAll(this.c.m());
        Fragment m0 = m0();
        boolean z3 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            a aVar = arrayList3.get(i7);
            m0 = !arrayList4.get(i7).booleanValue() ? aVar.C(this.B, m0) : aVar.K(this.B, m0);
            z3 = z3 || aVar.g;
        }
        this.B.clear();
        if (!z2) {
            t.C(this, arrayList, arrayList2, i2, i3, false, this.l);
        }
        T(arrayList, arrayList2, i2, i3);
        if (z2) {
            c0 c0Var = new c0();
            a(c0Var);
            int L0 = L0(arrayList, arrayList2, i2, i3, c0Var);
            A0(c0Var);
            i4 = L0;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z2) {
            t.C(this, arrayList, arrayList2, i2, i4, true, this.l);
            C0(this.n, true);
        }
        while (i5 < i6) {
            a aVar2 = arrayList3.get(i5);
            if (arrayList4.get(i5).booleanValue() && aVar2.t >= 0) {
                aVar2.t = -1;
            }
            aVar2.I();
            i5++;
        }
        if (z3) {
            R0();
        }
    }

    private void W(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<j> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.C.get(i2);
            if (arrayList == null || jVar.a || (indexOf2 = arrayList.indexOf(jVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (jVar.e() || (arrayList != null && jVar.b.F(arrayList, 0, arrayList.size()))) {
                    this.C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || jVar.a || (indexOf = arrayList.indexOf(jVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.d();
                    }
                }
                i2++;
            } else {
                this.C.remove(i2);
                i2--;
                size--;
            }
            jVar.c();
            i2++;
        }
    }

    private void a(c0<Fragment> c0Var) {
        int i2 = this.n;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            for (Fragment next : this.c.m()) {
                if (next.e < min) {
                    E0(next, min);
                    if (next.K != null && !next.C && next.O) {
                        c0Var.add(next);
                    }
                }
            }
        }
    }

    private void a1(Fragment fragment) {
        ViewGroup g0 = g0(fragment);
        if (g0 != null) {
            if (g0.getTag(R$id.visible_removing_fragment_view_tag) == null) {
                g0.setTag(R$id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) g0.getTag(R$id.visible_removing_fragment_view_tag)).y1(fragment.D());
        }
    }

    private void b0() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private boolean c0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.o.i().removeCallbacks(this.E);
            return z2;
        }
    }

    private void c1() {
        for (Fragment next : this.c.k()) {
            if (next != null) {
                G0(next);
            }
        }
    }

    private void d1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new o3("FragmentManager"));
        h<?> hVar = this.o;
        if (hVar != null) {
            try {
                hVar.l("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            N("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    private n e0(Fragment fragment) {
        return this.D.i(fragment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (d0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (v0(r3.q) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.k$h> r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.k$h> r1 = r3.a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.h     // Catch:{ all -> 0x002a }
            r1.f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.h
            int r1 = r3.d0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.q
            boolean r1 = r3.v0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.e1():void");
    }

    private ViewGroup g0(Fragment fragment) {
        if (fragment.A > 0 && this.p.e()) {
            View d2 = this.p.d(fragment.A);
            if (d2 instanceof ViewGroup) {
                return (ViewGroup) d2;
            }
        }
        return null;
    }

    private void k(Fragment fragment) {
        HashSet hashSet = this.k.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((b3) it.next()).a();
            }
            hashSet.clear();
            q(fragment);
            this.k.remove(fragment);
        }
    }

    private void m() {
        if (x0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void n() {
        this.b = false;
        this.A.clear();
        this.z.clear();
    }

    static Fragment n0(View view) {
        Object tag = view.getTag(R$id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void p(Fragment fragment) {
        Animator animator;
        if (fragment.K != null) {
            d.C0025d b2 = d.b(this.o.g(), this.p, fragment, !fragment.C);
            if (b2 == null || (animator = b2.b) == null) {
                if (b2 != null) {
                    fragment.K.startAnimation(b2.a);
                    b2.a.start();
                }
                fragment.K.setVisibility((!fragment.C || fragment.Y()) ? 0 : 8);
                if (fragment.Y()) {
                    fragment.v1(false);
                }
            } else {
                animator.setTarget(fragment.K);
                if (!fragment.C) {
                    fragment.K.setVisibility(0);
                } else if (fragment.Y()) {
                    fragment.v1(false);
                } else {
                    ViewGroup viewGroup = fragment.J;
                    View view = fragment.K;
                    viewGroup.startViewTransition(view);
                    b2.b.addListener(new e(this, viewGroup, view, fragment));
                }
                b2.b.start();
            }
        }
        if (fragment.o && t0(fragment)) {
            this.u = true;
        }
        fragment.P = false;
        fragment.x0(fragment.C);
    }

    private void q(Fragment fragment) {
        fragment.W0();
        this.m.n(fragment, false);
        fragment.J = null;
        fragment.K = null;
        fragment.V = null;
        fragment.W.m(null);
        fragment.r = false;
    }

    static boolean s0(int i2) {
        return F || Log.isLoggable("FragmentManager", i2);
    }

    private boolean t0(Fragment fragment) {
        return (fragment.G && fragment.H) || fragment.x.l();
    }

    private void z0(p pVar) {
        Fragment i2 = pVar.i();
        if (this.c.c(i2.i)) {
            if (s0(2)) {
                "Removed fragment from active set " + i2;
            }
            this.c.o(pVar);
            Q0(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z2) {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.a1(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean B(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment next : this.c.m()) {
            if (next != null && next.b1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r0 = r0.K;
        r1 = r4.J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B0(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            androidx.fragment.app.r r0 = r3.c
            java.lang.String r1 = r4.i
            boolean r0 = r0.c(r1)
            if (r0 != 0) goto L_0x0034
            r0 = 3
            boolean r0 = s0(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to state "
            r0.append(r4)
            int r4 = r3.n
            r0.append(r4)
            java.lang.String r4 = "since it is not added to "
            r0.append(r4)
            r0.append(r3)
            r0.toString()
        L_0x0033:
            return
        L_0x0034:
            r3.D0(r4)
            android.view.View r0 = r4.K
            if (r0 == 0) goto L_0x0099
            androidx.fragment.app.r r0 = r3.c
            androidx.fragment.app.Fragment r0 = r0.j(r4)
            if (r0 == 0) goto L_0x005b
            android.view.View r0 = r0.K
            android.view.ViewGroup r1 = r4.J
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.K
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x005b
            r1.removeViewAt(r2)
            android.view.View r2 = r4.K
            r1.addView(r2, r0)
        L_0x005b:
            boolean r0 = r4.O
            if (r0 == 0) goto L_0x0099
            android.view.ViewGroup r0 = r4.J
            if (r0 == 0) goto L_0x0099
            float r0 = r4.Q
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x006f
            android.view.View r2 = r4.K
            r2.setAlpha(r0)
        L_0x006f:
            r4.Q = r1
            r0 = 0
            r4.O = r0
            androidx.fragment.app.h<?> r0 = r3.o
            android.content.Context r0 = r0.g()
            androidx.fragment.app.e r1 = r3.p
            r2 = 1
            androidx.fragment.app.d$d r0 = androidx.fragment.app.d.b(r0, r1, r4, r2)
            if (r0 == 0) goto L_0x0099
            android.view.animation.Animation r1 = r0.a
            if (r1 == 0) goto L_0x008d
            android.view.View r0 = r4.K
            r0.startAnimation(r1)
            goto L_0x0099
        L_0x008d:
            android.animation.Animator r1 = r0.b
            android.view.View r2 = r4.K
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.b
            r0.start()
        L_0x0099:
            boolean r0 = r4.P
            if (r0 == 0) goto L_0x00a0
            r3.p(r4)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.B0(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void C(Menu menu) {
        if (this.n >= 1) {
            for (Fragment next : this.c.m()) {
                if (next != null) {
                    next.c1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C0(int i2, boolean z2) {
        h<?> hVar;
        if (this.o == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.n) {
            this.n = i2;
            for (Fragment B0 : this.c.m()) {
                B0(B0);
            }
            for (Fragment next : this.c.k()) {
                if (next != null && !next.O) {
                    B0(next);
                }
            }
            c1();
            if (this.u && (hVar = this.o) != null && this.n == 4) {
                hVar.r();
                this.u = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        E0(fragment, this.n);
    }

    /* access modifiers changed from: package-private */
    public void E() {
        K(3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r2 != 3) goto L_0x01eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E0(androidx.fragment.app.Fragment r12, int r13) {
        /*
            r11 = this;
            androidx.fragment.app.r r0 = r11.c
            java.lang.String r1 = r12.i
            androidx.fragment.app.p r0 = r0.l(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.p r0 = new androidx.fragment.app.p
            androidx.fragment.app.j r2 = r11.m
            r0.<init>(r2, r12)
            r0.r(r1)
        L_0x0015:
            int r2 = r0.c()
            int r13 = java.lang.Math.min(r13, r2)
            int r2 = r12.e
            r3 = 0
            r4 = -1
            r5 = 2
            r6 = 3
            if (r2 > r13) goto L_0x00fc
            if (r2 >= r13) goto L_0x0032
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<b3>> r2 = r11.k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0032
            r11.k(r12)
        L_0x0032:
            int r2 = r12.e
            if (r2 == r4) goto L_0x0040
            if (r2 == 0) goto L_0x00d9
            if (r2 == r1) goto L_0x00de
            if (r2 == r5) goto L_0x00f0
            if (r2 == r6) goto L_0x00f5
            goto L_0x01eb
        L_0x0040:
            if (r13 <= r4) goto L_0x00d9
            boolean r2 = s0(r6)
            if (r2 == 0) goto L_0x0058
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "moveto ATTACHED: "
            r2.append(r7)
            r2.append(r12)
            r2.toString()
        L_0x0058:
            androidx.fragment.app.Fragment r2 = r12.k
            java.lang.String r7 = " that does not belong to this FragmentManager!"
            java.lang.String r8 = " declared target fragment "
            java.lang.String r9 = "Fragment "
            if (r2 == 0) goto L_0x00a0
            java.lang.String r10 = r2.i
            androidx.fragment.app.Fragment r10 = r11.X(r10)
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0080
            androidx.fragment.app.Fragment r2 = r12.k
            int r10 = r2.e
            if (r10 >= r1) goto L_0x0077
            r11.E0(r2, r1)
        L_0x0077:
            androidx.fragment.app.Fragment r2 = r12.k
            java.lang.String r2 = r2.i
            r12.l = r2
            r12.k = r3
            goto L_0x00a0
        L_0x0080:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r12)
            r0.append(r8)
            androidx.fragment.app.Fragment r12 = r12.k
            r0.append(r12)
            r0.append(r7)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00a0:
            java.lang.String r2 = r12.l
            if (r2 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r2 = r11.X(r2)
            if (r2 == 0) goto L_0x00b2
            int r3 = r2.e
            if (r3 >= r1) goto L_0x00d2
            r11.E0(r2, r1)
            goto L_0x00d2
        L_0x00b2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = r12.l
            r0.append(r12)
            r0.append(r7)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00d2:
            androidx.fragment.app.h<?> r2 = r11.o
            androidx.fragment.app.Fragment r3 = r11.q
            r0.b(r2, r11, r3)
        L_0x00d9:
            if (r13 <= 0) goto L_0x00de
            r0.d()
        L_0x00de:
            if (r13 <= r4) goto L_0x00e3
            r0.h()
        L_0x00e3:
            if (r13 <= r1) goto L_0x00f0
            androidx.fragment.app.e r1 = r11.p
            r0.e(r1)
            r0.a()
            r0.l()
        L_0x00f0:
            if (r13 <= r5) goto L_0x00f5
            r0.s()
        L_0x00f5:
            if (r13 <= r6) goto L_0x01eb
            r0.m()
            goto L_0x01eb
        L_0x00fc:
            if (r2 <= r13) goto L_0x01eb
            if (r2 == 0) goto L_0x01e2
            r7 = 0
            if (r2 == r1) goto L_0x01a1
            if (r2 == r5) goto L_0x0116
            if (r2 == r6) goto L_0x0111
            r8 = 4
            if (r2 == r8) goto L_0x010c
            goto L_0x01eb
        L_0x010c:
            if (r13 >= r8) goto L_0x0111
            r0.j()
        L_0x0111:
            if (r13 >= r6) goto L_0x0116
            r0.t()
        L_0x0116:
            if (r13 >= r5) goto L_0x01a1
            boolean r2 = s0(r6)
            if (r2 == 0) goto L_0x012e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "movefrom ACTIVITY_CREATED: "
            r2.append(r5)
            r2.append(r12)
            r2.toString()
        L_0x012e:
            android.view.View r2 = r12.K
            if (r2 == 0) goto L_0x0141
            androidx.fragment.app.h<?> r2 = r11.o
            boolean r2 = r2.p(r12)
            if (r2 == 0) goto L_0x0141
            android.util.SparseArray<android.os.Parcelable> r2 = r12.g
            if (r2 != 0) goto L_0x0141
            r0.q()
        L_0x0141:
            android.view.View r2 = r12.K
            if (r2 == 0) goto L_0x0192
            android.view.ViewGroup r5 = r12.J
            if (r5 == 0) goto L_0x0192
            r5.endViewTransition(r2)
            android.view.View r2 = r12.K
            r2.clearAnimation()
            boolean r2 = r12.d0()
            if (r2 != 0) goto L_0x0192
            int r2 = r11.n
            r5 = 0
            if (r2 <= r4) goto L_0x017a
            boolean r2 = r11.x
            if (r2 != 0) goto L_0x017a
            android.view.View r2 = r12.K
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x017a
            float r2 = r12.Q
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x017a
            androidx.fragment.app.h<?> r2 = r11.o
            android.content.Context r2 = r2.g()
            androidx.fragment.app.e r3 = r11.p
            androidx.fragment.app.d$d r3 = androidx.fragment.app.d.b(r2, r3, r12, r7)
        L_0x017a:
            r12.Q = r5
            android.view.ViewGroup r2 = r12.J
            android.view.View r4 = r12.K
            if (r3 == 0) goto L_0x018a
            r12.B1(r13)
            androidx.fragment.app.t$g r5 = r11.l
            androidx.fragment.app.d.a(r12, r3, r5)
        L_0x018a:
            r2.removeView(r4)
            android.view.ViewGroup r3 = r12.J
            if (r2 == r3) goto L_0x0192
            return
        L_0x0192:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<b3>> r2 = r11.k
            java.lang.Object r2 = r2.get(r12)
            if (r2 != 0) goto L_0x019e
            r11.q(r12)
            goto L_0x01a1
        L_0x019e:
            r12.B1(r13)
        L_0x01a1:
            if (r13 >= r1) goto L_0x01e2
            boolean r2 = r12.p
            if (r2 == 0) goto L_0x01ae
            boolean r2 = r12.Z()
            if (r2 != 0) goto L_0x01ae
            r7 = 1
        L_0x01ae:
            if (r7 != 0) goto L_0x01cc
            androidx.fragment.app.n r2 = r11.D
            boolean r2 = r2.o(r12)
            if (r2 == 0) goto L_0x01b9
            goto L_0x01cc
        L_0x01b9:
            java.lang.String r2 = r12.l
            if (r2 == 0) goto L_0x01cf
            androidx.fragment.app.Fragment r2 = r11.X(r2)
            if (r2 == 0) goto L_0x01cf
            boolean r3 = r2.J()
            if (r3 == 0) goto L_0x01cf
            r12.k = r2
            goto L_0x01cf
        L_0x01cc:
            r11.z0(r0)
        L_0x01cf:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<b3>> r2 = r11.k
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x01db
            r12.B1(r13)
            goto L_0x01e3
        L_0x01db:
            androidx.fragment.app.h<?> r1 = r11.o
            androidx.fragment.app.n r2 = r11.D
            r0.f(r1, r2)
        L_0x01e2:
            r1 = r13
        L_0x01e3:
            if (r1 >= 0) goto L_0x01ea
            androidx.fragment.app.n r13 = r11.D
            r0.g(r13)
        L_0x01ea:
            r13 = r1
        L_0x01eb:
            int r0 = r12.e
            if (r0 == r13) goto L_0x0219
            boolean r0 = s0(r6)
            if (r0 == 0) goto L_0x0217
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r12.e
            r0.append(r1)
            r0.toString()
        L_0x0217:
            r12.e = r13
        L_0x0219:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.E0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z2) {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.e1(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F0() {
        if (this.o != null) {
            this.v = false;
            this.w = false;
            for (Fragment next : this.c.m()) {
                if (next != null) {
                    next.g0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean G(Menu menu) {
        boolean z2 = false;
        if (this.n < 1) {
            return false;
        }
        for (Fragment next : this.c.m()) {
            if (next != null && next.f1(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void G0(Fragment fragment) {
        if (!fragment.L) {
            return;
        }
        if (this.b) {
            this.y = true;
            return;
        }
        fragment.L = false;
        E0(fragment, this.n);
    }

    /* access modifiers changed from: package-private */
    public void H() {
        e1();
        D(this.r);
    }

    public void H0(int i2, int i3) {
        if (i2 >= 0) {
            P(new i((String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.v = false;
        this.w = false;
        K(4);
    }

    public boolean I0() {
        return J0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void J() {
        this.v = false;
        this.w = false;
        K(3);
    }

    /* access modifiers changed from: package-private */
    public boolean K0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.D())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.d.get(size2);
                        if ((str == null || !str.equals(aVar2.D())) && (i2 < 0 || i2 != aVar2.t)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void L() {
        this.w = true;
        K(2);
    }

    public void M0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.v == this) {
            bundle.putString(str, fragment.i);
            return;
        }
        d1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public void N(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.e.get(i2).toString());
            }
        }
        ArrayList<a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.y(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    /* access modifiers changed from: package-private */
    public void N0(Fragment fragment, b3 b3Var) {
        HashSet hashSet = this.k.get(fragment);
        if (hashSet != null && hashSet.remove(b3Var) && hashSet.isEmpty()) {
            this.k.remove(fragment);
            if (fragment.e < 3) {
                q(fragment);
                E0(fragment, fragment.N());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(Fragment fragment) {
        if (s0(2)) {
            "remove: " + fragment + " nesting=" + fragment.u;
        }
        boolean z2 = !fragment.Z();
        if (!fragment.D || z2) {
            this.c.p(fragment);
            if (t0(fragment)) {
                this.u = true;
            }
            fragment.p = true;
            a1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void P(h hVar, boolean z2) {
        if (!z2) {
            if (this.o != null) {
                m();
            } else if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.a) {
            if (this.o != null) {
                this.a.add(hVar);
                W0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q0(Fragment fragment) {
        if (x0()) {
            boolean s0 = s0(2);
        } else if (this.D.n(fragment) && s0(2)) {
            "Updating retained Fragments: Removed " + fragment;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean R(boolean z2) {
        Q(z2);
        boolean z3 = false;
        while (c0(this.z, this.A)) {
            this.b = true;
            try {
                P0(this.z, this.A);
                n();
                z3 = true;
            } catch (Throwable th) {
                n();
                throw th;
            }
        }
        e1();
        M();
        this.c.b();
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void S(h hVar, boolean z2) {
        if (!z2 || (this.o != null && !this.x)) {
            Q(z2);
            if (hVar.a(this.z, this.A)) {
                this.b = true;
                try {
                    P0(this.z, this.A);
                } finally {
                    n();
                }
            }
            e1();
            M();
            this.c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void S0(Parcelable parcelable) {
        p pVar;
        if (parcelable != null) {
            m mVar = (m) parcelable;
            if (mVar.e != null) {
                this.c.q();
                Iterator<o> it = mVar.e.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    if (next != null) {
                        Fragment h2 = this.D.h(next.f);
                        if (h2 != null) {
                            if (s0(2)) {
                                "restoreSaveState: re-attaching retained " + h2;
                            }
                            pVar = new p(this.m, h2, next);
                        } else {
                            pVar = new p(this.m, this.o.g().getClassLoader(), h0(), next);
                        }
                        Fragment i2 = pVar.i();
                        i2.v = this;
                        if (s0(2)) {
                            "restoreSaveState: active (" + i2.i + "): " + i2;
                        }
                        pVar.k(this.o.g().getClassLoader());
                        this.c.n(pVar);
                        pVar.r(this.n);
                    }
                }
                for (Fragment next2 : this.D.k()) {
                    if (!this.c.c(next2.i)) {
                        if (s0(2)) {
                            "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + mVar.e;
                        }
                        E0(next2, 1);
                        next2.p = true;
                        E0(next2, -1);
                    }
                }
                this.c.r(mVar.f);
                if (mVar.g != null) {
                    this.d = new ArrayList<>(mVar.g.length);
                    int i3 = 0;
                    while (true) {
                        b[] bVarArr = mVar.g;
                        if (i3 >= bVarArr.length) {
                            break;
                        }
                        a a2 = bVarArr[i3].a(this);
                        if (s0(2)) {
                            "restoreAllState: back stack #" + i3 + " (index " + a2.t + "): " + a2;
                            PrintWriter printWriter = new PrintWriter(new o3("FragmentManager"));
                            a2.z("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.d.add(a2);
                        i3++;
                    }
                } else {
                    this.d = null;
                }
                this.i.set(mVar.h);
                String str = mVar.i;
                if (str != null) {
                    Fragment X = X(str);
                    this.r = X;
                    D(X);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Parcelable U0() {
        int size;
        b0();
        O();
        R(true);
        this.v = true;
        ArrayList<o> s2 = this.c.s();
        b[] bVarArr = null;
        if (s2.isEmpty()) {
            boolean s0 = s0(2);
            return null;
        }
        ArrayList<String> t2 = this.c.t();
        ArrayList<a> arrayList = this.d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new b(this.d.get(i2));
                if (s0(2)) {
                    "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2);
                }
            }
        }
        m mVar = new m();
        mVar.e = s2;
        mVar.f = t2;
        mVar.g = bVarArr;
        mVar.h = this.i.get();
        Fragment fragment = this.r;
        if (fragment != null) {
            mVar.i = fragment.i;
        }
        return mVar;
    }

    public boolean V() {
        boolean R = R(true);
        b0();
        return R;
    }

    public Fragment.f V0(Fragment fragment) {
        p l2 = this.c.l(fragment.i);
        if (l2 != null && l2.i().equals(fragment)) {
            return l2.o();
        }
        d1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void W0() {
        synchronized (this.a) {
            boolean z2 = false;
            boolean z3 = this.C != null && !this.C.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.o.i().removeCallbacks(this.E);
                this.o.i().post(this.E);
                e1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment X(String str) {
        return this.c.f(str);
    }

    /* access modifiers changed from: package-private */
    public void X0(Fragment fragment, boolean z2) {
        ViewGroup g0 = g0(fragment);
        if (g0 != null && (g0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) g0).setDrawDisappearingViewsLast(!z2);
        }
    }

    public Fragment Y(int i2) {
        return this.c.g(i2);
    }

    /* access modifiers changed from: package-private */
    public void Y0(Fragment fragment, h.b bVar) {
        if (!fragment.equals(X(fragment.i)) || !(fragment.w == null || fragment.v == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.T = bVar;
    }

    public Fragment Z(String str) {
        return this.c.h(str);
    }

    /* access modifiers changed from: package-private */
    public void Z0(Fragment fragment) {
        if (fragment == null || (fragment.equals(X(fragment.i)) && (fragment.w == null || fragment.v == this))) {
            Fragment fragment2 = this.r;
            this.r = fragment;
            D(fragment2);
            D(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public Fragment a0(String str) {
        return this.c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b1(Fragment fragment) {
        if (s0(2)) {
            "show: " + fragment;
        }
        if (fragment.C) {
            fragment.C = false;
            fragment.P = !fragment.P;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, b3 b3Var) {
        if (this.k.get(fragment) == null) {
            this.k.put(fragment, new HashSet());
        }
        this.k.get(fragment).add(b3Var);
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment) {
        if (s0(2)) {
            "add: " + fragment;
        }
        y0(fragment);
        if (!fragment.D) {
            this.c.a(fragment);
            fragment.p = false;
            if (fragment.K == null) {
                fragment.P = false;
            }
            if (t0(fragment)) {
                this.u = true;
            }
        }
    }

    public int d0() {
        ArrayList<a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void e(g gVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(gVar);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (x0()) {
            boolean s0 = s0(2);
        } else if (this.D.f(fragment) && s0(2)) {
            "Updating retained Fragments: Added " + fragment;
        }
    }

    public Fragment f0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment X = X(string);
        if (X != null) {
            return X;
        }
        d1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.i.getAndIncrement();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(androidx.fragment.app.h<?> r3, androidx.fragment.app.e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.h<?> r0 = r2.o
            if (r0 != 0) goto L_0x0048
            r2.o = r3
            r2.p = r4
            r2.q = r5
            if (r5 == 0) goto L_0x000f
            r2.e1()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.c
            if (r4 == 0) goto L_0x0026
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.c()
            r2.g = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r2.g
            androidx.activity.b r1 = r2.h
            r0.a(r4, r1)
        L_0x0026:
            if (r5 == 0) goto L_0x0031
            androidx.fragment.app.k r3 = r5.v
            androidx.fragment.app.n r3 = r3.e0(r5)
        L_0x002e:
            r2.D = r3
            goto L_0x0047
        L_0x0031:
            boolean r4 = r3 instanceof androidx.lifecycle.e0
            if (r4 == 0) goto L_0x0040
            androidx.lifecycle.e0 r3 = (androidx.lifecycle.e0) r3
            androidx.lifecycle.d0 r3 = r3.h()
            androidx.fragment.app.n r3 = androidx.fragment.app.n.j(r3)
            goto L_0x002e
        L_0x0040:
            androidx.fragment.app.n r3 = new androidx.fragment.app.n
            r4 = 0
            r3.<init>(r4)
            goto L_0x002e
        L_0x0047:
            return
        L_0x0048:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.h(androidx.fragment.app.h, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    public g h0() {
        g gVar = this.s;
        if (gVar != null) {
            return gVar;
        }
        Fragment fragment = this.q;
        return fragment != null ? fragment.v.h0() : this.t;
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        if (s0(2)) {
            "attach: " + fragment;
        }
        if (fragment.D) {
            fragment.D = false;
            if (!fragment.o) {
                this.c.a(fragment);
                if (s0(2)) {
                    "add from attach: " + fragment;
                }
                if (t0(fragment)) {
                    this.u = true;
                }
            }
        }
    }

    public List<Fragment> i0() {
        return this.c.m();
    }

    public s j() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 j0() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public j k0() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        boolean z2 = false;
        for (Fragment next : this.c.k()) {
            if (next != null) {
                z2 = t0(next);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Fragment l0() {
        return this.q;
    }

    public Fragment m0() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void o(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.B(z4);
        } else {
            aVar.A();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            t.C(this, arrayList, arrayList2, 0, 1, true, this.l);
        }
        if (z4) {
            C0(this.n, true);
        }
        for (Fragment next : this.c.k()) {
            if (next != null && next.K != null && next.O && aVar.E(next.A)) {
                float f2 = next.Q;
                if (f2 > Utils.FLOAT_EPSILON) {
                    next.K.setAlpha(f2);
                }
                if (z4) {
                    next.Q = Utils.FLOAT_EPSILON;
                } else {
                    next.Q = -1.0f;
                    next.O = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public d0 o0(Fragment fragment) {
        return this.D.l(fragment);
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        R(true);
        if (this.h.c()) {
            I0();
        } else {
            this.g.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void q0(Fragment fragment) {
        if (s0(2)) {
            "hide: " + fragment;
        }
        if (!fragment.C) {
            fragment.C = true;
            fragment.P = true ^ fragment.P;
            a1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(Fragment fragment) {
        if (s0(2)) {
            "detach: " + fragment;
        }
        if (!fragment.D) {
            fragment.D = true;
            if (fragment.o) {
                if (s0(2)) {
                    "remove from detach: " + fragment;
                }
                this.c.p(fragment);
                if (t0(fragment)) {
                    this.u = true;
                }
                a1(fragment);
            }
        }
    }

    public boolean r0() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.v = false;
        this.w = false;
        K(2);
    }

    /* access modifiers changed from: package-private */
    public void t(Configuration configuration) {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.Q0(configuration);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.q;
        } else {
            h<?> hVar = this.o;
            if (hVar != null) {
                sb.append(hVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.o;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean u(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment next : this.c.m()) {
            if (next != null && next.R0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean u0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.a0();
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.v = false;
        this.w = false;
        K(1);
    }

    /* access modifiers changed from: package-private */
    public boolean v0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        k kVar = fragment.v;
        return fragment.equals(kVar.m0()) && v0(kVar.q);
    }

    /* access modifiers changed from: package-private */
    public boolean w(Menu menu, MenuInflater menuInflater) {
        if (this.n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment next : this.c.m()) {
            if (next != null && u0(next) && next.T0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z2 = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.t0();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    /* access modifiers changed from: package-private */
    public boolean w0(int i2) {
        return this.n >= i2;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        this.x = true;
        R(true);
        O();
        K(-1);
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
    }

    public boolean x0() {
        return this.v || this.w;
    }

    /* access modifiers changed from: package-private */
    public void y() {
        K(1);
    }

    /* access modifiers changed from: package-private */
    public void y0(Fragment fragment) {
        if (!this.c.c(fragment.i)) {
            p pVar = new p(this.m, fragment);
            pVar.k(this.o.g().getClassLoader());
            this.c.n(pVar);
            if (fragment.F) {
                if (fragment.E) {
                    f(fragment);
                } else {
                    Q0(fragment);
                }
                fragment.F = false;
            }
            pVar.r(this.n);
            if (s0(2)) {
                "Added fragment to active set " + fragment;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.Z0();
            }
        }
    }
}
