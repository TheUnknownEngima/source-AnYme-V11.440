package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: pv0  reason: default package */
final class pv0 {
    static int a(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    static int b(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    static int c(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i2;
        int i3;
        int b = rv0.b(obj);
        int i4 = b & i;
        int b2 = b(obj3, i4);
        if (b2 == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = b & i5;
        int i7 = -1;
        while (true) {
            i2 = b2 - 1;
            i3 = iArr[i2];
            if ((i3 & i5) != i6 || !ru0.a(obj, objArr[i2]) || (objArr2 != null && !ru0.a(obj2, objArr2[i2]))) {
                int i8 = i3 & i;
                if (i8 == 0) {
                    return -1;
                }
                int i9 = i8;
                i7 = i2;
                b2 = i9;
            }
        }
        int i10 = i3 & i;
        if (i7 == -1) {
            e(obj3, i4, i10);
        } else {
            iArr[i7] = a(iArr[i7], i10, i);
        }
        return i2;
    }

    static Object d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    static void e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    static int f(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }
}
