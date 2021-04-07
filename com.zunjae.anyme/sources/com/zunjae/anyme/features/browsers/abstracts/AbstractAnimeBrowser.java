package com.zunjae.anyme.features.browsers.abstracts;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.abstracts.AbstractStreamingActivity;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aviran.cookiebar2.a;

public abstract class AbstractAnimeBrowser extends AbstractStreamingActivity {
    public static final d d0 = new d((r62) null);
    private final d22 J = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public List<ax1> K = f32.f();
    private jw1 L;
    private Snackbar M;
    private WebView N;
    protected sy1 O;
    private Toolbar P;
    private ProgressBar Q;
    private int R;
    private int S;
    /* access modifiers changed from: private */
    public String T = "";
    /* access modifiers changed from: private */
    public boolean U;
    private boolean V;
    private String W = com.zunjae.constants.b.d.a();
    /* access modifiers changed from: private */
    public boolean X;
    private boolean Y;
    private List<String> Z;
    /* access modifiers changed from: private */
    public List<String> a0 = f32.f();
    private int b0;
    private HashMap c0;

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

    public class b extends WebChromeClient {
        public b() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            uj2.f(consoleMessage != null ? consoleMessage.message() : null, new Object[0]);
            return super.onConsoleMessage(consoleMessage);
        }

