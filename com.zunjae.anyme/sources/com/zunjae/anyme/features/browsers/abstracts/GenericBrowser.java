package com.zunjae.anyme.features.browsers.abstracts;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;

public abstract class GenericBrowser extends AbstractBrowser {
    private final d22 Q = g22.b(new a(this, (oh2) null, (o52) null));
    protected Toolbar R;
    private ProgressBar S;
    private final String T = com.zunjae.constants.b.d.a();

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

    public final class b extends wr1 {

        static final class a implements Runnable {
            final /* synthetic */ b e;
            final /* synthetic */ String f;
            final /* synthetic */ WebView g;

            a(b bVar, String str, WebView webView) {
                this.e = bVar;
                this.f = str;
                this.g = webView;
            }

            public final void run() {
                String str;
                String str2;
                GenericBrowser genericBrowser;
                if (GenericBrowser.this.n0()) {
                    genericBrowser = GenericBrowser.this;
                    str2 = this.f;
                    str = genericBrowser.L0(this.g);
                } else {
                    genericBrowser = GenericBrowser.this;
                    str2 = this.f;
                    str = genericBrowser.N0(this.g);
                }
                genericBrowser.C0(str2, str, GenericBrowser.this.M0());
                GenericBrowser.this.Q0(this.f);
            }
        }

        public b() {
        }

        public void onPageFinished(WebView webView, String str) {
            v62.e(webView, "view");
            v62.e(str, "url");
            super.onPageFinished(webView, str);
            if (!GenericBrowser.this.I0().h0(str)) {
                GenericBrowser.this.G0().setSubtitle((CharSequence) str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            v62.e(webView, "view");
            v62.e(str, "url");
            super.onPageStarted(webView, str, bitmap);
            if (ie2.e(webView.getTitle())) {
                GenericBrowser.this.G0().setTitle((CharSequence) webView.getTitle());
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            v62.e(webView, "view");
            v62.e(webResourceRequest, "request");
            String uri = webResourceRequest.getUrl().toString();
            v62.d(uri, "request.url.toString()");
            if (GenericBrowser.this.I0().h0(uri) && GenericBrowser.this.x0()) {
                GenericBrowser.this.y0().post(new a(this, uri, webView));
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    private final class c extends vr1 {
        public c(GenericBrowser genericBrowser, ProgressBar progressBar) {
            super(progressBar);
        }
    }

    /* access modifiers changed from: private */
    public final zw1 I0() {
        return (zw1) this.Q.getValue();
    }

    private final void J0() {
        y0().stopLoading();
        WebView y0 = y0();
        String K0 = K0();
        if (K0 == null) {
            K0 = "about:blank";
        }
        y0.loadUrl(K0);
    }

    /* access modifiers changed from: protected */
    public boolean F0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final Toolbar G0() {
        Toolbar toolbar = this.R;
        if (toolbar != null) {
            return toolbar;
        }
        v62.p("toolbar");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String H0() {
        return this.T;
    }

    /* access modifiers changed from: protected */
    public abstract String K0();

    /* access modifiers changed from: protected */
    public abstract String L0(WebView webView);

    /* access modifiers changed from: protected */
    public final String M0() {
        return "AnYme";
    }

    /* access modifiers changed from: protected */
    public abstract String N0(WebView webView);

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void O0() {
        View findViewById = findViewById(C0275R$id.webView);
        v62.d(findViewById, "findViewById(R.id.webView)");
        A0((WebView) findViewById);
        WebSettings settings = y0().getSettings();
        v62.d(settings, "webView.settings");
        if (F0()) {
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(false);
        }
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(H0());
        WebView y0 = y0();
        ProgressBar progressBar = this.S;
        if (progressBar != null) {
            y0.setWebChromeClient(new c(this, progressBar));
        } else {
            v62.p("progressBar");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String P0();

    /* access modifiers changed from: protected */
    public abstract void Q0(String str);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_abstract_browser);
        View findViewById = findViewById(2131297210);
        v62.d(findViewById, "findViewById(R.id.toolbar)");
        this.R = (Toolbar) findViewById;
        View findViewById2 = findViewById(C0275R$id.browserProgressBar);
        v62.d(findViewById2, "findViewById(R.id.browserProgressBar)");
        this.S = (ProgressBar) findViewById2;
        View findViewById3 = findViewById(C0275R$id.webView);
        v62.d(findViewById3, "findViewById(R.id.webView)");
        A0((WebView) findViewById3);
        Toolbar toolbar = this.R;
        if (toolbar != null) {
            j0(toolbar, P0(), (String) null, true);
            O0();
            WebView y0 = y0();
            String K0 = K0();
            if (K0 == null) {
                K0 = "about:blank";
            }
            y0.loadUrl(K0, yr1.a.a());
            return;
        }
        v62.p("toolbar");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        v62.d(menuInflater, "menuInflater");
        menuInflater.inflate(C0279R$menu.menu_activity_abstractnsfwbrowser, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() == 2131296704) {
            J0();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
