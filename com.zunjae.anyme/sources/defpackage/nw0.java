package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: nw0  reason: default package */
final class nw0<K> extends dw0<K> {
    private final transient zv0<K, ?> g;
    private final transient tv0<K> h;

    nw0(zv0<K, ?> zv0, tv0<K> tv0) {
        this.g = zv0;
        this.h = tv0;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        return k().a(objArr, i);
    }

    /* renamed from: c */
    public final qw0<K> iterator() {
        return (qw0) k().iterator();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.g.get(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    public final tv0<K> k() {
        return this.h;
    }

    public final int size() {
        return this.g.size();
    }
}
