package defpackage;

import defpackage.ab2;
import defpackage.cb2;
import defpackage.pc2;
import defpackage.ua2;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: sb2  reason: default package */
public final class sb2 extends pc2.h implements ia2 {
    private final ja2 b;
    private final eb2 c;
    private Socket d;
    private Socket e;
    private ra2 f;
    private ya2 g;
    private pc2 h;
    private pd2 i;
    private od2 j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<wb2>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public sb2(ja2 ja2, eb2 eb2) {
        this.b = ja2;
        this.c = eb2;
    }

    private void f(int i2, int i3, ea2 ea2, pa2 pa2) {
        Proxy b2 = this.c.b();
        this.d = (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) ? this.c.a().j().createSocket() : new Socket(b2);
        pa2.f(ea2, this.c.d(), b2);
        this.d.setSoTimeout(i3);
        try {
            dd2.j().h(this.d, this.c.d(), i2);
            try {
                this.i = wd2.d(wd2.m(this.d));
                this.j = wd2.c(wd2.i(this.d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.c.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0137 A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013d A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(defpackage.rb2 r8) {
        /*
            r7 = this;
            eb2 r0 = r7.c
            aa2 r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            java.net.Socket r3 = r7.d     // Catch:{ AssertionError -> 0x0130 }
            ta2 r4 = r0.l()     // Catch:{ AssertionError -> 0x0130 }
            java.lang.String r4 = r4.m()     // Catch:{ AssertionError -> 0x0130 }
            ta2 r5 = r0.l()     // Catch:{ AssertionError -> 0x0130 }
            int r5 = r5.z()     // Catch:{ AssertionError -> 0x0130 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0130 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0130 }
            ka2 r8 = r8.a(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r3 = r8.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r3 == 0) goto L_0x0041
            dd2 r3 = defpackage.dd2.j()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            ta2 r4 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r4 = r4.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r5 = r0.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r3.g(r1, r4, r5)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            ra2 r4 = defpackage.ra2.b(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            ta2 r6 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r6 = r6.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.e()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.<init>()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            ta2 r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = defpackage.ga2.c(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r8 = defpackage.id2.a(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            throw r2     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.<init>()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            ta2 r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            throw r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00d8:
            ga2 r3 = r0.a()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            ta2 r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r5 = r4.e()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r3.a(r0, r5)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r8 = r8.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r8 == 0) goto L_0x00f9
            dd2 r8 = defpackage.dd2.j()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r2 = r8.m(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00f9:
            r7.e = r1     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            de2 r8 = defpackage.wd2.m(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            pd2 r8 = defpackage.wd2.d(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.i = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.net.Socket r8 = r7.e     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            ce2 r8 = defpackage.wd2.i(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            od2 r8 = defpackage.wd2.c(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.j = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.f = r4     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r2 == 0) goto L_0x011a
            ya2 r8 = defpackage.ya2.get(r2)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            goto L_0x011c
        L_0x011a:
            ya2 r8 = defpackage.ya2.HTTP_1_1     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x011c:
            r7.g = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r1 == 0) goto L_0x0127
            dd2 r8 = defpackage.dd2.j()
            r8.a(r1)
        L_0x0127:
            return
        L_0x0128:
            r8 = move-exception
            r2 = r1
            goto L_0x013e
        L_0x012b:
            r8 = move-exception
            r2 = r1
            goto L_0x0131
        L_0x012e:
            r8 = move-exception
            goto L_0x013e
        L_0x0130:
            r8 = move-exception
        L_0x0131:
            boolean r0 = defpackage.ib2.A(r8)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x013d
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012e }
            r0.<init>(r8)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x013d:
            throw r8     // Catch:{ all -> 0x012e }
        L_0x013e:
            if (r2 == 0) goto L_0x0147
            dd2 r0 = defpackage.dd2.j()
            r0.a(r2)
        L_0x0147:
            defpackage.ib2.h(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb2.g(rb2):void");
    }

    private void h(int i2, int i3, int i4, ea2 ea2, pa2 pa2) {
        ab2 j2 = j();
        ta2 j3 = j2.j();
        int i5 = 0;
        while (i5 < 21) {
            f(i2, i3, ea2, pa2);
            j2 = i(i3, i4, j2, j3);
            if (j2 != null) {
                ib2.h(this.d);
                this.d = null;
                this.j = null;
                this.i = null;
                pa2.d(ea2, this.c.d(), this.c.b(), (ya2) null);
                i5++;
            } else {
                return;
            }
        }
    }

    private ab2 i(int i2, int i3, ab2 ab2, ta2 ta2) {
        String str = "CONNECT " + ib2.s(ta2, true) + " HTTP/1.1";
        while (true) {
            ic2 ic2 = new ic2((xa2) null, (wb2) null, this.i, this.j);
            this.i.c().g((long) i2, TimeUnit.MILLISECONDS);
            this.j.c().g((long) i3, TimeUnit.MILLISECONDS);
            ic2.o(ab2.e(), str);
            ic2.a();
            cb2.a d2 = ic2.d(false);
            d2.p(ab2);
            cb2 c2 = d2.c();
            long b2 = bc2.b(c2);
            if (b2 == -1) {
                b2 = 0;
            }
            de2 k2 = ic2.k(b2);
            ib2.D(k2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            k2.close();
            int h2 = c2.h();
            if (h2 != 200) {
                if (h2 == 407) {
                    ab2 a = this.c.a().h().a(this.c, c2);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c2.k("Connection"))) {
                        return a;
                    } else {
                        ab2 = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c2.h());
                }
            } else if (this.i.d().v() && this.j.d().v()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private ab2 j() {
        ab2.a aVar = new ab2.a();
        aVar.j(this.c.a().l());
        aVar.f("CONNECT", (bb2) null);
        aVar.d("Host", ib2.s(this.c.a().l(), true));
        aVar.d("Proxy-Connection", "Keep-Alive");
        aVar.d("User-Agent", jb2.a());
        ab2 b2 = aVar.b();
        cb2.a aVar2 = new cb2.a();
        aVar2.p(b2);
        aVar2.n(ya2.HTTP_1_1);
        aVar2.g(407);
        aVar2.k("Preemptive Authenticate");
        aVar2.b(ib2.c);
        aVar2.q(-1);
        aVar2.o(-1);
        aVar2.i("Proxy-Authenticate", "OkHttp-Preemptive");
        ab2 a = this.c.a().h().a(this.c, aVar2.c());
        return a != null ? a : b2;
    }

    private void k(rb2 rb2, int i2, ea2 ea2, pa2 pa2) {
        if (this.c.a().k() != null) {
            pa2.u(ea2);
            g(rb2);
            pa2.t(ea2, this.f);
            if (this.g == ya2.HTTP_2) {
                s(i2);
            }
        } else if (this.c.a().f().contains(ya2.H2_PRIOR_KNOWLEDGE)) {
            this.e = this.d;
            this.g = ya2.H2_PRIOR_KNOWLEDGE;
            s(i2);
        } else {
            this.e = this.d;
            this.g = ya2.HTTP_1_1;
        }
    }

    private void s(int i2) {
        this.e.setSoTimeout(0);
        pc2.g gVar = new pc2.g(true);
        gVar.d(this.e, this.c.a().l().m(), this.i, this.j);
        gVar.b(this);
        gVar.c(i2);
        pc2 a = gVar.a();
        this.h = a;
        a.M();
    }

    public ya2 a() {
        return this.g;
    }

    public void b(pc2 pc2) {
        synchronized (this.b) {
            this.m = pc2.t();
        }
    }

    public void c(rc2 rc2) {
        rc2.f(kc2.REFUSED_STREAM);
    }

    public void d() {
        ib2.h(this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r17, int r18, int r19, int r20, boolean r21, defpackage.ea2 r22, defpackage.pa2 r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            ya2 r0 = r7.g
            if (r0 != 0) goto L_0x0150
            eb2 r0 = r7.c
            aa2 r0 = r0.a()
            java.util.List r0 = r0.b()
            rb2 r10 = new rb2
            r10.<init>(r0)
            eb2 r1 = r7.c
            aa2 r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0074
            ka2 r1 = defpackage.ka2.h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            eb2 r0 = r7.c
            aa2 r0 = r0.a()
            ta2 r0 = r0.l()
            java.lang.String r0 = r0.m()
            dd2 r1 = defpackage.dd2.j()
            boolean r1 = r1.o(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            ub2 r1 = new ub2
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            ub2 r0 = new ub2
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            eb2 r0 = r7.c
            aa2 r0 = r0.a()
            java.util.List r0 = r0.f()
            ya2 r1 = defpackage.ya2.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            eb2 r0 = r7.c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.h(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.f(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.k(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            eb2 r0 = r7.c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00f5 }
            eb2 r1 = r7.c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00f5 }
            ya2 r2 = r7.g     // Catch:{ IOException -> 0x00f5 }
            r9.d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            eb2 r0 = r7.c
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            ub2 r1 = new ub2
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            pc2 r0 = r7.h
            if (r0 == 0) goto L_0x00f4
            ja2 r1 = r7.b
            monitor-enter(r1)
            pc2 r0 = r7.h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.t()     // Catch:{ all -> 0x00f1 }
            r7.m = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.e
            defpackage.ib2.h(r1)
            java.net.Socket r1 = r7.d
            defpackage.ib2.h(r1)
            r7.e = r11
            r7.d = r11
            r7.i = r11
            r7.j = r11
            r7.f = r11
            r7.g = r11
            r7.h = r11
            eb2 r1 = r7.c
            java.net.InetSocketAddress r3 = r1.d()
            eb2 r1 = r7.c
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            ub2 r12 = new ub2
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            ub2 r0 = new ub2
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb2.e(int, int, int, int, boolean, ea2, pa2):void");
    }

    public ra2 l() {
        return this.f;
    }

    public boolean m(aa2 aa2, @Nullable eb2 eb2) {
        if (this.n.size() >= this.m || this.k || !gb2.a.g(this.c.a(), aa2)) {
            return false;
        }
        if (aa2.l().m().equals(q().a().l().m())) {
            return true;
        }
        if (this.h == null || eb2 == null || eb2.b().type() != Proxy.Type.DIRECT || this.c.b().type() != Proxy.Type.DIRECT || !this.c.d().equals(eb2.d()) || eb2.a().e() != id2.a || !t(aa2.l())) {
            return false;
        }
        try {
            aa2.a().a(aa2.l().m(), l().e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean n(boolean z) {
        int soTimeout;
        if (this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        pc2 pc2 = this.h;
        if (pc2 != null) {
            return !pc2.r();
        }
        if (z) {
            try {
                soTimeout = this.e.getSoTimeout();
                this.e.setSoTimeout(1);
                if (this.i.v()) {
                    this.e.setSoTimeout(soTimeout);
                    return false;
                }
                this.e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public boolean o() {
        return this.h != null;
    }

    public zb2 p(xa2 xa2, ua2.a aVar, wb2 wb2) {
        if (this.h != null) {
            return new oc2(xa2, aVar, wb2, this.h);
        }
        this.e.setSoTimeout(aVar.a());
        this.i.c().g((long) aVar.a(), TimeUnit.MILLISECONDS);
        this.j.c().g((long) aVar.b(), TimeUnit.MILLISECONDS);
        return new ic2(xa2, wb2, this.i, this.j);
    }

    public eb2 q() {
        return this.c;
    }

    public Socket r() {
        return this.e;
    }

    public boolean t(ta2 ta2) {
        if (ta2.z() != this.c.a().l().z()) {
            return false;
        }
        if (!ta2.m().equals(this.c.a().l().m())) {
            return this.f != null && id2.a.c(ta2.m(), (X509Certificate) this.f.e().get(0));
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.c.a().l().m());
        sb.append(":");
        sb.append(this.c.a().l().z());
        sb.append(", proxy=");
        sb.append(this.c.b());
        sb.append(" hostAddress=");
        sb.append(this.c.d());
        sb.append(" cipherSuite=");
        ra2 ra2 = this.f;
        sb.append(ra2 != null ? ra2.a() : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
