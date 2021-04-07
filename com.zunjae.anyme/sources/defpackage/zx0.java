package defpackage;

/* renamed from: zx0  reason: default package */
final class zx0 extends wx0 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    private zx0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.e = Integer.MAX_VALUE;
        this.a = i2 + i;
        this.c = i;
        this.d = i;
    }

    private final void f() {
        int i = this.a + this.b;
        this.a = i;
        int i2 = i - this.d;
        int i3 = this.e;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.b = i4;
            this.a = i - i4;
            return;
        }
        this.b = 0;
    }

    public final int d(int i) {
        if (i >= 0) {
            int e2 = i + e();
            int i2 = this.e;
            if (e2 <= i2) {
                this.e = e2;
                f();
                return i2;
            }
            throw ez0.a();
        }
        throw ez0.b();
    }

    public final int e() {
        return this.c - this.d;
    }
}
