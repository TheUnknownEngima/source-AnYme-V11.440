package defpackage;

import defpackage.cb2;
import defpackage.sa2;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: ic2  reason: default package */
public final class ic2 implements zb2 {
    final xa2 a;
    final wb2 b;
    final pd2 c;
    final od2 d;
    int e = 0;
    private long f = 262144;

    /* renamed from: ic2$b */
    private abstract class b implements de2 {
        protected final td2 e;
        protected boolean f;
        protected long g;

        private b() {
            this.e = new td2(ic2.this.c.c());
            this.g = 0;
        }

        /* access modifiers changed from: protected */
        public final void a(boolean z, IOException iOException) {
            ic2 ic2 = ic2.this;
            int i = ic2.e;
            if (i != 6) {
                if (i == 5) {
                    ic2.g(this.e);
                    ic2 ic22 = ic2.this;
                    ic22.e = 6;
                    wb2 wb2 = ic22.b;
                    if (wb2 != null) {
                        wb2.r(!z, ic22, this.g, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + ic2.this.e);
            }
        }

        public ee2 c() {
            return this.e;
        }

        public long y0(nd2 nd2, long j) {
            try {
                long y0 = ic2.this.c.y0(nd2, j);
                if (y0 > 0) {
                    this.g += y0;
                }
                return y0;
            } catch (IOException e2) {
                a(false, e2);
                throw e2;
            }
        }
    }

    /* renamed from: ic2$c */
    private final class c implements ce2 {
        private final td2 e = new td2(ic2.this.d.c());
        private boolean f;

        c() {
        }

        public void X(nd2 nd2, long j) {
            if (this.f) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                ic2.this.d.b0(j);
                ic2.this.d.O("\r\n");
                ic2.this.d.X(nd2, j);
                ic2.this.d.O("\r\n");
            }
        }

        public ee2 c() {
            return this.e;
        }

        public synchronized void close() {
            if (!this.f) {
                this.f = true;
                ic2.this.d.O("0\r\n\r\n");
                ic2.this.g(this.e);
                ic2.this.e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f) {
                ic2.this.d.flush();
            }
        }
    }

    /* renamed from: ic2$d */
    private class d extends b {
        private final ta2 i;
        private long j = -1;
        private boolean k = true;

        d(ta2 ta2) {
            super();
            this.i = ta2;
        }

