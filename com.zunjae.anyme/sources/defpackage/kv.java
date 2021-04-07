package defpackage;

/* renamed from: kv  reason: default package */
final class kv {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153};

    private static boolean a(int i) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(it itVar) {
        return c(itVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(defpackage.it r22, boolean r23) {
        /*
            r0 = r22
            long r1 = r22.g()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0014
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            int r4 = (int) r3
            i50 r3 = new i50
            r8 = 64
            r3.<init>((int) r8)
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x001f:
            if (r9 >= r4) goto L_0x00d8
            r12 = 8
            r3.I(r12)
            byte[] r13 = r3.a
            r0.l(r13, r8, r12)
            long r13 = r3.B()
            int r15 = r3.k()
            r16 = 1
            r11 = 16
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x0048
            byte[] r13 = r3.a
            r0.l(r13, r12, r12)
            r3.L(r11)
            long r13 = r3.s()
            goto L_0x0061
        L_0x0048:
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x005f
            long r16 = r22.g()
            int r11 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x005f
            long r13 = r22.d()
            long r16 = r16 - r13
            long r13 = (long) r12
            long r13 = r16 + r13
        L_0x005f:
            r11 = 8
        L_0x0061:
            long r5 = (long) r11
            int r18 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r18 >= 0) goto L_0x0067
            return r8
        L_0x0067:
            int r9 = r9 + r11
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r11) goto L_0x007a
            int r5 = (int) r13
            int r4 = r4 + r5
            if (r7 == 0) goto L_0x0077
            long r5 = (long) r4
            int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r11 <= 0) goto L_0x0077
            int r4 = (int) r1
        L_0x0077:
            r5 = -1
            goto L_0x001f
        L_0x007a:
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r11) goto L_0x00d4
            r11 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r11) goto L_0x0085
            goto L_0x00d4
        L_0x0085:
            r18 = r1
            long r1 = (long) r9
            long r1 = r1 + r13
            long r1 = r1 - r5
            r20 = r9
            long r8 = (long) r4
            int r21 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r21 < 0) goto L_0x0092
            goto L_0x00d8
        L_0x0092:
            long r13 = r13 - r5
            int r1 = (int) r13
            int r9 = r20 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r2) goto L_0x00c7
            r2 = 0
            if (r1 >= r12) goto L_0x009f
            return r2
        L_0x009f:
            r3.I(r1)
            byte[] r5 = r3.a
            r0.l(r5, r2, r1)
            int r1 = r1 / 4
            r2 = 0
        L_0x00aa:
            if (r2 >= r1) goto L_0x00c3
            r5 = 1
            if (r2 != r5) goto L_0x00b4
            r6 = 4
            r3.N(r6)
            goto L_0x00c0
        L_0x00b4:
            int r6 = r3.k()
            boolean r6 = a(r6)
            if (r6 == 0) goto L_0x00c0
            r10 = 1
            goto L_0x00c3
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x00aa
        L_0x00c3:
            r2 = 0
            if (r10 != 0) goto L_0x00cd
            return r2
        L_0x00c7:
            r2 = 0
            if (r1 == 0) goto L_0x00cd
            r0.e(r1)
        L_0x00cd:
            r1 = r18
            r5 = -1
            r8 = 0
            goto L_0x001f
        L_0x00d4:
            r2 = 0
            r5 = 1
            r0 = 1
            goto L_0x00db
        L_0x00d8:
            r2 = 0
            r5 = 1
            r0 = 0
        L_0x00db:
            if (r10 == 0) goto L_0x00e3
            r1 = r23
            if (r1 != r0) goto L_0x00e3
            r8 = 1
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.c(it, boolean):boolean");
    }

    public static boolean d(it itVar) {
        return c(itVar, false);
    }
}
