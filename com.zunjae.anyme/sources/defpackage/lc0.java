package defpackage;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: lc0  reason: default package */
final class lc0 extends zb0<Map.Entry<K, V>> {
    private final /* synthetic */ ic0 g;

    lc0(ic0 ic0) {
        this.g = ic0;
    }

    public final /* synthetic */ Object get(int i) {
        sb0.c(i, this.g.i);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.g.h[i2], this.g.h[i2 + 1]);
    }

    public final int size() {
        return this.g.i;
    }
}
