package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.HashMap;

/* renamed from: yr1  reason: default package */
public final class yr1 {
    public static final yr1 a = new yr1();

    /* renamed from: yr1$a */
    static final class a<T> implements ValueCallback<String> {
        public static final a a = new a();

        a() {
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            uj2.f("Result of Eval = " + str, new Object[0]);
        }
    }

    private yr1() {
    }

    public final HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("X-Requested-With", "");
        return hashMap;
    }

    public final void b(WebView webView, String str) {
        v62.e(webView, "webView");
        v62.e(str, "command");
        uj2.f("[evalJavascript] evaluating: " + str, new Object[0]);
        webView.evaluateJavascript(str, a.a);
    }

    public final void c(int i, ProgressBar progressBar) {
        if (progressBar != null) {
            if (progressBar.getProgress() < 100 && progressBar.getVisibility() == 8) {
                progressBar.setVisibility(0);
            }
            progressBar.setProgress(i);
            if (i == 100) {
                progressBar.setVisibility(8);
            }
        }
    }
}
