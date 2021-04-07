package defpackage;

import com.google.android.exoplayer2.upstream.d;
import com.google.android.exoplayer2.upstream.e;
import defpackage.k00;
import defpackage.vt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: j00  reason: default package */
class j00 {
    private final e a;
    private final int b;
    private final i50 c = new i50(32);
    private a d;
    private a e;
    private a f;
    private long g;

    /* renamed from: j00$a */
    private static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public d d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + ((long) i);
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void b(d dVar, a aVar) {
            this.d = dVar;
            this.e = aVar;
            this.c = true;
        }

        public int c(long j) {
            return ((int) (j - this.a)) + this.d.b;
        }
    }

    public j00(e eVar) {
        this.a = eVar;
        this.b = eVar.e();
        a aVar = new a(0, this.b);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    private void a(long j) {
        while (true) {
            a aVar = this.e;
            if (j >= aVar.b) {
                this.e = aVar.e;
            } else {
                return;
            }
        }
    }

    private void b(a aVar) {
        if (aVar.c) {
            a aVar2 = this.f;
            int i = (aVar2.c ? 1 : 0) + (((int) (aVar2.a - aVar.a)) / this.b);
            d[] dVarArr = new d[i];
            for (int i2 = 0; i2 < i; i2++) {
                dVarArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.a.d(dVarArr);
        }
    }

    private void f(int i) {
        long j = this.g + ((long) i);
        this.g = j;
        a aVar = this.f;
        if (j == aVar.b) {
            this.f = aVar.e;
        }
    }

    private int g(int i) {
        a aVar = this.f;
        if (!aVar.c) {
            aVar.b(this.a.b(), new a(this.f.b, this.b));
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    private void h(long j, ByteBuffer byteBuffer, int i) {
        a(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.e.b - j));
            a aVar = this.e;
            byteBuffer.put(aVar.d.a, aVar.c(j), min);
            i -= min;
            j += (long) min;
            a aVar2 = this.e;
            if (j == aVar2.b) {
                this.e = aVar2.e;
            }
        }
    }

    private void i(long j, byte[] bArr, int i) {
        a(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.e.b - j));
            a aVar = this.e;
            System.arraycopy(aVar.d.a, aVar.c(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            a aVar2 = this.e;
            if (j == aVar2.b) {
                this.e = aVar2.e;
            }
        }
    }

    private void j(as asVar, k00.a aVar) {
        int i;
        k00.a aVar2 = aVar;
        long j = aVar2.b;
        this.c.I(1);
        i(j, this.c.a, 1);
        long j2 = j + 1;
        byte b2 = this.c.a[0];
        boolean z = (b2 & 128) != 0;
        byte b3 = b2 & Byte.MAX_VALUE;
        xr xrVar = asVar.e;
        byte[] bArr = xrVar.a;
        if (bArr == null) {
            xrVar.a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        i(j2, xrVar.a, b3);
        long j3 = j2 + ((long) b3);
        if (z) {
            this.c.I(2);
            i(j3, this.c.a, 2);
            j3 += 2;
            i = this.c.F();
        } else {
            i = 1;
        }
        int[] iArr = xrVar.b;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = xrVar.c;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = i * 6;
            this.c.I(i2);
            i(j3, this.c.a, i2);
            j3 += (long) i2;
            this.c.M(0);
            for (int i3 = 0; i3 < i; i3++) {
                iArr2[i3] = this.c.F();
                iArr4[i3] = this.c.D();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.a - ((int) (j3 - aVar2.b));
        }
        vt.a aVar3 = aVar2.c;
        xrVar.b(i, iArr2, iArr4, aVar3.b, xrVar.a, aVar3.a, aVar3.c, aVar3.d);
        long j4 = aVar2.b;
        int i4 = (int) (j3 - j4);
        aVar2.b = j4 + ((long) i4);
        aVar2.a -= i4;
    }

    public void c(long j) {
        a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.d;
                if (j < aVar.b) {
                    break;
                }
                this.a.a(aVar.d);
                this.d = this.d.a();
            }
            if (this.e.a < aVar.a) {
                this.e = aVar;
            }
        }
    }

    public void d(long j) {
        this.g = j;
        if (j != 0) {
            a aVar = this.d;
            if (j != aVar.a) {
                while (this.g > aVar.b) {
                    aVar = aVar.e;
                }
                a aVar2 = aVar.e;
                b(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.e = aVar3;
                if (this.g != aVar.b) {
                    aVar3 = aVar;
                }
                this.f = aVar3;
                if (this.e == aVar2) {
                    this.e = aVar.e;
                    return;
                }
                return;
            }
        }
        b(this.d);
        a aVar4 = new a(this.g, this.b);
        this.d = aVar4;
        this.e = aVar4;
        this.f = aVar4;
    }

    public long e() {
        return this.g;
    }

    public void k(as asVar, k00.a aVar) {
        ByteBuffer byteBuffer;
        long j;
        if (asVar.m()) {
            j(asVar, aVar);
        }
        if (asVar.hasSupplementalData()) {
            this.c.I(4);
            i(aVar.b, this.c.a, 4);
            int D = this.c.D();
            aVar.b += 4;
            aVar.a -= 4;
            asVar.k(D);
            h(aVar.b, asVar.f, D);
            aVar.b += (long) D;
            int i = aVar.a - D;
            aVar.a = i;
            asVar.s(i);
            j = aVar.b;
            byteBuffer = asVar.i;
        } else {
            asVar.k(aVar.a);
            j = aVar.b;
            byteBuffer = asVar.f;
        }
        h(j, byteBuffer, aVar.a);
    }

    public void l() {
        b(this.d);
        a aVar = new a(0, this.b);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = 0;
        this.a.c();
    }

    public void m() {
        this.e = this.d;
    }

    public int n(it itVar, int i, boolean z) {
        int g2 = g(i);
        a aVar = this.f;
        int a2 = itVar.a(aVar.d.a, aVar.c(this.g), g2);
        if (a2 != -1) {
            f(a2);
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void o(i50 i50, int i) {
        while (i > 0) {
            int g2 = g(i);
            a aVar = this.f;
            i50.h(aVar.d.a, aVar.c(this.g), g2);
            i -= g2;
            f(g2);
        }
    }
}
