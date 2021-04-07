package defpackage;

import defpackage.cb2;
import defpackage.sa2;
import defpackage.ua2;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: oc2  reason: default package */
public final class oc2 implements zb2 {
    private static final List<String> f = ib2.u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> g = ib2.u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final ua2.a a;
    final wb2 b;
    private final pc2 c;
    private rc2 d;
    private final ya2 e;

    /* renamed from: oc2$a */
    class a extends sd2 {
        boolean f = false;
        long g = 0;

        a(de2 de2) {
            super(de2);
        }

        private void b(IOException iOException) {
            if (!this.f) {
                this.f = true;
                oc2 oc2 = oc2.this;
                oc2.b.r(false, oc2, this.g, iOException);
            }
        }

        public void close() {
            super.close();
            b((IOException) null);
        }

        public long y0(nd2 nd2, long j) {
            try {
                long y0 = a().y0(nd2, j);
                if (y0 > 0) {
                    this.g += y0;
                }
                return y0;
            } catch (IOException e) {
                b(e);
                throw e;
            }
        }
    }

    public oc2(xa2 xa2, ua2.a aVar, wb2 wb2, pc2 pc2) {
        this.a = aVar;
        this.b = wb2;
        this.c = pc2;
        this.e = xa2.B().contains(ya2.H2_PRIOR_KNOWLEDGE) ? ya2.H2_PRIOR_KNOWLEDGE : ya2.HTTP_2;
    }

    public static List<lc2> g(ab2 ab2) {
        sa2 e2 = ab2.e();
        ArrayList arrayList = new ArrayList(e2.h() + 4);
        arrayList.add(new lc2(lc2.f, ab2.g()));
        arrayList.add(new lc2(lc2.g, fc2.c(ab2.j())));
        String c2 = ab2.c("Host");
        if (c2 != null) {
            arrayList.add(new lc2(lc2.i, c2));
        }
        arrayList.add(new lc2(lc2.h, ab2.j().E()));
        int h = e2.h();
        for (int i = 0; i < h; i++) {
            qd2 m = qd2.m(e2.e(i).toLowerCase(Locale.US));
            if (!f.contains(m.G())) {
                arrayList.add(new lc2(m, e2.i(i)));
            }
        }
        return arrayList;
    }

    public static cb2.a h(sa2 sa2, ya2 ya2) {
        sa2.a aVar = new sa2.a();
        int h = sa2.h();
        hc2 hc2 = null;
        for (int i = 0; i < h; i++) {
            String e2 = sa2.e(i);
            String i2 = sa2.i(i);
            if (e2.equals(":status")) {
                hc2 = hc2.a("HTTP/1.1 " + i2);
            } else if (!g.contains(e2)) {
                gb2.a.b(aVar, e2, i2);
            }
        }
        if (hc2 != null) {
            cb2.a aVar2 = new cb2.a();
            aVar2.n(ya2);
            aVar2.g(hc2.b);
            aVar2.k(hc2.c);
            aVar2.j(aVar.d());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public void a() {
        this.d.j().close();
    }

    public void b(ab2 ab2) {
        if (this.d == null) {
            rc2 A = this.c.A(g(ab2), ab2.a() != null);
            this.d = A;
            A.n().g((long) this.a.a(), TimeUnit.MILLISECONDS);
            this.d.u().g((long) this.a.b(), TimeUnit.MILLISECONDS);
        }
    }

    public db2 c(cb2 cb2) {
        wb2 wb2 = this.b;
        wb2.f.q(wb2.e);
        return new ec2(cb2.k("Content-Type"), bc2.b(cb2), wd2.d(new a(this.d.k())));
    }

    public void cancel() {
        rc2 rc2 = this.d;
        if (rc2 != null) {
            rc2.h(kc2.CANCEL);
        }
    }

    public cb2.a d(boolean z) {
        cb2.a h = h(this.d.s(), this.e);
        if (!z || gb2.a.d(h) != 100) {
            return h;
        }
        return null;
    }

    public void e() {
        this.c.flush();
    }

    public ce2 f(ab2 ab2, long j) {
        return this.d.j();
    }
}
