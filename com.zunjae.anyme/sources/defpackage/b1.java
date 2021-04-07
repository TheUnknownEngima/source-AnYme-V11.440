package defpackage;

/* renamed from: b1  reason: default package */
class b1 {
    static void a(f1 f1Var, u0 u0Var, int i) {
        c1[] c1VarArr;
        int i2;
        int i3;
        if (i == 0) {
            int i4 = f1Var.K0;
            c1VarArr = f1Var.N0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = f1Var.L0;
            c1VarArr = f1Var.M0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            c1 c1Var = c1VarArr[i5];
            c1Var.a();
            b(f1Var, u0Var, i, i3, c1Var);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: e1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: e1} */
    /* JADX WARNING: type inference failed for: r4v11, types: [z0] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.s0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.t0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x051a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x03aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:327:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(defpackage.f1 r37, defpackage.u0 r38, int r39, int r40, defpackage.c1 r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            e1 r10 = r1.a
            e1 r11 = r1.c
            e1 r12 = r1.b
            e1 r13 = r1.d
            e1 r2 = r1.e
            float r3 = r1.k
            e1 r4 = r1.f
            e1 r4 = r1.g
            e1$b[] r4 = r0.K
            r4 = r4[r39]
            e1$b r5 = defpackage.e1.b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r39 != 0) goto L_0x0038
            int r8 = r2.s0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.s0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.s0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.t0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.t0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.t0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r7 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x0051:
            r21 = 0
            if (r8 != 0) goto L_0x012f
            d1[] r6 = r7.I
            r6 = r6[r40]
            if (r5 == 0) goto L_0x005e
            r22 = 1
            goto L_0x0060
        L_0x005e:
            r22 = 4
        L_0x0060:
            int r23 = r6.c()
            r24 = r3
            e1$b[] r3 = r7.K
            r3 = r3[r39]
            r25 = r8
            e1$b r8 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x0078
            int[] r3 = r7.l
            r3 = r3[r39]
            if (r3 != 0) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            d1 r8 = r6.c
            if (r8 == 0) goto L_0x0085
            if (r7 == r10) goto L_0x0085
            int r8 = r8.c()
            int r23 = r23 + r8
        L_0x0085:
            r8 = r23
            if (r5 == 0) goto L_0x0092
            if (r7 == r10) goto L_0x0092
            if (r7 == r12) goto L_0x0092
            r23 = r15
            r22 = 5
            goto L_0x0094
        L_0x0092:
            r23 = r15
        L_0x0094:
            d1 r15 = r6.c
            if (r15 == 0) goto L_0x00c5
            if (r7 != r12) goto L_0x00a7
            r26 = r14
            z0 r14 = r6.f
            z0 r15 = r15.f
            r27 = r2
            r2 = 6
            r9.h(r14, r15, r8, r2)
            goto L_0x00b3
        L_0x00a7:
            r27 = r2
            r26 = r14
            z0 r2 = r6.f
            z0 r14 = r15.f
            r15 = 7
            r9.h(r2, r14, r8, r15)
        L_0x00b3:
            if (r3 == 0) goto L_0x00b9
            if (r5 != 0) goto L_0x00b9
            r2 = 5
            goto L_0x00bb
        L_0x00b9:
            r2 = r22
        L_0x00bb:
            z0 r3 = r6.f
            d1 r6 = r6.c
            z0 r6 = r6.f
            r9.e(r3, r6, r8, r2)
            goto L_0x00c9
        L_0x00c5:
            r27 = r2
            r26 = r14
        L_0x00c9:
            if (r4 == 0) goto L_0x00fe
            int r2 = r7.O()
            r3 = 8
            if (r2 == r3) goto L_0x00ed
            e1$b[] r2 = r7.K
            r2 = r2[r39]
            e1$b r3 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00ed
            d1[] r2 = r7.I
            int r3 = r40 + 1
            r3 = r2[r3]
            z0 r3 = r3.f
            r2 = r2[r40]
            z0 r2 = r2.f
            r6 = 5
            r8 = 0
            r9.h(r3, r2, r8, r6)
            goto L_0x00ee
        L_0x00ed:
            r8 = 0
        L_0x00ee:
            d1[] r2 = r7.I
            r2 = r2[r40]
            z0 r2 = r2.f
            d1[] r3 = r0.I
            r3 = r3[r40]
            z0 r3 = r3.f
            r6 = 7
            r9.h(r2, r3, r8, r6)
        L_0x00fe:
            d1[] r2 = r7.I
            int r3 = r40 + 1
            r2 = r2[r3]
            d1 r2 = r2.c
            if (r2 == 0) goto L_0x011d
            e1 r2 = r2.a
            d1[] r3 = r2.I
            r6 = r3[r40]
            d1 r6 = r6.c
            if (r6 == 0) goto L_0x011d
            r3 = r3[r40]
            d1 r3 = r3.c
            e1 r3 = r3.a
            if (r3 == r7) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r21 = r2
        L_0x011d:
            if (r21 == 0) goto L_0x0124
            r7 = r21
            r8 = r25
            goto L_0x0125
        L_0x0124:
            r8 = 1
        L_0x0125:
            r15 = r23
            r3 = r24
            r14 = r26
            r2 = r27
            goto L_0x0051
        L_0x012f:
            r27 = r2
            r24 = r3
            r26 = r14
            r23 = r15
            if (r13 == 0) goto L_0x019a
            d1[] r2 = r11.I
            int r3 = r40 + 1
            r2 = r2[r3]
            d1 r2 = r2.c
            if (r2 == 0) goto L_0x019a
            d1[] r2 = r13.I
            r2 = r2[r3]
            e1$b[] r6 = r13.K
            r6 = r6[r39]
            e1$b r7 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0157
            int[] r6 = r13.l
            r6 = r6[r39]
            if (r6 != 0) goto L_0x0157
            r6 = 1
            goto L_0x0158
        L_0x0157:
            r6 = 0
        L_0x0158:
            if (r6 == 0) goto L_0x0170
            if (r5 != 0) goto L_0x0170
            d1 r6 = r2.c
            e1 r7 = r6.a
            if (r7 != r0) goto L_0x0170
            z0 r7 = r2.f
            z0 r6 = r6.f
            int r8 = r2.c()
            int r8 = -r8
            r14 = 5
            r9.e(r7, r6, r8, r14)
            goto L_0x0186
        L_0x0170:
            r14 = 5
            if (r5 == 0) goto L_0x0186
            d1 r6 = r2.c
            e1 r7 = r6.a
            if (r7 != r0) goto L_0x0186
            z0 r7 = r2.f
            z0 r6 = r6.f
            int r8 = r2.c()
            int r8 = -r8
            r15 = 4
            r9.e(r7, r6, r8, r15)
        L_0x0186:
            z0 r6 = r2.f
            d1[] r7 = r11.I
            r3 = r7[r3]
            d1 r3 = r3.c
            z0 r3 = r3.f
            int r2 = r2.c()
            int r2 = -r2
            r7 = 6
            r9.j(r6, r3, r2, r7)
            goto L_0x019b
        L_0x019a:
            r14 = 5
        L_0x019b:
            if (r4 == 0) goto L_0x01b5
            d1[] r0 = r0.I
            int r2 = r40 + 1
            r0 = r0[r2]
            z0 r0 = r0.f
            d1[] r3 = r11.I
            r4 = r3[r2]
            z0 r4 = r4.f
            r2 = r3[r2]
            int r2 = r2.c()
            r3 = 7
            r9.h(r0, r4, r2, r3)
        L_0x01b5:
            java.util.ArrayList<e1> r0 = r1.h
            if (r0 == 0) goto L_0x0265
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0265
            boolean r4 = r1.q
            if (r4 == 0) goto L_0x01cc
            boolean r4 = r1.s
            if (r4 != 0) goto L_0x01cc
            int r4 = r1.j
            float r4 = (float) r4
            goto L_0x01ce
        L_0x01cc:
            r4 = r24
        L_0x01ce:
            r6 = 0
            r7 = r21
            r8 = 0
            r29 = 0
        L_0x01d4:
            if (r8 >= r2) goto L_0x0265
            java.lang.Object r15 = r0.get(r8)
            e1 r15 = (defpackage.e1) r15
            float[] r3 = r15.w0
            r3 = r3[r39]
            int r18 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r18 >= 0) goto L_0x0201
            boolean r3 = r1.s
            if (r3 == 0) goto L_0x01fc
            d1[] r3 = r15.I
            int r15 = r40 + 1
            r15 = r3[r15]
            z0 r15 = r15.f
            r3 = r3[r40]
            z0 r3 = r3.f
            r6 = 0
            r14 = 4
            r9.e(r15, r3, r6, r14)
            r6 = 7
            r14 = 0
            goto L_0x0217
        L_0x01fc:
            r14 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            goto L_0x0202
        L_0x0201:
            r14 = 4
        L_0x0202:
            int r18 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r18 != 0) goto L_0x021c
            d1[] r3 = r15.I
            int r15 = r40 + 1
            r15 = r3[r15]
            z0 r15 = r15.f
            r3 = r3[r40]
            z0 r3 = r3.f
            r6 = 7
            r14 = 0
            r9.e(r15, r3, r14, r6)
        L_0x0217:
            r24 = r0
            r17 = r2
            goto L_0x025a
        L_0x021c:
            r6 = 7
            r14 = 0
            if (r7 == 0) goto L_0x0253
            d1[] r7 = r7.I
            r6 = r7[r40]
            z0 r6 = r6.f
            int r17 = r40 + 1
            r7 = r7[r17]
            z0 r7 = r7.f
            d1[] r14 = r15.I
            r24 = r0
            r0 = r14[r40]
            z0 r0 = r0.f
            r14 = r14[r17]
            z0 r14 = r14.f
            r17 = r2
            s0 r2 = r38.r()
            r28 = r2
            r30 = r4
            r31 = r3
            r32 = r6
            r33 = r7
            r34 = r0
            r35 = r14
            r28.k(r29, r30, r31, r32, r33, r34, r35)
            r9.d(r2)
            goto L_0x0257
        L_0x0253:
            r24 = r0
            r17 = r2
        L_0x0257:
            r29 = r3
            r7 = r15
        L_0x025a:
            int r8 = r8 + 1
            r2 = r17
            r0 = r24
            r3 = 1
            r6 = 0
            r14 = 5
            goto L_0x01d4
        L_0x0265:
            if (r12 == 0) goto L_0x02b8
            if (r12 == r13) goto L_0x026b
            if (r5 == 0) goto L_0x02b8
        L_0x026b:
            d1[] r0 = r10.I
            r0 = r0[r40]
            d1[] r1 = r11.I
            int r2 = r40 + 1
            r1 = r1[r2]
            d1 r0 = r0.c
            if (r0 == 0) goto L_0x027d
            z0 r0 = r0.f
            r3 = r0
            goto L_0x027f
        L_0x027d:
            r3 = r21
        L_0x027f:
            d1 r0 = r1.c
            if (r0 == 0) goto L_0x0287
            z0 r0 = r0.f
            r5 = r0
            goto L_0x0289
        L_0x0287:
            r5 = r21
        L_0x0289:
            d1[] r0 = r12.I
            r0 = r0[r40]
            d1[] r1 = r13.I
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04d7
            if (r5 == 0) goto L_0x04d7
            r2 = r27
            if (r39 != 0) goto L_0x029c
            float r2 = r2.Z
            goto L_0x029e
        L_0x029c:
            float r2 = r2.a0
        L_0x029e:
            r4 = r2
            int r6 = r0.c()
            int r7 = r1.c()
            z0 r2 = r0.f
            z0 r8 = r1.f
            r10 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04d7
        L_0x02b8:
            if (r26 == 0) goto L_0x03ae
            if (r12 == 0) goto L_0x03ae
            int r0 = r1.j
            if (r0 <= 0) goto L_0x02c7
            int r1 = r1.i
            if (r1 != r0) goto L_0x02c7
            r16 = 1
            goto L_0x02c9
        L_0x02c7:
            r16 = 0
        L_0x02c9:
            r14 = r12
            r15 = r14
        L_0x02cb:
            if (r14 == 0) goto L_0x04d7
            e1[] r0 = r14.y0
            r0 = r0[r39]
            r8 = r0
        L_0x02d2:
            if (r8 == 0) goto L_0x02e1
            int r0 = r8.O()
            r6 = 8
            if (r0 != r6) goto L_0x02e3
            e1[] r0 = r8.y0
            r8 = r0[r39]
            goto L_0x02d2
        L_0x02e1:
            r6 = 8
        L_0x02e3:
            if (r8 != 0) goto L_0x02f0
            if (r14 != r13) goto L_0x02e8
            goto L_0x02f0
        L_0x02e8:
            r17 = r8
            r19 = 5
            r20 = 7
            goto L_0x03a1
        L_0x02f0:
            d1[] r0 = r14.I
            r0 = r0[r40]
            z0 r1 = r0.f
            d1 r2 = r0.c
            if (r2 == 0) goto L_0x02fd
            z0 r2 = r2.f
            goto L_0x02ff
        L_0x02fd:
            r2 = r21
        L_0x02ff:
            if (r15 == r14) goto L_0x030a
            d1[] r2 = r15.I
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x0307:
            z0 r2 = r2.f
            goto L_0x031d
        L_0x030a:
            if (r14 != r12) goto L_0x031d
            if (r15 != r14) goto L_0x031d
            d1[] r2 = r10.I
            r3 = r2[r40]
            d1 r3 = r3.c
            if (r3 == 0) goto L_0x031b
            r2 = r2[r40]
            d1 r2 = r2.c
            goto L_0x0307
        L_0x031b:
            r2 = r21
        L_0x031d:
            int r0 = r0.c()
            d1[] r3 = r14.I
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.c()
            if (r8 == 0) goto L_0x033f
            d1[] r5 = r8.I
            r5 = r5[r40]
            z0 r7 = r5.f
            d1[] r6 = r14.I
            r6 = r6[r4]
            z0 r6 = r6.f
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x0352
        L_0x033f:
            d1[] r5 = r11.I
            r5 = r5[r4]
            d1 r5 = r5.c
            if (r5 == 0) goto L_0x034a
            z0 r6 = r5.f
            goto L_0x034c
        L_0x034a:
            r6 = r21
        L_0x034c:
            d1[] r7 = r14.I
            r7 = r7[r4]
            z0 r7 = r7.f
        L_0x0352:
            if (r5 == 0) goto L_0x0359
            int r5 = r5.c()
            int r3 = r3 + r5
        L_0x0359:
            if (r15 == 0) goto L_0x0364
            d1[] r5 = r15.I
            r5 = r5[r4]
            int r5 = r5.c()
            int r0 = r0 + r5
        L_0x0364:
            if (r1 == 0) goto L_0x02e8
            if (r2 == 0) goto L_0x02e8
            if (r6 == 0) goto L_0x02e8
            if (r7 == 0) goto L_0x02e8
            if (r14 != r12) goto L_0x0376
            d1[] r0 = r12.I
            r0 = r0[r40]
            int r0 = r0.c()
        L_0x0376:
            r5 = r0
            if (r14 != r13) goto L_0x0384
            d1[] r0 = r13.I
            r0 = r0[r4]
            int r0 = r0.c()
            r17 = r0
            goto L_0x0386
        L_0x0384:
            r17 = r3
        L_0x0386:
            if (r16 == 0) goto L_0x038b
            r18 = 7
            goto L_0x038d
        L_0x038b:
            r18 = 5
        L_0x038d:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r19 = 5
            r20 = 7
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r18
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x03a1:
            int r0 = r14.O()
            r8 = 8
            if (r0 == r8) goto L_0x03aa
            r15 = r14
        L_0x03aa:
            r14 = r17
            goto L_0x02cb
        L_0x03ae:
            r8 = 8
            r20 = 7
            if (r23 == 0) goto L_0x04d7
            if (r12 == 0) goto L_0x04d7
            int r0 = r1.j
            if (r0 <= 0) goto L_0x03c1
            int r1 = r1.i
            if (r1 != r0) goto L_0x03c1
            r16 = 1
            goto L_0x03c3
        L_0x03c1:
            r16 = 0
        L_0x03c3:
            r14 = r12
            r15 = r14
        L_0x03c5:
            if (r14 == 0) goto L_0x0479
            e1[] r0 = r14.y0
            r0 = r0[r39]
        L_0x03cb:
            if (r0 == 0) goto L_0x03d8
            int r1 = r0.O()
            if (r1 != r8) goto L_0x03d8
            e1[] r0 = r0.y0
            r0 = r0[r39]
            goto L_0x03cb
        L_0x03d8:
            if (r14 == r12) goto L_0x0466
            if (r14 == r13) goto L_0x0466
            if (r0 == 0) goto L_0x0466
            if (r0 != r13) goto L_0x03e3
            r7 = r21
            goto L_0x03e4
        L_0x03e3:
            r7 = r0
        L_0x03e4:
            d1[] r0 = r14.I
            r0 = r0[r40]
            z0 r1 = r0.f
            d1 r2 = r0.c
            if (r2 == 0) goto L_0x03f0
            z0 r2 = r2.f
        L_0x03f0:
            d1[] r2 = r15.I
            int r3 = r40 + 1
            r2 = r2[r3]
            z0 r2 = r2.f
            int r0 = r0.c()
            d1[] r4 = r14.I
            r4 = r4[r3]
            int r4 = r4.c()
            if (r7 == 0) goto L_0x0414
            d1[] r5 = r7.I
            r5 = r5[r40]
            z0 r6 = r5.f
            d1 r8 = r5.c
            if (r8 == 0) goto L_0x0411
            goto L_0x0423
        L_0x0411:
            r8 = r21
            goto L_0x0425
        L_0x0414:
            d1[] r5 = r13.I
            r5 = r5[r40]
            if (r5 == 0) goto L_0x041d
            z0 r6 = r5.f
            goto L_0x041f
        L_0x041d:
            r6 = r21
        L_0x041f:
            d1[] r8 = r14.I
            r8 = r8[r3]
        L_0x0423:
            z0 r8 = r8.f
        L_0x0425:
            if (r5 == 0) goto L_0x042c
            int r5 = r5.c()
            int r4 = r4 + r5
        L_0x042c:
            r17 = r4
            if (r15 == 0) goto L_0x0439
            d1[] r4 = r15.I
            r3 = r4[r3]
            int r3 = r3.c()
            int r0 = r0 + r3
        L_0x0439:
            r3 = r0
            if (r16 == 0) goto L_0x043f
            r18 = 7
            goto L_0x0441
        L_0x043f:
            r18 = 4
        L_0x0441:
            if (r1 == 0) goto L_0x045d
            if (r2 == 0) goto L_0x045d
            if (r6 == 0) goto L_0x045d
            if (r8 == 0) goto L_0x045d
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r6 = r8
            r19 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r18
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0463
        L_0x045d:
            r19 = r7
            r17 = r15
            r15 = 8
        L_0x0463:
            r0 = r19
            goto L_0x046a
        L_0x0466:
            r17 = r15
            r15 = 8
        L_0x046a:
            int r1 = r14.O()
            if (r1 == r15) goto L_0x0471
            goto L_0x0473
        L_0x0471:
            r14 = r17
        L_0x0473:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x03c5
        L_0x0479:
            d1[] r0 = r12.I
            r0 = r0[r40]
            d1[] r1 = r10.I
            r1 = r1[r40]
            d1 r1 = r1.c
            d1[] r2 = r13.I
            int r3 = r40 + 1
            r10 = r2[r3]
            d1[] r2 = r11.I
            r2 = r2[r3]
            d1 r14 = r2.c
            if (r1 == 0) goto L_0x04c6
            if (r12 == r13) goto L_0x04a0
            z0 r2 = r0.f
            z0 r1 = r1.f
            int r0 = r0.c()
            r15 = 4
            r9.e(r2, r1, r0, r15)
            goto L_0x04c7
        L_0x04a0:
            r15 = 4
            if (r14 == 0) goto L_0x04c7
            z0 r2 = r0.f
            z0 r3 = r1.f
            int r4 = r0.c()
            r5 = 1056964608(0x3f000000, float:0.5)
            z0 r6 = r10.f
            z0 r7 = r14.f
            int r8 = r10.c()
            r16 = 4
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04c7
        L_0x04c6:
            r15 = 4
        L_0x04c7:
            if (r14 == 0) goto L_0x04d7
            if (r12 == r13) goto L_0x04d7
            z0 r0 = r10.f
            z0 r1 = r14.f
            int r2 = r10.c()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04d7:
            if (r26 != 0) goto L_0x04db
            if (r23 == 0) goto L_0x053d
        L_0x04db:
            if (r12 == 0) goto L_0x053d
            d1[] r0 = r12.I
            r0 = r0[r40]
            d1[] r1 = r13.I
            int r2 = r40 + 1
            r1 = r1[r2]
            d1 r3 = r0.c
            if (r3 == 0) goto L_0x04ee
            z0 r3 = r3.f
            goto L_0x04f0
        L_0x04ee:
            r3 = r21
        L_0x04f0:
            d1 r4 = r1.c
            if (r4 == 0) goto L_0x04f7
            z0 r4 = r4.f
            goto L_0x04f9
        L_0x04f7:
            r4 = r21
        L_0x04f9:
            if (r11 == r13) goto L_0x050a
            d1[] r4 = r11.I
            r4 = r4[r2]
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x0507
            z0 r4 = r4.f
            r21 = r4
        L_0x0507:
            r5 = r21
            goto L_0x050b
        L_0x050a:
            r5 = r4
        L_0x050b:
            if (r12 != r13) goto L_0x0518
            d1[] r0 = r12.I
            r1 = r0[r40]
            r0 = r0[r2]
            r36 = r1
            r1 = r0
            r0 = r36
        L_0x0518:
            if (r3 == 0) goto L_0x053d
            if (r5 == 0) goto L_0x053d
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.c()
            if (r13 != 0) goto L_0x0525
            goto L_0x0526
        L_0x0525:
            r11 = r13
        L_0x0526:
            d1[] r7 = r11.I
            r2 = r7[r2]
            int r7 = r2.c()
            z0 r2 = r0.f
            z0 r8 = r1.f
            r10 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x053d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.b(f1, u0, int, int, c1):void");
    }
}
