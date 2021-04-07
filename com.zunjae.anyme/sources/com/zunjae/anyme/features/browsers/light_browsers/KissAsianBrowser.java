package com.zunjae.anyme.features.browsers.light_browsers;

import android.content.ComponentCallbacks;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.features.browsers.abstracts.AbstractLightBrowser;

public final class KissAsianBrowser extends AbstractLightBrowser {
    private final d22 S = g22.b(new a(this, (oh2) null, (o52) null));

    public static final class a extends w62 implements o52<zw1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [zw1, java.lang.Object] */
        public final zw1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(zw1.class), this.g, this.h);
        }
    }

    private final class b extends wr1 {

        static final class a implements Runnable {
            final /* synthetic */ b e;
            final /* synthetic */ String f;

            a(b bVar, String str) {
                this.e = bVar;
                this.f = str;
            }

            public final void run() {
                KissAsianBrowser kissAsianBrowser = KissAsianBrowser.this;
                kissAsianBrowser.C0(this.f, kissAsianBrowser.y0().getTitle(), (String) null);
            }
        }

        public b() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (!KissAsianBrowser.this.M0().h0(str)) {
                Toolbar H0 = KissAsianBrowser.this.Q;
                v62.d(H0, "toolbar");
                H0.setSubtitle((CharSequence) str);
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            v62.e(webView, "view");
            v62.e(webResourceRequest, "request");
            String uri = webResourceRequest.getUrl().toString();
            v62.d(uri, "request.url.toString()");
            if (KissAsianBrowser.this.M0().h0(uri) && KissAsianBrowser.this.x0()) {
                KissAsianBrowser.this.y0().post(new a(this, uri));
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    private final class c extends vr1 {
        public c() {
        }

        public void onProgressChanged(WebView webView, int i) {
            v62.e(webView, "view");
            super.onProgressChanged(webView, i);
            yr1.a.c(i, KissAsianBrowser.this.R);
        }
    }

    /* access modifiers changed from: private */
    public final zw1 M0() {
        return (zw1) this.S.getValue();
    }

    /* access modifiers changed from: protected */
    public void E0() {
        super.E0();
        y0().setWebViewClient(new b());
        y0().setWebChromeClient(new c());
        y0().loadUrl(L0(), yr1.a.a());
    }

    public String L0() {
        return "https://kissasian.la/category/latest-asian-drama-releases/";
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        MenuItem findItem = menu.findItem(C0275R$id.browser_cast);
        v62.d(findItem, "menu.findItem(R.id.browser_cast)");
        findItem.setVisible(false);
        return true;
    }
}
