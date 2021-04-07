package defpackage;

import defpackage.xj1;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ik1  reason: default package */
public final class ik1<K, V> extends LinkedHashMap<K, V> {
    private static final ik1 f;
    private boolean e = true;

    static {
        ik1 ik1 = new ik1();
        f = ik1;
        ik1.o();
    }

    private ik1() {
    }

    private ik1(Map<K, V> map) {
        super(map);
    }

    static <K, V> int b(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += c(next.getValue()) ^ c(next.getKey());
        }
        return i;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return xj1.d((byte[]) obj);
        }
        if (!(obj instanceof xj1.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void d(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            xj1.a(next);
            xj1.a(map.get(next));
        }
    }

    public static <K, V> ik1<K, V> e() {
        return f;
    }

    private void f() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean g(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean j(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = g(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.j(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        f();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && j(this, (Map) obj);
    }

    public int hashCode() {
        return b(this);
    }

    public boolean n() {
        return this.e;
    }

    public void o() {
        this.e = false;
    }

    public void p(ik1<K, V> ik1) {
        f();
        if (!ik1.isEmpty()) {
            putAll(ik1);
        }
    }

    public V put(K k, V v) {
        f();
        xj1.a(k);
        xj1.a(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        f();
        d(map);
        super.putAll(map);
    }

    public ik1<K, V> q() {
        return isEmpty() ? new ik1<>() : new ik1<>(this);
    }

    public V remove(Object obj) {
        f();
        return super.remove(obj);
    }
}
