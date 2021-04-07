package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: l01  reason: default package */
final class l01<T> implements u01<T> {
    private final f01 a;
    private final m11<?, ?> b;
    private final boolean c;
    private final hy0<?> d;

    private l01(m11<?, ?> m11, hy0<?> hy0, f01 f01) {
        this.b = m11;
        this.c = hy0.e(f01);
        this.d = hy0;
        this.a = f01;
    }

    static <T> l01<T> i(m11<?, ?> m11, hy0<?> hy0, f01 f01) {
        return new l01<>(m11, hy0, f01);
    }

    public final int a(T t) {
        int hashCode = this.b.f(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.b(t).hashCode() : hashCode;
    }

    public final boolean b(T t) {
        return this.d.b(t).r();
    }

    public final void c(T t) {
        this.b.j(t);
        this.d.g(t);
    }

    public final int d(T t) {
        m11<?, ?> m11 = this.b;
        int k = m11.k(m11.f(t)) + 0;
        return this.c ? k + this.d.b(t).s() : k;
    }

    public final boolean e(T t, T t2) {
        if (!this.b.f(t).equals(this.b.f(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t).equals(this.d.b(t2));
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: sy0$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(T r10, byte[] r11, int r12, int r13, defpackage.kx0 r14) {
        /*
            r9 = this;
            r0 = r10
            sy0 r0 = (defpackage.sy0) r0
            p11 r1 = r0.zzb
            p11 r2 = defpackage.p11.a()
            if (r1 != r2) goto L_0x0011
            p11 r1 = defpackage.p11.g()
            r0.zzb = r1
        L_0x0011:
            sy0$d r10 = (defpackage.sy0.d) r10
            r10.A()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = defpackage.hx0.i(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            hy0<?> r12 = r9.d
            fy0 r0 = r14.d
            f01 r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            sy0$f r0 = (defpackage.sy0.f) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = defpackage.hx0.c(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            defpackage.q01.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = defpackage.hx0.a(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = defpackage.hx0.i(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = defpackage.hx0.q(r11, r4, r14)
            java.lang.Object r2 = r14.c
            lx0 r2 = (defpackage.lx0) r2
            goto L_0x0053
        L_0x0072:
            defpackage.q01.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = defpackage.hx0.i(r11, r4, r14)
            int r12 = r14.a
            hy0<?> r0 = r9.d
            fy0 r5 = r14.d
            f01 r6 = r9.a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            sy0$f r0 = (defpackage.sy0.f) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = defpackage.hx0.a(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.c(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            ez0 r10 = defpackage.ez0.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l01.f(java.lang.Object, byte[], int, int, kx0):void");
    }

    public final void g(T t, k21 k21) {
        Iterator<Map.Entry<?, Object>> p = this.d.b(t).p();
        while (p.hasNext()) {
            Map.Entry next = p.next();
            ny0 ny0 = (ny0) next.getKey();
            if (ny0.c() != h21.MESSAGE || ny0.d() || ny0.g()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            k21.E(ny0.zza(), next instanceof hz0 ? ((hz0) next).a().d() : next.getValue());
        }
        m11<?, ?> m11 = this.b;
        m11.g(m11.f(t), k21);
    }

    public final void h(T t, T t2) {
        v01.o(this.b, t, t2);
        if (this.c) {
            v01.m(this.d, t, t2);
        }
    }

    public final T zza() {
        return this.a.f().m();
    }
}
