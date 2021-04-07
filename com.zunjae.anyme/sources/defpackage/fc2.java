package defpackage;

import java.net.Proxy;

/* renamed from: fc2  reason: default package */
public final class fc2 {
    public static String a(ab2 ab2, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(ab2.g());
        sb.append(' ');
        boolean b = b(ab2, type);
        ta2 j = ab2.j();
        if (b) {
            sb.append(j);
        } else {
            sb.append(c(j));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(ab2 ab2, Proxy.Type type) {
        return !ab2.f() && type == Proxy.Type.HTTP;
    }

    public static String c(ta2 ta2) {
        String h = ta2.h();
        String j = ta2.j();
        if (j == null) {
            return h;
        }
        return h + '?' + j;
    }
}
