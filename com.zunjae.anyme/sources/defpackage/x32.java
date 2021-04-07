package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: x32  reason: default package */
class x32 extends w32 {
    public static <K, V> g82<Map.Entry<K, V>> n(Map<? extends K, ? extends V> map) {
        v62.e(map, "$this$asSequence");
        return n32.u(map.entrySet());
    }

    public static <K, V> List<l22<K, V>> o(Map<? extends K, ? extends V> map) {
        v62.e(map, "$this$toList");
        if (map.size() == 0) {
            return f32.f();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return f32.f();
        }
        Map.Entry next = it.next();
        if (!it.hasNext()) {
            return e32.b(new l22(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new l22(next.getKey(), next.getValue()));
        do {
            Map.Entry next2 = it.next();
            arrayList.add(new l22(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
