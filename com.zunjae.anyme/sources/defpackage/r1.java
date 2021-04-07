package defpackage;

import defpackage.e1;
import defpackage.o1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: r1  reason: default package */
public class r1 {
    private f1 a;
    private boolean b = true;
    private boolean c = true;
    private f1 d;
    private ArrayList<z1> e = new ArrayList<>();
    private o1.b f;
    private o1.a g;
    ArrayList<x1> h;

    public r1(f1 f1Var) {
        new ArrayList();
        this.f = null;
        this.g = new o1.a();
        this.h = new ArrayList<>();
        this.a = f1Var;
        this.d = f1Var;
    }

    private void a(s1 s1Var, int i, int i2, s1 s1Var2, ArrayList<x1> arrayList, x1 x1Var) {
        z1 z1Var = s1Var.d;
        if (z1Var.c == null) {
            f1 f1Var = this.a;
            if (z1Var != f1Var.d && z1Var != f1Var.e) {
                if (x1Var == null) {
                    x1Var = new x1(z1Var, i2);
                    arrayList.add(x1Var);
                }
                z1Var.c = x1Var;
                x1Var.a(z1Var);
                for (q1 next : z1Var.h.k) {
                    if (next instanceof s1) {
                        a((s1) next, i, 0, s1Var2, arrayList, x1Var);
                    }
                }
                for (q1 next2 : z1Var.i.k) {
                    if (next2 instanceof s1) {
                        a((s1) next2, i, 1, s1Var2, arrayList, x1Var);
                    }
                }
                if (i == 1 && (z1Var instanceof y1)) {
                    for (q1 next3 : ((y1) z1Var).k.k) {
                        if (next3 instanceof s1) {
                            a((s1) next3, i, 2, s1Var2, arrayList, x1Var);
                        }
                    }
                }
                for (s1 next4 : z1Var.h.l) {
                    if (next4 == s1Var2) {
                        x1Var.a = true;
                    }
                    a(next4, i, 0, s1Var2, arrayList, x1Var);
                }
                for (s1 next5 : z1Var.i.l) {
                    if (next5 == s1Var2) {
                        x1Var.a = true;
                    }
                    a(next5, i, 1, s1Var2, arrayList, x1Var);
                }
                if (i == 1 && (z1Var instanceof y1)) {
                    for (s1 a2 : ((y1) z1Var).k.l) {
                        a(a2, i, 2, s1Var2, arrayList, x1Var);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01be, code lost:
        if (r3[3].c != null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e0, code lost:
        r2 = r14.K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r1.k == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0148, code lost:
        if (r3[1].c != null) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(defpackage.f1 r14) {
        /*
            r13 = this;
            java.util.ArrayList<e1> r0 = r14.C0
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0273
            java.lang.Object r1 = r0.next()
            e1 r1 = (defpackage.e1) r1
            e1$b[] r3 = r1.K
            r4 = r3[r2]
            r9 = 1
            r3 = r3[r9]
            int r5 = r1.O()
            r6 = 8
            if (r5 != r6) goto L_0x0025
        L_0x0022:
            r1.a = r9
            goto L_0x0006
        L_0x0025:
            float r5 = r1.o
            r10 = 1065353216(0x3f800000, float:1.0)
            r6 = 2
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0034
            e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0034
            r1.j = r6
        L_0x0034:
            float r5 = r1.r
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0040
            r1.k = r6
        L_0x0040:
            float r5 = r1.t()
            r7 = 0
            r8 = 3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0079
            e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0059
            e1$b r5 = defpackage.e1.b.WRAP_CONTENT
            if (r3 == r5) goto L_0x0056
            e1$b r5 = defpackage.e1.b.FIXED
            if (r3 != r5) goto L_0x0059
        L_0x0056:
            r1.j = r8
            goto L_0x0079
        L_0x0059:
            e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0068
            e1$b r5 = defpackage.e1.b.WRAP_CONTENT
            if (r4 == r5) goto L_0x0065
            e1$b r5 = defpackage.e1.b.FIXED
            if (r4 != r5) goto L_0x0068
        L_0x0065:
            r1.k = r8
            goto L_0x0079
        L_0x0068:
            e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0079
            if (r3 != r5) goto L_0x0079
            int r5 = r1.j
            if (r5 != 0) goto L_0x0074
            r1.j = r8
        L_0x0074:
            int r5 = r1.k
            if (r5 != 0) goto L_0x0079
            goto L_0x0065
        L_0x0079:
            e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x008f
            int r5 = r1.j
            if (r5 != r9) goto L_0x008f
            d1 r5 = r1.A
            d1 r5 = r5.c
            if (r5 == 0) goto L_0x008d
            d1 r5 = r1.C
            d1 r5 = r5.c
            if (r5 != 0) goto L_0x008f
        L_0x008d:
            e1$b r4 = defpackage.e1.b.WRAP_CONTENT
        L_0x008f:
            r5 = r4
            e1$b r4 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00a6
            int r4 = r1.k
            if (r4 != r9) goto L_0x00a6
            d1 r4 = r1.B
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x00a4
            d1 r4 = r1.D
            d1 r4 = r4.c
            if (r4 != 0) goto L_0x00a6
        L_0x00a4:
            e1$b r3 = defpackage.e1.b.WRAP_CONTENT
        L_0x00a6:
            r7 = r3
            w1 r3 = r1.d
            r3.d = r5
            int r4 = r1.j
            r3.a = r4
            y1 r3 = r1.e
            r3.d = r7
            int r4 = r1.k
            r3.a = r4
            e1$b r3 = defpackage.e1.b.MATCH_PARENT
            if (r5 == r3) goto L_0x00c3
            e1$b r3 = defpackage.e1.b.FIXED
            if (r5 == r3) goto L_0x00c3
            e1$b r3 = defpackage.e1.b.WRAP_CONTENT
            if (r5 != r3) goto L_0x00d1
        L_0x00c3:
            e1$b r3 = defpackage.e1.b.MATCH_PARENT
            if (r7 == r3) goto L_0x021e
            e1$b r3 = defpackage.e1.b.FIXED
            if (r7 == r3) goto L_0x021e
            e1$b r3 = defpackage.e1.b.WRAP_CONTENT
            if (r7 != r3) goto L_0x00d1
            goto L_0x021e
        L_0x00d1:
            e1$b r3 = defpackage.e1.b.MATCH_CONSTRAINT
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r3) goto L_0x0150
            e1$b r3 = defpackage.e1.b.WRAP_CONTENT
            if (r7 == r3) goto L_0x00df
            e1$b r3 = defpackage.e1.b.FIXED
            if (r7 != r3) goto L_0x0150
        L_0x00df:
            int r3 = r1.j
            if (r3 != r8) goto L_0x0102
            e1$b r2 = defpackage.e1.b.WRAP_CONTENT
            if (r7 != r2) goto L_0x00f0
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r2
            r7 = r2
            r3.l(r4, r5, r6, r7, r8)
        L_0x00f0:
            int r8 = r1.v()
            float r2 = (float) r8
            float r3 = r1.O
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
        L_0x00fb:
            e1$b r7 = defpackage.e1.b.FIXED
            r3 = r13
            r4 = r1
            r5 = r7
            goto L_0x0258
        L_0x0102:
            if (r3 != r9) goto L_0x0119
            e1$b r5 = defpackage.e1.b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r3.l(r4, r5, r6, r7, r8)
            w1 r2 = r1.d
            t1 r2 = r2.e
            int r1 = r1.P()
        L_0x0115:
            r2.m = r1
            goto L_0x0006
        L_0x0119:
            if (r3 != r6) goto L_0x013c
            e1$b[] r3 = r14.K
            r4 = r3[r2]
            e1$b r12 = defpackage.e1.b.FIXED
            if (r4 == r12) goto L_0x0129
            r3 = r3[r2]
            e1$b r4 = defpackage.e1.b.MATCH_PARENT
            if (r3 != r4) goto L_0x0150
        L_0x0129:
            float r2 = r1.o
            int r3 = r14.P()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            int r8 = r1.v()
            e1$b r5 = defpackage.e1.b.FIXED
            goto L_0x0256
        L_0x013c:
            d1[] r3 = r1.I
            r4 = r3[r2]
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x014a
            r3 = r3[r9]
            d1 r3 = r3.c
            if (r3 != 0) goto L_0x0150
        L_0x014a:
            e1$b r5 = defpackage.e1.b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            goto L_0x0256
        L_0x0150:
            e1$b r3 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r7 != r3) goto L_0x01c1
            e1$b r3 = defpackage.e1.b.WRAP_CONTENT
            if (r5 == r3) goto L_0x015c
            e1$b r3 = defpackage.e1.b.FIXED
            if (r5 != r3) goto L_0x01c1
        L_0x015c:
            int r3 = r1.k
            if (r3 != r8) goto L_0x0182
            e1$b r7 = defpackage.e1.b.WRAP_CONTENT
            if (r5 != r7) goto L_0x016c
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.l(r4, r5, r6, r7, r8)
        L_0x016c:
            int r6 = r1.P()
            float r2 = r1.O
            int r3 = r1.u()
            r4 = -1
            if (r3 != r4) goto L_0x017b
            float r2 = r10 / r2
        L_0x017b:
            float r3 = (float) r6
        L_0x017c:
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            goto L_0x00fb
        L_0x0182:
            if (r3 != r9) goto L_0x018f
            r6 = 0
            e1$b r7 = defpackage.e1.b.WRAP_CONTENT
            r8 = 0
            r3 = r13
            r4 = r1
            r3.l(r4, r5, r6, r7, r8)
            goto L_0x0214
        L_0x018f:
            if (r3 != r6) goto L_0x01b2
            e1$b[] r3 = r14.K
            r4 = r3[r9]
            e1$b r8 = defpackage.e1.b.FIXED
            if (r4 == r8) goto L_0x019f
            r3 = r3[r9]
            e1$b r4 = defpackage.e1.b.MATCH_PARENT
            if (r3 != r4) goto L_0x01c1
        L_0x019f:
            float r2 = r1.r
            int r6 = r1.P()
            int r3 = r14.v()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r8 = (int) r2
            e1$b r7 = defpackage.e1.b.FIXED
            goto L_0x0256
        L_0x01b2:
            d1[] r3 = r1.I
            r4 = r3[r6]
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x014a
            r3 = r3[r8]
            d1 r3 = r3.c
            if (r3 != 0) goto L_0x01c1
            goto L_0x014a
        L_0x01c1:
            e1$b r3 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r5 != r3) goto L_0x0006
            if (r7 != r3) goto L_0x0006
            int r3 = r1.j
            if (r3 == r9) goto L_0x0200
            int r4 = r1.k
            if (r4 != r9) goto L_0x01d0
            goto L_0x0200
        L_0x01d0:
            if (r4 != r6) goto L_0x0006
            if (r3 != r6) goto L_0x0006
            e1$b[] r3 = r14.K
            r4 = r3[r2]
            e1$b r5 = defpackage.e1.b.FIXED
            if (r4 == r5) goto L_0x01e0
            r2 = r3[r2]
            if (r2 != r5) goto L_0x0006
        L_0x01e0:
            e1$b[] r2 = r14.K
            r3 = r2[r9]
            e1$b r4 = defpackage.e1.b.FIXED
            if (r3 == r4) goto L_0x01ec
            r2 = r2[r9]
            if (r2 != r4) goto L_0x0006
        L_0x01ec:
            float r2 = r1.o
            float r3 = r1.r
            int r4 = r14.P()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r14.v()
            float r2 = (float) r2
            goto L_0x017c
        L_0x0200:
            e1$b r7 = defpackage.e1.b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.l(r4, r5, r6, r7, r8)
            w1 r2 = r1.d
            t1 r2 = r2.e
            int r3 = r1.P()
            r2.m = r3
        L_0x0214:
            y1 r2 = r1.e
            t1 r2 = r2.e
            int r1 = r1.v()
            goto L_0x0115
        L_0x021e:
            int r2 = r1.P()
            e1$b r3 = defpackage.e1.b.MATCH_PARENT
            if (r5 != r3) goto L_0x0239
            int r2 = r14.P()
            d1 r3 = r1.A
            int r3 = r3.d
            int r2 = r2 - r3
            d1 r3 = r1.C
            int r3 = r3.d
            int r2 = r2 - r3
            e1$b r3 = defpackage.e1.b.FIXED
            r6 = r2
            r5 = r3
            goto L_0x023a
        L_0x0239:
            r6 = r2
        L_0x023a:
            int r2 = r1.v()
            e1$b r3 = defpackage.e1.b.MATCH_PARENT
            if (r7 != r3) goto L_0x0255
            int r2 = r14.v()
            d1 r3 = r1.B
            int r3 = r3.d
            int r2 = r2 - r3
            d1 r3 = r1.D
            int r3 = r3.d
            int r2 = r2 - r3
            e1$b r3 = defpackage.e1.b.FIXED
            r8 = r2
            r7 = r3
            goto L_0x0256
        L_0x0255:
            r8 = r2
        L_0x0256:
            r3 = r13
            r4 = r1
        L_0x0258:
            r3.l(r4, r5, r6, r7, r8)
            w1 r2 = r1.d
            t1 r2 = r2.e
            int r3 = r1.P()
            r2.d(r3)
            y1 r2 = r1.e
            t1 r2 = r2.e
            int r3 = r1.v()
            r2.d(r3)
            goto L_0x0022
        L_0x0273:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.b(f1):boolean");
    }

    private int e(f1 f1Var, int i) {
        int size = this.h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.h.get(i2).b(f1Var, i));
        }
        return (int) j;
    }

    private void i(z1 z1Var, int i, ArrayList<x1> arrayList) {
        for (q1 next : z1Var.h.k) {
            if (next instanceof s1) {
                a((s1) next, i, 0, z1Var.i, arrayList, (x1) null);
            } else if (next instanceof z1) {
                a(((z1) next).h, i, 0, z1Var.i, arrayList, (x1) null);
            }
        }
        for (q1 next2 : z1Var.i.k) {
            if (next2 instanceof s1) {
                a((s1) next2, i, 1, z1Var.h, arrayList, (x1) null);
            } else if (next2 instanceof z1) {
                a(((z1) next2).i, i, 1, z1Var.h, arrayList, (x1) null);
            }
        }
        if (i == 1) {
            for (q1 next3 : ((y1) z1Var).k.k) {
                if (next3 instanceof s1) {
                    a((s1) next3, i, 2, (s1) null, arrayList, (x1) null);
                }
            }
        }
    }

    private void l(e1 e1Var, e1.b bVar, int i, e1.b bVar2, int i2) {
        o1.a aVar = this.g;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.f.b(e1Var, aVar);
        e1Var.C0(this.g.e);
        e1Var.g0(this.g.f);
        e1Var.f0(this.g.h);
        e1Var.a0(this.g.g);
    }

    public void c() {
        d(this.e);
        this.h.clear();
        x1.d = 0;
        i(this.a.d, 0, this.h);
        i(this.a.e, 1, this.h);
        this.b = false;
    }

    public void d(ArrayList<z1> arrayList) {
        Object v1Var;
        arrayList.clear();
        this.d.d.f();
        this.d.e.f();
        arrayList.add(this.d.d);
        arrayList.add(this.d.e);
        Iterator<e1> it = this.d.C0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            e1 next = it.next();
            if (next instanceof h1) {
                v1Var = new u1(next);
            } else {
                if (next.V()) {
                    if (next.b == null) {
                        next.b = new p1(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.W()) {
                    if (next.c == null) {
                        next.c = new p1(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof j1) {
                    v1Var = new v1(next);
                }
            }
            arrayList.add(v1Var);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<z1> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<z1> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            z1 next2 = it3.next();
            if (next2.b != this.d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.b || this.c) {
            Iterator<e1> it = this.a.C0.iterator();
            while (it.hasNext()) {
                e1 next = it.next();
                next.a = false;
                next.d.r();
                next.e.q();
            }
            f1 f1Var = this.a;
            f1Var.a = false;
            f1Var.d.r();
            this.a.e.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.D0(0);
        this.a.E0(0);
        e1.b s = this.a.s(0);
        e1.b s2 = this.a.s(1);
        if (this.b) {
            c();
        }
        int Q = this.a.Q();
        int R = this.a.R();
        this.a.d.h.d(Q);
        this.a.e.h.d(R);
        m();
        e1.b bVar = e1.b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator<z1> it2 = this.e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && s == e1.b.WRAP_CONTENT) {
                this.a.k0(e1.b.FIXED);
                f1 f1Var2 = this.a;
                f1Var2.C0(e(f1Var2, 0));
                f1 f1Var3 = this.a;
                f1Var3.d.e.d(f1Var3.P());
            }
            if (z4 && s2 == e1.b.WRAP_CONTENT) {
                this.a.y0(e1.b.FIXED);
                f1 f1Var4 = this.a;
                f1Var4.g0(e(f1Var4, 1));
                f1 f1Var5 = this.a;
                f1Var5.e.e.d(f1Var5.v());
            }
        }
        e1.b[] bVarArr = this.a.K;
        if (bVarArr[0] == e1.b.FIXED || bVarArr[0] == e1.b.MATCH_PARENT) {
            int P = this.a.P() + Q;
            this.a.d.i.d(P);
            this.a.d.e.d(P - Q);
            m();
            e1.b[] bVarArr2 = this.a.K;
            if (bVarArr2[1] == e1.b.FIXED || bVarArr2[1] == e1.b.MATCH_PARENT) {
                int v = this.a.v() + R;
                this.a.e.i.d(v);
                this.a.e.e.d(v - R);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<z1> it3 = this.e.iterator();
        while (it3.hasNext()) {
            z1 next2 = it3.next();
            if (next2.b != this.a || next2.g) {
                next2.e();
            }
        }
        Iterator<z1> it4 = this.e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            z1 next3 = it4.next();
            if ((z2 || next3.b != this.a) && (!next3.h.j || ((!next3.i.j && !(next3 instanceof u1)) || (!next3.e.j && !(next3 instanceof p1) && !(next3 instanceof u1))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.a.k0(s);
        this.a.y0(s2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            Iterator<e1> it = this.a.C0.iterator();
            while (it.hasNext()) {
                e1 next = it.next();
                next.a = false;
                w1 w1Var = next.d;
                w1Var.e.j = false;
                w1Var.g = false;
                w1Var.r();
                y1 y1Var = next.e;
                y1Var.e.j = false;
                y1Var.g = false;
                y1Var.q();
            }
            f1 f1Var = this.a;
            f1Var.a = false;
            w1 w1Var2 = f1Var.d;
            w1Var2.e.j = false;
            w1Var2.g = false;
            w1Var2.r();
            y1 y1Var2 = this.a.e;
            y1Var2.e.j = false;
            y1Var2.g = false;
            y1Var2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.D0(0);
        this.a.E0(0);
        this.a.d.h.d(0);
        this.a.e.h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0140 A[EDGE_INSN: B:78:0x0140->B:64:0x0140 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            f1 r1 = r9.a
            r2 = 0
            e1$b r1 = r1.s(r2)
            f1 r3 = r9.a
            e1$b r3 = r3.s(r0)
            f1 r4 = r9.a
            int r4 = r4.Q()
            f1 r5 = r9.a
            int r5 = r5.R()
            if (r10 == 0) goto L_0x0086
            e1$b r6 = defpackage.e1.b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<z1> r6 = r9.e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            z1 r7 = (defpackage.z1) r7
            int r8 = r7.f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            e1$b r10 = defpackage.e1.b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            f1 r10 = r9.a
            e1$b r6 = defpackage.e1.b.FIXED
            r10.k0(r6)
            f1 r10 = r9.a
            int r6 = r9.e(r10, r2)
            r10.C0(r6)
            f1 r10 = r9.a
            w1 r6 = r10.d
            t1 r6 = r6.e
            int r10 = r10.P()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            e1$b r10 = defpackage.e1.b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            f1 r10 = r9.a
            e1$b r6 = defpackage.e1.b.FIXED
            r10.y0(r6)
            f1 r10 = r9.a
            int r6 = r9.e(r10, r0)
            r10.g0(r6)
            f1 r10 = r9.a
            y1 r6 = r10.e
            t1 r6 = r6.e
            int r10 = r10.v()
        L_0x0083:
            r6.d(r10)
        L_0x0086:
            f1 r10 = r9.a
            e1$b[] r10 = r10.K
            if (r11 != 0) goto L_0x00b3
            r5 = r10[r2]
            e1$b r6 = defpackage.e1.b.FIXED
            if (r5 == r6) goto L_0x0098
            r10 = r10[r2]
            e1$b r5 = defpackage.e1.b.MATCH_PARENT
            if (r10 != r5) goto L_0x00c0
        L_0x0098:
            f1 r10 = r9.a
            int r10 = r10.P()
            int r10 = r10 + r4
            f1 r5 = r9.a
            w1 r5 = r5.d
            s1 r5 = r5.i
            r5.d(r10)
            f1 r5 = r9.a
            w1 r5 = r5.d
            t1 r5 = r5.e
            int r10 = r10 - r4
            r5.d(r10)
            goto L_0x00dc
        L_0x00b3:
            r4 = r10[r0]
            e1$b r6 = defpackage.e1.b.FIXED
            if (r4 == r6) goto L_0x00c2
            r10 = r10[r0]
            e1$b r4 = defpackage.e1.b.MATCH_PARENT
            if (r10 != r4) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r10 = 0
            goto L_0x00dd
        L_0x00c2:
            f1 r10 = r9.a
            int r10 = r10.v()
            int r10 = r10 + r5
            f1 r4 = r9.a
            y1 r4 = r4.e
            s1 r4 = r4.i
            r4.d(r10)
            f1 r4 = r9.a
            y1 r4 = r4.e
            t1 r4 = r4.e
            int r10 = r10 - r5
            r4.d(r10)
        L_0x00dc:
            r10 = 1
        L_0x00dd:
            r9.m()
            java.util.ArrayList<z1> r4 = r9.e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0106
            java.lang.Object r5 = r4.next()
            z1 r5 = (defpackage.z1) r5
            int r6 = r5.f
            if (r6 == r11) goto L_0x00f7
            goto L_0x00e6
        L_0x00f7:
            e1 r6 = r5.b
            f1 r7 = r9.a
            if (r6 != r7) goto L_0x0102
            boolean r6 = r5.g
            if (r6 != 0) goto L_0x0102
            goto L_0x00e6
        L_0x0102:
            r5.e()
            goto L_0x00e6
        L_0x0106:
            java.util.ArrayList<z1> r4 = r9.e
            java.util.Iterator r4 = r4.iterator()
        L_0x010c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r4.next()
            z1 r5 = (defpackage.z1) r5
            int r6 = r5.f
            if (r6 == r11) goto L_0x011d
            goto L_0x010c
        L_0x011d:
            if (r10 != 0) goto L_0x0126
            e1 r6 = r5.b
            f1 r7 = r9.a
            if (r6 != r7) goto L_0x0126
            goto L_0x010c
        L_0x0126:
            s1 r6 = r5.h
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x012e
        L_0x012c:
            r0 = 0
            goto L_0x0140
        L_0x012e:
            s1 r6 = r5.i
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x0135
            goto L_0x012c
        L_0x0135:
            boolean r6 = r5 instanceof defpackage.p1
            if (r6 != 0) goto L_0x010c
            t1 r5 = r5.e
            boolean r5 = r5.j
            if (r5 != 0) goto L_0x010c
            goto L_0x012c
        L_0x0140:
            f1 r10 = r9.a
            r10.k0(r1)
            f1 r10 = r9.a
            r10.y0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.h(boolean, int):boolean");
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public void m() {
        t1 t1Var;
        t1 t1Var2;
        int P;
        t1 t1Var3;
        int P2;
        Iterator<e1> it = this.a.C0.iterator();
        while (it.hasNext()) {
            e1 next = it.next();
            if (!next.a) {
                e1.b[] bVarArr = next.K;
                boolean z = false;
                e1.b bVar = bVarArr[0];
                e1.b bVar2 = bVarArr[1];
                int i = next.j;
                int i2 = next.k;
                boolean z2 = bVar == e1.b.WRAP_CONTENT || (bVar == e1.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == e1.b.WRAP_CONTENT || (bVar2 == e1.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                t1 t1Var4 = next.d.e;
                boolean z3 = t1Var4.j;
                t1 t1Var5 = next.e.e;
                boolean z4 = t1Var5.j;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            l(next, e1.b.WRAP_CONTENT, next.d.e.g, e1.b.FIXED, next.e.e.g);
                            if (bVar == e1.b.MATCH_CONSTRAINT) {
                                t1Var3 = next.d.e;
                                P2 = next.P();
                            } else {
                                t1Var2 = next.d.e;
                                P = next.P();
                                t1Var2.d(P);
                            }
                        }
                        if (next.a && (t1Var = next.e.l) != null) {
                            t1Var.d(next.n());
                        }
                    } else {
                        l(next, e1.b.FIXED, next.d.e.g, e1.b.WRAP_CONTENT, next.e.e.g);
                        if (bVar2 == e1.b.MATCH_CONSTRAINT) {
                            t1Var3 = next.e.e;
                            P2 = next.v();
                        } else {
                            t1Var2 = next.e.e;
                            P = next.v();
                            t1Var2.d(P);
                        }
                    }
                    t1Var3.m = P2;
                    t1Var.d(next.n());
                } else {
                    e1.b bVar3 = e1.b.FIXED;
                    l(next, bVar3, t1Var4.g, bVar3, t1Var5.g);
                }
                next.a = true;
                t1Var.d(next.n());
            }
        }
    }

    public void n(o1.b bVar) {
        this.f = bVar;
    }
}
