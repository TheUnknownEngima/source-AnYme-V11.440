package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: hq0  reason: default package */
final class hq0 extends WeakReference<Throwable> {
    private final int a;

    public hq0(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == hq0.class) {
            if (this == obj) {
                return true;
            }
            hq0 hq0 = (hq0) obj;
            return this.a == hq0.a && get() == hq0.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
