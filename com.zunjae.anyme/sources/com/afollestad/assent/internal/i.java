package com.afollestad.assent.internal;

import java.util.ArrayList;
import java.util.List;

public final class i<T> {
    private final List<T> a = new ArrayList();
    private final Object b = new Object();

    public final boolean a() {
        return !this.a.isEmpty();
    }

    public final void b(T t) {
        d(t);
    }

    public final T c() {
        T B;
        synchronized (this.b) {
            B = n32.B(this.a);
            if (B != null) {
                this.a.remove(0);
            } else {
                throw new IllegalStateException("Queue is empty, cannot pop.".toString());
            }
        }
        return B;
    }

    public final boolean d(T t) {
        boolean add;
        synchronized (this.b) {
            add = this.a.add(t);
        }
        return add;
    }
}
