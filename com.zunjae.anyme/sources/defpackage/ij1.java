package defpackage;

import defpackage.hk1;
import defpackage.sl1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: ij1  reason: default package */
final class ij1 implements sl1 {
    private final hj1 a;

    /* renamed from: ij1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                rl1$b[] r0 = defpackage.rl1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                rl1$b r1 = defpackage.rl1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                rl1$b r1 = defpackage.rl1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                rl1$b r1 = defpackage.rl1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                rl1$b r1 = defpackage.rl1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                rl1$b r1 = defpackage.rl1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                rl1$b r1 = defpackage.rl1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                rl1$b r1 = defpackage.rl1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                rl1$b r1 = defpackage.rl1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                rl1$b r1 = defpackage.rl1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                rl1$b r1 = defpackage.rl1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                rl1$b r1 = defpackage.rl1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                rl1$b r1 = defpackage.rl1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.a.<clinit>():void");
        }
    }

    private ij1(hj1 hj1) {
        xj1.b(hj1, "output");
        hj1 hj12 = hj1;
        this.a = hj12;
        hj12.a = this;
    }

    public static ij1 P(hj1 hj1) {
        ij1 ij1 = hj1.a;
        return ij1 != null ? ij1 : new ij1(hj1);
    }

    private <V> void Q(int i, boolean z, V v, hk1.a<Boolean, V> aVar) {
        this.a.T0(i, 2);
        this.a.V0(hk1.b(aVar, Boolean.valueOf(z), v));
        hk1.d(this.a, aVar, Boolean.valueOf(z), v);
    }

    private <V> void R(int i, hk1.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.a.T0(i, 2);
            this.a.V0(hk1.b(aVar, Integer.valueOf(i4), v));
            hk1.d(this.a, aVar, Integer.valueOf(i4), v);
        }
    }

    private <V> void S(int i, hk1.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.a.T0(i, 2);
            this.a.V0(hk1.b(aVar, Long.valueOf(j), v));
            hk1.d(this.a, aVar, Long.valueOf(j), v);
        }
    }

    private <K, V> void T(int i, hk1.a<K, V> aVar, Map<K, V> map) {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i, aVar, map);
                return;
            case 12:
                U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    private <V> void U(int i, hk1.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.a.T0(i, 2);
            this.a.V0(hk1.b(aVar, str2, v));
            hk1.d(this.a, aVar, str2, v);
        }
    }

    private void V(int i, Object obj) {
        if (obj instanceof String) {
            this.a.R0(i, (String) obj);
        } else {
            this.a.l0(i, (ej1) obj);
        }
    }

    public void A(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.n(list.get(i4).intValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.s0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.r0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public void B(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.e(list.get(i4).booleanValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.i0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public <K, V> void C(int i, hk1.a<K, V> aVar, Map<K, V> map) {
        if (this.a.c0()) {
            T(i, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.a.T0(i, 2);
            this.a.V0(hk1.b(aVar, next.getKey(), next.getValue()));
            hk1.d(this.a, aVar, next.getKey(), next.getValue());
        }
    }

    public void D(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.W(list.get(i4).intValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.V0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.U0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public void E(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.R(list.get(i4).longValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.Q0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.P0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public void F(int i, long j) {
        this.a.P0(i, j);
    }

    public void G(int i, float f) {
        this.a.v0(i, f);
    }

    public void H(int i) {
        this.a.T0(i, 4);
    }

    public void I(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.P(list.get(i4).intValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.O0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.N0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public void J(int i, int i2) {
        this.a.p0(i, i2);
    }

    public void K(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.y(list.get(i4).longValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.E0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.D0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public void L(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.l(list.get(i4).intValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.q0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.p0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public void M(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.j(list.get(i4).doubleValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.o0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public void N(int i, int i2) {
        this.a.N0(i, i2);
    }

    public void O(int i, List<ej1> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.l0(i, list.get(i2));
        }
    }

    public void a(int i, List<?> list, el1 el1) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            j(i, list.get(i2), el1);
        }
    }

    public void b(int i, List<?> list, el1 el1) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            s(i, list.get(i2), el1);
        }
    }

    public void c(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.r(list.get(i4).floatValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.w0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.v0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public void d(int i, int i2) {
        this.a.U0(i, i2);
    }

    public final void e(int i, Object obj) {
        if (obj instanceof ej1) {
            this.a.I0(i, (ej1) obj);
        } else {
            this.a.H0(i, (ok1) obj);
        }
    }

    public void f(int i, int i2) {
        this.a.r0(i, i2);
    }

    public void g(int i, double d) {
        this.a.n0(i, d);
    }

    public void h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.N(list.get(i4).longValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.M0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.L0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public void i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.Y(list.get(i4).longValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.X0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.W0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public void j(int i, Object obj, el1 el1) {
        this.a.F0(i, (ok1) obj, el1);
    }

    public void k(int i, long j) {
        this.a.t0(i, j);
    }

    public sl1.a l() {
        return sl1.a.ASCENDING;
    }

    public void m(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof dk1) {
            dk1 dk1 = (dk1) list;
            while (i2 < list.size()) {
                V(i, dk1.n0(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.R0(i, list.get(i2));
            i2++;
        }
    }

    public void n(int i, String str) {
        this.a.R0(i, str);
    }

    public void o(int i, long j) {
        this.a.W0(i, j);
    }

    public void p(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.w(list.get(i4).intValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.C0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.B0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public void q(int i, long j) {
        this.a.D0(i, j);
    }

    public void r(int i, boolean z) {
        this.a.h0(i, z);
    }

    public void s(int i, Object obj, el1 el1) {
        this.a.y0(i, (ok1) obj, el1);
    }

    public void t(int i, int i2) {
        this.a.J0(i, i2);
    }

    public void u(int i) {
        this.a.T0(i, 3);
    }

    public void v(int i, ej1 ej1) {
        this.a.l0(i, ej1);
    }

    public void w(int i, int i2) {
        this.a.B0(i, i2);
    }

    public void x(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.p(list.get(i4).longValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.u0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.t0(i, list.get(i2).longValue());
            i2++;
        }
    }

    public void y(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.T0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += hj1.L(list.get(i4).intValue());
            }
            this.a.V0(i3);
            while (i2 < list.size()) {
                this.a.K0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.J0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public void z(int i, long j) {
        this.a.L0(i, j);
    }
}