        public void onProgressChanged(WebView webView, int i) {
            v62.e(webView, "view");
            super.onProgressChanged(webView, i);
            yr1.a.c(i, AbstractAnimeBrowser.this.Q0());
        }
    }

    public class c extends wr1 {

        static final class a<T> implements ValueCallback<String> {
            final /* synthetic */ Map.Entry a;

            a(Map.Entry entry) {
                this.a = entry;
            }

            /* renamed from: a */
            public final void onReceiveValue(String str) {
                uj2.f("Result for " + ((String) this.a.getKey()) + " = " + str, new Object[0]);
            }
        }

        static final class b implements Runnable {
            final /* synthetic */ c e;
            final /* synthetic */ WebView f;

            b(c cVar, WebView webView) {
                this.e = cVar;
                this.f = webView;
            }

            public final void run() {
                AbstractAnimeBrowser.this.K0(this.f);
            }
        }

        /* renamed from: com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser$c$c  reason: collision with other inner class name */
        static final class C0171c implements Runnable {
            final /* synthetic */ c e;
            final /* synthetic */ WebView f;

            C0171c(c cVar, WebView webView) {
                this.e = cVar;
                this.f = webView;
            }

            public final void run() {
                AbstractAnimeBrowser.this.H0(this.f);
            }
        }

        static final class d implements Runnable {
            final /* synthetic */ c e;
            final /* synthetic */ e72 f;

            d(c cVar, e72 e72) {
                this.e = cVar;
                this.f = e72;
            }

            public final void run() {
                uj2.f("Starting video stream for url " + ((String) this.f.e), new Object[0]);
                AbstractAnimeBrowser.this.s1((String) this.f.e);
            }
        }

        public c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPageFinished(android.webkit.WebView r8, java.lang.String r9) {
            /*
                r7 = this;
                java.lang.String r0 = "view"
                defpackage.v62.e(r8, r0)
                java.lang.String r0 = "url"
                defpackage.v62.e(r9, r0)
                super.onPageFinished(r8, r9)
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                r0.T = r9
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                zw1 r0 = r0.U0()
                boolean r0 = r0.h0(r9)
                if (r0 == 0) goto L_0x0024
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r8 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                r8.r1(r9)
                return
            L_0x0024:
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                java.util.List r0 = r0.a0
                boolean r1 = r0 instanceof java.util.Collection
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0038
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x0038
            L_0x0036:
                r0 = 0
                goto L_0x0051
            L_0x0038:
                java.util.Iterator r0 = r0.iterator()
            L_0x003c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0036
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                cx1 r4 = defpackage.cx1.a
                boolean r1 = r4.b(r1, r9)
                if (r1 == 0) goto L_0x003c
                r0 = 1
            L_0x0051:
                if (r0 == 0) goto L_0x0057
                r8.goBack()
                return
            L_0x0057:
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r8 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                java.util.Map r8 = r8.X0()
                if (r8 == 0) goto L_0x00d8
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x0067:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x00d8
                java.lang.Object r0 = r8.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "javascript: window.localStorage.setItem('"
                r1.append(r4)
                java.lang.Object r4 = r0.getKey()
                java.lang.String r4 = (java.lang.String) r4
                r1.append(r4)
                java.lang.String r4 = "', '"
                r1.append(r4)
                java.lang.Object r4 = r0.getValue()
                java.lang.String r4 = (java.lang.String) r4
                r1.append(r4)
                java.lang.String r4 = "');"
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                yr1 r4 = defpackage.yr1.a
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r5 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r5 = r5.W0()
                defpackage.v62.c(r5)
                r4.b(r5, r1)
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r1 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r1 = r1.W0()
                if (r1 == 0) goto L_0x0067
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "window.localStorage['"
                r4.append(r5)
                java.lang.Object r5 = r0.getKey()
                java.lang.String r5 = (java.lang.String) r5
                r4.append(r5)
                java.lang.String r5 = "']"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser$c$a r5 = new com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser$c$a
                r5.<init>(r0)
                r1.evaluateJavascript(r4, r5)
                goto L_0x0067
            L_0x00d8:
                java.lang.String r8 = r9.toLowerCase()
                java.lang.String r0 = "(this as java.lang.String).toLowerCase()"
                defpackage.v62.d(r8, r0)
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                boolean r0 = r0.w1(r8)
                if (r0 == 0) goto L_0x00f6
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                sy1 r1 = r0.M0()
                int r1 = r1.i()
                r0.h1(r9, r1)
            L_0x00f6:
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                boolean r0 = r0.v1(r8)
                if (r0 == 0) goto L_0x0126
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r1 = r0.W0()
                r0.f1(r8, r1)
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r1 = r0.W0()
                r0.J0(r8, r1)
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                boolean r0 = r0.U
                if (r0 != 0) goto L_0x0126
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r1 = r0.W0()
                r0.Y0(r1)
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                r0.U = r2
            L_0x0126:
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r0 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                java.util.List r0 = r0.K
                java.util.Iterator r0 = r0.iterator()
            L_0x0130:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0164
                java.lang.Object r1 = r0.next()
                ax1 r1 = (defpackage.ax1) r1
                boolean r4 = r1.c()
                if (r4 == 0) goto L_0x0151
                java.lang.String r4 = r1.a()
                defpackage.v62.c(r4)
                r5 = 2
                r6 = 0
                boolean r4 = defpackage.g92.v(r8, r4, r3, r5, r6)
                if (r4 == 0) goto L_0x0130
            L_0x0151:
                yr1 r4 = defpackage.yr1.a
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r5 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r5 = r5.W0()
                defpackage.v62.c(r5)
                java.lang.String r1 = r1.b()
                r4.b(r5, r1)
                goto L_0x0130
            L_0x0164:
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r8 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                java.util.HashMap r8 = r8.a1()
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x0172:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x01ad
                java.lang.Object r0 = r8.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = defpackage.f92.m(r9, r1, r2)
                if (r1 == 0) goto L_0x0172
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r1 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r1 = r1.W0()
                if (r1 == 0) goto L_0x019b
                r1.stopLoading()
            L_0x019b:
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r1 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r1 = r1.W0()
                if (r1 == 0) goto L_0x0172
                yr1 r3 = defpackage.yr1.a
                java.util.HashMap r3 = r3.a()
                r1.loadUrl(r0, r3)
                goto L_0x0172
            L_0x01ad:
                com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser r8 = com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.this
                android.webkit.WebView r9 = r8.W0()
                defpackage.v62.c(r9)
                r8.I0(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.c.onPageFinished(android.webkit.WebView, java.lang.String):void");
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Toolbar R0;
            v62.e(webView, "view");
            v62.e(str, "url");
            super.onPageStarted(webView, str, bitmap);
            if (AbstractAnimeBrowser.this.v1(str)) {
                AbstractAnimeBrowser abstractAnimeBrowser = AbstractAnimeBrowser.this;
                abstractAnimeBrowser.g1(str, abstractAnimeBrowser.W0());
            }
            if (!AbstractAnimeBrowser.this.U0().h0(str) && (R0 = AbstractAnimeBrowser.this.R0()) != null) {
                R0.setSubtitle((CharSequence) str);
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            uj2.h(vw1.AdBlocker.getValue());
            uj2.a(String.valueOf(webResourceError), new Object[0]);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            v62.e(webView, "view");
            v62.e(webResourceRequest, "request");
            e72 e72 = new e72();
            T uri = webResourceRequest.getUrl().toString();
            v62.d(uri, "request.url.toString()");
            e72.e = uri;
            if (f92.l(uri, "?autostart=true", false, 2, (Object) null)) {
                e72.e = f92.q((String) e72.e, "?autostart=true", "?autostart=false", false, 4, (Object) null);
            }
            AbstractAnimeBrowser abstractAnimeBrowser = AbstractAnimeBrowser.this;
            String str = (String) e72.e;
            if (str != null) {
                String lowerCase = str.toLowerCase();
                v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (abstractAnimeBrowser.v1(lowerCase)) {
                    AbstractAnimeBrowser.this.runOnUiThread(new b(this, webView));
                }
                AbstractAnimeBrowser.this.runOnUiThread(new C0171c(this, webView));
                boolean h0 = AbstractAnimeBrowser.this.U0().h0((String) e72.e);
                if (h0 && AbstractAnimeBrowser.this.N0()) {
                    webView.post(new d(this, e72));
                }
                if (!h0) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                byte[] bytes = "".getBytes(q82.a);
                v62.d(bytes, "(this as java.lang.String).getBytes(charset)");
                return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(bytes));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(r62 r62) {
            this();
        }

        public final Intent a(Context context, sy1 sy1, Class<?> cls, boolean z, boolean z2) {
            v62.e(context, "context");
            v62.e(sy1, "anime");
            v62.e(cls, "browser");
            Intent intent = new Intent(context, cls);
            intent.putExtra("anime", sy1);
            intent.putExtra("castOnStartup", z);
            intent.putExtra("downloadOnStartup", z2);
            return intent;
        }
    }

    static final class e implements org.aviran.cookiebar2.c {
        final /* synthetic */ AbstractAnimeBrowser a;
        final /* synthetic */ String b;

        e(AbstractAnimeBrowser abstractAnimeBrowser, String str) {
            this.a = abstractAnimeBrowser;
            this.b = str;
        }

        public final void a() {
            this.a.V().b(this.b);
        }
    }

    static final class f implements Runnable {
        final /* synthetic */ AbstractAnimeBrowser e;

        f(AbstractAnimeBrowser abstractAnimeBrowser) {
            this.e = abstractAnimeBrowser;
        }

        public final void run() {
            this.e.j1(true);
        }
    }

    static final class g implements Runnable {
        final /* synthetic */ Toolbar e;
        final /* synthetic */ String f;

        g(Toolbar toolbar, String str) {
            this.e = toolbar;
            this.f = str;
        }

        public final void run() {
            this.e.setTitle((CharSequence) this.f);
        }
    }

    static final class h implements View.OnClickListener {
        final /* synthetic */ AbstractAnimeBrowser e;
        final /* synthetic */ String f;

        h(AbstractAnimeBrowser abstractAnimeBrowser, String str) {
            this.e = abstractAnimeBrowser;
            this.f = str;
        }

        public final void onClick(View view) {
            this.e.r1(this.f);
        }
    }

    static final class i implements Runnable {
        final /* synthetic */ AbstractAnimeBrowser e;

        static final class a implements Runnable {
            final /* synthetic */ i e;

            a(i iVar) {
                this.e = iVar;
            }

            public final void run() {
                this.e.e.X = true;
            }
        }

        i(AbstractAnimeBrowser abstractAnimeBrowser) {
            this.e = abstractAnimeBrowser;
        }

        public final void run() {
            this.e.X = false;
            new Handler().postDelayed(new a(this), 1000);
        }
    }

    private final void L0() {
        if (!V().c("HelpBlockAds")) {
            try {
                a.b c2 = org.aviran.cookiebar2.a.c(this);
                c2.e("Help improve the app");
                c2.c(false);
                c2.d(getString(C0283R$string.helpTrainTheAdBlocker));
                c2.b("Understood!", new e(this, "HelpBlockAds"));
                c2.f();
            } catch (Exception e2) {
                uj2.d(e2);
            }
        }
    }

    private final String P0(int i2) {
        return e1() + i2;
    }

    private final String S0(int i2, String str) {
        String l = l02.l(P0(i2), i1(str));
        v62.d(l, "ZimpleDB.getString(getKe…, searchUrl(seriesTitle))");
        return l;
    }

    /* access modifiers changed from: private */
    public final zw1 U0() {
        return (zw1) this.J.getValue();
    }

    private final String V0() {
        if (this.S > 0) {
            StringBuilder sb = new StringBuilder();
            sy1 sy1 = this.O;
            if (sy1 != null) {
                sb.append(sy1.y());
                sb.append(" (Episode ");
                sb.append(this.S);
                sb.append(") anyme.app.mp4");
                return sb.toString();
            }
            v62.p("anime");
            throw null;
        }
        sy1 sy12 = this.O;
        if (sy12 != null) {
            return sy12.y();
        }
        v62.p("anime");
        throw null;
    }

    @SuppressLint({"DefaultLocale"})
    private final void n1(sy1 sy1, Toolbar toolbar) {
        String str;
        int i2 = this.S;
        int i3 = this.R;
        if (i2 > i3) {
            i2 -= i3;
        }
        if (this.S > 0) {
            h72 h72 = h72.a;
            str = String.format("(%d/%d) %s", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(sy1.u()), sy1.y()}, 3));
            v62.d(str, "java.lang.String.format(format, *args)");
        } else {
            str = sy1.y();
        }
        WebView webView = this.N;
        if (webView != null) {
            webView.post(new g(toolbar, str));
        }
    }

    private final void p1() {
        String str;
        List<String> O0 = O0();
        if (O0 != null) {
            if (n32.t(O0)) {
                str = "Notice: sources such as " + n32.G(O0, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null) + " may not work";
            } else {
                str = "Notice: some sources may not work on this site";
            }
            mw1.c(this, str, "Important!").D();
        }
    }

    private final void q1(String str) {
        Snackbar snackbar;
        if (this.b0 != this.S) {
            Snackbar snackbar2 = this.M;
            if (!(snackbar2 == null || !snackbar2.H() || (snackbar = this.M) == null)) {
                snackbar.t();
            }
            String str2 = l0() ? "Cast" : n0() ? "Download" : "Watch";
            pw1 pw1 = pw1.a;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) v0(C0275R$id.myCoordinatorLayout);
            v62.d(coordinatorLayout, "myCoordinatorLayout");
            Snackbar c2 = pw1.c(pw1, coordinatorLayout, str2 + " EP" + this.S + '?', (qw1) null, 4, (Object) null);
            c2.d0("Yes", new h(this, str));
            c2.e0(androidx.core.content.a.d(T(), 2131100145));
            this.M = c2;
            v62.c(c2);
            c2.R();
            this.b0 = this.S;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.zunjae.downloader.i$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.zunjae.downloader.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.zunjae.downloader.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.zunjae.downloader.i$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.zunjae.downloader.i$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.zunjae.downloader.i$d} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r1(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = r11.X
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r11.t1()
            boolean r0 = r11.n0()
            if (r0 == 0) goto L_0x002b
            xr1 r0 = defpackage.xr1.a
            boolean r0 = r0.m(r12)
            if (r0 != 0) goto L_0x002b
            com.zunjae.anyme.abstracts.AbstractActivity r0 = r11.Q()
            r1 = 2131821621(0x7f110435, float:1.927599E38)
            java.lang.String r1 = r11.getString(r1)
            java.lang.String r2 = "getString(R.string.useProperVideoSource)"
            defpackage.v62.d(r1, r2)
            java.lang.String r2 = "Sorry!"
            defpackage.mw1.q(r0, r1, r2)
        L_0x002b:
            boolean r0 = r11.n0()
            r1 = 0
            java.lang.String r2 = "anime"
            if (r0 == 0) goto L_0x005a
            com.zunjae.downloader.i$d r0 = new com.zunjae.downloader.i$d
            sy1 r3 = r11.O
            if (r3 == 0) goto L_0x0056
            int r4 = r3.i()
            sy1 r3 = r11.O
            if (r3 == 0) goto L_0x0052
            java.lang.String r5 = r3.y()
            int r6 = r11.S
            r8 = 0
            r9 = 16
            r10 = 0
            r3 = r0
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x006b
        L_0x0052:
            defpackage.v62.p(r2)
            throw r1
        L_0x0056:
            defpackage.v62.p(r2)
            throw r1
        L_0x005a:
            boolean r0 = r11.l0()
            if (r0 == 0) goto L_0x006f
            com.zunjae.downloader.i$b r0 = new com.zunjae.downloader.i$b
            java.lang.String r1 = r11.V0()
            int r2 = r11.S
            r0.<init>(r12, r1, r2)
        L_0x006b:
            r11.q0(r0)
            goto L_0x0087
        L_0x006f:
            com.zunjae.downloader.i$a r0 = new com.zunjae.downloader.i$a
            sy1 r3 = r11.O
            if (r3 == 0) goto L_0x008c
            int r3 = r3.i()
            sy1 r4 = r11.O
            if (r4 == 0) goto L_0x0088
            java.lang.String r1 = r4.y()
            int r2 = r11.S
            r0.<init>(r3, r1, r12, r2)
            goto L_0x006b
        L_0x0087:
            return
        L_0x0088:
            defpackage.v62.p(r2)
            throw r1
        L_0x008c:
            defpackage.v62.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser.r1(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void s1(String str) {
        if (!xu1.i.q() && !Z0()) {
            r1(str);
        } else {
            q1(str);
        }
    }

    private final void t1() {
        runOnUiThread(new i(this));
    }

    private final void u1(int i2) {
        Intent intent = new Intent();
        intent.putExtra("newEpisodeNumber", i2);
        setResult(lv1.f.c(), intent);
    }

    /* access modifiers changed from: protected */
    public Map<String, String> G0() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void H0(WebView webView) {
        v62.e(webView, "webView");
    }

    /* access modifiers changed from: protected */
    public void I0(WebView webView) {
        v62.e(webView, "webView");
    }

    /* access modifiers changed from: protected */
    public void J0(String str, WebView webView) {
        v62.e(str, "url");
    }

    /* access modifiers changed from: protected */
    public void K0(WebView webView) {
        v62.e(webView, "webView");
    }

    /* access modifiers changed from: protected */
    public final sy1 M0() {
        sy1 sy1 = this.O;
        if (sy1 != null) {
            return sy1;
        }
        v62.p("anime");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean N0() {
        return this.V;
    }

    public List<String> O0() {
        return this.Z;
    }

    /* access modifiers changed from: protected */
    public final ProgressBar Q0() {
        return this.Q;
    }

    /* access modifiers changed from: protected */
    public final Toolbar R0() {
        return this.P;
    }

    /* access modifiers changed from: protected */
    public String T0() {
        return this.W;
    }

    /* access modifiers changed from: protected */
    public final WebView W0() {
        return this.N;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> X0() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void Y0(WebView webView) {
    }

    public boolean Z0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public HashMap<String, String> a1() {
        return new HashMap<>();
    }

    public abstract void b1(WebView webView);

    /* access modifiers changed from: protected */
    public final void c1() {
        WebView webView = this.N;
        if (webView != null) {
            webView.setWebChromeClient(new b());
        }
        WebView webView2 = this.N;
        if (webView2 != null) {
            webView2.setWebViewClient(new c());
        }
    }

    /* access modifiers changed from: protected */
    public List<ax1> d1() {
        return f32.f();
    }

    public abstract String e1();

    public abstract void f1(String str, WebView webView);

    public abstract void g1(String str, WebView webView);

    public final void h1(String str, int i2) {
        v62.e(str, "url");
        l02.v(P0(i2), str);
    }

    public abstract String i1(String str);

    /* access modifiers changed from: protected */
    public final void j1(boolean z) {
        this.V = z;
    }

    public void k1(List<String> list) {
        this.Z = list;
    }

    /* access modifiers changed from: protected */
    public final void l1(int i2) {
        if (i2 > 0 && i2 != this.S) {
            this.S = i2;
            Toolbar toolbar = this.P;
            if (toolbar != null) {
                sy1 sy1 = this.O;
                if (sy1 != null) {
                    n1(sy1, toolbar);
                } else {
                    v62.p("anime");
                    throw null;
                }
            }
            Snackbar snackbar = this.M;
            if (snackbar != null) {
                snackbar.t();
            }
            if (!n0() || fu1.n0.a(this)) {
                u1(i2 - this.R);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void m1(String str) {
        v62.e(str, "<set-?>");
        this.W = str;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void o1() {
        Map<String, String> G0 = G0();
        if (G0 != null) {
            for (Map.Entry next : G0.entrySet()) {
                CookieManager.getInstance().setCookie((String) next.getKey(), (String) next.getValue());
            }
        }
        WebView webView = this.N;
        v62.c(webView);
        WebSettings settings = webView.getSettings();
        v62.d(settings, "webView!!.settings");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUserAgentString(T0());
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        WebView webView2 = this.N;
        v62.c(webView2);
        b1(webView2);
        if (v62.a(this.T, "")) {
            sy1 sy1 = this.O;
            if (sy1 != null) {
                int i2 = sy1.i();
                sy1 sy12 = this.O;
                if (sy12 != null) {
                    String S0 = S0(i2, sy12.y());
                    WebView webView3 = this.N;
                    if (webView3 != null) {
                        webView3.loadUrl(S0, yr1.a.a());
                        return;
                    }
                    return;
                }
                v62.p("anime");
                throw null;
            }
            v62.p("anime");
            throw null;
        }
        WebView webView4 = this.N;
        if (webView4 != null) {
            webView4.loadUrl(this.T);
        }
    }

    public void onBackPressed() {
        WebView webView = this.N;
        if (webView == null || webView == null || !webView.canGoBack()) {
            super.onBackPressed();
            return;
        }
        WebView webView2 = this.N;
        if (webView2 != null) {
            webView2.goBack();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_abstract_browser);
        Y(this);
        if (bundle != null) {
            this.S = bundle.getInt("lastEpisodeClickedNumber", 0);
            Parcelable parcelable = bundle.getParcelable("anime");
            v62.c(parcelable);
            this.O = (sy1) parcelable;
            String string = bundle.getString("lastLoadedURL", "");
            v62.d(string, "savedInstanceState.getString(\"lastLoadedURL\", \"\")");
            this.T = string;
            this.U = bundle.getBoolean("hasClickedInitialEpisode", false);
            l1(this.S);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("anime");
            v62.c(parcelableExtra);
            this.O = (sy1) parcelableExtra;
            boolean booleanExtra = getIntent().getBooleanExtra("castOnStartup", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("downloadOnStartup", false);
            if (booleanExtra && booleanExtra2) {
                throw new k22("An operation is not implemented: " + "What now?");
            } else if (booleanExtra) {
                t0();
            } else if (booleanExtra2) {
                u0();
            }
        }
        this.P = (Toolbar) findViewById(2131297210);
        this.Q = (ProgressBar) findViewById(C0275R$id.browserProgressBar);
        this.N = (WebView) findViewById(C0275R$id.webView);
        xu1 xu1 = xu1.i;
        sy1 sy1 = this.O;
        if (sy1 != null) {
            this.R = xu1.f(sy1.i());
            this.Y = xu1.i.h();
            List<ax1> d1 = d1();
            if (d1 == null) {
                d1 = f32.f();
            }
            this.K = d1;
            this.a0 = zw1.c.e();
            o1();
            Toolbar toolbar = this.P;
            v62.c(toolbar);
            sy1 sy12 = this.O;
            if (sy12 != null) {
                j0(toolbar, sy12.y(), (String) null, true);
                sy1 sy13 = this.O;
                if (sy13 != null) {
                    Toolbar toolbar2 = this.P;
                    v62.c(toolbar2);
                    n1(sy13, toolbar2);
                    sy1 sy14 = this.O;
                    if (sy14 != null) {
                        l1(sy14.p());
                        L0();
                        AbstractActivity.f0(this, 0, 1, (Object) null);
                        p1();
                        return;
                    }
                    v62.p("anime");
                    throw null;
                }
                v62.p("anime");
                throw null;
            }
            v62.p("anime");
            throw null;
        }
        v62.p("anime");
        throw null;
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
        WebView webView = this.N;
        if (webView != null) {
            webView.stopLoading();
        }
        WebView webView2 = this.N;
        if (webView2 != null) {
            webView2.loadUrl("about:blank");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        WebView webView;
        v62.e(menuItem, "item");
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
                    jw1 jw1 = this.L;
                    if (jw1 != null) {
                        jw1.c();
                        break;
                    }
                    break;
            }
        } else if (this.Y && (webView = this.N) != null && webView.canGoBack()) {
            WebView webView2 = this.N;
            v62.c(webView2);
            webView2.goBack();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.X = false;
        this.V = false;
        try {
            org.aviran.cookiebar2.a.e(this);
        } catch (Exception e2) {
            uj2.d(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.X = true;
        new Handler().postDelayed(new f(this), 2000);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        v62.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("lastEpisodeClickedNumber", this.S);
        sy1 sy1 = this.O;
        if (sy1 != null) {
            bundle.putParcelable("anime", sy1);
            bundle.putBoolean("hasClickedInitialEpisode", this.U);
            bundle.putString("lastLoadedURL", this.T);
            return;
        }
        v62.p("anime");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.L == null) {
            WebView webView = this.N;
            v62.c(webView);
            this.L = new jw1(webView, this);
        }
    }

    public View v0(int i2) {
        if (this.c0 == null) {
            this.c0 = new HashMap();
        }
        View view = (View) this.c0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.c0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public abstract boolean v1(String str);

    public abstract boolean w1(String str);
}
