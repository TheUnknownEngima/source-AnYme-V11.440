package defpackage;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: m12  reason: default package */
public final class m12 {
    public static final <T> List<Class<? super T>> a(Class<T> cls) {
        v62.f(cls, "receiver$0");
        ArrayList arrayList = new ArrayList();
        Class<? super T> cls2 = cls;
        while (true) {
            Class<? super T> superclass = cls2.getSuperclass();
            if (superclass == null) {
                return arrayList;
            }
            arrayList.add(superclass);
            cls2 = superclass;
        }
    }

    public static final <K, V> void b(Map<K, V> map, Map<K, ? extends V> map2) {
        v62.f(map, "receiver$0");
        v62.f(map2, "other");
        for (Map.Entry next : map2.entrySet()) {
            c(map, next.getKey(), next.getValue());
        }
    }

    public static final <K, V> void c(Map<K, V> map, K k, V v) {
        v62.f(map, "receiver$0");
        if (!map.containsKey(k)) {
            map.put(k, v);
        }
    }

    public static final void d(Writer writer, String str) {
        v62.f(writer, "receiver$0");
        v62.f(str, "string");
        writer.write(str);
        writer.flush();
    }
}
