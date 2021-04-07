package defpackage;

import java.nio.ByteBuffer;

/* renamed from: xd2  reason: default package */
final class xd2 implements od2 {
    public final nd2 e = new nd2();
    public final ce2 f;
    boolean g;

    xd2(ce2 ce2) {
        if (ce2 != null) {
            this.f = ce2;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public od2 D() {
        if (!this.g) {
            long t = this.e.t();
            if (t > 0) {
                this.f.X(this.e, t);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public od2 I0(long j) {
        if (!this.g) {
            this.e.G0(j);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public od2 O(String str) {
        if (!this.g) {
            this.e.P0(str);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public od2 W(byte[] bArr, int i, int i2) {
        if (!this.g) {
            this.e.D0(bArr, i, i2);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void X(nd2 nd2, long j) {
        if (!this.g) {
            this.e.X(nd2, j);
            D();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public long a0(de2 de2) {
        if (de2 != null) {
            long j = 0;
            while (true) {
                long y0 = de2.y0(this.e, 8192);
                if (y0 == -1) {
                    return j;
                }
                j += y0;
                D();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public od2 b0(long j) {
        if (!this.g) {
            this.e.L0(j);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public ee2 c() {
        return this.f.c();
    }

    public void close() {
        if (!this.g) {
            try {
                if (this.e.f > 0) {
                    this.f.X(this.e, this.e.f);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.g = true;
            if (th != null) {
                fe2.e(th);
                throw null;
            }
        }
    }

    public nd2 d() {
        return this.e;
    }

    public void flush() {
        if (!this.g) {
            nd2 nd2 = this.e;
            long j = nd2.f;
            if (j > 0) {
                this.f.X(nd2, j);
            }
            this.f.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.g;
    }

    public od2 o(int i) {
        if (!this.g) {
            this.e.N0(i);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public od2 q(int i) {
        if (!this.g) {
            this.e.M0(i);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public od2 r0(byte[] bArr) {
        if (!this.g) {
            this.e.z0(bArr);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public od2 t0(qd2 qd2) {
        if (!this.g) {
            this.e.v0(qd2);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f + ")";
    }

    public od2 w(int i) {
        if (!this.g) {
            this.e.F0(i);
            D();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.g) {
            int write = this.e.write(byteBuffer);
            D();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
