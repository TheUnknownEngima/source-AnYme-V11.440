package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.s;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class o extends g implements s {
    private static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> v = new AtomicReference<>();
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final s.e i;
    private final s.e j = new s.e();
    private k50<String> k;
    private l l;
    private HttpURLConnection m;
    private InputStream n;
    private boolean o;
    private int p;
    private long q;
    private long r;
    private long s;
    private long t;

    public o(String str, int i2, int i3, boolean z, s.e eVar) {
        super(true);
        q40.d(str);
        this.h = str;
        this.f = i2;
        this.g = i3;
        this.e = z;
        this.i = eVar;
    }

    private void k() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                b50.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.m = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long l(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x0036
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x0038
        L_0x0015:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            defpackage.b50.c(r3, r1)
        L_0x0036:
            r4 = -1
        L_0x0038:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00cb
            java.util.regex.Pattern r1 = u
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00cb
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x00aa }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x006e
            r4 = r6
            goto L_0x00cb
        L_0x006e:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            int r8 = r8.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00aa }
            r8.<init>(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r2)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = r8.toString()     // Catch:{ NumberFormatException -> 0x00aa }
            defpackage.b50.h(r3, r0)     // Catch:{ NumberFormatException -> 0x00aa }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r4 = r0
            goto L_0x00cb
        L_0x00aa:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            defpackage.b50.c(r3, r10)
        L_0x00cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.o.l(java.net.HttpURLConnection):long");
    }

    private static URL m(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            String valueOf = String.valueOf(protocol);
            throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
        }
        throw new ProtocolException("Null location redirect");
    }

    private static boolean n(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection o(l lVar) {
        HttpURLConnection p2;
        l lVar2 = lVar;
        URL url = new URL(lVar2.a.toString());
        int i2 = lVar2.b;
        byte[] bArr = lVar2.c;
        long j2 = lVar2.f;
        long j3 = lVar2.g;
        boolean d = lVar2.d(1);
        if (!this.e) {
            return p(url, i2, bArr, j2, j3, d, true, lVar2.d);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                Map<String, String> map = lVar2.d;
                int i5 = i4;
                byte[] bArr2 = bArr;
                long j4 = j3;
                long j5 = j2;
                p2 = p(url, i2, bArr, j2, j3, d, false, map);
                int responseCode = p2.getResponseCode();
                String headerField = p2.getHeaderField("Location");
                if ((i2 == 1 || i2 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    p2.disconnect();
                    url = m(url, headerField);
                } else if (i2 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return p2;
                } else {
                    p2.disconnect();
                    url = m(url, headerField);
                    bArr2 = null;
                    i2 = 1;
                }
                i3 = i5;
                bArr = bArr2;
                j3 = j4;
                j2 = j5;
                lVar2 = lVar;
            } else {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Too many redirects: ");
                sb.append(i4);
                throw new NoRouteToHostException(sb.toString());
            }
        }
        return p2;
    }

    private HttpURLConnection p(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) {
        HttpURLConnection r2 = r(url);
        r2.setConnectTimeout(this.f);
        r2.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        s.e eVar = this.i;
        if (eVar != null) {
            hashMap.putAll(eVar.a());
        }
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            r2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            r2.setRequestProperty("Range", sb2);
        }
        r2.setRequestProperty("User-Agent", this.h);
        r2.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        r2.setInstanceFollowRedirects(z2);
        r2.setDoOutput(bArr != null);
        r2.setRequestMethod(l.b(i2));
        if (bArr != null) {
            r2.setFixedLengthStreamingMode(bArr.length);
            r2.connect();
            OutputStream outputStream = r2.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            r2.connect();
        }
        return r2;
    }

    private static void q(HttpURLConnection httpURLConnection, long j2) {
        int i2 = v50.a;
        if (i2 == 19 || i2 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j2 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private int s(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.r;
        if (j2 != -1) {
            long j3 = j2 - this.t;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min((long) i3, j3);
        }
        int read = this.n.read(bArr, i2, i3);
        if (read != -1) {
            this.t += (long) read;
            f(read);
            return read;
        } else if (this.r == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    private void t() {
        if (this.s != this.q) {
            byte[] andSet = v.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j2 = this.s;
                long j3 = this.q;
                if (j2 != j3) {
                    int read = this.n.read(andSet, 0, (int) Math.min(j3 - j2, (long) andSet.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.s += (long) read;
                        f(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    v.set(andSet);
                    return;
                }
            }
        }
    }

    public int a(byte[] bArr, int i2, int i3) {
        try {
            t();
            return s(bArr, i2, i3);
        } catch (IOException e2) {
            throw new s.b(e2, this.l, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[Catch:{ IOException -> 0x0092 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c(com.google.android.exoplayer2.upstream.l r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to connect"
            r7.l = r8
            r1 = 0
            r7.t = r1
            r7.s = r1
            r7.h(r8)
            r3 = 1
            java.net.HttpURLConnection r4 = r7.o(r8)     // Catch:{ IOException -> 0x00c6 }
            r7.m = r4     // Catch:{ IOException -> 0x00c6 }
            int r4 = r4.getResponseCode()     // Catch:{ IOException -> 0x00bc }
            r7.p = r4     // Catch:{ IOException -> 0x00bc }
            java.net.HttpURLConnection r4 = r7.m     // Catch:{ IOException -> 0x00bc }
            java.lang.String r0 = r4.getResponseMessage()     // Catch:{ IOException -> 0x00bc }
            int r4 = r7.p
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 < r5) goto L_0x009c
            r6 = 299(0x12b, float:4.19E-43)
            if (r4 <= r6) goto L_0x002c
            goto L_0x009c
        L_0x002c:
            java.net.HttpURLConnection r0 = r7.m
            java.lang.String r0 = r0.getContentType()
            k50<java.lang.String> r4 = r7.k
            if (r4 == 0) goto L_0x0046
            boolean r4 = r4.a(r0)
            if (r4 == 0) goto L_0x003d
            goto L_0x0046
        L_0x003d:
            r7.k()
            com.google.android.exoplayer2.upstream.s$c r1 = new com.google.android.exoplayer2.upstream.s$c
            r1.<init>(r0, r8)
            throw r1
        L_0x0046:
            int r0 = r7.p
            if (r0 != r5) goto L_0x0051
            long r4 = r8.f
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r1 = r4
        L_0x0051:
            r7.q = r1
            java.net.HttpURLConnection r0 = r7.m
            boolean r0 = n(r0)
            long r1 = r8.g
            if (r0 != 0) goto L_0x0075
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            goto L_0x0075
        L_0x0064:
            java.net.HttpURLConnection r1 = r7.m
            long r1 = l(r1)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            long r4 = r7.q
            long r4 = r1 - r4
        L_0x0072:
            r7.r = r4
            goto L_0x0077
        L_0x0075:
            r7.r = r1
        L_0x0077:
            java.net.HttpURLConnection r1 = r7.m     // Catch:{ IOException -> 0x0092 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0092 }
            r7.n = r1     // Catch:{ IOException -> 0x0092 }
            if (r0 == 0) goto L_0x008a
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0092 }
            java.io.InputStream r1 = r7.n     // Catch:{ IOException -> 0x0092 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0092 }
            r7.n = r0     // Catch:{ IOException -> 0x0092 }
        L_0x008a:
            r7.o = r3
            r7.i(r8)
            long r0 = r7.r
            return r0
        L_0x0092:
            r0 = move-exception
            r7.k()
            com.google.android.exoplayer2.upstream.s$b r1 = new com.google.android.exoplayer2.upstream.s$b
            r1.<init>((java.io.IOException) r0, (com.google.android.exoplayer2.upstream.l) r8, (int) r3)
            throw r1
        L_0x009c:
            java.net.HttpURLConnection r1 = r7.m
            java.util.Map r1 = r1.getHeaderFields()
            r7.k()
            com.google.android.exoplayer2.upstream.s$d r2 = new com.google.android.exoplayer2.upstream.s$d
            int r3 = r7.p
            r2.<init>(r3, r0, r1, r8)
            int r8 = r7.p
            r0 = 416(0x1a0, float:5.83E-43)
            if (r8 != r0) goto L_0x00bb
            com.google.android.exoplayer2.upstream.j r8 = new com.google.android.exoplayer2.upstream.j
            r0 = 0
            r8.<init>(r0)
            r2.initCause(r8)
        L_0x00bb:
            throw r2
        L_0x00bc:
            r1 = move-exception
            r7.k()
            com.google.android.exoplayer2.upstream.s$b r2 = new com.google.android.exoplayer2.upstream.s$b
            r2.<init>(r0, r1, r8, r3)
            throw r2
        L_0x00c6:
            r1 = move-exception
            com.google.android.exoplayer2.upstream.s$b r2 = new com.google.android.exoplayer2.upstream.s$b
            r2.<init>(r0, r1, r8, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.o.c(com.google.android.exoplayer2.upstream.l):long");
    }

    public void close() {
        try {
            if (this.n != null) {
                q(this.m, j());
                this.n.close();
            }
            this.n = null;
            k();
            if (this.o) {
                this.o = false;
                g();
            }
        } catch (IOException e2) {
            throw new s.b(e2, this.l, 3);
        } catch (Throwable th) {
            this.n = null;
            k();
            if (this.o) {
                this.o = false;
                g();
            }
            throw th;
        }
    }

    public Map<String, List<String>> d() {
        HttpURLConnection httpURLConnection = this.m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public Uri e() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* access modifiers changed from: protected */
    public final long j() {
        long j2 = this.r;
        return j2 == -1 ? j2 : j2 - this.t;
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection r(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
