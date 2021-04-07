package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: tm0  reason: default package */
final class tm0<T> implements dn0<T> {
    private static final int[] l = new int[0];
    private static final Unsafe m = bo0.A();
    private final int[] a;
    private final Object[] b;
    private final boolean c;
    private final boolean d;
    private final int[] e;
    private final int f;
    private final int g;
    private final yl0 h;
    private final vn0<?, ?> i;
    private final rk0<?> j;
    private final im0 k;

    private tm0(int[] iArr, Object[] objArr, int i2, int i3, pm0 pm0, boolean z, boolean z2, int[] iArr2, int i4, int i5, um0 um0, yl0 yl0, vn0<?, ?> vn0, rk0<?> rk0, im0 im0) {
        this.a = iArr;
        this.b = objArr;
        boolean z3 = pm0 instanceof cl0;
        this.d = z;
        this.c = rk0 != null && rk0.d(pm0);
        this.e = iArr2;
        this.f = i4;
        this.g = i5;
        this.h = yl0;
        this.i = vn0;
        this.j = rk0;
        this.k = im0;
    }

    private final boolean A(T t, T t2, int i2) {
        return o(t, i2) == o(t2, i2);
    }

    private static List<?> B(Object obj, long j2) {
        return (List) bo0.G(obj, j2);
    }

    private static <T> double C(T t, long j2) {
        return ((Double) bo0.G(t, j2)).doubleValue();
    }

    private static <T> float D(T t, long j2) {
        return ((Float) bo0.G(t, j2)).floatValue();
    }

    private static <T> int E(T t, long j2) {
        return ((Integer) bo0.G(t, j2)).intValue();
    }

    private static <T> long F(T t, long j2) {
        return ((Long) bo0.G(t, j2)).longValue();
    }

    private static <T> boolean G(T t, long j2) {
        return ((Boolean) bo0.G(t, j2)).booleanValue();
    }

    private static <UT, UB> int a(vn0<UT, UB> vn0, T t) {
        return vn0.f(vn0.g(t));
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x038c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> defpackage.tm0<T> i(java.lang.Class<T> r33, defpackage.nm0 r34, defpackage.um0 r35, defpackage.yl0 r36, defpackage.vn0<?, ?> r37, defpackage.rk0<?> r38, defpackage.im0 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof defpackage.en0
            if (r1 == 0) goto L_0x040f
            en0 r0 = (defpackage.en0) r0
            int r1 = r0.c()
            int r2 = defpackage.cl0.e.j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.d()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = 1
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = 1
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = l
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = m
            java.lang.Object[] r16 = r0.e()
            pm0 r17 = r0.b()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03e3
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x02aa
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0222:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023c:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = j(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r10 = (int) r9
            int r4 = r4 + 1
            r9 = r16[r4]
            r25 = r10
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x028e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0296
        L_0x028e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = j(r6, r9)
            r16[r4] = r9
        L_0x0296:
            long r9 = r8.objectFieldOffset(r9)
            int r4 = (int) r9
            r30 = r1
            r9 = r4
            r1 = r11
            r24 = r12
            r10 = r25
            r11 = r31
            r4 = 0
            r18 = 1
            goto L_0x03a8
        L_0x02aa:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = j(r6, r10)
            r13 = 9
            if (r15 == r13) goto L_0x031e
            r13 = 17
            if (r15 != r13) goto L_0x02bd
            goto L_0x031e
        L_0x02bd:
            r13 = 27
            if (r15 == r13) goto L_0x030d
            r13 = 49
            if (r15 != r13) goto L_0x02c6
            goto L_0x030d
        L_0x02c6:
            r13 = 12
            if (r15 == r13) goto L_0x02f9
            r13 = 30
            if (r15 == r13) goto L_0x02f9
            r13 = 44
            if (r15 != r13) goto L_0x02d3
            goto L_0x02f9
        L_0x02d3:
            r13 = 50
            if (r15 != r13) goto L_0x032c
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02f6
            int r21 = r21 + 1
            int r9 = r25 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x032c
        L_0x02f6:
            r21 = r13
            goto L_0x031b
        L_0x02f9:
            if (r11 != 0) goto L_0x030a
            int r13 = r20 / 3
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x031b
        L_0x030a:
            r24 = 1
            goto L_0x032c
        L_0x030d:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
        L_0x031b:
            r13 = r25
            goto L_0x032d
        L_0x031e:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x032c:
            r13 = r9
        L_0x032d:
            long r9 = r8.objectFieldOffset(r10)
            int r10 = (int) r9
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r9 != r13) goto L_0x038c
            r9 = 17
            if (r15 > r9) goto L_0x038c
            int r9 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0364
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034d:
            int r28 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r13) goto L_0x035f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r18
            r4 = r4 | r9
            int r18 = r18 + 13
            r9 = r28
            goto L_0x034d
        L_0x035f:
            int r9 = r9 << r18
            r4 = r4 | r9
            r9 = r28
        L_0x0364:
            r18 = 1
            int r24 = r3 << 1
            int r28 = r4 / 32
            int r24 = r24 + r28
            r13 = r16[r24]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0377
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x037f
        L_0x0377:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = j(r6, r13)
            r16[r24] = r13
        L_0x037f:
            r1 = r11
            r24 = r12
            long r11 = r8.objectFieldOffset(r13)
            int r12 = (int) r11
            int r4 = r4 % 32
            r11 = r9
            r9 = r12
            goto L_0x0398
        L_0x038c:
            r30 = r1
            r1 = r11
            r24 = r12
            r18 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r4
            r4 = 0
        L_0x0398:
            r12 = 18
            if (r15 < r12) goto L_0x03a6
            r12 = 49
            if (r15 > r12) goto L_0x03a6
            int r12 = r22 + 1
            r14[r22] = r10
            r22 = r12
        L_0x03a6:
            r13 = r25
        L_0x03a8:
            int r12 = r20 + 1
            r5[r20] = r7
            int r7 = r12 + 1
            r20 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b7
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03bf
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c0
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r10
            r5[r12] = r2
            int r2 = r7 + 1
            int r3 = r4 << 20
            r3 = r3 | r9
            r5[r7] = r3
            r7 = r11
            r3 = r20
            r10 = r23
            r12 = r24
            r15 = r27
            r9 = r29
            r4 = 1
            r11 = r1
            r20 = r2
            r2 = r26
            r1 = r30
            goto L_0x0193
        L_0x03e3:
            r29 = r9
            r23 = r10
            r1 = r11
            r24 = r12
            r27 = r15
            tm0 r2 = new tm0
            pm0 r10 = r0.b()
            r12 = 0
            r0 = r5
            r5 = r2
            r6 = r0
            r7 = r24
            r8 = r29
            r9 = r23
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x040f:
            sn0 r0 = (defpackage.sn0) r0
            r0.c()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.i(java.lang.Class, nm0, um0, yl0, vn0, rk0, im0):tm0");
    }

    private static Field j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void k(int i2, Object obj, qo0 qo0) {
        if (obj instanceof String) {
            qo0.G(i2, (String) obj);
        } else {
            qo0.M(i2, (bk0) obj);
        }
    }

    private static <UT, UB> void l(vn0<UT, UB> vn0, T t, qo0 qo0) {
        vn0.a(vn0.g(t), qo0);
    }

    private final <K, V> void m(qo0 qo0, int i2, Object obj, int i3) {
        if (obj != null) {
            qo0.F(i2, this.k.b(x(i3)), this.k.d(obj));
        }
    }

    private final void n(T t, T t2, int i2) {
        long y = (long) (y(i2) & 1048575);
        if (o(t2, i2)) {
            Object G = bo0.G(t, y);
            Object G2 = bo0.G(t2, y);
            if (G != null && G2 != null) {
                bo0.g(t, y, gl0.e(G, G2));
                s(t, i2);
            } else if (G2 != null) {
                bo0.g(t, y, G2);
                s(t, i2);
            }
        }
    }

