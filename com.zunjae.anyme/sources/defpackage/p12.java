package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: p12  reason: default package */
public final class p12 implements q12 {
    /* access modifiers changed from: private */
    public static final List<d62<p12, HttpURLConnection, u22>> k = f32.d(d.f, e.f, f.f, g.f, h.f);
    /* access modifiers changed from: private */
    public static final List<d62<p12, HttpURLConnection, u22>> l = f32.d(a.f, b.f, c.f);
    public static final i m = new i((r62) null);
    private List<q12> a = new ArrayList();
    private HttpURLConnection b;
    private Integer c;
    private Map<String, String> d;
    private InputStream e;
    private byte[] f;
    /* access modifiers changed from: private */
    public final t12 g = new t12((s12[]) null, 1, (r62) null);
    private Charset h;
    /* access modifiers changed from: private */
    public final List<d62<p12, HttpURLConnection, u22>> i = new ArrayList();
    private final o12 j;

    /* renamed from: p12$a */
    static final class a extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final a f = new a();

        a() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
            defpackage.k52.a(r4, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(defpackage.p12 r3, java.net.HttpURLConnection r4) {
            /*
                r2 = this;
                java.lang.String r0 = "response"
                defpackage.v62.f(r3, r0)
                java.lang.String r0 = "connection"
                defpackage.v62.f(r4, r0)
                o12 r3 = r3.c()
                byte[] r3 = r3.k()
                int r0 = r3.length
                r1 = 1
                if (r0 != 0) goto L_0x0018
                r0 = 1
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x001c
                return
            L_0x001c:
                r4.setDoOutput(r1)
                java.io.OutputStream r4 = r4.getOutputStream()
                r0 = 0
                r4.write(r3)     // Catch:{ all -> 0x002d }
                u22 r3 = defpackage.u22.a     // Catch:{ all -> 0x002d }
                defpackage.k52.a(r4, r0)
                return
            L_0x002d:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x002f }
            L_0x002f:
                r0 = move-exception
                defpackage.k52.a(r4, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.a.a(p12, java.net.HttpURLConnection):void");
        }
    }

    /* renamed from: p12$b */
    static final class b extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final b f = new b();

        b() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            defpackage.k52.a(r5, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
            defpackage.k52.a(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(defpackage.p12 r4, java.net.HttpURLConnection r5) {
            /*
                r3 = this;
                java.lang.String r0 = "response"
                defpackage.v62.f(r4, r0)
                java.lang.String r0 = "connection"
                defpackage.v62.f(r5, r0)
                o12 r0 = r4.c()
                java.util.List r0 = r0.e()
                o12 r4 = r4.c()
                java.lang.Object r4 = r4.getData()
                boolean r0 = r0.isEmpty()
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x0023
                return
            L_0x0023:
                boolean r0 = r4 instanceof java.io.File
                r2 = 0
                if (r0 != 0) goto L_0x002a
                r0 = r2
                goto L_0x002b
            L_0x002a:
                r0 = r4
            L_0x002b:
                java.io.File r0 = (java.io.File) r0
                if (r0 == 0) goto L_0x0035
                java.io.FileInputStream r4 = new java.io.FileInputStream
                r4.<init>(r0)
                goto L_0x003c
            L_0x0035:
                boolean r0 = r4 instanceof java.io.InputStream
                if (r0 != 0) goto L_0x003a
                r4 = r2
            L_0x003a:
                java.io.InputStream r4 = (java.io.InputStream) r4
            L_0x003c:
                if (r4 == 0) goto L_0x007d
                boolean r0 = r5.getDoOutput()
                if (r0 != 0) goto L_0x0047
                r5.setDoOutput(r1)
            L_0x0047:
                java.io.OutputStream r5 = r5.getOutputStream()     // Catch:{ all -> 0x0076 }
            L_0x004b:
                int r0 = r4.available()     // Catch:{ all -> 0x006f }
                if (r0 <= 0) goto L_0x0064
                r0 = 4096(0x1000, float:5.74E-42)
                int r1 = r4.available()     // Catch:{ all -> 0x006f }
                int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x006f }
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x006f }
                r4.read(r0)     // Catch:{ all -> 0x006f }
                r5.write(r0)     // Catch:{ all -> 0x006f }
                goto L_0x004b
            L_0x0064:
                u22 r0 = defpackage.u22.a     // Catch:{ all -> 0x006f }
                defpackage.k52.a(r5, r2)     // Catch:{ all -> 0x0076 }
                u22 r5 = defpackage.u22.a     // Catch:{ all -> 0x0076 }
                defpackage.k52.a(r4, r2)
                return
            L_0x006f:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0071 }
            L_0x0071:
                r1 = move-exception
                defpackage.k52.a(r5, r0)     // Catch:{ all -> 0x0076 }
                throw r1     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0078 }
            L_0x0078:
                r0 = move-exception
                defpackage.k52.a(r4, r5)
                throw r0
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.b.a(p12, java.net.HttpURLConnection):void");
        }
    }

    /* renamed from: p12$c */
    static final class c extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final c f = new c();

        c() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        public final void a(p12 p12, HttpURLConnection httpURLConnection) {
            v62.f(p12, "response");
            v62.f(httpURLConnection, "connection");
            p12.g.putAll(p12.m.c(httpURLConnection));
        }
    }

    /* renamed from: p12$d */
    static final class d extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final d f = new d();

        d() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        public final void a(p12 p12, HttpURLConnection httpURLConnection) {
            v62.f(p12, "response");
            v62.f(httpURLConnection, "connection");
            p12.m.b(httpURLConnection, p12.c().i());
        }
    }

    /* renamed from: p12$e */
    static final class e extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final e f = new e();

        e() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        public final void a(p12 p12, HttpURLConnection httpURLConnection) {
            v62.f(p12, "response");
            v62.f(httpURLConnection, "connection");
            for (Map.Entry next : p12.c().b().entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: p12$f */
    static final class f extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final f f = new f();

        f() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        public final void a(p12 p12, HttpURLConnection httpURLConnection) {
            v62.f(p12, "response");
            v62.f(httpURLConnection, "connection");
            Map<String, String> a = p12.c().a();
            if (a != null) {
                httpURLConnection.setRequestProperty("Cookie", new t12((Map<String, ? extends Object>) w32.h(a, p12.g)).toString());
            }
        }
    }

    /* renamed from: p12$g */
    static final class g extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final g f = new g();

        g() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        public final void a(p12 p12, HttpURLConnection httpURLConnection) {
            v62.f(p12, "response");
            v62.f(httpURLConnection, "connection");
            int g = (int) (p12.c().g() * 1000.0d);
            httpURLConnection.setConnectTimeout(g);
            httpURLConnection.setReadTimeout(g);
        }
    }

    /* renamed from: p12$h */
    static final class h extends w62 implements d62<p12, HttpURLConnection, u22> {
        public static final h f = new h();

        h() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((p12) obj, (HttpURLConnection) obj2);
            return u22.a;
        }

        public final void a(p12 p12, HttpURLConnection httpURLConnection) {
            v62.f(p12, "<anonymous parameter 0>");
            v62.f(httpURLConnection, "connection");
            httpURLConnection.setInstanceFollowRedirects(false);
        }
    }

    /* renamed from: p12$i */
    public static final class i {
        private i() {
        }

        public /* synthetic */ i(r62 r62) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b(HttpURLConnection httpURLConnection, String str) {
            try {
                httpURLConnection.setRequestMethod(str);
            } catch (ProtocolException unused) {
                try {
                    Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
                    v62.b(declaredField, "this");
                    declaredField.setAccessible(true);
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) declaredField.get(httpURLConnection);
                    if (httpURLConnection2 != null) {
                        b(httpURLConnection2, str);
                    }
                } catch (NoSuchFieldException unused2) {
                }
                Iterator<T> it = n32.P(m12.a(httpURLConnection.getClass()), httpURLConnection.getClass()).iterator();
                while (it.hasNext()) {
                    try {
                        Field declaredField2 = ((Class) it.next()).getDeclaredField("method");
                        v62.b(declaredField2, "this");
                        declaredField2.setAccessible(true);
                        declaredField2.set(httpURLConnection, str);
                    } catch (NoSuchFieldException unused3) {
                    }
                }
            }
            if (!v62.a(httpURLConnection.getRequestMethod(), str)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final t12 c(HttpURLConnection httpURLConnection) {
            v62.f(httpURLConnection, "receiver$0");
            Map headerFields = httpURLConnection.getHeaderFields();
            v62.b(headerFields, "this.headerFields");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : headerFields.entrySet()) {
                if (v62.a((String) entry.getKey(), "Set-Cookie")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry value : linkedHashMap.entrySet()) {
                boolean unused = k32.q(arrayList, (List) value.getValue());
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((String) next).length() > 0) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(g32.l(arrayList2, 10));
            for (String s12 : arrayList2) {
                arrayList3.add(new s12(s12));
            }
            Object[] array = arrayList3.toArray(new s12[0]);
            if (array != null) {
                s12[] s12Arr = (s12[]) array;
                return new t12((s12[]) Arrays.copyOf(s12Arr, s12Arr.length));
            }
            throw new r22("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final List<d62<p12, HttpURLConnection, u22>> d() {
            return p12.l;
        }

        public final List<d62<p12, HttpURLConnection, u22>> e() {
            return p12.k;
        }
    }

    /* renamed from: p12$j */
    static final class j extends w62 implements z52<HttpURLConnection, u22> {
        final /* synthetic */ p12 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(p12 p12) {
            super(1);
            this.f = p12;
        }

        public final void a(HttpURLConnection httpURLConnection) {
            v62.f(httpURLConnection, "receiver$0");
            for (T G : n32.O(n32.O(p12.m.e(), this.f.i), p12.m.d())) {
                G.G(this.f, httpURLConnection);
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((HttpURLConnection) obj);
            return u22.a;
        }
    }

    public p12(o12 o12) {
        v62.f(o12, "request");
        this.j = o12;
    }

    private final <T extends URLConnection> Object m(Class<T> cls, String str, T t) {
        for (T t2 : n32.P(m12.a(cls), cls)) {
            try {
                Field declaredField = t2.getDeclaredField(str);
                v62.b(declaredField, "this");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(t);
                if (obj != null) {
                    return obj;
                }
                throw new Exception();
            } catch (Exception unused) {
                try {
                    Field declaredField2 = t2.getDeclaredField("delegate");
                    v62.b(declaredField2, "this");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(t);
                    if (obj2 instanceof URLConnection) {
                        return m(((URLConnection) obj2).getClass(), str, (URLConnection) obj2);
                    }
                } catch (NoSuchFieldException unused2) {
                }
            }
        }
        return null;
    }

    private final InputStream p(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        String str;
        InputStream inputStream2;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            inputStream = httpURLConnection.getErrorStream();
        }
        String str2 = n().get("Content-Encoding");
        if (str2 == null) {
            str = null;
        } else if (str2 != null) {
            str = str2.toLowerCase();
            v62.b(str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new r22("null cannot be cast to non-null type java.lang.String");
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3189082) {
                if (hashCode == 1545112619 && str.equals("deflate")) {
                    inputStream2 = new InflaterInputStream(inputStream);
                }
            } else if (str.equals("gzip")) {
                inputStream2 = new GZIPInputStream(inputStream);
            }
            return inputStream2;
        }
        v62.b(inputStream, "stream");
        return inputStream;
    }

    private final HttpURLConnection s(URL url, q12 q12, z52<? super HttpURLConnection, u22> z52) {
        URLConnection openConnection = url.openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setInstanceFollowRedirects(false);
            z52.r(httpURLConnection);
            httpURLConnection.connect();
            if (q12.c().c()) {
                if (b32.g(new Integer[]{301, 302, 303, 307, 308}, Integer.valueOf(httpURLConnection.getResponseCode()))) {
                    t12 c2 = m.c(httpURLConnection);
                    o12 c3 = q12.c();
                    String i2 = c3.i();
                    String aSCIIString = url.toURI().resolve(httpURLConnection.getHeaderField("Location")).toASCIIString();
                    v62.b(aSCIIString, "this@openRedirectingConn…cation\")).toASCIIString()");
                    Map<String, String> b2 = c3.b();
                    Map<String, String> j2 = c3.j();
                    Object data = c3.getData();
                    Object l2 = c3.l();
                    r12 f2 = c3.f();
                    Map<String, String> a2 = c3.a();
                    if (a2 == null) {
                        a2 = w32.e();
                    }
                    p12 p12 = new p12(new n12(i2, aSCIIString, j2, b2, data, l2, f2, w32.h(c2, a2), c3.g(), Boolean.FALSE, c3.d(), c3.e()));
                    p12.g.putAll(c2);
                    p12.a.addAll(q12.e());
                    if (q12 != null) {
                        ((p12) q12).a.add(p12);
                        p12.r();
                    } else {
                        throw new r22("null cannot be cast to non-null type khttp.responses.GenericResponse");
                    }
                }
            }
            return httpURLConnection;
        }
        throw new r22("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    private final void t() {
        Map<String, String> b2 = c().b();
        if (b2 != null) {
            Map b3 = i72.b(b2);
            Object m2 = m(j().getClass(), "requests", j());
            if (m2 != null) {
                Method declaredMethod = m2.getClass().getDeclaredMethod("getHeaders", new Class[0]);
                v62.b(declaredMethod, "this");
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(m2, new Object[0]);
                if (invoke != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) invoke).entrySet()) {
                        if (!((List) entry.getValue()).isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(v32.a(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), n32.G((Iterable) entry2.getValue(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null));
                    }
                    b3.putAll(linkedHashMap2);
                    return;
                }
                throw new r22("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>");
            }
            return;
        }
        throw new r22("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
    }

    public t12 a() {
        r();
        return this.g;
    }

    public String b() {
        return new String(k(), l());
    }

    public o12 c() {
        return this.j;
    }

    public int d() {
        if (this.c == null) {
            this.c = Integer.valueOf(j().getResponseCode());
        }
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Set to null by another thread");
    }

    public List<q12> e() {
        List<q12> unmodifiableList = Collections.unmodifiableList(this.a);
        v62.b(unmodifiableList, "Collections.unmodifiableList(this._history)");
        return unmodifiableList;
    }

    public HttpURLConnection j() {
        if (this.b == null) {
            URL url = new URL(c().h());
            q12 q12 = (q12) n32.B(this.a);
            if (q12 == null) {
                this.a.add(this);
                q12 = this;
            }
            this.b = s(url, q12, new j(this));
        }
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            return httpURLConnection;
        }
        throw new IllegalStateException("Set to null by another thread");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        defpackage.k52.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] k() {
        /*
            r3 = this;
            byte[] r0 = r3.f
            if (r0 != 0) goto L_0x001a
            java.io.InputStream r0 = r3.o()
            r1 = 0
            byte[] r2 = defpackage.j52.c(r0)     // Catch:{ all -> 0x0013 }
            defpackage.k52.a(r0, r1)
            r3.f = r2
            goto L_0x001a
        L_0x0013:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r2 = move-exception
            defpackage.k52.a(r0, r1)
            throw r2
        L_0x001a:
            byte[] r0 = r3.f
            if (r0 == 0) goto L_0x001f
            return r0
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Set to null by another thread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.k():byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0104, code lost:
        if (r0 != null) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.charset.Charset l() {
        /*
            r10 = this;
            java.nio.charset.Charset r0 = r10.h
            if (r0 == 0) goto L_0x000f
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Set to null by another thread"
            r0.<init>(r1)
            throw r0
        L_0x000f:
            java.util.Map r0 = r10.n()
            java.lang.String r1 = "Content-Type"
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x011d
            java.lang.String r0 = ";"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r0 = defpackage.g92.U(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = defpackage.g32.l(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "="
            java.lang.String[] r5 = new java.lang.String[]{r3}
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r3 = defpackage.g92.U(r4, r5, r6, r7, r8, r9)
            r1.add(r3)
            goto L_0x003b
        L_0x005a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r3 = r1.hasNext()
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            r5 = 0
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r3 = r1.next()
            r6 = r3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00a0
            java.lang.CharSequence r5 = defpackage.g92.i0(r5)
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L_0x009a
            java.lang.String r4 = r5.toLowerCase()
            java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
            defpackage.v62.b(r4, r5)
            java.lang.String r5 = "charset"
            boolean r4 = defpackage.v62.a(r4, r5)
            if (r4 == 0) goto L_0x0063
            r0.add(r3)
            goto L_0x0063
        L_0x009a:
            r22 r0 = new r22
            r0.<init>(r4)
            throw r0
        L_0x00a0:
            r22 r0 = new r22
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x00a8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b1:
            boolean r3 = r0.hasNext()
            r6 = 1
            if (r3 == 0) goto L_0x00ce
            java.lang.Object r3 = r0.next()
            r7 = r3
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            r8 = 2
            if (r7 != r8) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r6 = 0
        L_0x00c8:
            if (r6 == 0) goto L_0x00b1
            r1.add(r3)
            goto L_0x00b1
        L_0x00ce:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = defpackage.g32.l(r1, r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f1
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto L_0x00db
        L_0x00f1:
            java.lang.Object r0 = defpackage.n32.B(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x010d
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r1 = "(this as java.lang.String).toUpperCase()"
            defpackage.v62.b(r0, r1)
            if (r0 == 0) goto L_0x010d
            goto L_0x0113
        L_0x0107:
            r22 r0 = new r22
            r0.<init>(r4)
            throw r0
        L_0x010d:
            java.nio.charset.Charset r0 = defpackage.q82.a
            java.lang.String r0 = r0.name()
        L_0x0113:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "Charset.forName(charset?…?: Charsets.UTF_8.name())"
            defpackage.v62.b(r0, r1)
            return r0
        L_0x011d:
            java.nio.charset.Charset r0 = defpackage.q82.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.l():java.nio.charset.Charset");
    }

    public Map<String, String> n() {
        if (this.d == null) {
            Map headerFields = j().getHeaderFields();
            v62.b(headerFields, "this.connection.headerFields");
            LinkedHashMap linkedHashMap = new LinkedHashMap(v32.a(headerFields.size()));
            for (Map.Entry entry : headerFields.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                v62.b(value, "it.value");
                linkedHashMap.put(key, n32.G((Iterable) value, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((String) entry2.getKey()) != null) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            this.d = linkedHashMap2;
        }
        Map<String, String> map = this.d;
        if (map != null) {
            return new v12(map);
        }
        throw new IllegalStateException("Set to null by another thread");
    }

    public InputStream o() {
        if (this.e == null) {
            this.e = p(j());
        }
        InputStream inputStream = this.e;
        if (inputStream != null) {
            return inputStream;
        }
        throw new IllegalStateException("Set to null by another thread");
    }

    public final List<q12> q() {
        return this.a;
    }

    public final void r() {
        if (c().d()) {
            j();
        } else {
            k();
        }
        t();
    }

    public String toString() {
        return "<Response [" + d() + "]>";
    }
}
