package com.zunjae.anyme.features.login;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.browsers.abstracts.AbstractBrowser;
import java.util.HashMap;
import java.util.List;

public final class LoginBrowser extends AbstractBrowser {
    public static final a V = new a((r62) null);
    /* access modifiers changed from: private */
    public py1 Q = fz1.a.f();
    private String R;
    private String S;
    private boolean T;
    private HashMap U;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Intent a(Context context, String str, String str2, boolean z) {
            v62.e(context, "context");
            v62.e(str, "username");
            v62.e(str2, "password");
            Intent intent = new Intent(context, LoginBrowser.class);
            intent.putExtra("username", str);
            intent.putExtra("password", str2);
            intent.putExtra("cancellable", z);
            return intent;
        }
    }

    private final class b extends wr1 {
        public b() {
        }

        public void onPageFinished(WebView webView, String str) {
            v62.e(webView, "view");
            v62.e(str, "url");
            super.onPageFinished(webView, str);
            String lowerCase = str.toLowerCase();
            v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (g92.v(lowerCase, LoginBrowser.this.Q.a(), false, 2, (Object) null)) {
                yr1.a.b(LoginBrowser.this.y0(), ax1.c.b(LoginBrowser.this.Q.f(), LoginBrowser.G0(LoginBrowser.this)));
                yr1.a.b(LoginBrowser.this.y0(), ax1.c.b(LoginBrowser.this.Q.c(), LoginBrowser.F0(LoginBrowser.this)));
                yr1.a.b(LoginBrowser.this.y0(), "document.querySelector('input[name=\"cookie\"]').checked=true;");
            }
            String cookie = CookieManager.getInstance().getCookie(lowerCase);
            if (cookie != null && g92.v(cookie, LoginBrowser.this.Q.b(), false, 2, (Object) null)) {
                fz1.a.p(cookie);
                LoginBrowser.this.setResult(lv1.f.c());
                LoginBrowser.this.finish();
            }
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ LoginBrowser e;

        c(LoginBrowser loginBrowser) {
            this.e = loginBrowser;
        }

        public final void onClick(View view) {
            this.e.M0();
        }
    }

    public static final class d extends WebChromeClient {
        final /* synthetic */ LoginBrowser a;

        d(LoginBrowser loginBrowser) {
            this.a = loginBrowser;
        }

        public void onProgressChanged(WebView webView, int i) {
            v62.e(webView, "view");
            super.onProgressChanged(webView, i);
            yr1.a.c(i, (ProgressBar) this.a.D0(C0275R$id.browserProgressBar));
        }
    }

    static final class e implements f.n {
        final /* synthetic */ LoginBrowser a;

        e(LoginBrowser loginBrowser) {
            this.a = loginBrowser;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            fz1.a.d();
            this.a.finish();
        }
    }

    static final class f extends w62 implements o52<u22> {
        final /* synthetic */ LoginBrowser f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LoginBrowser loginBrowser) {
            super(0);
            this.f = loginBrowser;
        }

        public final void a() {
            this.f.y0().loadUrl("about:blank");
            try {
                WebStorage.getInstance().deleteAllData();
            } catch (Exception unused) {
            }
            this.f.y0().loadUrl(this.f.Q.a());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    static final class g implements f.i {
        final /* synthetic */ LoginBrowser a;
        final /* synthetic */ f b;

        g(LoginBrowser loginBrowser, f fVar) {
            this.a = loginBrowser;
            this.b = fVar;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            if (i != 0) {
                if (i == 1) {
                    mw1.q(this.a, "Please change your password (on your regular web browser) and try to login again in AnYme", "Info");
                } else if (i == 2) {
                    LoginBrowser loginBrowser = this.a;
                    String str = com.zunjae.constants.a.a;
                    v62.d(str, "Sites.MAL_RESET_PASS");
                    loginBrowser.g0(str);
                    return;
                } else if (i == 3) {
                    mw1.q(this.a, "Due to safety reasons Google login is not a feature", "Info");
                    return;
                } else if (i == 4) {
                    l02.b();
                    this.a.finish();
                    this.a.startActivity(new Intent(this.a, WelcomeActivity.class));
                    return;
                } else {
                    return;
                }
            }
            this.b.a();
        }
    }

    public static final /* synthetic */ String F0(LoginBrowser loginBrowser) {
        String str = loginBrowser.S;
        if (str != null) {
            return str;
        }
        v62.p("password");
        throw null;
    }

    public static final /* synthetic */ String G0(LoginBrowser loginBrowser) {
        String str = loginBrowser.R;
        if (str != null) {
            return str;
        }
        v62.p("username");
        throw null;
    }

    private final void J0() {
        Button button = (Button) D0(C0275R$id.issuesLoggingIn);
        v62.d(button, "issuesLoggingIn");
        rw1.i(button);
        ((Button) D0(C0275R$id.issuesLoggingIn)).setOnClickListener(new c(this));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void K0() {
        View findViewById = findViewById(C0275R$id.exploreBrowserWebView);
        v62.d(findViewById, "findViewById(R.id.exploreBrowserWebView)");
        A0((WebView) findViewById);
        WebSettings settings = y0().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(N0());
        y0().clearCache(true);
        y0().clearHistory();
        y0().clearFormData();
        y0().setWebViewClient(new b());
        y0().setWebChromeClient(new d(this));
        y0().loadUrl(this.Q.a());
    }

    private final void L0() {
        f.e eVar = new f.e(this);
        eVar.E("Notice");
        eVar.i("Click on the login button to authorize AnYme with MyAnimeList.\n\nAvoid logging in with Google/Facebook/Twitter\n\n(Note: you're required to re-login every 10 days to refresh your tokens)");
        eVar.B("Ok");
        if (this.T) {
            eVar.w("Remind Me Later");
            eVar.y(new e(this));
        }
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void M0() {
        f fVar = new f(this);
        List h = f32.h("Refresh Browser", "Password is wrong", "Reset password", "Google login not working", "Logout");
        f.e eVar = new f.e(this);
        eVar.E("Pick an option");
        eVar.q(h);
        eVar.s(new g(this, fVar));
        eVar.D();
    }

    private final String N0() {
        try {
            String property = System.getProperty("http.agent");
            v62.c(property);
            return property;
        } catch (Exception unused) {
            return this.Q.e();
        }
    }

    public View D0(int i) {
        if (this.U == null) {
            this.U = new HashMap();
        }
        View view = (View) this.U.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.U.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean O() {
        return false;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_explorebrowser);
        this.T = getIntent().getBooleanExtra("cancellable", false);
        String stringExtra = getIntent().getStringExtra("username");
        v62.c(stringExtra);
        this.R = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("password");
        v62.c(stringExtra2);
        this.S = stringExtra2;
        Toolbar toolbar = (Toolbar) D0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, this.T, 6, (Object) null);
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        L0();
        J0();
        for (l22 l22 : this.Q.d()) {
            CookieManager.getInstance().setCookie((String) l22.c(), (String) l22.d());
        }
        K0();
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
