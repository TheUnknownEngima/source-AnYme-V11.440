package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.g;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: tg  reason: default package */
public class tg implements g {
    private final ug b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public tg(String str) {
        this(str, ug.a);
    }

    public tg(String str, ug ugVar) {
        this.c = null;
        jm.b(str);
        this.d = str;
        jm.d(ugVar);
        this.b = ugVar;
    }

    public tg(URL url) {
        this(url, ug.a);
    }

    public tg(URL url, ug ugVar) {
        jm.d(url);
        this.c = url;
        this.d = null;
        jm.d(ugVar);
        this.b = ugVar;
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = c().getBytes(g.a);
        }
        return this.g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                jm.d(url);
                str = url.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    private URL g() {
        if (this.f == null) {
            this.f = new URL(f());
        }
        return this.f;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        jm.d(url);
        return url.toString();
    }

    public Map<String, String> e() {
        return this.b.b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return c().equals(tgVar.c()) && this.b.equals(tgVar.b);
    }

    public URL h() {
        return g();
    }

    public int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = (hashCode * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return c();
    }
}
