package defpackage;

import defpackage.cb2;
import defpackage.mb2;
import defpackage.sa2;
import defpackage.ua2;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: kb2  reason: default package */
public final class kb2 implements ua2 {
    final pb2 a;

    /* renamed from: kb2$a */
    class a implements de2 {
        boolean e;
        final /* synthetic */ pd2 f;
        final /* synthetic */ lb2 g;
        final /* synthetic */ od2 h;

        a(kb2 kb2, pd2 pd2, lb2 lb2, od2 od2) {
            this.f = pd2;
            this.g = lb2;
            this.h = od2;
        }

        public ee2 c() {
            return this.f.c();
        }

        public void close() {
            if (!this.e && !ib2.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.e = true;
                this.g.a();
            }
            this.f.close();
        }

        public long y0(nd2 nd2, long j) {
            try {
                long y0 = this.f.y0(nd2, j);
                if (y0 == -1) {
                    if (!this.e) {
                        this.e = true;
                        this.h.close();
                    }
                    return -1;
                }
                nd2.A(this.h.d(), nd2.k0() - y0, y0);
                this.h.D();
                return y0;
            } catch (IOException e2) {
                if (!this.e) {
                    this.e = true;
                    this.g.a();
                }
                throw e2;
            }
        }
    }

    public kb2(pb2 pb2) {
        this.a = pb2;
    }

    private cb2 b(lb2 lb2, cb2 cb2) {
        ce2 b;
        if (lb2 == null || (b = lb2.b()) == null) {
            return cb2;
        }
        a aVar = new a(this, cb2.a().m(), lb2, wd2.c(b));
        String k = cb2.k("Content-Type");
        long h = cb2.a().h();
        cb2.a A = cb2.A();
        A.b(new ec2(k, h, wd2.d(aVar)));
        return A.c();
    }

    private static sa2 c(sa2 sa2, sa2 sa22) {
        sa2.a aVar = new sa2.a();
        int h = sa2.h();
        for (int i = 0; i < h; i++) {
            String e = sa2.e(i);
            String i2 = sa2.i(i);
            if ((!"Warning".equalsIgnoreCase(e) || !i2.startsWith("1")) && (d(e) || !e(e) || sa22.c(e) == null)) {
                gb2.a.b(aVar, e, i2);
            }
        }
        int h2 = sa22.h();
        for (int i3 = 0; i3 < h2; i3++) {
            String e2 = sa22.e(i3);
            if (!d(e2) && e(e2)) {
                gb2.a.b(aVar, e2, sa22.i(i3));
            }
        }
        return aVar.d();
    }

    static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static cb2 f(cb2 cb2) {
        if (cb2 == null || cb2.a() == null) {
            return cb2;
        }
        cb2.a A = cb2.A();
        A.b((db2) null);
        return A.c();
    }

    public cb2 a(ua2.a aVar) {
        pb2 pb2 = this.a;
        cb2 e = pb2 != null ? pb2.e(aVar.i()) : null;
        mb2 c = new mb2.a(System.currentTimeMillis(), aVar.i(), e).c();
        ab2 ab2 = c.a;
        cb2 cb2 = c.b;
        pb2 pb22 = this.a;
        if (pb22 != null) {
            pb22.b(c);
        }
        if (e != null && cb2 == null) {
            ib2.g(e.a());
        }
        if (ab2 == null && cb2 == null) {
            cb2.a aVar2 = new cb2.a();
            aVar2.p(aVar.i());
            aVar2.n(ya2.HTTP_1_1);
            aVar2.g(504);
            aVar2.k("Unsatisfiable Request (only-if-cached)");
            aVar2.b(ib2.c);
            aVar2.q(-1);
            aVar2.o(System.currentTimeMillis());
            return aVar2.c();
        } else if (ab2 == null) {
            cb2.a A = cb2.A();
            A.d(f(cb2));
            return A.c();
        } else {
            try {
                cb2 c2 = aVar.c(ab2);
                if (c2 == null && e != null) {
                }
                if (cb2 != null) {
                    if (c2.h() == 304) {
                        cb2.a A2 = cb2.A();
                        A2.j(c(cb2.m(), c2.m()));
                        A2.q(c2.G());
                        A2.o(c2.E());
                        A2.d(f(cb2));
                        A2.l(f(c2));
                        cb2 c3 = A2.c();
                        c2.a().close();
                        this.a.a();
                        this.a.f(cb2, c3);
                        return c3;
                    }
                    ib2.g(cb2.a());
                }
                cb2.a A3 = c2.A();
                A3.d(f(cb2));
                A3.l(f(c2));
                cb2 c4 = A3.c();
                if (this.a != null) {
                    if (bc2.c(c4) && mb2.a(c4, ab2)) {
                        return b(this.a.d(c4), c4);
                    }
                    if (cc2.a(ab2.g())) {
                        try {
                            this.a.c(ab2);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c4;
            } finally {
                if (e != null) {
                    ib2.g(e.a());
                }
            }
        }
    }
}
