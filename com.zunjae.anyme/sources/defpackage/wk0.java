package defpackage;

import defpackage.yk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: wk0  reason: default package */
final class wk0<T extends yk0<T>> {
    private static final wk0 d = new wk0(true);
    final in0<T, Object> a;
    private boolean b;
    private boolean c;

    private wk0() {
        this.a = in0.g(16);
    }

    private wk0(in0<T, Object> in0) {
        this.a = in0;
        q();
    }

    private wk0(boolean z) {
        this(in0.g(0));
        q();
    }

    static int e(ko0 ko0, int i, Object obj) {
        int u = nk0.u(i);
        if (ko0 == ko0.GROUP) {
            gl0.h((pm0) obj);
            u <<= 1;
        }
        return u + l(ko0, obj);
    }

    private final Object f(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof pl0)) {
            return obj;
        }
        pl0 pl0 = (pl0) obj;
        pl0.e();
        throw null;
    }

    static void g(nk0 nk0, ko0 ko0, int i, Object obj) {
        if (ko0 == ko0.GROUP) {
            pm0 pm0 = (pm0) obj;
            gl0.h(pm0);
            nk0.b(i, 3);
            pm0.d(nk0);
            nk0.b(i, 4);
            return;
        }
        nk0.b(i, ko0.zzlx());
        switch (vk0.b[ko0.ordinal()]) {
            case 1:
                nk0.W(((Double) obj).doubleValue());
                return;
            case 2:
                nk0.g(((Float) obj).floatValue());
                return;
            case 3:
                nk0.r0(((Long) obj).longValue());
                return;
            case 4:
                nk0.r0(((Long) obj).longValue());
                return;
            case 5:
                nk0.p(((Integer) obj).intValue());
                return;
            case 6:
                nk0.v0(((Long) obj).longValue());
                return;
            case 7:
                nk0.s(((Integer) obj).intValue());
                return;
            case 8:
                nk0.w0(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((pm0) obj).d(nk0);
                return;
            case 10:
                nk0.N((pm0) obj);
                return;
            case 11:
                if (obj instanceof bk0) {
                    nk0.n((bk0) obj);
                    return;
                } else {
                    nk0.t((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof bk0) {
                    nk0.n((bk0) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                nk0.O(bArr, 0, bArr.length);
                return;
            case 13:
                nk0.q(((Integer) obj).intValue());
                return;
            case 14:
                nk0.s(((Integer) obj).intValue());
                return;
            case 15:
                nk0.v0(((Long) obj).longValue());
                return;
            case 16:
                nk0.r(((Integer) obj).intValue());
                return;
            case 17:
                nk0.t0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof fl0) {
                    nk0.p(((fl0) obj).zzgj());
                    return;
                } else {
                    nk0.p(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private final void i(T t, Object obj) {
        if (!t.i0()) {
            j(t.n(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                j(t.n(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof pl0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof defpackage.fl0) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof defpackage.pl0) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void j(defpackage.ko0 r2, java.lang.Object r3) {
        /*
            defpackage.gl0.a(r3)
            int[] r0 = defpackage.vk0.a
            ro0 r2 = r2.zzlw()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof defpackage.pm0
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof defpackage.pl0
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof defpackage.fl0
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof defpackage.bk0
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk0.j(ko0, java.lang.Object):void");
    }

    public static int k(yk0<?> yk0, Object obj) {
        ko0 n = yk0.n();
        int zzgj = yk0.zzgj();
        if (!yk0.i0()) {
            return e(n, zzgj, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (yk0.q0()) {
            for (Object l : list) {
                i += l(n, l);
            }
            return nk0.u(zzgj) + i + nk0.Q(i);
        }
        for (Object e : list) {
            i += e(n, zzgj, e);
        }
        return i;
    }

    private static int l(ko0 ko0, Object obj) {
        switch (vk0.b[ko0.ordinal()]) {
            case 1:
                return nk0.Z(((Double) obj).doubleValue());
            case 2:
                return nk0.C(((Float) obj).floatValue());
            case 3:
                return nk0.y0(((Long) obj).longValue());
            case 4:
                return nk0.B0(((Long) obj).longValue());
            case 5:
                return nk0.w(((Integer) obj).intValue());
            case 6:
                return nk0.D0(((Long) obj).longValue());
            case 7:
                return nk0.z(((Integer) obj).intValue());
            case 8:
                return nk0.z0(((Boolean) obj).booleanValue());
            case 9:
                return nk0.d0((pm0) obj);
            case 10:
                return obj instanceof pl0 ? nk0.d((pl0) obj) : nk0.U((pm0) obj);
            case 11:
                return obj instanceof bk0 ? nk0.I((bk0) obj) : nk0.v((String) obj);
            case 12:
                return obj instanceof bk0 ? nk0.I((bk0) obj) : nk0.J((byte[]) obj);
            case 13:
                return nk0.x(((Integer) obj).intValue());
            case 14:
                return nk0.A(((Integer) obj).intValue());
            case 15:
                return nk0.E0(((Long) obj).longValue());
            case 16:
                return nk0.y(((Integer) obj).intValue());
            case 17:
                return nk0.C0(((Long) obj).longValue());
            case 18:
                return obj instanceof fl0 ? nk0.B(((fl0) obj).zzgj()) : nk0.B(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static <T extends yk0<T>> boolean m(Map.Entry<T, Object> entry) {
        yk0 yk0 = (yk0) entry.getKey();
        if (yk0.y() == ro0.MESSAGE) {
            boolean i0 = yk0.i0();
            Object value = entry.getValue();
            if (i0) {
                for (pm0 b2 : (List) value) {
                    if (!b2.b()) {
                        return false;
                    }
                }
            } else if (value instanceof pm0) {
                if (!((pm0) value).b()) {
                    return false;
                }
            } else if (value instanceof pl0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private final void n(Map.Entry<T, Object> entry) {
        yk0 yk0 = (yk0) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof pl0) {
            pl0 pl0 = (pl0) value;
            pl0.e();
            throw null;
        } else if (yk0.i0()) {
            Object f = f(yk0);
            if (f == null) {
                f = new ArrayList();
            }
            for (Object p : (List) value) {
                ((List) f).add(p(p));
            }
            this.a.put(yk0, f);
        } else if (yk0.y() == ro0.MESSAGE) {
            Object f2 = f(yk0);
            if (f2 == null) {
                this.a.put(yk0, p(value));
            } else {
                this.a.put(yk0, f2 instanceof vm0 ? yk0.o((vm0) f2, (vm0) value) : yk0.r0(((pm0) f2).c(), (pm0) value).N());
            }
        } else {
            this.a.put(yk0, p(value));
        }
    }

    private static int o(Map.Entry<T, Object> entry) {
        yk0 yk0 = (yk0) entry.getKey();
        Object value = entry.getValue();
        if (yk0.y() != ro0.MESSAGE || yk0.i0() || yk0.q0()) {
            return k(yk0, value);
        }
        boolean z = value instanceof pl0;
        int zzgj = ((yk0) entry.getKey()).zzgj();
        return z ? nk0.F(zzgj, (pl0) value) : nk0.G(zzgj, (pm0) value);
    }

    private static Object p(Object obj) {
        if (obj instanceof vm0) {
            return ((vm0) obj).m0();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends yk0<T>> wk0<T> r() {
        return d;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> a() {
        return this.c ? new ul0(this.a.o().iterator()) : this.a.o().iterator();
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        for (int i = 0; i < this.a.m(); i++) {
            if (!m(this.a.h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> m : this.a.n()) {
            if (!m(m)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        wk0 wk0 = new wk0();
        for (int i = 0; i < this.a.m(); i++) {
            Map.Entry<T, Object> h = this.a.h(i);
            wk0.i((yk0) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.a.n()) {
            wk0.i((yk0) next.getKey(), next.getValue());
        }
        wk0.c = this.c;
        return wk0;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.c ? new ul0(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk0)) {
            return false;
        }
        return this.a.equals(((wk0) obj).a);
    }

    public final void h(wk0<T> wk0) {
        for (int i = 0; i < wk0.a.m(); i++) {
            n(wk0.a.h(i));
        }
        for (Map.Entry<T, Object> n : wk0.a.n()) {
            n(n);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void q() {
        if (!this.b) {
            this.a.l();
            this.b = true;
        }
    }

    public final int s() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.m(); i2++) {
            i += o(this.a.h(i2));
        }
        for (Map.Entry<T, Object> o : this.a.n()) {
            i += o(o);
        }
        return i;
    }
}
