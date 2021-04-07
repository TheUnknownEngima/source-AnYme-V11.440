package defpackage;

/* renamed from: dk0  reason: default package */
final class dk0 extends kk0 {
    private final int i;
    private final int j;

    dk0(byte[] bArr, int i2, int i3) {
        super(bArr);
        bk0.k(i2, i2 + i3, bArr.length);
        this.i = i2;
        this.j = i3;
    }

    public final byte d(int i2) {
        int size = size();
        if (((size - (i2 + 1)) | i2) >= 0) {
            return this.h[this.i + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public final byte g(int i2) {
        return this.h[this.i + i2];
    }

    /* access modifiers changed from: protected */
    public final int r() {
        return this.i;
    }

    public final int size() {
        return this.j;
    }
}
