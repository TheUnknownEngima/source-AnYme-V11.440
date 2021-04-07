package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: wg  reason: default package */
public final class wg implements ug {
    private final Map<String, List<vg>> b;
    private volatile Map<String, String> c;

    /* renamed from: wg$a */
    public static final class a {
        private static final String b = b();
        private static final Map<String, List<vg>> c;
        private Map<String, List<vg>> a = c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b)));
            }
            c = Collections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        public wg a() {
            return new wg(this.a);
        }
    }

    /* renamed from: wg$b */
    static final class b implements vg {
        private final String a;

        b(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + '\'' + '}';
        }
    }

    wg(Map<String, List<vg>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    private String a(List<vg> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = list.get(i).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.b.entrySet()) {
            String a2 = a((List) next.getValue());
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put(next.getKey(), a2);
            }
        }
        return hashMap;
    }

    public Map<String, String> b() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wg) {
            return this.b.equals(((wg) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.b + '}';
    }
}
