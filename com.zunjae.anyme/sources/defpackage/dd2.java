package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: dd2  reason: default package */
public class dd2 {
    private static final dd2 a = i();
    private static final Logger b = Logger.getLogger(xa2.class.getName());

    public static List<String> b(List<ya2> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ya2 ya2 = list.get(i);
            if (ya2 != ya2.HTTP_1_0) {
                arrayList.add(ya2.toString());
            }
        }
        return arrayList;
    }

    static byte[] e(List<ya2> list) {
        nd2 nd2 = new nd2();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ya2 ya2 = list.get(i);
            if (ya2 != ya2.HTTP_1_0) {
                nd2.F0(ya2.toString().length());
                nd2.P0(ya2.toString());
            }
        }
        return nd2.U();
    }

    private static dd2 i() {
        zc2 s;
        dd2 u = yc2.u();
        if (u != null) {
            return u;
        }
        if (p() && (s = zc2.s()) != null) {
            return s;
        }
        ad2 s2 = ad2.s();
        if (s2 != null) {
            return s2;
        }
        dd2 s3 = bd2.s();
        return s3 != null ? s3 : new dd2();
    }

    public static dd2 j() {
        return a;
    }

    public static boolean p() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(SSLSocket sSLSocket) {
    }

    public hd2 c(X509TrustManager x509TrustManager) {
        return new fd2(d(x509TrustManager));
    }

    public jd2 d(X509TrustManager x509TrustManager) {
        return new gd2(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, @Nullable String str, List<ya2> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public String k() {
        return "OkHttp";
    }

    public SSLContext l() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Nullable
    public String m(SSLSocket sSLSocket) {
        return null;
    }

    public Object n(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean o(String str) {
        return true;
    }

    public void q(int i, String str, @Nullable Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void r(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        q(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
