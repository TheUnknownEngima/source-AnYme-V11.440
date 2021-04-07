package defpackage;

import android.util.JsonWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.IDN;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: n12  reason: default package */
public final class n12 implements o12 {
    private static final Map<String, String> n = w32.f(q22.a("Accept", "*/*"), q22.a("Accept-Encoding", "gzip, deflate"), q22.a("User-Agent", "khttp/1.0.0-SNAPSHOT"));
    private static final Map<String, String> o = v32.b(q22.a("Content-Type", "text/plain"));
    private static final Map<String, String> p = v32.b(q22.a("Content-Type", "application/x-www-form-urlencoded"));
    private static final Map<String, String> q = v32.b(q22.a("Content-Type", "multipart/form-data; boundary=%s"));
    private static final Map<String, String> r = v32.b(q22.a("Content-Type", "application/json"));
    private final String a;
    private final Map<String, String> b;
    private final Object c;
    private final boolean d;
    private byte[] e;
    private final String f;
    private final Map<String, String> g;
    private final Object h;
    private final r12 i;
    private final Map<String, String> j;
    private final double k;
    private final boolean l;
    private final List<u12> m;

    /* renamed from: n12$a */
    static final class a extends w62 implements d62<JsonWriter, Iterable<?>, u22> {
        final /* synthetic */ n12 f;
        final /* synthetic */ Object g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n12 n12, Object obj) {
            super(2);
            this.f = n12;
            this.g = obj;
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((JsonWriter) obj, (Iterable) obj2);
            return u22.a;
        }

