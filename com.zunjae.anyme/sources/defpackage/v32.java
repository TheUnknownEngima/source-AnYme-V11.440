package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: v32  reason: default package */
class v32 extends u32 {
    public static int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> b(l22<? extends K, ? extends V> l22) {
        v62.e(l22, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(l22.c(), l22.d());
        v62.d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        v62.e(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        v62.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> d(Map<? extends K, ? extends V> map) {
        v62.e(map, "$this$toSortedMap");
        return new TreeMap(map);
    }
}
