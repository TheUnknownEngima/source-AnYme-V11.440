package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: ax0  reason: default package */
final class ax0 extends WeakReference<Throwable> {
    private final int a;

    public ax0(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ax0.class) {
            if (this == obj) {
                return true;
            }
            ax0 ax0 = (ax0) obj;
            return this.a == ax0.a && get() == ax0.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
