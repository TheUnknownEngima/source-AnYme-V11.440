package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: w32  reason: default package */
class w32 extends v32 {
    public static <K, V> Map<K, V> e() {
        q32 q32 = q32.e;
        if (q32 != null) {
            return q32;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    public static <K, V> Map<K, V> f(l22<? extends K, ? extends V>... l22Arr) {
        v62.e(l22Arr, "pairs");
        if (l22Arr.length <= 0) {
            return e();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v32.a(l22Arr.length));
        m(l22Arr, linkedHashMap);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        v62.e(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : v32.c(map) : e();
    }

    public static <K, V> Map<K, V> h(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        v62.e(map, "$this$plus");
        v62.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, Iterable<? extends l22<? extends K, ? extends V>> iterable) {
        v62.e(map, "$this$putAll");
        v62.e(iterable, "pairs");
        for (l22 l22 : iterable) {
            map.put(l22.a(), l22.b());
        }
    }

    public static final <K, V> void j(Map<? super K, ? super V> map, l22<? extends K, ? extends V>[] l22Arr) {
        v62.e(map, "$this$putAll");
        v62.e(l22Arr, "pairs");
        for (l22<? extends K, ? extends V> l22 : l22Arr) {
            map.put(l22.a(), l22.b());
        }
    }

    public static <K, V> Map<K, V> k(Iterable<? extends l22<? extends K, ? extends V>> iterable) {
        v62.e(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return e();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(v32.a(collection.size()));
                l(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return v32.b((l22) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        l(iterable, linkedHashMap2);
        return g(linkedHashMap2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M l(Iterable<? extends l22<? extends K, ? extends V>> iterable, M m) {
        v62.e(iterable, "$this$toMap");
        v62.e(m, "destination");
        i(m, iterable);
        return m;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M m(l22<? extends K, ? extends V>[] l22Arr, M m) {
        v62.e(l22Arr, "$this$toMap");
        v62.e(m, "destination");
        j(m, l22Arr);
        return m;
    }
}
