package defpackage;

import defpackage.sy0;
import java.util.List;
import java.util.Map;

/* renamed from: ey0  reason: default package */
final class ey0 implements k21 {
    private final cy0 a;

    private ey0(cy0 cy0) {
        uy0.f(cy0, "output");
        cy0 cy02 = cy0;
        this.a = cy02;
        cy02.a = this;
    }

    public static ey0 O(cy0 cy0) {
        ey0 ey0 = cy0.a;
        return ey0 != null ? ey0 : new ey0(cy0);
    }

    public final void A(int i, int i2) {
        this.a.P(i, i2);
    }

    public final void B(int i, List<?> list, u01 u01) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            H(i, list.get(i2), u01);
        }
    }

    public final void C(int i, lx0 lx0) {
        this.a.o(i, lx0);
    }

    public final void D(int i, int i2) {
        this.a.P(i, i2);
    }

    public final void E(int i, Object obj) {
        if (obj instanceof lx0) {
            this.a.R(i, (lx0) obj);
        } else {
            this.a.p(i, (f01) obj);
        }
    }

    public final void F(int i, String str) {
        this.a.r(i, str);
    }

    public final void G(int i, int i2) {
        this.a.g0(i, i2);
    }

    public final void H(int i, Object obj, u01 u01) {
        cy0 cy0 = this.a;
        cy0.m(i, 3);
        u01.g((f01) obj, cy0.a);
        cy0.m(i, 4);
    }

    public final void I(int i, List<?> list, u01 u01) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), u01);
        }
    }

    public final void J(int i, int i2) {
        this.a.k0(i, i2);
    }

    public final void K(int i, long j) {
        this.a.Z(i, j);
    }

    public final void L(int i, int i2) {
        this.a.Y(i, i2);
    }

    public final void M(int i, long j) {
        this.a.Q(i, j);
    }

    public final void N(int i, Object obj, u01 u01) {
        this.a.q(i, (f01) obj, u01);
    }

    public final void a(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.L(list.get(i4).booleanValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.y(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.s(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void b(int i, long j) {
        this.a.Z(i, j);
    }

    public final void c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.l0(list.get(i4).intValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void d(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.C0(list.get(i4).intValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void e(int i) {
        this.a.m(i, 4);
    }

    public final void f(int i) {
        this.a.m(i, 3);
    }

    public final void g(int i, long j) {
        this.a.n(i, j);
    }

    public final void h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.e0(list.get(i4).longValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.w0(list.get(i4).longValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.x0(list.get(i4).intValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.p0(list.get(i4).intValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.Y(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void l(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.A0(list.get(i4).intValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void m(int i, int i2) {
        this.a.k0(i, i2);
    }

    public final void n(int i, long j) {
        this.a.n(i, j);
    }

    public final void o(int i, double d) {
        this.a.k(i, d);
    }

    public final void p(int i, float f) {
        this.a.l(i, f);
    }

    public final void q(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.s0(list.get(i4).longValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void r(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.o0(list.get(i4).longValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.Q(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void s(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.j0(list.get(i4).longValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void t(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.t0(list.get(i4).intValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.X(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.g0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void u(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.z(list.get(i4).doubleValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.k(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void v(int i, List<lx0> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.o(i, list.get(i2));
        }
    }

    public final void w(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += cy0.A(list.get(i4).floatValue());
            }
            this.a.O(i3);
            while (i2 < list.size()) {
                this.a.i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.l(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void x(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof lz0) {
            lz0 lz0 = (lz0) list;
            while (i2 < list.size()) {
                Object e = lz0.e(i2);
                if (e instanceof String) {
                    this.a.r(i, (String) e);
                } else {
                    this.a.o(i, (lx0) e);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.r(i, list.get(i2));
            i2++;
        }
    }

    public final <K, V> void y(int i, vz0<K, V> vz0, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.a.m(i, 2);
            this.a.O(wz0.a(vz0, next.getKey(), next.getValue()));
            wz0.b(this.a, vz0, next.getKey(), next.getValue());
        }
    }

    public final void z(int i, boolean z) {
        this.a.s(i, z);
    }

    public final int zza() {
        return sy0.e.k;
    }
}
