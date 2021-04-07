package defpackage;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: jc0  reason: default package */
final class jc0<K, V> extends dc0<K, V> {
    static final dc0<Object, Object> i = new jc0((Object) null, new Object[0], 0);
    private final transient Object[] h;

    private jc0(Object obj, Object[] objArr, int i2) {
        this.h = objArr;
    }

    /* access modifiers changed from: package-private */
    public final hc0<Map.Entry<K, V>> b() {
        return new ic0(this, this.h, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public final hc0<K> c() {
        return new kc0(this, new nc0(this.h, 0, 0));
    }

    /* access modifiers changed from: package-private */
    public final yb0<V> d() {
        return new nc0(this.h, 1, 0);
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        return null;
    }

    public final int size() {
        return 0;
    }
}
