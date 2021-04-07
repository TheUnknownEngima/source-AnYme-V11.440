package defpackage;

import defpackage.rj1;
import defpackage.xj1;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: gl1  reason: default package */
final class gl1 {
    private static final Class<?> a = B();
    private static final ll1<?, ?> b = C(false);
    private static final ll1<?, ?> c = C(true);
    private static final ll1<?, ?> d = new nl1();

    static <UT, UB> UB A(int i, List<Integer> list, xj1.e eVar, UB ub, ll1<UT, UB> ll1) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = L(i, intValue, ub, ll1);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = L(i, intValue2, ub, ll1);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static ll1<?, ?> C(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (ll1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends rj1.b<FT>> void E(nj1<FT> nj1, T t, T t2) {
        rj1<FT> c2 = nj1.c(t2);
        if (!c2.n()) {
            nj1.d(t).u(c2);
        }
    }

    static <T> void F(jk1 jk1, T t, T t2, long j) {
        pl1.P(t, j, jk1.a(pl1.A(t, j), pl1.A(t2, j)));
    }

    static <T, UT, UB> void G(ll1<UT, UB> ll1, T t, T t2) {
        ll1.p(t, ll1.k(ll1.g(t), ll1.g(t2)));
    }

    public static ll1<?, ?> H() {
        return b;
    }

    public static ll1<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!vj1.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int i, int i2, UB ub, ll1<UT, UB> ll1) {
        if (ub == null) {
            ub = ll1.n();
        }
        ll1.e(ub, i, (long) i2);
        return ub;
    }

    public static ll1<?, ?> M() {
        return d;
    }

    public static void N(int i, List<Boolean> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.B(i, list, z);
        }
    }

    public static void O(int i, List<ej1> list, sl1 sl1) {
        if (list != null && !list.isEmpty()) {
            sl1.O(i, list);
        }
    }

    public static void P(int i, List<Double> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.M(i, list, z);
        }
    }

    public static void Q(int i, List<Integer> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.L(i, list, z);
        }
    }

    public static void R(int i, List<Integer> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.A(i, list, z);
        }
    }

    public static void S(int i, List<Long> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.x(i, list, z);
        }
    }

    public static void T(int i, List<Float> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.c(i, list, z);
        }
    }

    public static void U(int i, List<?> list, sl1 sl1, el1 el1) {
        if (list != null && !list.isEmpty()) {
            sl1.b(i, list, el1);
        }
    }

    public static void V(int i, List<Integer> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.p(i, list, z);
        }
    }

    public static void W(int i, List<Long> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.K(i, list, z);
        }
    }

    public static void X(int i, List<?> list, sl1 sl1, el1 el1) {
        if (list != null && !list.isEmpty()) {
            sl1.a(i, list, el1);
        }
    }

    public static void Y(int i, List<Integer> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.y(i, list, z);
        }
    }

    public static void Z(int i, List<Long> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.h(i, list, z);
        }
    }

    static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? hj1.U(i) + hj1.C(size) : size * hj1.d(i, true);
    }

    public static void a0(int i, List<Integer> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.I(i, list, z);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<Long> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.E(i, list, z);
        }
    }

    static int c(int i, List<ej1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * hj1.U(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            U += hj1.h(list.get(i2));
        }
        return U;
    }

    public static void c0(int i, List<String> list, sl1 sl1) {
        if (list != null && !list.isEmpty()) {
            sl1.m(i, list);
        }
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = e(list);
        int U = hj1.U(i);
        return z ? U + hj1.C(e) : e + (size * U);
    }

    public static void d0(int i, List<Integer> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.D(i, list, z);
        }
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            i = 0;
            while (i2 < size) {
                i += hj1.l(wj1.k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hj1.l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void e0(int i, List<Long> list, sl1 sl1, boolean z) {
        if (list != null && !list.isEmpty()) {
            sl1.i(i, list, z);
        }
    }

    static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? hj1.U(i) + hj1.C(size * 4) : size * hj1.m(i, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? hj1.U(i) + hj1.C(size * 8) : size * hj1.o(i, 0);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i, List<ok1> list, el1 el1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += hj1.s(i, list.get(i3), el1);
        }
        return i2;
    }

    static int k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = l(list);
        int U = hj1.U(i);
        return z ? U + hj1.C(l) : l + (size * U);
    }

    static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            i = 0;
            while (i2 < size) {
                i += hj1.w(wj1.k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hj1.w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        return z ? hj1.U(i) + hj1.C(n) : n + (list.size() * hj1.U(i));
    }

    static int n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            i = 0;
            while (i2 < size) {
                i += hj1.y(fk1.k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hj1.y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int o(int i, Object obj, el1 el1) {
        return obj instanceof bk1 ? hj1.A(i, (bk1) obj) : hj1.F(i, (ok1) obj, el1);
    }

    static int p(int i, List<?> list, el1 el1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = hj1.U(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            U += obj instanceof bk1 ? hj1.B((bk1) obj) : hj1.H((ok1) obj, el1);
        }
        return U;
    }

    static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        int U = hj1.U(i);
        return z ? U + hj1.C(r) : r + (size * U);
    }

    static int r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            i = 0;
            while (i2 < size) {
                i += hj1.P(wj1.k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hj1.P(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        int U = hj1.U(i);
        return z ? U + hj1.C(t) : t + (size * U);
    }

    static int t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            i = 0;
            while (i2 < size) {
                i += hj1.R(fk1.k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hj1.R(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int U = hj1.U(i) * size;
        if (list instanceof dk1) {
            dk1 dk1 = (dk1) list;
            while (i2 < size) {
                Object n0 = dk1.n0(i2);
                U += n0 instanceof ej1 ? hj1.h((ej1) n0) : hj1.T((String) n0);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                U += obj instanceof ej1 ? hj1.h((ej1) obj) : hj1.T((String) obj);
                i2++;
            }
        }
        return U;
    }

    static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        int U = hj1.U(i);
        return z ? U + hj1.C(w) : w + (size * U);
    }

    static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            i = 0;
            while (i2 < size) {
                i += hj1.W(wj1.k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hj1.W(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        int U = hj1.U(i);
        return z ? U + hj1.C(y) : y + (size * U);
    }

    static int y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            i = 0;
            while (i2 < size) {
                i += hj1.Y(fk1.k(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + hj1.Y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static <UT, UB> UB z(int i, List<Integer> list, xj1.d<?> dVar, UB ub, ll1<UT, UB> ll1) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = L(i, intValue, ub, ll1);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = L(i, intValue2, ub, ll1);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
