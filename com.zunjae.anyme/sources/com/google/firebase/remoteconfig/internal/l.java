package com.google.firebase.remoteconfig.internal;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import org.json.JSONException;

public class l {
    static final Pattern c = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern d = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final e a;
    private final e b;

    static {
        Charset.forName("UTF-8");
    }

    public l(e eVar, e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    private static f b(e eVar) {
        return eVar.d();
    }

    private static Long d(e eVar, String str) {
        f b2 = b(eVar);
        if (b2 == null) {
            return null;
        }
        try {
            return Long.valueOf(b2.d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String f(e eVar, String str) {
        f b2 = b(eVar);
        if (b2 == null) {
            return null;
        }
        try {
            return b2.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void g(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str});
    }

    public boolean a(String str) {
        String f = f(this.a, str);
        if (f != null) {
            if (c.matcher(f).matches()) {
                return true;
            }
            if (d.matcher(f).matches()) {
                return false;
            }
        }
        String f2 = f(this.b, str);
        if (f2 != null) {
            if (c.matcher(f2).matches()) {
                return true;
            }
            if (d.matcher(f2).matches()) {
                return false;
            }
        }
        g(str, "Boolean");
        return false;
    }

    public long c(String str) {
        Long d2 = d(this.a, str);
        if (d2 != null) {
            return d2.longValue();
        }
        Long d3 = d(this.b, str);
        if (d3 != null) {
            return d3.longValue();
        }
        g(str, "Long");
        return 0;
    }

    public String e(String str) {
        String f = f(this.a, str);
        if (f != null) {
            return f;
        }
        String f2 = f(this.b, str);
        if (f2 != null) {
            return f2;
        }
        g(str, "String");
        return "";
    }
}
