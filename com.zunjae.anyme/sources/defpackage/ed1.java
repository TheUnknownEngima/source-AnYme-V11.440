package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ed1  reason: default package */
public class ed1 {
    private String a = null;
    private final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    private static String c(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.b);
    }

    public String b() {
        return this.a;
    }

    public void d(String str, String str2) {
        if (str != null) {
            String c = c(str);
            if (this.b.size() < 64 || this.b.containsKey(c)) {
                this.b.put(c, str2 == null ? "" : c(str2));
            } else {
                jb1.f().b("Exceeded maximum number of custom attributes (64)");
            }
        } else {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
    }

    public void e(String str) {
        this.a = c(str);
    }
}
