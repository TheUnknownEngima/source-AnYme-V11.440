package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.k0;

public abstract class c<T> extends p {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile Object _consensus = b.a;

    private final Object c(Object obj) {
        return e(obj) ? obj : this._consensus;
    }

    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == b.a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract Object d(T t);

    public final boolean e(Object obj) {
        if (k0.a()) {
            if (!(obj != b.a)) {
                throw new AssertionError();
            }
        }
        return a.compareAndSet(this, b.a, obj);
    }
}
