package defpackage;

import android.webkit.WebView;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.c;
import com.mikepenz.materialdrawer.d;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.abstracts.AbstractActivity;

/* renamed from: jw1  reason: default package */
public final class jw1 {
    private com.mikepenz.materialdrawer.a a;
    private c b;
    /* access modifiers changed from: private */
    public final WebView c;
    /* access modifiers changed from: private */
    public final AbstractActivity d;

    /* renamed from: jw1$a */
    static final class a implements c.a {
        final /* synthetic */ jw1 a;

        a(jw1 jw1) {
            this.a = jw1;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.View r3, int r4, defpackage.go1<java.lang.Object, androidx.recyclerview.widget.RecyclerView.c0> r5) {
            /*
                r2 = this;
                java.lang.String r3 = "drawerItem"
                defpackage.v62.d(r5, r3)
                long r3 = r5.c()
                int r4 = (int) r3
                java.lang.String r3 = "url"
                r5 = 0
                switch(r4) {
                    case 1: goto L_0x00dc;
                    case 2: goto L_0x00d2;
                    case 3: goto L_0x00bc;
                    case 4: goto L_0x00a6;
                    case 5: goto L_0x0070;
                    case 6: goto L_0x0065;
                    case 7: goto L_0x004b;
                    case 8: goto L_0x0028;
                    case 9: goto L_0x0012;
                    default: goto L_0x0010;
                }
            L_0x0010:
                goto L_0x00ee
            L_0x0012:
                xu1 r3 = defpackage.xu1.i
                r3.i()
                jw1 r3 = r2.a
                com.zunjae.anyme.abstracts.AbstractActivity r3 = r3.d
                java.lang.String r4 = "Cleared default video quality"
            L_0x001f:
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r5)
                r3.show()
                goto L_0x00ee
            L_0x0028:
                jw1 r4 = r2.a
                android.webkit.WebView r4 = r4.c
                java.lang.String r4 = r4.getUrl()
                if (r4 == 0) goto L_0x00ee
                yv1 r0 = defpackage.yv1.a
                jw1 r1 = r2.a
                com.zunjae.anyme.abstracts.AbstractActivity r1 = r1.d
                defpackage.v62.d(r4, r3)
                r0.b(r1, r4)
                jw1 r3 = r2.a
                com.zunjae.anyme.abstracts.AbstractActivity r3 = r3.d
                java.lang.String r4 = "Copied link to your clipboard"
                goto L_0x001f
            L_0x004b:
                jw1 r4 = r2.a
                android.webkit.WebView r4 = r4.c
                java.lang.String r4 = r4.getUrl()
                if (r4 == 0) goto L_0x00ee
                jw1 r0 = r2.a
                com.zunjae.anyme.abstracts.AbstractActivity r0 = r0.d
                defpackage.v62.d(r4, r3)
                r0.g0(r4)
                goto L_0x00ee
            L_0x0065:
                jw1 r3 = r2.a
                com.zunjae.anyme.abstracts.AbstractActivity r3 = r3.d
                r3.finish()
                goto L_0x00ee
            L_0x0070:
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                java.lang.String r3 = r3.getUrl()
                if (r3 == 0) goto L_0x00ee
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.SEND"
                r4.<init>(r0)
                java.lang.String r0 = "text/plain"
                r4.setType(r0)
                java.lang.String r0 = "android.intent.extra.TEXT"
                r4.putExtra(r0, r3)
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                java.lang.String r3 = r3.getTitle()
                java.lang.String r0 = "android.intent.extra.SUBJECT"
                r4.putExtra(r0, r3)
                jw1 r3 = r2.a
                com.zunjae.anyme.abstracts.AbstractActivity r3 = r3.d
                r3.startActivity(r4)
                goto L_0x00ee
            L_0x00a6:
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                boolean r3 = r3.canGoForward()
                if (r3 == 0) goto L_0x00ee
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                r3.goForward()
                goto L_0x00ee
            L_0x00bc:
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                boolean r3 = r3.canGoBack()
                if (r3 == 0) goto L_0x00ee
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                r3.goBack()
                goto L_0x00ee
            L_0x00d2:
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                r3.scrollTo(r5, r5)
                goto L_0x00ee
            L_0x00dc:
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                r3.stopLoading()
                jw1 r3 = r2.a
                android.webkit.WebView r3 = r3.c
                r3.reload()
            L_0x00ee:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jw1.a.a(android.view.View, int, go1):boolean");
        }
    }

    /* renamed from: jw1$b */
    static final class b implements on1 {
        public static final b a = new b();

        b() {
        }

        public final void a(go1<Object, RecyclerView.c0> go1, CompoundButton compoundButton, boolean z) {
            xu1.i.p(z);
        }
    }

    public jw1(WebView webView, AbstractActivity abstractActivity) {
        v62.e(webView, "webView");
        v62.e(abstractActivity, "activity");
        this.c = webView;
        this.d = abstractActivity;
        ao1 ao1 = new ao1();
        ao1.a0("Refresh");
        ao1 ao12 = ao1;
        ao12.E(false);
        ao1 ao13 = ao12;
        ao13.m(1);
        ao1 ao14 = ao13;
        ao14.X(C0274R$drawable.baseline_refresh_white_48dp);
        ao1 ao15 = ao14;
        ao1 ao16 = new ao1();
        ao16.a0("Scroll To Top");
        ao1 ao17 = ao16;
        ao17.E(false);
        ao1 ao18 = ao17;
        ao18.m(2);
        ao1 ao19 = ao18;
        ao19.X(C0274R$drawable.ic_scroll_up);
        ao1 ao110 = ao19;
        ao1 ao111 = new ao1();
        ao111.a0("Navigate Back");
        ao1 ao112 = ao111;
        ao112.E(false);
        ao1 ao113 = ao112;
        ao113.m(3);
        ao1 ao114 = ao113;
        ao114.X(C0274R$drawable.ic_back);
        ao1 ao115 = ao114;
        ao1 ao116 = new ao1();
        ao116.a0("Navigate Forward");
        ao1 ao117 = ao116;
        ao117.E(false);
        ao1 ao118 = ao117;
        ao118.m(4);
        ao1 ao119 = ao118;
        ao119.X(C0274R$drawable.ic_arrow_forward);
        ao1 ao120 = ao119;
        ao1 ao121 = new ao1();
        ao121.a0("Share Url");
        ao1 ao122 = ao121;
        ao122.E(false);
        ao1 ao123 = ao122;
        ao123.m(5);
        ao1 ao124 = ao123;
        ao124.X(C0274R$drawable.ic_share);
        ao1 ao125 = ao124;
        ao1 ao126 = new ao1();
        ao126.a0("Close Browser");
        ao1 ao127 = ao126;
        ao127.E(false);
        ao1 ao128 = ao127;
        ao128.m(6);
        ao1 ao129 = ao128;
        ao129.X(C0274R$drawable.ic_exit);
        ao1 ao130 = ao129;
        ao1 ao131 = new ao1();
        ao131.a0("Open in Browser");
        ao1 ao132 = ao131;
        ao132.E(false);
        ao1 ao133 = ao132;
        ao133.m(7);
        ao1 ao134 = ao133;
        ao134.X(C0274R$drawable.ic_browser);
        ao1 ao135 = ao134;
        ao1 ao136 = new ao1();
        ao136.a0("Copy to Clipboard");
        ao1 ao137 = ao136;
        ao137.E(false);
        ao1 ao138 = ao137;
        ao138.m(8);
        ao1 ao139 = ao138;
        ao139.X(C0274R$drawable.ic_exit);
        ao1 ao140 = ao139;
        ao1 ao141 = new ao1();
        ao141.a0("Clear Default Video Quality");
        ao1 ao142 = ao141;
        ao142.E(false);
        ao1 ao143 = ao142;
        ao143.m(9);
        ao1 ao144 = ao143;
        ao144.X(C0274R$drawable.ic_erase);
        ao1 ao145 = ao144;
        String g = xu1.i.g();
        if (g != null) {
            ao145.g0("Current: " + g);
        }
        eo1 eo1 = new eo1();
        eo1.a0("Ask For Playback");
        eo1 eo12 = eo1;
        eo12.g0("Don't start videos automatically");
        eo1 eo13 = eo12;
        eo13.E(false);
        eo1 eo14 = eo13;
        eo14.o0(xu1.i.q());
        eo1 eo15 = eo14;
        eo15.p0(b.a);
        com.mikepenz.materialdrawer.b bVar = new com.mikepenz.materialdrawer.b();
        bVar.q(this.d);
        bVar.r(true);
        bVar.t(C0274R$drawable.gradient_background);
        bVar.s(true);
        bVar.v(false);
        com.mikepenz.materialdrawer.a d2 = bVar.d();
        v62.d(d2, "AccountHeaderBuilder()\n …e(false)\n        .build()");
        this.a = d2;
        d dVar = new d();
        dVar.r(this.d);
        dVar.p(this.a);
        dVar.a(ao15, ao110, ao115, ao120, ao140, ao125, ao135);
        dVar.b(eo15, ao130);
        dVar.s(8388613);
        dVar.u(new a(this));
        c c2 = dVar.c();
        v62.d(c2, "DrawerBuilder()\n        …       }\n        .build()");
        this.b = c2;
        c2.w(-1);
    }

    public final void c() {
        this.b.o();
    }
}
