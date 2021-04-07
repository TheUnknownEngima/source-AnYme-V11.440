package com.zunjae.anyme.features.browsers.abstracts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.constants.b;

public abstract class AbstractLightBrowser extends AbstractBrowser {
    protected Toolbar Q;
    protected ProgressBar R;

    /* access modifiers changed from: protected */
    public String D0() {
        return b.d.a();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void E0() {
        WebView webView = (WebView) findViewById(C0275R$id.webView);
        this.J = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(D0());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_kissbrowser);
        this.Q = (Toolbar) findViewById(2131297210);
        this.R = (ProgressBar) findViewById(C0275R$id.browserProgressBar);
        j0(this.Q, "Loading...", "Please wait...", true);
        E0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0279R$menu.menu_activity_videobrowser, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onStart() {
        super.onStart();
        cw1.k.a().j(this);
    }

    public void onStop() {
        super.onStop();
        cw1.k.a().l(this);
    }
}
