package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.xt;
import defpackage.xv;
import java.util.ArrayList;

/* renamed from: yv  reason: default package */
final class yv extends xv {
    private a n;
    private int o;
    private boolean p;
    private xt.d q;
    private xt.b r;

    /* renamed from: yv$a */
    static final class a {
        public final xt.d a;
        public final byte[] b;
        public final xt.c[] c;
        public final int d;

        public a(xt.d dVar, xt.b bVar, byte[] bArr, xt.c[] cVarArr, int i) {
            this.a = dVar;
            this.b = bArr;
            this.c = cVarArr;
            this.d = i;
        }
    }

    yv() {
    }

    static void l(i50 i50, long j) {
        i50.L(i50.d() + 4);
        i50.a[i50.d() - 4] = (byte) ((int) (j & 255));
        i50.a[i50.d() - 3] = (byte) ((int) ((j >>> 8) & 255));
        i50.a[i50.d() - 2] = (byte) ((int) ((j >>> 16) & 255));
        i50.a[i50.d() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    private static int m(byte b, a aVar) {
        return !aVar.c[n(b, aVar.d, 1)].a ? aVar.a.d : aVar.a.e;
    }

    static int n(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean p(i50 i50) {
        try {
            return xt.l(1, i50, true);
        } catch (m0 unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void d(long j) {
        super.d(j);
        int i = 0;
        this.p = j != 0;
        xt.d dVar = this.q;
        if (dVar != null) {
            i = dVar.d;
        }
        this.o = i;
    }

    /* access modifiers changed from: protected */
    public long e(i50 i50) {
        byte[] bArr = i50.a;
        int i = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        int m = m(bArr[0], this.n);
        if (this.p) {
            i = (this.o + m) / 4;
        }
        long j = (long) i;
        l(i50, j);
        this.p = true;
        this.o = m;
        return j;
    }

    /* access modifiers changed from: protected */
    public boolean h(i50 i50, long j, xv.b bVar) {
        if (this.n != null) {
            return false;
        }
        a o2 = o(i50);
        this.n = o2;
        if (o2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.a.f);
        arrayList.add(this.n.b);
        xt.d dVar = this.n.a;
        bVar.a = f0.p((String) null, "audio/vorbis", (String) null, dVar.c, -1, dVar.a, (int) dVar.b, arrayList, (ns) null, 0, (String) null);
        return true;
    }

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* access modifiers changed from: package-private */
    public a o(i50 i50) {
        if (this.q == null) {
            this.q = xt.j(i50);
            return null;
        } else if (this.r == null) {
            this.r = xt.h(i50);
            return null;
        } else {
            byte[] bArr = new byte[i50.d()];
            System.arraycopy(i50.a, 0, bArr, 0, i50.d());
            xt.c[] k = xt.k(i50, this.q.a);
            return new a(this.q, this.r, bArr, k, xt.a(k.length - 1));
        }
    }
}