        public final void a(JsonWriter jsonWriter, Iterable<?> iterable) {
            String str;
            v62.f(jsonWriter, "jsonWriter");
            v62.f(iterable, "<anonymous parameter 1>");
            jsonWriter.beginArray();
            Iterator it = ((Iterable) this.g).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (v62.a(next, Boolean.valueOf(next == null))) {
                    str = "null";
                } else if (next instanceof Boolean) {
                    jsonWriter.value(((Boolean) next).booleanValue());
                } else if (next instanceof Number) {
                    jsonWriter.value((Number) next);
                } else if (next instanceof String) {
                    str = (String) next;
                } else {
                    n12 n12 = this.f;
                    if (next != null) {
                        String unused = n12.n(next);
                    } else {
                        v62.l();
                        throw null;
                    }
                }
                jsonWriter.value(str);
            }
            jsonWriter.endArray();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n12(java.lang.String r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.util.Map<java.lang.String, java.lang.String> r18, java.lang.Object r19, java.lang.Object r20, defpackage.r12 r21, java.util.Map<java.lang.String, java.lang.String> r22, double r23, java.lang.Boolean r25, boolean r26, java.util.List<defpackage.u12> r27) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r27
            java.lang.String r6 = "method"
            defpackage.v62.f(r15, r6)
            java.lang.String r6 = "url"
            defpackage.v62.f(r2, r6)
            java.lang.String r6 = "params"
            defpackage.v62.f(r3, r6)
            java.lang.String r6 = "headers"
            r7 = r18
            defpackage.v62.f(r7, r6)
            java.lang.String r6 = "files"
            defpackage.v62.f(r5, r6)
            r14.<init>()
            r0.f = r1
            r0.g = r3
            r1 = r20
            r0.h = r1
            r1 = r21
            r0.i = r1
            r1 = r22
            r0.j = r1
            r8 = r23
            r0.k = r8
            r1 = r26
            r0.l = r1
            r0.m = r5
            r1 = 1
            if (r25 == 0) goto L_0x004a
            boolean r3 = r25.booleanValue()
            goto L_0x0055
        L_0x004a:
            java.lang.String r3 = r14.i()
            java.lang.String r5 = "HEAD"
            boolean r3 = defpackage.v62.a(r3, r5)
            r3 = r3 ^ r1
        L_0x0055:
            r0.d = r3
            java.lang.String r2 = r14.o(r2)
            r0.a = r2
            java.lang.String r2 = "http"
            java.lang.String r3 = "https"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.Set r2 = defpackage.a42.d(r2)
            java.net.URI r3 = new java.net.URI
            java.lang.String r5 = r14.h()
            r3.<init>(r5)
            java.lang.String r3 = r3.getScheme()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0196
            java.lang.Object r2 = r14.l()
            w12 r3 = new w12
            java.util.SortedMap r5 = defpackage.v32.d(r18)
            r3.<init>(r5)
            if (r2 != 0) goto L_0x00a3
            r0.c = r4
            if (r4 == 0) goto L_0x00ae
            java.util.List r2 = r14.e()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r4 instanceof java.util.Map
            if (r2 == 0) goto L_0x00a0
            java.util.Map<java.lang.String, java.lang.String> r2 = p
            goto L_0x00ab
        L_0x00a0:
            java.util.Map<java.lang.String, java.lang.String> r2 = o
            goto L_0x00ab
        L_0x00a3:
            java.lang.String r2 = r14.n(r2)
            r0.c = r2
            java.util.Map<java.lang.String, java.lang.String> r2 = r
        L_0x00ab:
            defpackage.m12.b(r3, r2)
        L_0x00ae:
            java.util.Map<java.lang.String, java.lang.String> r2 = n
            defpackage.m12.b(r3, r2)
            java.util.List r2 = r14.e()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x010e
            java.util.Map<java.lang.String, java.lang.String> r2 = q
            defpackage.m12.b(r3, r2)
            java.lang.String r2 = "Content-Type"
            boolean r6 = r3.containsKey(r2)
            if (r6 == 0) goto L_0x010e
            java.lang.Object r6 = r3.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x010a
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "UUID.randomUUID().toString()"
            defpackage.v62.b(r8, r9)
            r9 = 0
            r10 = 4
            r11 = 0
            java.lang.String r12 = "-"
            java.lang.String r13 = ""
            r15 = r8
            r16 = r12
            r17 = r13
            r18 = r9
            r19 = r10
            r20 = r11
            java.lang.String r8 = defpackage.f92.q(r15, r16, r17, r18, r19, r20)
            r7[r4] = r8
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            java.lang.String r6 = java.lang.String.format(r6, r7)
            java.lang.String r7 = "java.lang.String.format(this, *args)"
            defpackage.v62.b(r6, r7)
            goto L_0x010b
        L_0x010a:
            r6 = r5
        L_0x010b:
            r3.put(r2, r6)
        L_0x010e:
            r12 r2 = r14.f()
            if (r2 == 0) goto L_0x0123
            l22 r2 = r2.a()
            java.lang.Object r6 = r2.c()
            java.lang.Object r2 = r2.d()
            r3.put(r6, r2)
        L_0x0123:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0130:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0155
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0146
            r7 = 1
            goto L_0x0147
        L_0x0146:
            r7 = 0
        L_0x0147:
            if (r7 == 0) goto L_0x0130
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r2.put(r7, r6)
            goto L_0x0130
        L_0x0155:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r3 = r2.size()
            int r3 = defpackage.v32.a(r3)
            r1.<init>(r3)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x016a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0186
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r4, r3)
            goto L_0x016a
        L_0x0186:
            defpackage.v62.l()
            throw r5
        L_0x018a:
            java.util.SortedMap r1 = defpackage.v32.d(r1)
            w12 r2 = new w12
            r2.<init>(r1)
            r0.b = r2
            return
        L_0x0196:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid schema. Only http:// and https:// are supported."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.<init>(java.lang.String, java.lang.String, java.util.Map, java.util.Map, java.lang.Object, java.lang.Object, r12, java.util.Map, double, java.lang.Boolean, boolean, java.util.List):void");
    }

    /* access modifiers changed from: private */
    public final String n(Object obj) {
        String str;
        JSONArray jSONArray;
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            str = new JSONObject((Map) obj).toString();
        } else {
            if (obj instanceof Collection) {
                jSONArray = new JSONArray((Collection) obj);
            } else if (obj instanceof Object[]) {
                jSONArray = new JSONArray(obj);
            } else if (obj instanceof Iterable) {
                str = q(obj, new a(this, obj));
            } else {
                throw new IllegalArgumentException("Could not coerce " + obj.getClass().getSimpleName() + " to JSON.");
            }
            str = jSONArray.toString();
        }
        v62.b(str, "if (any is Map<*, *>) {\n…ame} to JSON.\")\n        }");
        return str;
    }

    private final String o(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!j().isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('?');
            sb2.append(new x12(j()));
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        String url = p(new URL(sb.toString())).toString();
        v62.b(url, "URL(route + if (this.par…se \"\").toIDN().toString()");
        return url;
    }

    private final URL p(URL url) {
        String ascii = IDN.toASCII(url.getHost());
        String query = url.getQuery();
        return new URL(new URI(url.getProtocol(), url.getUserInfo(), ascii, url.getPort(), url.getPath(), query != null ? URLDecoder.decode(query, "UTF-8") : null, url.getRef()).toASCIIString());
    }

    private final <T> String q(T t, d62<? super JsonWriter, ? super T, u22> d62) {
        StringWriter stringWriter = new StringWriter();
        d62.G(new JsonWriter(stringWriter), t);
        String stringWriter2 = stringWriter.toString();
        v62.b(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }

    public Map<String, String> a() {
        return this.j;
    }

    public Map<String, String> b() {
        return this.b;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.l;
    }

    public List<u12> e() {
        return this.m;
    }

    public r12 f() {
        return this.i;
    }

    public double g() {
        return this.k;
    }

    public Object getData() {
        return this.c;
    }

    public String h() {
        return this.a;
    }

    public String i() {
        return this.f;
    }

    public Map<String, String> j() {
        return this.g;
    }

    public byte[] k() {
        if (this.e == null) {
            Object data = getData();
            List<u12> e2 = e();
            if (data != null || !e2.isEmpty()) {
                if (data == null) {
                    data = null;
                } else if ((data instanceof Map) && !(data instanceof x12)) {
                    Map map = (Map) data;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(v32.a(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(String.valueOf(entry.getKey()), entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(v32.a(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                    }
                    data = new x12((Map<String, String>) linkedHashMap2);
                }
                if (data == null || !(!e2.isEmpty()) || (data instanceof Map)) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (!e2.isEmpty()) {
                        String str = b().get("Content-Type");
                        if (str != null) {
                            String str2 = (String) g92.U(str, new String[]{"boundary="}, false, 0, 6, (Object) null).get(1);
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, q82.a);
                            if (data != null) {
                                for (Map.Entry entry3 : ((Map) data).entrySet()) {
                                    Object key = entry3.getKey();
                                    Object value = entry3.getValue();
                                    m12.d(outputStreamWriter, "--" + str2 + "\r\n");
                                    m12.d(outputStreamWriter, "Content-Disposition: form-data; name=\"" + String.valueOf(key) + "\"\r\n\r\n");
                                    m12.d(outputStreamWriter, String.valueOf(value));
                                    m12.d(outputStreamWriter, "\r\n");
                                }
                            }
                            for (u12 u12 : e2) {
                                m12.d(outputStreamWriter, "--" + str2 + "\r\n");
                                m12.d(outputStreamWriter, "Content-Disposition: form-data; name=\"" + u12.b() + "\"; filename=\"" + u12.c() + "\"\r\n\r\n");
                                byteArrayOutputStream.write(u12.a());
                                m12.d(outputStreamWriter, "\r\n");
                            }
                            m12.d(outputStreamWriter, "--" + str2 + "--\r\n");
                            outputStreamWriter.close();
                        } else {
                            v62.l();
                            throw null;
                        }
                    } else if (!(data instanceof File) && !(data instanceof InputStream)) {
                        String valueOf = String.valueOf(data);
                        Charset charset = q82.a;
                        if (valueOf != null) {
                            byte[] bytes = valueOf.getBytes(charset);
                            v62.b(bytes, "(this as java.lang.String).getBytes(charset)");
                            byteArrayOutputStream.write(bytes);
                        } else {
                            throw new r22("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    this.e = byteArrayOutputStream.toByteArray();
                } else {
                    throw new IllegalArgumentException("data must be a Map".toString());
                }
            } else {
                byte[] bArr = new byte[0];
                this.e = bArr;
                if (bArr != null) {
                    return bArr;
                }
                throw new IllegalStateException("Set to null by another thread");
            }
        }
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            return bArr2;
        }
        throw new IllegalStateException("Set to null by another thread");
    }

    public Object l() {
        return this.h;
    }
}
