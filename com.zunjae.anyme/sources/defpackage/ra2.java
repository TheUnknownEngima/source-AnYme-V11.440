package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: ra2  reason: default package */
public final class ra2 {
    private final fb2 a;
    private final ha2 b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    private ra2(fb2 fb2, ha2 ha2, List<Certificate> list, List<Certificate> list2) {
        this.a = fb2;
        this.b = ha2;
        this.c = list;
        this.d = list2;
    }

    public static ra2 b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            ha2 a2 = ha2.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                fb2 forJavaName = fb2.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List u = certificateArr != null ? ib2.u(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new ra2(forJavaName, a2, u, localCertificates != null ? ib2.u(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public static ra2 c(fb2 fb2, ha2 ha2, List<Certificate> list, List<Certificate> list2) {
        if (fb2 == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (ha2 != null) {
            return new ra2(fb2, ha2, ib2.t(list), ib2.t(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public ha2 a() {
        return this.b;
    }

    public List<Certificate> d() {
        return this.d;
    }

    public List<Certificate> e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ra2)) {
            return false;
        }
        ra2 ra2 = (ra2) obj;
        return this.a.equals(ra2.a) && this.b.equals(ra2.b) && this.c.equals(ra2.c) && this.d.equals(ra2.d);
    }

    public fb2 f() {
        return this.a;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
