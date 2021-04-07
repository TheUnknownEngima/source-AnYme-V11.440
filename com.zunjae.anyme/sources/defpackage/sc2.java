package defpackage;

import defpackage.mc2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: sc2  reason: default package */
final class sc2 implements Closeable {
    private static final Logger k = Logger.getLogger(nc2.class.getName());
    private final od2 e;
    private final boolean f;
    private final nd2 g;
    private int h = 16384;
    private boolean i;
    final mc2.b j;

    sc2(od2 od2, boolean z) {
        this.e = od2;
        this.f = z;
        nd2 nd2 = new nd2();
        this.g = nd2;
        this.j = new mc2.b(nd2);
    }

    private void F(int i2, long j2) {
        while (j2 > 0) {
            int min = (int) Math.min((long) this.h, j2);
            long j3 = (long) min;
            j2 -= j3;
            k(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : 0);
            this.e.X(this.g, j3);
        }
    }

    private static void G(od2 od2, int i2) {
        od2.w((i2 >>> 16) & 255);
        od2.w((i2 >>> 8) & 255);
        od2.w(i2 & 255);
    }

    public synchronized void A(int i2, kc2 kc2) {
        if (this.i) {
            throw new IOException("closed");
        } else if (kc2.httpCode != -1) {
            k(i2, 4, (byte) 3, (byte) 0);
            this.e.q(kc2.httpCode);
            this.e.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void B(vc2 vc2) {
        if (!this.i) {
            int i2 = 0;
            k(0, vc2.j() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (vc2.g(i2)) {
                    this.e.o(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.e.q(vc2.b(i2));
                }
                i2++;
            }
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void C(boolean z, int i2, int i3, List<lc2> list) {
        if (!this.i) {
            m(z, i2, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void E(int i2, long j2) {
        if (this.i) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            nc2.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        } else {
            k(i2, 4, (byte) 8, (byte) 0);
            this.e.q((int) j2);
            this.e.flush();
        }
    }

    public synchronized void a(vc2 vc2) {
        if (!this.i) {
            this.h = vc2.f(this.h);
            if (vc2.c() != -1) {
                this.j.e(vc2.c());
            }
            k(0, 0, (byte) 4, (byte) 1);
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void b() {
        if (this.i) {
            throw new IOException("closed");
        } else if (this.f) {
            if (k.isLoggable(Level.FINE)) {
                k.fine(ib2.r(">> CONNECTION %s", nc2.a.r()));
            }
            this.e.r0(nc2.a.F());
            this.e.flush();
        }
    }

    public synchronized void close() {
        this.i = true;
        this.e.close();
    }

    public synchronized void flush() {
        if (!this.i) {
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void h(boolean z, int i2, nd2 nd2, int i3) {
        if (!this.i) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            i(i2, b, nd2, i3);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void i(int i2, byte b, nd2 nd2, int i3) {
        k(i2, i3, (byte) 0, b);
        if (i3 > 0) {
            this.e.X(nd2, (long) i3);
        }
    }

    public void k(int i2, int i3, byte b, byte b2) {
        if (k.isLoggable(Level.FINE)) {
            k.fine(nc2.b(false, i2, i3, b, b2));
        }
        int i4 = this.h;
        if (i3 > i4) {
            nc2.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            G(this.e, i3);
            this.e.w(b & 255);
            this.e.w(b2 & 255);
            this.e.q(i2 & Integer.MAX_VALUE);
        } else {
            nc2.c("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public synchronized void l(int i2, kc2 kc2, byte[] bArr) {
        if (this.i) {
            throw new IOException("closed");
        } else if (kc2.httpCode != -1) {
            k(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.e.q(i2);
            this.e.q(kc2.httpCode);
            if (bArr.length > 0) {
                this.e.r0(bArr);
            }
            this.e.flush();
        } else {
            nc2.c("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z, int i2, List<lc2> list) {
        if (!this.i) {
            this.j.g(list);
            long k0 = this.g.k0();
            int min = (int) Math.min((long) this.h, k0);
            long j2 = (long) min;
            int i3 = (k0 > j2 ? 1 : (k0 == j2 ? 0 : -1));
            byte b = i3 == 0 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            k(i2, min, (byte) 1, b);
            this.e.X(this.g, j2);
            if (i3 > 0) {
                F(i2, k0 - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int r() {
        return this.h;
    }

    public synchronized void t(boolean z, int i2, int i3) {
        if (!this.i) {
            k(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.e.q(i2);
            this.e.q(i3);
            this.e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void z(int i2, int i3, List<lc2> list) {
        if (!this.i) {
            this.j.g(list);
            long k0 = this.g.k0();
            int min = (int) Math.min((long) (this.h - 4), k0);
            long j2 = (long) min;
            int i4 = (k0 > j2 ? 1 : (k0 == j2 ? 0 : -1));
            k(i2, min + 4, (byte) 5, i4 == 0 ? (byte) 4 : 0);
            this.e.q(i3 & Integer.MAX_VALUE);
            this.e.X(this.g, j2);
            if (i4 > 0) {
                F(i2, k0 - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
