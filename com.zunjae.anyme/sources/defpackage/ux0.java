package defpackage;

import java.nio.charset.Charset;

/* renamed from: ux0  reason: default package */
class ux0 extends vx0 {
    protected final byte[] h;

    ux0(byte[] bArr) {
        if (bArr != null) {
            this.h = bArr;
            return;
        }
        throw null;
    }

    public byte a(int i) {
        return this.h[i];
    }

    public int c() {
        return this.h.length;
    }

    /* access modifiers changed from: protected */
    public final int d(int i, int i2, int i3) {
        return uy0.a(i, this.h, u(), i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lx0) || c() != ((lx0) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof ux0)) {
            return obj.equals(this);
        }
        ux0 ux0 = (ux0) obj;
        int r = r();
        int r2 = ux0.r();
        if (r == 0 || r2 == 0 || r == r2) {
            return t(ux0, 0, c());
        }
        return false;
    }

    public final lx0 g(int i, int i2) {
        int m = lx0.m(0, i2, c());
        return m == 0 ? lx0.f : new rx0(this.h, u(), m);
    }

    /* access modifiers changed from: protected */
    public final String j(Charset charset) {
        return new String(this.h, u(), c(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void k(mx0 mx0) {
        mx0.a(this.h, u(), c());
    }

    /* access modifiers changed from: package-private */
    public byte l(int i) {
        return this.h[i];
    }

    public final boolean p() {
        int u = u();
        return v11.g(this.h, u, c() + u);
    }

    /* access modifiers changed from: package-private */
    public final boolean t(lx0 lx0, int i, int i2) {
        if (i2 > lx0.c()) {
            int c = c();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > lx0.c()) {
            int c2 = lx0.c();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(c2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(lx0 instanceof ux0)) {
            return lx0.g(0, i2).equals(g(0, i2));
        } else {
            ux0 ux0 = (ux0) lx0;
            byte[] bArr = this.h;
            byte[] bArr2 = ux0.h;
            int u = u() + i2;
            int u2 = u();
            int u3 = ux0.u();
            while (u2 < u) {
                if (bArr[u2] != bArr2[u3]) {
                    return false;
                }
                u2++;
                u3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int u() {
        return 0;
    }
}
