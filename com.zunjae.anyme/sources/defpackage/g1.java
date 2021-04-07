package defpackage;

import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: g1  reason: default package */
public class g1 extends l1 {
    /* access modifiers changed from: private */
    public int P0 = -1;
    /* access modifiers changed from: private */
    public int Q0 = -1;
    /* access modifiers changed from: private */
    public int R0 = -1;
    /* access modifiers changed from: private */
    public int S0 = -1;
    /* access modifiers changed from: private */
    public int T0 = -1;
    /* access modifiers changed from: private */
    public int U0 = -1;
    /* access modifiers changed from: private */
    public float V0 = 0.5f;
    /* access modifiers changed from: private */
    public float W0 = 0.5f;
    /* access modifiers changed from: private */
    public float X0 = 0.5f;
    /* access modifiers changed from: private */
    public float Y0 = 0.5f;
    /* access modifiers changed from: private */
    public float Z0 = 0.5f;
    /* access modifiers changed from: private */
    public float a1 = 0.5f;
    /* access modifiers changed from: private */
    public int b1 = 0;
    /* access modifiers changed from: private */
    public int c1 = 0;
    /* access modifiers changed from: private */
    public int d1 = 2;
    /* access modifiers changed from: private */
    public int e1 = 2;
    private int f1 = 0;
    private int g1 = -1;
    private int h1 = 0;
    private ArrayList<a> i1 = new ArrayList<>();
    private e1[] j1 = null;
    private e1[] k1 = null;
    private int[] l1 = null;
    /* access modifiers changed from: private */
    public e1[] m1;
    private int n1 = 0;

    /* renamed from: g1$a */
    private class a {
        private int a = 0;
        /* access modifiers changed from: private */
        public e1 b = null;
        int c = 0;
        private d1 d;
        private d1 e;
        private d1 f;
        private d1 g;
        private int h = 0;
        private int i = 0;
        private int j = 0;
        private int k = 0;
        private int l = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;
        private int q = 0;

        public a(int i2, d1 d1Var, d1 d1Var2, d1 d1Var3, d1 d1Var4, int i3) {
            this.a = i2;
            this.d = d1Var;
            this.e = d1Var2;
            this.f = d1Var3;
            this.g = d1Var4;
            this.h = g1.this.N0();
            this.i = g1.this.P0();
            this.j = g1.this.O0();
            this.k = g1.this.M0();
            this.q = i3;
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2; i3++) {
                e1 e1Var = g1.this.m1[this.n + i3];
                if (this.a == 0) {
                    int P = e1Var.P();
                    int d1 = g1.this.b1;
                    if (e1Var.O() == 8) {
                        d1 = 0;
                    }
                    this.l += P + d1;
                    int p1 = g1.this.x1(e1Var, this.q);
                    if (this.b == null || this.c < p1) {
                        this.b = e1Var;
                        this.c = p1;
                        this.m = p1;
                    }
                } else {
                    int o1 = g1.this.y1(e1Var, this.q);
                    int p12 = g1.this.x1(e1Var, this.q);
                    int e1 = g1.this.c1;
                    if (e1Var.O() == 8) {
                        e1 = 0;
                    }
                    this.m += p12 + e1;
                    if (this.b == null || this.c < o1) {
                        this.b = e1Var;
                        this.c = o1;
                        this.l = o1;
                    }
                }
            }
        }

