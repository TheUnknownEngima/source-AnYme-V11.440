package defpackage;

/* renamed from: qu  reason: default package */
final class qu {
    private static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] a = new byte[8];
    private int b;
    private int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int c(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public int b() {
        return this.c;
    }

    public long d(it itVar, boolean z, boolean z2, int i) {
        if (this.b == 0) {
            if (!itVar.b(this.a, 0, 1, z)) {
                return -1;
            }
            int c2 = c(this.a[0] & 255);
            this.c = c2;
            if (c2 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.c;
        if (i2 > i) {
            this.b = 0;
            return -2;
        }
        if (i2 != 1) {
            itVar.readFully(this.a, 1, i2 - 1);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
    }
}
