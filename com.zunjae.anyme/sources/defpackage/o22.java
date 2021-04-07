package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o22  reason: default package */
final class o22<T> implements d22<T>, Serializable {
    private static final AtomicReferenceFieldUpdater<o22<?>, Object> g = AtomicReferenceFieldUpdater.newUpdater(o22.class, Object.class, "f");
    private volatile o52<? extends T> e;
    private volatile Object f = s22.a;

    public o22(o52<? extends T> o52) {
        v62.e(o52, "initializer");
        this.e = o52;
        s22 s22 = s22.a;
    }

    public boolean a() {
        return this.f != s22.a;
    }

    public T getValue() {
        T t = this.f;
        if (t != s22.a) {
            return t;
        }
        o52<? extends T> o52 = this.e;
        if (o52 != null) {
            T invoke = o52.invoke();
            if (g.compareAndSet(this, s22.a, invoke)) {
                this.e = null;
                return invoke;
            }
        }
        return this.f;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
