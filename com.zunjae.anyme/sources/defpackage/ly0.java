package defpackage;

import defpackage.ny0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ly0  reason: default package */
final class ly0<T extends ny0<T>> {
    private static final ly0 d = new ly0(true);
    final z01<T, Object> a;
    private boolean b;
    private boolean c;

    private ly0() {
        this.a = z01.b(16);
    }

    private ly0(z01<T, Object> z01) {
        this.a = z01;
        k();
    }

    private ly0(boolean z) {
        this(z01.b(0));
        k();
    }

    public static int a(ny0<?> ny0, Object obj) {
        e21 b2 = ny0.b();
        int zza = ny0.zza();
        if (!ny0.d()) {
            return b(b2, zza, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (ny0.g()) {
            for (Object j : list) {
                i += j(b2, j);
            }
            return cy0.h0(zza) + i + cy0.E0(i);
        }
        for (Object b3 : list) {
            i += b(b2, zza, b3);
        }
        return i;
    }

    static int b(e21 e21, int i, Object obj) {
        int h0 = cy0.h0(i);
        if (e21 == e21.GROUP) {
            uy0.g((f01) obj);
            h0 <<= 1;
        }
        return h0 + j(e21, obj);
    }

    public static <T extends ny0<T>> ly0<T> c() {
        return d;
    }

    private final Object d(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof fz0)) {
            return obj;
        }
        fz0 fz0 = (fz0) obj;
        fz0.e();
        throw null;
    }

