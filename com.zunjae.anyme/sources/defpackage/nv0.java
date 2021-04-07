package defpackage;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: nv0  reason: default package */
final class nv0 extends ev0<K, V> {
    @NullableDecl
    private final K e;
    private int f;
    private final /* synthetic */ iv0 g;

    nv0(iv0 iv0, int i) {
        this.g = iv0;
        this.e = iv0.g[i];
        this.f = i;
    }

    private final void a() {
        int i = this.f;
        if (i == -1 || i >= this.g.size() || !ru0.a(this.e, this.g.g[this.f])) {
            this.f = this.g.d(this.e);
        }
    }

    @NullableDecl
    public final K getKey() {
        return this.e;
    }

    @NullableDecl
    public final V getValue() {
        Map l = this.g.l();
        if (l != null) {
            return l.get(this.e);
        }
        a();
        int i = this.f;
        if (i == -1) {
            return null;
        }
        return this.g.h[i];
    }

    public final V setValue(V v) {
        Map l = this.g.l();
        if (l != null) {
            return l.put(this.e, v);
        }
        a();
        int i = this.f;
        if (i == -1) {
            this.g.put(this.e, v);
            return null;
        }
        V[] vArr = this.g.h;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }
}
