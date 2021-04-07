package defpackage;

import defpackage.cb2;
import defpackage.ea2;
import defpackage.pa2;
import defpackage.sa2;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: xa2  reason: default package */
public class xa2 implements Cloneable, ea2.a {
    static final List<ya2> G = ib2.u(ya2.HTTP_2, ya2.HTTP_1_1);
    static final List<ka2> H = ib2.u(ka2.g, ka2.h);
    final boolean A;
    final int B;
    final int C;
    final int D;
    final int E;
    final int F;
    final na2 e;
    @Nullable
    final Proxy f;
    final List<ya2> g;
    final List<ka2> h;
    final List<ua2> i;
    final List<ua2> j;
    final pa2.c k;
    final ProxySelector l;
    final ma2 m;
    @Nullable
    final ca2 n;
    @Nullable
    final pb2 o;
    final SocketFactory p;
    final SSLSocketFactory q;
    final hd2 r;
    final HostnameVerifier s;
    final ga2 t;
    final ba2 u;
    final ba2 v;
    final ja2 w;
    final oa2 x;
    final boolean y;
    final boolean z;

    /* renamed from: xa2$a */
    class a extends gb2 {
        a() {
        }

        public void a(sa2.a aVar, String str) {
            aVar.b(str);
        }

        public void b(sa2.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        public void c(ka2 ka2, SSLSocket sSLSocket, boolean z) {
            ka2.a(sSLSocket, z);
        }

        public int d(cb2.a aVar) {
            return aVar.c;
        }

        public boolean e(ja2 ja2, sb2 sb2) {
            return ja2.b(sb2);
        }

        public Socket f(ja2 ja2, aa2 aa2, wb2 wb2) {
            return ja2.c(aa2, wb2);
        }

        public boolean g(aa2 aa2, aa2 aa22) {
            return aa2.d(aa22);
        }

        public sb2 h(ja2 ja2, aa2 aa2, wb2 wb2, eb2 eb2) {
            return ja2.d(aa2, wb2, eb2);
        }

        public void i(ja2 ja2, sb2 sb2) {
            ja2.f(sb2);
        }

        public tb2 j(ja2 ja2) {
            return ja2.e;
        }

        @Nullable
        public IOException k(ea2 ea2, @Nullable IOException iOException) {
            return ((za2) ea2).j(iOException);
        }
    }

    /* renamed from: xa2$b */
    public static final class b {
        int A;
        int B;
        na2 a;
        @Nullable
        Proxy b;
        List<ya2> c;
        List<ka2> d;
        final List<ua2> e;
        final List<ua2> f;
        pa2.c g;
        ProxySelector h;
        ma2 i;
        @Nullable
        ca2 j;
        @Nullable
        pb2 k;
        SocketFactory l;
        @Nullable
        SSLSocketFactory m;
        @Nullable
        hd2 n;
        HostnameVerifier o;
        ga2 p;
        ba2 q;
        ba2 r;
        ja2 s;
        oa2 t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public b() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new na2();
            this.c = xa2.G;
            this.d = xa2.H;
            this.g = pa2.k(pa2.a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new ed2();
            }
            this.i = ma2.a;
            this.l = SocketFactory.getDefault();
            this.o = id2.a;
            this.p = ga2.c;
            ba2 ba2 = ba2.a;
            this.q = ba2;
            this.r = ba2;
            this.s = new ja2();
            this.t = oa2.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        b(xa2 xa2) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = xa2.e;
            this.b = xa2.f;
            this.c = xa2.g;
            this.d = xa2.h;
            this.e.addAll(xa2.i);
            this.f.addAll(xa2.j);
            this.g = xa2.k;
            this.h = xa2.l;
            this.i = xa2.m;
            this.k = xa2.o;
            this.j = xa2.n;
            this.l = xa2.p;
            this.m = xa2.q;
            this.n = xa2.r;
            this.o = xa2.s;
            this.p = xa2.t;
            this.q = xa2.u;
            this.r = xa2.v;
            this.s = xa2.w;
            this.t = xa2.x;
            this.u = xa2.y;
            this.v = xa2.z;
            this.w = xa2.A;
            this.x = xa2.B;
            this.y = xa2.C;
            this.z = xa2.D;
            this.A = xa2.E;
            this.B = xa2.F;
        }

