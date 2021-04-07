package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.d1;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o1  reason: default package */
public class o1 {
    private final ArrayList<e1> a = new ArrayList<>();
    private a b = new a();
    private f1 c;

    /* renamed from: o1$a */
    public static class a {
        public e1.b a;
        public e1.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* renamed from: o1$b */
    public interface b {
        void a();

        void b(e1 e1Var, a aVar);
    }

    public o1(f1 f1Var) {
        this.c = f1Var;
    }

    private boolean a(b bVar, e1 e1Var, boolean z) {
        this.b.a = e1Var.y();
        this.b.b = e1Var.M();
        this.b.c = e1Var.P();
        this.b.d = e1Var.v();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = z;
        boolean z2 = aVar.a == e1.b.MATCH_CONSTRAINT;
        boolean z3 = this.b.b == e1.b.MATCH_CONSTRAINT;
        boolean z4 = z2 && e1Var.O > Utils.FLOAT_EPSILON;
        boolean z5 = z3 && e1Var.O > Utils.FLOAT_EPSILON;
        if (z4 && e1Var.l[0] == 4) {
            this.b.a = e1.b.FIXED;
        }
        if (z5 && e1Var.l[1] == 4) {
            this.b.b = e1.b.FIXED;
        }
        bVar.b(e1Var, this.b);
        e1Var.C0(this.b.e);
        e1Var.g0(this.b.f);
        e1Var.f0(this.b.h);
        e1Var.a0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = false;
        return aVar2.i;
    }

    private void b(f1 f1Var) {
        int size = f1Var.C0.size();
        b T0 = f1Var.T0();
        for (int i = 0; i < size; i++) {
            e1 e1Var = f1Var.C0.get(i);
            if (!(e1Var instanceof h1) && (!e1Var.d.e.j || !e1Var.e.e.j)) {
                e1.b s = e1Var.s(0);
                boolean z = true;
                e1.b s2 = e1Var.s(1);
                e1.b bVar = e1.b.MATCH_CONSTRAINT;
                if (s != bVar || e1Var.j == 1 || s2 != bVar || e1Var.k == 1) {
                    z = false;
                }
                if (!z) {
                    a(T0, e1Var, false);
                }
            }
        }
        T0.a();
    }

    private void c(f1 f1Var, String str, int i, int i2) {
        int E = f1Var.E();
        int D = f1Var.D();
        f1Var.s0(0);
        f1Var.r0(0);
        f1Var.C0(i);
        f1Var.g0(i2);
        f1Var.s0(E);
        f1Var.r0(D);
        this.c.J0();
    }

