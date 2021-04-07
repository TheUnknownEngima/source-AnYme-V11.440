package com.zunjae.anyme.features.browsers.sites;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.features.browsers.abstracts.AbstractBrowser;
import java.util.HashMap;

public final class BasicWebViewBrowser extends AbstractBrowser {
    public static final a S = new a((r62) null);
    private String Q;
    private HashMap R;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Intent a(Context context, String str) {
            Intent intent = new Intent(context, BasicWebViewBrowser.class);
            intent.putExtra("url", str);
            return intent;
        }
    }

    public static final class b extends wr1 {
        final /* synthetic */ BasicWebViewBrowser h;

        static final class a implements Runnable {
            public static final a e = new a();

            a() {
            }

            public final void run() {
            }
        }

        b(BasicWebViewBrowser basicWebViewBrowser) {
            this.h = basicWebViewBrowser;
        }

        public void onPageFinished(WebView webView, String str) {
            String str2;
            super.onPageFinished(webView, str);
            Toolbar toolbar = (Toolbar) this.h.D0(C0275R$id.toolbar);
            v62.d(toolbar, "toolbar");
            if (webView == null || (str2 = webView.getTitle()) == null) {
                str2 = "";
            }
            toolbar.setTitle((CharSequence) str2);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            Toolbar toolbar = (Toolbar) this.h.D0(C0275R$id.toolbar);
            v62.d(toolbar, "toolbar");
            toolbar.setSubtitle((CharSequence) str);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            v62.e(webView, "view");
            v62.e(webResourceRequest, "request");
            webView.post(a.e);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public static final class c extends WebChromeClient {
        final /* synthetic */ BasicWebViewBrowser a;

        c(BasicWebViewBrowser basicWebViewBrowser) {
            this.a = basicWebViewBrowser;
        }

        public void onProgressChanged(WebView webView, int i) {
            v62.e(webView, "view");
            super.onProgressChanged(webView, i);
            yr1.a.c(i, (ProgressBar) this.a.D0(C0275R$id.browserProgressBar));
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void E0() {
        View findViewById = findViewById(C0275R$id.exploreBrowserWebView);
        v62.d(findViewById, "findViewById(R.id.exploreBrowserWebView)");
        A0((WebView) findViewById);
        WebSettings settings = y0().getSettings();
        v62.d(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(com.zunjae.constants.b.d.a());
        y0().setWebViewClient(new b(this));
        y0().setWebChromeClient(new c(this));
        WebView y0 = y0();
        String str = this.Q;
        if (str != null) {
            y0.loadUrl(str);
        } else {
            v62.p("url");
            throw null;
        }
    }

    public View D0(int i) {
        if (this.R == null) {
            this.R = new HashMap();
        }
        View view = (View) this.R.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.R.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_explorebrowser);
        String stringExtra = getIntent().getStringExtra("url");
        v62.c(stringExtra);
        this.Q = stringExtra;
        Toolbar toolbar = (Toolbar) D0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        j0(toolbar, "Please wait...", "Loading page...", true);
        E0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        MenuItem findItem = menu.findItem(C0275R$id.browser_cast);
        v62.d(findItem, "menu.findItem(R.id.browser_cast)");
        findItem.setVisible(false);
        MenuItem findItem2 = menu.findItem(C0275R$id.browser_downloader);
        v62.d(findItem2, "menu.findItem(R.id.browser_downloader)");
        findItem2.setVisible(false);
        return true;
    }
}
