package defpackage;

import java.util.Arrays;

/* renamed from: be2  reason: default package */
final class be2 extends qd2 {
    final transient byte[][] j;
    final transient int[] k;

    be2(nd2 nd2, int i) {
        super((byte[]) null);
        fe2.b(nd2.f, 0, (long) i);
        zd2 zd2 = nd2.e;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = zd2.c;
            int i6 = zd2.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                zd2 = zd2.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.j = new byte[i4][];
        this.k = new int[(i4 * 2)];
        zd2 zd22 = nd2.e;
        int i7 = 0;
        while (i2 < i) {
            this.j[i7] = zd22.a;
            i2 += zd22.c - zd22.b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.k;
            iArr[i7] = i2;
            iArr[this.j.length + i7] = zd22.b;
            zd22.d = true;
            i7++;
            zd22 = zd22.f;
        }
    }

    private int I(int i) {
        int binarySearch = Arrays.binarySearch(this.k, 0, this.j.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private qd2 J() {
        return new qd2(F());
    }

    public int A() {
        return this.k[this.j.length - 1];
    }

    public qd2 C(int i, int i2) {
        return J().C(i, i2);
    }

    public qd2 E() {
        return J().E();
    }

    public byte[] F() {
        int[] iArr = this.k;
        byte[][] bArr = this.j;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.k;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.j[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public String G() {
        return J().G();
    }

    /* access modifiers changed from: package-private */
    public void H(nd2 nd2) {
        int length = this.j.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.k;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            zd2 zd2 = new zd2(this.j[i], i3, (i3 + i4) - i2, true, false);
            zd2 zd22 = nd2.e;
            if (zd22 == null) {
                zd2.g = zd2;
                zd2.f = zd2;
                nd2.e = zd2;
            } else {
                zd22.g.c(zd2);
            }
            i++;
            i2 = i4;
        }
        nd2.f += (long) i2;
    }

    public String a() {
        return J().a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qd2) {
            qd2 qd2 = (qd2) obj;
            return qd2.A() == A() && v(0, qd2, 0, A());
        }
    }

    public int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int length = this.j.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.j[i2];
            int[] iArr = this.k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f = i4;
        return i4;
    }

    public byte q(int i) {
        fe2.b((long) this.k[this.j.length - 1], (long) i, 1);
        int I = I(i);
        int i2 = I == 0 ? 0 : this.k[I - 1];
        int[] iArr = this.k;
        byte[][] bArr = this.j;
        return bArr[I][(i - i2) + iArr[bArr.length + I]];
    }

    public String r() {
        return J().r();
    }

    public qd2 s() {
        return J().s();
    }

    public String toString() {
        return J().toString();
    }

    public boolean v(int i, qd2 qd2, int i2, int i3) {
        if (i < 0 || i > A() - i3) {
            return false;
        }
        int I = I(i);
        while (i3 > 0) {
            int i4 = I == 0 ? 0 : this.k[I - 1];
            int min = Math.min(i3, ((this.k[I] - i4) + i4) - i);
            int[] iArr = this.k;
            byte[][] bArr = this.j;
            if (!qd2.w(i2, bArr[I], (i - i4) + iArr[bArr.length + I], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            I++;
        }
        return true;
    }

    public boolean w(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > A() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int I = I(i);
        while (i3 > 0) {
            int i4 = I == 0 ? 0 : this.k[I - 1];
            int min = Math.min(i3, ((this.k[I] - i4) + i4) - i);
            int[] iArr = this.k;
            byte[][] bArr2 = this.j;
            if (!fe2.a(bArr2[I], (i - i4) + iArr[bArr2.length + I], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            I++;
        }
        return true;
    }

    public qd2 x() {
        return J().x();
    }

    public qd2 z() {
        return J().z();
    }
}
