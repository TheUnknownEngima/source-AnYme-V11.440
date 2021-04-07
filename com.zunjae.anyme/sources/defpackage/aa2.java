package defpackage;

import defpackage.ta2;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: aa2  reason: default package */
public final class aa2 {
    final ta2 a;
    final oa2 b;
    final SocketFactory c;
    final ba2 d;
    final List<ya2> e;
    final List<ka2> f;
    final ProxySelector g;
    @Nullable
    final Proxy h;
    @Nullable
    final SSLSocketFactory i;
    @Nullable
    final HostnameVerifier j;
    @Nullable
    final ga2 k;

    public aa2(String str, int i2, oa2 oa2, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable ga2 ga2, ba2 ba2, @Nullable Proxy proxy, List<ya2> list, List<ka2> list2, ProxySelector proxySelector) {
        ta2.a aVar = new ta2.a();
        aVar.s(sSLSocketFactory != null ? "https" : "http");
        aVar.g(str);
        aVar.n(i2);
        this.a = aVar.c();
        if (oa2 != null) {
            this.b = oa2;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (ba2 != null) {
                    this.d = ba2;
                    if (list != null) {
                        this.e = ib2.t(list);
                        if (list2 != null) {
                            this.f = ib2.t(list2);
                            if (proxySelector != null) {
                                this.g = proxySelector;
                                this.h = proxy;
                                this.i = sSLSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = ga2;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    @Nullable
    public ga2 a() {
        return this.k;
    }

    public List<ka2> b() {
        return this.f;
    }

    public oa2 c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean d(aa2 aa2) {
        return this.b.equals(aa2.b) && this.d.equals(aa2.d) && this.e.equals(aa2.e) && this.f.equals(aa2.f) && this.g.equals(aa2.g) && ib2.q(this.h, aa2.h) && ib2.q(this.i, aa2.i) && ib2.q(this.j, aa2.j) && ib2.q(this.k, aa2.k) && l().z() == aa2.l().z();
    }

    @Nullable
    public HostnameVerifier e() {
        return this.j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof aa2) {
            aa2 aa2 = (aa2) obj;
            return this.a.equals(aa2.a) && d(aa2);
        }
    }

    public List<ya2> f() {
        return this.e;
    }

    @Nullable
    public Proxy g() {
        return this.h;
    }

    public ba2 h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int i2 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        ga2 ga2 = this.k;
        if (ga2 != null) {
            i2 = ga2.hashCode();
        }
        return hashCode4 + i2;
    }

    public ProxySelector i() {
        return this.g;
    }

    public SocketFactory j() {
        return this.c;
    }

    @Nullable
    public SSLSocketFactory k() {
        return this.i;
    }

    public ta2 l() {
        return this.a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.m());
        sb.append(":");
        sb.append(this.a.z());
        if (this.h != null) {
            sb.append(", proxy=");
            obj = this.h;
        } else {
            sb.append(", proxySelector=");
            obj = this.g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
