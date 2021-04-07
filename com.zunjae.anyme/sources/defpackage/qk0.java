package defpackage;

import defpackage.cl0;
import java.util.List;
import java.util.Map;

/* renamed from: qk0  reason: default package */
final class qk0 implements qo0 {
    private final nk0 a;

    private qk0(nk0 nk0) {
        gl0.d(nk0, "output");
        nk0 nk02 = nk0;
        this.a = nk02;
        nk02.a = this;
    }

    public static qk0 e(nk0 nk0) {
        qk0 qk0 = nk0.a;
        return qk0 != null ? qk0 : new qk0(nk0);
    }

    public final void A(int i, Object obj, dn0 dn0) {
        nk0 nk0 = this.a;
        nk0.b(i, 3);
        dn0.f((pm0) obj, nk0.a);
        nk0.b(i, 4);
    }

    public final void B(int i, Object obj) {
        if (obj instanceof bk0) {
            this.a.L(i, (bk0) obj);
        } else {
            this.a.l(i, (pm0) obj);
        }
    }

    public final void C(int i, boolean z) {
        this.a.M(i, z);
    }

    public final void D(int i, Object obj, dn0 dn0) {
        this.a.m(i, (pm0) obj, dn0);
    }

    public final void E(int i, int i2) {
        this.a.j0(i, i2);
    }

    public final <K, V> void F(int i, gm0<K, V> gm0, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.a.b(i, 2);
            this.a.q(wk0.e(gm0.a, 1, next.getKey()) + wk0.e(gm0.b, 2, next.getValue()));
            nk0 nk0 = this.a;
            Object key = next.getKey();
            Object value = next.getValue();
            wk0.g(nk0, gm0.a, 1, key);
            wk0.g(nk0, gm0.b, 2, value);
        }
    }

    public final void G(int i, String str) {
        this.a.Y(i, str);
    }

    public final void H(int i, int i2) {
        this.a.m0(i, i2);
    }

    public final void I(int i, int i2) {
        this.a.k0(i, i2);
    }

    public final void J(int i, long j) {
        this.a.j(i, j);
    }

    public final void K(int i, int i2) {
        this.a.h0(i, i2);
    }

    public final void L(int i) {
        this.a.b(i, 3);
    }

    public final void M(int i, bk0 bk0) {
        this.a.k(i, bk0);
    }

    public final void N(int i) {
        this.a.b(i, 4);
    }

    public final void O(int i, int i2) {
        this.a.h0(i, i2);
    }

    public final void P(int i, List<?> list, dn0 dn0) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            D(i, list.get(i2), dn0);
        }
    }

    public final int Q() {
        return cl0.e.k;
    }

    public final void R(int i, List<?> list, dn0 dn0) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            A(i, list.get(i2), dn0);
        }
    }

    public final void a(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.z0(list.get(i4).booleanValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.w0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.M(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void b(int i, long j) {
        this.a.K(i, j);
    }

    public final void c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.w(list.get(i4).intValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void d(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.B(list.get(i4).intValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void g(int i, long j) {
        this.a.X(i, j);
    }

    public final void h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.y0(list.get(i4).longValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.r0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.E0(list.get(i4).longValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.v0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.X(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.z(list.get(i4).intValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.m0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.x(list.get(i4).intValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void l(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.A(list.get(i4).intValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.m0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void n(int i, long j) {
        this.a.j(i, j);
    }

    public final void o(int i, double d) {
        this.a.h(i, d);
    }

    public final void p(int i, float f) {
        this.a.i(i, f);
    }

    public final void q(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.D0(list.get(i4).longValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.v0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.X(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void r(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.C0(list.get(i4).longValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.t0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.K(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void s(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.B0(list.get(i4).longValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.r0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void t(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.y(list.get(i4).intValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void u(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.Z(list.get(i4).doubleValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.W(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void v(int i, List<bk0> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.k(i, list.get(i2));
        }
    }

    public final void w(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += nk0.C(list.get(i4).floatValue());
            }
            this.a.q(i3);
            while (i2 < list.size()) {
                this.a.g(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.i(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void x(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof vl0) {
            vl0 vl0 = (vl0) list;
            while (i2 < list.size()) {
                Object w0 = vl0.w0(i2);
                if (w0 instanceof String) {
                    this.a.Y(i, (String) w0);
                } else {
                    this.a.k(i, (bk0) w0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.Y(i, list.get(i2));
            i2++;
        }
    }

    public final void y(int i, long j) {
        this.a.X(i, j);
    }

    public final void z(int i, int i2) {
        this.a.m0(i, i2);
    }
}
