package defpackage;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: kw0  reason: default package */
final class kw0 extends tv0<Map.Entry<K, V>> {
    private final /* synthetic */ lw0 g;

    kw0(lw0 lw0) {
        this.g = lw0;
    }

    public final /* synthetic */ Object get(int i) {
        tu0.a(i, this.g.i);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.g.h[i2], this.g.h[i2 + 1]);
    }

    public final boolean i() {
        return true;
    }

    public final int size() {
        return this.g.i;
    }
}
