package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* renamed from: vr1  reason: default package */
public abstract class vr1 extends WebChromeClient {
    private ProgressBar a;

    public vr1() {
    }

    public vr1(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        yr1.a.c(i, this.a);
    }
}
