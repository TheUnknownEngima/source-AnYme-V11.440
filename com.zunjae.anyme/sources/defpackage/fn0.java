package defpackage;

import java.util.List;

/* renamed from: fn0  reason: default package */
final class fn0 {
    private static final Class<?> a = K();
    private static final vn0<?, ?> b = U(false);
    private static final vn0<?, ?> c = U(true);
    private static final vn0<?, ?> d = new xn0();

    public static void A(int i, List<Integer> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.k(i, list, z);
        }
    }

    static int B(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof el0) {
            el0 el0 = (el0) list;
            i = 0;
            while (i2 < size) {
                i += nk0.w(el0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + nk0.w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void C(int i, List<Integer> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.t(i, list, z);
        }
    }

    static int D(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof el0) {
            el0 el0 = (el0) list;
            i = 0;
            while (i2 < size) {
                i += nk0.x(el0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + nk0.x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void E(int i, List<Integer> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.j(i, list, z);
        }
    }

    static int F(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof el0) {
            el0 el0 = (el0) list;
            i = 0;
            while (i2 < size) {
                i += nk0.y(el0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + nk0.y(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void G(int i, List<Integer> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.l(i, list, z);
        }
    }

    public static vn0<?, ?> H() {
        return b;
    }

    public static vn0<?, ?> I() {
        return c;
    }

    public static vn0<?, ?> J() {
        return d;
    }

    private static Class<?> K() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> L() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int M(List<?> list) {
        return list.size() << 2;
    }

    public static void N(int i, List<Integer> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.d(i, list, z);
        }
    }

    static int O(List<?> list) {
        return list.size() << 3;
    }

    public static void P(int i, List<Boolean> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.a(i, list, z);
        }
    }

    static int Q(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return s(list) + (list.size() * nk0.u(i));
    }

    static int R(List<?> list) {
        return list.size();
    }

    static int S(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * nk0.u(i));
    }

    static int T(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return x(list) + (size * nk0.u(i));
    }

    private static vn0<?, ?> U(boolean z) {
        try {
            Class<?> L = L();
            if (L == null) {
                return null;
            }
            return (vn0) L.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static int V(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z(list) + (size * nk0.u(i));
    }

    static int W(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return B(list) + (size * nk0.u(i));
    }

    static int X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return D(list) + (size * nk0.u(i));
    }

    static int Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * nk0.u(i));
    }

    static int Z(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * nk0.u0(i, 0);
    }

    public static void a(int i, List<String> list, qo0 qo0) {
        if (list != null && !list.isEmpty()) {
            qo0.x(i, list);
        }
    }

    static int a0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * nk0.g0(i, 0);
    }

    public static void b(int i, List<?> list, qo0 qo0, dn0 dn0) {
        if (list != null && !list.isEmpty()) {
            qo0.P(i, list, dn0);
        }
    }

    static int b0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * nk0.T(i, true);
    }

    public static void c(int i, List<Double> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.u(i, list, z);
        }
    }

    static <T, FT extends yk0<FT>> void d(rk0<FT> rk0, T t, T t2) {
        wk0<FT> c2 = rk0.c(t2);
        if (!c2.a.isEmpty()) {
            rk0.e(t).h(c2);
        }
    }

    static <T> void e(im0 im0, T t, T t2, long j) {
        bo0.g(t, j, im0.a(bo0.G(t, j), bo0.G(t2, j)));
    }

    static <T, UT, UB> void f(vn0<UT, UB> vn0, T t, T t2) {
        vn0.c(t, vn0.d(vn0.g(t), vn0.g(t2)));
    }

    public static void g(int i, List<bk0> list, qo0 qo0) {
        if (list != null && !list.isEmpty()) {
            qo0.v(i, list);
        }
    }

    public static void h(int i, List<?> list, qo0 qo0, dn0 dn0) {
        if (list != null && !list.isEmpty()) {
            qo0.R(i, list, dn0);
        }
    }

    public static void i(int i, List<Float> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.w(i, list, z);
        }
    }

    static int j(int i, Object obj, dn0 dn0) {
        return obj instanceof tl0 ? nk0.c(i, (tl0) obj) : nk0.H(i, (pm0) obj, dn0);
    }

    static int k(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int u = nk0.u(i) * size;
        if (list instanceof vl0) {
            vl0 vl0 = (vl0) list;
            while (i2 < size) {
                Object w0 = vl0.w0(i2);
                u += w0 instanceof bk0 ? nk0.I((bk0) w0) : nk0.v((String) w0);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                u += obj instanceof bk0 ? nk0.I((bk0) obj) : nk0.v((String) obj);
                i2++;
            }
        }
        return u;
    }

    static int l(int i, List<?> list, dn0 dn0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = nk0.u(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            u += obj instanceof tl0 ? nk0.d((tl0) obj) : nk0.e((pm0) obj, dn0);
        }
        return u;
    }

    public static void m(int i, List<Long> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.h(i, list, z);
        }
    }

    static int n(int i, List<bk0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = size * nk0.u(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            u += nk0.I(list.get(i2));
        }
        return u;
    }

    static int o(int i, List<pm0> list, dn0 dn0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += nk0.S(i, list.get(i3), dn0);
        }
        return i2;
    }

    public static void p(int i, List<Long> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.s(i, list, z);
        }
    }

    public static void q(int i, List<Long> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.r(i, list, z);
        }
    }

    static boolean r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int s(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dm0) {
            dm0 dm0 = (dm0) list;
            i = 0;
            while (i2 < size) {
                i += nk0.y0(dm0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + nk0.y0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void t(int i, List<Long> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.q(i, list, z);
        }
    }

    public static void u(Class<?> cls) {
        Class<?> cls2;
        if (!cl0.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int v(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dm0) {
            dm0 dm0 = (dm0) list;
            i = 0;
            while (i2 < size) {
                i += nk0.B0(dm0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + nk0.B0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void w(int i, List<Long> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.i(i, list, z);
        }
    }

    static int x(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dm0) {
            dm0 dm0 = (dm0) list;
            i = 0;
            while (i2 < size) {
                i += nk0.C0(dm0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + nk0.C0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void y(int i, List<Integer> list, qo0 qo0, boolean z) {
        if (list != null && !list.isEmpty()) {
            qo0.c(i, list, z);
        }
    }

    static int z(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof el0) {
            el0 el0 = (el0) list;
            i = 0;
            while (i2 < size) {
                i += nk0.B(el0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + nk0.B(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }
}