    private static Object e(Object obj) {
        if (obj instanceof k01) {
            return ((k01) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void f(cy0 cy0, e21 e21, int i, Object obj) {
        if (e21 == e21.GROUP) {
            f01 f01 = (f01) obj;
            uy0.g(f01);
            cy0.m(i, 3);
            f01.e(cy0);
            cy0.m(i, 4);
            return;
        }
        cy0.m(i, e21.zzb());
        switch (ky0.b[e21.ordinal()]) {
            case 1:
                cy0.h(((Double) obj).doubleValue());
                return;
            case 2:
                cy0.i(((Float) obj).floatValue());
                return;
            case 3:
                cy0.t(((Long) obj).longValue());
                return;
            case 4:
                cy0.t(((Long) obj).longValue());
                return;
            case 5:
                cy0.j(((Integer) obj).intValue());
                return;
            case 6:
                cy0.a0(((Long) obj).longValue());
                return;
            case 7:
                cy0.f0(((Integer) obj).intValue());
                return;
            case 8:
                cy0.y(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((f01) obj).e(cy0);
                return;
            case 10:
                cy0.v((f01) obj);
                return;
            case 11:
                if (obj instanceof lx0) {
                    cy0.u((lx0) obj);
                    return;
                } else {
                    cy0.w((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof lx0) {
                    cy0.u((lx0) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                cy0.T(bArr, 0, bArr.length);
                return;
            case 13:
                cy0.O(((Integer) obj).intValue());
                return;
            case 14:
                cy0.f0(((Integer) obj).intValue());
                return;
            case 15:
                cy0.a0(((Long) obj).longValue());
                return;
            case 16:
                cy0.X(((Integer) obj).intValue());
                return;
            case 17:
                cy0.S(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof yy0) {
                    cy0.j(((yy0) obj).zza());
                    return;
                } else {
                    cy0.j(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof defpackage.yy0) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof defpackage.fz0) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void h(defpackage.e21 r2, java.lang.Object r3) {
        /*
            defpackage.uy0.d(r3)
            int[] r0 = defpackage.ky0.a
            h21 r2 = r2.zza()
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
            boolean r2 = r3 instanceof defpackage.f01
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof defpackage.fz0
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof defpackage.yy0
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof defpackage.lx0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly0.h(e21, java.lang.Object):void");
    }

    private static <T extends ny0<T>> boolean i(Map.Entry<T, Object> entry) {
        ny0 ny0 = (ny0) entry.getKey();
        if (ny0.c() == h21.MESSAGE) {
            boolean d2 = ny0.d();
            Object value = entry.getValue();
            if (d2) {
                for (f01 g : (List) value) {
                    if (!g.g()) {
                        return false;
                    }
                }
            } else if (value instanceof f01) {
                if (!((f01) value).g()) {
                    return false;
                }
            } else if (value instanceof fz0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static int j(e21 e21, Object obj) {
        switch (ky0.b[e21.ordinal()]) {
            case 1:
                return cy0.z(((Double) obj).doubleValue());
            case 2:
                return cy0.A(((Float) obj).floatValue());
            case 3:
                return cy0.e0(((Long) obj).longValue());
            case 4:
                return cy0.j0(((Long) obj).longValue());
            case 5:
                return cy0.l0(((Integer) obj).intValue());
            case 6:
                return cy0.s0(((Long) obj).longValue());
            case 7:
                return cy0.x0(((Integer) obj).intValue());
            case 8:
                return cy0.L(((Boolean) obj).booleanValue());
            case 9:
                return cy0.W((f01) obj);
            case 10:
                return obj instanceof fz0 ? cy0.d((fz0) obj) : cy0.J((f01) obj);
            case 11:
                return obj instanceof lx0 ? cy0.I((lx0) obj) : cy0.K((String) obj);
            case 12:
                return obj instanceof lx0 ? cy0.I((lx0) obj) : cy0.M((byte[]) obj);
            case 13:
                return cy0.p0(((Integer) obj).intValue());
            case 14:
                return cy0.A0(((Integer) obj).intValue());
            case 15:
                return cy0.w0(((Long) obj).longValue());
            case 16:
                return cy0.t0(((Integer) obj).intValue());
            case 17:
                return cy0.o0(((Long) obj).longValue());
            case 18:
                return obj instanceof yy0 ? cy0.C0(((yy0) obj).zza()) : cy0.C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void l(T t, Object obj) {
        if (!t.d()) {
            h(t.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                h(t.b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof fz0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private final void m(Map.Entry<T, Object> entry) {
        ny0 ny0 = (ny0) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof fz0) {
            fz0 fz0 = (fz0) value;
            fz0.e();
            throw null;
        } else if (ny0.d()) {
            Object d2 = d(ny0);
            if (d2 == null) {
                d2 = new ArrayList();
            }
            for (Object e : (List) value) {
                ((List) d2).add(e(e));
            }
            this.a.put(ny0, d2);
        } else if (ny0.c() == h21.MESSAGE) {
            Object d3 = d(ny0);
            if (d3 == null) {
                this.a.put(ny0, e(value));
            } else {
                this.a.put(ny0, d3 instanceof k01 ? ny0.X((k01) d3, (k01) value) : ny0.R(((f01) d3).c(), (f01) value).k());
            }
        } else {
            this.a.put(ny0, e(value));
        }
    }

    private static int n(Map.Entry<T, Object> entry) {
        ny0 ny0 = (ny0) entry.getKey();
        Object value = entry.getValue();
        if (ny0.c() != h21.MESSAGE || ny0.d() || ny0.g()) {
            return a(ny0, value);
        }
        boolean z = value instanceof fz0;
        int zza = ((ny0) entry.getKey()).zza();
        return z ? cy0.D(zza, (fz0) value) : cy0.E(zza, (f01) value);
    }

    public final /* synthetic */ Object clone() {
        ly0 ly0 = new ly0();
        for (int i = 0; i < this.a.j(); i++) {
            Map.Entry<T, Object> h = this.a.h(i);
            ly0.l((ny0) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.a.m()) {
            ly0.l((ny0) next.getKey(), next.getValue());
        }
        ly0.c = this.c;
        return ly0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly0)) {
            return false;
        }
        return this.a.equals(((ly0) obj).a);
    }

    public final void g(ly0<T> ly0) {
        for (int i = 0; i < ly0.a.j(); i++) {
            m(ly0.a.h(i));
        }
        for (Map.Entry<T, Object> m : ly0.a.m()) {
            m(m);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void k() {
        if (!this.b) {
            this.a.e();
            this.b = true;
        }
    }

    public final boolean o() {
        return this.b;
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.c ? new kz0(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> q() {
        return this.c ? new kz0(this.a.o().iterator()) : this.a.o().iterator();
    }

    public final boolean r() {
        for (int i = 0; i < this.a.j(); i++) {
            if (!i(this.a.h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> i2 : this.a.m()) {
            if (!i(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.j(); i2++) {
            i += n(this.a.h(i2));
        }
        for (Map.Entry<T, Object> n : this.a.m()) {
            i += n(n);
        }
        return i;
    }
}
