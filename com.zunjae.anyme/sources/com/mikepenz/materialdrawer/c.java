package com.mikepenz.materialdrawer;

import android.os.Bundle;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.m;
import defpackage.vn1;
import java.util.List;

public class c {
    protected final d a;
    private a b;
    private b c;
    private List<go1> d;
    private Bundle e;

    public interface a {
        boolean a(View view, int i, go1 go1);
    }

    public interface b {
        boolean a(View view, int i, go1 go1);
    }

    /* renamed from: com.mikepenz.materialdrawer.c$c  reason: collision with other inner class name */
    public interface C0154c {
        void a(View view);

        void b(View view);

        void c(View view, float f);
    }

    public interface d {
        boolean a(View view);
    }

    protected c(d dVar) {
        this.a = dVar;
    }

    private View l() {
        return this.a.O;
    }

    private void n(int i, boolean z) {
        if (z && i >= 0) {
            go1 Y = this.a.W.Y(i);
            if (Y instanceof qn1) {
                qn1 qn1 = (qn1) Y;
                if (qn1.w() != null) {
                    qn1.w().a((View) null, i, Y);
                }
            }
            a aVar = this.a.j0;
            if (aVar != null) {
                aVar.a((View) null, i, Y);
            }
        }
        this.a.o();
    }

    private void t(List<go1> list, boolean z) {
        if (this.d != null && !z) {
            this.d = list;
        }
        this.a.l().d(list);
    }

    public boolean A() {
        return (this.b == null && this.d == null && this.e == null) ? false : true;
    }

    public void B(long j, ln1 ln1) {
        go1 d2 = d(j);
        if (d2 instanceof fo1) {
            fo1 fo1 = (fo1) d2;
            fo1.p(ln1);
            C((go1) fo1);
        }
    }

    public void C(go1 go1) {
        D(go1, j(go1));
    }

    public void D(go1 go1, int i) {
        if (this.a.e(i, false)) {
            this.a.l().set(i, go1);
        }
    }

    public void a() {
        d dVar = this.a;
        DrawerLayout drawerLayout = dVar.q;
        if (drawerLayout != null) {
            drawerLayout.d(dVar.x.intValue());
        }
    }

    public com.mikepenz.fastadapter.b<go1> b() {
        return this.a.W;
    }

    /* access modifiers changed from: protected */
    public d c() {
        return this.a;
    }

    public go1 d(long j) {
        q3<go1, Integer> Z = b().Z(j);
        if (Z != null) {
            return (go1) Z.a;
        }
        return null;
    }

    public List<go1> e() {
        return this.a.l().i();
    }

    public vl1<go1, go1> f() {
        return this.a.Y;
    }

    public a g() {
        return this.a.j0;
    }

    public b h() {
        return this.a.k0;
    }

    public int i(long j) {
        return e.d(this.a, j);
    }

    public int j(go1 go1) {
        return i(go1.c());
    }

    public View k() {
        return this.a.M;
    }

    public boolean m() {
        d dVar = this.a;
        DrawerLayout drawerLayout = dVar.q;
        if (drawerLayout == null || dVar.r == null) {
            return false;
        }
        return drawerLayout.C(dVar.x.intValue());
    }

    public void o() {
        d dVar = this.a;
        DrawerLayout drawerLayout = dVar.q;
        if (drawerLayout != null && dVar.r != null) {
            drawerLayout.K(dVar.x.intValue());
        }
    }

    public void p(long j) {
        f().z(j);
    }

    public void q() {
        b bVar;
        if (A()) {
            u(this.b);
            v(this.c);
            t(this.d, true);
            b().F0(this.e);
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.a.U.r1(0);
            if (k() != null) {
                k().setVisibility(0);
            }
            if (l() != null) {
                l().setVisibility(0);
            }
            a aVar = this.a.y;
            if (aVar != null && (bVar = aVar.a) != null) {
                bVar.o = false;
            }
        }
    }

    public void r(View view, boolean z, boolean z2) {
        s(view, z, z2, (jn1) null);
    }

    public void s(View view, boolean z, boolean z2, jn1 jn1) {
        this.a.k().clear();
        if (z) {
            m<go1, go1> k = this.a.k();
            vn1 vn1 = new vn1();
            vn1.L(view);
            vn1.J(z2);
            vn1.K(jn1);
            vn1.M(vn1.b.TOP);
            k.e(vn1);
        } else {
            m<go1, go1> k2 = this.a.k();
            vn1 vn12 = new vn1();
            vn12.L(view);
            vn12.J(z2);
            vn12.K(jn1);
            vn12.M(vn1.b.NONE);
            k2.e(vn12);
        }
        RecyclerView recyclerView = this.a.U;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), 0, this.a.U.getPaddingRight(), this.a.U.getPaddingBottom());
    }

    public void u(a aVar) {
        this.a.j0 = aVar;
    }

    public void v(b bVar) {
        this.a.k0 = bVar;
    }

    public void w(long j) {
        x(j, true);
    }

    public void x(long j, boolean z) {
        jm1 jm1 = (jm1) b().T(jm1.class);
        if (jm1 != null) {
            jm1.m();
            jm1.z(j, false, true);
            q3<go1, Integer> Z = b().Z(j);
            if (Z != null) {
                Integer num = (Integer) Z.b;
                n(num != null ? num.intValue() : -1, z);
            }
        }
    }

    public boolean y(int i, boolean z) {
        jm1 jm1;
        if (!(this.a.U == null || (jm1 = (jm1) b().T(jm1.class)) == null)) {
            jm1.m();
            jm1.w(i, false);
            n(i, z);
        }
        return false;
    }

    public void z(a aVar, b bVar, List<go1> list, int i) {
        if (!A()) {
            this.b = g();
            this.c = h();
            com.mikepenz.fastadapter.b<go1> b2 = b();
            Bundle bundle = new Bundle();
            b2.w0(bundle);
            this.e = bundle;
            this.a.a0.o(false);
            this.d = e();
        }
        u(aVar);
        v(bVar);
        t(list, true);
        y(i, false);
        if (!this.a.d0) {
            if (k() != null) {
                k().setVisibility(8);
            }
            if (l() != null) {
                l().setVisibility(8);
            }
        }
    }
}
