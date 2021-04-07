package defpackage;

import java.nio.charset.Charset;

/* renamed from: kk0  reason: default package */
class kk0 extends hk0 {
    protected final byte[] h;

    kk0(byte[] bArr) {
        if (bArr != null) {
            this.h = bArr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.h, r(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void c(xj0 xj0) {
        xj0.a(this.h, r(), size());
    }

    public byte d(int i) {
        return this.h[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bk0) || size() != ((bk0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof kk0)) {
            return obj.equals(this);
        }
        kk0 kk0 = (kk0) obj;
        int o = o();
        int o2 = kk0.o();
        if (o == 0 || o2 == 0 || o == o2) {
            return p(kk0, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public byte g(int i) {
        return this.h[i];
    }

    /* access modifiers changed from: protected */
    public final int j(int i, int i2, int i3) {
        return gl0.c(i, this.h, r(), i3);
    }

    public final bk0 l(int i, int i2) {
        int k = bk0.k(0, i2, size());
        return k == 0 ? bk0.f : new dk0(this.h, r(), k);
    }

    public final boolean n() {
        int r = r();
        return fo0.f(this.h, r, size() + r);
    }

    /* access modifiers changed from: package-private */
    public final boolean p(bk0 bk0, int i, int i2) {
        if (i2 > bk0.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > bk0.size()) {
            int size2 = bk0.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(bk0 instanceof kk0)) {
            return bk0.l(0, i2).equals(l(0, i2));
        } else {
            kk0 kk0 = (kk0) bk0;
            byte[] bArr = this.h;
            byte[] bArr2 = kk0.h;
            int r = r() + i2;
            int r2 = r();
            int r3 = kk0.r();
            while (r2 < r) {
                if (bArr[r2] != bArr2[r3]) {
                    return false;
                }
                r2++;
                r3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int r() {
        return 0;
    }

    public int size() {
        return this.h.length;
    }
}
