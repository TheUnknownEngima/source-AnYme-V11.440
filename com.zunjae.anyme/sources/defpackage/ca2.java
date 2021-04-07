package defpackage;

import defpackage.ab2;
import defpackage.cb2;
import defpackage.nb2;
import defpackage.sa2;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: ca2  reason: default package */
public final class ca2 implements Closeable, Flushable {
    final pb2 e;
    final nb2 f;
    int g;
    int h;
    private int i;
    private int j;
    private int k;

    /* renamed from: ca2$a */
    class a implements pb2 {
        a() {
        }

        public void a() {
            ca2.this.m();
        }

        public void b(mb2 mb2) {
            ca2.this.r(mb2);
        }

        public void c(ab2 ab2) {
            ca2.this.l(ab2);
        }

        public lb2 d(cb2 cb2) {
            return ca2.this.i(cb2);
        }

        public cb2 e(ab2 ab2) {
            return ca2.this.b(ab2);
        }

        public void f(cb2 cb2, cb2 cb22) {
            ca2.this.t(cb2, cb22);
        }
    }

    /* renamed from: ca2$b */
    private final class b implements lb2 {
        private final nb2.c a;
        private ce2 b;
        private ce2 c;
        boolean d;

        /* renamed from: ca2$b$a */
        class a extends rd2 {
            final /* synthetic */ nb2.c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ce2 ce2, ca2 ca2, nb2.c cVar) {
                super(ce2);
                this.f = cVar;
            }

            public void close() {
                synchronized (ca2.this) {
                    if (!b.this.d) {
                        b.this.d = true;
                        ca2.this.g++;
                        super.close();
                        this.f.b();
                    }
                }
            }
        }

        b(nb2.c cVar) {
            this.a = cVar;
            ce2 d2 = cVar.d(1);
            this.b = d2;
            this.c = new a(d2, ca2.this, cVar);
        }

