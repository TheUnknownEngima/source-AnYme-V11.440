package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.s;
import androidx.lifecycle.h;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends s implements k.h {
    final k r;
    boolean s;
    int t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    a(androidx.fragment.app.k r3) {
        /*
            r2 = this;
            androidx.fragment.app.g r0 = r3.h0()
            androidx.fragment.app.h<?> r1 = r3.o
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.t = r0
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.k):void");
    }

    private static boolean G(s.a aVar) {
        Fragment fragment = aVar.b;
        return fragment != null && fragment.o && fragment.K != null && !fragment.D && !fragment.C && fragment.b0();
    }

    /* access modifiers changed from: package-private */
    public void A() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            s.a aVar = this.a.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.z1(this.f);
            }
            switch (aVar.a) {
                case 1:
                    fragment.y1(aVar.c);
                    this.r.X0(fragment, false);
                    this.r.d(fragment);
                    break;
                case 3:
                    fragment.y1(aVar.d);
                    this.r.O0(fragment);
                    break;
                case 4:
                    fragment.y1(aVar.d);
                    this.r.q0(fragment);
                    break;
                case 5:
                    fragment.y1(aVar.c);
                    this.r.X0(fragment, false);
                    this.r.b1(fragment);
                    break;
                case 6:
                    fragment.y1(aVar.d);
                    this.r.r(fragment);
                    break;
                case 7:
                    fragment.y1(aVar.c);
                    this.r.X0(fragment, false);
                    this.r.i(fragment);
                    break;
                case 8:
                    this.r.Z0(fragment);
                    break;
                case 9:
                    this.r.Z0((Fragment) null);
                    break;
                case 10:
                    this.r.Y0(fragment, aVar.h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!(this.p || aVar.a == 1 || fragment == null)) {
                this.r.B0(fragment);
            }
        }
        if (!this.p) {
            k kVar = this.r;
            kVar.C0(kVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            s.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.z1(k.T0(this.f));
            }
            switch (aVar.a) {
                case 1:
                    fragment.y1(aVar.f);
                    this.r.X0(fragment, true);
                    this.r.O0(fragment);
                    break;
                case 3:
                    fragment.y1(aVar.e);
                    this.r.d(fragment);
                    break;
                case 4:
                    fragment.y1(aVar.e);
                    this.r.b1(fragment);
                    break;
                case 5:
                    fragment.y1(aVar.f);
                    this.r.X0(fragment, true);
                    this.r.q0(fragment);
                    break;
                case 6:
                    fragment.y1(aVar.e);
                    this.r.i(fragment);
                    break;
                case 7:
                    fragment.y1(aVar.f);
                    this.r.X0(fragment, true);
                    this.r.r(fragment);
                    break;
                case 8:
                    this.r.Z0((Fragment) null);
                    break;
                case 9:
                    this.r.Z0(fragment);
                    break;
                case 10:
                    this.r.Y0(fragment, aVar.g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!(this.p || aVar.a == 3 || fragment == null)) {
                this.r.B0(fragment);
            }
        }
        if (!this.p && z) {
            k kVar = this.r;
            kVar.C0(kVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment C(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.a.size()) {
            s.a aVar = this.a.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i3 = fragment3.A;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.A == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.a.add(i, new s.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                s.a aVar2 = new s.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.a.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.a.add(i, new s.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.a.add(i, new s.a(9, fragment2));
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public String D() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean E(int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.a.get(i2).b;
            int i3 = fragment != null ? fragment.A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean F(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.a.get(i4).b;
            int i5 = fragment != null ? fragment.A : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.a.get(i7).b;
                        if ((fragment2 != null ? fragment2.A : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        for (int i = 0; i < this.a.size(); i++) {
            if (G(this.a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void I() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void J(Fragment.e eVar) {
        for (int i = 0; i < this.a.size(); i++) {
            s.a aVar = this.a.get(i);
            if (G(aVar)) {
                aVar.b.A1(eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment K(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            s.a aVar = this.a.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (k.s0(2)) {
            "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.b(this);
        return true;
    }

    public int i() {
        return x(false);
    }

    public int j() {
        return x(true);
    }

    public void k() {
        n();
        this.r.S(this, false);
    }

    public void l() {
        n();
        this.r.S(this, true);
    }

    public s m(Fragment fragment) {
        k kVar = fragment.v;
        if (kVar == null || kVar == this.r) {
            super.m(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void o(int i, Fragment fragment, String str, int i2) {
        super.o(i, fragment, str, i2);
        fragment.v = this.r;
    }

    public s p(Fragment fragment) {
        k kVar = fragment.v;
        if (kVar == null || kVar == this.r) {
            super.p(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    public s u(Fragment fragment, h.b bVar) {
        if (fragment.v != this.r) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.r);
        } else if (bVar.isAtLeast(h.b.CREATED)) {
            super.u(fragment, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + h.b.CREATED);
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i) {
        if (this.g) {
            if (k.s0(2)) {
                "Bump nesting in " + this + " by " + i;
            }
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                s.a aVar = this.a.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.u += i;
                    if (k.s0(2)) {
                        "Bump nesting of " + aVar.b + " to " + aVar.b.u;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int x(boolean z) {
        if (!this.s) {
            if (k.s0(2)) {
                "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new o3("FragmentManager"));
                y("  ", printWriter);
                printWriter.close();
            }
            this.s = true;
            this.t = this.g ? this.r.g() : -1;
            this.r.P(this, z);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }

    public void y(String str, PrintWriter printWriter) {
        z(str, printWriter, true);
    }

    public void z(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.j == 0 && this.k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                s.a aVar = this.a.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }
}
