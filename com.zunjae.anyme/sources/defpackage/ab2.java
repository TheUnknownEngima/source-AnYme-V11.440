package defpackage;

import defpackage.sa2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: ab2  reason: default package */
public final class ab2 {
    final ta2 a;
    final String b;
    final sa2 c;
    @Nullable
    final bb2 d;
    final Map<Class<?>, Object> e;
    @Nullable
    private volatile da2 f;

    /* renamed from: ab2$a */
    public static class a {
        @Nullable
        ta2 a;
        String b;
        sa2.a c;
        @Nullable
        bb2 d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = "GET";
            this.c = new sa2.a();
        }

        a(ab2 ab2) {
            this.e = Collections.emptyMap();
            this.a = ab2.a;
            this.b = ab2.b;
            this.d = ab2.d;
            this.e = ab2.e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(ab2.e);
            this.c = ab2.c.f();
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public ab2 b() {
            if (this.a != null) {
                return new ab2(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a c(da2 da2) {
            String da22 = da2.toString();
            if (da22.isEmpty()) {
                g("Cache-Control");
                return this;
            }
            d("Cache-Control", da22);
            return this;
        }

        public a d(String str, String str2) {
            this.c.g(str, str2);
            return this;
        }

        public a e(sa2 sa2) {
            this.c = sa2.f();
            return this;
        }

        public a f(String str, @Nullable bb2 bb2) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (bb2 != null && !cc2.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (bb2 != null || !cc2.e(str)) {
                this.b = str;
                this.d = bb2;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a g(String str) {
            this.c.f(str);
            return this;
        }

        public <T> a h(Class<? super T> cls, @Nullable T t) {
            if (cls != null) {
                if (t == null) {
                    this.e.remove(cls);
                } else {
                    if (this.e.isEmpty()) {
                        this.e = new LinkedHashMap();
                    }
                    this.e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public a i(String str) {
            StringBuilder sb;
            int i;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    sb = new StringBuilder();
                    sb.append("http:");
                    i = 3;
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        sb = new StringBuilder();
                        sb.append("https:");
                        i = 4;
                    }
                    j(ta2.l(str));
                    return this;
                }
                sb.append(str.substring(i));
                str = sb.toString();
                j(ta2.l(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a j(ta2 ta2) {
            if (ta2 != null) {
                this.a = ta2;
                return this;
            }
            throw new NullPointerException("url == null");
        }
    }

    ab2(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.d();
        this.d = aVar.d;
        this.e = ib2.v(aVar.e);
    }

    @Nullable
    public bb2 a() {
        return this.d;
    }

    public da2 b() {
        da2 da2 = this.f;
        if (da2 != null) {
            return da2;
        }
        da2 k = da2.k(this.c);
        this.f = k;
        return k;
    }

    @Nullable
    public String c(String str) {
        return this.c.c(str);
    }

    public List<String> d(String str) {
        return this.c.j(str);
    }

    public sa2 e() {
        return this.c;
    }

    public boolean f() {
        return this.a.n();
    }

    public String g() {
        return this.b;
    }

    public a h() {
        return new a(this);
    }

    @Nullable
    public <T> T i(Class<? extends T> cls) {
        return cls.cast(this.e.get(cls));
    }

    public ta2 j() {
        return this.a;
    }

    public String toString() {
        return "Request{method=" + this.b + ", url=" + this.a + ", tags=" + this.e + '}';
    }
}
