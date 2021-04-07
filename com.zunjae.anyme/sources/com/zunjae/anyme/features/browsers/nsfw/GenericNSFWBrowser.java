package com.zunjae.anyme.features.browsers.nsfw;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.features.browsers.abstracts.GenericBrowser;
import com.zunjae.constants.b;
import com.zunjae.dynsourcegen.c;

public final class GenericNSFWBrowser extends GenericBrowser {
    public static final a V = new a((r62) null);
    private final String U = b.d.c();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Intent a(Context context, c cVar) {
            v62.e(context, "context");
            v62.e(cVar, "site");
            Intent intent = new Intent(context, GenericNSFWBrowser.class);
            intent.putExtra("homepage", cVar.c());
            intent.putExtra("searchQuery", cVar.f());
            intent.putExtra("title", cVar.e());
            intent.putExtra("allowZoom", cVar.b());
            intent.putExtra("userAgent", cVar.g());
            return intent;
        }
    }

    /* access modifiers changed from: protected */
    public boolean F0() {
        return getIntent().getBooleanExtra("allowZoom", true);
    }

    /* access modifiers changed from: protected */
    public String H0() {
        return this.U;
    }

    /* access modifiers changed from: protected */
    public String K0() {
        String stringExtra = getIntent().getStringExtra("homepage");
        return stringExtra != null ? stringExtra : "";
    }

    /* access modifiers changed from: protected */
    public String L0(WebView webView) {
        if (webView != null) {
            return webView.getTitle();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String N0(WebView webView) {
        if (webView != null) {
            return webView.getTitle();
        }
        return null;
    }

    public void O0() {
        super.O0();
        y0().setWebViewClient(new GenericBrowser.b());
    }

    /* access modifiers changed from: protected */
    public String P0() {
        String stringExtra = getIntent().getStringExtra("title");
        return stringExtra != null ? stringExtra : "AnYme";
    }

    /* access modifiers changed from: protected */
    public void Q0(String str) {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        MenuItem findItem = menu.findItem(C0275R$id.item_go_homepage);
        v62.d(findItem, "menu.findItem(R.id.item_go_homepage)");
        findItem.setVisible(true);
        return true;
    }
}
