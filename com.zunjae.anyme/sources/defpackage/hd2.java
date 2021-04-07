package defpackage;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: hd2  reason: default package */
public abstract class hd2 {
    public static hd2 b(X509TrustManager x509TrustManager) {
        return dd2.j().c(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
