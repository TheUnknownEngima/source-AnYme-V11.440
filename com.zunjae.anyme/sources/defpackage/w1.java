package defpackage;

import defpackage.d1;
import defpackage.e1;
import defpackage.s1;
import defpackage.z1;
import java.util.List;

/* renamed from: w1  reason: default package */
public class w1 extends z1 {
    private static int[] k = new int[2];

    /* renamed from: w1$a */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.w1.a.<clinit>():void");
        }
    }

    public w1(e1 e1Var) {
        super(e1Var);
        this.h.e = s1.a.LEFT;
        this.i.e = s1.a.RIGHT;
        this.f = 0;
    }

    private void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029f, code lost:
        if (r14 != 1) goto L_0x02f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.q1 r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = defpackage.w1.a.a
            z1$b r1 = r8.j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            e1 r0 = r8.b
            d1 r1 = r0.A
            d1 r0 = r0.C
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            t1 r0 = r8.e
            boolean r0 = r0.j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02f7
            e1$b r0 = r8.d
            e1$b r3 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02f7
            e1 r0 = r8.b
            int r3 = r0.j
            if (r3 == r1) goto L_0x02d9
            if (r3 == r2) goto L_0x0046
            goto L_0x02f7
        L_0x0046:
            int r1 = r0.k
            r3 = -1
            if (r1 == 0) goto L_0x007d
            if (r1 != r2) goto L_0x004e
            goto L_0x007d
        L_0x004e:
            int r0 = r0.u()
            if (r0 == r3) goto L_0x006a
            if (r0 == 0) goto L_0x005b
            if (r0 == r9) goto L_0x006a
            r0 = 0
            goto L_0x02f2
        L_0x005b:
            e1 r0 = r8.b
            y1 r1 = r0.e
            t1 r1 = r1.e
            int r1 = r1.g
            float r1 = (float) r1
            float r0 = r0.t()
            float r1 = r1 / r0
            goto L_0x0079
        L_0x006a:
            e1 r0 = r8.b
            y1 r1 = r0.e
            t1 r1 = r1.e
            int r1 = r1.g
            float r1 = (float) r1
            float r0 = r0.t()
            float r1 = r1 * r0
        L_0x0079:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x02f2
        L_0x007d:
            e1 r0 = r8.b
            y1 r1 = r0.e
            s1 r12 = r1.h
            s1 r13 = r1.i
            d1 r0 = r0.A
            d1 r0 = r0.c
            if (r0 == 0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            e1 r1 = r8.b
            d1 r1 = r1.B
            d1 r1 = r1.c
            if (r1 == 0) goto L_0x0098
            r1 = 1
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            e1 r2 = r8.b
            d1 r2 = r2.C
            d1 r2 = r2.c
            if (r2 == 0) goto L_0x00a3
            r2 = 1
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            e1 r4 = r8.b
            d1 r4 = r4.D
            d1 r4 = r4.c
            if (r4 == 0) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            e1 r5 = r8.b
            int r14 = r5.u()
            if (r0 == 0) goto L_0x01f5
            if (r1 == 0) goto L_0x01f5
            if (r2 == 0) goto L_0x01f5
            if (r4 == 0) goto L_0x01f5
            e1 r0 = r8.b
            float r15 = r0.t()
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x0126
            boolean r0 = r13.j
            if (r0 == 0) goto L_0x0126
            s1 r0 = r8.h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0125
            s1 r1 = r8.i
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x00d8
            goto L_0x0125
        L_0x00d8:
            java.util.List<s1> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            s1 r1 = r8.h
            int r1 = r1.f
            int r2 = r0 + r1
            s1 r0 = r8.i
            java.util.List<s1> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            s1 r1 = r8.i
            int r1 = r1.f
            int r3 = r0 - r1
            int r0 = r12.g
            int r1 = r12.f
            int r4 = r0 + r1
            int r0 = r13.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            t1 r0 = r8.e
            int[] r1 = k
            r1 = r1[r10]
            r0.d(r1)
            e1 r0 = r8.b
            y1 r0 = r0.e
            t1 r0 = r0.e
            int[] r1 = k
            r1 = r1[r9]
            r0.d(r1)
        L_0x0125:
            return
        L_0x0126:
            s1 r0 = r8.h
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x0183
            s1 r1 = r8.i
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x0183
            boolean r2 = r12.c
            if (r2 == 0) goto L_0x0182
            boolean r2 = r13.c
            if (r2 != 0) goto L_0x013b
            goto L_0x0182
        L_0x013b:
            int r2 = r0.g
            int r0 = r0.f
            int r2 = r2 + r0
            int r0 = r1.g
            int r1 = r1.f
            int r3 = r0 - r1
            java.util.List<s1> r0 = r12.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            int r1 = r12.f
            int r4 = r0 + r1
            java.util.List<s1> r0 = r13.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            t1 r0 = r8.e
            int[] r1 = k
            r1 = r1[r10]
            r0.d(r1)
            e1 r0 = r8.b
            y1 r0 = r0.e
            t1 r0 = r0.e
            int[] r1 = k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x0183
        L_0x0182:
            return
        L_0x0183:
            s1 r0 = r8.h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01f4
            s1 r1 = r8.i
            boolean r1 = r1.c
            if (r1 == 0) goto L_0x01f4
            boolean r1 = r12.c
            if (r1 == 0) goto L_0x01f4
            boolean r1 = r13.c
            if (r1 != 0) goto L_0x0198
            goto L_0x01f4
        L_0x0198:
            java.util.List<s1> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            s1 r1 = r8.h
            int r1 = r1.f
            int r2 = r0 + r1
            s1 r0 = r8.i
            java.util.List<s1> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            s1 r1 = r8.i
            int r1 = r1.f
            int r3 = r0 - r1
            java.util.List<s1> r0 = r12.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            int r1 = r12.f
            int r4 = r0 + r1
            java.util.List<s1> r0 = r13.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            int r0 = r0.g
            int r1 = r13.f
            int r5 = r0 - r1
            int[] r1 = k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            t1 r0 = r8.e
            int[] r1 = k
            r1 = r1[r10]
            r0.d(r1)
            e1 r0 = r8.b
            y1 r0 = r0.e
            t1 r0 = r0.e
            int[] r1 = k
            r1 = r1[r9]
            goto L_0x02d4
        L_0x01f4:
            return
        L_0x01f5:
            if (r0 == 0) goto L_0x026e
            if (r2 == 0) goto L_0x026e
            s1 r0 = r8.h
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x026d
            s1 r0 = r8.i
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x0206
            goto L_0x026d
        L_0x0206:
            e1 r0 = r8.b
            float r0 = r0.t()
            s1 r1 = r8.h
            java.util.List<s1> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            s1 r1 = (defpackage.s1) r1
            int r1 = r1.g
            s1 r2 = r8.h
            int r2 = r2.f
            int r1 = r1 + r2
            s1 r2 = r8.i
            java.util.List<s1> r2 = r2.l
            java.lang.Object r2 = r2.get(r10)
            s1 r2 = (defpackage.s1) r2
            int r2 = r2.g
            s1 r4 = r8.i
            int r4 = r4.f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0249
            if (r14 == 0) goto L_0x0249
            if (r14 == r9) goto L_0x0236
            goto L_0x02f7
        L_0x0236:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x025d
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x025b
        L_0x0249:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x025d
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x025b:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x025d:
            t1 r0 = r8.e
            r0.d(r1)
            e1 r0 = r8.b
            y1 r0 = r0.e
            t1 r0 = r0.e
            r0.d(r3)
            goto L_0x02f7
        L_0x026d:
            return
        L_0x026e:
            if (r1 == 0) goto L_0x02f7
            if (r4 == 0) goto L_0x02f7
            boolean r0 = r12.c
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x027b
            goto L_0x02d8
        L_0x027b:
            e1 r0 = r8.b
            float r0 = r0.t()
            java.util.List<s1> r1 = r12.l
            java.lang.Object r1 = r1.get(r10)
            s1 r1 = (defpackage.s1) r1
            int r1 = r1.g
            int r2 = r12.f
            int r1 = r1 + r2
            java.util.List<s1> r2 = r13.l
            java.lang.Object r2 = r2.get(r10)
            s1 r2 = (defpackage.s1) r2
            int r2 = r2.g
            int r4 = r13.f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02b5
            if (r14 == 0) goto L_0x02a2
            if (r14 == r9) goto L_0x02b5
            goto L_0x02f7
        L_0x02a2:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02c9
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02c7
        L_0x02b5:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02c9
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02c7:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02c9:
            t1 r0 = r8.e
            r0.d(r3)
            e1 r0 = r8.b
            y1 r0 = r0.e
            t1 r0 = r0.e
        L_0x02d4:
            r0.d(r1)
            goto L_0x02f7
        L_0x02d8:
            return
        L_0x02d9:
            e1 r0 = r0.G()
            if (r0 == 0) goto L_0x02f7
            w1 r0 = r0.d
            t1 r0 = r0.e
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x02f7
            e1 r1 = r8.b
            float r1 = r1.o
            int r0 = r0.g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x02f2:
            t1 r1 = r8.e
            r1.d(r0)
        L_0x02f7:
            s1 r0 = r8.h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0419
            s1 r1 = r8.i
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0305
            goto L_0x0419
        L_0x0305:
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0314
            boolean r0 = r1.j
            if (r0 == 0) goto L_0x0314
            t1 r0 = r8.e
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0314
            return
        L_0x0314:
            t1 r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x035e
            e1$b r0 = r8.d
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x035e
            e1 r0 = r8.b
            int r1 = r0.j
            if (r1 != 0) goto L_0x035e
            boolean r0 = r0.V()
            if (r0 != 0) goto L_0x035e
            s1 r0 = r8.h
            java.util.List<s1> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            s1 r1 = r8.i
            java.util.List<s1> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            s1 r1 = (defpackage.s1) r1
            int r0 = r0.g
            s1 r2 = r8.h
            int r3 = r2.f
            int r0 = r0 + r3
            int r1 = r1.g
            s1 r3 = r8.i
            int r3 = r3.f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            s1 r0 = r8.i
            r0.d(r1)
            t1 r0 = r8.e
            r0.d(r3)
            return
        L_0x035e:
            t1 r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x03c2
            e1$b r0 = r8.d
            e1$b r1 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03c2
            int r0 = r8.a
            if (r0 != r9) goto L_0x03c2
            s1 r0 = r8.h
            java.util.List<s1> r0 = r0.l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03c2
            s1 r0 = r8.i
            java.util.List<s1> r0 = r0.l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03c2
            s1 r0 = r8.h
            java.util.List<s1> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            s1 r1 = r8.i
            java.util.List<s1> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            s1 r1 = (defpackage.s1) r1
            int r0 = r0.g
            s1 r2 = r8.h
            int r2 = r2.f
            int r0 = r0 + r2
            int r1 = r1.g
            s1 r2 = r8.i
            int r2 = r2.f
            int r1 = r1 + r2
            int r1 = r1 - r0
            t1 r0 = r8.e
            int r0 = r0.m
            int r0 = java.lang.Math.min(r1, r0)
            e1 r1 = r8.b
            int r2 = r1.n
            int r1 = r1.m
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03bd
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03bd:
            t1 r1 = r8.e
            r1.d(r0)
        L_0x03c2:
            t1 r0 = r8.e
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x03c9
            return
        L_0x03c9:
            s1 r0 = r8.h
            java.util.List<s1> r0 = r0.l
            java.lang.Object r0 = r0.get(r10)
            s1 r0 = (defpackage.s1) r0
            s1 r1 = r8.i
            java.util.List<s1> r1 = r1.l
            java.lang.Object r1 = r1.get(r10)
            s1 r1 = (defpackage.s1) r1
            int r2 = r0.g
            s1 r3 = r8.h
            int r3 = r3.f
            int r2 = r2 + r3
            int r3 = r1.g
            s1 r4 = r8.i
            int r4 = r4.f
            int r3 = r3 + r4
            e1 r4 = r8.b
            float r4 = r4.w()
            if (r0 != r1) goto L_0x03f9
            int r2 = r0.g
            int r3 = r1.g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x03f9:
            int r3 = r3 - r2
            t1 r0 = r8.e
            int r0 = r0.g
            int r3 = r3 - r0
            s1 r0 = r8.h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            s1 r0 = r8.i
            s1 r1 = r8.h
            int r1 = r1.g
            t1 r2 = r8.e
            int r2 = r2.g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x0419:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1.a(q1):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        d1 d1Var;
        s1 s1Var;
        s1 s1Var2;
        s1 s1Var3;
        Object obj;
        List list;
        s1 s1Var4;
        int i;
        s1 s1Var5;
        s1 s1Var6;
        e1 G;
        e1 G2;
        e1 e1Var = this.b;
        if (e1Var.a) {
            this.e.d(e1Var.P());
        }
        if (!this.e.j) {
            e1.b y = this.b.y();
            this.d = y;
            if (y != e1.b.MATCH_CONSTRAINT) {
                if (y == e1.b.MATCH_PARENT && (((G2 = this.b.G()) != null && G2.y() == e1.b.FIXED) || G2.y() == e1.b.MATCH_PARENT)) {
                    int P = (G2.P() - this.b.A.c()) - this.b.C.c();
                    b(this.h, G2.d.h, this.b.A.c());
                    b(this.i, G2.d.i, -this.b.C.c());
                    this.e.d(P);
                    return;
                } else if (this.d == e1.b.FIXED) {
                    this.e.d(this.b.P());
                }
            }
        } else if (this.d == e1.b.MATCH_PARENT && (((G = this.b.G()) != null && G.y() == e1.b.FIXED) || G.y() == e1.b.MATCH_PARENT)) {
            b(this.h, G.d.h, this.b.A.c());
            b(this.i, G.d.i, -this.b.C.c());
            return;
        }
        int i2 = 1;
        if (this.e.j) {
            e1 e1Var2 = this.b;
            if (e1Var2.a) {
                d1[] d1VarArr = e1Var2.I;
                if (d1VarArr[0].c == null || d1VarArr[1].c == null) {
                    e1 e1Var3 = this.b;
                    d1[] d1VarArr2 = e1Var3.I;
                    if (d1VarArr2[0].c != null) {
                        s1 h = h(d1VarArr2[0]);
                        if (h != null) {
                            b(this.h, h, this.b.I[0].c());
                        } else {
                            return;
                        }
                    } else if (d1VarArr2[1].c != null) {
                        s1 h2 = h(d1VarArr2[1]);
                        if (h2 != null) {
                            b(this.i, h2, -this.b.I[1].c());
                            s1Var6 = this.h;
                            s1Var5 = this.i;
                            i = -this.e.g;
                            b(s1Var6, s1Var5, i);
                            return;
                        }
                        return;
                    } else if (!(e1Var3 instanceof i1) && e1Var3.G() != null && this.b.m(d1.b.CENTER).c == null) {
                        b(this.h, this.b.G().d.h, this.b.Q());
                    } else {
                        return;
                    }
                    s1Var6 = this.i;
                    s1Var5 = this.h;
                    i = this.e.g;
                    b(s1Var6, s1Var5, i);
                    return;
                } else if (e1Var2.V()) {
                    this.h.f = this.b.I[0].c();
                    s1Var = this.i;
                    d1Var = this.b.I[1];
                    s1Var.f = -d1Var.c();
                } else {
                    s1 h3 = h(this.b.I[0]);
                    if (h3 != null) {
                        b(this.h, h3, this.b.I[0].c());
                    }
                    s1 h4 = h(this.b.I[1]);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.I[1].c());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
            }
        }
        if (this.d == e1.b.MATCH_CONSTRAINT) {
            e1 e1Var4 = this.b;
            int i3 = e1Var4.j;
            if (i3 == 2) {
                e1 G3 = e1Var4.G();
                if (G3 != null) {
                    t1 t1Var = G3.e.e;
                    this.e.l.add(t1Var);
                    t1Var.k.add(this.e);
                    t1 t1Var2 = this.e;
                    t1Var2.b = true;
                    t1Var2.k.add(this.h);
                    list = this.e.k;
                    obj = this.i;
                }
            } else if (i3 == 3) {
                if (e1Var4.k == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    y1 y1Var = e1Var4.e;
                    y1Var.h.a = this;
                    y1Var.i.a = this;
                    this.e.a = this;
                    if (e1Var4.W()) {
                        this.e.l.add(this.b.e.e);
                        this.b.e.e.k.add(this.e);
                        y1 y1Var2 = this.b.e;
                        y1Var2.e.a = this;
                        this.e.l.add(y1Var2.h);
                        this.e.l.add(this.b.e.i);
                        this.b.e.h.k.add(this.e);
                        list = this.b.e.i.k;
                        obj = this.e;
                    } else if (this.b.V()) {
                        this.b.e.e.l.add(this.e);
                        list = this.e.k;
                        obj = this.b.e.e;
                    } else {
                        s1Var4 = this.b.e.e;
                    }
                } else {
                    t1 t1Var3 = e1Var4.e.e;
                    this.e.l.add(t1Var3);
                    t1Var3.k.add(this.e);
                    this.b.e.h.k.add(this.e);
                    this.b.e.i.k.add(this.e);
                    t1 t1Var4 = this.e;
                    t1Var4.b = true;
                    t1Var4.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    s1Var4 = this.i;
                }
                list = s1Var4.l;
                obj = this.e;
            }
            list.add(obj);
        }
        e1 e1Var5 = this.b;
        d1[] d1VarArr3 = e1Var5.I;
        if (d1VarArr3[0].c == null || d1VarArr3[1].c == null) {
            e1 e1Var6 = this.b;
            d1[] d1VarArr4 = e1Var6.I;
            if (d1VarArr4[0].c != null) {
                s1 h5 = h(d1VarArr4[0]);
                if (h5 != null) {
                    b(this.h, h5, this.b.I[0].c());
                } else {
                    return;
                }
            } else if (d1VarArr4[1].c != null) {
                s1 h6 = h(d1VarArr4[1]);
                if (h6 != null) {
                    b(this.i, h6, -this.b.I[1].c());
                    s1Var3 = this.h;
                    s1Var2 = this.i;
                    i2 = -1;
                    c(s1Var3, s1Var2, i2, this.e);
                }
                return;
            } else if (!(e1Var6 instanceof i1) && e1Var6.G() != null) {
                b(this.h, this.b.G().d.h, this.b.Q());
            } else {
                return;
            }
            s1Var3 = this.i;
            s1Var2 = this.h;
            c(s1Var3, s1Var2, i2, this.e);
        } else if (e1Var5.V()) {
            this.h.f = this.b.I[0].c();
            s1Var = this.i;
            d1Var = this.b.I[1];
            s1Var.f = -d1Var.c();
        } else {
            s1 h7 = h(this.b.I[0]);
            s1 h8 = h(this.b.I[1]);
            h7.b(this);
            h8.b(this);
            this.j = z1.b.CENTER;
        }
    }

    public void e() {
        s1 s1Var = this.h;
        if (s1Var.j) {
            this.b.D0(s1Var.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.d != e1.b.MATCH_CONSTRAINT || this.b.j == 0;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.r();
    }
}
