package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: rd  reason: default package */
public class rd {
    private final byte[] a = new byte[256];
    private ByteBuffer b;
    private qd c;
    private int d = 0;

    private boolean b() {
        return this.c.b != 0;
    }

    private int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    private void e() {
        this.c.d.a = n();
        this.c.d.b = n();
        this.c.d.c = n();
        this.c.d.d = n();
        int d2 = d();
        boolean z = false;
        boolean z2 = (d2 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d2 & 7) + 1));
        pd pdVar = this.c.d;
        if ((d2 & 64) != 0) {
            z = true;
        }
        pdVar.e = z;
        pd pdVar2 = this.c.d;
        if (z2) {
            pdVar2.k = g(pow);
        } else {
            pdVar2.k = null;
        }
        this.c.d.j = this.b.position();
        r();
        if (!b()) {
            qd qdVar = this.c;
            qdVar.c++;
            qdVar.e.add(qdVar.d);
        }
    }

    private void f() {
        int d2 = d();
        this.d = d2;
        if (d2 > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.d) {
                try {
                    i2 = this.d - i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d;
                    }
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    private int[] g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            boolean isLoggable = Log.isLoggable("GifHeaderParser", 3);
            this.c.b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i) {
        boolean z = false;
        while (!z && !b() && this.c.c <= i) {
            int d2 = d();
            if (d2 == 33) {
                int d3 = d();
                if (d3 != 1) {
                    if (d3 == 249) {
                        this.c.d = new pd();
                        j();
                    } else if (d3 != 254 && d3 == 255) {
                        f();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            m();
                        }
                    }
                }
                q();
            } else if (d2 == 44) {
                qd qdVar = this.c;
                if (qdVar.d == null) {
                    qdVar.d = new pd();
                }
                e();
            } else if (d2 != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    private void j() {
        d();
        int d2 = d();
        pd pdVar = this.c.d;
        int i = (d2 & 28) >> 2;
        pdVar.g = i;
        boolean z = true;
        if (i == 0) {
            pdVar.g = 1;
        }
        pd pdVar2 = this.c.d;
        if ((d2 & 1) == 0) {
            z = false;
        }
        pdVar2.f = z;
        int n = n();
        if (n < 2) {
            n = 10;
        }
        pd pdVar3 = this.c.d;
        pdVar3.i = n * 10;
        pdVar3.h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        l();
        if (this.c.h && !b()) {
            qd qdVar = this.c;
            qdVar.a = g(qdVar.i);
            qd qdVar2 = this.c;
            qdVar2.l = qdVar2.a[qdVar2.j];
        }
    }

    private void l() {
        this.c.f = n();
        this.c.g = n();
        int d2 = d();
        this.c.h = (d2 & 128) != 0;
        this.c.i = (int) Math.pow(2.0d, (double) ((d2 & 7) + 1));
        this.c.j = d();
        this.c.k = d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r3 = this;
        L_0x0000:
            r3.f()
            byte[] r0 = r3.a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            qd r2 = r3.c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.m = r0
        L_0x001b:
            int r0 = r3.d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd.m():void");
    }

    private int n() {
        return this.b.getShort();
    }

    private void o() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new qd();
        this.d = 0;
    }

    private void q() {
        int d2;
        do {
            d2 = d();
            this.b.position(Math.min(this.b.position() + d2, this.b.limit()));
        } while (d2 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public qd c() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (b()) {
            return this.c;
        } else {
            k();
            if (!b()) {
                h();
                qd qdVar = this.c;
                if (qdVar.c < 0) {
                    qdVar.b = 1;
                }
            }
            return this.c;
        }
    }

    public rd p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
