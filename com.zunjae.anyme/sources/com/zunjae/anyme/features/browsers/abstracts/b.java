package com.zunjae.anyme.features.browsers.abstracts;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import defpackage.og2;
import java.util.HashMap;

public final class b extends com.zunjae.anyme.abstracts.b implements og2 {
    public static final C0172b r0 = new C0172b((r62) null);
    private final d22 p0 = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private HashMap q0;

    public static final class a extends w62 implements o52<zw1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [zw1, java.lang.Object] */
        public final zw1 invoke() {
            return this.f.e(f72.b(zw1.class), this.g, this.h);
        }
    }

    /* renamed from: com.zunjae.anyme.features.browsers.abstracts.b$b  reason: collision with other inner class name */
    public static final class C0172b {
        private C0172b() {
        }

        public /* synthetic */ C0172b(r62 r62) {
            this();
        }

        public final b a(a aVar) {
            v62.e(aVar, "bus");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("baseURL", aVar.b());
            bundle.putInt("episodeNumber", aVar.a());
            bundle.putString("videoTitle", aVar.c());
            u22 u22 = u22.a;
            bVar.u1(bundle);
            return bVar;
        }
    }

    public static final class c extends wr1 {
        final /* synthetic */ b h;

        static final class a implements Runnable {
            final /* synthetic */ c e;
            final /* synthetic */ String f;

            a(c cVar, String str) {
                this.e = cVar;
                this.f = str;
            }

            public final void run() {
                this.e.h.d2(this.f);
            }
        }

        c(b bVar) {
            this.h = bVar;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.h.c2().h0(str)) {
                b bVar = this.h;
                if (str == null) {
                    str = "";
                }
                bVar.d2(str);
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            v62.e(webView, "view");
            v62.e(webResourceRequest, "request");
            String uri = webResourceRequest.getUrl().toString();
            v62.d(uri, "request.url.toString()");
            if (this.h.c2().h0(uri)) {
                webView.post(new a(this, uri));
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* access modifiers changed from: private */
    public final zw1 c2() {
        return (zw1) this.p0.getValue();
    }

    /* access modifiers changed from: private */
    public final void d2(String str) {
        cw1 a2 = cw1.k.a();
        int i = n1().getInt("episodeNumber");
        String string = n1().getString("videoTitle");
        v62.c(string);
        v62.d(string, "requireArguments().getString(\"videoTitle\")!!");
        a2.p(new a(str, i, string));
        ((WebView) Z1(C0275R$id.webView)).stopLoading();
        ((WebView) Z1(C0275R$id.webView)).loadUrl("");
        L1();
    }

    public void K0() {
        super.K0();
        Y1();
    }

    public void X1() {
        HashMap hashMap = this.q0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View Z1(int i) {
        if (this.q0 == null) {
            this.q0 = new HashMap();
        }
        View view = (View) this.q0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.q0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        WebView webView;
        WebSettings settings;
        WebSettings settings2;
        super.h0(bundle);
        String string = n1().getString("baseURL");
        v62.c(string);
        v62.d(string, "requireArguments().getString(\"baseURL\")!!");
        WebView webView2 = (WebView) Z1(C0275R$id.webView);
        if (!(webView2 == null || (settings2 = webView2.getSettings()) == null)) {
            settings2.setJavaScriptEnabled(true);
            settings2.setDomStorageEnabled(true);
            settings2.setUserAgentString(com.zunjae.constants.b.d.a());
        }
        if (!(Build.VERSION.SDK_INT < 21 || (webView = (WebView) Z1(C0275R$id.webView)) == null || (settings = webView.getSettings()) == null)) {
            settings.setMixedContentMode(2);
        }
        WebView webView3 = (WebView) Z1(C0275R$id.webView);
        v62.d(webView3, "webView");
        webView3.setWebViewClient(new c(this));
        ((WebView) Z1(C0275R$id.webView)).loadUrl(string);
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0278R$layout.dialog_video_resolver, viewGroup, false);
    }

    public /* synthetic */ void u0() {
        super.u0();
        X1();
    }
}