        public void b(e1 e1Var) {
            int i2 = 0;
            if (this.a == 0) {
                if (e1Var.y() == e1.b.MATCH_CONSTRAINT) {
                    this.p++;
                }
                int o1 = g1.this.y1(e1Var, this.q);
                int d1 = g1.this.b1;
                if (e1Var.O() != 8) {
                    i2 = d1;
                }
                this.l += o1 + i2;
                int p1 = g1.this.x1(e1Var, this.q);
                if (this.b == null || this.c < p1) {
                    this.b = e1Var;
                    this.c = p1;
                    this.m = p1;
                }
            } else {
                if (e1Var.M() == e1.b.MATCH_CONSTRAINT) {
                    this.p++;
                }
                int o12 = g1.this.y1(e1Var, this.q);
                int p12 = g1.this.x1(e1Var, this.q);
                int e1 = g1.this.c1;
                if (e1Var.O() != 8) {
                    i2 = e1;
                }
                this.m += p12 + i2;
                if (this.b == null || this.c < o12) {
                    this.b = e1Var;
                    this.c = o12;
                    this.l = o12;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:115:0x0201  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.o
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x001b
                g1 r4 = defpackage.g1.this
                e1[] r4 = r4.m1
                int r5 = r0.n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0018
                r4.Y()
            L_0x0018:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x001b:
                if (r1 == 0) goto L_0x02ed
                e1 r3 = r0.b
                if (r3 != 0) goto L_0x0023
                goto L_0x02ed
            L_0x0023:
                if (r19 == 0) goto L_0x0029
                if (r18 != 0) goto L_0x0029
                r4 = 1
                goto L_0x002a
            L_0x0029:
                r4 = 0
            L_0x002a:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x002e:
                if (r6 >= r1) goto L_0x004f
                if (r17 == 0) goto L_0x0036
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0037
            L_0x0036:
                r9 = r6
            L_0x0037:
                g1 r10 = defpackage.g1.this
                e1[] r10 = r10.m1
                int r11 = r0.n
                int r11 = r11 + r9
                r9 = r10[r11]
                int r9 = r9.O()
                if (r9 != 0) goto L_0x004c
                if (r7 != r5) goto L_0x004b
                r7 = r6
            L_0x004b:
                r8 = r6
            L_0x004c:
                int r6 = r6 + 1
                goto L_0x002e
            L_0x004f:
                r6 = 0
                int r9 = r0.a
                if (r9 != 0) goto L_0x01aa
                e1 r9 = r0.b
                g1 r10 = defpackage.g1.this
                int r10 = r10.Q0
                r9.w0(r10)
                int r10 = r0.i
                if (r18 <= 0) goto L_0x006a
                g1 r11 = defpackage.g1.this
                int r11 = r11.c1
                int r10 = r10 + r11
            L_0x006a:
                d1 r11 = r9.B
                d1 r12 = r0.e
                r11.a(r12, r10)
                if (r19 == 0) goto L_0x007c
                d1 r10 = r9.D
                d1 r11 = r0.g
                int r12 = r0.k
                r10.a(r11, r12)
            L_0x007c:
                if (r18 <= 0) goto L_0x0089
                d1 r10 = r0.e
                e1 r10 = r10.a
                d1 r10 = r10.D
                d1 r11 = r9.B
                r10.a(r11, r2)
            L_0x0089:
                g1 r10 = defpackage.g1.this
                int r10 = r10.e1
                r11 = 3
                if (r10 != r11) goto L_0x00b7
                boolean r10 = r9.S()
                if (r10 != 0) goto L_0x00b7
                r10 = 0
            L_0x0099:
                if (r10 >= r1) goto L_0x00b7
                if (r17 == 0) goto L_0x00a1
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00a2
            L_0x00a1:
                r12 = r10
            L_0x00a2:
                g1 r13 = defpackage.g1.this
                e1[] r13 = r13.m1
                int r14 = r0.n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.S()
                if (r13 == 0) goto L_0x00b4
                goto L_0x00b8
            L_0x00b4:
                int r10 = r10 + 1
                goto L_0x0099
            L_0x00b7:
                r12 = r9
            L_0x00b8:
                r10 = 0
            L_0x00b9:
                if (r10 >= r1) goto L_0x02ed
                if (r17 == 0) goto L_0x00c1
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00c2
            L_0x00c1:
                r13 = r10
            L_0x00c2:
                g1 r14 = defpackage.g1.this
                e1[] r14 = r14.m1
                int r15 = r0.n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r10 != 0) goto L_0x00d8
                d1 r15 = r14.A
                d1 r11 = r0.d
                int r3 = r0.h
                r14.i(r15, r11, r3)
            L_0x00d8:
                if (r13 != 0) goto L_0x011b
                g1 r3 = defpackage.g1.this
                int r3 = r3.P0
                g1 r11 = defpackage.g1.this
                float r11 = r11.V0
                int r13 = r0.n
                if (r13 != 0) goto L_0x00ff
                g1 r13 = defpackage.g1.this
                int r13 = r13.R0
                if (r13 == r5) goto L_0x00ff
                g1 r3 = defpackage.g1.this
                int r3 = r3.R0
                g1 r11 = defpackage.g1.this
                float r11 = r11.X0
                goto L_0x0115
            L_0x00ff:
                if (r19 == 0) goto L_0x0115
                g1 r13 = defpackage.g1.this
                int r13 = r13.T0
                if (r13 == r5) goto L_0x0115
                g1 r3 = defpackage.g1.this
                int r3 = r3.T0
                g1 r11 = defpackage.g1.this
                float r11 = r11.Z0
            L_0x0115:
                r14.i0(r3)
                r14.h0(r11)
            L_0x011b:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x0128
                d1 r3 = r14.C
                d1 r11 = r0.f
                int r13 = r0.j
                r14.i(r3, r11, r13)
            L_0x0128:
                if (r6 == 0) goto L_0x0153
                d1 r3 = r14.A
                d1 r11 = r6.C
                g1 r13 = defpackage.g1.this
                int r13 = r13.b1
                r3.a(r11, r13)
                if (r10 != r7) goto L_0x0140
                d1 r3 = r14.A
                int r11 = r0.h
                r3.m(r11)
            L_0x0140:
                d1 r3 = r6.C
                d1 r11 = r14.A
                r3.a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x0153
                d1 r3 = r6.C
                int r6 = r0.j
                r3.m(r6)
            L_0x0153:
                if (r14 == r9) goto L_0x01a3
                g1 r3 = defpackage.g1.this
                int r3 = r3.e1
                r6 = 3
                if (r3 != r6) goto L_0x0171
                boolean r3 = r12.S()
                if (r3 == 0) goto L_0x0171
                if (r14 == r12) goto L_0x0171
                boolean r3 = r14.S()
                if (r3 == 0) goto L_0x0171
                d1 r3 = r14.E
                d1 r11 = r12.E
                goto L_0x019f
            L_0x0171:
                g1 r3 = defpackage.g1.this
                int r3 = r3.e1
                if (r3 == 0) goto L_0x019b
                r11 = 1
                if (r3 == r11) goto L_0x0196
                d1 r3 = r14.B
                if (r4 == 0) goto L_0x0191
                d1 r11 = r0.e
                int r13 = r0.i
                r3.a(r11, r13)
                d1 r3 = r14.D
                d1 r11 = r0.g
                int r13 = r0.k
                r3.a(r11, r13)
                goto L_0x01a4
            L_0x0191:
                d1 r11 = r9.B
                r3.a(r11, r2)
            L_0x0196:
                d1 r3 = r14.D
                d1 r11 = r9.D
                goto L_0x019f
            L_0x019b:
                d1 r3 = r14.B
                d1 r11 = r9.B
            L_0x019f:
                r3.a(r11, r2)
                goto L_0x01a4
            L_0x01a3:
                r6 = 3
            L_0x01a4:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00b9
            L_0x01aa:
                e1 r3 = r0.b
                g1 r9 = defpackage.g1.this
                int r9 = r9.P0
                r3.i0(r9)
                int r9 = r0.h
                if (r18 <= 0) goto L_0x01c0
                g1 r10 = defpackage.g1.this
                int r10 = r10.b1
                int r9 = r9 + r10
            L_0x01c0:
                if (r17 == 0) goto L_0x01df
                d1 r10 = r3.C
                d1 r11 = r0.f
                r10.a(r11, r9)
                if (r19 == 0) goto L_0x01d4
                d1 r9 = r3.A
                d1 r10 = r0.d
                int r11 = r0.j
                r9.a(r10, r11)
            L_0x01d4:
                if (r18 <= 0) goto L_0x01fe
                d1 r9 = r0.f
                e1 r9 = r9.a
                d1 r9 = r9.A
                d1 r10 = r3.C
                goto L_0x01fb
            L_0x01df:
                d1 r10 = r3.A
                d1 r11 = r0.d
                r10.a(r11, r9)
                if (r19 == 0) goto L_0x01f1
                d1 r9 = r3.C
                d1 r10 = r0.f
                int r11 = r0.j
                r9.a(r10, r11)
            L_0x01f1:
                if (r18 <= 0) goto L_0x01fe
                d1 r9 = r0.d
                e1 r9 = r9.a
                d1 r9 = r9.C
                d1 r10 = r3.A
            L_0x01fb:
                r9.a(r10, r2)
            L_0x01fe:
                r9 = 0
            L_0x01ff:
                if (r9 >= r1) goto L_0x02ed
                g1 r10 = defpackage.g1.this
                e1[] r10 = r10.m1
                int r11 = r0.n
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r9 != 0) goto L_0x0258
                d1 r11 = r10.B
                d1 r12 = r0.e
                int r13 = r0.i
                r10.i(r11, r12, r13)
                g1 r11 = defpackage.g1.this
                int r11 = r11.Q0
                g1 r12 = defpackage.g1.this
                float r12 = r12.W0
                int r13 = r0.n
                if (r13 != 0) goto L_0x023c
                g1 r13 = defpackage.g1.this
                int r13 = r13.S0
                if (r13 == r5) goto L_0x023c
                g1 r11 = defpackage.g1.this
                int r11 = r11.S0
                g1 r12 = defpackage.g1.this
                float r12 = r12.Y0
                goto L_0x0252
            L_0x023c:
                if (r19 == 0) goto L_0x0252
                g1 r13 = defpackage.g1.this
                int r13 = r13.U0
                if (r13 == r5) goto L_0x0252
                g1 r11 = defpackage.g1.this
                int r11 = r11.U0
                g1 r12 = defpackage.g1.this
                float r12 = r12.a1
            L_0x0252:
                r10.w0(r11)
                r10.v0(r12)
            L_0x0258:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x0265
                d1 r11 = r10.D
                d1 r12 = r0.g
                int r13 = r0.k
                r10.i(r11, r12, r13)
            L_0x0265:
                if (r6 == 0) goto L_0x0290
                d1 r11 = r10.B
                d1 r12 = r6.D
                g1 r13 = defpackage.g1.this
                int r13 = r13.c1
                r11.a(r12, r13)
                if (r9 != r7) goto L_0x027d
                d1 r11 = r10.B
                int r12 = r0.i
                r11.m(r12)
            L_0x027d:
                d1 r11 = r6.D
                d1 r12 = r10.B
                r11.a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x0290
                d1 r6 = r6.D
                int r11 = r0.k
                r6.m(r11)
            L_0x0290:
                if (r10 == r3) goto L_0x02e7
                r6 = 2
                g1 r11 = defpackage.g1.this
                int r11 = r11.d1
                if (r17 == 0) goto L_0x02b8
                if (r11 == 0) goto L_0x02b0
                r12 = 1
                if (r11 == r12) goto L_0x02ab
                if (r11 == r6) goto L_0x02a3
                goto L_0x02e7
            L_0x02a3:
                d1 r6 = r10.A
                d1 r11 = r3.A
                r6.a(r11, r2)
                goto L_0x02b0
            L_0x02ab:
                d1 r6 = r10.A
                d1 r11 = r3.A
                goto L_0x02b4
            L_0x02b0:
                d1 r6 = r10.C
                d1 r11 = r3.C
            L_0x02b4:
                r6.a(r11, r2)
                goto L_0x02e7
            L_0x02b8:
                r12 = 1
                if (r11 == 0) goto L_0x02df
                if (r11 == r12) goto L_0x02da
                if (r11 == r6) goto L_0x02c0
                goto L_0x02e8
            L_0x02c0:
                d1 r6 = r10.A
                if (r4 == 0) goto L_0x02d5
                d1 r11 = r0.d
                int r13 = r0.h
                r6.a(r11, r13)
                d1 r6 = r10.C
                d1 r11 = r0.f
                int r13 = r0.j
                r6.a(r11, r13)
                goto L_0x02e8
            L_0x02d5:
                d1 r11 = r3.A
                r6.a(r11, r2)
            L_0x02da:
                d1 r6 = r10.C
                d1 r11 = r3.C
                goto L_0x02e3
            L_0x02df:
                d1 r6 = r10.A
                d1 r11 = r3.A
            L_0x02e3:
                r6.a(r11, r2)
                goto L_0x02e8
            L_0x02e7:
                r12 = 1
            L_0x02e8:
                int r9 = r9 + 1
                r6 = r10
                goto L_0x01ff
            L_0x02ed:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.g1.a.d(boolean, int, boolean):void");
        }

