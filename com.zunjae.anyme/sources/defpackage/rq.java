package defpackage;

import android.view.Surface;
import com.google.android.exoplayer2.b0;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.video.s;
import com.google.android.exoplayer2.video.t;
import defpackage.f00;
import defpackage.g00;
import defpackage.sq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: rq  reason: default package */
public class rq implements r0.a, dy, fr, t, g00, f.a, ls, s, dr {
    private final CopyOnWriteArraySet<sq> e = new CopyOnWriteArraySet<>();
    private final r40 f;
    private final b1.c g = new b1.c();
    private final b h = new b();
    private r0 i;

    /* renamed from: rq$a */
    private static final class a {
        public final f00.a a;
        public final b1 b;
        public final int c;

        public a(f00.a aVar, b1 b1Var, int i) {
            this.a = aVar;
            this.b = b1Var;
            this.c = i;
        }
    }

    /* renamed from: rq$b */
    private static final class b {
        /* access modifiers changed from: private */
        public final ArrayList<a> a = new ArrayList<>();
        private final HashMap<f00.a, a> b = new HashMap<>();
        private final b1.b c = new b1.b();
        private a d;
        private a e;
        private a f;
        private b1 g = b1.a;
        private boolean h;

        private a p(a aVar, b1 b1Var) {
            int b2 = b1Var.b(aVar.a.a);
            if (b2 == -1) {
                return aVar;
            }
            return new a(aVar.a, b1Var, b1Var.f(b2, this.c).c);
        }

        public a b() {
            return this.e;
        }

        public a c() {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<a> arrayList = this.a;
            return arrayList.get(arrayList.size() - 1);
        }

        public a d(f00.a aVar) {
            return this.b.get(aVar);
        }

        public a e() {
            if (this.a.isEmpty() || this.g.q() || this.h) {
                return null;
            }
            return this.a.get(0);
        }

        public a f() {
            return this.f;
        }

        public boolean g() {
            return this.h;
        }

        public void h(int i, f00.a aVar) {
            int b2 = this.g.b(aVar.a);
            boolean z = b2 != -1;
            b1 b1Var = z ? this.g : b1.a;
            if (z) {
                i = this.g.f(b2, this.c).c;
            }
            a aVar2 = new a(aVar, b1Var, i);
            this.a.add(aVar2);
            this.b.put(aVar, aVar2);
            this.d = this.a.get(0);
            if (this.a.size() == 1 && !this.g.q()) {
                this.e = this.d;
            }
        }

        public boolean i(f00.a aVar) {
            a remove = this.b.remove(aVar);
            if (remove == null) {
                return false;
            }
            this.a.remove(remove);
            a aVar2 = this.f;
            if (aVar2 != null && aVar.equals(aVar2.a)) {
                this.f = this.a.isEmpty() ? null : this.a.get(0);
            }
            if (this.a.isEmpty()) {
                return true;
            }
            this.d = this.a.get(0);
            return true;
        }

        public void j(int i) {
            this.e = this.d;
        }

        public void k(f00.a aVar) {
            this.f = this.b.get(aVar);
        }

        public void l() {
            this.h = false;
            this.e = this.d;
        }

        public void m() {
            this.h = true;
        }

        public void n(b1 b1Var) {
            for (int i = 0; i < this.a.size(); i++) {
                a p = p(this.a.get(i), b1Var);
                this.a.set(i, p);
                this.b.put(p.a, p);
            }
            a aVar = this.f;
            if (aVar != null) {
                this.f = p(aVar, b1Var);
            }
            this.g = b1Var;
            this.e = this.d;
        }

