package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.e;
import defpackage.wd;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: ce  reason: default package */
public class ce implements wd<InputStream> {
    static final b k = new a();
    private final tg e;
    private final int f;
    private final b g;
    private HttpURLConnection h;
    private InputStream i;
    private volatile boolean j;

    /* renamed from: ce$a */
    private static class a implements b {
        a() {
        }

        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: ce$b */
    interface b {
        HttpURLConnection a(URL url);
    }

    public ce(tg tgVar, int i2) {
        this(tgVar, i2, k);
    }

    ce(tg tgVar, int i2, b bVar) {
        this.e = tgVar;
        this.f = i2;
        this.g = bVar;
    }

    private InputStream c(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = cm.b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                "Got non empty content encoding: " + httpURLConnection.getContentEncoding();
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.i = inputStream;
        return this.i;
    }

    private static boolean f(int i2) {
        return i2 / 100 == 2;
    }

    private static boolean g(int i2) {
        return i2 / 100 == 3;
    }

    private InputStream h(URL url, int i2, URL url2, Map<String, String> map) {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.h = this.g.a(url);
            for (Map.Entry next : map.entrySet()) {
                this.h.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.h.setConnectTimeout(this.f);
            this.h.setReadTimeout(this.f);
            this.h.setUseCaches(false);
            this.h.setDoInput(true);
            this.h.setInstanceFollowRedirects(false);
            this.h.connect();
            this.i = this.h.getInputStream();
            if (this.j) {
                return null;
            }
            int responseCode = this.h.getResponseCode();
            if (f(responseCode)) {
                return c(this.h);
            }
            if (g(responseCode)) {
                String headerField = this.h.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return h(url3, i2 + 1, url, map);
                }
                throw new e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new e(responseCode);
            } else {
                throw new e(this.h.getResponseMessage(), responseCode);
            }
        } else {
            throw new e("Too many (> 5) redirects!");
        }
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.h = null;
    }

    public void cancel() {
        this.j = true;
    }

    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    public void e(g gVar, wd.a<? super InputStream> aVar) {
        StringBuilder sb;
        long b2 = fm.b();
        try {
            aVar.f(h(this.e.h(), 0, (URL) null, this.e.e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(fm.a(b2));
                sb.toString();
            }
        } catch (IOException e2) {
            boolean isLoggable = Log.isLoggable("HttpUrlFetcher", 3);
            aVar.c(e2);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                "Finished http url fetcher fetch in " + fm.a(b2);
            }
            throw th;
        }
    }
}
