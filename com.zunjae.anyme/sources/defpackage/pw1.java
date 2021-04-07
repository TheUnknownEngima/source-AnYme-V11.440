package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: pw1  reason: default package */
public final class pw1 {
    public static final pw1 a = new pw1();

    private pw1() {
    }

    private final Snackbar a(ViewGroup viewGroup, String str, int i, qw1 qw1) {
        Snackbar b0 = Snackbar.b0(viewGroup, d(str), i);
        b0.D().setBackgroundResource(qw1.getBackgroundColor());
        b0.e0(qw1.getTextColor());
        b0.g0(qw1.getTextColor());
        v62.d(b0, "Snackbar.make(viewGroup,…or(style.textColor)\n    }");
        View findViewById = b0.D().findViewById(2131297107);
        if (findViewById != null) {
            ((TextView) findViewById).setMaxLines(3);
            return b0;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public static /* synthetic */ Snackbar c(pw1 pw1, ViewGroup viewGroup, String str, qw1 qw1, int i, Object obj) {
        if ((i & 4) != 0) {
            qw1 = qw1.Normal;
        }
        return pw1.b(viewGroup, str, qw1);
    }

    private final Spanned d(String str) {
        Spanned fromHtml = Html.fromHtml(str);
        v62.d(fromHtml, "Html.fromHtml(this)");
        return fromHtml;
    }

    public final Snackbar b(ViewGroup viewGroup, String str, qw1 qw1) {
        v62.e(viewGroup, "viewGroup");
        v62.e(str, "message");
        v62.e(qw1, "style");
        return a(viewGroup, str, -2, qw1);
    }
}
