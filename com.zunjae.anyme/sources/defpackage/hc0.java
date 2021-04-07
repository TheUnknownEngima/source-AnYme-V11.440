package defpackage;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: hc0  reason: default package */
public abstract class hc0<E> extends yb0<E> implements Set<E> {
    @NullableDecl
    private transient zb0<E> f;

    hc0() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return mc0.a(this, obj);
    }

    public int hashCode() {
        return mc0.b(this);
    }

    public zb0<E> i() {
        zb0<E> zb0 = this.f;
        if (zb0 != null) {
            return zb0;
        }
        zb0<E> j = j();
        this.f = j;
        return j;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    public zb0<E> j() {
        return zb0.i(toArray());
    }
}
