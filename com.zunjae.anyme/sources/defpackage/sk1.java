package defpackage;

import defpackage.ak1;
import defpackage.rj1;
import defpackage.rl1;
import java.util.Iterator;
import java.util.Map;

/* renamed from: sk1  reason: default package */
final class sk1<T> implements el1<T> {
    private final ok1 a;
    private final ll1<?, ?> b;
    private final boolean c;
    private final nj1<?> d;

    private sk1(ll1<?, ?> ll1, nj1<?> nj1, ok1 ok1) {
        this.b = ll1;
        this.c = nj1.e(ok1);
        this.d = nj1;
        this.a = ok1;
    }

    private <UT, UB> int k(ll1<UT, UB> ll1, T t) {
        return ll1.i(ll1.g(t));
    }

    private <UT, UB, ET extends rj1.b<ET>> void l(ll1<UT, UB> ll1, nj1<ET> nj1, T t, dl1 dl1, mj1 mj1) {
        UB f = ll1.f(t);
        rj1<ET> d2 = nj1.d(t);
        do {
            try {
                if (dl1.B() == Integer.MAX_VALUE) {
                    ll1.o(t, f);
                    return;
                }
            } finally {
                ll1.o(t, f);
            }
        } while (n(dl1, mj1, nj1, d2, ll1, f));
    }

    static <T> sk1<T> m(ll1<?, ?> ll1, nj1<?> nj1, ok1 ok1) {
        return new sk1<>(ll1, nj1, ok1);
    }

    private <UT, UB, ET extends rj1.b<ET>> boolean n(dl1 dl1, mj1 mj1, nj1<ET> nj1, rj1<ET> rj1, ll1<UT, UB> ll1, UB ub) {
        int o = dl1.o();
        if (o == rl1.a) {
            int i = 0;
            Object obj = null;
            ej1 ej1 = null;
            while (dl1.B() != Integer.MAX_VALUE) {
                int o2 = dl1.o();
                if (o2 == rl1.c) {
                    i = dl1.p();
                    obj = nj1.b(mj1, this.a, i);
                } else if (o2 == rl1.d) {
                    if (obj != null) {
                        nj1.h(dl1, obj, mj1, rj1);
                    } else {
                        ej1 = dl1.G();
                    }
                } else if (!dl1.J()) {
                    break;
                }
            }
            if (dl1.o() == rl1.b) {
                if (ej1 != null) {
                    if (obj != null) {
                        nj1.i(ej1, obj, mj1, rj1);
                    } else {
                        ll1.d(ub, i, ej1);
                    }
                }
                return true;
            }
            throw yj1.a();
        } else if (rl1.b(o) != 2) {
            return dl1.J();
        } else {
            Object b2 = nj1.b(mj1, this.a, rl1.a(o));
            if (b2 == null) {
                return ll1.m(ub, dl1);
            }
            nj1.h(dl1, b2, mj1, rj1);
            return true;
        }
    }

    private <UT, UB> void o(ll1<UT, UB> ll1, T t, sl1 sl1) {
        ll1.s(ll1.g(t), sl1);
    }

    public void a(T t, T t2) {
        gl1.G(this.b, t, t2);
        if (this.c) {
            gl1.E(this.d, t, t2);
        }
    }

    public boolean b(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    public int c(T t) {
        int hashCode = this.b.g(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.c(t).hashCode() : hashCode;
    }

    public void d(T t, sl1 sl1) {
        Iterator<Map.Entry<?, Object>> s = this.d.c(t).s();
        while (s.hasNext()) {
            Map.Entry next = s.next();
            rj1.b bVar = (rj1.b) next.getKey();
            if (bVar.o0() != rl1.c.MESSAGE || bVar.p() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            sl1.e(bVar.j(), next instanceof ak1.b ? ((ak1.b) next).a().e() : next.getValue());
        }
        o(this.b, t, sl1);
    }

    public void e(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    public final boolean f(T t) {
        return this.d.c(t).p();
    }

    public void g(T t, dl1 dl1, mj1 mj1) {
        l(this.b, this.d, t, dl1, mj1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: vj1$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(T r11, byte[] r12, int r13, int r14, defpackage.aj1.b r15) {
        /*
            r10 = this;
            r0 = r11
            vj1 r0 = (defpackage.vj1) r0
            ml1 r1 = r0.f
            ml1 r2 = defpackage.ml1.e()
            if (r1 != r2) goto L_0x0011
            ml1 r1 = defpackage.ml1.l()
            r0.f = r1
        L_0x0011:
            vj1$c r11 = (defpackage.vj1.c) r11
            rj1 r11 = r11.H()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = defpackage.aj1.I(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.rl1.a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = defpackage.rl1.b(r13)
            if (r3 != r5) goto L_0x0066
            nj1<?> r2 = r10.d
            mj1 r3 = r15.d
            ok1 r5 = r10.a
            int r6 = defpackage.rl1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            vj1$e r8 = (defpackage.vj1.e) r8
            if (r8 == 0) goto L_0x005b
            al1 r13 = defpackage.al1.a()
            ok1 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            el1 r13 = r13.d(r2)
            int r13 = defpackage.aj1.p(r13, r12, r4, r14, r15)
            vj1$d r2 = r8.b
            java.lang.Object r3 = r15.c
            r11.x(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.aj1.G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = defpackage.aj1.N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = defpackage.aj1.I(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.rl1.a(r6)
            int r8 = defpackage.rl1.b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            al1 r6 = defpackage.al1.a()
            ok1 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            el1 r6 = r6.d(r7)
            int r4 = defpackage.aj1.p(r6, r12, r4, r14, r15)
            vj1$d r6 = r2.b
            java.lang.Object r7 = r15.c
            r11.x(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = defpackage.aj1.b(r12, r4, r15)
            java.lang.Object r3 = r15.c
            ej1 r3 = (defpackage.ej1) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = defpackage.aj1.I(r12, r4, r15)
            int r13 = r15.a
            nj1<?> r2 = r10.d
            mj1 r6 = r15.d
            ok1 r7 = r10.a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            vj1$e r2 = (defpackage.vj1.e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = defpackage.rl1.b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = defpackage.aj1.N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = defpackage.rl1.c(r13, r5)
            r1.n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            yj1 r11 = defpackage.yj1.g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk1.h(java.lang.Object, byte[], int, int, aj1$b):void");
    }

    public int i(T t) {
        int k = k(this.b, t) + 0;
        return this.c ? k + this.d.c(t).j() : k;
    }

    public T j() {
        return this.a.j().j0();
    }
}
