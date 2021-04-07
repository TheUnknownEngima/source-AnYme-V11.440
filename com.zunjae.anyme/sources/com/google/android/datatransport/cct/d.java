package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import defpackage.cn;
import defpackage.mn;
import defpackage.nn;
import defpackage.on;
import defpackage.qn;
import defpackage.zn;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

final class d implements m {
    private final bh1 a;
    private final ConnectivityManager b;
    final URL c = f(a.c);
    private final kq d;
    private final kq e;
    private final int f;

    static final class a {
        final URL a;
        final ln b;
        final String c;

        a(URL url, ln lnVar, String str) {
            this.a = url;
            this.b = lnVar;
            this.c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    d(Context context, kq kqVar, kq kqVar2) {
        mh1 mh1 = new mh1();
        mh1.g(dn.a);
        mh1.h(true);
        this.a = mh1.f();
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = kqVar2;
        this.e = kqVar;
        this.f = 40000;
    }

    static /* synthetic */ a c(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        mo.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0133 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.d.b d(com.google.android.datatransport.cct.d.a r14) {
        /*
            r13 = this;
            java.net.URL r0 = r14.a
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            defpackage.mo.a(r1, r2, r0)
            java.net.URL r0 = r14.a
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            int r2 = r13.f
            r0.setReadTimeout(r2)
            r2 = 1
            r0.setDoOutput(r2)
            r3 = 0
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "2.3.1"
            r2[r3] = r4
            java.lang.String r3 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "User-Agent"
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r0.setRequestProperty(r2, r3)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r0.setRequestProperty(r4, r5)
            java.lang.String r5 = "Accept-Encoding"
            r0.setRequestProperty(r5, r3)
            java.lang.String r5 = r14.c
            if (r5 == 0) goto L_0x0055
            java.lang.String r6 = "X-Goog-Api-Key"
            r0.setRequestProperty(r6, r5)
        L_0x0055:
            r5 = 0
            r7 = 0
            java.io.OutputStream r8 = r0.getOutputStream()     // Catch:{ ConnectException -> 0x014d, UnknownHostException -> 0x014b, ch1 -> 0x013d, IOException -> 0x013b }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0134 }
            r9.<init>(r8)     // Catch:{ all -> 0x0134 }
            bh1 r10 = r13.a     // Catch:{ all -> 0x012f }
            ln r14 = r14.b     // Catch:{ all -> 0x012f }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ all -> 0x012f }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x012f }
            r12.<init>(r9)     // Catch:{ all -> 0x012f }
            r11.<init>(r12)     // Catch:{ all -> 0x012f }
            r10.a(r14, r11)     // Catch:{ all -> 0x012f }
            r9.close()     // Catch:{ all -> 0x0134 }
            if (r8 == 0) goto L_0x007a
            r8.close()     // Catch:{ ConnectException -> 0x014d, UnknownHostException -> 0x014b, ch1 -> 0x013d, IOException -> 0x013b }
        L_0x007a:
            int r14 = r0.getResponseCode()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Status Code: "
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            defpackage.mo.e(r1, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Content-Type: "
            r8.append(r9)
            java.lang.String r4 = r0.getHeaderField(r4)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            defpackage.mo.e(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Content-Encoding: "
            r4.append(r8)
            java.lang.String r8 = r0.getHeaderField(r2)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            defpackage.mo.e(r1, r4)
            r1 = 302(0x12e, float:4.23E-43)
            if (r14 == r1) goto L_0x011e
            r1 = 301(0x12d, float:4.22E-43)
            if (r14 == r1) goto L_0x011e
            r1 = 307(0x133, float:4.3E-43)
            if (r14 != r1) goto L_0x00cf
            goto L_0x011e
        L_0x00cf:
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 == r1) goto L_0x00d9
            com.google.android.datatransport.cct.d$b r0 = new com.google.android.datatransport.cct.d$b
            r0.<init>(r14, r7, r5)
            return r0
        L_0x00d9:
            java.io.InputStream r1 = r0.getInputStream()
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ all -> 0x0117 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00ed
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0117 }
            r0.<init>(r1)     // Catch:{ all -> 0x0117 }
            goto L_0x00ee
        L_0x00ed:
            r0 = r1
        L_0x00ee:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0110 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0110 }
            r3.<init>(r0)     // Catch:{ all -> 0x0110 }
            r2.<init>(r3)     // Catch:{ all -> 0x0110 }
            pn r2 = defpackage.pn.b(r2)     // Catch:{ all -> 0x0110 }
            long r2 = r2.a()     // Catch:{ all -> 0x0110 }
            com.google.android.datatransport.cct.d$b r4 = new com.google.android.datatransport.cct.d$b     // Catch:{ all -> 0x0110 }
            r4.<init>(r14, r7, r2)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x010a
            r0.close()     // Catch:{ all -> 0x0117 }
        L_0x010a:
            if (r1 == 0) goto L_0x010f
            r1.close()
        L_0x010f:
            return r4
        L_0x0110:
            r14 = move-exception
            if (r0 == 0) goto L_0x0116
            r0.close()     // Catch:{ all -> 0x0116 }
        L_0x0116:
            throw r14     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r14 = move-exception
            if (r1 == 0) goto L_0x011d
            r1.close()     // Catch:{ all -> 0x011d }
        L_0x011d:
            throw r14
        L_0x011e:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            com.google.android.datatransport.cct.d$b r1 = new com.google.android.datatransport.cct.d$b
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r14, r2, r5)
            return r1
        L_0x012f:
            r14 = move-exception
            r9.close()     // Catch:{ all -> 0x0133 }
        L_0x0133:
            throw r14     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r14 = move-exception
            if (r8 == 0) goto L_0x013a
            r8.close()     // Catch:{ all -> 0x013a }
        L_0x013a:
            throw r14     // Catch:{ ConnectException -> 0x014d, UnknownHostException -> 0x014b, ch1 -> 0x013d, IOException -> 0x013b }
        L_0x013b:
            r14 = move-exception
            goto L_0x013e
        L_0x013d:
            r14 = move-exception
        L_0x013e:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            defpackage.mo.c(r1, r0, r14)
            com.google.android.datatransport.cct.d$b r14 = new com.google.android.datatransport.cct.d$b
            r0 = 400(0x190, float:5.6E-43)
            r14.<init>(r0, r7, r5)
            return r14
        L_0x014b:
            r14 = move-exception
            goto L_0x014e
        L_0x014d:
            r14 = move-exception
        L_0x014e:
            java.lang.String r0 = "Couldn't open connection, returning with 500"
            defpackage.mo.c(r1, r0, r14)
            com.google.android.datatransport.cct.d$b r14 = new com.google.android.datatransport.cct.d$b
            r0 = 500(0x1f4, float:7.0E-43)
            r14.<init>(r0, r7, r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.d.d(com.google.android.datatransport.cct.d$a):com.google.android.datatransport.cct.d$b");
    }

    private static URL f(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    public g a(f fVar) {
        nn.a aVar;
        HashMap hashMap = new HashMap();
        for (zn next : fVar.b()) {
            String j = next.j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            zn znVar = (zn) ((List) entry.getValue()).get(0);
            on.a a2 = on.a();
            a2.d(rn.DEFAULT);
            a2.b(this.e.a());
            a2.i(this.d.a());
            mn.a a3 = mn.a();
            a3.b(mn.b.ANDROID_FIREBASE);
            cn.a a4 = cn.a();
            a4.a(Integer.valueOf(znVar.g("sdk-version")));
            a4.g(znVar.b("model"));
            a4.e(znVar.b("hardware"));
            a4.b(znVar.b("device"));
            a4.i(znVar.b("product"));
            a4.h(znVar.b("os-uild"));
            a4.f(znVar.b("manufacturer"));
            a4.d(znVar.b("fingerprint"));
            a3.a(a4.c());
            a2.c(a3.c());
            try {
                a2.a(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (zn znVar2 : (List) entry.getValue()) {
                yn e2 = znVar2.e();
                vm b2 = e2.b();
                if (b2.equals(vm.b("proto"))) {
                    aVar = nn.b(e2.a());
                } else if (b2.equals(vm.b("json"))) {
                    aVar = nn.a(new String(e2.a(), Charset.forName("UTF-8")));
                } else {
                    mo.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.a(znVar2.f());
                aVar.e(znVar2.k());
                aVar.f(znVar2.h("tz-offset"));
                qn.a a5 = qn.a();
                a5.b(qn.c.zza(znVar2.g("net-type")));
                a5.a(qn.b.zza(znVar2.g("mobile-subtype")));
                aVar.b(a5.c());
                if (znVar2.d() != null) {
                    aVar.c(znVar2.d());
                }
                arrayList3.add(aVar.d());
            }
            a2.g(arrayList3);
            arrayList2.add(a2.h());
        }
        ln a6 = ln.a(arrayList2);
        String str = null;
        URL url = this.c;
        if (fVar.c() != null) {
            try {
                a d2 = a.d(fVar.c());
                if (d2.e() != null) {
                    str = d2.e();
                }
                if (d2.f() != null) {
                    url = f(d2.f());
                }
            } catch (IllegalArgumentException unused2) {
                return g.a();
            }
        }
        try {
            b bVar = (b) oo.a(5, new a(url, a6, str), b.b(this), c.b());
            if (bVar.a == 200) {
                return g.d(bVar.c);
            }
            int i = bVar.a;
            if (i < 500) {
                if (i != 404) {
                    return g.a();
                }
            }
            return g.e();
        } catch (IOException e3) {
            mo.c("CctTransportBackend", "Could not make request to the backend", e3);
            return g.e();
        }
    }

    public zn b(zn znVar) {
        int i;
        qn.b bVar;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        zn.a l = znVar.l();
        l.a("sdk-version", Build.VERSION.SDK_INT);
        l.c("model", Build.MODEL);
        l.c("hardware", Build.HARDWARE);
        l.c("device", Build.DEVICE);
        l.c("product", Build.PRODUCT);
        l.c("os-uild", Build.ID);
        l.c("manufacturer", Build.MANUFACTURER);
        l.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        l.b("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        l.a("net-type", activeNetworkInfo == null ? qn.c.NONE.zza() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = qn.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            i = activeNetworkInfo.getSubtype();
            if (i == -1) {
                bVar = qn.b.COMBINED;
            } else {
                if (qn.b.zza(i) == null) {
                    i = 0;
                }
                l.a("mobile-subtype", i);
                return l.d();
            }
        }
        i = bVar.zza();
        l.a("mobile-subtype", i);
        return l.d();
    }
}
