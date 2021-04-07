package defpackage;

import defpackage.n42;
import java.io.Serializable;

/* renamed from: o42  reason: default package */
public final class o42 implements n42, Serializable {
    public static final o42 e = new o42();

    private o42() {
    }

    public <R> R fold(R r, d62<? super R, ? super n42.b, ? extends R> d62) {
        v62.e(d62, "operation");
        return r;
    }

    public <E extends n42.b> E get(n42.c<E> cVar) {
        v62.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public n42 minusKey(n42.c<?> cVar) {
        v62.e(cVar, "key");
        return this;
    }

    public n42 plus(n42 n42) {
        v62.e(n42, "context");
        return n42;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
