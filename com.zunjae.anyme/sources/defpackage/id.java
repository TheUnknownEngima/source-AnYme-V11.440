package defpackage;

import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: id  reason: default package */
public class id {
    private final String a;
    private final String b;

    public id(String str, String str2) {
        this.b = str2;
        this.a = zc.a(str);
    }

    private URL a(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder(this.b);
            if (!this.b.endsWith("/")) {
                sb.append("/");
            }
            if (!this.b.contains("intent")) {
                sb.append("intent");
                sb.append("/");
            }
            sb.append(this.a);
            sb.append("/");
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            return new URL(sb.toString());
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public URL b(String str) {
        return a("issue", str);
    }
}
