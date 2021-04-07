package defpackage;

import defpackage.ab2;
import defpackage.cb2;
import defpackage.sa2;
import defpackage.ua2;
import java.util.List;

/* renamed from: xb2  reason: default package */
public final class xb2 implements ua2 {
    private final ma2 a;

    public xb2(ma2 ma2) {
        this.a = ma2;
    }

    private String b(List<la2> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            la2 la2 = list.get(i);
            sb.append(la2.c());
            sb.append('=');
            sb.append(la2.k());
        }
        return sb.toString();
    }

    public cb2 a(ua2.a aVar) {
        ab2 i = aVar.i();
        ab2.a h = i.h();
        bb2 a2 = i.a();
        if (a2 != null) {
            va2 b = a2.b();
            if (b != null) {
                h.d("Content-Type", b.toString());
            }
            long a3 = a2.a();
            if (a3 != -1) {
                h.d("Content-Length", Long.toString(a3));
                h.g("Transfer-Encoding");
            } else {
                h.d("Transfer-Encoding", "chunked");
                h.g("Content-Length");
            }
        }
        boolean z = false;
        if (i.c("Host") == null) {
            h.d("Host", ib2.s(i.j(), false));
        }
        if (i.c("Connection") == null) {
            h.d("Connection", "Keep-Alive");
        }
        if (i.c("Accept-Encoding") == null && i.c("Range") == null) {
            z = true;
            h.d("Accept-Encoding", "gzip");
        }
        List<la2> b2 = this.a.b(i.j());
        if (!b2.isEmpty()) {
            h.d("Cookie", b(b2));
        }
        if (i.c("User-Agent") == null) {
            h.d("User-Agent", jb2.a());
        }
        cb2 c = aVar.c(h.b());
        bc2.g(this.a, i.j(), c.m());
        cb2.a A = c.A();
        A.p(i);
        if (z && "gzip".equalsIgnoreCase(c.k("Content-Encoding")) && bc2.c(c)) {
            ud2 ud2 = new ud2(c.a().m());
            sa2.a f = c.m().f();
            f.f("Content-Encoding");
            f.f("Content-Length");
            A.j(f.d());
            A.b(new ec2(c.k("Content-Type"), -1, wd2.d(ud2)));
        }
        return A.c();
    }
}
