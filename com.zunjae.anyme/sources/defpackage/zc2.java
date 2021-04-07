package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* renamed from: zc2  reason: default package */
public class zc2 extends dd2 {
    private zc2() {
    }

    public static zc2 s() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new zc2();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider t() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<ya2> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) dd2.b(list).toArray(new String[0]));
            return;
        }
        super.g(sSLSocket, str, list);
    }

    public SSLContext l() {
        try {
            return SSLContext.getInstance("TLSv1.3", t());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", t());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Nullable
    public String m(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.m(sSLSocket);
    }
}
