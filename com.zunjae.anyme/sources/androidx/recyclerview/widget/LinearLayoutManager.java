package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    private boolean A;
    boolean B;
    private boolean C;
    private boolean D;
    int E;
    int F;
    private boolean G;
    d H;
    final a I;
    private final b J;
    private int K;
    private int[] L;
    int w;
    private c x;
    n y;
    private boolean z;

    static class a {
        n a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i) {
            this.c = this.d ? this.a.d(view) + this.a.o() : this.a.g(view);
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e2 = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e2 - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.c() && layoutParams.a() >= 0 && layoutParams.a() < zVar.b();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    protected static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class c {
        boolean a = true;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h = 0;
        int i = 0;
        boolean j;
        int k;
        List<RecyclerView.c0> l = null;
        boolean m;

        c() {
        }

        private View e() {
            int size = this.l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.l.get(i2).e;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.c() && this.d == layoutParams.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f2 = f(view);
            this.d = f2 == null ? -1 : ((RecyclerView.LayoutParams) f2.getLayoutParams()).a();
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.z zVar) {
            int i2 = this.d;
            return i2 >= 0 && i2 < zVar.b();
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.u uVar) {
            if (this.l != null) {
                return e();
            }
            View o = uVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public View f(View view) {
            int a2;
            int size = this.l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.l.get(i3).e;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.c() && (a2 = (layoutParams.a() - this.d) * this.e) >= 0 && a2 < i2) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i2 = a2;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        int e;
        int f;
        boolean g;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.e >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.e = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z2) {
        this.w = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.H = null;
        this.I = new a();
        this.J = new b();
        this.K = 2;
        this.L = new int[2];
        M2(i);
        N2(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.w = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.H = null;
        this.I = new a();
        this.J = new b();
        this.K = 2;
        this.L = new int[2];
        RecyclerView.o.d o0 = RecyclerView.o.o0(context, attributeSet, i, i2);
        M2(o0.a);
        N2(o0.c);
        O2(o0.d);
    }

    private void D2(RecyclerView.u uVar, RecyclerView.z zVar, int i, int i2) {
        RecyclerView.u uVar2 = uVar;
        RecyclerView.z zVar2 = zVar;
        if (zVar.g() && T() != 0 && !zVar.e() && U1()) {
            List<RecyclerView.c0> k = uVar.k();
            int size = k.size();
            int n0 = n0(S(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.c0 c0Var = k.get(i5);
                if (!c0Var.v()) {
                    char c2 = 1;
                    if ((c0Var.m() < n0) != this.B) {
                        c2 = 65535;
                    }
                    int e = this.y.e(c0Var.e);
                    if (c2 == 65535) {
                        i3 += e;
                    } else {
                        i4 += e;
                    }
                }
            }
            this.x.l = k;
            if (i3 > 0) {
                V2(n0(x2()), i);
                c cVar = this.x;
                cVar.h = i3;
                cVar.c = 0;
                cVar.a();
                d2(uVar2, this.x, zVar2, false);
            }
            if (i4 > 0) {
                T2(n0(w2()), i2);
                c cVar2 = this.x;
                cVar2.h = i4;
                cVar2.c = 0;
                cVar2.a();
                d2(uVar2, this.x, zVar2, false);
            }
            this.x.l = null;
        }
    }

    private void F2(RecyclerView.u uVar, c cVar) {
        if (cVar.a && !cVar.m) {
            int i = cVar.g;
            int i2 = cVar.i;
            if (cVar.f == -1) {
                H2(uVar, i, i2);
            } else {
                I2(uVar, i, i2);
            }
        }
    }

    private void G2(RecyclerView.u uVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    v1(i3, uVar);
                }
                return;
            }
            while (i > i2) {
                v1(i, uVar);
                i--;
            }
        }
    }

    private void H2(RecyclerView.u uVar, int i, int i2) {
        int T = T();
        if (i >= 0) {
            int h = (this.y.h() - i) + i2;
            if (this.B) {
                for (int i3 = 0; i3 < T; i3++) {
                    View S = S(i3);
                    if (this.y.g(S) < h || this.y.q(S) < h) {
                        G2(uVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = T - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View S2 = S(i5);
                if (this.y.g(S2) < h || this.y.q(S2) < h) {
                    G2(uVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void I2(RecyclerView.u uVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int T = T();
            if (this.B) {
                int i4 = T - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View S = S(i5);
                    if (this.y.d(S) > i3 || this.y.p(S) > i3) {
                        G2(uVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < T; i6++) {
                View S2 = S(i6);
                if (this.y.d(S2) > i3 || this.y.p(S2) > i3) {
                    G2(uVar, 0, i6);
                    return;
                }
            }
        }
    }

    private void K2() {
        this.B = (this.w == 1 || !A2()) ? this.A : !this.A;
    }

    private boolean P2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        boolean z2 = false;
        if (T() == 0) {
            return false;
        }
        View f0 = f0();
        if (f0 != null && aVar.d(f0, zVar)) {
            aVar.c(f0, n0(f0));
            return true;
        } else if (this.z != this.C) {
            return false;
        } else {
            View s2 = aVar.d ? s2(uVar, zVar) : t2(uVar, zVar);
            if (s2 == null) {
                return false;
            }
            aVar.b(s2, n0(s2));
            if (!zVar.e() && U1()) {
                if (this.y.g(s2) >= this.y.i() || this.y.d(s2) < this.y.m()) {
                    z2 = true;
                }
                if (z2) {
                    aVar.c = aVar.d ? this.y.i() : this.y.m();
                }
            }
            return true;
        }
    }

    private boolean Q2(RecyclerView.z zVar, a aVar) {
        int i;
        boolean z2 = false;
        if (!zVar.e() && (i = this.E) != -1) {
            if (i < 0 || i >= zVar.b()) {
                this.E = -1;
                this.F = Integer.MIN_VALUE;
            } else {
                aVar.b = this.E;
                d dVar = this.H;
                if (dVar != null && dVar.a()) {
                    boolean z3 = this.H.g;
                    aVar.d = z3;
                    aVar.c = z3 ? this.y.i() - this.H.f : this.y.m() + this.H.f;
                    return true;
                } else if (this.F == Integer.MIN_VALUE) {
                    View M = M(this.E);
                    if (M == null) {
                        if (T() > 0) {
                            if ((this.E < n0(S(0))) == this.B) {
                                z2 = true;
                            }
                            aVar.d = z2;
                        }
                        aVar.a();
                    } else if (this.y.e(M) > this.y.n()) {
                        aVar.a();
                        return true;
                    } else if (this.y.g(M) - this.y.m() < 0) {
                        aVar.c = this.y.m();
                        aVar.d = false;
                        return true;
                    } else if (this.y.i() - this.y.d(M) < 0) {
                        aVar.c = this.y.i();
                        aVar.d = true;
                        return true;
                    } else {
                        aVar.c = aVar.d ? this.y.d(M) + this.y.o() : this.y.g(M);
                    }
                    return true;
                } else {
                    boolean z4 = this.B;
                    aVar.d = z4;
                    aVar.c = z4 ? this.y.i() - this.F : this.y.m() + this.F;
                    return true;
                }
            }
        }
        return false;
    }

    private void R2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (!Q2(zVar, aVar) && !P2(uVar, zVar, aVar)) {
            aVar.a();
            aVar.b = this.C ? zVar.b() - 1 : 0;
        }
    }

    private void S2(int i, int i2, boolean z2, RecyclerView.z zVar) {
        int i3;
        this.x.m = J2();
        this.x.f = i;
        int[] iArr = this.L;
        boolean z3 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        V1(zVar, iArr);
        int max = Math.max(0, this.L[0]);
        int max2 = Math.max(0, this.L[1]);
        if (i == 1) {
            z3 = true;
        }
        this.x.h = z3 ? max2 : max;
        c cVar = this.x;
        if (!z3) {
            max = max2;
        }
        cVar.i = max;
        if (z3) {
            this.x.h += this.y.j();
            View w2 = w2();
            c cVar2 = this.x;
            if (this.B) {
                i4 = -1;
            }
            cVar2.e = i4;
            c cVar3 = this.x;
            int n0 = n0(w2);
            c cVar4 = this.x;
            cVar3.d = n0 + cVar4.e;
            cVar4.b = this.y.d(w2);
            i3 = this.y.d(w2) - this.y.i();
        } else {
            View x2 = x2();
            this.x.h += this.y.m();
            c cVar5 = this.x;
            if (!this.B) {
                i4 = -1;
            }
            cVar5.e = i4;
            c cVar6 = this.x;
            int n02 = n0(x2);
            c cVar7 = this.x;
            cVar6.d = n02 + cVar7.e;
            cVar7.b = this.y.g(x2);
            i3 = (-this.y.g(x2)) + this.y.m();
        }
        c cVar8 = this.x;
        cVar8.c = i2;
        if (z2) {
            cVar8.c = i2 - i3;
        }
        this.x.g = i3;
    }

    private void T2(int i, int i2) {
        this.x.c = this.y.i() - i2;
        this.x.e = this.B ? -1 : 1;
        c cVar = this.x;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void U2(a aVar) {
        T2(aVar.b, aVar.c);
    }

    private void V2(int i, int i2) {
        this.x.c = i2 - this.y.m();
        c cVar = this.x;
        cVar.d = i;
        cVar.e = this.B ? 1 : -1;
        c cVar2 = this.x;
        cVar2.f = -1;
        cVar2.b = i2;
        cVar2.g = Integer.MIN_VALUE;
    }

    private void W2(a aVar) {
        V2(aVar.b, aVar.c);
    }

    private int X1(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        c2();
        n nVar = this.y;
        View i2 = i2(!this.D, true);
        return q.a(zVar, nVar, i2, h2(!this.D, true), this, this.D);
    }

    private int Y1(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        c2();
        n nVar = this.y;
        View i2 = i2(!this.D, true);
        return q.b(zVar, nVar, i2, h2(!this.D, true), this, this.D, this.B);
    }

    private int Z1(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        c2();
        n nVar = this.y;
        View i2 = i2(!this.D, true);
        return q.c(zVar, nVar, i2, h2(!this.D, true), this, this.D);
    }

    private View f2() {
        return n2(0, T());
    }

    private View g2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return r2(uVar, zVar, 0, T(), zVar.b());
    }

    private View k2() {
        return n2(T() - 1, -1);
    }

    private View l2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return r2(uVar, zVar, T() - 1, -1, zVar.b());
    }

    private View p2() {
        return this.B ? f2() : k2();
    }

    private View q2() {
        return this.B ? k2() : f2();
    }

    private View s2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.B ? g2(uVar, zVar) : l2(uVar, zVar);
    }

    private View t2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.B ? l2(uVar, zVar) : g2(uVar, zVar);
    }

    private int u2(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z2) {
        int i2;
        int i3 = this.y.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -L2(-i3, uVar, zVar);
        int i5 = i + i4;
        if (!z2 || (i2 = this.y.i() - i5) <= 0) {
            return i4;
        }
        this.y.r(i2);
        return i2 + i4;
    }

    private int v2(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z2) {
        int m;
        int m2 = i - this.y.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -L2(m2, uVar, zVar);
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.y.m()) <= 0) {
            return i2;
        }
        this.y.r(-m);
        return i2 - m;
    }

    private View w2() {
        return S(this.B ? 0 : T() - 1);
    }

    private View x2() {
        return S(this.B ? T() - 1 : 0);
    }

    public int A(RecyclerView.z zVar) {
        return X1(zVar);
    }

    /* access modifiers changed from: protected */
    public boolean A2() {
        return j0() == 1;
    }

    public int B(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    public boolean B2() {
        return this.D;
    }

    public int C(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    /* access modifiers changed from: package-private */
    public void C2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d2 = cVar.d(uVar);
        if (d2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) d2.getLayoutParams();
        if (cVar.l == null) {
            if (this.B == (cVar.f == -1)) {
                n(d2);
            } else {
                o(d2, 0);
            }
        } else {
            if (this.B == (cVar.f == -1)) {
                l(d2);
            } else {
                m(d2, 0);
            }
        }
        H0(d2, 0, 0);
        bVar.a = this.y.e(d2);
        if (this.w == 1) {
            if (A2()) {
                i5 = u0() - getPaddingRight();
                i4 = i5 - this.y.f(d2);
            } else {
                i4 = getPaddingLeft();
                i5 = this.y.f(d2) + i4;
            }
            int i6 = cVar.f;
            int i7 = cVar.b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.y.f(d2) + paddingTop;
            int i8 = cVar.f;
            int i9 = cVar.b;
            if (i8 == -1) {
                i2 = i9;
                i3 = paddingTop;
                i = f;
                i4 = i9 - bVar.a;
            } else {
                i3 = paddingTop;
                i2 = bVar.a + i9;
                i = f;
                i4 = i9;
            }
        }
        G0(d2, i4, i3, i2, i);
        if (layoutParams.c() || layoutParams.b()) {
            bVar.c = true;
        }
        bVar.d = d2.hasFocusable();
    }

    public int D(RecyclerView.z zVar) {
        return X1(zVar);
    }

    public int E(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    public int E1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.w == 1) {
            return 0;
        }
        return L2(i, uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public void E2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i) {
    }

    public int F(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    public void F1(int i) {
        this.E = i;
        this.F = Integer.MIN_VALUE;
        d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
        B1();
    }

    public int G1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.w == 0) {
            return 0;
        }
        return L2(i, uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public boolean J2() {
        return this.y.k() == 0 && this.y.h() == 0;
    }

    /* access modifiers changed from: package-private */
    public int L2(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (T() == 0 || i == 0) {
            return 0;
        }
        c2();
        this.x.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        S2(i2, abs, true, zVar);
        c cVar = this.x;
        int d2 = cVar.g + d2(uVar, cVar, zVar, false);
        if (d2 < 0) {
            return 0;
        }
        if (abs > d2) {
            i = i2 * d2;
        }
        this.y.r(-i);
        this.x.k = i;
        return i;
    }

    public View M(int i) {
        int T = T();
        if (T == 0) {
            return null;
        }
        int n0 = i - n0(S(0));
        if (n0 >= 0 && n0 < T) {
            View S = S(n0);
            if (n0(S) == i) {
                return S;
            }
        }
        return super.M(i);
    }

    public void M2(int i) {
        if (i == 0 || i == 1) {
            q((String) null);
            if (i != this.w || this.y == null) {
                n b2 = n.b(this, i);
                this.y = b2;
                this.I.a = b2;
                this.w = i;
                B1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public RecyclerView.LayoutParams N() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public void N2(boolean z2) {
        q((String) null);
        if (z2 != this.A) {
            this.A = z2;
            B1();
        }
    }

    public void O2(boolean z2) {
        q((String) null);
        if (this.C != z2) {
            this.C = z2;
            B1();
        }
    }

    public void P0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.P0(recyclerView, uVar);
        if (this.G) {
            s1(uVar);
            uVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P1() {
        return (h0() == 1073741824 || v0() == 1073741824 || !w0()) ? false : true;
    }

    public View Q0(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int a2;
        K2();
        if (T() == 0 || (a2 = a2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        c2();
        S2(a2, (int) (((float) this.y.n()) * 0.33333334f), false, zVar);
        c cVar = this.x;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        d2(uVar, cVar, zVar, true);
        View q2 = a2 == -1 ? q2() : p2();
        View x2 = a2 == -1 ? x2() : w2();
        if (!x2.hasFocusable()) {
            return q2;
        }
        if (q2 == null) {
            return null;
        }
        return x2;
    }

    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            accessibilityEvent.setFromIndex(j2());
            accessibilityEvent.setToIndex(m2());
        }
    }

    public void R1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        S1(jVar);
    }

    public boolean U1() {
        return this.H == null && this.z == this.C;
    }

    /* access modifiers changed from: protected */
    public void V1(RecyclerView.z zVar, int[] iArr) {
        int i;
        int y2 = y2(zVar);
        if (this.x.f == -1) {
            i = 0;
        } else {
            i = y2;
            y2 = 0;
        }
        iArr[0] = y2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    public void W1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i >= 0 && i < zVar.b()) {
            cVar2.a(i, Math.max(0, cVar.g));
        }
    }

    public PointF a(int i) {
        if (T() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < n0(S(0))) {
            z2 = true;
        }
        if (z2 != this.B) {
            i2 = -1;
        }
        return this.w == 0 ? new PointF((float) i2, Utils.FLOAT_EPSILON) : new PointF(Utils.FLOAT_EPSILON, (float) i2);
    }

    /* access modifiers changed from: package-private */
    public int a2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && A2()) ? -1 : 1 : (this.w != 1 && A2()) ? 1 : -1;
    }

    /* access modifiers changed from: package-private */
    public c b2() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void c2() {
        if (this.x == null) {
            this.x = b2();
        }
    }

    /* access modifiers changed from: package-private */
    public int d2(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z2) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            F2(uVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.J;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            C2(uVar, zVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !zVar.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    F2(uVar, cVar);
                }
                if (z2 && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public void e1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View M;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.H == null && this.E == -1) && zVar.b() == 0) {
            s1(uVar);
            return;
        }
        d dVar = this.H;
        if (dVar != null && dVar.a()) {
            this.E = this.H.e;
        }
        c2();
        this.x.a = false;
        K2();
        View f0 = f0();
        if (!this.I.e || this.E != -1 || this.H != null) {
            this.I.e();
            a aVar = this.I;
            aVar.d = this.B ^ this.C;
            R2(uVar, zVar, aVar);
            this.I.e = true;
        } else if (f0 != null && (this.y.g(f0) >= this.y.i() || this.y.d(f0) <= this.y.m())) {
            this.I.c(f0, n0(f0));
        }
        c cVar = this.x;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.L;
        iArr[0] = 0;
        iArr[1] = 0;
        V1(zVar, iArr);
        int max = Math.max(0, this.L[0]) + this.y.m();
        int max2 = Math.max(0, this.L[1]) + this.y.j();
        if (!(!zVar.e() || (i6 = this.E) == -1 || this.F == Integer.MIN_VALUE || (M = M(i6)) == null)) {
            if (this.B) {
                i7 = this.y.i() - this.y.d(M);
                i8 = this.F;
            } else {
                i8 = this.y.g(M) - this.y.m();
                i7 = this.F;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        if (!this.I.d ? !this.B : this.B) {
            i9 = 1;
        }
        E2(uVar, zVar, this.I, i9);
        G(uVar);
        this.x.m = J2();
        this.x.j = zVar.e();
        this.x.i = 0;
        a aVar2 = this.I;
        if (aVar2.d) {
            W2(aVar2);
            c cVar2 = this.x;
            cVar2.h = max;
            d2(uVar, cVar2, zVar, false);
            c cVar3 = this.x;
            i2 = cVar3.b;
            int i11 = cVar3.d;
            int i12 = cVar3.c;
            if (i12 > 0) {
                max2 += i12;
            }
            U2(this.I);
            c cVar4 = this.x;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            d2(uVar, cVar4, zVar, false);
            c cVar5 = this.x;
            i = cVar5.b;
            int i13 = cVar5.c;
            if (i13 > 0) {
                V2(i11, i2);
                c cVar6 = this.x;
                cVar6.h = i13;
                d2(uVar, cVar6, zVar, false);
                i2 = this.x.b;
            }
        } else {
            U2(aVar2);
            c cVar7 = this.x;
            cVar7.h = max2;
            d2(uVar, cVar7, zVar, false);
            c cVar8 = this.x;
            i = cVar8.b;
            int i14 = cVar8.d;
            int i15 = cVar8.c;
            if (i15 > 0) {
                max += i15;
            }
            W2(this.I);
            c cVar9 = this.x;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            d2(uVar, cVar9, zVar, false);
            c cVar10 = this.x;
            i2 = cVar10.b;
            int i16 = cVar10.c;
            if (i16 > 0) {
                T2(i14, i);
                c cVar11 = this.x;
                cVar11.h = i16;
                d2(uVar, cVar11, zVar, false);
                i = this.x.b;
            }
        }
        if (T() > 0) {
            if (this.B ^ this.C) {
                int u2 = u2(i, uVar, zVar, true);
                i4 = i2 + u2;
                i3 = i + u2;
                i5 = v2(i4, uVar, zVar, false);
            } else {
                int v2 = v2(i2, uVar, zVar, true);
                i4 = i2 + v2;
                i3 = i + v2;
                i5 = u2(i3, uVar, zVar, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        D2(uVar, zVar, i2, i);
        if (!zVar.e()) {
            this.y.s();
        } else {
            this.I.e();
        }
        this.z = this.C;
    }

    public int e2() {
        View o2 = o2(0, T(), true, false);
        if (o2 == null) {
            return -1;
        }
        return n0(o2);
    }

    public void f1(RecyclerView.z zVar) {
        super.f1(zVar);
        this.H = null;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.I.e();
    }

    /* access modifiers changed from: package-private */
    public View h2(boolean z2, boolean z3) {
        int T;
        int i;
        if (this.B) {
            T = 0;
            i = T();
        } else {
            T = T() - 1;
            i = -1;
        }
        return o2(T, i, z2, z3);
    }

    /* access modifiers changed from: package-private */
    public View i2(boolean z2, boolean z3) {
        int i;
        int T;
        if (this.B) {
            i = T() - 1;
            T = -1;
        } else {
            i = 0;
            T = T();
        }
        return o2(i, T, z2, z3);
    }

    public void j1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.H = (d) parcelable;
            B1();
        }
    }

    public int j2() {
        View o2 = o2(0, T(), false, true);
        if (o2 == null) {
            return -1;
        }
        return n0(o2);
    }

    public Parcelable k1() {
        if (this.H != null) {
            return new d(this.H);
        }
        d dVar = new d();
        if (T() > 0) {
            c2();
            boolean z2 = this.z ^ this.B;
            dVar.g = z2;
            if (z2) {
                View w2 = w2();
                dVar.f = this.y.i() - this.y.d(w2);
                dVar.e = n0(w2);
            } else {
                View x2 = x2();
                dVar.e = n0(x2);
                dVar.f = this.y.g(x2) - this.y.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    public int m2() {
        View o2 = o2(T() - 1, -1, false, true);
        if (o2 == null) {
            return -1;
        }
        return n0(o2);
    }

    /* access modifiers changed from: package-private */
    public View n2(int i, int i2) {
        int i3;
        int i4;
        c2();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return S(i);
        }
        if (this.y.g(S(i)) < this.y.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.w == 0 ? this.i : this.j).a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    public View o2(int i, int i2, boolean z2, boolean z3) {
        c2();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        return (this.w == 0 ? this.i : this.j).a(i, i2, i4, i3);
    }

    public void q(String str) {
        if (this.H == null) {
            super.q(str);
        }
    }

    /* access modifiers changed from: package-private */
    public View r2(RecyclerView.u uVar, RecyclerView.z zVar, int i, int i2, int i3) {
        c2();
        int m = this.y.m();
        int i4 = this.y.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View S = S(i);
            int n0 = n0(S);
            if (n0 >= 0 && n0 < i3) {
                if (((RecyclerView.LayoutParams) S.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = S;
                    }
                } else if (this.y.g(S) < i4 && this.y.d(S) >= m) {
                    return S;
                } else {
                    if (view == null) {
                        view = S;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public boolean u() {
        return this.w == 0;
    }

    public boolean v() {
        return this.w == 1;
    }

    public void y(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.w != 0) {
            i = i2;
        }
        if (T() != 0 && i != 0) {
            c2();
            S2(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
            W1(zVar, this.x, cVar);
        }
    }

    public boolean y0() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int y2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.y.n();
        }
        return 0;
    }

    public void z(int i, RecyclerView.o.c cVar) {
        boolean z2;
        int i2;
        d dVar = this.H;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            K2();
            z2 = this.B;
            i2 = this.E;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.H;
            z2 = dVar2.g;
            i2 = dVar2.e;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.K && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int z2() {
        return this.w;
    }
}
