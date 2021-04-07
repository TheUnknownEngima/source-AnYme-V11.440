package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: wb1  reason: default package */
public abstract class wb1 {
    private static final Pattern e = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final String a;
    private final xe1 b;
    private final ve1 c;
    private final String d;

    public wb1(String str, String str2, xe1 xe1, ve1 ve1) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (xe1 != null) {
            this.d = str;
            this.a = f(str2);
            this.b = xe1;
            this.c = ve1;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    private String f(String str) {
        return !dc1.D(this.d) ? e.matcher(str).replaceFirst(this.d) : str;
    }

    /* access modifiers changed from: protected */
    public we1 c() {
        return d(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public we1 d(Map<String, String> map) {
        we1 a2 = this.b.a(this.c, e(), map);
        a2.d("User-Agent", "Crashlytics Android SDK/" + ic1.i());
        a2.d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a2;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return this.a;
    }
}