    public void d(f1 f1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        b bVar;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        v0 v0Var;
        f1 f1Var2 = f1Var;
        int i15 = i;
        int i16 = i4;
        int i17 = i6;
        b T0 = f1Var.T0();
        int size = f1Var2.C0.size();
        int P = f1Var.P();
        int v = f1Var.v();
        boolean b2 = k1.b(i15, 128);
        boolean z6 = b2 || k1.b(i15, 64);
        if (z6) {
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    break;
                }
                e1 e1Var = f1Var2.C0.get(i18);
                boolean z7 = (e1Var.y() == e1.b.MATCH_CONSTRAINT) && (e1Var.M() == e1.b.MATCH_CONSTRAINT) && e1Var.t() > Utils.FLOAT_EPSILON;
                if ((!e1Var.V() || !z7) && ((!e1Var.W() || !z7) && !(e1Var instanceof l1) && !e1Var.V() && !e1Var.W())) {
                    i18++;
                }
            }
            z6 = false;
        }
        if (z6 && (v0Var = u0.r) != null) {
            v0Var.a++;
        }
        if (z6 && ((i16 == 1073741824 && i17 == 1073741824) || b2)) {
            int min = Math.min(f1Var.C(), i5);
            int min2 = Math.min(f1Var.B(), i7);
            if (i16 == 1073741824 && f1Var.P() != min) {
                f1Var2.C0(min);
                f1Var.W0();
            }
            if (i17 == 1073741824 && f1Var.v() != min2) {
                f1Var2.g0(min2);
                f1Var.W0();
            }
            if (i16 == 1073741824 && i17 == 1073741824) {
                z = f1Var2.Q0(b2);
                i10 = 2;
            } else {
                boolean R0 = f1Var2.R0(b2);
                if (i16 == 1073741824) {
                    z5 = R0 & f1Var2.S0(b2, 0);
                    i14 = 1;
                } else {
                    z5 = R0;
                    i14 = 0;
                }
                if (i17 == 1073741824) {
                    boolean S0 = f1Var2.S0(b2, 1) & z5;
                    i10 = i14 + 1;
                    z = S0;
                } else {
                    i10 = i14;
                    z = z5;
                }
            }
            if (z) {
                f1Var2.G0(i16 == 1073741824, i17 == 1073741824);
            }
        } else {
            f1Var2.d.f();
            f1Var2.e.f();
            Iterator<e1> it = f1Var.I0().iterator();
            while (it.hasNext()) {
                e1 next = it.next();
                next.d.f();
                next.e.f();
            }
            z = false;
            i10 = 0;
        }
        if (!z || i10 != 2) {
            if (size > 0) {
                b(f1Var);
            }
            int U0 = f1Var.U0();
            int size2 = this.a.size();
            if (size > 0) {
                c(f1Var2, "First pass", P, v);
            }
            if (size2 > 0) {
                boolean z8 = f1Var.y() == e1.b.WRAP_CONTENT;
                boolean z9 = f1Var.M() == e1.b.WRAP_CONTENT;
                int max = Math.max(f1Var.P(), this.c.E());
                int max2 = Math.max(f1Var.v(), this.c.D());
                int i19 = 0;
                boolean z10 = false;
                while (i19 < size2) {
                    e1 e1Var2 = this.a.get(i19);
                    if (!(e1Var2 instanceof l1)) {
                        i13 = U0;
                    } else {
                        int P2 = e1Var2.P();
                        int v2 = e1Var2.v();
                        i13 = U0;
                        boolean a2 = z10 | a(T0, e1Var2, true);
                        int P3 = e1Var2.P();
                        boolean z11 = a2;
                        int v3 = e1Var2.v();
                        if (P3 != P2) {
                            e1Var2.C0(P3);
                            if (z8 && e1Var2.I() > max) {
                                max = Math.max(max, e1Var2.I() + e1Var2.m(d1.b.RIGHT).c());
                            }
                            z4 = true;
                        } else {
                            z4 = z11;
                        }
                        if (v3 != v2) {
                            e1Var2.g0(v3);
                            if (z9 && e1Var2.p() > max2) {
                                max2 = Math.max(max2, e1Var2.p() + e1Var2.m(d1.b.BOTTOM).c());
                            }
                            z4 = true;
                        }
                        z10 = z4 | ((l1) e1Var2).T0();
                    }
                    i19++;
                    U0 = i13;
                }
                int i20 = U0;
                int i21 = 0;
                while (i21 < 2) {
                    int i22 = 0;
                    while (i22 < size2) {
                        e1 e1Var3 = this.a.get(i22);
                        if ((!(e1Var3 instanceof i1) || (e1Var3 instanceof l1)) && !(e1Var3 instanceof h1) && e1Var3.O() != 8 && ((!e1Var3.d.e.j || !e1Var3.e.e.j) && !(e1Var3 instanceof l1))) {
                            int P4 = e1Var3.P();
                            int v4 = e1Var3.v();
                            i11 = size2;
                            int n = e1Var3.n();
                            i12 = i21;
                            z10 |= a(T0, e1Var3, true);
                            int P5 = e1Var3.P();
                            bVar = T0;
                            int v5 = e1Var3.v();
                            if (P5 != P4) {
                                e1Var3.C0(P5);
                                if (z8 && e1Var3.I() > max) {
                                    max = Math.max(max, e1Var3.I() + e1Var3.m(d1.b.RIGHT).c());
                                }
                                z10 = true;
                            }
                            if (v5 != v4) {
                                e1Var3.g0(v5);
                                if (z9 && e1Var3.p() > max2) {
                                    max2 = Math.max(max2, e1Var3.p() + e1Var3.m(d1.b.BOTTOM).c());
                                }
                                z10 = true;
                            }
                            if (e1Var3.S() && n != e1Var3.n()) {
                                z10 = true;
                            }
                        } else {
                            i12 = i21;
                            i11 = size2;
                            bVar = T0;
                        }
                        i22++;
                        size2 = i11;
                        T0 = bVar;
                        i21 = i12;
                    }
                    int i23 = i21;
                    int i24 = size2;
                    b bVar2 = T0;
                    if (z10) {
                        c(f1Var2, "intermediate pass", P, v);
                        z10 = false;
                    }
                    i21 = i23 + 1;
                    size2 = i24;
                    T0 = bVar2;
                }
                if (z10) {
                    c(f1Var2, "2nd pass", P, v);
                    if (f1Var.P() < max) {
                        f1Var2.C0(max);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (f1Var.v() < max2) {
                        f1Var2.g0(max2);
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        c(f1Var2, "3rd pass", P, v);
                    }
                }
                U0 = i20;
            }
            f1Var2.f1(U0);
        }
    }

    public void e(f1 f1Var) {
        this.a.clear();
        int size = f1Var.C0.size();
        for (int i = 0; i < size; i++) {
            e1 e1Var = f1Var.C0.get(i);
            if (e1Var.y() == e1.b.MATCH_CONSTRAINT || e1Var.y() == e1.b.MATCH_PARENT || e1Var.M() == e1.b.MATCH_CONSTRAINT || e1Var.M() == e1.b.MATCH_PARENT) {
                this.a.add(e1Var);
            }
        }
        f1Var.W0();
    }
}
