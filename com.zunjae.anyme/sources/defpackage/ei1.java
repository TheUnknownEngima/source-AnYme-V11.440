package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import com.google.firebase.installations.h;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.uh1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ei1  reason: default package */
public class ei1 {
    private static final Pattern d = Pattern.compile("[0-9]+s");
    private static final Charset e = Charset.forName("UTF-8");
    private final Context a;
    private final pi1 b;
    private final uh1 c;

    public ei1(Context context, pi1 pi1, uh1 uh1) {
        this.a = context;
        this.b = pi1;
        this.c = uh1;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.3");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String f() {
        try {
            byte[] a2 = a.a(this.a, this.a.getPackageName());
            if (a2 != null) {
                return j.b(a2, false);
            }
            "Could not get fingerprint hash for package: " + this.a.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            "No such package: " + this.a.getPackageName();
            return null;
        }
    }

    private URL g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e2) {
            throw new h(e2.getMessage(), h.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void i() {
    }

    private static void j(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(n(httpURLConnection))) {
            a(str, str2, str3);
        }
    }

    private HttpURLConnection k(URL url, String str) {
        uh1.a a2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            uh1 uh1 = this.c;
            if (!(uh1 == null || this.b == null || (a2 = uh1.a("fire-installations-id")) == uh1.a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.b.a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a2.getCode()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
    }

    static long l(String str) {
        r.b(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private fi1 m(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        gi1.a a2 = gi1.a();
        fi1.a a3 = fi1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a3.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a3.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a3.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a2.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a2.d(l(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a3.b(a2.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a3.e(fi1.b.OK);
        return a3.a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String n(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei1.n(java.net.HttpURLConnection):java.lang.String");
    }

    private gi1 o(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        gi1.a a2 = gi1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a2.d(l(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.b(gi1.b.OK);
        return a2.a();
    }

    private void p(HttpURLConnection httpURLConnection, String str, String str2) {
        r(httpURLConnection, h(b(str, str2)));
    }

    private void q(HttpURLConnection httpURLConnection) {
        r(httpURLConnection, h(c()));
    }

    private static void r(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public fi1 d(String str, String str2, String str3, String str4, String str5) {
        int i = 0;
        URL g = g(String.format("projects/%s/installations", new Object[]{str3}));
        while (i <= 1) {
            HttpURLConnection k = k(g, str);
            try {
                k.setRequestMethod("POST");
                k.setDoOutput(true);
                if (str5 != null) {
                    k.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                p(k, str2, str4);
                int responseCode = k.getResponseCode();
                if (responseCode == 200) {
                    fi1 m = m(k);
                    k.disconnect();
                    return m;
                }
                j(k, str4, str, str3);
                if (responseCode == 429) {
                    continue;
                } else if (responseCode < 500 || responseCode >= 600) {
                    i();
                    fi1.a a2 = fi1.a();
                    a2.e(fi1.b.BAD_CONFIG);
                    fi1 a3 = a2.a();
                    k.disconnect();
                    return a3;
                }
                i++;
                k.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th) {
                k.disconnect();
                throw th;
            }
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    public gi1 e(String str, String str2, String str3, String str4) {
        int i = 0;
        URL g = g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
        while (i <= 1) {
            HttpURLConnection k = k(g, str);
            try {
                k.setRequestMethod("POST");
                k.addRequestProperty("Authorization", "FIS_v2 " + str4);
                q(k);
                int responseCode = k.getResponseCode();
                if (responseCode == 200) {
                    gi1 o = o(k);
                    k.disconnect();
                    return o;
                }
                j(k, (String) null, str, str3);
                if (responseCode != 401) {
                    if (responseCode != 404) {
                        if (responseCode == 429) {
                            continue;
                        } else if (responseCode < 500 || responseCode >= 600) {
                            i();
                            gi1.a a2 = gi1.a();
                            a2.b(gi1.b.BAD_CONFIG);
                            gi1 a3 = a2.a();
                            k.disconnect();
                            return a3;
                        }
                        i++;
                        k.disconnect();
                    }
                }
                gi1.a a4 = gi1.a();
                a4.b(gi1.b.AUTH_ERROR);
                gi1 a5 = a4.a();
                k.disconnect();
                return a5;
            } catch (IOException unused) {
            } catch (Throwable th) {
                k.disconnect();
                throw th;
            }
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }
}
