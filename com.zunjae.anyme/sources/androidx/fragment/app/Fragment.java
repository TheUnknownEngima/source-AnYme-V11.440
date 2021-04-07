package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.m;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, n, e0, androidx.savedstate.b {
    static final Object Z = new Object();
    int A;
    String B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    private boolean I;
    ViewGroup J;
    View K;
    boolean L;
    boolean M;
    c N;
    boolean O;
    boolean P;
    float Q;
    LayoutInflater R;
    boolean S;
    h.b T;
    o U;
    w V;
    t<n> W;
    androidx.savedstate.a X;
    private int Y;
    int e;
    Bundle f;
    SparseArray<Parcelable> g;
    Boolean h;
    String i;
    Bundle j;
    Fragment k;
    String l;
    int m;
    private Boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    int u;
    k v;
    h<?> w;
    k x;
    Fragment y;
    int z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.g();
        }
    }

    class b extends e {
        b() {
        }

        public View d(int i) {
            View view = Fragment.this.K;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        public boolean e() {
            return Fragment.this.K != null;
        }
    }

    static class c {
        View a;
        Animator b;
        int c;
        int d;
        int e;
        Object f = null;
        Object g;
        Object h;
        Object i;
        Object j;
        Object k;
        Boolean l;
        Boolean m;
        m n;
        m o;
        boolean p;
        e q;
        boolean r;

        c() {
            Object obj = Fragment.Z;
            this.g = obj;
            this.h = null;
            this.i = obj;
            this.j = null;
            this.k = obj;
            this.n = null;
            this.o = null;
        }
    }

    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface e {
        void a();

        void b();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();
        final Bundle e;

        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        f(Bundle bundle) {
            this.e = bundle;
        }

        f(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.e = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.e);
        }
    }

    public Fragment() {
        this.e = -1;
        this.i = UUID.randomUUID().toString();
        this.l = null;
        this.n = null;
        this.x = new l();
        this.H = true;
        this.M = true;
        this.T = h.b.RESUMED;
        this.W = new t<>();
        S();
    }

    public Fragment(int i2) {
        this();
        this.Y = i2;
    }

    private void S() {
        this.U = new o(this);
        this.X = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.U.a(new l() {
                public void c(n nVar, h.a aVar) {
                    View view;
                    if (aVar == h.a.ON_STOP && (view = Fragment.this.K) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    public static Fragment U(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.u1(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private c k() {
        if (this.N == null) {
            this.N = new c();
        }
        return this.N;
    }

    public final Object A() {
        h<?> hVar = this.w;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    public void A0(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public void A1(e eVar) {
        k();
        e eVar2 = this.N.q;
        if (eVar != eVar2) {
            if (eVar == null || eVar2 == null) {
                c cVar = this.N;
                if (cVar.p) {
                    cVar.q = eVar;
                }
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public final LayoutInflater B() {
        LayoutInflater layoutInflater = this.R;
        return layoutInflater == null ? Y0((Bundle) null) : layoutInflater;
    }

    public boolean B0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void B1(int i2) {
        k().c = i2;
    }

    @Deprecated
    public LayoutInflater C(Bundle bundle) {
        h<?> hVar = this.w;
        if (hVar != null) {
            LayoutInflater n2 = hVar.n();
            a4.b(n2, this.x.j0());
            return n2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void C0(Menu menu) {
    }

    public void C1(Fragment fragment, int i2) {
        k kVar = this.v;
        k kVar2 = fragment != null ? fragment.v : null;
        if (kVar == null || kVar2 == null || kVar == kVar2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.P();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.l = null;
            } else if (this.v == null || fragment.v == null) {
                this.l = null;
                this.k = fragment;
                this.m = i2;
                return;
            } else {
                this.l = fragment.i;
            }
            this.k = null;
            this.m = i2;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    /* access modifiers changed from: package-private */
    public int D() {
        c cVar = this.N;
        if (cVar == null) {
            return 0;
        }
        return cVar.d;
    }

    public void D0() {
        this.I = true;
    }

    @Deprecated
    public void D1(boolean z2) {
        if (!this.M && z2 && this.e < 3 && this.v != null && V() && this.S) {
            this.v.G0(this);
        }
        this.M = z2;
        this.L = this.e < 3 && !z2;
        if (this.f != null) {
            this.h = Boolean.valueOf(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public int E() {
        c cVar = this.N;
        if (cVar == null) {
            return 0;
        }
        return cVar.e;
    }

    public void E0(boolean z2) {
    }

    public void E1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        F1(intent, (Bundle) null);
    }

    public final Fragment F() {
        return this.y;
    }

    public void F0(Menu menu) {
    }

    public void F1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        h<?> hVar = this.w;
        if (hVar != null) {
            hVar.q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final k G() {
        k kVar = this.v;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void G0(boolean z2) {
    }

    public void G1(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        H1(intent, i2, (Bundle) null);
    }

    public Object H() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.i;
        return obj == Z ? x() : obj;
    }

    public void H0(int i2, String[] strArr, int[] iArr) {
    }

    public void H1(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        h<?> hVar = this.w;
        if (hVar != null) {
            hVar.q(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final Resources I() {
        return o1().getResources();
    }

    public void I0() {
        this.I = true;
    }

    public void I1() {
        k kVar = this.v;
        if (kVar == null || kVar.o == null) {
            k().p = false;
        } else if (Looper.myLooper() != this.v.o.i().getLooper()) {
            this.v.o.i().postAtFrontOfQueue(new a());
        } else {
            g();
        }
    }

    public final boolean J() {
        return this.E;
    }

    public void J0(Bundle bundle) {
    }

    public Object K() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.g;
        return obj == Z ? v() : obj;
    }

    public void K0() {
        this.I = true;
    }

    public Object L() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        return cVar.j;
    }

    public void L0() {
        this.I = true;
    }

    public Object M() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.k;
        return obj == Z ? L() : obj;
    }

    public void M0(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int N() {
        c cVar = this.N;
        if (cVar == null) {
            return 0;
        }
        return cVar.c;
    }

    public void N0(Bundle bundle) {
        this.I = true;
    }

    public final String O(int i2) {
        return I().getString(i2);
    }

    /* access modifiers changed from: package-private */
    public void O0(Bundle bundle) {
        this.x.F0();
        this.e = 2;
        this.I = false;
        h0(bundle);
        if (this.I) {
            this.x.s();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final Fragment P() {
        String str;
        Fragment fragment = this.k;
        if (fragment != null) {
            return fragment;
        }
        k kVar = this.v;
        if (kVar == null || (str = this.l) == null) {
            return null;
        }
        return kVar.X(str);
    }

    /* access modifiers changed from: package-private */
    public void P0() {
        this.x.h(this.w, new b(), this);
        this.e = 0;
        this.I = false;
        k0(this.w.g());
        if (!this.I) {
            throw new x("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public View Q() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public void Q0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.x.t(configuration);
    }

    public n R() {
        w wVar = this.V;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public boolean R0(MenuItem menuItem) {
        if (!this.C) {
            return m0(menuItem) || this.x.u(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void S0(Bundle bundle) {
        this.x.F0();
        this.e = 1;
        this.I = false;
        this.X.c(bundle);
        n0(bundle);
        this.S = true;
        if (this.I) {
            this.U.i(h.a.ON_CREATE);
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public void T() {
        S();
        this.i = UUID.randomUUID().toString();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.u = 0;
        this.v = null;
        this.x = new l();
        this.w = null;
        this.z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
    }

    /* access modifiers changed from: package-private */
    public boolean T0(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            z2 = true;
            q0(menu, menuInflater);
        }
        return z2 | this.x.w(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public void U0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.x.F0();
        this.t = true;
        this.V = new w();
        View r0 = r0(layoutInflater, viewGroup, bundle);
        this.K = r0;
        if (r0 != null) {
            this.V.d();
            this.W.m(this.V);
        } else if (!this.V.e()) {
            this.V = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final boolean V() {
        return this.w != null && this.o;
    }

    /* access modifiers changed from: package-private */
    public void V0() {
        this.x.x();
        this.U.i(h.a.ON_DESTROY);
        this.e = 0;
        this.I = false;
        this.S = false;
        s0();
        if (!this.I) {
            throw new x("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final boolean W() {
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public void W0() {
        this.x.y();
        if (this.K != null) {
            this.V.b(h.a.ON_DESTROY);
        }
        this.e = 1;
        this.I = false;
        u0();
        if (this.I) {
            x5.b(this).c();
            this.t = false;
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final boolean X() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public void X0() {
        this.e = -1;
        this.I = false;
        v0();
        this.R = null;
        if (!this.I) {
            throw new x("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.x.r0()) {
            this.x.x();
            this.x = new l();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        c cVar = this.N;
        if (cVar == null) {
            return false;
        }
        return cVar.r;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater Y0(Bundle bundle) {
        LayoutInflater w0 = w0(bundle);
        this.R = w0;
        return w0;
    }

    /* access modifiers changed from: package-private */
    public final boolean Z() {
        return this.u > 0;
    }

    /* access modifiers changed from: package-private */
    public void Z0() {
        onLowMemory();
        this.x.z();
    }

    public h a() {
        return this.U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a0() {
        /*
            r2 = this;
            boolean r0 = r2.H
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.k r0 = r2.v
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.y
            boolean r0 = r0.u0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.a0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void a1(boolean z2) {
        A0(z2);
        this.x.A(z2);
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        c cVar = this.N;
        if (cVar == null) {
            return false;
        }
        return cVar.p;
    }

    /* access modifiers changed from: package-private */
    public boolean b1(MenuItem menuItem) {
        if (!this.C) {
            return (this.G && this.H && B0(menuItem)) || this.x.B(menuItem);
        }
        return false;
    }

    public final boolean c0() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void c1(Menu menu) {
        if (!this.C) {
            if (this.G && this.H) {
                C0(menu);
            }
            this.x.C(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d0() {
        Fragment F2 = F();
        return F2 != null && (F2.c0() || F2.d0());
    }

    /* access modifiers changed from: package-private */
    public void d1() {
        this.x.E();
        if (this.K != null) {
            this.V.b(h.a.ON_PAUSE);
        }
        this.U.i(h.a.ON_PAUSE);
        this.e = 3;
        this.I = false;
        D0();
        if (!this.I) {
            throw new x("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public final boolean e0() {
        k kVar = this.v;
        if (kVar == null) {
            return false;
        }
        return kVar.x0();
    }

    /* access modifiers changed from: package-private */
    public void e1(boolean z2) {
        E0(z2);
        this.x.F(z2);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f0() {
        /*
            r1 = this;
            boolean r0 = r1.V()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.X()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.K
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.f0():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean f1(Menu menu) {
        boolean z2 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            z2 = true;
            F0(menu);
        }
        return z2 | this.x.G(menu);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        c cVar = this.N;
        e eVar = null;
        if (cVar != null) {
            cVar.p = false;
            e eVar2 = cVar.q;
            cVar.q = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void g0() {
        this.x.F0();
    }

    /* access modifiers changed from: package-private */
    public void g1() {
        boolean v0 = this.v.v0(this);
        Boolean bool = this.n;
        if (bool == null || bool.booleanValue() != v0) {
            this.n = Boolean.valueOf(v0);
            G0(v0);
            this.x.H();
        }
    }

    public d0 h() {
        k kVar = this.v;
        if (kVar != null) {
            return kVar.o0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void h0(Bundle bundle) {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public void h1() {
        this.x.F0();
        this.x.R(true);
        this.e = 4;
        this.I = false;
        I0();
        if (this.I) {
            this.U.i(h.a.ON_RESUME);
            if (this.K != null) {
                this.V.b(h.a.ON_RESUME);
            }
            this.x.I();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onResume()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.e);
        printWriter.print(" mWho=");
        printWriter.print(this.i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.v);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.w);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.y);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.j);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.g);
        }
        Fragment P2 = P();
        if (P2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(P2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.m);
        }
        if (D() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(D());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(N());
        }
        if (u() != null) {
            x5.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.x + ":");
        k kVar = this.x;
        kVar.N(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void i0(int i2, int i3, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void i1(Bundle bundle) {
        J0(bundle);
        this.X.d(bundle);
        Parcelable U0 = this.x.U0();
        if (U0 != null) {
            bundle.putParcelable("android:support:fragments", U0);
        }
    }

    public final SavedStateRegistry j() {
        return this.X.b();
    }

    @Deprecated
    public void j0(Activity activity) {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        this.x.F0();
        this.x.R(true);
        this.e = 3;
        this.I = false;
        K0();
        if (this.I) {
            this.U.i(h.a.ON_START);
            if (this.K != null) {
                this.V.b(h.a.ON_START);
            }
            this.x.J();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onStart()");
    }

    public void k0(Context context) {
        this.I = true;
        h<?> hVar = this.w;
        Activity f2 = hVar == null ? null : hVar.f();
        if (f2 != null) {
            this.I = false;
            j0(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void k1() {
        this.x.L();
        if (this.K != null) {
            this.V.b(h.a.ON_STOP);
        }
        this.U.i(h.a.ON_STOP);
        this.e = 2;
        this.I = false;
        L0();
        if (!this.I) {
            throw new x("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment l(String str) {
        return str.equals(this.i) ? this : this.x.a0(str);
    }

    public void l0(Fragment fragment) {
    }

    public final void l1(String[] strArr, int i2) {
        h<?> hVar = this.w;
        if (hVar != null) {
            hVar.o(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean m0(MenuItem menuItem) {
        return false;
    }

    public final FragmentActivity m1() {
        FragmentActivity n2 = n();
        if (n2 != null) {
            return n2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final FragmentActivity n() {
        h<?> hVar = this.w;
        if (hVar == null) {
            return null;
        }
        return (FragmentActivity) hVar.f();
    }

    public void n0(Bundle bundle) {
        this.I = true;
        q1(bundle);
        if (!this.x.w0(1)) {
            this.x.v();
        }
    }

    public final Bundle n1() {
        Bundle s2 = s();
        if (s2 != null) {
            return s2;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public boolean o() {
        Boolean bool;
        c cVar = this.N;
        if (cVar == null || (bool = cVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animation o0(int i2, boolean z2, int i3) {
        return null;
    }

    public final Context o1() {
        Context u2 = u();
        if (u2 != null) {
            return u2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.I = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.I = true;
    }

    public boolean p() {
        Boolean bool;
        c cVar = this.N;
        if (cVar == null || (bool = cVar.l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animator p0(int i2, boolean z2, int i3) {
        return null;
    }

    public final View p1() {
        View Q2 = Q();
        if (Q2 != null) {
            return Q2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    public View q() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    public void q0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void q1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.x.S0(parcelable);
            this.x.v();
        }
    }

    /* access modifiers changed from: package-private */
    public Animator r() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        return cVar.b;
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.Y;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void r1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.g;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.g = null;
        }
        this.I = false;
        N0(bundle);
        if (!this.I) {
            throw new x("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.K != null) {
            this.V.b(h.a.ON_CREATE);
        }
    }

    public final Bundle s() {
        return this.j;
    }

    public void s0() {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public void s1(View view) {
        k().a = view;
    }

    public final k t() {
        if (this.w != null) {
            return this.x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void t0() {
    }

    /* access modifiers changed from: package-private */
    public void t1(Animator animator) {
        k().b = animator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.i);
        sb.append(")");
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public Context u() {
        h<?> hVar = this.w;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public void u0() {
        this.I = true;
    }

    public void u1(Bundle bundle) {
        if (this.v == null || !e0()) {
            this.j = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public Object v() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        return cVar.f;
    }

    public void v0() {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public void v1(boolean z2) {
        k().r = z2;
    }

    /* access modifiers changed from: package-private */
    public m w() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        return cVar.n;
    }

    public LayoutInflater w0(Bundle bundle) {
        return C(bundle);
    }

    public void w1(f fVar) {
        Bundle bundle;
        if (this.v == null) {
            if (fVar == null || (bundle = fVar.e) == null) {
                bundle = null;
            }
            this.f = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public Object x() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        return cVar.h;
    }

    public void x0(boolean z2) {
    }

    public void x1(boolean z2) {
        if (this.H != z2) {
            this.H = z2;
            if (this.G && V() && !X()) {
                this.w.r();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public m y() {
        c cVar = this.N;
        if (cVar == null) {
            return null;
        }
        return cVar.o;
    }

    @Deprecated
    public void y0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public void y1(int i2) {
        if (this.N != null || i2 != 0) {
            k().d = i2;
        }
    }

    @Deprecated
    public final k z() {
        return this.v;
    }

    public void z0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        h<?> hVar = this.w;
        Activity f2 = hVar == null ? null : hVar.f();
        if (f2 != null) {
            this.I = false;
            y0(f2, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void z1(int i2) {
        if (this.N != null || i2 != 0) {
            k();
            this.N.e = i2;
        }
    }
}
