package defpackage;

/* renamed from: rx0  reason: default package */
final class rx0 extends ux0 {
    private final int i;
    private final int j;

    rx0(byte[] bArr, int i2, int i3) {
        super(bArr);
        lx0.m(i2, i2 + i3, bArr.length);
        this.i = i2;
        this.j = i3;
    }

    public final byte a(int i2) {
        int c = c();
        if (((c - (i2 + 1)) | i2) >= 0) {
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
        sb2.append(c);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int c() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final byte l(int i2) {
        return this.h[this.i + i2];
    }

    /* access modifiers changed from: protected */
    public final int u() {
        return this.i;
    }
}
