package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: vd2  reason: default package */
public final class vd2 implements de2 {
    private final pd2 e;
    private final Inflater f;
    private int g;
    private boolean h;

    vd2(pd2 pd2, Inflater inflater) {
        if (pd2 == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.e = pd2;
            this.f = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void b() {
        int i = this.g;
        if (i != 0) {
            int remaining = i - this.f.getRemaining();
            this.g -= remaining;
            this.e.e((long) remaining);
        }
    }

    public final boolean a() {
        if (!this.f.needsInput()) {
            return false;
        }
        b();
        if (this.f.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.e.v()) {
            return true;
        } else {
            zd2 zd2 = this.e.d().e;
            int i = zd2.c;
            int i2 = zd2.b;
            int i3 = i - i2;
            this.g = i3;
            this.f.setInput(zd2.a, i2, i3);
            return false;
        }
    }

    public ee2 c() {
        return this.e.c();
    }

    public void close() {
        if (!this.h) {
            this.f.end();
            this.h = true;
            this.e.close();
        }
    }

    public long y0(nd2 nd2, long j) {
        zd2 u0;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.h) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = a();
                try {
                    u0 = nd2.u0(1);
                    int inflate = this.f.inflate(u0.a, u0.c, (int) Math.min(j, (long) (8192 - u0.c)));
                    if (inflate > 0) {
                        u0.c += inflate;
                        long j2 = (long) inflate;
                        nd2.f += j2;
                        return j2;
                    } else if (this.f.finished()) {
                        break;
                    } else if (this.f.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            b();
            if (u0.b != u0.c) {
                return -1;
            }
            nd2.e = u0.b();
            ae2.a(u0);
            return -1;
        }
    }
}
