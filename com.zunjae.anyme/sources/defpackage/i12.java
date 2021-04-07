package defpackage;

import android.text.Html;
import java.util.Random;

/* renamed from: i12  reason: default package */
public final class i12 {
    public static final i12 a = new i12();

    private i12() {
    }

    public final CharSequence a(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml("<font color='#3D3D3D'>" + str + "</font>");
    }

    public final int b() {
        return new Random().nextInt(2147483547) + 100;
    }
}
