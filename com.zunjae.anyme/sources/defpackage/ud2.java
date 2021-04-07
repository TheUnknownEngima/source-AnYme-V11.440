package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: ud2  reason: default package */
public final class ud2 implements de2 {
    private int e = 0;
    private final pd2 f;
    private final Inflater g;
    private final vd2 h;
    private final CRC32 i = new CRC32();

    public ud2(de2 de2) {
        if (de2 != null) {
            this.g = new Inflater(true);
            pd2 d = wd2.d(de2);
            this.f = d;
            this.h = new vd2(d, this.g);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
    }

    private void b() {
        this.f.H0(10);
        byte C = this.f.d().C(3);
        boolean z = ((C >> 1) & 1) == 1;
        if (z) {
            i(this.f.d(), 0, 10);
        }
        a("ID1ID2", 8075, this.f.readShort());
        this.f.e(8);
        if (((C >> 2) & 1) == 1) {
            this.f.H0(2);
            if (z) {
                i(this.f.d(), 0, 2);
            }
            long w0 = (long) this.f.d().w0();
            this.f.H0(w0);
            if (z) {
                i(this.f.d(), 0, w0);
            }
            this.f.e(w0);
        }
        if (((C >> 3) & 1) == 1) {
            long J0 = this.f.J0((byte) 0);
            if (J0 != -1) {
                if (z) {
                    i(this.f.d(), 0, J0 + 1);
                }
                this.f.e(J0 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((C >> 4) & 1) == 1) {
            long J02 = this.f.J0((byte) 0);
            if (J02 != -1) {
                if (z) {
                    i(this.f.d(), 0, J02 + 1);
                }
                this.f.e(J02 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", this.f.w0(), (short) ((int) this.i.getValue()));
            this.i.reset();
        }
    }

    private void h() {
        a("CRC", this.f.n0(), (int) this.i.getValue());
        a("ISIZE", this.f.n0(), (int) this.g.getBytesWritten());
    }

    private void i(nd2 nd2, long j, long j2) {
        zd2 zd2 = nd2.e;
        while (true) {
            int i2 = zd2.c;
            int i3 = zd2.b;
            if (j < ((long) (i2 - i3))) {
                break;
            }
            j -= (long) (i2 - i3);
            zd2 = zd2.f;
        }
        while (j2 > 0) {
            int i4 = (int) (((long) zd2.b) + j);
            int min = (int) Math.min((long) (zd2.c - i4), j2);
            this.i.update(zd2.a, i4, min);
            j2 -= (long) min;
            zd2 = zd2.f;
            j = 0;
        }
    }

    public ee2 c() {
        return this.f.c();
    }

    public void close() {
        this.h.close();
    }

    public long y0(nd2 nd2, long j) {
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.e == 0) {
                b();
                this.e = 1;
            }
            if (this.e == 1) {
                long j2 = nd2.f;
                long y0 = this.h.y0(nd2, j);
                if (y0 != -1) {
                    i(nd2, j2, y0);
                    return y0;
                }
                this.e = 2;
            }
            if (this.e == 2) {
                h();
                this.e = 3;
                if (!this.f.v()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
