package defpackage;

import defpackage.ab2;
import defpackage.cb2;
import defpackage.ua2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: gc2  reason: default package */
public final class gc2 implements ua2 {
    private final xa2 a;
    private volatile wb2 b;
    private Object c;
    private volatile boolean d;

    public gc2(xa2 xa2, boolean z) {
        this.a = xa2;
    }

    private aa2 c(ta2 ta2) {
        ga2 ga2;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (ta2.n()) {
            SSLSocketFactory L = this.a.L();
            hostnameVerifier = this.a.t();
            sSLSocketFactory = L;
            ga2 = this.a.e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            ga2 = null;
        }
        return new aa2(ta2.m(), ta2.z(), this.a.p(), this.a.K(), sSLSocketFactory, hostnameVerifier, ga2, this.a.D(), this.a.C(), this.a.B(), this.a.j(), this.a.G());
    }

    private ab2 d(cb2 cb2, eb2 eb2) {
        String k;
        ta2 D;
        if (cb2 != null) {
            int h = cb2.h();
            String g = cb2.F().g();
            bb2 bb2 = null;
            if (h == 307 || h == 308) {
                if (!g.equals("GET") && !g.equals("HEAD")) {
                    return null;
                }
            } else if (h == 401) {
                return this.a.c().a(eb2, cb2);
            } else {
                if (h != 503) {
                    if (h == 407) {
                        if ((eb2 != null ? eb2.b() : this.a.C()).type() == Proxy.Type.HTTP) {
                            return this.a.D().a(eb2, cb2);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (h != 408) {
                        switch (h) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.a.I()) {
                        return null;
                    } else {
                        cb2.F().a();
                        if ((cb2.B() == null || cb2.B().h() != 408) && h(cb2, 0) <= 0) {
                            return cb2.F();
                        }
                        return null;
                    }
                } else if ((cb2.B() == null || cb2.B().h() != 503) && h(cb2, Integer.MAX_VALUE) == 0) {
                    return cb2.F();
                } else {
                    return null;
                }
            }
            if (!this.a.r() || (k = cb2.k("Location")) == null || (D = cb2.F().j().D(k)) == null) {
                return null;
            }
            if (!D.E().equals(cb2.F().j().E()) && !this.a.s()) {
                return null;
            }
            ab2.a h2 = cb2.F().h();
            if (cc2.b(g)) {
                boolean d2 = cc2.d(g);
                if (cc2.c(g)) {
                    h2.f("GET", (bb2) null);
                } else {
                    if (d2) {
                        bb2 = cb2.F().a();
                    }
                    h2.f(g, bb2);
                }
                if (!d2) {
                    h2.g("Transfer-Encoding");
                    h2.g("Content-Length");
                    h2.g("Content-Type");
                }
            }
            if (!i(cb2, D)) {
                h2.g("Authorization");
            }
            h2.j(D);
            return h2.b();
        }
        throw new IllegalStateException();
    }

    private boolean f(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private boolean g(IOException iOException, wb2 wb2, boolean z, ab2 ab2) {
        wb2.q(iOException);
        if (!this.a.I()) {
            return false;
        }
        if (z) {
            ab2.a();
        }
        return f(iOException, z) && wb2.h();
    }

    private int h(cb2 cb2, int i) {
        String k = cb2.k("Retry-After");
        if (k == null) {
            return i;
        }
        if (k.matches("\\d+")) {
            return Integer.valueOf(k).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean i(cb2 cb2, ta2 ta2) {
        ta2 j = cb2.F().j();
        return j.m().equals(ta2.m()) && j.z() == ta2.z() && j.E().equals(ta2.E());
    }

    public cb2 a(ua2.a aVar) {
        ab2 i = aVar.i();
        dc2 dc2 = (dc2) aVar;
        ea2 f = dc2.f();
        pa2 g = dc2.g();
        wb2 wb2 = new wb2(this.a.g(), c(i.j()), f, g, this.c);
        this.b = wb2;
        cb2 cb2 = null;
        int i2 = 0;
        while (!this.d) {
            try {
                cb2 j = dc2.j(i, wb2, (zb2) null, (sb2) null);
                if (cb2 != null) {
                    cb2.a A = j.A();
                    cb2.a A2 = cb2.A();
                    A2.b((db2) null);
                    A.m(A2.c());
                    j = A.c();
                }
                try {
                    ab2 d2 = d(j, wb2.o());
                    if (d2 == null) {
                        wb2.k();
                        return j;
                    }
                    ib2.g(j.a());
                    int i3 = i2 + 1;
                    if (i3 <= 20) {
                        d2.a();
                        if (!i(j, d2.j())) {
                            wb2.k();
                            wb2 = new wb2(this.a.g(), c(d2.j()), f, g, this.c);
                            this.b = wb2;
                        } else if (wb2.c() != null) {
                            throw new IllegalStateException("Closing the body of " + j + " didn't close its backing stream. Bad interceptor?");
                        }
                        cb2 = j;
                        i = d2;
                        i2 = i3;
                    } else {
                        wb2.k();
                        throw new ProtocolException("Too many follow-up requests: " + i3);
                    }
                } catch (IOException e) {
                    wb2.k();
                    throw e;
                }
            } catch (ub2 e2) {
                if (!g(e2.c(), wb2, false, i)) {
                    throw e2.b();
                }
            } catch (IOException e3) {
                if (!g(e3, wb2, !(e3 instanceof jc2), i)) {
                    throw e3;
                }
            } catch (Throwable th) {
                wb2.q((IOException) null);
                wb2.k();
                throw th;
            }
        }
        wb2.k();
        throw new IOException("Canceled");
    }

    public void b() {
        this.d = true;
        wb2 wb2 = this.b;
        if (wb2 != null) {
            wb2.b();
        }
    }

    public boolean e() {
        return this.d;
    }

    public void j(Object obj) {
        this.c = obj;
    }
}
