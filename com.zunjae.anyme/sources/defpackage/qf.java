package defpackage;

import defpackage.zf;
import java.util.Queue;

/* renamed from: qf  reason: default package */
abstract class qf<T extends zf> {
    private final Queue<T> a = km.f(20);

    qf() {
    }

    /* access modifiers changed from: package-private */
    public abstract T a();

    /* access modifiers changed from: package-private */
    public T b() {
        T t = (zf) this.a.poll();
        return t == null ? a() : t;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
