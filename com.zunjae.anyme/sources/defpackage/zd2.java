package defpackage;

import javax.annotation.Nullable;

/* renamed from: zd2  reason: default package */
final class zd2 {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    zd2 f;
    zd2 g;

    zd2() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    zd2(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final void a() {
        zd2 zd2 = this.g;
        if (zd2 == this) {
            throw new IllegalStateException();
        } else if (zd2.e) {
            int i = this.c - this.b;
            if (i <= (8192 - zd2.c) + (zd2.d ? 0 : zd2.b)) {
                f(this.g, i);
                b();
                ae2.a(this);
            }
        }
    }

    @Nullable
    public final zd2 b() {
        zd2 zd2 = this.f;
        if (zd2 == this) {
            zd2 = null;
        }
        zd2 zd22 = this.g;
        zd22.f = this.f;
        this.f.g = zd22;
        this.f = null;
        this.g = null;
        return zd2;
    }

    public final zd2 c(zd2 zd2) {
        zd2.g = this;
        zd2.f = this.f;
        this.f.g = zd2;
        this.f = zd2;
        return zd2;
    }

    /* access modifiers changed from: package-private */
    public final zd2 d() {
        this.d = true;
        return new zd2(this.a, this.b, this.c, true, false);
    }

    public final zd2 e(int i) {
        zd2 zd2;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            zd2 = d();
        } else {
            zd2 = ae2.b();
            System.arraycopy(this.a, this.b, zd2.a, 0, i);
        }
        zd2.c = zd2.b + i;
        this.b += i;
        this.g.c(zd2);
        return zd2;
    }

    public final void f(zd2 zd2, int i) {
        if (zd2.e) {
            int i2 = zd2.c;
            if (i2 + i > 8192) {
                if (!zd2.d) {
                    int i3 = zd2.b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = zd2.a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        zd2.c -= zd2.b;
                        zd2.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, zd2.a, zd2.c, i);
            zd2.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