        private void b() {
            if (this.j != -1) {
                ic2.this.c.l0();
            }
            try {
                this.j = ic2.this.c.K0();
                String trim = ic2.this.c.l0().trim();
                if (this.j < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.j + trim + "\"");
                } else if (this.j == 0) {
                    this.k = false;
                    bc2.g(ic2.this.a.n(), this.i, ic2.this.n());
                    a(true, (IOException) null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!this.f) {
                if (this.k && !ib2.p(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.f = true;
            }
        }

        public long y0(nd2 nd2, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (this.f) {
                throw new IllegalStateException("closed");
            } else if (!this.k) {
                return -1;
            } else {
                long j3 = this.j;
                if (j3 == 0 || j3 == -1) {
                    b();
                    if (!this.k) {
                        return -1;
                    }
                }
                long y0 = super.y0(nd2, Math.min(j2, this.j));
                if (y0 != -1) {
                    this.j -= y0;
                    return y0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* renamed from: ic2$e */
    private final class e implements ce2 {
        private final td2 e = new td2(ic2.this.d.c());
        private boolean f;
        private long g;

        e(long j) {
            this.g = j;
        }

        public void X(nd2 nd2, long j) {
            if (!this.f) {
                ib2.f(nd2.k0(), 0, j);
                if (j <= this.g) {
                    ic2.this.d.X(nd2, j);
                    this.g -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.g + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }

        public ee2 c() {
            return this.e;
        }

        public void close() {
            if (!this.f) {
                this.f = true;
                if (this.g <= 0) {
                    ic2.this.g(this.e);
                    ic2.this.e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() {
            if (!this.f) {
                ic2.this.d.flush();
            }
        }
    }

    /* renamed from: ic2$f */
    private class f extends b {
        private long i;

        f(ic2 ic2, long j) {
            super();
            this.i = j;
            if (j == 0) {
                a(true, (IOException) null);
            }
        }

        public void close() {
            if (!this.f) {
                if (this.i != 0 && !ib2.p(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, (IOException) null);
                }
                this.f = true;
            }
        }

        public long y0(nd2 nd2, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f) {
                long j2 = this.i;
                if (j2 == 0) {
                    return -1;
                }
                long y0 = super.y0(nd2, Math.min(j2, j));
                if (y0 != -1) {
                    long j3 = this.i - y0;
                    this.i = j3;
                    if (j3 == 0) {
                        a(true, (IOException) null);
                    }
                    return y0;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: ic2$g */
    private class g extends b {
        private boolean i;

        g(ic2 ic2) {
            super();
        }

        public void close() {
            if (!this.f) {
                if (!this.i) {
                    a(false, (IOException) null);
                }
                this.f = true;
            }
        }

        public long y0(nd2 nd2, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f) {
                throw new IllegalStateException("closed");
            } else if (this.i) {
                return -1;
            } else {
                long y0 = super.y0(nd2, j);
                if (y0 != -1) {
                    return y0;
                }
                this.i = true;
                a(true, (IOException) null);
                return -1;
            }
        }
    }

    public ic2(xa2 xa2, wb2 wb2, pd2 pd2, od2 od2) {
        this.a = xa2;
        this.b = wb2;
        this.c = pd2;
        this.d = od2;
    }

    private String m() {
        String I = this.c.I(this.f);
        this.f -= (long) I.length();
        return I;
    }

    public void a() {
        this.d.flush();
    }

    public void b(ab2 ab2) {
        o(ab2.e(), fc2.a(ab2, this.b.d().q().b().type()));
    }

    public db2 c(cb2 cb2) {
        wb2 wb2 = this.b;
        wb2.f.q(wb2.e);
        String k = cb2.k("Content-Type");
        if (!bc2.c(cb2)) {
            return new ec2(k, 0, wd2.d(k(0)));
        }
        if ("chunked".equalsIgnoreCase(cb2.k("Transfer-Encoding"))) {
            return new ec2(k, -1, wd2.d(i(cb2.F().j())));
        }
        long b2 = bc2.b(cb2);
        return b2 != -1 ? new ec2(k, b2, wd2.d(k(b2))) : new ec2(k, -1, wd2.d(l()));
    }

    public void cancel() {
        sb2 d2 = this.b.d();
        if (d2 != null) {
            d2.d();
        }
    }

    public cb2.a d(boolean z) {
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                hc2 a2 = hc2.a(m());
                cb2.a aVar = new cb2.a();
                aVar.n(a2.a);
                aVar.g(a2.b);
                aVar.k(a2.c);
                aVar.j(n());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.e = 3;
                    return aVar;
                }
                this.e = 4;
                return aVar;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.b);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.e);
        }
    }

    public void e() {
        this.d.flush();
    }

    public ce2 f(ab2 ab2, long j) {
        if ("chunked".equalsIgnoreCase(ab2.c("Transfer-Encoding"))) {
            return h();
        }
        if (j != -1) {
            return j(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* access modifiers changed from: package-private */
    public void g(td2 td2) {
        ee2 i = td2.i();
        td2.j(ee2.d);
        i.a();
        i.b();
    }

    public ce2 h() {
        if (this.e == 1) {
            this.e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public de2 i(ta2 ta2) {
        if (this.e == 4) {
            this.e = 5;
            return new d(ta2);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public ce2 j(long j) {
        if (this.e == 1) {
            this.e = 2;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public de2 k(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new f(this, j);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public de2 l() {
        if (this.e == 4) {
            wb2 wb2 = this.b;
            if (wb2 != null) {
                this.e = 5;
                wb2.j();
                return new g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public sa2 n() {
        sa2.a aVar = new sa2.a();
        while (true) {
            String m = m();
            if (m.length() == 0) {
                return aVar.d();
            }
            gb2.a.a(aVar, m);
        }
    }

    public void o(sa2 sa2, String str) {
        if (this.e == 0) {
            this.d.O(str).O("\r\n");
            int h = sa2.h();
            for (int i = 0; i < h; i++) {
                this.d.O(sa2.e(i)).O(": ").O(sa2.i(i)).O("\r\n");
            }
            this.d.O("\r\n");
            this.e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.e);
    }
}
