package defpackage;

/* renamed from: wx0  reason: default package */
public abstract class wx0 {
    private wx0() {
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static wx0 b(byte[] bArr, int i, int i2, boolean z) {
        zx0 zx0 = new zx0(bArr, i2);
        try {
            zx0.d(i2);
            return zx0;
        } catch (ez0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}
