package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: zz0  reason: default package */
public final class zz0<K, V> extends LinkedHashMap<K, V> {
    private static final zz0 f;
    private boolean e = true;

    static {
        zz0 zz0 = new zz0();
        f = zz0;
        zz0.e = false;
    }

    private zz0() {
    }

    private zz0(Map<K, V> map) {
        super(map);
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return uy0.j((byte[]) obj);
        }
        if (!(obj instanceof yy0)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> zz0<K, V> c() {
        return f;
    }

    private final void j() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        j();
        super.clear();
    }

    public final void d(zz0<K, V> zz0) {
        j();
        if (!zz0.isEmpty()) {
            putAll(zz0);
        }
    }

    public final zz0<K, V> e() {
        return isEmpty() ? new zz0<>() : new zz0<>(this);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz0.equals(java.lang.Object):boolean");
    }

    public final void f() {
        this.e = false;
    }

    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        j();
        uy0.d(k);
        uy0.d(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        j();
        for (Object next : map.keySet()) {
            uy0.d(next);
            uy0.d(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        j();
        return super.remove(obj);
    }
}
