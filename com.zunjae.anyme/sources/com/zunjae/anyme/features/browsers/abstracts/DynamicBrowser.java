package com.zunjae.anyme.features.browsers.abstracts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.zunjae.dynsourcegen.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DynamicBrowser extends AbstractAnimeBrowser {
    public static final a g0 = new a((r62) null);
    private com.zunjae.dynsourcegen.b e0;
    private HashMap f0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Intent a(Context context, com.zunjae.dynsourcegen.b bVar, sy1 sy1, boolean z, boolean z2) {
            v62.e(context, "context");
            v62.e(bVar, "instructions");
            v62.e(sy1, "anime");
            Intent intent = new Intent(context, DynamicBrowser.class);
            new Bundle();
            intent.putExtra("instructions", new Gson().toJson((Object) bVar));
            intent.putExtra("anime", sy1);
            intent.putExtra("castOnStartup", z);
            intent.putExtra("downloadOnStartup", z2);
            return intent;
        }
    }

    static final class b<T> implements ValueCallback<String> {
        final /* synthetic */ DynamicBrowser a;

        b(DynamicBrowser dynamicBrowser, WebView webView) {
            this.a = dynamicBrowser;
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            if (tw1.a.b(str) && (!v62.a(str, "null"))) {
                try {
                    v62.d(str, "value");
                    Integer c = com.zunjae.extensions.c.c(str);
                    this.a.l1(c != null ? c.intValue() : 0);
                } catch (Exception e) {
                    uj2.d(e);
                }
            }
        }
    }

    static final class c<T> implements ValueCallback<String> {
        final /* synthetic */ DynamicBrowser a;

        c(DynamicBrowser dynamicBrowser, WebView webView) {
            this.a = dynamicBrowser;
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            if (tw1.a.b(str) && (!v62.a(str, "null"))) {
                try {
                    v62.d(str, "value");
                    Integer c = com.zunjae.extensions.c.c(str);
                    this.a.l1(c != null ? c.intValue() : 0);
                } catch (Exception e) {
                    uj2.d(e);
                }
            }
        }
    }

    private final void x1(String str, String str2) {
        String value;
        try {
            s82 b2 = u82.b(new u82(str2), str, 0, 2, (Object) null);
            if (b2 != null && (value = b2.getValue()) != null) {
                l1(Integer.parseInt(new u82("[^0-9]").d(value, "")));
            }
        } catch (Exception e) {
            uj2.d(e);
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> G0() {
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            return bVar.a();
        }
        v62.p("instructions");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void J0(String str, WebView webView) {
        v62.e(str, "url");
        super.J0(str, webView);
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            String f = bVar.f();
            if (f != null && webView != null) {
                webView.evaluateJavascript(f, new b(this, webView));
                return;
            }
            return;
        }
        v62.p("instructions");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void K0(WebView webView) {
        v62.e(webView, "webView");
        super.K0(webView);
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            String e = bVar.e();
            if (e != null) {
                webView.evaluateJavascript(e, new c(this, webView));
                return;
            }
            return;
        }
        v62.p("instructions");
        throw null;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> X0() {
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            return bVar.j();
        }
        v62.p("instructions");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void Y0(WebView webView) {
        super.Y0(webView);
        int p = M0().p() + 1;
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            String k = bVar.k();
            if (k != null) {
                String q = f92.q(k, "%EP%", String.valueOf(p), false, 4, (Object) null);
                yr1 yr1 = yr1.a;
                v62.c(webView);
                yr1.b(webView, ax1.c.a(q));
                return;
            }
            return;
        }
        v62.p("instructions");
        throw null;
    }

    public boolean Z0() {
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            return bVar.l();
        }
        v62.p("instructions");
        throw null;
    }

    public void b1(WebView webView) {
        v62.e(webView, "webView");
        c1();
    }

    /* access modifiers changed from: protected */
    public List<ax1> d1() {
        dx1 dx1 = dx1.a;
        com.zunjae.dynsourcegen.b bVar = this.e0;
        ArrayList arrayList = null;
        if (bVar != null) {
            List<String> b2 = dx1.b(bVar.i());
            if (b2 != null) {
                arrayList = new ArrayList(g32.l(b2, 10));
                for (String ax1 : b2) {
                    arrayList.add(new ax1(ax1));
                }
            }
            return arrayList;
        }
        v62.p("instructions");
        throw null;
    }

    public String e1() {
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            return bVar.q();
        }
        v62.p("instructions");
        throw null;
    }

    public void f1(String str, WebView webView) {
        v62.e(str, "url");
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            String b2 = bVar.b();
            if (b2 != null) {
                x1(str, b2);
                return;
            }
            return;
        }
        v62.p("instructions");
        throw null;
    }

    public void g1(String str, WebView webView) {
        Integer a2;
        v62.e(str, "url");
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            String c2 = bVar.c();
            if (c2 != null) {
                x1(str, c2);
            }
            com.zunjae.dynsourcegen.b bVar2 = this.e0;
            if (bVar2 != null) {
                d d = bVar2.d();
                if (d != null && (a2 = cx1.a.a(d, str)) != null) {
                    l1(a2.intValue());
                    return;
                }
                return;
            }
            v62.p("instructions");
            throw null;
        }
        v62.p("instructions");
        throw null;
    }

    public String i1(String str) {
        v62.e(str, "query");
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            return f92.q(bVar.m(), "%query%", str, false, 4, (Object) null);
        }
        v62.p("instructions");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Object fromJson = new Gson().fromJson(getIntent().getStringExtra("instructions"), com.zunjae.dynsourcegen.b.class);
        v62.d(fromJson, "Gson().fromJson(intent.g…cCloudSource::class.java)");
        com.zunjae.dynsourcegen.b bVar = (com.zunjae.dynsourcegen.b) fromJson;
        this.e0 = bVar;
        if (bVar != null) {
            m1(bVar.n());
            com.zunjae.dynsourcegen.b bVar2 = this.e0;
            if (bVar2 != null) {
                k1(bVar2.g());
                super.onCreate(bundle);
                return;
            }
            v62.p("instructions");
            throw null;
        }
        v62.p("instructions");
        throw null;
    }

    public View v0(int i) {
        if (this.f0 == null) {
            this.f0 = new HashMap();
        }
        View view = (View) this.f0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean v1(String str) {
        v62.e(str, "url");
        cx1 cx1 = cx1.a;
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            return cx1.b(bVar.o(), str);
        }
        v62.p("instructions");
        throw null;
    }

    public boolean w1(String str) {
        v62.e(str, "url");
        cx1 cx1 = cx1.a;
        com.zunjae.dynsourcegen.b bVar = this.e0;
        if (bVar != null) {
            return cx1.b(bVar.p(), str);
        }
        v62.p("instructions");
        throw null;
    }
}
