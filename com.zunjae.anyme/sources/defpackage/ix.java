package defpackage;

/* renamed from: ix  reason: default package */
public final class ix {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(i50 i50, int i, int i2) {
        i50.M(i);
        if (i50.a() < 5) {
            return -9223372036854775807L;
        }
        int k = i50.k();
        if ((8388608 & k) != 0 || ((2096896 & k) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((k & 32) != 0) && i50.z() >= 7 && i50.a() >= 7) {
            if ((i50.z() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                i50.h(bArr, 0, 6);
                return c(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long c(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
