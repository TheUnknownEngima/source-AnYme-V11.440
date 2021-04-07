package com.zunjae.anyme.features.browsers.abstracts;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractStreamingActivity;
import com.zunjae.anyme.features.login.LoginActivity;
import com.zunjae.downloader.i;

public abstract class AbstractBrowser extends AbstractStreamingActivity {
    protected WebView J;
    private jw1 K;
    private int L = 1500;
    private boolean M;
    private int N;
    private boolean O;
    private boolean P;

    static final class a implements Runnable {
        final /* synthetic */ AbstractBrowser e;

        a(AbstractBrowser abstractBrowser) {
            this.e = abstractBrowser;
        }

        public final void run() {
            this.e.z0(true);
        }
    }

    static final class b implements f.n {
        final /* synthetic */ AbstractBrowser a;

        b(AbstractBrowser abstractBrowser) {
            this.a = abstractBrowser;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            this.a.w0();
        }
    }

    private final void B0() {
        f.e eVar = new f.e(this);
        eVar.E("Info");
        eVar.i("Using the downloader/casting mode requires you to be logged in on MyAnimeList");
        eVar.B("Login");
        eVar.w("Cancel");
        eVar.A(new b(this));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void w0() {
        finish();
        startActivity(new Intent(this, LoginActivity.class));
    }

    /* access modifiers changed from: protected */
    public final void A0(WebView webView) {
        v62.e(webView, "<set-?>");
        this.J = webView;
    }

    /* access modifiers changed from: protected */
    public final void C0(String str, String str2, String str3) {
        i iVar;
        if (this.O) {
            if (n0()) {
                v62.c(str2);
                v62.c(str);
                v62.c(str3);
                q0(new i.c(str2, str, str3));
                return;
            }
            if (l0()) {
                v62.c(str);
                v62.c(str2);
                iVar = new i.b(str, str2, this.N);
            } else {
                v62.c(str2);
                v62.c(str);
                iVar = new i.e(str2, str);
            }
            q0(iVar);
        }
    }

    public void onBackPressed() {
        WebView webView = this.J;
        if (webView == null) {
            v62.p("webView");
            throw null;
        } else if (webView.canGoBack()) {
            WebView webView2 = this.J;
            if (webView2 != null) {
                webView2.goBack();
            } else {
                v62.p("webView");
                throw null;
            }
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.P = l02.e("preference_key_toolbar_back_button", false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        v62.d(menuInflater, "menuInflater");
        menuInflater.inflate(C0279R$menu.menu_activity_abstractbrowser, menu);
        dw1.b(menu, this, n0(), l0());
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.J;
        if (webView != null) {
            webView.stopLoading();
            WebView webView2 = this.J;
            if (webView2 != null) {
                webView2.loadUrl("about:blank");
            } else {
                v62.p("webView");
                throw null;
            }
        } else {
            v62.p("webView");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        switch (menuItem.getItemId()) {
            case C0275R$id.browser_cast:
            case C0275R$id.browser_downloader:
                if (fz1.a.h()) {
                    B0();
                    return super.onOptionsItemSelected(menuItem);
                }
                break;
        }
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            switch (itemId) {
                case C0275R$id.browser_cast:
                    t0();
                    break;
                case C0275R$id.browser_downloader:
                    u0();
                    break;
                case C0275R$id.browser_open_drawer:
                    jw1 jw1 = this.K;
                    if (jw1 != null) {
                        jw1.c();
                        break;
                    }
                    break;
            }
        } else if (this.P) {
            WebView webView = this.J;
            if (webView == null) {
                v62.p("webView");
                throw null;
            } else if (webView.canGoBack()) {
                WebView webView2 = this.J;
                if (webView2 != null) {
                    webView2.goBack();
                    return true;
                }
                v62.p("webView");
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.O = false;
        this.M = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.O = true;
        new Handler().postDelayed(new a(this), (long) this.L);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.K == null) {
            WebView webView = this.J;
            if (webView != null) {
                this.K = new jw1(webView, this);
            } else {
                v62.p("webView");
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean x0() {
        return this.M;
    }

    /* access modifiers changed from: protected */
    public final WebView y0() {
        WebView webView = this.J;
        if (webView != null) {
            return webView;
        }
        v62.p("webView");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void z0(boolean z) {
        this.M = z;
    }
}
