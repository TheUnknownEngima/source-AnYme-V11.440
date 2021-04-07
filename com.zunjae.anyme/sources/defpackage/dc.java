package defpackage;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: dc  reason: default package */
public class dc {
    public yb a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "https://api.bugfender.com/";
            }
            return new yb(new URL(str), str2, str3);
        } catch (MalformedURLException unused) {
            throw new IllegalArgumentException("Illegal URL");
        }
    }
}