        public a o(int i) {
            a aVar = null;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                a aVar2 = this.a.get(i2);
                int b2 = this.g.b(aVar2.a.a);
                if (b2 != -1 && this.g.f(b2, this.c).c == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = aVar2;
                }
            }
            return aVar;
        }
    }

    public rq(r40 r40) {
        q40.e(r40);
        this.f = r40;
    }

    private sq.a T(a aVar) {
        q40.e(this.i);
        if (aVar == null) {
            int w = this.i.w();
            a o = this.h.o(w);
            if (o == null) {
                b1 N = this.i.N();
                if (!(w < N.p())) {
                    N = b1.a;
                }
                return S(N, w, (f00.a) null);
            }
            aVar = o;
        }
        return S(aVar.b, aVar.c, aVar.a);
    }

    private sq.a U() {
        return T(this.h.b());
    }

    private sq.a V() {
        return T(this.h.c());
    }

    private sq.a W(int i2, f00.a aVar) {
        q40.e(this.i);
        if (aVar != null) {
            a d = this.h.d(aVar);
            return d != null ? T(d) : S(b1.a, i2, aVar);
        }
        b1 N = this.i.N();
        if (!(i2 < N.p())) {
            N = b1.a;
        }
        return S(N, i2, (f00.a) null);
    }

    private sq.a X() {
        return T(this.h.e());
    }

    private sq.a Y() {
        return T(this.h.f());
    }

    public final void A(int i2) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().s(X, i2);
        }
    }

    public final void B(int i2, f00.a aVar, g00.b bVar, g00.c cVar) {
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().E(W, bVar, cVar);
        }
    }

    public final void C(int i2, f00.a aVar, g00.b bVar, g00.c cVar, IOException iOException, boolean z) {
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().p(W, bVar, cVar, iOException, z);
        }
    }

    @Deprecated
    public /* synthetic */ void D(b1 b1Var, Object obj, int i2) {
        q0.l(this, b1Var, obj, i2);
    }

    public final void E() {
    }

    public final void F(f0 f0Var) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().e(Y, 2, f0Var);
        }
    }

    public final void G(zr zrVar) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().q(X, 2, zrVar);
        }
    }

    public final void H(int i2, f00.a aVar) {
        sq.a W = W(i2, aVar);
        if (this.h.i(aVar)) {
            Iterator<sq> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().u(W);
            }
        }
    }

    public final void I(f0 f0Var) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().e(Y, 1, f0Var);
        }
    }

    public final void J(int i2, f00.a aVar) {
        this.h.h(i2, aVar);
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().C(W);
        }
    }

    public final void K(int i2, long j, long j2) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().o(Y, i2, j, j2);
        }
    }

    public final void L(p00 p00, i40 i40) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().w(X, p00, i40);
        }
    }

    public final void M(zr zrVar) {
        sq.a U = U();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().H(U, 2, zrVar);
        }
    }

    public void N(int i2, int i3) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().y(Y, i2, i3);
        }
    }

    public final void O() {
        sq.a U = U();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().j(U);
        }
    }

    public final void P(int i2, f00.a aVar, g00.c cVar) {
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().x(W, cVar);
        }
    }

    public final void Q() {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().I(Y);
        }
    }

    public void R(boolean z) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().A(X, z);
        }
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    public sq.a S(b1 b1Var, int i2, f00.a aVar) {
        if (b1Var.q()) {
            aVar = null;
        }
        f00.a aVar2 = aVar;
        long a2 = this.f.a();
        boolean z = true;
        boolean z2 = b1Var == this.i.N() && i2 == this.i.w();
        long j = 0;
        if (aVar2 != null && aVar2.a()) {
            if (!(z2 && this.i.F() == aVar2.b && this.i.s() == aVar2.c)) {
                z = false;
            }
            if (z) {
                j = this.i.V();
            }
        } else if (z2) {
            j = this.i.A();
        } else if (!b1Var.q()) {
            j = b1Var.n(i2, this.g).a();
        }
        return new sq.a(a2, b1Var, i2, aVar2, j, this.i.V(), this.i.g());
    }

    public final void Z() {
        if (!this.h.g()) {
            sq.a X = X();
            this.h.m();
            Iterator<sq> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().F(X);
            }
        }
    }

    public final void a(int i2) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().K(Y, i2);
        }
    }

    public final void a0() {
        for (a aVar : new ArrayList(this.h.a)) {
            H(aVar.c, aVar.a);
        }
    }

    public final void b(int i2, int i3, int i4, float f2) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b(Y, i2, i3, i4, f2);
        }
    }

    public void b0(r0 r0Var) {
        q40.f(this.i == null || this.h.a.isEmpty());
        q40.e(r0Var);
        this.i = r0Var;
    }

    public final void c(o0 o0Var) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().m(X, o0Var);
        }
    }

    public void d(int i2) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().l(X, i2);
        }
    }

    public final void e(boolean z) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().n(X, z);
        }
    }

    public final void f(int i2) {
        this.h.j(i2);
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().h(X, i2);
        }
    }

    public final void g(zr zrVar) {
        sq.a U = U();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().H(U, 1, zrVar);
        }
    }

    public final void h(zr zrVar) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().q(X, 1, zrVar);
        }
    }

    public final void i(String str, long j, long j2) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().g(Y, 2, str, j2);
        }
    }

    public final void j(b0 b0Var) {
        sq.a U = U();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().L(U, b0Var);
        }
    }

    public final void k(int i2, f00.a aVar, g00.b bVar, g00.c cVar) {
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c(W, bVar, cVar);
        }
    }

    public final void l() {
        if (this.h.g()) {
            this.h.l();
            sq.a X = X();
            Iterator<sq> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().f(X);
            }
        }
    }

    public final void m() {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().k(Y);
        }
    }

    public final void n(b1 b1Var, int i2) {
        this.h.n(b1Var);
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().D(X, i2);
        }
    }

    public final void o(int i2, f00.a aVar) {
        this.h.k(aVar);
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().J(W);
        }
    }

    public final void p(int i2, f00.a aVar, g00.b bVar, g00.c cVar) {
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().d(W, bVar, cVar);
        }
    }

    public final void q(Exception exc) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().i(Y, exc);
        }
    }

    public final void r(Surface surface) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().G(Y, surface);
        }
    }

    public final void s(int i2, long j, long j2) {
        sq.a V = V();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(V, i2, j, j2);
        }
    }

    public final void t(String str, long j, long j2) {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().g(Y, 1, str, j2);
        }
    }

    public final void u(boolean z) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().z(X, z);
        }
    }

    public final void v(yx yxVar) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().r(X, yxVar);
        }
    }

    public final void w() {
        sq.a Y = Y();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().v(Y);
        }
    }

    public final void x(int i2, long j) {
        sq.a U = U();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().B(U, i2, j);
        }
    }

    public final void y(int i2, f00.a aVar, g00.c cVar) {
        sq.a W = W(i2, aVar);
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().M(W, cVar);
        }
    }

    public final void z(boolean z, int i2) {
        sq.a X = X();
        Iterator<sq> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().t(X, z, i2);
        }
    }
}
