package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: w12  reason: default package */
public final class w12<V> implements Map<String, V>, k72 {
    private final Map<String, V> e;

    public w12(Map<String, V> map) {
        v62.f(map, "map");
        this.e = map;
    }

    public boolean a(String str) {
        v62.f(str, "key");
        Set<String> keySet = this.e.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            for (String m : keySet) {
                if (f92.m(m, str, true)) {
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
            if (f92.m((String) next.getKey(), str, true)) {
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
        this.e.clear();
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

    /* renamed from: g */
    public V put(String str, V v) {
        v62.f(str, "key");
        V remove = remove(str);
        this.e.put(str, v);
        return remove;
    }

    public final /* bridge */ V get(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return null;
    }

    public V h(String str) {
        v62.f(str, "key");
        Map<String, V> map = this.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (f92.m((String) next.getKey(), str, true)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry key : linkedHashMap.entrySet()) {
            arrayList.add((String) key.getKey());
        }
        String str2 = (String) n32.B(arrayList);
        if (str2 != null) {
            return this.e.remove(str2);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    public final /* bridge */ Set<String> keySet() {
        return d();
    }

    public void putAll(Map<? extends String, ? extends V> map) {
        v62.f(map, "from");
        for (Map.Entry next : map.entrySet()) {
            put((String) next.getKey(), next.getValue());
        }
    }

    public final /* bridge */ V remove(Object obj) {
        if (obj instanceof String) {
            return h((String) obj);
        }
        return null;
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
