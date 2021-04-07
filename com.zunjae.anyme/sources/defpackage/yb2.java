package defpackage;

import defpackage.cb2;
import defpackage.ua2;
import java.net.ProtocolException;

/* renamed from: yb2  reason: default package */
public final class yb2 implements ua2 {
    private final boolean a;

    /* renamed from: yb2$a */
    static final class a extends rd2 {
        long f;

        a(ce2 ce2) {
            super(ce2);
        }

        public void X(nd2 nd2, long j) {
            super.X(nd2, j);
            this.f += j;
        }
    }

    public yb2(boolean z) {
        this.a = z;
    }

    public cb2 a(ua2.a aVar) {
        cb2.a aVar2;
        db2 db2;
        dc2 dc2 = (dc2) aVar;
        zb2 h = dc2.h();
        wb2 k = dc2.k();
        sb2 sb2 = (sb2) dc2.d();
        ab2 i = dc2.i();
        long currentTimeMillis = System.currentTimeMillis();
        dc2.g().o(dc2.f());
        h.b(i);
        dc2.g().n(dc2.f(), i);
        cb2.a aVar3 = null;
        if (cc2.b(i.g()) && i.a() != null) {
            if ("100-continue".equalsIgnoreCase(i.c("Expect"))) {
                h.e();
                dc2.g().s(dc2.f());
                aVar3 = h.d(true);
            }
            if (aVar3 == null) {
                dc2.g().m(dc2.f());
                a aVar4 = new a(h.f(i, i.a().a()));
                od2 c = wd2.c(aVar4);
                i.a().h(c);
                c.close();
                dc2.g().l(dc2.f(), aVar4.f);
            } else if (!sb2.o()) {
                k.j();
            }
        }
        h.a();
        if (aVar3 == null) {
            dc2.g().s(dc2.f());
            aVar3 = h.d(false);
        }
        aVar3.p(i);
        aVar3.h(k.d().l());
        aVar3.q(currentTimeMillis);
        aVar3.o(System.currentTimeMillis());
        cb2 c2 = aVar3.c();
        int h2 = c2.h();
        if (h2 == 100) {
            cb2.a d = h.d(false);
            d.p(i);
            d.h(k.d().l());
            d.q(currentTimeMillis);
            d.o(System.currentTimeMillis());
            c2 = d.c();
            h2 = c2.h();
        }
        dc2.g().r(dc2.f(), c2);
        if (!this.a || h2 != 101) {
            aVar2 = c2.A();
            db2 = h.c(c2);
        } else {
            aVar2 = c2.A();
            db2 = ib2.c;
        }
        aVar2.b(db2);
        cb2 c3 = aVar2.c();
        if ("close".equalsIgnoreCase(c3.F().c("Connection")) || "close".equalsIgnoreCase(c3.k("Connection"))) {
            k.j();
        }
        if ((h2 != 204 && h2 != 205) || c3.a().h() <= 0) {
            return c3;
        }
        throw new ProtocolException("HTTP " + h2 + " had non-zero Content-Length: " + c3.a().h());
    }
}
