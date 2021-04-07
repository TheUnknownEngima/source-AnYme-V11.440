package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.og2;
import java.io.ByteArrayInputStream;

/* renamed from: wr1  reason: default package */
public abstract class wr1 extends WebViewClient implements og2 {
    /* access modifiers changed from: private */
    public static final ByteArrayInputStream f;
    public static final b g = new b((r62) null);
    private final d22 e = g22.b(new a(m().c(), (oh2) null, (o52) null));

    /* renamed from: wr1$a */
    public static final class a extends w62 implements o52<tr1> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sh2 sh2, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [tr1, java.lang.Object] */
        public final tr1 invoke() {
            return this.f.e(f72.b(tr1.class), this.g, this.h);
        }
    }

    /* renamed from: wr1$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final WebResourceResponse a() {
            return new WebResourceResponse("text/plain", "UTF-8", wr1.f);
        }
    }

    static {
        byte[] bytes = "".getBytes(q82.a);
        v62.d(bytes, "(this as java.lang.String).getBytes(charset)");
        f = new ByteArrayInputStream(bytes);
    }

    private final tr1 b() {
        return (tr1) this.e.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        v62.e(webView, "view");
        v62.e(webResourceRequest, "request");
        return b().a(webResourceRequest.getUrl().toString()) ? g.a() : super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
