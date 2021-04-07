package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.l;

public class k<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal;

    public k(boolean z) {
        this._cur$internal = new l(8, z);
    }

    public final boolean a(E e) {
        v62.f(e, "element");
        while (true) {
            l lVar = (l) this._cur$internal;
            int d = lVar.d(e);
            if (d == 0) {
                return true;
            }
            if (d == 1) {
                a.compareAndSet(this, lVar, lVar.l());
            } else if (d == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            l lVar = (l) this._cur$internal;
            if (!lVar.g()) {
                a.compareAndSet(this, lVar, lVar.l());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((l) this._cur$internal).i();
    }

    public final E d() {
        E e;
        E e2;
        while (true) {
            l lVar = (l) this._cur$internal;
            while (true) {
                long j = lVar._state$internal;
                e = null;
                if ((1152921504606846976L & j) == 0) {
                    l.a aVar = l.h;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((lVar.a & ((int) ((1152921503533105152L & j) >> 30))) == (lVar.a & i)) {
                        break;
                    }
                    e2 = lVar.b.get(lVar.a & i);
                    if (e2 != null) {
                        if (!(e2 instanceof l.b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!l.f.compareAndSet(lVar, j, l.h.b(j, i2))) {
                                if (lVar.d) {
                                    l lVar2 = lVar;
                                    do {
                                        lVar2 = lVar2.n(i, i2);
                                    } while (lVar2 != null);
                                    break;
                                }
                            } else {
                                lVar.b.set(lVar.a & i, (Object) null);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (lVar.d) {
                        break;
                    }
                } else {
                    e = l.g;
                    break;
                }
            }
            e = e2;
            if (e != l.g) {
                return e;
            }
            a.compareAndSet(this, lVar, lVar.l());
        }
    }
}
