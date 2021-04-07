package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p1  reason: default package */
public class p1 extends z1 {
    ArrayList<z1> k = new ArrayList<>();
    private int l;

    public p1(e1 e1Var, int i) {
        super(e1Var);
        this.f = i;
        q();
    }

    private void q() {
        e1 e1Var;
        e1 e1Var2 = this.b;
        do {
            e1Var = e1Var2;
            e1Var2 = e1Var2.H(this.f);
        } while (e1Var2 != null);
        this.b = e1Var;
        this.k.add(e1Var.J(this.f));
        e1 F = e1Var.F(this.f);
        while (F != null) {
            this.k.add(F.J(this.f));
            F = F.F(this.f);
        }
        Iterator<z1> it = this.k.iterator();
        while (it.hasNext()) {
            z1 next = it.next();
            int i = this.f;
            if (i == 0) {
                next.b.b = this;
            } else if (i == 1) {
                next.b.c = this;
            }
        }
        if ((this.f == 0 && ((f1) this.b.G()).Z0()) && this.k.size() > 1) {
            ArrayList<z1> arrayList = this.k;
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.x() : this.b.L();
    }

    private e1 r() {
        for (int i = 0; i < this.k.size(); i++) {
            z1 z1Var = this.k.get(i);
            if (z1Var.b.O() != 8) {
                return z1Var.b;
            }
        }
        return null;
    }

    private e1 s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            z1 z1Var = this.k.get(size);
            if (z1Var.b.O() != 8) {
                return z1Var.b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0198, code lost:
        if (r7 != r9) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c0, code lost:
        if (r7 != r9) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r2.e.j != false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.q1 r23) {
        /*
            r22 = this;
            r0 = r22
            s1 r1 = r0.h
            boolean r1 = r1.j
            if (r1 == 0) goto L_0x03f4
            s1 r1 = r0.i
            boolean r1 = r1.j
            if (r1 != 0) goto L_0x0010
            goto L_0x03f4
        L_0x0010:
            e1 r1 = r0.b
            e1 r1 = r1.G()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof defpackage.f1
            if (r3 == 0) goto L_0x0023
            f1 r1 = (defpackage.f1) r1
            boolean r1 = r1.Z0()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            s1 r3 = r0.i
            int r3 = r3.g
            s1 r4 = r0.h
            int r4 = r4.g
            int r3 = r3 - r4
            java.util.ArrayList<z1> r4 = r0.k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<z1> r8 = r0.k
            java.lang.Object r8 = r8.get(r5)
            z1 r8 = (defpackage.z1) r8
            e1 r8 = r8.b
            int r8 = r8.O()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<z1> r10 = r0.k
            java.lang.Object r10 = r10.get(r9)
            z1 r10 = (defpackage.z1) r10
            e1 r10 = r10.b
            int r10 = r10.O()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L_0x0106
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0072:
            if (r13 >= r4) goto L_0x00f8
            java.util.ArrayList<z1> r2 = r0.k
            java.lang.Object r2 = r2.get(r13)
            z1 r2 = (defpackage.z1) r2
            e1 r11 = r2.b
            int r11 = r11.O()
            if (r11 != r7) goto L_0x0086
            goto L_0x00f1
        L_0x0086:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0091
            if (r13 < r5) goto L_0x0091
            s1 r11 = r2.h
            int r11 = r11.f
            int r14 = r14 + r11
        L_0x0091:
            t1 r11 = r2.e
            int r11 = r11.g
            e1$b r7 = r2.d
            e1$b r10 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r7 == 0) goto L_0x00be
            int r10 = r0.f
            if (r10 != 0) goto L_0x00af
            e1 r10 = r2.b
            w1 r10 = r10.d
            t1 r10 = r10.e
            boolean r10 = r10.j
            if (r10 != 0) goto L_0x00af
            return
        L_0x00af:
            int r10 = r0.f
            if (r10 != r12) goto L_0x00d2
            e1 r10 = r2.b
            y1 r10 = r10.e
            t1 r10 = r10.e
            boolean r10 = r10.j
            if (r10 != 0) goto L_0x00d2
            return
        L_0x00be:
            int r10 = r2.a
            if (r10 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            t1 r7 = r2.e
            int r11 = r7.m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            t1 r10 = r2.e
            boolean r10 = r10.j
            if (r10 == 0) goto L_0x00d2
        L_0x00d1:
            r7 = 1
        L_0x00d2:
            if (r7 != 0) goto L_0x00e6
            int r15 = r15 + 1
            e1 r7 = r2.b
            float[] r7 = r7.w0
            int r10 = r0.f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00e7
            float r17 = r17 + r7
            goto L_0x00e7
        L_0x00e6:
            int r14 = r14 + r11
        L_0x00e7:
            if (r13 >= r8) goto L_0x00f1
            if (r13 >= r6) goto L_0x00f1
            s1 r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f1:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0072
        L_0x00f8:
            if (r14 < r3) goto L_0x0103
            if (r15 != 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0103:
            r2 = r16
            goto L_0x010b
        L_0x0106:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010b:
            s1 r7 = r0.h
            int r7 = r7.g
            if (r1 == 0) goto L_0x0115
            s1 r7 = r0.i
            int r7 = r7.g
        L_0x0115:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x0126
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x0125
            int r7 = r7 + r10
            goto L_0x0126
        L_0x0125:
            int r7 = r7 - r10
        L_0x0126:
            if (r15 <= 0) goto L_0x022b
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L_0x0133:
            if (r13 >= r4) goto L_0x01e0
            java.util.ArrayList<z1> r12 = r0.k
            java.lang.Object r12 = r12.get(r13)
            z1 r12 = (defpackage.z1) r12
            e1 r9 = r12.b
            int r9 = r9.O()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L_0x014b
            goto L_0x01cb
        L_0x014b:
            e1$b r9 = r12.d
            e1$b r11 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01cb
            t1 r9 = r12.e
            boolean r9 = r9.j
            if (r9 != 0) goto L_0x01cb
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x016d
            e1 r11 = r12.b
            float[] r11 = r11.w0
            int r9 = r0.f
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            goto L_0x016f
        L_0x016d:
            r9 = r18
        L_0x016f:
            int r11 = r0.f
            if (r11 != 0) goto L_0x019b
            e1 r11 = r12.b
            r19 = r10
            int r10 = r11.n
            int r11 = r11.m
            r20 = r14
            int r14 = r12.a
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L_0x018d
            t1 r7 = r12.e
            int r7 = r7.m
            int r7 = java.lang.Math.min(r9, r7)
            goto L_0x018e
        L_0x018d:
            r7 = r9
        L_0x018e:
            int r7 = java.lang.Math.max(r11, r7)
            if (r10 <= 0) goto L_0x0198
            int r7 = java.lang.Math.min(r10, r7)
        L_0x0198:
            if (r7 == r9) goto L_0x01c5
            goto L_0x01c2
        L_0x019b:
            r21 = r7
            r19 = r10
            r20 = r14
            e1 r7 = r12.b
            int r10 = r7.q
            int r7 = r7.p
            int r11 = r12.a
            r14 = 1
            if (r11 != r14) goto L_0x01b5
            t1 r11 = r12.e
            int r11 = r11.m
            int r11 = java.lang.Math.min(r9, r11)
            goto L_0x01b6
        L_0x01b5:
            r11 = r9
        L_0x01b6:
            int r7 = java.lang.Math.max(r7, r11)
            if (r10 <= 0) goto L_0x01c0
            int r7 = java.lang.Math.min(r10, r7)
        L_0x01c0:
            if (r7 == r9) goto L_0x01c5
        L_0x01c2:
            int r16 = r16 + 1
            r9 = r7
        L_0x01c5:
            t1 r7 = r12.e
            r7.d(r9)
            goto L_0x01d1
        L_0x01cb:
            r21 = r7
            r19 = r10
            r20 = r14
        L_0x01d1:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L_0x0133
        L_0x01e0:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L_0x021c
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L_0x01ea:
            if (r7 >= r4) goto L_0x021a
            java.util.ArrayList<z1> r10 = r0.k
            java.lang.Object r10 = r10.get(r7)
            z1 r10 = (defpackage.z1) r10
            e1 r11 = r10.b
            int r11 = r11.O()
            r12 = 8
            if (r11 != r12) goto L_0x01ff
            goto L_0x0217
        L_0x01ff:
            if (r7 <= 0) goto L_0x0208
            if (r7 < r5) goto L_0x0208
            s1 r11 = r10.h
            int r11 = r11.f
            int r9 = r9 + r11
        L_0x0208:
            t1 r11 = r10.e
            int r11 = r11.g
            int r9 = r9 + r11
            if (r7 >= r8) goto L_0x0217
            if (r7 >= r6) goto L_0x0217
            s1 r10 = r10.i
            int r10 = r10.f
            int r10 = -r10
            int r9 = r9 + r10
        L_0x0217:
            int r7 = r7 + 1
            goto L_0x01ea
        L_0x021a:
            r14 = r9
            goto L_0x021e
        L_0x021c:
            r14 = r20
        L_0x021e:
            int r7 = r0.l
            r9 = 2
            if (r7 != r9) goto L_0x0229
            if (r16 != 0) goto L_0x0229
            r7 = 0
            r0.l = r7
            goto L_0x0231
        L_0x0229:
            r7 = 0
            goto L_0x0231
        L_0x022b:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L_0x0231:
            if (r14 <= r3) goto L_0x0235
            r0.l = r9
        L_0x0235:
            if (r2 <= 0) goto L_0x023d
            if (r15 != 0) goto L_0x023d
            if (r5 != r6) goto L_0x023d
            r0.l = r9
        L_0x023d:
            int r9 = r0.l
            r10 = 1
            if (r9 != r10) goto L_0x02ce
            if (r2 <= r10) goto L_0x0248
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r3 = r3 / r2
            goto L_0x024f
        L_0x0248:
            if (r2 != r10) goto L_0x024e
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x024f
        L_0x024e:
            r3 = 0
        L_0x024f:
            if (r15 <= 0) goto L_0x0252
            r3 = 0
        L_0x0252:
            r7 = r21
            r2 = 0
        L_0x0255:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x025e
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x025f
        L_0x025e:
            r9 = r2
        L_0x025f:
            java.util.ArrayList<z1> r10 = r0.k
            java.lang.Object r9 = r10.get(r9)
            z1 r9 = (defpackage.z1) r9
            e1 r10 = r9.b
            int r10 = r10.O()
            r11 = 8
            if (r10 != r11) goto L_0x027c
            s1 r10 = r9.h
            r10.d(r7)
            s1 r9 = r9.i
            r9.d(r7)
            goto L_0x02cb
        L_0x027c:
            if (r2 <= 0) goto L_0x0283
            if (r1 == 0) goto L_0x0282
            int r7 = r7 - r3
            goto L_0x0283
        L_0x0282:
            int r7 = r7 + r3
        L_0x0283:
            if (r2 <= 0) goto L_0x0290
            if (r2 < r5) goto L_0x0290
            s1 r10 = r9.h
            int r10 = r10.f
            if (r1 == 0) goto L_0x028f
            int r7 = r7 - r10
            goto L_0x0290
        L_0x028f:
            int r7 = r7 + r10
        L_0x0290:
            if (r1 == 0) goto L_0x0295
            s1 r10 = r9.i
            goto L_0x0297
        L_0x0295:
            s1 r10 = r9.h
        L_0x0297:
            r10.d(r7)
            t1 r10 = r9.e
            int r11 = r10.g
            e1$b r12 = r9.d
            e1$b r13 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x02ab
            int r12 = r9.a
            r13 = 1
            if (r12 != r13) goto L_0x02ab
            int r11 = r10.m
        L_0x02ab:
            if (r1 == 0) goto L_0x02af
            int r7 = r7 - r11
            goto L_0x02b0
        L_0x02af:
            int r7 = r7 + r11
        L_0x02b0:
            if (r1 == 0) goto L_0x02b5
            s1 r10 = r9.h
            goto L_0x02b7
        L_0x02b5:
            s1 r10 = r9.i
        L_0x02b7:
            r10.d(r7)
            r10 = 1
            r9.g = r10
            if (r2 >= r8) goto L_0x02cb
            if (r2 >= r6) goto L_0x02cb
            s1 r9 = r9.i
            int r9 = r9.f
            int r9 = -r9
            if (r1 == 0) goto L_0x02ca
            int r7 = r7 - r9
            goto L_0x02cb
        L_0x02ca:
            int r7 = r7 + r9
        L_0x02cb:
            int r2 = r2 + 1
            goto L_0x0255
        L_0x02ce:
            if (r9 != 0) goto L_0x0352
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r3 = r3 / r2
            if (r15 <= 0) goto L_0x02d7
            r3 = 0
        L_0x02d7:
            r7 = r21
            r2 = 0
        L_0x02da:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x02e3
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x02e4
        L_0x02e3:
            r9 = r2
        L_0x02e4:
            java.util.ArrayList<z1> r10 = r0.k
            java.lang.Object r9 = r10.get(r9)
            z1 r9 = (defpackage.z1) r9
            e1 r10 = r9.b
            int r10 = r10.O()
            r11 = 8
            if (r10 != r11) goto L_0x0301
            s1 r10 = r9.h
            r10.d(r7)
            s1 r9 = r9.i
            r9.d(r7)
            goto L_0x034f
        L_0x0301:
            if (r1 == 0) goto L_0x0305
            int r7 = r7 - r3
            goto L_0x0306
        L_0x0305:
            int r7 = r7 + r3
        L_0x0306:
            if (r2 <= 0) goto L_0x0313
            if (r2 < r5) goto L_0x0313
            s1 r10 = r9.h
            int r10 = r10.f
            if (r1 == 0) goto L_0x0312
            int r7 = r7 - r10
            goto L_0x0313
        L_0x0312:
            int r7 = r7 + r10
        L_0x0313:
            if (r1 == 0) goto L_0x0318
            s1 r10 = r9.i
            goto L_0x031a
        L_0x0318:
            s1 r10 = r9.h
        L_0x031a:
            r10.d(r7)
            t1 r10 = r9.e
            int r11 = r10.g
            e1$b r12 = r9.d
            e1$b r13 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x0332
            int r12 = r9.a
            r13 = 1
            if (r12 != r13) goto L_0x0332
            int r10 = r10.m
            int r11 = java.lang.Math.min(r11, r10)
        L_0x0332:
            if (r1 == 0) goto L_0x0336
            int r7 = r7 - r11
            goto L_0x0337
        L_0x0336:
            int r7 = r7 + r11
        L_0x0337:
            if (r1 == 0) goto L_0x033c
            s1 r10 = r9.h
            goto L_0x033e
        L_0x033c:
            s1 r10 = r9.i
        L_0x033e:
            r10.d(r7)
            if (r2 >= r8) goto L_0x034f
            if (r2 >= r6) goto L_0x034f
            s1 r9 = r9.i
            int r9 = r9.f
            int r9 = -r9
            if (r1 == 0) goto L_0x034e
            int r7 = r7 - r9
            goto L_0x034f
        L_0x034e:
            int r7 = r7 + r9
        L_0x034f:
            int r2 = r2 + 1
            goto L_0x02da
        L_0x0352:
            r2 = 2
            if (r9 != r2) goto L_0x03f4
            int r2 = r0.f
            if (r2 != 0) goto L_0x0360
            e1 r2 = r0.b
            float r2 = r2.w()
            goto L_0x0366
        L_0x0360:
            e1 r2 = r0.b
            float r2 = r2.K()
        L_0x0366:
            if (r1 == 0) goto L_0x036c
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L_0x036c:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0378
            if (r15 <= 0) goto L_0x0379
        L_0x0378:
            r2 = 0
        L_0x0379:
            if (r1 == 0) goto L_0x037e
            int r2 = r21 - r2
            goto L_0x0380
        L_0x037e:
            int r2 = r21 + r2
        L_0x0380:
            r3 = r2
            r2 = 0
        L_0x0382:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x038b
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L_0x038c
        L_0x038b:
            r7 = r2
        L_0x038c:
            java.util.ArrayList<z1> r9 = r0.k
            java.lang.Object r7 = r9.get(r7)
            z1 r7 = (defpackage.z1) r7
            e1 r9 = r7.b
            int r9 = r9.O()
            r10 = 8
            if (r9 != r10) goto L_0x03aa
            s1 r9 = r7.h
            r9.d(r3)
            s1 r7 = r7.i
            r7.d(r3)
            r13 = 1
            goto L_0x03f1
        L_0x03aa:
            if (r2 <= 0) goto L_0x03b7
            if (r2 < r5) goto L_0x03b7
            s1 r9 = r7.h
            int r9 = r9.f
            if (r1 == 0) goto L_0x03b6
            int r3 = r3 - r9
            goto L_0x03b7
        L_0x03b6:
            int r3 = r3 + r9
        L_0x03b7:
            if (r1 == 0) goto L_0x03bc
            s1 r9 = r7.i
            goto L_0x03be
        L_0x03bc:
            s1 r9 = r7.h
        L_0x03be:
            r9.d(r3)
            t1 r9 = r7.e
            int r11 = r9.g
            e1$b r12 = r7.d
            e1$b r13 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x03d3
            int r12 = r7.a
            r13 = 1
            if (r12 != r13) goto L_0x03d4
            int r11 = r9.m
            goto L_0x03d4
        L_0x03d3:
            r13 = 1
        L_0x03d4:
            if (r1 == 0) goto L_0x03d8
            int r3 = r3 - r11
            goto L_0x03d9
        L_0x03d8:
            int r3 = r3 + r11
        L_0x03d9:
            if (r1 == 0) goto L_0x03de
            s1 r9 = r7.h
            goto L_0x03e0
        L_0x03de:
            s1 r9 = r7.i
        L_0x03e0:
            r9.d(r3)
            if (r2 >= r8) goto L_0x03f1
            if (r2 >= r6) goto L_0x03f1
            s1 r7 = r7.i
            int r7 = r7.f
            int r7 = -r7
            if (r1 == 0) goto L_0x03f0
            int r3 = r3 - r7
            goto L_0x03f1
        L_0x03f0:
            int r3 = r3 + r7
        L_0x03f1:
            int r2 = r2 + 1
            goto L_0x0382
        L_0x03f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1.a(q1):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList<z1> r0 = r5.k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            z1 r1 = (defpackage.z1) r1
            r1.d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<z1> r0 = r5.k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<z1> r2 = r5.k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            z1 r2 = (defpackage.z1) r2
            e1 r2 = r2.b
            java.util.ArrayList<z1> r4 = r5.k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            z1 r0 = (defpackage.z1) r0
            e1 r0 = r0.b
            int r4 = r5.f
            if (r4 != 0) goto L_0x0070
            d1 r1 = r2.A
            d1 r0 = r0.C
            s1 r2 = r5.i(r1, r3)
            int r1 = r1.c()
            e1 r4 = r5.r()
            if (r4 == 0) goto L_0x0052
            d1 r1 = r4.A
            int r1 = r1.c()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            s1 r4 = r5.h
            r5.b(r4, r2, r1)
        L_0x0059:
            s1 r1 = r5.i(r0, r3)
            int r0 = r0.c()
            e1 r2 = r5.s()
            if (r2 == 0) goto L_0x006d
            d1 r0 = r2.C
            int r0 = r0.c()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            d1 r2 = r2.B
            d1 r0 = r0.D
            s1 r3 = r5.i(r2, r1)
            int r2 = r2.c()
            e1 r4 = r5.r()
            if (r4 == 0) goto L_0x0088
            d1 r2 = r4.B
            int r2 = r2.c()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            s1 r4 = r5.h
            r5.b(r4, r3, r2)
        L_0x008f:
            s1 r1 = r5.i(r0, r1)
            int r0 = r0.c()
            e1 r2 = r5.s()
            if (r2 == 0) goto L_0x00a3
            d1 r0 = r2.D
            int r0 = r0.c()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            s1 r2 = r5.i
            int r0 = -r0
            r5.b(r2, r1, r0)
        L_0x00ab:
            s1 r0 = r5.h
            r0.a = r5
            s1 r0 = r5.i
            r0.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1.d():void");
    }

    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.c = null;
        Iterator<z1> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            z1 z1Var = this.k.get(i);
            j = j + ((long) z1Var.h.f) + z1Var.j() + ((long) z1Var.i.f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<z1> it = this.k.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
