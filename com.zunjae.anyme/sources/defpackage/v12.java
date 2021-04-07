package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: v12  reason: default package */
public final class v12<V> implements Map<String, V>, j72 {
    private final Map<String, V> e;

    public v12(Map<String, ? extends V> map) {
        v62.f(map, "map");
        this.e = map;
    }

    public boolean a(String str) {
        v62.f(str, "key");
        Set<String> keySet = this.e.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            for (String m : keySet) {
                String lowerCase = str.toLowerCase();
                v62.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (f92.m(m, lowerCase, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public V b(String str) {
        v62.f(str, "key");
        Map<String, V> map = this.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String lowerCase = str.toLowerCase();
            v62.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (f92.m((String) next.getKey(), lowerCase, true)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry value : linkedHashMap.entrySet()) {
            arrayList.add(value.getValue());
        }
        return n32.B(arrayList);
    }

    public Set<Map.Entry<String, V>> c() {
        return this.e.entrySet();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return this.e.containsValue(obj);
    }

    public Set<String> d() {
        return this.e.keySet();
    }

    public int e() {
        return this.e.size();
    }

    public final /* bridge */ Set<Map.Entry<String, V>> entrySet() {
        return c();
    }

    public Collection<V> f() {
        return this.e.values();
    }

    public final /* bridge */ V get(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    public final /* bridge */ Set<String> keySet() {
        return d();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return this.e.toString();
    }

    public final /* bridge */ Collection<V> values() {
        return f();
    }
}