        public int e() {
            return this.a == 1 ? this.m - g1.this.c1 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - g1.this.b1 : this.l;
        }

        public void g(int i2) {
            int i3;
            e1.b bVar;
            int i4;
            e1.b bVar2;
            g1 g1Var;
            int i5 = this.p;
            if (i5 != 0) {
                int i6 = this.o;
                int i7 = i2 / i5;
                for (int i8 = 0; i8 < i6; i8++) {
                    e1 e1Var = g1.this.m1[this.n + i8];
                    if (this.a == 0) {
                        if (e1Var != null && e1Var.y() == e1.b.MATCH_CONSTRAINT) {
                            g1Var = g1.this;
                            bVar2 = e1.b.FIXED;
                            bVar = e1Var.M();
                            i3 = e1Var.v();
                            i4 = i7;
                        }
                    } else {
                        if (e1Var != null && e1Var.M() == e1.b.MATCH_CONSTRAINT) {
                            g1Var = g1.this;
                            bVar2 = e1Var.y();
                            i4 = e1Var.P();
                            bVar = e1.b.FIXED;
                            i3 = i7;
                        }
                    }
                    g1Var.R0(e1Var, bVar2, i4, bVar, i3);
                }
                h();
            }
        }

        public void i(int i2) {
            this.n = i2;
        }

