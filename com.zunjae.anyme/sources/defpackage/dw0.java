package defpackage;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: dw0  reason: default package */
public abstract class dw0<E> extends uv0<E> implements Set<E> {
    @NullableDecl
    private transient tv0<E> f;

    dw0() {
    }

    static int j(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        tu0.f(z, "collection too large");
        return 1073741824;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dw0) || !zza() || !((dw0) obj).zza() || hashCode() == obj.hashCode()) {
            return ow0.b(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return ow0.a(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public tv0<E> k() {
        tv0<E> tv0 = this.f;
        if (tv0 != null) {
            return tv0;
        }
        tv0<E> l = l();
        this.f = l;
        return l;
    }

    /* access modifiers changed from: package-private */
    public tv0<E> l() {
        return tv0.l(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean zza() {
        return false;
    }
}
