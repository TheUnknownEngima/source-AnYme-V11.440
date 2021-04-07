package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* renamed from: rb2  reason: default package */
public final class rb2 {
    private final List<ka2> a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public rb2(List<ka2> list) {
        this.a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.a.size(); i++) {
            if (this.a.get(i).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public ka2 a(SSLSocket sSLSocket) {
        ka2 ka2;
        int i = this.b;
        int size = this.a.size();
        while (true) {
            if (i >= size) {
                ka2 = null;
                break;
            }
            ka2 = this.a.get(i);
            i++;
            if (ka2.c(sSLSocket)) {
                this.b = i;
                break;
            }
        }
        if (ka2 != null) {
            this.c = c(sSLSocket);
            gb2.a.c(ka2, sSLSocket, this.d);
            return ka2;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + this.a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
        }
        return false;
    }
}