        public void j(int i2, d1 d1Var, d1 d1Var2, d1 d1Var3, d1 d1Var4, int i3, int i4, int i5, int i6, int i7) {
            this.a = i2;
            this.d = d1Var;
            this.e = d1Var2;
            this.f = d1Var3;
            this.g = d1Var4;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = i6;
            this.q = i7;
        }
    }

    private void A1(e1[] e1VarArr, int i, int i2, int i3, int[] iArr) {
        d1 d1Var;
        int i4;
        int i5;
        int i6;
        d1 d1Var2;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.i1.clear();
            a aVar = new a(i2, this.A, this.B, this.C, this.D, i3);
            this.i1.add(aVar);
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            if (i2 == 0) {
                while (i14 < i10) {
                    e1 e1Var = e1VarArr[i14];
                    int y1 = y1(e1Var, i11);
                    if (e1Var.y() == e1.b.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i15 = i12;
                    boolean z = (this.b1 + i13) + y1 > i11 && aVar.b != null;
                    if (!z && i14 > 0 && (i9 = this.g1) > 0 && i14 % i9 == 0) {
                        z = true;
                    }
                    if (z) {
                        aVar = new a(i2, this.A, this.B, this.C, this.D, i3);
                        aVar.i(i14);
                        this.i1.add(aVar);
                    } else if (i14 > 0) {
                        i13 += this.b1 + y1;
                        aVar.b(e1Var);
                        i14++;
                        i12 = i15;
                    }
                    i13 = y1;
                    aVar.b(e1Var);
                    i14++;
                    i12 = i15;
                }
            } else {
                while (i14 < i10) {
                    e1 e1Var2 = e1VarArr[i14];
                    int x1 = x1(e1Var2, i11);
                    if (e1Var2.M() == e1.b.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i16 = i12;
                    boolean z2 = (this.c1 + i13) + x1 > i11 && aVar.b != null;
                    if (!z2 && i14 > 0 && (i8 = this.g1) > 0 && i14 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new a(i2, this.A, this.B, this.C, this.D, i3);
                        aVar.i(i14);
                        this.i1.add(aVar);
                    } else if (i14 > 0) {
                        i7 = i13 + this.c1 + x1;
                        aVar.b(e1Var2);
                        i14++;
                        i12 = i16;
                    }
                    i7 = x1;
                    aVar.b(e1Var2);
                    i14++;
                    i12 = i16;
                }
            }
            int size = this.i1.size();
            d1 d1Var3 = this.A;
            d1 d1Var4 = this.B;
            d1 d1Var5 = this.C;
            d1 d1Var6 = this.D;
            int N0 = N0();
            int P02 = P0();
            int O0 = O0();
            int M0 = M0();
            boolean z3 = y() == e1.b.WRAP_CONTENT || M() == e1.b.WRAP_CONTENT;
            if (i12 > 0 && z3) {
                for (int i17 = 0; i17 < size; i17++) {
                    a aVar2 = this.i1.get(i17);
                    aVar2.g(i11 - (i2 == 0 ? aVar2.f() : aVar2.e()));
                }
            }
            int i18 = P02;
            int i19 = O0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = N0;
            d1 d1Var7 = d1Var4;
            d1 d1Var8 = d1Var3;
            int i24 = M0;
            while (i22 < size) {
                a aVar3 = this.i1.get(i22);
                if (i2 == 0) {
                    if (i22 < size - 1) {
                        d1Var2 = this.i1.get(i22 + 1).b.B;
                        i6 = 0;
                    } else {
                        d1Var2 = this.D;
                        i6 = M0();
                    }
                    d1 d1Var9 = aVar3.b.D;
                    d1 d1Var10 = d1Var8;
                    d1 d1Var11 = d1Var8;
                    int i25 = i20;
                    d1 d1Var12 = d1Var7;
                    int i26 = i21;
                    d1 d1Var13 = d1Var5;
                    d1 d1Var14 = d1Var5;
                    i4 = i22;
                    aVar3.j(i2, d1Var10, d1Var12, d1Var13, d1Var2, i23, i18, i19, i6, i3);
                    int max = Math.max(i26, aVar3.f());
                    i20 = i25 + aVar3.e();
                    if (i4 > 0) {
                        i20 += this.c1;
                    }
                    d1Var8 = d1Var11;
                    i21 = max;
                    d1Var7 = d1Var9;
                    i18 = 0;
                    d1Var = d1Var14;
                    int i27 = i6;
                    d1Var6 = d1Var2;
                    i24 = i27;
                } else {
                    d1 d1Var15 = d1Var8;
                    int i28 = i20;
                    int i29 = i21;
                    i4 = i22;
                    if (i4 < size - 1) {
                        d1Var = this.i1.get(i4 + 1).b.A;
                        i5 = 0;
                    } else {
                        d1Var = this.C;
                        i5 = O0();
                    }
                    d1 d1Var16 = aVar3.b.C;
                    aVar3.j(i2, d1Var15, d1Var7, d1Var, d1Var6, i23, i18, i5, i24, i3);
                    i21 = i29 + aVar3.f();
                    int max2 = Math.max(i28, aVar3.e());
                    if (i4 > 0) {
                        i21 += this.b1;
                    }
                    i20 = max2;
                    i19 = i5;
                    d1Var8 = d1Var16;
                    i23 = 0;
                }
                i22 = i4 + 1;
                int i30 = i3;
                d1Var5 = d1Var;
            }
            iArr[0] = i21;
            iArr[1] = i20;
        }
    }

    private void B1(e1[] e1VarArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        int i4 = i;
        if (i4 != 0) {
            if (this.i1.size() == 0) {
                aVar = new a(i2, this.A, this.B, this.C, this.D, i3);
                this.i1.add(aVar);
            } else {
                a aVar2 = this.i1.get(0);
                aVar2.c();
                aVar = aVar2;
                int i5 = i2;
                aVar.j(i5, this.A, this.B, this.C, this.D, N0(), P0(), O0(), M0(), i3);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                aVar.b(e1VarArr[i6]);
            }
            iArr[0] = aVar.f();
            iArr[1] = aVar.e();
        }
    }

    private void w1(boolean z) {
        e1 e1Var;
        if (this.l1 != null && this.k1 != null && this.j1 != null) {
            for (int i = 0; i < this.n1; i++) {
                this.m1[i].Y();
            }
            int[] iArr = this.l1;
            int i2 = iArr[0];
            int i3 = iArr[1];
            e1 e1Var2 = null;
            for (int i4 = 0; i4 < i2; i4++) {
                e1 e1Var3 = this.k1[z ? (i2 - i4) - 1 : i4];
                if (!(e1Var3 == null || e1Var3.O() == 8)) {
                    if (i4 == 0) {
                        e1Var3.i(e1Var3.A, this.A, N0());
                        e1Var3.i0(this.P0);
                        e1Var3.h0(this.V0);
                    }
                    if (i4 == i2 - 1) {
                        e1Var3.i(e1Var3.C, this.C, O0());
                    }
                    if (i4 > 0) {
                        e1Var3.i(e1Var3.A, e1Var2.C, this.b1);
                        e1Var2.i(e1Var2.C, e1Var3.A, 0);
                    }
                    e1Var2 = e1Var3;
                }
            }
            for (int i5 = 0; i5 < i3; i5++) {
                e1 e1Var4 = this.j1[i5];
                if (!(e1Var4 == null || e1Var4.O() == 8)) {
                    if (i5 == 0) {
                        e1Var4.i(e1Var4.B, this.B, P0());
                        e1Var4.w0(this.Q0);
                        e1Var4.v0(this.W0);
                    }
                    if (i5 == i3 - 1) {
                        e1Var4.i(e1Var4.D, this.D, M0());
                    }
                    if (i5 > 0) {
                        e1Var4.i(e1Var4.B, e1Var2.D, this.c1);
                        e1Var2.i(e1Var2.D, e1Var4.B, 0);
                    }
                    e1Var2 = e1Var4;
                }
            }
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = (i7 * i2) + i6;
                    if (this.h1 == 1) {
                        i8 = (i6 * i3) + i7;
                    }
                    e1[] e1VarArr = this.m1;
                    if (!(i8 >= e1VarArr.length || (e1Var = e1VarArr[i8]) == null || e1Var.O() == 8)) {
                        e1 e1Var5 = this.k1[i6];
                        e1 e1Var6 = this.j1[i7];
                        if (e1Var != e1Var5) {
                            e1Var.i(e1Var.A, e1Var5.A, 0);
                            e1Var.i(e1Var.C, e1Var5.C, 0);
                        }
                        if (e1Var != e1Var6) {
                            e1Var.i(e1Var.B, e1Var6.B, 0);
                            e1Var.i(e1Var.D, e1Var6.D, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int x1(e1 e1Var, int i) {
        if (e1Var == null) {
            return 0;
        }
        if (e1Var.M() == e1.b.MATCH_CONSTRAINT) {
            int i2 = e1Var.k;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (e1Var.r * ((float) i));
                if (i3 != e1Var.v()) {
                    R0(e1Var, e1Var.y(), e1Var.P(), e1.b.FIXED, i3);
                }
                return i3;
            }
        }
        return e1Var.v();
    }

    /* access modifiers changed from: private */
    public final int y1(e1 e1Var, int i) {
        if (e1Var == null) {
            return 0;
        }
        if (e1Var.y() == e1.b.MATCH_CONSTRAINT) {
            int i2 = e1Var.j;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (e1Var.o * ((float) i));
                if (i3 != e1Var.P()) {
                    R0(e1Var, e1.b.FIXED, i3, e1Var.M(), e1Var.v());
                }
                return i3;
            }
        }
        return e1Var.P();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    private void z1(defpackage.e1[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            int r6 = r0.g1
            if (r3 != 0) goto L_0x0030
            if (r6 > 0) goto L_0x002d
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0014:
            if (r7 >= r2) goto L_0x002d
            if (r7 <= 0) goto L_0x001b
            int r9 = r0.b1
            int r8 = r8 + r9
        L_0x001b:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            int r9 = r0.y1(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            int r6 = r6 + 1
        L_0x002a:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002d:
            r7 = r6
            r6 = 0
            goto L_0x004f
        L_0x0030:
            if (r6 > 0) goto L_0x004e
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0035:
            if (r7 >= r2) goto L_0x004e
            if (r7 <= 0) goto L_0x003c
            int r9 = r0.c1
            int r8 = r8 + r9
        L_0x003c:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            int r9 = r0.x1(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            int r6 = r6 + 1
        L_0x004b:
            int r7 = r7 + 1
            goto L_0x0035
        L_0x004e:
            r7 = 0
        L_0x004f:
            int[] r8 = r0.l1
            if (r8 != 0) goto L_0x0058
            r8 = 2
            int[] r8 = new int[r8]
            r0.l1 = r8
        L_0x0058:
            r8 = 1
            if (r6 != 0) goto L_0x005d
            if (r3 == r8) goto L_0x0061
        L_0x005d:
            if (r7 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 != 0) goto L_0x0129
            if (r3 != 0) goto L_0x0072
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L_0x007b
        L_0x0072:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L_0x007b:
            e1[] r10 = r0.k1
            r11 = 0
            if (r10 == 0) goto L_0x0088
            int r12 = r10.length
            if (r12 >= r7) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            java.util.Arrays.fill(r10, r11)
            goto L_0x008c
        L_0x0088:
            e1[] r10 = new defpackage.e1[r7]
            r0.k1 = r10
        L_0x008c:
            e1[] r10 = r0.j1
            if (r10 == 0) goto L_0x0098
            int r12 = r10.length
            if (r12 >= r6) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            java.util.Arrays.fill(r10, r11)
            goto L_0x009c
        L_0x0098:
            e1[] r10 = new defpackage.e1[r6]
            r0.j1 = r10
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 >= r7) goto L_0x00e5
            r11 = 0
        L_0x00a0:
            if (r11 >= r6) goto L_0x00e2
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto L_0x00aa
            int r12 = r10 * r6
            int r12 = r12 + r11
        L_0x00aa:
            int r13 = r1.length
            if (r12 < r13) goto L_0x00ae
            goto L_0x00df
        L_0x00ae:
            r12 = r1[r12]
            if (r12 != 0) goto L_0x00b3
            goto L_0x00df
        L_0x00b3:
            int r13 = r0.y1(r12, r4)
            e1[] r14 = r0.k1
            r15 = r14[r10]
            if (r15 == 0) goto L_0x00c5
            r14 = r14[r10]
            int r14 = r14.P()
            if (r14 >= r13) goto L_0x00c9
        L_0x00c5:
            e1[] r13 = r0.k1
            r13[r10] = r12
        L_0x00c9:
            int r13 = r0.x1(r12, r4)
            e1[] r14 = r0.j1
            r15 = r14[r11]
            if (r15 == 0) goto L_0x00db
            r14 = r14[r11]
            int r14 = r14.v()
            if (r14 >= r13) goto L_0x00df
        L_0x00db:
            e1[] r13 = r0.j1
            r13[r11] = r12
        L_0x00df:
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00e2:
            int r10 = r10 + 1
            goto L_0x009d
        L_0x00e5:
            r10 = 0
            r11 = 0
        L_0x00e7:
            if (r10 >= r7) goto L_0x00fc
            e1[] r12 = r0.k1
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00f9
            if (r10 <= 0) goto L_0x00f4
            int r13 = r0.b1
            int r11 = r11 + r13
        L_0x00f4:
            int r12 = r0.y1(r12, r4)
            int r11 = r11 + r12
        L_0x00f9:
            int r10 = r10 + 1
            goto L_0x00e7
        L_0x00fc:
            r10 = 0
            r12 = 0
        L_0x00fe:
            if (r10 >= r6) goto L_0x0113
            e1[] r13 = r0.j1
            r13 = r13[r10]
            if (r13 == 0) goto L_0x0110
            if (r10 <= 0) goto L_0x010b
            int r14 = r0.c1
            int r12 = r12 + r14
        L_0x010b:
            int r13 = r0.x1(r13, r4)
            int r12 = r12 + r13
        L_0x0110:
            int r10 = r10 + 1
            goto L_0x00fe
        L_0x0113:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L_0x0121
            if (r11 <= r4) goto L_0x0061
            if (r7 <= r8) goto L_0x0061
            int r7 = r7 + -1
            goto L_0x0064
        L_0x0121:
            if (r12 <= r4) goto L_0x0061
            if (r6 <= r8) goto L_0x0061
            int r6 = r6 + -1
            goto L_0x0064
        L_0x0129:
            int[] r1 = r0.l1
            r1[r5] = r7
            r1[r8] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1.z1(e1[], int, int, int, int[]):void");
    }

    public void C1(float f) {
        this.X0 = f;
    }

    public void D1(int i) {
        this.R0 = i;
    }

    public void E1(float f) {
        this.Y0 = f;
    }

    public void F1(int i) {
        this.S0 = i;
    }

    public void G1(int i) {
        this.d1 = i;
    }

    public void H1(float f) {
        this.V0 = f;
    }

    public void I1(int i) {
        this.b1 = i;
    }

    public void J1(int i) {
        this.P0 = i;
    }

    public void K1(float f) {
        this.Z0 = f;
    }

    public void L1(int i) {
        this.T0 = i;
    }

    public void M1(float f) {
        this.a1 = f;
    }

    public void N1(int i) {
        this.U0 = i;
    }

    public void O1(int i) {
        this.g1 = i;
    }

    public void P1(int i) {
        this.h1 = i;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r6.Q0 == -1) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r6.Q0 == -1) goto L_0x0056;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q0(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.D0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.S0()
            if (r0 != 0) goto L_0x001c
            r6.V0(r11, r11)
            r6.U0(r11)
            return
        L_0x001c:
            int r12 = r18.N0()
            int r13 = r18.O0()
            int r14 = r18.P0()
            int r15 = r18.M0()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.h1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            int r1 = r6.h1
            r2 = -1
            if (r1 != 0) goto L_0x004c
            int r1 = r6.P0
            if (r1 != r2) goto L_0x0047
            r6.P0 = r11
        L_0x0047:
            int r1 = r6.Q0
            if (r1 != r2) goto L_0x0058
            goto L_0x0056
        L_0x004c:
            int r1 = r6.P0
            if (r1 != r2) goto L_0x0052
            r6.P0 = r11
        L_0x0052:
            int r1 = r6.Q0
            if (r1 != r2) goto L_0x0058
        L_0x0056:
            r6.Q0 = r11
        L_0x0058:
            e1[] r1 = r6.C0
            r2 = 0
            r3 = 0
        L_0x005c:
            int r11 = r6.D0
            r0 = 8
            if (r2 >= r11) goto L_0x0072
            e1[] r11 = r6.C0
            r11 = r11[r2]
            int r11 = r11.O()
            if (r11 != r0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005c
        L_0x0072:
            if (r3 <= 0) goto L_0x0091
            int r11 = r11 - r3
            e1[] r1 = new defpackage.e1[r11]
            r2 = 0
            r3 = 0
        L_0x0079:
            int r11 = r6.D0
            if (r2 >= r11) goto L_0x008f
            e1[] r11 = r6.C0
            r11 = r11[r2]
            int r4 = r11.O()
            if (r4 == r0) goto L_0x008b
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008b:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0079
        L_0x008f:
            r2 = r3
            goto L_0x0092
        L_0x0091:
            r2 = r11
        L_0x0092:
            r6.m1 = r1
            r6.n1 = r2
            int r0 = r6.f1
            if (r0 == 0) goto L_0x00bf
            r4 = 1
            if (r0 == r4) goto L_0x00b2
            r3 = 2
            if (r0 == r3) goto L_0x00a5
            r17 = r5
            r0 = 0
            r11 = 1
            goto L_0x00cc
        L_0x00a5:
            int r3 = r6.h1
            r0 = r18
            r11 = 1
            r4 = r16
            r17 = r5
            r0.z1(r1, r2, r3, r4, r5)
            goto L_0x00cb
        L_0x00b2:
            r17 = r5
            r11 = 1
            int r3 = r6.h1
            r0 = r18
            r4 = r16
            r0.A1(r1, r2, r3, r4, r5)
            goto L_0x00cb
        L_0x00bf:
            r17 = r5
            r11 = 1
            int r3 = r6.h1
            r0 = r18
            r4 = r16
            r0.B1(r1, r2, r3, r4, r5)
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00dc
            r1 = r8
            goto L_0x00e7
        L_0x00dc:
            if (r7 != r3) goto L_0x00e3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00e7
        L_0x00e3:
            if (r7 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r1 = 0
        L_0x00e7:
            if (r9 != r4) goto L_0x00eb
            r2 = r10
            goto L_0x00f6
        L_0x00eb:
            if (r9 != r3) goto L_0x00f2
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x00f6
        L_0x00f2:
            if (r9 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            r6.V0(r1, r2)
            r6.C0(r1)
            r6.g0(r2)
            int r1 = r6.D0
            if (r1 <= 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r11 = 0
        L_0x0105:
            r6.U0(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1.Q0(int, int, int, int):void");
    }

    public void Q1(int i) {
        this.e1 = i;
    }

    public void R1(float f) {
        this.W0 = f;
    }

    public void S1(int i) {
        this.c1 = i;
    }

    public void T1(int i) {
        this.Q0 = i;
    }

    public void U1(int i) {
        this.f1 = i;
    }

    public void e(u0 u0Var) {
        super.e(u0Var);
        boolean Z02 = G() != null ? ((f1) G()).Z0() : false;
        int i = this.f1;
        if (i != 0) {
            if (i == 1) {
                int size = this.i1.size();
                int i2 = 0;
                while (i2 < size) {
                    this.i1.get(i2).d(Z02, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                w1(Z02);
            }
        } else if (this.i1.size() > 0) {
            this.i1.get(0).d(Z02, 0, true);
        }
        U0(false);
    }

    public void k(e1 e1Var, HashMap<e1, e1> hashMap) {
        super.k(e1Var, hashMap);
        g1 g1Var = (g1) e1Var;
        this.P0 = g1Var.P0;
        this.Q0 = g1Var.Q0;
        this.R0 = g1Var.R0;
        this.S0 = g1Var.S0;
        this.T0 = g1Var.T0;
        this.U0 = g1Var.U0;
        this.V0 = g1Var.V0;
        this.W0 = g1Var.W0;
        this.X0 = g1Var.X0;
        this.Y0 = g1Var.Y0;
        this.Z0 = g1Var.Z0;
        this.a1 = g1Var.a1;
        this.b1 = g1Var.b1;
        this.c1 = g1Var.c1;
        this.d1 = g1Var.d1;
        this.e1 = g1Var.e1;
        this.f1 = g1Var.f1;
        this.g1 = g1Var.g1;
        this.h1 = g1Var.h1;
    }
}
