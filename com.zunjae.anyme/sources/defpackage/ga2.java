package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: ga2  reason: default package */
public final class ga2 {
    public static final ga2 c = new a().a();
    private final Set<b> a;
    @Nullable
    private final hd2 b;

    /* renamed from: ga2$a */
    public static final class a {
        private final List<b> a = new ArrayList();

        public ga2 a() {
            return new ga2(new LinkedHashSet(this.a), (hd2) null);
        }
    }

    /* renamed from: ga2$b */
    static final class b {
        final String a;
        final String b;
        final String c;
        final qd2 d;

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            if (!this.a.startsWith("*.")) {
                return str.equals(this.b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.b.length()) {
                String str2 = this.b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
            }
        }

        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return this.c + this.d.a();
        }
    }

    ga2(Set<b> set, @Nullable hd2 hd2) {
        this.a = set;
        this.b = hd2;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + e((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static qd2 d(X509Certificate x509Certificate) {
        return qd2.t(x509Certificate.getPublicKey().getEncoded()).x();
    }

    static qd2 e(X509Certificate x509Certificate) {
        return qd2.t(x509Certificate.getPublicKey().getEncoded()).z();
    }

    public void a(String str, List<Certificate> list) {
        List<b> b2 = b(str);
        if (!b2.isEmpty()) {
            hd2 hd2 = this.b;
            if (hd2 != null) {
                list = hd2.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = b2.size();
                qd2 qd2 = null;
                qd2 qd22 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    b bVar = b2.get(i2);
                    if (bVar.c.equals("sha256/")) {
                        if (qd2 == null) {
                            qd2 = e(x509Certificate);
                        }
                        if (bVar.d.equals(qd2)) {
                            return;
                        }
                    } else if (bVar.c.equals("sha1/")) {
                        if (qd22 == null) {
                            qd22 = d(x509Certificate);
                        }
                        if (bVar.d.equals(qd22)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(c(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = b2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(b2.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public List<b> b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b next : this.a) {
            if (next.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ga2) {
            ga2 ga2 = (ga2) obj;
            return ib2.q(this.b, ga2.b) && this.a.equals(ga2.a);
        }
    }

    /* access modifiers changed from: package-private */
    public ga2 f(@Nullable hd2 hd2) {
        return ib2.q(this.b, hd2) ? this : new ga2(this.a, hd2);
    }

    public int hashCode() {
        hd2 hd2 = this.b;
        return ((hd2 != null ? hd2.hashCode() : 0) * 31) + this.a.hashCode();
    }
}
