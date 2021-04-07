package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: v01  reason: default package */
final class v01 {
    private static final Class<?> a = F();
    private static final m11<?, ?> b = g(false);
    private static final m11<?, ?> c = g(true);
    private static final m11<?, ?> d = new o11();

    static int A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sz0) {
            sz0 sz0 = (sz0) list;
            i = 0;
            while (i2 < size) {
                i += cy0.o0(sz0.e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + cy0.o0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static m11<?, ?> B() {
        return d;
    }

    public static void C(int i, List<Long> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.h(i, list, z);
        }
    }

    static int D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * cy0.h0(i));
    }

    static int E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof vy0) {
            vy0 vy0 = (vy0) list;
            i = 0;
            while (i2 < size) {
                i += cy0.C0(vy0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + cy0.C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i, List<Long> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.s(i, list, z);
        }
    }

    static int H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * cy0.h0(i));
    }

    static int I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof vy0) {
            vy0 vy0 = (vy0) list;
            i = 0;
            while (i2 < size) {
                i += cy0.l0(vy0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + cy0.l0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i, List<Long> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.r(i, list, z);
        }
    }

    static int L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * cy0.h0(i));
    }

    static int M(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof vy0) {
            vy0 vy0 = (vy0) list;
            i = 0;
            while (i2 < size) {
                i += cy0.p0(vy0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + cy0.p0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void N(int i, List<Long> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.q(i, list, z);
        }
    }

    static int O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * cy0.h0(i));
    }

    static int P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof vy0) {
            vy0 vy0 = (vy0) list;
            i = 0;
            while (i2 < size) {
                i += cy0.t0(vy0.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + cy0.t0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void Q(int i, List<Long> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.i(i, list, z);
        }
    }

    static int R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * cy0.y0(i, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i, List<Integer> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.c(i, list, z);
        }
    }

    static int U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * cy0.r0(i, 0);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i, List<Integer> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.k(i, list, z);
        }
    }

    static int X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * cy0.H(i, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i, List<Integer> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.t(i, list, z);
        }
    }

    static int a(int i, Object obj, u01 u01) {
        return obj instanceof jz0 ? cy0.c(i, (jz0) obj) : cy0.F(i, (f01) obj, u01);
    }

    public static void a0(int i, List<Integer> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.j(i, list, z);
        }
    }

    static int b(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int h0 = cy0.h0(i) * size;
        if (list instanceof lz0) {
            lz0 lz0 = (lz0) list;
            while (i2 < size) {
                Object e = lz0.e(i2);
                h0 += e instanceof lx0 ? cy0.I((lx0) e) : cy0.K((String) e);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                h0 += obj instanceof lx0 ? cy0.I((lx0) obj) : cy0.K((String) obj);
                i2++;
            }
        }
        return h0;
    }

    public static void b0(int i, List<Integer> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.l(i, list, z);
        }
    }

    static int c(int i, List<?> list, u01 u01) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = cy0.h0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            h0 += obj instanceof jz0 ? cy0.d((jz0) obj) : cy0.e((f01) obj, u01);
        }
        return h0;
    }

    public static void c0(int i, List<Integer> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.d(i, list, z);
        }
    }

    static int d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * cy0.h0(i));
    }

    public static void d0(int i, List<Boolean> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.a(i, list, z);
        }
    }

    static int e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sz0) {
            sz0 sz0 = (sz0) list;
            i = 0;
            while (i2 < size) {
                i += cy0.e0(sz0.e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + cy0.e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static m11<?, ?> f() {
        return b;
    }

    private static m11<?, ?> g(boolean z) {
        try {
            Class<?> J = J();
            if (J == null) {
                return null;
            }
            return (m11) J.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i, int i2, UB ub, m11<UT, UB> m11) {
        if (ub == null) {
            ub = m11.a();
        }
        m11.b(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB i(int i, List<Integer> list, az0 az0, UB ub, m11<UT, UB> m11) {
        if (az0 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (az0.f(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = h(i, intValue, ub, m11);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!az0.f(intValue2)) {
                    ub = h(i, intValue2, ub, m11);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void j(int i, List<String> list, k21 k21) {
        if (list != null && !list.isEmpty()) {
            k21.x(i, list);
        }
    }

    public static void k(int i, List<?> list, k21 k21, u01 u01) {
        if (list != null && !list.isEmpty()) {
            k21.I(i, list, u01);
        }
    }

    public static void l(int i, List<Double> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.u(i, list, z);
        }
    }

    static <T, FT extends ny0<FT>> void m(hy0<FT> hy0, T t, T t2) {
        ly0<FT> b2 = hy0.b(t2);
        if (!b2.a.isEmpty()) {
            hy0.f(t).g(b2);
        }
    }

    static <T> void n(xz0 xz0, T t, T t2, long j) {
        s11.j(t, j, xz0.e(s11.F(t, j), s11.F(t2, j)));
    }

    static <T, UT, UB> void o(m11<UT, UB> m11, T t, T t2) {
        m11.e(t, m11.i(m11.f(t), m11.f(t2)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!sy0.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i, List<lx0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = size * cy0.h0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            h0 += cy0.I(list.get(i2));
        }
        return h0;
    }

    static int s(int i, List<f01> list, u01 u01) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += cy0.V(i, list.get(i3), u01);
        }
        return i2;
    }

    static int t(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * cy0.h0(i));
    }

    static int u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sz0) {
            sz0 sz0 = (sz0) list;
            i = 0;
            while (i2 < size) {
                i += cy0.j0(sz0.e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + cy0.j0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static m11<?, ?> v() {
        return c;
    }

    public static void w(int i, List<lx0> list, k21 k21) {
        if (list != null && !list.isEmpty()) {
            k21.v(i, list);
        }
    }

    public static void x(int i, List<?> list, k21 k21, u01 u01) {
        if (list != null && !list.isEmpty()) {
            k21.B(i, list, u01);
        }
    }

    public static void y(int i, List<Float> list, k21 k21, boolean z) {
        if (list != null && !list.isEmpty()) {
            k21.w(i, list, z);
        }
    }

    static int z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * cy0.h0(i));
    }
}
