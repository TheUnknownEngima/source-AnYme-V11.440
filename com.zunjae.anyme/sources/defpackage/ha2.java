package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ha2  reason: default package */
public final class ha2 {
    static final Comparator<String> b = new a();
    private static final Map<String, ha2> c = new LinkedHashMap();
    public static final ha2 d = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    public static final ha2 e = c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final ha2 f = c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final ha2 g = c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    public static final ha2 h = c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    public static final ha2 i = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final ha2 j = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final ha2 k = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    public static final ha2 l = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    public static final ha2 m = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
    public static final ha2 n = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    public static final ha2 o = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    public static final ha2 p = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    public static final ha2 q = c("TLS_AES_128_GCM_SHA256", 4865);
    public static final ha2 r = c("TLS_AES_256_GCM_SHA384", 4866);
    public static final ha2 s = c("TLS_CHACHA20_POLY1305_SHA256", 4867);
    public static final ha2 t = c("TLS_AES_128_CCM_SHA256", 4868);
    public static final ha2 u = c("TLS_AES_256_CCM_8_SHA256", 4869);
    final String a;

    /* renamed from: ha2$a */
    class a implements Comparator<String> {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    static {
        c("SSL_RSA_WITH_NULL_MD5", 1);
        c("SSL_RSA_WITH_NULL_SHA", 2);
        c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        c("SSL_RSA_WITH_RC4_128_MD5", 4);
        c("SSL_RSA_WITH_RC4_128_SHA", 5);
        c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        c("SSL_RSA_WITH_DES_CBC_SHA", 9);
        c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        c("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        c("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        c("TLS_KRB5_WITH_RC4_128_SHA", 32);
        c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        c("TLS_KRB5_WITH_RC4_128_MD5", 36);
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        c("TLS_RSA_WITH_NULL_SHA256", 59);
        c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        c("TLS_PSK_WITH_RC4_128_SHA", 138);
        c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        c("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        c("TLS_FALLBACK_SCSV", 22016);
        c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    }

    private ha2(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw null;
    }

    public static synchronized ha2 a(String str) {
        ha2 ha2;
        synchronized (ha2.class) {
            ha2 = c.get(str);
            if (ha2 == null) {
                ha2 = c.get(e(str));
                if (ha2 == null) {
                    ha2 = new ha2(str);
                }
                c.put(str, ha2);
            }
        }
        return ha2;
    }

    static List<ha2> b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a2 : strArr) {
            arrayList.add(a(a2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static ha2 c(String str, int i2) {
        ha2 ha2 = new ha2(str);
        c.put(str, ha2);
        return ha2;
    }

    private static String e(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    public String d() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}