        public b a(ua2 ua2) {
            if (ua2 != null) {
                this.e.add(ua2);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public xa2 b() {
            return new xa2(this);
        }

        public b c(@Nullable ca2 ca2) {
            this.j = ca2;
            this.k = null;
            return this;
        }

        public b d(long j2, TimeUnit timeUnit) {
            this.x = ib2.e("timeout", j2, timeUnit);
            return this;
        }

        public b e(long j2, TimeUnit timeUnit) {
            this.y = ib2.e("timeout", j2, timeUnit);
            return this;
        }

        public b f(long j2, TimeUnit timeUnit) {
            this.z = ib2.e("timeout", j2, timeUnit);
            return this;
        }
    }

    static {
        gb2.a = new a();
    }

    public xa2() {
        this(new b());
    }

    xa2(b bVar) {
        boolean z2;
        hd2 hd2;
        this.e = bVar.a;
        this.f = bVar.b;
        this.g = bVar.c;
        this.h = bVar.d;
        this.i = ib2.t(bVar.e);
        this.j = ib2.t(bVar.f);
        this.k = bVar.g;
        this.l = bVar.h;
        this.m = bVar.i;
        this.n = bVar.j;
        this.o = bVar.k;
        this.p = bVar.l;
        Iterator<ka2> it = this.h.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ka2 next = it.next();
                if (z2 || next.d()) {
                    z2 = true;
                }
            }
        }
        if (bVar.m != null || !z2) {
            this.q = bVar.m;
            hd2 = bVar.n;
        } else {
            X509TrustManager C2 = ib2.C();
            this.q = y(C2);
            hd2 = hd2.b(C2);
        }
        this.r = hd2;
        if (this.q != null) {
            dd2.j().f(this.q);
        }
        this.s = bVar.o;
        this.t = bVar.p.f(this.r);
        this.u = bVar.q;
        this.v = bVar.r;
        this.w = bVar.s;
        this.x = bVar.t;
        this.y = bVar.u;
        this.z = bVar.v;
        this.A = bVar.w;
        this.B = bVar.x;
        this.C = bVar.y;
        this.D = bVar.z;
        this.E = bVar.A;
        this.F = bVar.B;
        if (this.i.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.i);
        } else if (this.j.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.j);
        }
    }

    private static SSLSocketFactory y(X509TrustManager x509TrustManager) {
        try {
            SSLContext l2 = dd2.j().l();
            l2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return l2.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw ib2.b("No System TLS", e2);
        }
    }

    public int A() {
        return this.F;
    }

    public List<ya2> B() {
        return this.g;
    }

    @Nullable
    public Proxy C() {
        return this.f;
    }

    public ba2 D() {
        return this.u;
    }

    public ProxySelector G() {
        return this.l;
    }

    public int H() {
        return this.D;
    }

    public boolean I() {
        return this.A;
    }

    public SocketFactory K() {
        return this.p;
    }

    public SSLSocketFactory L() {
        return this.q;
    }

    public int O() {
        return this.E;
    }

    public ea2 b(ab2 ab2) {
        return za2.f(this, ab2, false);
    }

    public ba2 c() {
        return this.v;
    }

    public int d() {
        return this.B;
    }

    public ga2 e() {
        return this.t;
    }

    public int f() {
        return this.C;
    }

    public ja2 g() {
        return this.w;
    }

    public List<ka2> j() {
        return this.h;
    }

    public ma2 n() {
        return this.m;
    }

    public na2 o() {
        return this.e;
    }

    public oa2 p() {
        return this.x;
    }

    public pa2.c q() {
        return this.k;
    }

    public boolean r() {
        return this.z;
    }

    public boolean s() {
        return this.y;
    }

    public HostnameVerifier t() {
        return this.s;
    }

    public List<ua2> u() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public pb2 v() {
        ca2 ca2 = this.n;
        return ca2 != null ? ca2.e : this.o;
    }

    public List<ua2> w() {
        return this.j;
    }

    public b x() {
        return new b(this);
    }
}