    private final boolean o(T t, int i2) {
        int z = z(i2);
        long j2 = (long) (z & 1048575);
        if (j2 == 1048575) {
            int y = y(i2);
            long j3 = (long) (y & 1048575);
            switch ((y & 267386880) >>> 20) {
                case 0:
                    return bo0.F(t, j3) != Utils.DOUBLE_EPSILON;
                case 1:
                    return bo0.E(t, j3) != Utils.FLOAT_EPSILON;
                case 2:
                    return bo0.w(t, j3) != 0;
                case 3:
                    return bo0.w(t, j3) != 0;
                case 4:
                    return bo0.u(t, j3) != 0;
                case 5:
                    return bo0.w(t, j3) != 0;
                case 6:
                    return bo0.u(t, j3) != 0;
                case 7:
                    return bo0.x(t, j3);
                case 8:
                    Object G = bo0.G(t, j3);
                    if (G instanceof String) {
                        return !((String) G).isEmpty();
                    }
                    if (G instanceof bk0) {
                        return !bk0.f.equals(G);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return bo0.G(t, j3) != null;
                case 10:
                    return !bk0.f.equals(bo0.G(t, j3));
                case 11:
                    return bo0.u(t, j3) != 0;
                case 12:
                    return bo0.u(t, j3) != 0;
                case 13:
                    return bo0.u(t, j3) != 0;
                case 14:
                    return bo0.w(t, j3) != 0;
                case 15:
                    return bo0.u(t, j3) != 0;
                case 16:
                    return bo0.w(t, j3) != 0;
                case 17:
                    return bo0.G(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (bo0.u(t, j2) & (1 << (z >>> 20))) != 0;
        }
    }

    private final boolean p(T t, int i2, int i3) {
        return bo0.u(t, (long) (z(i3) & 1048575)) == i2;
    }

    private final boolean q(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? o(t, i2) : (i4 & i5) != 0;
    }

    private static boolean r(Object obj, int i2, dn0 dn0) {
        return dn0.d(bo0.G(obj, (long) (i2 & 1048575)));
    }

    private final void s(T t, int i2) {
        int z = z(i2);
        long j2 = (long) (1048575 & z);
        if (j2 != 1048575) {
            bo0.e(t, j2, (1 << (z >>> 20)) | bo0.u(t, j2));
        }
    }

    private final void t(T t, int i2, int i3) {
        bo0.e(t, (long) (z(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void u(T r17, defpackage.qo0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.c
            if (r3 == 0) goto L_0x0023
            rk0<?> r3 = r0.j
            wk0 r3 = r3.c(r1)
            in0<T, java.lang.Object> r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.d()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            int[] r5 = r0.a
            int r5 = r5.length
            sun.misc.Unsafe r6 = m
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x0031:
            if (r9 >= r5) goto L_0x046b
            int r12 = r0.y(r9)
            int[] r13 = r0.a
            r14 = r13[r9]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.d
            r8 = 1
            if (r4 != 0) goto L_0x005c
            r4 = 17
            if (r15 > r4) goto L_0x005c
            int r4 = r9 + 2
            r4 = r13[r4]
            r13 = r4 & r7
            if (r13 == r10) goto L_0x0057
            long r10 = (long) r13
            int r11 = r6.getInt(r1, r10)
            r10 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            int r4 = r8 << r4
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x0464
            r12 = r12 & r7
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x0455;
                case 1: goto L_0x0449;
                case 2: goto L_0x043d;
                case 3: goto L_0x0431;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03f5;
                case 9: goto L_0x03e4;
                case 10: goto L_0x03d5;
                case 11: goto L_0x03c8;
                case 12: goto L_0x03bb;
                case 13: goto L_0x03ae;
                case 14: goto L_0x03a1;
                case 15: goto L_0x0394;
                case 16: goto L_0x0387;
                case 17: goto L_0x0376;
                case 18: goto L_0x0366;
                case 19: goto L_0x0356;
                case 20: goto L_0x0346;
                case 21: goto L_0x0336;
                case 22: goto L_0x0326;
                case 23: goto L_0x0316;
                case 24: goto L_0x0306;
                case 25: goto L_0x02f6;
                case 26: goto L_0x02e7;
                case 27: goto L_0x02d4;
                case 28: goto L_0x02c5;
                case 29: goto L_0x02b5;
                case 30: goto L_0x02a5;
                case 31: goto L_0x0295;
                case 32: goto L_0x0285;
                case 33: goto L_0x0275;
                case 34: goto L_0x0265;
                case 35: goto L_0x0256;
                case 36: goto L_0x0247;
                case 37: goto L_0x0238;
                case 38: goto L_0x0229;
                case 39: goto L_0x021a;
                case 40: goto L_0x020b;
                case 41: goto L_0x01fc;
                case 42: goto L_0x01ed;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cf;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b1;
                case 47: goto L_0x01a2;
                case 48: goto L_0x0193;
                case 49: goto L_0x0180;
                case 50: goto L_0x0177;
                case 51: goto L_0x0168;
                case 52: goto L_0x0159;
                case 53: goto L_0x014a;
                case 54: goto L_0x013b;
                case 55: goto L_0x012c;
                case 56: goto L_0x011d;
                case 57: goto L_0x010e;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00dd;
                case 61: goto L_0x00cd;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0095;
                case 66: goto L_0x0087;
                case 67: goto L_0x0079;
                case 68: goto L_0x0067;
                default: goto L_0x0064;
            }
        L_0x0064:
            r15 = 0
            goto L_0x0460
        L_0x0067:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            dn0 r8 = r0.w(r9)
            r2.A(r14, r4, r8)
            goto L_0x0064
        L_0x0079:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = F(r1, r12)
            r2.b(r14, r12)
            goto L_0x0064
        L_0x0087:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = E(r1, r12)
            r2.I(r14, r4)
            goto L_0x0064
        L_0x0095:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = F(r1, r12)
            r2.y(r14, r12)
            goto L_0x0064
        L_0x00a3:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = E(r1, r12)
            r2.H(r14, r4)
            goto L_0x0064
        L_0x00b1:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = E(r1, r12)
            r2.K(r14, r4)
            goto L_0x0064
        L_0x00bf:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = E(r1, r12)
            r2.E(r14, r4)
            goto L_0x0064
        L_0x00cd:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            bk0 r4 = (defpackage.bk0) r4
            r2.M(r14, r4)
            goto L_0x0064
        L_0x00dd:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            dn0 r8 = r0.w(r9)
            r2.D(r14, r4, r8)
            goto L_0x0064
        L_0x00f0:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            k(r14, r4, r2)
            goto L_0x0064
        L_0x00ff:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            boolean r4 = G(r1, r12)
            r2.C(r14, r4)
            goto L_0x0064
        L_0x010e:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = E(r1, r12)
            r2.z(r14, r4)
            goto L_0x0064
        L_0x011d:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = F(r1, r12)
            r2.g(r14, r12)
            goto L_0x0064
        L_0x012c:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = E(r1, r12)
            r2.O(r14, r4)
            goto L_0x0064
        L_0x013b:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = F(r1, r12)
            r2.n(r14, r12)
            goto L_0x0064
        L_0x014a:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = F(r1, r12)
            r2.J(r14, r12)
            goto L_0x0064
        L_0x0159:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            float r4 = D(r1, r12)
            r2.p(r14, r4)
            goto L_0x0064
        L_0x0168:
            boolean r4 = r0.p(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            double r12 = C(r1, r12)
            r2.o(r14, r12)
            goto L_0x0064
        L_0x0177:
            java.lang.Object r4 = r6.getObject(r1, r12)
            r0.m(r2, r14, r4, r9)
            goto L_0x0064
        L_0x0180:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            dn0 r12 = r0.w(r9)
            defpackage.fn0.h(r4, r8, r2, r12)
            goto L_0x0064
        L_0x0193:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.q(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01a2:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.C(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01b1:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.w(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01c0:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.G(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01cf:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.N(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01de:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.A(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01ed:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.P(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01fc:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.E(r4, r12, r2, r8)
            goto L_0x0064
        L_0x020b:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.t(r4, r12, r2, r8)
            goto L_0x0064
        L_0x021a:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.y(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0229:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.p(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0238:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.m(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0247:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.i(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0256:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            defpackage.fn0.c(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0265:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            defpackage.fn0.q(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0275:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.C(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0285:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.w(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0295:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.G(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02a5:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.N(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02b5:
            r14 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.A(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02c5:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.g(r4, r8, r2)
            goto L_0x0064
        L_0x02d4:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            dn0 r12 = r0.w(r9)
            defpackage.fn0.b(r4, r8, r2, r12)
            goto L_0x0064
        L_0x02e7:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.a(r4, r8, r2)
            goto L_0x0064
        L_0x02f6:
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            defpackage.fn0.P(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0306:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.E(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0316:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.t(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0326:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.y(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0336:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.p(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0346:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.m(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0356:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.i(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0366:
            r15 = 0
            int[] r4 = r0.a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.c(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0376:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            dn0 r8 = r0.w(r9)
            r2.A(r14, r4, r8)
            goto L_0x0460
        L_0x0387:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.b(r14, r12)
            goto L_0x0460
        L_0x0394:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.I(r14, r4)
            goto L_0x0460
        L_0x03a1:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.y(r14, r12)
            goto L_0x0460
        L_0x03ae:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.H(r14, r4)
            goto L_0x0460
        L_0x03bb:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.K(r14, r4)
            goto L_0x0460
        L_0x03c8:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.E(r14, r4)
            goto L_0x0460
        L_0x03d5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            bk0 r4 = (defpackage.bk0) r4
            r2.M(r14, r4)
            goto L_0x0460
        L_0x03e4:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            dn0 r8 = r0.w(r9)
            r2.D(r14, r4, r8)
            goto L_0x0460
        L_0x03f5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            k(r14, r4, r2)
            goto L_0x0460
        L_0x0401:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            boolean r4 = defpackage.bo0.x(r1, r12)
            r2.C(r14, r4)
            goto L_0x0460
        L_0x040d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.z(r14, r4)
            goto L_0x0460
        L_0x0419:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.g(r14, r12)
            goto L_0x0460
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.O(r14, r4)
            goto L_0x0460
        L_0x0431:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.n(r14, r12)
            goto L_0x0460
        L_0x043d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.J(r14, r12)
            goto L_0x0460
        L_0x0449:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            float r4 = defpackage.bo0.E(r1, r12)
            r2.p(r14, r4)
            goto L_0x0460
        L_0x0455:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            double r12 = defpackage.bo0.F(r1, r12)
            r2.o(r14, r12)
        L_0x0460:
            int r9 = r9 + 3
            goto L_0x0031
        L_0x0464:
            rk0<?> r1 = r0.j
            r1.a(r3)
            r4 = 0
            throw r4
        L_0x046b:
            r4 = 0
            if (r3 != 0) goto L_0x0474
            vn0<?, ?> r3 = r0.i
            l(r3, r1, r2)
            return
        L_0x0474:
            rk0<?> r1 = r0.j
            r1.b(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.u(java.lang.Object, qo0):void");
    }

    private final void v(T t, T t2, int i2) {
        int y = y(i2);
        int i3 = this.a[i2];
        long j2 = (long) (y & 1048575);
        if (p(t2, i3, i2)) {
            Object G = bo0.G(t, j2);
            Object G2 = bo0.G(t2, j2);
            if (G != null && G2 != null) {
                bo0.g(t, j2, gl0.e(G, G2));
                t(t, i3, i2);
            } else if (G2 != null) {
                bo0.g(t, j2, G2);
                t(t, i3, i2);
            }
        }
    }

    private final dn0 w(int i2) {
        int i3 = (i2 / 3) << 1;
        dn0 dn0 = (dn0) this.b[i3];
        if (dn0 != null) {
            return dn0;
        }
        dn0 a2 = cn0.b().a((Class) this.b[i3 + 1]);
        this.b[i3] = a2;
        return a2;
    }

    private final Object x(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    private final int y(int i2) {
        return this.a[i2 + 1];
    }

    private final int z(int i2) {
        return this.a[i2 + 2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (defpackage.fn0.r(defpackage.bo0.G(r10, r6), defpackage.bo0.G(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (defpackage.bo0.w(r10, r6) == defpackage.bo0.w(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (defpackage.bo0.u(r10, r6) == defpackage.bo0.u(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (defpackage.bo0.w(r10, r6) == defpackage.bo0.w(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (defpackage.bo0.u(r10, r6) == defpackage.bo0.u(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (defpackage.bo0.u(r10, r6) == defpackage.bo0.u(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (defpackage.bo0.u(r10, r6) == defpackage.bo0.u(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (defpackage.fn0.r(defpackage.bo0.G(r10, r6), defpackage.bo0.G(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (defpackage.fn0.r(defpackage.bo0.G(r10, r6), defpackage.bo0.G(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (defpackage.fn0.r(defpackage.bo0.G(r10, r6), defpackage.bo0.G(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (defpackage.bo0.x(r10, r6) == defpackage.bo0.x(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (defpackage.bo0.u(r10, r6) == defpackage.bo0.u(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (defpackage.bo0.w(r10, r6) == defpackage.bo0.w(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (defpackage.bo0.u(r10, r6) == defpackage.bo0.u(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (defpackage.bo0.w(r10, r6) == defpackage.bo0.w(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (defpackage.bo0.w(r10, r6) == defpackage.bo0.w(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.bo0.E(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.bo0.E(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.bo0.F(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.bo0.F(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (defpackage.fn0.r(defpackage.bo0.G(r10, r6), defpackage.bo0.G(r11, r6)) != false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ba
            int r4 = r9.y(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0198;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b3
        L_0x001c:
            int r4 = r9.z(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = defpackage.bo0.u(r10, r4)
            int r4 = defpackage.bo0.u(r11, r4)
            if (r8 != r4) goto L_0x01b2
            java.lang.Object r4 = defpackage.bo0.G(r10, r6)
            java.lang.Object r5 = defpackage.bo0.G(r11, r6)
            boolean r4 = defpackage.fn0.r(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x003c:
            java.lang.Object r3 = defpackage.bo0.G(r10, r6)
            java.lang.Object r4 = defpackage.bo0.G(r11, r6)
            boolean r3 = defpackage.fn0.r(r3, r4)
            goto L_0x01b3
        L_0x004a:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = defpackage.bo0.G(r10, r6)
            java.lang.Object r5 = defpackage.bo0.G(r11, r6)
            boolean r4 = defpackage.fn0.r(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0060:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = defpackage.bo0.w(r10, r6)
            long r6 = defpackage.bo0.w(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x0074:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = defpackage.bo0.u(r10, r6)
            int r5 = defpackage.bo0.u(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0086:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = defpackage.bo0.w(r10, r6)
            long r6 = defpackage.bo0.w(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x009a:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = defpackage.bo0.u(r10, r6)
            int r5 = defpackage.bo0.u(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00ac:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = defpackage.bo0.u(r10, r6)
            int r5 = defpackage.bo0.u(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x00be:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = defpackage.bo0.u(r10, r6)
            int r5 = defpackage.bo0.u(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00d0:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = defpackage.bo0.G(r10, r6)
            java.lang.Object r5 = defpackage.bo0.G(r11, r6)
            boolean r4 = defpackage.fn0.r(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x00e6:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = defpackage.bo0.G(r10, r6)
            java.lang.Object r5 = defpackage.bo0.G(r11, r6)
            boolean r4 = defpackage.fn0.r(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x00fc:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = defpackage.bo0.G(r10, r6)
            java.lang.Object r5 = defpackage.bo0.G(r11, r6)
            boolean r4 = defpackage.fn0.r(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x0112:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            boolean r4 = defpackage.bo0.x(r10, r6)
            boolean r5 = defpackage.bo0.x(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0124:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = defpackage.bo0.u(r10, r6)
            int r5 = defpackage.bo0.u(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0135:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = defpackage.bo0.w(r10, r6)
            long r6 = defpackage.bo0.w(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0148:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = defpackage.bo0.u(r10, r6)
            int r5 = defpackage.bo0.u(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0159:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = defpackage.bo0.w(r10, r6)
            long r6 = defpackage.bo0.w(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x016c:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = defpackage.bo0.w(r10, r6)
            long r6 = defpackage.bo0.w(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x017f:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            float r4 = defpackage.bo0.E(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = defpackage.bo0.E(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01b3
        L_0x0197:
            goto L_0x01b2
        L_0x0198:
            boolean r4 = r9.A(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            double r4 = defpackage.bo0.F(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = defpackage.bo0.F(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
        L_0x01b2:
            r3 = 0
        L_0x01b3:
            if (r3 != 0) goto L_0x01b6
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            vn0<?, ?> r0 = r9.i
            java.lang.Object r0 = r0.g(r10)
            vn0<?, ?> r2 = r9.i
            java.lang.Object r2 = r2.g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r9.c
            if (r0 == 0) goto L_0x01e2
            rk0<?> r0 = r9.j
            wk0 r10 = r0.c(r10)
            rk0<?> r0 = r9.j
            wk0 r11 = r0.c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = defpackage.bo0.G(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = E(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = F(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = defpackage.bo0.G(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) defpackage.bo0.G(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = defpackage.gl0.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = defpackage.gl0.j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.y(r1)
            int[] r4 = r8.a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = defpackage.bo0.G(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = G(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = E(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = F(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = D(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.p(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = C(r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = defpackage.bo0.G(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.bo0.G(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = defpackage.bo0.G(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.bo0.G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = defpackage.bo0.x(r9, r5)
        L_0x00fd:
            int r3 = defpackage.gl0.i(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = defpackage.bo0.u(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = defpackage.bo0.w(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = defpackage.bo0.E(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = defpackage.bo0.F(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = defpackage.gl0.j(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            vn0<?, ?> r0 = r8.i
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.c
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            rk0<?> r0 = r8.j
            wk0 r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.c(java.lang.Object):int");
    }

    public final boolean d(T t) {
        int i2;
        int i3;
        T t2 = t;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.f) {
                return !this.c || this.j.c(t2).c();
            }
            int i7 = this.e[i6];
            int i8 = this.a[i7];
            int y = y(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = m.getInt(t2, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & y) != 0) && !q(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & y) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (p(t2, i8, i7) && !r(t2, y, w(i7))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 != 50) {
                            continue;
                        } else {
                            Map<?, ?> d2 = this.k.d(bo0.G(t2, (long) (y & 1048575)));
                            if (!d2.isEmpty()) {
                                if (this.k.b(x(i7)).b.zzlw() == ro0.MESSAGE) {
                                    dn0<?> dn0 = null;
                                    Iterator<?> it = d2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (dn0 == null) {
                                            dn0 = cn0.b().a(next.getClass());
                                        }
                                        if (!dn0.d(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) bo0.G(t2, (long) (y & 1048575));
                if (!list.isEmpty()) {
                    dn0 w = w(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!w.d(list.get(i13))) {
                            z = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (q(t, i7, i3, i2, i11) && !r(t2, y, w(i7))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        defpackage.bo0.g(r7, r2, defpackage.bo0.G(r8, r2));
        t(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        defpackage.bo0.g(r7, r2, defpackage.bo0.G(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        defpackage.bo0.e(r7, r2, defpackage.bo0.u(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        defpackage.bo0.f(r7, r2, defpackage.bo0.w(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        s(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0101
            r0 = 0
        L_0x0003:
            int[] r1 = r6.a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.y(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.p(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.v(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.p(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = defpackage.bo0.G(r8, r2)
            defpackage.bo0.g(r7, r2, r1)
            r6.t(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            im0 r1 = r6.k
            defpackage.fn0.e(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            yl0 r1 = r6.h
            r1.b(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.n(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = defpackage.bo0.G(r8, r2)
            defpackage.bo0.g(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = defpackage.bo0.x(r8, r2)
            defpackage.bo0.h(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = defpackage.bo0.u(r8, r2)
            defpackage.bo0.e(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = defpackage.bo0.w(r8, r2)
            defpackage.bo0.f(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = defpackage.bo0.E(r8, r2)
            defpackage.bo0.d(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.o(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = defpackage.bo0.F(r8, r2)
            defpackage.bo0.c(r7, r2, r4)
        L_0x00eb:
            r6.s(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0003
        L_0x00f2:
            vn0<?, ?> r0 = r6.i
            defpackage.fn0.f(r0, r7, r8)
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x0100
            rk0<?> r0 = r6.j
            defpackage.fn0.d(r0, r7, r8)
        L_0x0100:
            return
        L_0x0101:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.e(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0345, code lost:
        r14.b(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0356, code lost:
        r14.I(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0367, code lost:
        r14.y(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0378, code lost:
        r14.H(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0389, code lost:
        r14.K(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039a, code lost:
        r14.E(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a5, code lost:
        r14.M(r9, (defpackage.bk0) defpackage.bo0.G(r13, (long) (r7 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b8, code lost:
        r14.D(r9, defpackage.bo0.G(r13, (long) (r7 & 1048575)), w(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cd, code lost:
        k(r9, defpackage.bo0.G(r13, (long) (r7 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e4, code lost:
        r14.C(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f5, code lost:
        r14.z(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0405, code lost:
        r14.g(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0415, code lost:
        r14.O(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0425, code lost:
        r14.n(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0435, code lost:
        r14.J(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0445, code lost:
        r14.p(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0455, code lost:
        r14.o(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0783, code lost:
        r14.A(r10, defpackage.bo0.G(r13, (long) (r8 & 1048575)), w(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x079e, code lost:
        r14.b(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07af, code lost:
        r14.I(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07c0, code lost:
        r14.y(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07d1, code lost:
        r14.H(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07e2, code lost:
        r14.K(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07f3, code lost:
        r14.E(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07fe, code lost:
        r14.M(r10, (defpackage.bk0) defpackage.bo0.G(r13, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0811, code lost:
        r14.D(r10, defpackage.bo0.G(r13, (long) (r8 & 1048575)), w(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0826, code lost:
        k(r10, defpackage.bo0.G(r13, (long) (r8 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x083d, code lost:
        r14.C(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x084e, code lost:
        r14.z(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x085e, code lost:
        r14.g(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x086e, code lost:
        r14.O(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087e, code lost:
        r14.n(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x088e, code lost:
        r14.J(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x089e, code lost:
        r14.p(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08ae, code lost:
        r14.o(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x032a, code lost:
        r14.A(r9, defpackage.bo0.G(r13, (long) (r7 & 1048575)), w(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(T r13, defpackage.qo0 r14) {
        /*
            r12 = this;
            int r0 = r14.Q()
            int r1 = defpackage.cl0.e.l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x046b
            vn0<?, ?> r0 = r12.i
            l(r0, r13, r14)
            boolean r0 = r12.c
            if (r0 == 0) goto L_0x0032
            rk0<?> r0 = r12.j
            wk0 r0 = r0.c(r13)
            in0<T, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.a()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x0462
            int r7 = r12.y(r1)
            int[] r8 = r12.a
            r9 = r8[r1]
            if (r0 != 0) goto L_0x045c
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0449;
                case 1: goto L_0x0439;
                case 2: goto L_0x0429;
                case 3: goto L_0x0419;
                case 4: goto L_0x0409;
                case 5: goto L_0x03f9;
                case 6: goto L_0x03e9;
                case 7: goto L_0x03d8;
                case 8: goto L_0x03c7;
                case 9: goto L_0x03b2;
                case 10: goto L_0x039f;
                case 11: goto L_0x038e;
                case 12: goto L_0x037d;
                case 13: goto L_0x036c;
                case 14: goto L_0x035b;
                case 15: goto L_0x034a;
                case 16: goto L_0x0339;
                case 17: goto L_0x0324;
                case 18: goto L_0x0315;
                case 19: goto L_0x0306;
                case 20: goto L_0x02f7;
                case 21: goto L_0x02e8;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02ca;
                case 24: goto L_0x02bb;
                case 25: goto L_0x02ac;
                case 26: goto L_0x029d;
                case 27: goto L_0x028a;
                case 28: goto L_0x027b;
                case 29: goto L_0x026c;
                case 30: goto L_0x025d;
                case 31: goto L_0x024e;
                case 32: goto L_0x023f;
                case 33: goto L_0x0230;
                case 34: goto L_0x0221;
                case 35: goto L_0x0212;
                case 36: goto L_0x0203;
                case 37: goto L_0x01f4;
                case 38: goto L_0x01e5;
                case 39: goto L_0x01d6;
                case 40: goto L_0x01c7;
                case 41: goto L_0x01b8;
                case 42: goto L_0x01a9;
                case 43: goto L_0x019a;
                case 44: goto L_0x018b;
                case 45: goto L_0x017c;
                case 46: goto L_0x016d;
                case 47: goto L_0x015e;
                case 48: goto L_0x014f;
                case 49: goto L_0x013c;
                case 50: goto L_0x0131;
                case 51: goto L_0x0123;
                case 52: goto L_0x0115;
                case 53: goto L_0x0107;
                case 54: goto L_0x00f9;
                case 55: goto L_0x00eb;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00b9;
                case 60: goto L_0x00b1;
                case 61: goto L_0x00a9;
                case 62: goto L_0x009b;
                case 63: goto L_0x008d;
                case 64: goto L_0x007f;
                case 65: goto L_0x0071;
                case 66: goto L_0x0063;
                case 67: goto L_0x0055;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0458
        L_0x004d:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x032a
        L_0x0055:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = F(r13, r7)
            goto L_0x0345
        L_0x0063:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = E(r13, r7)
            goto L_0x0356
        L_0x0071:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = F(r13, r7)
            goto L_0x0367
        L_0x007f:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = E(r13, r7)
            goto L_0x0378
        L_0x008d:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = E(r13, r7)
            goto L_0x0389
        L_0x009b:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = E(r13, r7)
            goto L_0x039a
        L_0x00a9:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03a5
        L_0x00b1:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03b8
        L_0x00b9:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            goto L_0x03cd
        L_0x00c1:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = G(r13, r7)
            goto L_0x03e4
        L_0x00cf:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = E(r13, r7)
            goto L_0x03f5
        L_0x00dd:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = F(r13, r7)
            goto L_0x0405
        L_0x00eb:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = E(r13, r7)
            goto L_0x0415
        L_0x00f9:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = F(r13, r7)
            goto L_0x0425
        L_0x0107:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = F(r13, r7)
            goto L_0x0435
        L_0x0115:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = D(r13, r7)
            goto L_0x0445
        L_0x0123:
            boolean r8 = r12.p(r13, r9, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = C(r13, r7)
            goto L_0x0455
        L_0x0131:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r7)
            r12.m(r14, r9, r7, r1)
            goto L_0x0458
        L_0x013c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            dn0 r9 = r12.w(r1)
            defpackage.fn0.h(r8, r7, r14, r9)
            goto L_0x0458
        L_0x014f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.q(r8, r7, r14, r4)
            goto L_0x0458
        L_0x015e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.C(r8, r7, r14, r4)
            goto L_0x0458
        L_0x016d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.w(r8, r7, r14, r4)
            goto L_0x0458
        L_0x017c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.G(r8, r7, r14, r4)
            goto L_0x0458
        L_0x018b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.N(r8, r7, r14, r4)
            goto L_0x0458
        L_0x019a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.A(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01a9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.P(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01b8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.E(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01c7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.t(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01d6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.y(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01e5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.p(r8, r7, r14, r4)
            goto L_0x0458
        L_0x01f4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.m(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0203:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.i(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0212:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.c(r8, r7, r14, r4)
            goto L_0x0458
        L_0x0221:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.q(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0230:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.C(r8, r7, r14, r5)
            goto L_0x0458
        L_0x023f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.w(r8, r7, r14, r5)
            goto L_0x0458
        L_0x024e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.G(r8, r7, r14, r5)
            goto L_0x0458
        L_0x025d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.N(r8, r7, r14, r5)
            goto L_0x0458
        L_0x026c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.A(r8, r7, r14, r5)
            goto L_0x0458
        L_0x027b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.g(r8, r7, r14)
            goto L_0x0458
        L_0x028a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            dn0 r9 = r12.w(r1)
            defpackage.fn0.b(r8, r7, r14, r9)
            goto L_0x0458
        L_0x029d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.a(r8, r7, r14)
            goto L_0x0458
        L_0x02ac:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.P(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02bb:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.E(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02ca:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.t(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02d9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.y(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02e8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.p(r8, r7, r14, r5)
            goto L_0x0458
        L_0x02f7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.m(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0306:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.i(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0315:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            defpackage.fn0.c(r8, r7, r14, r5)
            goto L_0x0458
        L_0x0324:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x032a:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r7)
            dn0 r8 = r12.w(r1)
            r14.A(r9, r7, r8)
            goto L_0x0458
        L_0x0339:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = defpackage.bo0.w(r13, r7)
        L_0x0345:
            r14.b(r9, r7)
            goto L_0x0458
        L_0x034a:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = defpackage.bo0.u(r13, r7)
        L_0x0356:
            r14.I(r9, r7)
            goto L_0x0458
        L_0x035b:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = defpackage.bo0.w(r13, r7)
        L_0x0367:
            r14.y(r9, r7)
            goto L_0x0458
        L_0x036c:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = defpackage.bo0.u(r13, r7)
        L_0x0378:
            r14.H(r9, r7)
            goto L_0x0458
        L_0x037d:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = defpackage.bo0.u(r13, r7)
        L_0x0389:
            r14.K(r9, r7)
            goto L_0x0458
        L_0x038e:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = defpackage.bo0.u(r13, r7)
        L_0x039a:
            r14.E(r9, r7)
            goto L_0x0458
        L_0x039f:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03a5:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r7)
            bk0 r7 = (defpackage.bk0) r7
            r14.M(r9, r7)
            goto L_0x0458
        L_0x03b2:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03b8:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r7)
            dn0 r8 = r12.w(r1)
            r14.D(r9, r7, r8)
            goto L_0x0458
        L_0x03c7:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
        L_0x03cd:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = defpackage.bo0.G(r13, r7)
            k(r9, r7, r14)
            goto L_0x0458
        L_0x03d8:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = defpackage.bo0.x(r13, r7)
        L_0x03e4:
            r14.C(r9, r7)
            goto L_0x0458
        L_0x03e9:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = defpackage.bo0.u(r13, r7)
        L_0x03f5:
            r14.z(r9, r7)
            goto L_0x0458
        L_0x03f9:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = defpackage.bo0.w(r13, r7)
        L_0x0405:
            r14.g(r9, r7)
            goto L_0x0458
        L_0x0409:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = defpackage.bo0.u(r13, r7)
        L_0x0415:
            r14.O(r9, r7)
            goto L_0x0458
        L_0x0419:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = defpackage.bo0.w(r13, r7)
        L_0x0425:
            r14.n(r9, r7)
            goto L_0x0458
        L_0x0429:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = defpackage.bo0.w(r13, r7)
        L_0x0435:
            r14.J(r9, r7)
            goto L_0x0458
        L_0x0439:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = defpackage.bo0.E(r13, r7)
        L_0x0445:
            r14.p(r9, r7)
            goto L_0x0458
        L_0x0449:
            boolean r8 = r12.o(r13, r1)
            if (r8 == 0) goto L_0x0458
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = defpackage.bo0.F(r13, r7)
        L_0x0455:
            r14.o(r9, r7)
        L_0x0458:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x045c:
            rk0<?> r13 = r12.j
            r13.a(r0)
            throw r3
        L_0x0462:
            if (r0 != 0) goto L_0x0465
            return
        L_0x0465:
            rk0<?> r13 = r12.j
            r13.b(r14, r0)
            throw r3
        L_0x046b:
            boolean r0 = r12.d
            if (r0 == 0) goto L_0x08c9
            boolean r0 = r12.c
            if (r0 == 0) goto L_0x048c
            rk0<?> r0 = r12.j
            wk0 r0 = r0.c(r13)
            in0<T, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x048c
            java.util.Iterator r0 = r0.d()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x048d
        L_0x048c:
            r0 = r3
        L_0x048d:
            int[] r1 = r12.a
            int r1 = r1.length
            r7 = 0
        L_0x0491:
            if (r7 >= r1) goto L_0x08bb
            int r8 = r12.y(r7)
            int[] r9 = r12.a
            r10 = r9[r7]
            if (r0 != 0) goto L_0x08b5
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x08a2;
                case 1: goto L_0x0892;
                case 2: goto L_0x0882;
                case 3: goto L_0x0872;
                case 4: goto L_0x0862;
                case 5: goto L_0x0852;
                case 6: goto L_0x0842;
                case 7: goto L_0x0831;
                case 8: goto L_0x0820;
                case 9: goto L_0x080b;
                case 10: goto L_0x07f8;
                case 11: goto L_0x07e7;
                case 12: goto L_0x07d6;
                case 13: goto L_0x07c5;
                case 14: goto L_0x07b4;
                case 15: goto L_0x07a3;
                case 16: goto L_0x0792;
                case 17: goto L_0x077d;
                case 18: goto L_0x076e;
                case 19: goto L_0x075f;
                case 20: goto L_0x0750;
                case 21: goto L_0x0741;
                case 22: goto L_0x0732;
                case 23: goto L_0x0723;
                case 24: goto L_0x0714;
                case 25: goto L_0x0705;
                case 26: goto L_0x06f6;
                case 27: goto L_0x06e3;
                case 28: goto L_0x06d4;
                case 29: goto L_0x06c5;
                case 30: goto L_0x06b6;
                case 31: goto L_0x06a7;
                case 32: goto L_0x0698;
                case 33: goto L_0x0689;
                case 34: goto L_0x067a;
                case 35: goto L_0x066b;
                case 36: goto L_0x065c;
                case 37: goto L_0x064d;
                case 38: goto L_0x063e;
                case 39: goto L_0x062f;
                case 40: goto L_0x0620;
                case 41: goto L_0x0611;
                case 42: goto L_0x0602;
                case 43: goto L_0x05f3;
                case 44: goto L_0x05e4;
                case 45: goto L_0x05d5;
                case 46: goto L_0x05c6;
                case 47: goto L_0x05b7;
                case 48: goto L_0x05a8;
                case 49: goto L_0x0595;
                case 50: goto L_0x058a;
                case 51: goto L_0x057c;
                case 52: goto L_0x056e;
                case 53: goto L_0x0560;
                case 54: goto L_0x0552;
                case 55: goto L_0x0544;
                case 56: goto L_0x0536;
                case 57: goto L_0x0528;
                case 58: goto L_0x051a;
                case 59: goto L_0x0512;
                case 60: goto L_0x050a;
                case 61: goto L_0x0502;
                case 62: goto L_0x04f4;
                case 63: goto L_0x04e6;
                case 64: goto L_0x04d8;
                case 65: goto L_0x04ca;
                case 66: goto L_0x04bc;
                case 67: goto L_0x04ae;
                case 68: goto L_0x04a6;
                default: goto L_0x04a4;
            }
        L_0x04a4:
            goto L_0x08b1
        L_0x04a6:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0783
        L_0x04ae:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = F(r13, r8)
            goto L_0x079e
        L_0x04bc:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = E(r13, r8)
            goto L_0x07af
        L_0x04ca:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = F(r13, r8)
            goto L_0x07c0
        L_0x04d8:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = E(r13, r8)
            goto L_0x07d1
        L_0x04e6:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = E(r13, r8)
            goto L_0x07e2
        L_0x04f4:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = E(r13, r8)
            goto L_0x07f3
        L_0x0502:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x07fe
        L_0x050a:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0811
        L_0x0512:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            goto L_0x0826
        L_0x051a:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = G(r13, r8)
            goto L_0x083d
        L_0x0528:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = E(r13, r8)
            goto L_0x084e
        L_0x0536:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = F(r13, r8)
            goto L_0x085e
        L_0x0544:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = E(r13, r8)
            goto L_0x086e
        L_0x0552:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = F(r13, r8)
            goto L_0x087e
        L_0x0560:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = F(r13, r8)
            goto L_0x088e
        L_0x056e:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = D(r13, r8)
            goto L_0x089e
        L_0x057c:
            boolean r9 = r12.p(r13, r10, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = C(r13, r8)
            goto L_0x08ae
        L_0x058a:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r8)
            r12.m(r14, r10, r8, r7)
            goto L_0x08b1
        L_0x0595:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            dn0 r10 = r12.w(r7)
            defpackage.fn0.h(r9, r8, r14, r10)
            goto L_0x08b1
        L_0x05a8:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.q(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05b7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.C(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05c6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.w(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05d5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.G(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05e4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.N(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x05f3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.A(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0602:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.P(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0611:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.E(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x0620:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.t(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x062f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.y(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x063e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.p(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x064d:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.m(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x065c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.i(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x066b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.c(r9, r8, r14, r4)
            goto L_0x08b1
        L_0x067a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.q(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0689:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.C(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0698:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.w(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06a7:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.G(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06b6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.N(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06c5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.A(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x06d4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.g(r9, r8, r14)
            goto L_0x08b1
        L_0x06e3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            dn0 r10 = r12.w(r7)
            defpackage.fn0.b(r9, r8, r14, r10)
            goto L_0x08b1
        L_0x06f6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.a(r9, r8, r14)
            goto L_0x08b1
        L_0x0705:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.P(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0714:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.E(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0723:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.t(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0732:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.y(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0741:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.p(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x0750:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.m(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x075f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.i(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x076e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.fn0.c(r9, r8, r14, r5)
            goto L_0x08b1
        L_0x077d:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0783:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r8)
            dn0 r9 = r12.w(r7)
            r14.A(r10, r8, r9)
            goto L_0x08b1
        L_0x0792:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = defpackage.bo0.w(r13, r8)
        L_0x079e:
            r14.b(r10, r8)
            goto L_0x08b1
        L_0x07a3:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = defpackage.bo0.u(r13, r8)
        L_0x07af:
            r14.I(r10, r8)
            goto L_0x08b1
        L_0x07b4:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = defpackage.bo0.w(r13, r8)
        L_0x07c0:
            r14.y(r10, r8)
            goto L_0x08b1
        L_0x07c5:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = defpackage.bo0.u(r13, r8)
        L_0x07d1:
            r14.H(r10, r8)
            goto L_0x08b1
        L_0x07d6:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = defpackage.bo0.u(r13, r8)
        L_0x07e2:
            r14.K(r10, r8)
            goto L_0x08b1
        L_0x07e7:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = defpackage.bo0.u(r13, r8)
        L_0x07f3:
            r14.E(r10, r8)
            goto L_0x08b1
        L_0x07f8:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x07fe:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r8)
            bk0 r8 = (defpackage.bk0) r8
            r14.M(r10, r8)
            goto L_0x08b1
        L_0x080b:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0811:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r8)
            dn0 r9 = r12.w(r7)
            r14.D(r10, r8, r9)
            goto L_0x08b1
        L_0x0820:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
        L_0x0826:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = defpackage.bo0.G(r13, r8)
            k(r10, r8, r14)
            goto L_0x08b1
        L_0x0831:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = defpackage.bo0.x(r13, r8)
        L_0x083d:
            r14.C(r10, r8)
            goto L_0x08b1
        L_0x0842:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = defpackage.bo0.u(r13, r8)
        L_0x084e:
            r14.z(r10, r8)
            goto L_0x08b1
        L_0x0852:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = defpackage.bo0.w(r13, r8)
        L_0x085e:
            r14.g(r10, r8)
            goto L_0x08b1
        L_0x0862:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = defpackage.bo0.u(r13, r8)
        L_0x086e:
            r14.O(r10, r8)
            goto L_0x08b1
        L_0x0872:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = defpackage.bo0.w(r13, r8)
        L_0x087e:
            r14.n(r10, r8)
            goto L_0x08b1
        L_0x0882:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = defpackage.bo0.w(r13, r8)
        L_0x088e:
            r14.J(r10, r8)
            goto L_0x08b1
        L_0x0892:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = defpackage.bo0.E(r13, r8)
        L_0x089e:
            r14.p(r10, r8)
            goto L_0x08b1
        L_0x08a2:
            boolean r9 = r12.o(r13, r7)
            if (r9 == 0) goto L_0x08b1
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = defpackage.bo0.F(r13, r8)
        L_0x08ae:
            r14.o(r10, r8)
        L_0x08b1:
            int r7 = r7 + 3
            goto L_0x0491
        L_0x08b5:
            rk0<?> r13 = r12.j
            r13.a(r0)
            throw r3
        L_0x08bb:
            if (r0 != 0) goto L_0x08c3
            vn0<?, ?> r0 = r12.i
            l(r0, r13, r14)
            return
        L_0x08c3:
            rk0<?> r13 = r12.j
            r13.b(r14, r0)
            throw r3
        L_0x08c9:
            r12.u(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.f(java.lang.Object, qo0):void");
    }

    public final void g(T t) {
        int i2;
        int i3 = this.f;
        while (true) {
            i2 = this.g;
            if (i3 >= i2) {
                break;
            }
            long y = (long) (y(this.e[i3]) & 1048575);
            Object G = bo0.G(t, y);
            if (G != null) {
                bo0.g(t, y, this.k.c(G));
            }
            i3++;
        }
        int length = this.e.length;
        while (i2 < length) {
            this.h.a(t, (long) this.e[i2]);
            i2++;
        }
        this.i.e(t);
        if (this.c) {
            this.j.f(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0256, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025f, code lost:
        r3 = defpackage.nk0.S(r3, (defpackage.pm0) defpackage.bo0.G(r1, r5), w(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0278, code lost:
        r3 = defpackage.nk0.f0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0287, code lost:
        r3 = defpackage.nk0.s0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0292, code lost:
        r3 = defpackage.nk0.i0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x029d, code lost:
        r3 = defpackage.nk0.x0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ac, code lost:
        r3 = defpackage.nk0.A0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bb, code lost:
        r3 = defpackage.nk0.q0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c6, code lost:
        r5 = defpackage.bo0.G(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ca, code lost:
        r3 = defpackage.nk0.R(r3, (defpackage.bk0) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d7, code lost:
        r3 = defpackage.fn0.j(r3, defpackage.bo0.G(r1, r5), w(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f1, code lost:
        if ((r5 instanceof defpackage.bk0) != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f4, code lost:
        r3 = defpackage.nk0.c0(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0302, code lost:
        r3 = defpackage.nk0.T(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x030e, code lost:
        r3 = defpackage.nk0.u0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031a, code lost:
        r3 = defpackage.nk0.g0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x032a, code lost:
        r3 = defpackage.nk0.p0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033a, code lost:
        r3 = defpackage.nk0.e0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x034a, code lost:
        r3 = defpackage.nk0.a0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0356, code lost:
        r3 = defpackage.nk0.E(r3, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0362, code lost:
        r3 = defpackage.nk0.D(r3, com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036a, code lost:
        r12 = r12 + 3;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03b8, code lost:
        if (p(r1, r15, r3) != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d8, code lost:
        if (p(r1, r15, r3) != false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03e0, code lost:
        if (p(r1, r15, r3) != false) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0400, code lost:
        if (p(r1, r15, r3) != false) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0408, code lost:
        if (p(r1, r15, r3) != false) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0418, code lost:
        if ((r4 instanceof defpackage.bk0) != false) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04b9, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c7, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04d5, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04e3, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04f1, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ff, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x050d, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x051a, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0527, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0534, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0541, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x054e, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x055b, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0568, code lost:
        if (r4 > 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x056a, code lost:
        r8 = (defpackage.nk0.u(r15) + defpackage.nk0.x(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0617, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0627, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x062c, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0632, code lost:
        if ((r12 & r11) != 0) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0634, code lost:
        r4 = defpackage.nk0.S(r15, (defpackage.pm0) r2.getObject(r1, r8), w(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x064b, code lost:
        r4 = defpackage.nk0.f0(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0658, code lost:
        r4 = defpackage.nk0.s0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x065f, code lost:
        if ((r12 & r11) != 0) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0661, code lost:
        r4 = defpackage.nk0.i0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x066a, code lost:
        if ((r12 & r11) != 0) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x066c, code lost:
        r8 = defpackage.nk0.x0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0671, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x067b, code lost:
        r4 = defpackage.nk0.A0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0688, code lost:
        r4 = defpackage.nk0.q0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x068f, code lost:
        if ((r12 & r11) != 0) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0691, code lost:
        r4 = r2.getObject(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0695, code lost:
        r4 = defpackage.nk0.R(r15, (defpackage.bk0) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x069e, code lost:
        if ((r12 & r11) != 0) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06a0, code lost:
        r4 = defpackage.fn0.j(r15, r2.getObject(r1, r8), w(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06b8, code lost:
        if ((r4 instanceof defpackage.bk0) != false) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06bb, code lost:
        r4 = defpackage.nk0.c0(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0718, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x073b, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if ((r5 instanceof defpackage.bk0) != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d1, code lost:
        r3 = (defpackage.nk0.u(r3) + defpackage.nk0.x(r5)) + r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.d
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0378
            sun.misc.Unsafe r2 = m
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0370
            int r14 = r0.y(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            xk0 r14 = defpackage.xk0.DOUBLE_LIST_PACKED
            int r14 = r14.id()
            if (r15 < r14) goto L_0x003f
            xk0 r14 = defpackage.xk0.SINT64_LIST_PACKED
            int r14 = r14.id()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.a
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x035c;
                case 1: goto L_0x0350;
                case 2: goto L_0x0340;
                case 3: goto L_0x0330;
                case 4: goto L_0x0320;
                case 5: goto L_0x0314;
                case 6: goto L_0x0308;
                case 7: goto L_0x02fc;
                case 8: goto L_0x02e5;
                case 9: goto L_0x02d1;
                case 10: goto L_0x02c0;
                case 11: goto L_0x02b1;
                case 12: goto L_0x02a2;
                case 13: goto L_0x0297;
                case 14: goto L_0x028c;
                case 15: goto L_0x027d;
                case 16: goto L_0x026e;
                case 17: goto L_0x0259;
                case 18: goto L_0x024e;
                case 19: goto L_0x0245;
                case 20: goto L_0x023c;
                case 21: goto L_0x0233;
                case 22: goto L_0x022a;
                case 23: goto L_0x024e;
                case 24: goto L_0x0245;
                case 25: goto L_0x0221;
                case 26: goto L_0x0218;
                case 27: goto L_0x020b;
                case 28: goto L_0x0202;
                case 29: goto L_0x01f9;
                case 30: goto L_0x01f0;
                case 31: goto L_0x0245;
                case 32: goto L_0x024e;
                case 33: goto L_0x01e7;
                case 34: goto L_0x01dd;
                case 35: goto L_0x01c5;
                case 36: goto L_0x01b8;
                case 37: goto L_0x01ab;
                case 38: goto L_0x019e;
                case 39: goto L_0x0191;
                case 40: goto L_0x0184;
                case 41: goto L_0x0177;
                case 42: goto L_0x016a;
                case 43: goto L_0x015c;
                case 44: goto L_0x014e;
                case 45: goto L_0x0140;
                case 46: goto L_0x0132;
                case 47: goto L_0x0124;
                case 48: goto L_0x0116;
                case 49: goto L_0x0108;
                case 50: goto L_0x00f8;
                case 51: goto L_0x00f0;
                case 52: goto L_0x00e8;
                case 53: goto L_0x00dc;
                case 54: goto L_0x00d0;
                case 55: goto L_0x00c4;
                case 56: goto L_0x00bc;
                case 57: goto L_0x00b4;
                case 58: goto L_0x00ac;
                case 59: goto L_0x009c;
                case 60: goto L_0x0094;
                case 61: goto L_0x008c;
                case 62: goto L_0x0080;
                case 63: goto L_0x0074;
                case 64: goto L_0x006c;
                case 65: goto L_0x0064;
                case 66: goto L_0x0058;
                case 67: goto L_0x004c;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x036a
        L_0x0044:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x025f
        L_0x004c:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = F(r1, r5)
            goto L_0x0278
        L_0x0058:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = E(r1, r5)
            goto L_0x0287
        L_0x0064:
            boolean r5 = r0.p(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0292
        L_0x006c:
            boolean r5 = r0.p(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x029d
        L_0x0074:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = E(r1, r5)
            goto L_0x02ac
        L_0x0080:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = E(r1, r5)
            goto L_0x02bb
        L_0x008c:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x02c6
        L_0x0094:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            goto L_0x02d7
        L_0x009c:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            java.lang.Object r5 = defpackage.bo0.G(r1, r5)
            boolean r6 = r5 instanceof defpackage.bk0
            if (r6 == 0) goto L_0x02f4
            goto L_0x02f3
        L_0x00ac:
            boolean r5 = r0.p(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0302
        L_0x00b4:
            boolean r5 = r0.p(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x030e
        L_0x00bc:
            boolean r5 = r0.p(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x031a
        L_0x00c4:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = E(r1, r5)
            goto L_0x032a
        L_0x00d0:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = F(r1, r5)
            goto L_0x033a
        L_0x00dc:
            boolean r14 = r0.p(r1, r3, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = F(r1, r5)
            goto L_0x034a
        L_0x00e8:
            boolean r5 = r0.p(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0356
        L_0x00f0:
            boolean r5 = r0.p(r1, r3, r12)
            if (r5 == 0) goto L_0x036a
            goto L_0x0362
        L_0x00f8:
            im0 r14 = r0.k
            java.lang.Object r5 = defpackage.bo0.G(r1, r5)
            java.lang.Object r6 = r0.x(r12)
            int r3 = r14.e(r3, r5, r6)
            goto L_0x0256
        L_0x0108:
            java.util.List r5 = B(r1, r5)
            dn0 r6 = r0.w(r12)
            int r3 = defpackage.fn0.o(r3, r5, r6)
            goto L_0x0256
        L_0x0116:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.x(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0124:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.F(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0132:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.O(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0140:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.M(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x014e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.z(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x015c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.D(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x016a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.R(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0177:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.M(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0184:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.O(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x0191:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.B(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x019e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.v(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01ab:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.s(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01b8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.M(r5)
            if (r5 <= 0) goto L_0x036a
            goto L_0x01d1
        L_0x01c5:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.fn0.O(r5)
            if (r5 <= 0) goto L_0x036a
        L_0x01d1:
            int r3 = defpackage.nk0.u(r3)
            int r6 = defpackage.nk0.x(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0256
        L_0x01dd:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.T(r3, r5, r11)
            goto L_0x0256
        L_0x01e7:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.Y(r3, r5, r11)
            goto L_0x0256
        L_0x01f0:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.V(r3, r5, r11)
            goto L_0x0256
        L_0x01f9:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.X(r3, r5, r11)
            goto L_0x0256
        L_0x0202:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.n(r3, r5)
            goto L_0x0256
        L_0x020b:
            java.util.List r5 = B(r1, r5)
            dn0 r6 = r0.w(r12)
            int r3 = defpackage.fn0.l(r3, r5, r6)
            goto L_0x0256
        L_0x0218:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.k(r3, r5)
            goto L_0x0256
        L_0x0221:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.b0(r3, r5, r11)
            goto L_0x0256
        L_0x022a:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.W(r3, r5, r11)
            goto L_0x0256
        L_0x0233:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.S(r3, r5, r11)
            goto L_0x0256
        L_0x023c:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.Q(r3, r5, r11)
            goto L_0x0256
        L_0x0245:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.Z(r3, r5, r11)
            goto L_0x0256
        L_0x024e:
            java.util.List r5 = B(r1, r5)
            int r3 = defpackage.fn0.a0(r3, r5, r11)
        L_0x0256:
            int r13 = r13 + r3
            goto L_0x036a
        L_0x0259:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
        L_0x025f:
            java.lang.Object r5 = defpackage.bo0.G(r1, r5)
            pm0 r5 = (defpackage.pm0) r5
            dn0 r6 = r0.w(r12)
            int r3 = defpackage.nk0.S(r3, r5, r6)
            goto L_0x0256
        L_0x026e:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = defpackage.bo0.w(r1, r5)
        L_0x0278:
            int r3 = defpackage.nk0.f0(r3, r5)
            goto L_0x0256
        L_0x027d:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = defpackage.bo0.u(r1, r5)
        L_0x0287:
            int r3 = defpackage.nk0.s0(r3, r5)
            goto L_0x0256
        L_0x028c:
            boolean r5 = r0.o(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0292:
            int r3 = defpackage.nk0.i0(r3, r9)
            goto L_0x0256
        L_0x0297:
            boolean r5 = r0.o(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x029d:
            int r3 = defpackage.nk0.x0(r3, r11)
            goto L_0x0256
        L_0x02a2:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = defpackage.bo0.u(r1, r5)
        L_0x02ac:
            int r3 = defpackage.nk0.A0(r3, r5)
            goto L_0x0256
        L_0x02b1:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = defpackage.bo0.u(r1, r5)
        L_0x02bb:
            int r3 = defpackage.nk0.q0(r3, r5)
            goto L_0x0256
        L_0x02c0:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
        L_0x02c6:
            java.lang.Object r5 = defpackage.bo0.G(r1, r5)
        L_0x02ca:
            bk0 r5 = (defpackage.bk0) r5
            int r3 = defpackage.nk0.R(r3, r5)
            goto L_0x0256
        L_0x02d1:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
        L_0x02d7:
            java.lang.Object r5 = defpackage.bo0.G(r1, r5)
            dn0 r6 = r0.w(r12)
            int r3 = defpackage.fn0.j(r3, r5, r6)
            goto L_0x0256
        L_0x02e5:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            java.lang.Object r5 = defpackage.bo0.G(r1, r5)
            boolean r6 = r5 instanceof defpackage.bk0
            if (r6 == 0) goto L_0x02f4
        L_0x02f3:
            goto L_0x02ca
        L_0x02f4:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = defpackage.nk0.c0(r3, r5)
            goto L_0x0256
        L_0x02fc:
            boolean r5 = r0.o(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0302:
            int r3 = defpackage.nk0.T(r3, r8)
            goto L_0x0256
        L_0x0308:
            boolean r5 = r0.o(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x030e:
            int r3 = defpackage.nk0.u0(r3, r11)
            goto L_0x0256
        L_0x0314:
            boolean r5 = r0.o(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x031a:
            int r3 = defpackage.nk0.g0(r3, r9)
            goto L_0x0256
        L_0x0320:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            int r5 = defpackage.bo0.u(r1, r5)
        L_0x032a:
            int r3 = defpackage.nk0.p0(r3, r5)
            goto L_0x0256
        L_0x0330:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = defpackage.bo0.w(r1, r5)
        L_0x033a:
            int r3 = defpackage.nk0.e0(r3, r5)
            goto L_0x0256
        L_0x0340:
            boolean r14 = r0.o(r1, r12)
            if (r14 == 0) goto L_0x036a
            long r5 = defpackage.bo0.w(r1, r5)
        L_0x034a:
            int r3 = defpackage.nk0.a0(r3, r5)
            goto L_0x0256
        L_0x0350:
            boolean r5 = r0.o(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0356:
            int r3 = defpackage.nk0.E(r3, r4)
            goto L_0x0256
        L_0x035c:
            boolean r5 = r0.o(r1, r12)
            if (r5 == 0) goto L_0x036a
        L_0x0362:
            r5 = 0
            int r3 = defpackage.nk0.D(r3, r5)
            goto L_0x0256
        L_0x036a:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0370:
            vn0<?, ?> r2 = r0.i
            int r1 = a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x0378:
            sun.misc.Unsafe r2 = m
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0380:
            int[] r13 = r0.a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0746
            int r13 = r0.y(r3)
            int[] r14 = r0.a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03ab
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r6) goto L_0x03ac
            long r8 = (long) r14
            int r6 = r2.getInt(r1, r8)
            r12 = r6
            r6 = r14
            goto L_0x03ac
        L_0x03ab:
            r11 = 0
        L_0x03ac:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x072b;
                case 1: goto L_0x071a;
                case 2: goto L_0x0709;
                case 3: goto L_0x06f9;
                case 4: goto L_0x06e9;
                case 5: goto L_0x06dc;
                case 6: goto L_0x06cf;
                case 7: goto L_0x06c3;
                case 8: goto L_0x06ae;
                case 9: goto L_0x069c;
                case 10: goto L_0x068d;
                case 11: goto L_0x0680;
                case 12: goto L_0x0673;
                case 13: goto L_0x0668;
                case 14: goto L_0x065d;
                case 15: goto L_0x0650;
                case 16: goto L_0x0643;
                case 17: goto L_0x0630;
                case 18: goto L_0x061c;
                case 19: goto L_0x060c;
                case 20: goto L_0x0600;
                case 21: goto L_0x05f4;
                case 22: goto L_0x05e8;
                case 23: goto L_0x05dc;
                case 24: goto L_0x060c;
                case 25: goto L_0x05d0;
                case 26: goto L_0x05c5;
                case 27: goto L_0x05b6;
                case 28: goto L_0x05aa;
                case 29: goto L_0x059d;
                case 30: goto L_0x0590;
                case 31: goto L_0x060c;
                case 32: goto L_0x05dc;
                case 33: goto L_0x0583;
                case 34: goto L_0x0576;
                case 35: goto L_0x055e;
                case 36: goto L_0x0551;
                case 37: goto L_0x0544;
                case 38: goto L_0x0537;
                case 39: goto L_0x052a;
                case 40: goto L_0x051d;
                case 41: goto L_0x0510;
                case 42: goto L_0x0503;
                case 43: goto L_0x04f5;
                case 44: goto L_0x04e7;
                case 45: goto L_0x04d9;
                case 46: goto L_0x04cb;
                case 47: goto L_0x04bd;
                case 48: goto L_0x04af;
                case 49: goto L_0x049f;
                case 50: goto L_0x048f;
                case 51: goto L_0x0481;
                case 52: goto L_0x0474;
                case 53: goto L_0x0464;
                case 54: goto L_0x0454;
                case 55: goto L_0x0444;
                case 56: goto L_0x0436;
                case 57: goto L_0x0429;
                case 58: goto L_0x041c;
                case 59: goto L_0x040c;
                case 60: goto L_0x0404;
                case 61: goto L_0x03fc;
                case 62: goto L_0x03f0;
                case 63: goto L_0x03e4;
                case 64: goto L_0x03dc;
                case 65: goto L_0x03d4;
                case 66: goto L_0x03c8;
                case 67: goto L_0x03bc;
                case 68: goto L_0x03b4;
                default: goto L_0x03b2;
            }
        L_0x03b2:
            goto L_0x0628
        L_0x03b4:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x0634
        L_0x03bc:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            long r8 = F(r1, r8)
            goto L_0x064b
        L_0x03c8:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = E(r1, r8)
            goto L_0x0658
        L_0x03d4:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x0661
        L_0x03dc:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x066c
        L_0x03e4:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = E(r1, r8)
            goto L_0x067b
        L_0x03f0:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = E(r1, r8)
            goto L_0x0688
        L_0x03fc:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x0691
        L_0x0404:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            goto L_0x06a0
        L_0x040c:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof defpackage.bk0
            if (r8 == 0) goto L_0x06bb
            goto L_0x06ba
        L_0x041c:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r4 = 1
            int r8 = defpackage.nk0.T(r15, r4)
            goto L_0x0671
        L_0x0429:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r4 = 0
            int r8 = defpackage.nk0.u0(r15, r4)
            goto L_0x0671
        L_0x0436:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r8 = 0
            int r4 = defpackage.nk0.g0(r15, r8)
            goto L_0x0627
        L_0x0444:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            int r4 = E(r1, r8)
            int r4 = defpackage.nk0.p0(r15, r4)
            goto L_0x0627
        L_0x0454:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            long r8 = F(r1, r8)
            int r4 = defpackage.nk0.e0(r15, r8)
            goto L_0x0627
        L_0x0464:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            long r8 = F(r1, r8)
            int r4 = defpackage.nk0.a0(r15, r8)
            goto L_0x0627
        L_0x0474:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r4 = 0
            int r8 = defpackage.nk0.E(r15, r4)
            goto L_0x0671
        L_0x0481:
            boolean r4 = r0.p(r1, r15, r3)
            if (r4 == 0) goto L_0x0628
            r8 = 0
            int r4 = defpackage.nk0.D(r15, r8)
            goto L_0x0627
        L_0x048f:
            im0 r4 = r0.k
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.x(r3)
            int r4 = r4.e(r15, r8, r9)
            goto L_0x0627
        L_0x049f:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            dn0 r8 = r0.w(r3)
            int r4 = defpackage.fn0.o(r15, r4, r8)
            goto L_0x0627
        L_0x04af:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.x(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04bd:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.F(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04cb:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.O(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04d9:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.M(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04e7:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.z(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x04f5:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.D(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0503:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.R(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0510:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.M(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x051d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.O(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x052a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.B(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0537:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.v(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0544:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.s(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x0551:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.M(r4)
            if (r4 <= 0) goto L_0x0628
            goto L_0x056a
        L_0x055e:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.O(r4)
            if (r4 <= 0) goto L_0x0628
        L_0x056a:
            int r8 = defpackage.nk0.u(r15)
            int r9 = defpackage.nk0.x(r4)
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x0671
        L_0x0576:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = defpackage.fn0.T(r15, r4, r10)
            goto L_0x0617
        L_0x0583:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.Y(r15, r4, r10)
            goto L_0x0617
        L_0x0590:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.V(r15, r4, r10)
            goto L_0x0617
        L_0x059d:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.X(r15, r4, r10)
            goto L_0x0627
        L_0x05aa:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.n(r15, r4)
            goto L_0x0627
        L_0x05b6:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            dn0 r8 = r0.w(r3)
            int r4 = defpackage.fn0.l(r15, r4, r8)
            goto L_0x0627
        L_0x05c5:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.k(r15, r4)
            goto L_0x0627
        L_0x05d0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = defpackage.fn0.b0(r15, r4, r10)
            goto L_0x0617
        L_0x05dc:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.a0(r15, r4, r10)
            goto L_0x0617
        L_0x05e8:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.W(r15, r4, r10)
            goto L_0x0617
        L_0x05f4:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.S(r15, r4, r10)
            goto L_0x0617
        L_0x0600:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.Q(r15, r4, r10)
            goto L_0x0617
        L_0x060c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.Z(r15, r4, r10)
        L_0x0617:
            int r5 = r5 + r4
            r4 = 1
        L_0x0619:
            r7 = 0
            goto L_0x062c
        L_0x061c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.fn0.a0(r15, r4, r10)
        L_0x0627:
            int r5 = r5 + r4
        L_0x0628:
            r4 = 1
        L_0x0629:
            r7 = 0
            r10 = 0
        L_0x062c:
            r13 = 0
            goto L_0x073b
        L_0x0630:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x0634:
            java.lang.Object r4 = r2.getObject(r1, r8)
            pm0 r4 = (defpackage.pm0) r4
            dn0 r8 = r0.w(r3)
            int r4 = defpackage.nk0.S(r15, r4, r8)
            goto L_0x0627
        L_0x0643:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            long r8 = r2.getLong(r1, r8)
        L_0x064b:
            int r4 = defpackage.nk0.f0(r15, r8)
            goto L_0x0627
        L_0x0650:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            int r4 = r2.getInt(r1, r8)
        L_0x0658:
            int r4 = defpackage.nk0.s0(r15, r4)
            goto L_0x0627
        L_0x065d:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x0661:
            r8 = 0
            int r4 = defpackage.nk0.i0(r15, r8)
            goto L_0x0627
        L_0x0668:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x066c:
            r4 = 0
            int r8 = defpackage.nk0.x0(r15, r4)
        L_0x0671:
            int r5 = r5 + r8
            goto L_0x0628
        L_0x0673:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            int r4 = r2.getInt(r1, r8)
        L_0x067b:
            int r4 = defpackage.nk0.A0(r15, r4)
            goto L_0x0627
        L_0x0680:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            int r4 = r2.getInt(r1, r8)
        L_0x0688:
            int r4 = defpackage.nk0.q0(r15, r4)
            goto L_0x0627
        L_0x068d:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x0691:
            java.lang.Object r4 = r2.getObject(r1, r8)
        L_0x0695:
            bk0 r4 = (defpackage.bk0) r4
            int r4 = defpackage.nk0.R(r15, r4)
            goto L_0x0627
        L_0x069c:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
        L_0x06a0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            dn0 r8 = r0.w(r3)
            int r4 = defpackage.fn0.j(r15, r4, r8)
            goto L_0x0627
        L_0x06ae:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof defpackage.bk0
            if (r8 == 0) goto L_0x06bb
        L_0x06ba:
            goto L_0x0695
        L_0x06bb:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = defpackage.nk0.c0(r15, r4)
            goto L_0x0627
        L_0x06c3:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x0628
            r4 = 1
            int r8 = defpackage.nk0.T(r15, r4)
            int r5 = r5 + r8
            goto L_0x0629
        L_0x06cf:
            r4 = 1
            r8 = r12 & r11
            r10 = 0
            if (r8 == 0) goto L_0x0619
            int r8 = defpackage.nk0.u0(r15, r10)
            int r5 = r5 + r8
            goto L_0x0619
        L_0x06dc:
            r4 = 1
            r10 = 0
            r8 = r12 & r11
            r13 = 0
            if (r8 == 0) goto L_0x0728
            int r8 = defpackage.nk0.g0(r15, r13)
            goto L_0x0718
        L_0x06e9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0728
            int r8 = r2.getInt(r1, r8)
            int r8 = defpackage.nk0.p0(r15, r8)
            goto L_0x0718
        L_0x06f9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0728
            long r8 = r2.getLong(r1, r8)
            int r8 = defpackage.nk0.e0(r15, r8)
            goto L_0x0718
        L_0x0709:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0728
            long r8 = r2.getLong(r1, r8)
            int r8 = defpackage.nk0.a0(r15, r8)
        L_0x0718:
            int r5 = r5 + r8
            goto L_0x0728
        L_0x071a:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0728
            r8 = 0
            int r9 = defpackage.nk0.E(r15, r8)
            int r5 = r5 + r9
        L_0x0728:
            r7 = 0
            goto L_0x073b
        L_0x072b:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r11
            if (r9 == 0) goto L_0x0728
            r7 = 0
            int r11 = defpackage.nk0.D(r15, r7)
            int r5 = r5 + r11
        L_0x073b:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x0380
        L_0x0746:
            r10 = 0
            vn0<?, ?> r2 = r0.i
            int r2 = a(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.c
            if (r2 == 0) goto L_0x07a0
            rk0<?> r2 = r0.j
            wk0 r1 = r2.c(r1)
            r11 = 0
        L_0x0759:
            in0<T, java.lang.Object> r2 = r1.a
            int r2 = r2.m()
            if (r11 >= r2) goto L_0x0779
            in0<T, java.lang.Object> r2 = r1.a
            java.util.Map$Entry r2 = r2.h(r11)
            java.lang.Object r3 = r2.getKey()
            yk0 r3 = (defpackage.yk0) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = defpackage.wk0.k(r3, r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0759
        L_0x0779:
            in0<T, java.lang.Object> r1 = r1.a
            java.lang.Iterable r1 = r1.n()
            java.util.Iterator r1 = r1.iterator()
        L_0x0783:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x079f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            yk0 r3 = (defpackage.yk0) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = defpackage.wk0.k(r3, r2)
            int r10 = r10 + r2
            goto L_0x0783
        L_0x079f:
            int r5 = r5 + r10
        L_0x07a0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm0.h(java.lang.Object):int");
    }
}
