package defpackage;

/* renamed from: h50  reason: default package */
public final class h50 {
    public byte[] a;
    private int b;
    private int c;
    private int d;

    public h50() {
        this.a = v50.f;
    }

    public h50(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public h50(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            defpackage.q40.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h50.a():void");
    }

    public int b() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public void c() {
        if (this.c != 0) {
            this.c = 0;
            this.b++;
            a();
        }
    }

    public int d() {
        q40.f(this.c == 0);
        return this.b;
    }

    public int e() {
        return (this.b * 8) + this.c;
    }

    public void f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.c, i2);
        int i3 = this.c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.a;
        int i5 = this.b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        q(i2);
        a();
    }

    public boolean g() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        p();
        return z;
    }

    public int h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        a();
        return i7;
    }

    public void i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.c;
            bArr[i] = (byte) (b2 << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.c;
            if (i8 + i7 > 8) {
                byte b3 = bArr[i3];
                byte[] bArr3 = this.a;
                int i9 = this.b;
                this.b = i9 + 1;
                bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                this.c = i8 - 8;
            }
            int i10 = this.c + i7;
            this.c = i10;
            byte[] bArr4 = this.a;
            int i11 = this.b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.c = 0;
                this.b = i11 + 1;
            }
            a();
        }
    }

    public long j(int i) {
        return i <= 32 ? v50.H0(h(i)) : v50.F0(h(i - 32), h(32));
    }

    public void k(byte[] bArr, int i, int i2) {
        q40.f(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
        a();
    }

    public void l(i50 i50) {
        n(i50.a, i50.d());
        o(i50.c() * 8);
    }

    public void m(byte[] bArr) {
        n(bArr, bArr.length);
    }

    public void n(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public void o(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public void p() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        a();
    }

    public void q(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public void r(int i) {
        q40.f(this.c == 0);
        this.b += i;
        a();
    }
}
