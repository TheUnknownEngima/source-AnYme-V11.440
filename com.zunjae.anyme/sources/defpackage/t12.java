package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: t12  reason: default package */
public final class t12 implements Map<String, String>, k72 {
    public static final a g = new a((r62) null);
    private final s12[] e;
    private final /* synthetic */ HashMap f;

    /* renamed from: t12$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        /* access modifiers changed from: private */
        public final s12[] b(Map<String, ? extends Object> map) {
            Map map2;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                List<String> U = g92.U(next.getValue().toString(), new String[]{";"}, false, 0, 6, (Object) null);
                ArrayList arrayList2 = new ArrayList(g32.l(U, 10));
                for (String str : U) {
                    if (str != null) {
                        arrayList2.add(g92.i0(str).toString());
                    } else {
                        throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                String str2 = (String) arrayList2.get(0);
                if (arrayList2.size() < 2) {
                    map2 = w32.e();
                } else {
                    List<String> subList = arrayList2.subList(1, arrayList2.size());
                    LinkedHashMap linkedHashMap = new LinkedHashMap(w72.b(v32.a(g32.l(subList, 10)), 16));
                    for (String str3 : subList) {
                        String str4 = (String) g92.U(str3, new String[]{"="}, false, 0, 6, (Object) null).get(0);
                        if (str4 != null) {
                            String obj = g92.i0(str4).toString();
                            String str5 = str3;
                            String str6 = obj;
                            List U2 = g92.U(str5, new String[]{"="}, false, 0, 6, (Object) null);
                            String str7 = null;
                            String str8 = U2.size() > 1 ? (String) U2.get(1) : null;
                            if (str8 != null) {
                                if (str8 != null) {
                                    str7 = g92.i0(str8).toString();
                                } else {
                                    throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
                                }
                            }
                            l22 a = q22.a(str6, str7);
                            linkedHashMap.put(a.c(), a.d());
                        } else {
                            throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    map2 = linkedHashMap;
                }
                arrayList.add(new s12((String) next.getKey(), str2, map2));
            }
            Object[] array = arrayList.toArray(new s12[0]);
            if (array != null) {
                return (s12[]) array;
            }
            throw new r22("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: t12$b */
    static final class b extends w62 implements z52<s12, String> {
        public static final b f = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final String r(s12 s12) {
            v62.f(s12, "it");
            return s12.a() + '=' + s12.b();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t12(java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "cookies"
            defpackage.v62.f(r2, r0)
            t12$a r0 = g
            s12[] r2 = r0.b(r2)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            s12[] r2 = (defpackage.s12[]) r2
            r1.<init>((defpackage.s12[]) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t12.<init>(java.util.Map):void");
    }

    public t12(s12... s12Arr) {
        v62.f(s12Arr, "cookies");
        LinkedHashMap linkedHashMap = new LinkedHashMap(w72.b(v32.a(s12Arr.length), 16));
        for (s12 s12 : s12Arr) {
            l22 a2 = q22.a(s12.a(), s12.c());
            linkedHashMap.put(a2.c(), a2.d());
        }
        this.f = linkedHashMap;
        this.e = s12Arr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t12(s12[] s12Arr, int i, r62 r62) {
        this((i & 1) != 0 ? new s12[0] : s12Arr);
    }

    public boolean a(String str) {
        v62.f(str, "key");
        return this.f.containsKey(str);
    }

    public boolean b(String str) {
        v62.f(str, "value");
        return this.f.containsValue(str);
    }

    public String c(String str) {
        v62.f(str, "key");
        return (String) this.f.get(str);
    }

    public void clear() {
        this.f.clear();
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return false;
    }

    public final s12 d(String str) {
        v62.f(str, "key");
        String str2 = (String) get(str);
        if (str2 == null) {
            return null;
        }
        return new s12(str + '=' + str2);
    }

    public Set<Map.Entry<String, String>> e() {
        Set<Map.Entry<String, String>> entrySet = this.f.entrySet();
        v62.b(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
        return e();
    }

    public Set<String> f() {
        Set<String> keySet = this.f.keySet();
        v62.b(keySet, "<get-keys>(...)");
        return keySet;
    }

    public int g() {
        return this.f.size();
    }

    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return c((String) obj);
        }
        return null;
    }

    public Collection<String> h() {
        Collection<String> values = this.f.values();
        v62.b(values, "<get-values>(...)");
        return values;
    }

    /* renamed from: i */
    public String put(String str, String str2) {
        v62.f(str, "key");
        v62.f(str2, "value");
        return (String) this.f.put(str, str2);
    }

    public boolean isEmpty() {
        return this.f.isEmpty();
    }

    public String j(String str) {
        v62.f(str, "key");
        return (String) this.f.remove(str);
    }

    public final /* bridge */ Set<String> keySet() {
        return f();
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        v62.f(map, "from");
        this.f.putAll(map);
    }

    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return j((String) obj);
        }
        return null;
    }

    public final /* bridge */ int size() {
        return g();
    }

    public String toString() {
        return b32.k(this.e, "; ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, b.f, 30, (Object) null);
    }

    public final /* bridge */ Collection<String> values() {
        return h();
    }
}
