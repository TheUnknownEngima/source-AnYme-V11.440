package defpackage;

import defpackage.xv;
import java.util.Arrays;

/* renamed from: rv  reason: default package */
final class rv extends xv {
    /* access modifiers changed from: private */
    public y40 n;
    private a o;

    /* renamed from: rv$a */
    private class a implements vv {
        private long a = -1;
        private long b = -1;

        public a() {
        }

        public tt a() {
            q40.f(this.a != -1);
            return new ot(rv.this.n, this.a);
        }

        public long b(it itVar) {
            long j = this.b;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.b = -1;
            return j2;
        }

        public void c(long j) {
            q40.e(rv.this.n.k);
            long[] jArr = rv.this.n.k.a;
            this.b = jArr[v50.f(jArr, j, true, true)];
        }

        public void d(long j) {
            this.a = j;
        }
    }

    rv() {
    }

    private int m(i50 i50) {
        int i = (i50.a[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            i50.N(4);
            i50.G();
        }
        int j = mt.j(i50, i);
        i50.M(0);
        return j;
    }

    private static boolean n(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean o(i50 i50) {
        return i50.a() >= 5 && i50.z() == 127 && i50.B() == 1179402563;
    }

    /* access modifiers changed from: protected */
    public long e(i50 i50) {
        if (!n(i50.a)) {
            return -1;
        }
        return (long) m(i50);
    }

    /* access modifiers changed from: protected */
    public boolean h(i50 i50, long j, xv.b bVar) {
        byte[] bArr = i50.a;
        if (this.n == null) {
            this.n = new y40(bArr, 17);
            bVar.a = this.n.i(Arrays.copyOfRange(bArr, 9, i50.d()), (yx) null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.o = new a();
            this.n = this.n.c(nt.h(i50));
            return true;
        } else if (!n(bArr)) {
            return true;
        } else {
            a aVar = this.o;
            if (aVar != null) {
                aVar.d(j);
                bVar.b = this.o;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
