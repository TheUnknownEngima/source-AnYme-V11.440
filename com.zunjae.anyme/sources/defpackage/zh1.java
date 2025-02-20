package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.c;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zh1  reason: default package */
public class zh1 {
    private static final String[] c = {"*", "FCM", "GCM", ""};
    private final SharedPreferences a;
    private final String b;

    public zh1(c cVar) {
        this.a = cVar.g().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(cVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(c cVar) {
        String d = cVar.j().d();
        if (d != null) {
            return d;
        }
        String c2 = cVar.j().c();
        if (!c2.startsWith("1:") && !c2.startsWith("2:")) {
            return c2;
        }
        String[] split = c2.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            "Invalid key stored " + e;
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.a) {
            string = this.a.getString("|S|id", (String) null);
        }
        return string;
    }

    private String h() {
        synchronized (this.a) {
            String string = this.a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = e(string);
            if (e == null) {
                return null;
            }
            String c2 = c(e);
            return c2;
        }
    }

    public String f() {
        synchronized (this.a) {
            String g = g();
            if (g != null) {
                return g;
            }
            String h = h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.a
            monitor-enter(r0)
            java.lang.String[] r1 = c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh1.i():java.lang.String");
    }
}
