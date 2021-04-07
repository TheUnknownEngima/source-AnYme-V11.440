package defpackage;

import defpackage.bf2;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.jsoup.nodes.f;

/* renamed from: hf2  reason: default package */
public class hf2 implements bf2 {
    private bf2.d a = new c();
    private bf2.e b = new d();

    /* renamed from: hf2$b */
    private static abstract class b<T extends bf2.a> implements bf2.a<T> {
        URL a;
        bf2.c b;
        Map<String, String> c;
        Map<String, String> d;

        private b() {
            this.c = new LinkedHashMap();
            this.d = new LinkedHashMap();
        }

        private static String B(String str) {
            try {
                byte[] bytes = str.getBytes("ISO-8859-1");
                return !F(bytes) ? str : new String(bytes, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
            r3 = H(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String C(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Header name must not be null"
                defpackage.jf2.k(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.c
                java.lang.Object r0 = r0.get(r3)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto L_0x001b
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.c
                java.lang.String r1 = r3.toLowerCase()
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
            L_0x001b:
                if (r0 != 0) goto L_0x002a
                java.util.Map$Entry r3 = r2.H(r3)
                if (r3 == 0) goto L_0x002a
                java.lang.Object r3 = r3.getValue()
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hf2.b.C(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            if ((((r8[1] & 255) == 187) & ((r8[2] & 255) == 191)) != false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean F(byte[] r8) {
            /*
                int r0 = r8.length
                r1 = 3
                r2 = 0
                r3 = 1
                if (r0 < r1) goto L_0x0029
                byte r0 = r8[r2]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 239(0xef, float:3.35E-43)
                if (r0 != r4) goto L_0x0029
                byte r0 = r8[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 187(0xbb, float:2.62E-43)
                if (r0 != r4) goto L_0x0018
                r0 = 1
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                r4 = 2
                byte r4 = r8[r4]
                r4 = r4 & 255(0xff, float:3.57E-43)
                r5 = 191(0xbf, float:2.68E-43)
                if (r4 != r5) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                r0 = r0 & r4
                if (r0 == 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r1 = 0
            L_0x002a:
                int r0 = r8.length
            L_0x002b:
                if (r1 >= r0) goto L_0x005d
                byte r4 = r8[r1]
                r5 = r4 & 128(0x80, float:1.794E-43)
                if (r5 != 0) goto L_0x0034
                goto L_0x005a
            L_0x0034:
                r5 = r4 & 224(0xe0, float:3.14E-43)
                r6 = 192(0xc0, float:2.69E-43)
                if (r5 != r6) goto L_0x003d
                int r4 = r1 + 1
                goto L_0x004e
            L_0x003d:
                r5 = r4 & 240(0xf0, float:3.36E-43)
                r7 = 224(0xe0, float:3.14E-43)
                if (r5 != r7) goto L_0x0046
                int r4 = r1 + 2
                goto L_0x004e
            L_0x0046:
                r4 = r4 & 248(0xf8, float:3.48E-43)
                r5 = 240(0xf0, float:3.36E-43)
                if (r4 != r5) goto L_0x005c
                int r4 = r1 + 3
            L_0x004e:
                if (r1 >= r4) goto L_0x005a
                int r1 = r1 + 1
                byte r5 = r8[r1]
                r5 = r5 & r6
                r7 = 128(0x80, float:1.794E-43)
                if (r5 == r7) goto L_0x004e
                return r2
            L_0x005a:
                int r1 = r1 + r3
                goto L_0x002b
            L_0x005c:
                return r2
            L_0x005d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hf2.b.F(byte[]):boolean");
        }

        private Map.Entry<String, String> H(String str) {
            String lowerCase = str.toLowerCase();
            for (Map.Entry<String, String> next : this.c.entrySet()) {
                if (next.getKey().toLowerCase().equals(lowerCase)) {
                    return next;
                }
            }
            return null;
        }

        public T A(URL url) {
            jf2.k(url, "URL must not be null");
            this.a = url;
            return this;
        }

        public boolean D(String str) {
            jf2.i(str, "Cookie name must not be empty");
            return this.d.containsKey(str);
        }

        public boolean E(String str, String str2) {
            return k(str) && t(str).equalsIgnoreCase(str2);
        }

        public T G(String str) {
            jf2.i(str, "Header name must not be empty");
            Map.Entry<String, String> H = H(str);
            if (H != null) {
                this.c.remove(H.getKey());
            }
            return this;
        }

        public T a(String str, String str2) {
            jf2.i(str, "Header name must not be empty");
            jf2.k(str2, "Header value must not be null");
            G(str);
            this.c.put(str, str2);
            return this;
        }

        public T i(bf2.c cVar) {
            jf2.k(cVar, "Method must not be null");
            this.b = cVar;
            return this;
        }

        public boolean k(String str) {
            jf2.i(str, "Header name must not be empty");
            return C(str) != null;
        }

        public URL m() {
            return this.a;
        }

        public bf2.c method() {
            return this.b;
        }

        public T n(String str, String str2) {
            jf2.i(str, "Cookie name must not be empty");
            jf2.k(str2, "Cookie value must not be null");
            this.d.put(str, str2);
            return this;
        }

        public Map<String, String> q() {
            return this.d;
        }

        public String t(String str) {
            jf2.k(str, "Header name must not be null");
            String C = C(str);
            return C != null ? B(C) : C;
        }

        public Map<String, String> u() {
            return this.c;
        }
    }

    /* renamed from: hf2$c */
    public static class c extends b<bf2.d> implements bf2.d {
        private Proxy e;
        private int f;
        private int g;
        private boolean h;
        private Collection<bf2.b> i;
        private String j;
        private boolean k;
        private boolean l;
        private qf2 m;
        /* access modifiers changed from: private */
        public boolean n;
        private boolean o;
        private String p;

        private c() {
            super();
            this.j = null;
            this.k = false;
            this.l = false;
            this.n = false;
            this.o = true;
            this.p = "UTF-8";
            this.f = 30000;
            this.g = 1048576;
            this.h = true;
            this.i = new ArrayList();
            this.b = bf2.c.GET;
            this.c.put("Accept-Encoding", "gzip");
            this.c.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            this.m = qf2.a();
        }

        public c J(qf2 qf2) {
            this.m = qf2;
            this.n = true;
            return this;
        }

        public c K(int i2) {
            jf2.e(i2 >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f = i2;
            return this;
        }

        public bf2.d b(boolean z) {
            this.h = z;
            return this;
        }

        public int c() {
            return this.f;
        }

        public /* bridge */ /* synthetic */ bf2.d d(int i2) {
            K(i2);
            return this;
        }

        public bf2.d e(boolean z) {
            this.k = z;
            return this;
        }

        public bf2.d f(boolean z) {
            this.l = z;
            return this;
        }

        public boolean g() {
            return this.k;
        }

        public String h() {
            return this.p;
        }

        public boolean j() {
            return this.o;
        }

        public boolean l() {
            return this.l;
        }

        public Proxy o() {
            return this.e;
        }

        public Collection<bf2.b> p() {
            return this.i;
        }

        public boolean r() {
            return this.h;
        }

        public String w() {
            return this.j;
        }

        public int x() {
            return this.g;
        }

        public /* bridge */ /* synthetic */ bf2.d y(qf2 qf2) {
            J(qf2);
            return this;
        }

        public qf2 z() {
            return this.m;
        }
    }

    /* renamed from: hf2$d */
    public static class d extends b<bf2.e> implements bf2.e {
        private static SSLSocketFactory l;
        private static final Pattern m = Pattern.compile("(application|text)/\\w*\\+?xml.*");
        private int e;
        private ByteBuffer f;
        private String g;
        private String h;
        private boolean i = false;
        private int j = 0;
        private bf2.d k;

        /* renamed from: hf2$d$a */
        static class a implements HostnameVerifier {
            a() {
            }

            public boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        }

        /* renamed from: hf2$d$b */
        static class b implements X509TrustManager {
            b() {
            }

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }

        d() {
            super();
        }

        private d(d dVar) {
            super();
            if (dVar != null) {
                int i2 = dVar.j + 1;
                this.j = i2;
                if (i2 >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", new Object[]{dVar.m()}));
                }
            }
        }

        private static HttpURLConnection J(bf2.d dVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) (dVar.o() == null ? dVar.m().openConnection() : dVar.m().openConnection(dVar.o()));
            httpURLConnection.setRequestMethod(dVar.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(dVar.c());
            httpURLConnection.setReadTimeout(dVar.c());
            if ((httpURLConnection instanceof HttpsURLConnection) && !dVar.j()) {
                P();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                httpsURLConnection.setSSLSocketFactory(l);
                httpsURLConnection.setHostnameVerifier(N());
            }
            if (dVar.method().hasBody()) {
                httpURLConnection.setDoOutput(true);
            }
            if (dVar.q().size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", O(dVar));
            }
            for (Map.Entry next : dVar.u().entrySet()) {
                httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            return httpURLConnection;
        }

        private static LinkedHashMap<String, List<String>> K(HttpURLConnection httpURLConnection) {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            int i2 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i2);
                String headerField = httpURLConnection.getHeaderField(i2);
                if (headerFieldKey == null && headerField == null) {
                    return linkedHashMap;
                }
                i2++;
                if (!(headerFieldKey == null || headerField == null)) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        linkedHashMap.get(headerFieldKey).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
        }

        static d L(bf2.d dVar) {
            return M(dVar, (d) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.zip.GZIPInputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ all -> 0x01ac, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009d A[Catch:{ all -> 0x01ac, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0105  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static defpackage.hf2.d M(defpackage.bf2.d r6, defpackage.hf2.d r7) {
            /*
                java.lang.String r0 = "Location"
                java.lang.String r1 = "Request must not be null"
                defpackage.jf2.k(r6, r1)
                java.net.URL r1 = r6.m()
                java.lang.String r1 = r1.getProtocol()
                java.lang.String r2 = "http"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0028
                java.lang.String r2 = "https"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0020
                goto L_0x0028
            L_0x0020:
                java.net.MalformedURLException r6 = new java.net.MalformedURLException
                java.lang.String r7 = "Only http & https protocols supported"
                r6.<init>(r7)
                throw r6
            L_0x0028:
                bf2$c r1 = r6.method()
                boolean r1 = r1.hasBody()
                java.lang.String r2 = r6.w()
                r3 = 1
                if (r2 == 0) goto L_0x0039
                r2 = 1
                goto L_0x003a
            L_0x0039:
                r2 = 0
            L_0x003a:
                if (r1 != 0) goto L_0x0054
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot set a request body for HTTP method "
                r4.append(r5)
                bf2$c r5 = r6.method()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                defpackage.jf2.c(r2, r4)
            L_0x0054:
                java.util.Collection r4 = r6.p()
                int r4 = r4.size()
                r5 = 0
                if (r4 <= 0) goto L_0x0067
                if (r1 == 0) goto L_0x0063
                if (r2 == 0) goto L_0x0067
            L_0x0063:
                R(r6)
                goto L_0x006e
            L_0x0067:
                if (r1 == 0) goto L_0x006e
                java.lang.String r1 = S(r6)
                goto L_0x006f
            L_0x006e:
                r1 = r5
            L_0x006f:
                java.net.HttpURLConnection r2 = J(r6)
                r2.connect()     // Catch:{ all -> 0x01cf }
                boolean r4 = r2.getDoOutput()     // Catch:{ all -> 0x01cf }
                if (r4 == 0) goto L_0x0083
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ all -> 0x01cf }
                U(r6, r4, r1)     // Catch:{ all -> 0x01cf }
            L_0x0083:
                int r1 = r2.getResponseCode()     // Catch:{ all -> 0x01cf }
                hf2$d r4 = new hf2$d     // Catch:{ all -> 0x01cf }
                r4.<init>(r7)     // Catch:{ all -> 0x01cf }
                r4.T(r2, r7)     // Catch:{ all -> 0x01cf }
                r4.k = r6     // Catch:{ all -> 0x01cf }
                boolean r7 = r4.k(r0)     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0105
                boolean r7 = r6.r()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0105
                r7 = 307(0x133, float:4.3E-43)
                if (r1 == r7) goto L_0x00ad
                bf2$c r7 = defpackage.bf2.c.GET     // Catch:{ all -> 0x01cf }
                r6.i(r7)     // Catch:{ all -> 0x01cf }
                java.util.Collection r7 = r6.p()     // Catch:{ all -> 0x01cf }
                r7.clear()     // Catch:{ all -> 0x01cf }
            L_0x00ad:
                java.lang.String r7 = r4.t(r0)     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x00c8
                java.lang.String r0 = "http:/"
                boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x01cf }
                if (r0 == 0) goto L_0x00c8
                r0 = 6
                char r1 = r7.charAt(r0)     // Catch:{ all -> 0x01cf }
                r3 = 47
                if (r1 == r3) goto L_0x00c8
                java.lang.String r7 = r7.substring(r0)     // Catch:{ all -> 0x01cf }
            L_0x00c8:
                java.net.URL r0 = r6.m()     // Catch:{ all -> 0x01cf }
                java.net.URL r7 = defpackage.if2.k(r0, r7)     // Catch:{ all -> 0x01cf }
                java.net.URL r7 = defpackage.hf2.o(r7)     // Catch:{ all -> 0x01cf }
                r6.A(r7)     // Catch:{ all -> 0x01cf }
                java.util.Map<java.lang.String, java.lang.String> r7 = r4.d     // Catch:{ all -> 0x01cf }
                java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x01cf }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01cf }
            L_0x00e1:
                boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01cf }
                if (r0 == 0) goto L_0x00fd
                java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x01cf }
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01cf }
                java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x01cf }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01cf }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01cf }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01cf }
                r6.n(r1, r0)     // Catch:{ all -> 0x01cf }
                goto L_0x00e1
            L_0x00fd:
                hf2$d r6 = M(r6, r4)     // Catch:{ all -> 0x01cf }
                r2.disconnect()
                return r6
            L_0x0105:
                r7 = 200(0xc8, float:2.8E-43)
                if (r1 < r7) goto L_0x010d
                r7 = 400(0x190, float:5.6E-43)
                if (r1 < r7) goto L_0x0113
            L_0x010d:
                boolean r7 = r6.g()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x01bf
            L_0x0113:
                java.lang.String r7 = r4.I()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0144
                boolean r0 = r6.l()     // Catch:{ all -> 0x01cf }
                if (r0 != 0) goto L_0x0144
                java.lang.String r0 = "text/"
                boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x01cf }
                if (r0 != 0) goto L_0x0144
                java.util.regex.Pattern r0 = m     // Catch:{ all -> 0x01cf }
                java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ all -> 0x01cf }
                boolean r0 = r0.matches()     // Catch:{ all -> 0x01cf }
                if (r0 == 0) goto L_0x0134
                goto L_0x0144
            L_0x0134:
                ff2 r0 = new ff2     // Catch:{ all -> 0x01cf }
                java.lang.String r1 = "Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml"
                java.net.URL r6 = r6.m()     // Catch:{ all -> 0x01cf }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01cf }
                r0.<init>(r1, r7, r6)     // Catch:{ all -> 0x01cf }
                throw r0     // Catch:{ all -> 0x01cf }
            L_0x0144:
                if (r7 == 0) goto L_0x0166
                java.util.regex.Pattern r0 = m     // Catch:{ all -> 0x01cf }
                java.util.regex.Matcher r7 = r0.matcher(r7)     // Catch:{ all -> 0x01cf }
                boolean r7 = r7.matches()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0166
                boolean r7 = r6 instanceof defpackage.hf2.c     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0166
                r7 = r6
                hf2$c r7 = (defpackage.hf2.c) r7     // Catch:{ all -> 0x01cf }
                boolean r7 = r7.n     // Catch:{ all -> 0x01cf }
                if (r7 != 0) goto L_0x0166
                qf2 r7 = defpackage.qf2.e()     // Catch:{ all -> 0x01cf }
                r6.y(r7)     // Catch:{ all -> 0x01cf }
            L_0x0166:
                java.lang.String r7 = r4.h     // Catch:{ all -> 0x01cf }
                java.lang.String r7 = defpackage.gf2.d(r7)     // Catch:{ all -> 0x01cf }
                r4.g = r7     // Catch:{ all -> 0x01cf }
                int r7 = r2.getContentLength()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x01b3
                bf2$c r7 = r6.method()     // Catch:{ all -> 0x01cf }
                bf2$c r0 = defpackage.bf2.c.HEAD     // Catch:{ all -> 0x01cf }
                if (r7 == r0) goto L_0x01b3
                java.io.InputStream r7 = r2.getErrorStream()     // Catch:{ all -> 0x01ac }
                if (r7 == 0) goto L_0x0187
                java.io.InputStream r7 = r2.getErrorStream()     // Catch:{ all -> 0x01ac }
                goto L_0x018b
            L_0x0187:
                java.io.InputStream r7 = r2.getInputStream()     // Catch:{ all -> 0x01ac }
            L_0x018b:
                r5 = r7
                java.lang.String r7 = "Content-Encoding"
                java.lang.String r0 = "gzip"
                boolean r7 = r4.E(r7, r0)     // Catch:{ all -> 0x01ac }
                if (r7 == 0) goto L_0x019c
                java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x01ac }
                r7.<init>(r5)     // Catch:{ all -> 0x01ac }
                r5 = r7
            L_0x019c:
                int r6 = r6.x()     // Catch:{ all -> 0x01ac }
                java.nio.ByteBuffer r6 = defpackage.gf2.g(r5, r6)     // Catch:{ all -> 0x01ac }
                r4.f = r6     // Catch:{ all -> 0x01ac }
                if (r5 == 0) goto L_0x01b9
                r5.close()     // Catch:{ all -> 0x01cf }
                goto L_0x01b9
            L_0x01ac:
                r6 = move-exception
                if (r5 == 0) goto L_0x01b2
                r5.close()     // Catch:{ all -> 0x01cf }
            L_0x01b2:
                throw r6     // Catch:{ all -> 0x01cf }
            L_0x01b3:
                java.nio.ByteBuffer r6 = defpackage.gf2.c()     // Catch:{ all -> 0x01cf }
                r4.f = r6     // Catch:{ all -> 0x01cf }
            L_0x01b9:
                r2.disconnect()
                r4.i = r3
                return r4
            L_0x01bf:
                cf2 r7 = new cf2     // Catch:{ all -> 0x01cf }
                java.lang.String r0 = "HTTP error fetching URL"
                java.net.URL r6 = r6.m()     // Catch:{ all -> 0x01cf }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01cf }
                r7.<init>(r0, r1, r6)     // Catch:{ all -> 0x01cf }
                throw r7     // Catch:{ all -> 0x01cf }
            L_0x01cf:
                r6 = move-exception
                r2.disconnect()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hf2.d.M(bf2$d, hf2$d):hf2$d");
        }

        private static HostnameVerifier N() {
            return new a();
        }

        private static String O(bf2.d dVar) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Map.Entry next : dVar.q().entrySet()) {
                if (!z) {
                    sb.append("; ");
                } else {
                    z = false;
                }
                sb.append((String) next.getKey());
                sb.append('=');
                sb.append((String) next.getValue());
            }
            return sb.toString();
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static synchronized void P() {
            /*
                java.lang.Class<hf2$d> r0 = defpackage.hf2.d.class
                monitor-enter(r0)
                javax.net.ssl.SSLSocketFactory r1 = l     // Catch:{ all -> 0x003a }
                if (r1 != 0) goto L_0x0038
                r1 = 1
                javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch:{ all -> 0x003a }
                r2 = 0
                hf2$d$b r3 = new hf2$d$b     // Catch:{ all -> 0x003a }
                r3.<init>()     // Catch:{ all -> 0x003a }
                r1[r2] = r3     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "SSL"
                javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                r3 = 0
                java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                r4.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                r2.init(r3, r1, r4)     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                javax.net.ssl.SSLSocketFactory r1 = r2.getSocketFactory()     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                l = r1     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                goto L_0x0038
            L_0x0028:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "Can't create unsecure trust manager"
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                throw r1     // Catch:{ all -> 0x003a }
            L_0x0030:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "Can't create unsecure trust manager"
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                throw r1     // Catch:{ all -> 0x003a }
            L_0x0038:
                monitor-exit(r0)
                return
            L_0x003a:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hf2.d.P():void");
        }

        private static void R(bf2.d dVar) {
            boolean z;
            URL m2 = dVar.m();
            StringBuilder sb = new StringBuilder();
            sb.append(m2.getProtocol());
            sb.append("://");
            sb.append(m2.getAuthority());
            sb.append(m2.getPath());
            sb.append("?");
            if (m2.getQuery() != null) {
                sb.append(m2.getQuery());
                z = false;
            } else {
                z = true;
            }
            for (bf2.b next : dVar.p()) {
                jf2.c(next.a(), "InputStream data not supported in URL query string.");
                if (!z) {
                    sb.append('&');
                } else {
                    z = false;
                }
                sb.append(URLEncoder.encode(next.key(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(next.value(), "UTF-8"));
            }
            dVar.A(new URL(sb.toString()));
            dVar.p().clear();
        }

        private static String S(bf2.d dVar) {
            if (!dVar.k("Content-Type")) {
                if (hf2.p(dVar)) {
                    String e2 = gf2.e();
                    dVar.a("Content-Type", "multipart/form-data; boundary=" + e2);
                    return e2;
                }
                dVar.a("Content-Type", "application/x-www-form-urlencoded; charset=" + dVar.h());
            }
            return null;
        }

        private void T(HttpURLConnection httpURLConnection, bf2.e eVar) {
            this.b = bf2.c.valueOf(httpURLConnection.getRequestMethod());
            this.a = httpURLConnection.getURL();
            this.e = httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            this.h = httpURLConnection.getContentType();
            Q(K(httpURLConnection));
            if (eVar != null) {
                for (Map.Entry next : eVar.q().entrySet()) {
                    if (!D((String) next.getKey())) {
                        n((String) next.getKey(), (String) next.getValue());
                    }
                }
            }
        }

        private static void U(bf2.d dVar, OutputStream outputStream, String str) {
            Collection<bf2.b> p = dVar.p();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, dVar.h()));
            if (str != null) {
                for (bf2.b next : p) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(hf2.m(next.key()));
                    bufferedWriter.write("\"");
                    if (next.a()) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(hf2.m(next.value()));
                        bufferedWriter.write("\"\r\nContent-Type: application/octet-stream\r\n\r\n");
                        bufferedWriter.flush();
                        gf2.a(next.f(), outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(next.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else if (dVar.w() != null) {
                bufferedWriter.write(dVar.w());
            } else {
                boolean z = true;
                for (bf2.b next2 : p) {
                    if (!z) {
                        bufferedWriter.append('&');
                    } else {
                        z = false;
                    }
                    bufferedWriter.write(URLEncoder.encode(next2.key(), dVar.h()));
                    bufferedWriter.write(61);
                    bufferedWriter.write(URLEncoder.encode(next2.value(), dVar.h()));
                }
            }
            bufferedWriter.close();
        }

        public String I() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public void Q(Map<String, List<String>> map) {
            String sb;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (str != null) {
                    List<String> list = (List) next.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                tf2 tf2 = new tf2(str2);
                                String trim = tf2.b("=").trim();
                                String trim2 = tf2.g(";").trim();
                                if (trim.length() > 0) {
                                    n(trim, trim2);
                                }
                            }
                        }
                    } else {
                        if (list.size() == 1) {
                            sb = (String) list.get(0);
                        } else if (list.size() > 1) {
                            StringBuilder sb2 = new StringBuilder();
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                String str3 = (String) list.get(i2);
                                if (i2 != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(str3);
                            }
                            sb = sb2.toString();
                        }
                        a(str, sb);
                    }
                }
            }
        }

        public f s() {
            jf2.e(this.i, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            f f2 = gf2.f(this.f, this.g, this.a.toExternalForm(), this.k.z());
            this.f.rewind();
            this.g = f2.I0().b().name();
            return f2;
        }

        public int v() {
            return this.e;
        }
    }

    private hf2() {
    }

    public static bf2 l(String str) {
        hf2 hf2 = new hf2();
        hf2.g(str);
        return hf2;
    }

    /* access modifiers changed from: private */
    public static String m(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\"", "%22");
    }

    private static String n(String str) {
        try {
            return o(new URL(str)).toExternalForm();
        } catch (Exception unused) {
            return str;
        }
    }

    /* access modifiers changed from: private */
    public static URL o(URL url) {
        try {
            return new URL(new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString());
        } catch (Exception unused) {
            return url;
        }
    }

    /* access modifiers changed from: private */
    public static boolean p(bf2.d dVar) {
        for (bf2.b a2 : dVar.p()) {
            if (a2.a()) {
                return true;
            }
        }
        return false;
    }

    public bf2 a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    public bf2 b(boolean z) {
        this.a.b(z);
        return this;
    }

    public bf2 c(String str) {
        jf2.k(str, "User agent must not be null");
        this.a.a("User-Agent", str);
        return this;
    }

    public bf2 d(int i) {
        this.a.d(i);
        return this;
    }

    public bf2 e(boolean z) {
        this.a.e(z);
        return this;
    }

    public bf2 f(boolean z) {
        this.a.f(z);
        return this;
    }

    public bf2 g(String str) {
        jf2.i(str, "Must supply a valid URL");
        try {
            this.a.A(new URL(n(str)));
            return this;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Malformed URL: " + str, e);
        }
    }

    public f get() {
        this.a.i(bf2.c.GET);
        h();
        return this.b.s();
    }

    public bf2.e h() {
        d L = d.L(this.a);
        this.b = L;
        return L;
    }
}