        public void a() {
            synchronized (ca2.this) {
                if (!this.d) {
                    this.d = true;
                    ca2.this.h++;
                    ib2.g(this.b);
                    try {
                        this.a.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public ce2 b() {
            return this.c;
        }
    }

    /* renamed from: ca2$c */
    private static class c extends db2 {
        final nb2.e f;
        private final pd2 g;
        @Nullable
        private final String h;
        @Nullable
        private final String i;

        /* renamed from: ca2$c$a */
        class a extends sd2 {
            final /* synthetic */ nb2.e f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, de2 de2, nb2.e eVar) {
                super(de2);
                this.f = eVar;
            }

            public void close() {
                this.f.close();
                super.close();
            }
        }

        c(nb2.e eVar, String str, String str2) {
            this.f = eVar;
            this.h = str;
            this.i = str2;
            this.g = wd2.d(new a(this, eVar.b(1), eVar));
        }

        public long h() {
            try {
                if (this.i != null) {
                    return Long.parseLong(this.i);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public va2 i() {
            String str = this.h;
            if (str != null) {
                return va2.d(str);
            }
            return null;
        }

        public pd2 m() {
            return this.g;
        }
    }

    /* renamed from: ca2$d */
    private static final class d {
        private static final String k = (dd2.j().k() + "-Sent-Millis");
        private static final String l = (dd2.j().k() + "-Received-Millis");
        private final String a;
        private final sa2 b;
        private final String c;
        private final ya2 d;
        private final int e;
        private final String f;
        private final sa2 g;
        @Nullable
        private final ra2 h;
        private final long i;
        private final long j;

        d(cb2 cb2) {
            this.a = cb2.F().j().toString();
            this.b = bc2.n(cb2);
            this.c = cb2.F().g();
            this.d = cb2.C();
            this.e = cb2.h();
            this.f = cb2.t();
            this.g = cb2.m();
            this.h = cb2.i();
            this.i = cb2.G();
            this.j = cb2.E();
        }

        d(de2 de2) {
            try {
                pd2 d2 = wd2.d(de2);
                this.a = d2.l0();
                this.c = d2.l0();
                sa2.a aVar = new sa2.a();
                int k2 = ca2.k(d2);
                for (int i2 = 0; i2 < k2; i2++) {
                    aVar.b(d2.l0());
                }
                this.b = aVar.d();
                hc2 a2 = hc2.a(d2.l0());
                this.d = a2.a;
                this.e = a2.b;
                this.f = a2.c;
                sa2.a aVar2 = new sa2.a();
                int k3 = ca2.k(d2);
                for (int i3 = 0; i3 < k3; i3++) {
                    aVar2.b(d2.l0());
                }
                String e2 = aVar2.e(k);
                String e3 = aVar2.e(l);
                aVar2.f(k);
                aVar2.f(l);
                long j2 = 0;
                this.i = e2 != null ? Long.parseLong(e2) : 0;
                this.j = e3 != null ? Long.parseLong(e3) : j2;
                this.g = aVar2.d();
                if (a()) {
                    String l0 = d2.l0();
                    if (l0.length() <= 0) {
                        this.h = ra2.c(!d2.v() ? fb2.forJavaName(d2.l0()) : fb2.SSL_3_0, ha2.a(d2.l0()), c(d2), c(d2));
                    } else {
                        throw new IOException("expected \"\" but was \"" + l0 + "\"");
                    }
                } else {
                    this.h = null;
                }
            } finally {
                de2.close();
            }
        }

        private boolean a() {
            return this.a.startsWith("https://");
        }

        private List<Certificate> c(pd2 pd2) {
            int k2 = ca2.k(pd2);
            if (k2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(k2);
                for (int i2 = 0; i2 < k2; i2++) {
                    String l0 = pd2.l0();
                    nd2 nd2 = new nd2();
                    nd2.v0(qd2.h(l0));
                    arrayList.add(instance.generateCertificate(nd2.f()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private void e(od2 od2, List<Certificate> list) {
            try {
                od2.I0((long) list.size()).w(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    od2.O(qd2.t(list.get(i2).getEncoded()).a()).w(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public boolean b(ab2 ab2, cb2 cb2) {
            return this.a.equals(ab2.j().toString()) && this.c.equals(ab2.g()) && bc2.o(cb2, this.b, ab2);
        }

        public cb2 d(nb2.e eVar) {
            String c2 = this.g.c("Content-Type");
            String c3 = this.g.c("Content-Length");
            ab2.a aVar = new ab2.a();
            aVar.i(this.a);
            aVar.f(this.c, (bb2) null);
            aVar.e(this.b);
            ab2 b2 = aVar.b();
            cb2.a aVar2 = new cb2.a();
            aVar2.p(b2);
            aVar2.n(this.d);
            aVar2.g(this.e);
            aVar2.k(this.f);
            aVar2.j(this.g);
            aVar2.b(new c(eVar, c2, c3));
            aVar2.h(this.h);
            aVar2.q(this.i);
            aVar2.o(this.j);
            return aVar2.c();
        }

        public void f(nb2.c cVar) {
            od2 c2 = wd2.c(cVar.d(0));
            c2.O(this.a).w(10);
            c2.O(this.c).w(10);
            c2.I0((long) this.b.h()).w(10);
            int h2 = this.b.h();
            for (int i2 = 0; i2 < h2; i2++) {
                c2.O(this.b.e(i2)).O(": ").O(this.b.i(i2)).w(10);
            }
            c2.O(new hc2(this.d, this.e, this.f).toString()).w(10);
            c2.I0((long) (this.g.h() + 2)).w(10);
            int h3 = this.g.h();
            for (int i3 = 0; i3 < h3; i3++) {
                c2.O(this.g.e(i3)).O(": ").O(this.g.i(i3)).w(10);
            }
            c2.O(k).O(": ").I0(this.i).w(10);
            c2.O(l).O(": ").I0(this.j).w(10);
            if (a()) {
                c2.w(10);
                c2.O(this.h.a().d()).w(10);
                e(c2, this.h.e());
                e(c2, this.h.d());
                c2.O(this.h.f().javaName()).w(10);
            }
            c2.close();
        }
    }

    public ca2(File file, long j2) {
        this(file, j2, xc2.a);
    }

    ca2(File file, long j2, xc2 xc2) {
        this.e = new a();
        this.f = nb2.h(xc2, file, 201105, 2, j2);
    }

    private void a(@Nullable nb2.c cVar) {
        if (cVar != null) {
            try {
                cVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public static String h(ta2 ta2) {
        return qd2.m(ta2.toString()).s().r();
    }

    static int k(pd2 pd2) {
        try {
            long H = pd2.H();
            String l0 = pd2.l0();
            if (H >= 0 && H <= 2147483647L && l0.isEmpty()) {
                return (int) H;
            }
            throw new IOException("expected an int but was \"" + H + l0 + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public cb2 b(ab2 ab2) {
        try {
            nb2.e m = this.f.m(h(ab2.j()));
            if (m == null) {
                return null;
            }
            try {
                d dVar = new d(m.b(0));
                cb2 d2 = dVar.d(m);
                if (dVar.b(ab2, d2)) {
                    return d2;
                }
                ib2.g(d2.a());
                return null;
            } catch (IOException unused) {
                ib2.g(m);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public void close() {
        this.f.close();
    }

    public void flush() {
        this.f.flush();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public lb2 i(cb2 cb2) {
        nb2.c cVar;
        String g2 = cb2.F().g();
        if (cc2.a(cb2.F().g())) {
            try {
                l(cb2.F());
            } catch (IOException unused) {
            }
            return null;
        } else if (!g2.equals("GET") || bc2.e(cb2)) {
            return null;
        } else {
            d dVar = new d(cb2);
            try {
                cVar = this.f.k(h(cb2.F().j()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.f(cVar);
                    return new b(cVar);
                } catch (IOException unused2) {
                    a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
                a(cVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(ab2 ab2) {
        this.f.G(h(ab2.j()));
    }

    /* access modifiers changed from: package-private */
    public synchronized void m() {
        this.j++;
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(mb2 mb2) {
        this.k++;
        if (mb2.a != null) {
            this.i++;
        } else if (mb2.b != null) {
            this.j++;
        }
    }

    /* access modifiers changed from: package-private */
    public void t(cb2 cb2, cb2 cb22) {
        nb2.c cVar;
        d dVar = new d(cb22);
        try {
            cVar = ((c) cb2.a()).f.a();
            if (cVar != null) {
                try {
                    dVar.f(cVar);
                    cVar.b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            cVar = null;
            a(cVar);
        }
    }
}
