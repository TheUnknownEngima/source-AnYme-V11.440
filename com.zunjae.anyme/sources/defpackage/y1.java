package defpackage;

import defpackage.e1;
import defpackage.s1;

/* renamed from: y1  reason: default package */
public class y1 extends z1 {
    public s1 k;
    t1 l = null;

    /* renamed from: y1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                z1$b[] r0 = defpackage.z1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                z1$b r1 = defpackage.z1.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                z1$b r1 = defpackage.z1.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                z1$b r1 = defpackage.z1.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.y1.a.<clinit>():void");
        }
    }

    public y1(e1 e1Var) {
        super(e1Var);
        s1 s1Var = new s1(this);
        this.k = s1Var;
        this.h.e = s1.a.TOP;
        this.i.e = s1.a.BOTTOM;
        s1Var.e = s1.a.BASELINE;
        this.f = 1;
    }

    public void a(q1 q1Var) {
        int i;
        float f;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            p(q1Var);
        } else if (i2 == 2) {
            o(q1Var);
        } else if (i2 == 3) {
            e1 e1Var = this.b;
            n(q1Var, e1Var.B, e1Var.D, 1);
            return;
        }
        t1 t1Var = this.e;
        if (t1Var.c && !t1Var.j && this.d == e1.b.MATCH_CONSTRAINT) {
            e1 e1Var2 = this.b;
            int i3 = e1Var2.k;
            if (i3 == 2) {
                e1 G = e1Var2.G();
                if (G != null) {
                    t1 t1Var2 = G.e.e;
                    if (t1Var2.j) {
                        i = (int) ((((float) t1Var2.g) * this.b.r) + 0.5f);
                    }
                }
            } else if (i3 == 3 && e1Var2.d.e.j) {
                int u = e1Var2.u();
                if (u != -1) {
                    if (u == 0) {
                        e1 e1Var3 = this.b;
                        f = ((float) e1Var3.d.e.g) * e1Var3.t();
                        i = (int) (f + 0.5f);
                    } else if (u != 1) {
                        i = 0;
                    }
                }
                e1 e1Var4 = this.b;
                f = ((float) e1Var4.d.e.g) / e1Var4.t();
                i = (int) (f + 0.5f);
            }
            this.e.d(i);
        }
        s1 s1Var = this.h;
        if (s1Var.c) {
            s1 s1Var2 = this.i;
            if (s1Var2.c) {
                if (!s1Var.j || !s1Var2.j || !this.e.j) {
                    if (!this.e.j && this.d == e1.b.MATCH_CONSTRAINT) {
                        e1 e1Var5 = this.b;
                        if (e1Var5.j == 0 && !e1Var5.W()) {
                            int i4 = this.h.l.get(0).g;
                            s1 s1Var3 = this.h;
                            int i5 = i4 + s1Var3.f;
                            int i6 = this.i.l.get(0).g + this.i.f;
                            s1Var3.d(i5);
                            this.i.d(i6);
                            this.e.d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.e.j && this.d == e1.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                        int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                        t1 t1Var3 = this.e;
                        int i8 = t1Var3.m;
                        if (i7 < i8) {
                            t1Var3.d(i7);
                        } else {
                            t1Var3.d(i8);
                        }
                    }
                    if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                        s1 s1Var4 = this.h.l.get(0);
                        s1 s1Var5 = this.i.l.get(0);
                        int i9 = s1Var4.g + this.h.f;
                        int i10 = s1Var5.g + this.i.f;
                        float K = this.b.K();
                        if (s1Var4 == s1Var5) {
                            i9 = s1Var4.g;
                            i10 = s1Var5.g;
                            K = 0.5f;
                        }
                        this.h.d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.e.g)) * K)));
                        this.i.d(this.h.g + this.e.g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ed, code lost:
        if (r9.b.S() != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x034e, code lost:
        if (r0.d == defpackage.e1.b.MATCH_CONSTRAINT) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0380, code lost:
        if (r9.b.S() != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03f9, code lost:
        if (r0.d == defpackage.e1.b.MATCH_CONSTRAINT) goto L_0x03fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r9 = this;
            e1 r0 = r9.b
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x000f
            t1 r1 = r9.e
            int r0 = r0.v()
            r1.d(r0)
        L_0x000f:
            t1 r0 = r9.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x0097
            e1 r0 = r9.b
            e1$b r0 = r0.M()
            r9.d = r0
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x002c
            n1 r0 = new n1
            r0.<init>(r9)
            r9.l = r0
        L_0x002c:
            e1$b r0 = r9.d
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            e1$b r1 = defpackage.e1.b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            e1 r0 = r9.b
            e1 r0 = r0.G()
            if (r0 == 0) goto L_0x0085
            e1$b r1 = r0.M()
            e1$b r2 = defpackage.e1.b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.v()
            e1 r2 = r9.b
            d1 r2 = r2.B
            int r2 = r2.c()
            int r1 = r1 - r2
            e1 r2 = r9.b
            d1 r2 = r2.D
            int r2 = r2.c()
            int r1 = r1 - r2
            s1 r2 = r9.h
            y1 r3 = r0.e
            s1 r3 = r3.h
            e1 r4 = r9.b
            d1 r4 = r4.B
            int r4 = r4.c()
            r9.b(r2, r3, r4)
            s1 r2 = r9.i
            y1 r0 = r0.e
            s1 r0 = r0.i
            e1 r3 = r9.b
            d1 r3 = r3.D
            int r3 = r3.c()
            int r3 = -r3
            r9.b(r2, r0, r3)
            t1 r0 = r9.e
            r0.d(r1)
            return
        L_0x0085:
            e1$b r0 = r9.d
            e1$b r1 = defpackage.e1.b.FIXED
            if (r0 != r1) goto L_0x00d1
            t1 r0 = r9.e
            e1 r1 = r9.b
            int r1 = r1.v()
            r0.d(r1)
            goto L_0x00d1
        L_0x0097:
            e1$b r0 = r9.d
            e1$b r1 = defpackage.e1.b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            e1 r0 = r9.b
            e1 r0 = r0.G()
            if (r0 == 0) goto L_0x00d1
            e1$b r1 = r0.M()
            e1$b r2 = defpackage.e1.b.FIXED
            if (r1 != r2) goto L_0x00d1
            s1 r1 = r9.h
            y1 r2 = r0.e
            s1 r2 = r2.h
            e1 r3 = r9.b
            d1 r3 = r3.B
            int r3 = r3.c()
            r9.b(r1, r2, r3)
            s1 r1 = r9.i
            y1 r0 = r0.e
            s1 r0 = r0.i
            e1 r2 = r9.b
            d1 r2 = r2.D
            int r2 = r2.c()
            int r2 = -r2
            r9.b(r1, r0, r2)
            return
        L_0x00d1:
            t1 r0 = r9.e
            boolean r0 = r0.j
            r1 = 0
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 3
            if (r0 == 0) goto L_0x023d
            e1 r0 = r9.b
            boolean r6 = r0.a
            if (r6 == 0) goto L_0x023d
            d1[] r6 = r0.I
            r7 = r6[r4]
            d1 r7 = r7.c
            if (r7 == 0) goto L_0x016a
            r6 = r6[r5]
            d1 r6 = r6.c
            if (r6 == 0) goto L_0x016a
            boolean r0 = r0.W()
            if (r0 == 0) goto L_0x0114
            s1 r0 = r9.h
            e1 r1 = r9.b
            d1[] r1 = r1.I
            r1 = r1[r4]
            int r1 = r1.c()
            r0.f = r1
            s1 r0 = r9.i
            e1 r1 = r9.b
            d1[] r1 = r1.I
            r1 = r1[r5]
            int r1 = r1.c()
            int r1 = -r1
            r0.f = r1
            goto L_0x0153
        L_0x0114:
            e1 r0 = r9.b
            d1[] r0 = r0.I
            r0 = r0[r4]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x012f
            s1 r1 = r9.h
            e1 r2 = r9.b
            d1[] r2 = r2.I
            r2 = r2[r4]
            int r2 = r2.c()
            r9.b(r1, r0, r2)
        L_0x012f:
            e1 r0 = r9.b
            d1[] r0 = r0.I
            r0 = r0[r5]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x014b
            s1 r1 = r9.i
            e1 r2 = r9.b
            d1[] r2 = r2.I
            r2 = r2[r5]
            int r2 = r2.c()
            int r2 = -r2
            r9.b(r1, r0, r2)
        L_0x014b:
            s1 r0 = r9.h
            r0.b = r3
            s1 r0 = r9.i
            r0.b = r3
        L_0x0153:
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x0423
        L_0x015b:
            s1 r0 = r9.k
            s1 r1 = r9.h
            e1 r2 = r9.b
            int r2 = r2.n()
        L_0x0165:
            r9.b(r0, r1, r2)
            goto L_0x0423
        L_0x016a:
            e1 r0 = r9.b
            d1[] r3 = r0.I
            r6 = r3[r4]
            d1 r6 = r6.c
            if (r6 == 0) goto L_0x019f
            r0 = r3[r4]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0423
            s1 r1 = r9.h
            e1 r2 = r9.b
            d1[] r2 = r2.I
            r2 = r2[r4]
            int r2 = r2.c()
            r9.b(r1, r0, r2)
            s1 r0 = r9.i
            s1 r1 = r9.h
            t1 r2 = r9.e
            int r2 = r2.g
            r9.b(r0, r1, r2)
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x0423
            goto L_0x015b
        L_0x019f:
            r4 = r3[r5]
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x01d2
            r0 = r3[r5]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x01c9
            s1 r1 = r9.i
            e1 r2 = r9.b
            d1[] r2 = r2.I
            r2 = r2[r5]
            int r2 = r2.c()
            int r2 = -r2
            r9.b(r1, r0, r2)
            s1 r0 = r9.h
            s1 r1 = r9.i
            t1 r2 = r9.e
            int r2 = r2.g
            int r2 = -r2
            r9.b(r0, r1, r2)
        L_0x01c9:
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x0423
            goto L_0x015b
        L_0x01d2:
            r4 = r3[r2]
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x01fd
            r0 = r3[r2]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0423
            s1 r2 = r9.k
            r9.b(r2, r0, r1)
            s1 r0 = r9.h
            s1 r1 = r9.k
            e1 r2 = r9.b
            int r2 = r2.n()
            int r2 = -r2
            r9.b(r0, r1, r2)
            s1 r0 = r9.i
            s1 r1 = r9.h
            t1 r2 = r9.e
            int r2 = r2.g
            goto L_0x0165
        L_0x01fd:
            boolean r1 = r0 instanceof defpackage.i1
            if (r1 != 0) goto L_0x0423
            e1 r0 = r0.G()
            if (r0 == 0) goto L_0x0423
            e1 r0 = r9.b
            d1$b r1 = defpackage.d1.b.CENTER
            d1 r0 = r0.m(r1)
            d1 r0 = r0.c
            if (r0 != 0) goto L_0x0423
            e1 r0 = r9.b
            e1 r0 = r0.G()
            y1 r0 = r0.e
            s1 r0 = r0.h
            s1 r1 = r9.h
            e1 r2 = r9.b
            int r2 = r2.R()
            r9.b(r1, r0, r2)
            s1 r0 = r9.i
            s1 r1 = r9.h
            t1 r2 = r9.e
            int r2 = r2.g
            r9.b(r0, r1, r2)
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x0423
            goto L_0x015b
        L_0x023d:
            t1 r0 = r9.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x0290
            e1$b r0 = r9.d
            e1$b r6 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r0 != r6) goto L_0x0290
            e1 r0 = r9.b
            int r6 = r0.k
            if (r6 == r4) goto L_0x0262
            if (r6 == r5) goto L_0x0252
            goto L_0x0295
        L_0x0252:
            boolean r0 = r0.W()
            if (r0 != 0) goto L_0x0295
            e1 r0 = r9.b
            int r6 = r0.j
            if (r6 != r5) goto L_0x025f
            goto L_0x0295
        L_0x025f:
            w1 r0 = r0.d
            goto L_0x026b
        L_0x0262:
            e1 r0 = r0.G()
            if (r0 != 0) goto L_0x0269
            goto L_0x0295
        L_0x0269:
            y1 r0 = r0.e
        L_0x026b:
            t1 r0 = r0.e
            t1 r6 = r9.e
            java.util.List<s1> r6 = r6.l
            r6.add(r0)
            java.util.List<q1> r0 = r0.k
            t1 r6 = r9.e
            r0.add(r6)
            t1 r0 = r9.e
            r0.b = r3
            java.util.List<q1> r0 = r0.k
            s1 r6 = r9.h
            r0.add(r6)
            t1 r0 = r9.e
            java.util.List<q1> r0 = r0.k
            s1 r6 = r9.i
            r0.add(r6)
            goto L_0x0295
        L_0x0290:
            t1 r0 = r9.e
            r0.b(r9)
        L_0x0295:
            e1 r0 = r9.b
            d1[] r6 = r0.I
            r7 = r6[r4]
            d1 r7 = r7.c
            if (r7 == 0) goto L_0x02fa
            r6 = r6[r5]
            d1 r6 = r6.c
            if (r6 == 0) goto L_0x02fa
            boolean r0 = r0.W()
            if (r0 == 0) goto L_0x02c9
            s1 r0 = r9.h
            e1 r1 = r9.b
            d1[] r1 = r1.I
            r1 = r1[r4]
            int r1 = r1.c()
            r0.f = r1
            s1 r0 = r9.i
            e1 r1 = r9.b
            d1[] r1 = r1.I
            r1 = r1[r5]
            int r1 = r1.c()
            int r1 = -r1
            r0.f = r1
            goto L_0x02e7
        L_0x02c9:
            e1 r0 = r9.b
            d1[] r0 = r0.I
            r0 = r0[r4]
            s1 r0 = r9.h(r0)
            e1 r1 = r9.b
            d1[] r1 = r1.I
            r1 = r1[r5]
            s1 r1 = r9.h(r1)
            r0.b(r9)
            r1.b(r9)
            z1$b r0 = defpackage.z1.b.CENTER
            r9.j = r0
        L_0x02e7:
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x0415
        L_0x02ef:
            s1 r0 = r9.k
            s1 r1 = r9.h
            t1 r2 = r9.l
        L_0x02f5:
            r9.c(r0, r1, r3, r2)
            goto L_0x0415
        L_0x02fa:
            e1 r0 = r9.b
            d1[] r6 = r0.I
            r7 = r6[r4]
            d1 r7 = r7.c
            r8 = 0
            if (r7 == 0) goto L_0x0352
            r0 = r6[r4]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0415
            s1 r1 = r9.h
            e1 r2 = r9.b
            d1[] r2 = r2.I
            r2 = r2[r4]
            int r2 = r2.c()
            r9.b(r1, r0, r2)
            s1 r0 = r9.i
            s1 r1 = r9.h
            t1 r2 = r9.e
            r9.c(r0, r1, r3, r2)
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x0336
            s1 r0 = r9.k
            s1 r1 = r9.h
            t1 r2 = r9.l
            r9.c(r0, r1, r3, r2)
        L_0x0336:
            e1$b r0 = r9.d
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0415
            e1 r0 = r9.b
            float r0 = r0.t()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0415
            e1 r0 = r9.b
            w1 r0 = r0.d
            e1$b r1 = r0.d
            e1$b r2 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x0415
            goto L_0x03fb
        L_0x0352:
            r4 = r6[r5]
            d1 r4 = r4.c
            r7 = -1
            if (r4 == 0) goto L_0x0384
            r0 = r6[r5]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0415
            s1 r1 = r9.i
            e1 r2 = r9.b
            d1[] r2 = r2.I
            r2 = r2[r5]
            int r2 = r2.c()
            int r2 = -r2
            r9.b(r1, r0, r2)
            s1 r0 = r9.h
            s1 r1 = r9.i
            t1 r2 = r9.e
            r9.c(r0, r1, r7, r2)
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x0415
            goto L_0x02ef
        L_0x0384:
            r4 = r6[r2]
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x03a8
            r0 = r6[r2]
            s1 r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0415
            s1 r2 = r9.k
            r9.b(r2, r0, r1)
            s1 r0 = r9.h
            s1 r1 = r9.k
            t1 r2 = r9.l
            r9.c(r0, r1, r7, r2)
            s1 r0 = r9.i
            s1 r1 = r9.h
            t1 r2 = r9.e
            goto L_0x02f5
        L_0x03a8:
            boolean r1 = r0 instanceof defpackage.i1
            if (r1 != 0) goto L_0x0415
            e1 r0 = r0.G()
            if (r0 == 0) goto L_0x0415
            e1 r0 = r9.b
            e1 r0 = r0.G()
            y1 r0 = r0.e
            s1 r0 = r0.h
            s1 r1 = r9.h
            e1 r2 = r9.b
            int r2 = r2.R()
            r9.b(r1, r0, r2)
            s1 r0 = r9.i
            s1 r1 = r9.h
            t1 r2 = r9.e
            r9.c(r0, r1, r3, r2)
            e1 r0 = r9.b
            boolean r0 = r0.S()
            if (r0 == 0) goto L_0x03e1
            s1 r0 = r9.k
            s1 r1 = r9.h
            t1 r2 = r9.l
            r9.c(r0, r1, r3, r2)
        L_0x03e1:
            e1$b r0 = r9.d
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0415
            e1 r0 = r9.b
            float r0 = r0.t()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0415
            e1 r0 = r9.b
            w1 r0 = r0.d
            e1$b r1 = r0.d
            e1$b r2 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x0415
        L_0x03fb:
            t1 r0 = r0.e
            java.util.List<q1> r0 = r0.k
            t1 r1 = r9.e
            r0.add(r1)
            t1 r0 = r9.e
            java.util.List<s1> r0 = r0.l
            e1 r1 = r9.b
            w1 r1 = r1.d
            t1 r1 = r1.e
            r0.add(r1)
            t1 r0 = r9.e
            r0.a = r9
        L_0x0415:
            t1 r0 = r9.e
            java.util.List<s1> r0 = r0.l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0423
            t1 r0 = r9.e
            r0.c = r3
        L_0x0423:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1.d():void");
    }

    public void e() {
        s1 s1Var = this.h;
        if (s1Var.j) {
            this.b.E0(s1Var.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.d != e1.b.MATCH_CONSTRAINT || this.b.k == 0;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.r();
    }
}
