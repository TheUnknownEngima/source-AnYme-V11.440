package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: tc2  reason: default package */
class tc2 {
    private static final int[] b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] c = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    private static final tc2 d = new tc2();
    private final a a = new a();

    /* renamed from: tc2$a */
    private static final class a {
        final a[] a;
        final int b;
        final int c;

        a() {
            this.a = new a[256];
            this.b = 0;
            this.c = 0;
        }

        a(int i, int i2) {
            this.a = null;
            this.b = i;
            int i3 = i2 & 7;
            this.c = i3 == 0 ? 8 : i3;
        }
    }

    private tc2() {
        b();
    }

    private void a(int i, int i2, byte b2) {
        a aVar = new a(i, b2);
        a aVar2 = this.a;
        while (b2 > 8) {
            b2 = (byte) (b2 - 8);
            int i3 = (i2 >>> b2) & 255;
            a[] aVarArr = aVar2.a;
            if (aVarArr != null) {
                if (aVarArr[i3] == null) {
                    aVarArr[i3] = new a();
                }
                aVar2 = aVar2.a[i3];
            } else {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
        }
        int i4 = 8 - b2;
        int i5 = (i2 << i4) & 255;
        int i6 = 1 << i4;
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            aVar2.a[i7] = aVar;
        }
    }

    private void b() {
        int i = 0;
        while (true) {
            byte[] bArr = c;
            if (i < bArr.length) {
                a(i, b[i], bArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public static tc2 f() {
        return d;
    }

    /* access modifiers changed from: package-private */
    public byte[] c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a aVar = this.a;
        byte b2 = 0;
        int i = 0;
        for (byte b3 : bArr) {
            b2 = (b2 << 8) | (b3 & 255);
            i += 8;
            while (i >= 8) {
                aVar = aVar.a[(b2 >>> (i - 8)) & 255];
                if (aVar.a == null) {
                    byteArrayOutputStream.write(aVar.b);
                    i -= aVar.c;
                    aVar = this.a;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            a aVar2 = aVar.a[(b2 << (8 - i)) & 255];
            if (aVar2.a != null || aVar2.c > i) {
                break;
            }
            byteArrayOutputStream.write(aVar2.b);
            i -= aVar2.c;
            aVar = this.a;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.qd2 r8, defpackage.od2 r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = 0
        L_0x0005:
            int r4 = r8.A()
            r5 = 255(0xff, float:3.57E-43)
            if (r0 >= r4) goto L_0x002e
            byte r4 = r8.q(r0)
            r4 = r4 & r5
            int[] r5 = b
            r5 = r5[r4]
            byte[] r6 = c
            byte r4 = r6[r4]
            long r2 = r2 << r4
            long r5 = (long) r5
            long r2 = r2 | r5
            int r1 = r1 + r4
        L_0x001e:
            r4 = 8
            if (r1 < r4) goto L_0x002b
            int r1 = r1 + -8
            long r4 = r2 >> r1
            int r5 = (int) r4
            r9.w(r5)
            goto L_0x001e
        L_0x002b:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x002e:
            if (r1 <= 0) goto L_0x003b
            int r8 = 8 - r1
            long r2 = r2 << r8
            int r8 = r5 >>> r1
            long r0 = (long) r8
            long r0 = r0 | r2
            int r8 = (int) r0
            r9.w(r8)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc2.d(qd2, od2):void");
    }

    /* access modifiers changed from: package-private */
    public int e(qd2 qd2) {
        long j = 0;
        for (int i = 0; i < qd2.A(); i++) {
            j += (long) c[qd2.q(i) & 255];
        }
        return (int) ((j + 7) >> 3);
    }
}
