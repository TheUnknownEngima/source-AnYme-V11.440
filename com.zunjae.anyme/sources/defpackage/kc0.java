package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: kc0  reason: default package */
final class kc0<K> extends hc0<K> {
    private final transient dc0<K, ?> g;
    private final transient zb0<K> h;

    kc0(dc0<K, ?> dc0, zb0<K> zb0) {
        this.g = dc0;
        this.h = zb0;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        return i().a(objArr, i);
    }

    /* renamed from: c */
    public final pc0<K> iterator() {
        return (pc0) i().iterator();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.g.get(obj) != null;
    }

    public final zb0<K> i() {
        return this.h;
    }

    public final int size() {
        return this.g.size();
    }
}
