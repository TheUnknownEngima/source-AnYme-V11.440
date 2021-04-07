package defpackage;

/* renamed from: ok0  reason: default package */
final class ok0 extends mk0 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    private ok0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.e = Integer.MAX_VALUE;
        this.a = i2 + i;
        this.c = i;
        this.d = i;
    }

    public final int b(int i) {
        if (i >= 0) {
            int c2 = i + c();
            int i2 = this.e;
            if (c2 <= i2) {
                this.e = c2;
                int i3 = this.a + this.b;
                this.a = i3;
                int i4 = i3 - this.d;
                if (i4 > c2) {
                    int i5 = i4 - c2;
                    this.b = i5;
                    this.a = i3 - i5;
                } else {
                    this.b = 0;
                }
                return i2;
            }
            throw new ol0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new ol0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int c() {
        return this.c - this.d;
    }
}
