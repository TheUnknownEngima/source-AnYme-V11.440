package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: s12  reason: default package */
public final class s12 {
    public static final a d = new a((r62) null);
    private final String a;
    private final Object b;
    private final Map<String, Object> c;

    /* renamed from: s12$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        /* access modifiers changed from: private */
        public final s12 b(String str) {
            Map map;
            String str2;
            List U = g92.U(str, new String[]{"="}, false, 2, 2, (Object) null);
            if (U.size() == 2) {
                String str3 = (String) U.get(0);
                if (str3 != null) {
                    String obj = g92.i0(str3).toString();
                    List U2 = g92.U((CharSequence) U.get(1), new String[]{";"}, false, 0, 6, (Object) null);
                    String str4 = (String) U2.get(0);
                    if (str4 != null) {
                        String obj2 = g92.i0(str4).toString();
                        if (U2.size() < 2) {
                            map = w32.e();
                        } else {
                            List<String> subList = U2.subList(1, U2.size());
                            LinkedHashMap linkedHashMap = new LinkedHashMap(w72.b(v32.a(g32.l(subList, 10)), 16));
                            for (String str5 : subList) {
                                String str6 = (String) g92.U(str5, new String[]{"="}, false, 0, 6, (Object) null).get(0);
                                if (str6 != null) {
                                    String obj3 = g92.i0(str6).toString();
                                    String str7 = (String) n32.C(g92.U(str5, new String[]{"="}, false, 0, 6, (Object) null), 1);
                                    if (str7 == null) {
                                        str2 = null;
                                    } else if (str7 != null) {
                                        str2 = g92.i0(str7).toString();
                                    } else {
                                        throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                    l22 a = q22.a(obj3, str2);
                                    linkedHashMap.put(a.c(), a.d());
                                } else {
                                    throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
                                }
                            }
                            map = linkedHashMap;
                        }
                        return new s12(obj, obj2, map);
                    }
                    throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
                }
                throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
            }
            throw new IllegalArgumentException(('\"' + str + "\" is not a cookie.").toString());
        }
    }

    /* renamed from: s12$b */
    static final class b extends w62 implements z52<Map.Entry<? extends String, ? extends Object>, CharSequence> {
        public static final b f = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence r(Map.Entry<String, ? extends Object> entry) {
            v62.f(entry, "it");
            if (entry.getValue() == null) {
                return String.valueOf(entry.getKey());
            }
            return entry.getKey() + '=' + entry.getValue();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s12(String str) {
        this(d.b(str));
        v62.f(str, "string");
    }

    public s12(String str, Object obj, Map<String, ? extends Object> map) {
        v62.f(str, "key");
        v62.f(obj, "value");
        v62.f(map, "attributes");
        this.a = str;
        this.b = obj;
        this.c = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s12(s12 s12) {
        this(s12.a, s12.b, s12.c);
        v62.f(s12, "cookie");
    }

    public final String a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final String c() {
        if (this.c.isEmpty()) {
            return this.b.toString();
        }
        return this.b.toString() + "; " + m82.g(x32.n(this.c), "; ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, b.f, 30, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s12)) {
            return false;
        }
        s12 s12 = (s12) obj;
        return v62.a(this.a, s12.a) && v62.a(this.b, s12.b) && v62.a(this.c, s12.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Map<String, Object> map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Cookie(key=" + this.a + ", value=" + this.b + ", attributes=" + this.c + ")";
    }
}
