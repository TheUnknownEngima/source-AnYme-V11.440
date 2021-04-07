package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: ad2  reason: default package */
final class ad2 extends dd2 {
    final Method c;
    final Method d;

    ad2(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    public static ad2 s() {
        try {
            return new ad2(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<ya2> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = dd2.b(list);
            this.c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw ib2.b("unable to set ssl parameters", e);
        }
    }

    @Nullable
    public String m(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw ib2.b("unable to get selected protocols", e);
        }
    }
}
