package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: ve2  reason: default package */
public final class ve2<T> {
    private final WeakReference<T> a;

    public ve2(WeakReference<T> weakReference) {
        v62.f(weakReference, "weakRef");
        this.a = weakReference;
    }

    public final WeakReference<T> a() {
        return this.a;
    }
}
