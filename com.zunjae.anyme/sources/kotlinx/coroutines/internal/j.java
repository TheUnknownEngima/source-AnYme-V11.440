package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.k0;

public class j {
    static final AtomicReferenceFieldUpdater e;
    static final AtomicReferenceFieldUpdater f;
    private static final AtomicReferenceFieldUpdater g;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    public static abstract class a extends c<j> {
        public j b;
        public final j c;

        public a(j jVar) {
            v62.f(jVar, "newNode");
            this.c = jVar;
        }

        /* renamed from: f */
        public void b(j jVar, Object obj) {
            v62.f(jVar, "affected");
            boolean z = obj == null;
            j jVar2 = z ? this.c : this.b;
            if (jVar2 != null && j.e.compareAndSet(jVar, this, jVar2) && z) {
                j jVar3 = this.c;
                j jVar4 = this.b;
                if (jVar4 != null) {
                    jVar3.h(jVar4);
                } else {
                    v62.l();
                    throw null;
                }
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<j> cls2 = j.class;
        e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    private final j f(j jVar, p pVar) {
        Object obj;
        while (true) {
            j jVar2 = null;
            while (true) {
                obj = jVar._next;
                if (obj == pVar) {
                    return jVar;
                }
                if (obj instanceof p) {
                    ((p) obj).a(jVar);
                } else if (!(obj instanceof q)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof q) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            jVar2 = jVar;
                            jVar = (j) obj;
                        } else {
                            throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == jVar) {
                        return null;
                    } else {
                        if (f.compareAndSet(this, obj2, jVar) && !(jVar._prev instanceof q)) {
                            return null;
                        }
                    }
                } else if (jVar2 != null) {
                    break;
                } else {
                    jVar = i.b(jVar._prev);
                }
            }
            jVar.u();
            e.compareAndSet(jVar2, jVar, ((q) obj).a);
            jVar = jVar2;
        }
    }

    private final j g() {
        j jVar = this;
        while (!(jVar instanceof h)) {
            jVar = jVar.o();
            if (k0.a()) {
                if (!(jVar != this)) {
                    throw new AssertionError();
                }
            }
        }
        return jVar;
    }

    /* access modifiers changed from: private */
    public final void h(j jVar) {
        Object obj;
        do {
            obj = jVar._prev;
            if ((obj instanceof q) || n() != jVar) {
                return;
            }
        } while (!f.compareAndSet(jVar, obj, this));
        if (!(n() instanceof q)) {
            return;
        }
        if (obj != null) {
            jVar.f((j) obj, (p) null);
            return;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final void j(j jVar) {
        s();
        jVar.f(i.b(this._prev), (p) null);
    }

    private final j u() {
        Object obj;
        j jVar;
        do {
            obj = this._prev;
            if (obj instanceof q) {
                return ((q) obj).a;
            }
            if (obj == this) {
                jVar = g();
            } else if (obj != null) {
                jVar = (j) obj;
            } else {
                throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f.compareAndSet(this, obj, jVar.w()));
        return (j) obj;
    }

    private final q w() {
        q qVar = (q) this._removedRef;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        g.lazySet(this, qVar2);
        return qVar2;
    }

    public final boolean d(j jVar) {
        v62.f(jVar, "node");
        f.lazySet(jVar, this);
        e.lazySet(jVar, this);
        while (n() == this) {
            if (e.compareAndSet(this, this, jVar)) {
                jVar.h(this);
                return true;
            }
        }
        return false;
    }

    public final Object n() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final j o() {
        return i.b(n());
    }

    public final Object p() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof q) {
                return obj;
            }
            if (obj != null) {
                j jVar = (j) obj;
                if (jVar.n() == this) {
                    return obj;
                }
                f(jVar, (p) null);
            } else {
                throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    public final j q() {
        return i.b(p());
    }

    public final void s() {
        Object n;
        j u = u();
        Object obj = this._next;
        if (obj != null) {
            j jVar = ((q) obj).a;
            while (true) {
                j jVar2 = null;
                while (true) {
                    Object n2 = jVar.n();
                    if (n2 instanceof q) {
                        jVar.u();
                        jVar = ((q) n2).a;
                    } else {
                        n = u.n();
                        if (n instanceof q) {
                            if (jVar2 != null) {
                                break;
                            }
                            u = i.b(u._prev);
                        } else if (n != this) {
                            if (n != null) {
                                j jVar3 = (j) n;
                                if (jVar3 != jVar) {
                                    j jVar4 = jVar3;
                                    jVar2 = u;
                                    u = jVar4;
                                } else {
                                    return;
                                }
                            } else {
                                throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (e.compareAndSet(u, this, jVar)) {
                            return;
                        }
                    }
                }
                u.u();
                e.compareAndSet(jVar2, u, ((q) n).a);
                u = jVar2;
            }
        } else {
            throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    public final boolean t() {
        return n() instanceof q;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public boolean v() {
        Object n;
        j jVar;
        do {
            n = n();
            if ((n instanceof q) || n == this) {
                return false;
            }
            if (n != null) {
                jVar = (j) n;
            } else {
                throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!e.compareAndSet(this, n, jVar.w()));
        j(jVar);
        return true;
    }

    public final int x(j jVar, j jVar2, a aVar) {
        v62.f(jVar, "node");
        v62.f(jVar2, "next");
        v62.f(aVar, "condAdd");
        f.lazySet(jVar, this);
        e.lazySet(jVar, jVar2);
        aVar.b = jVar2;
        if (!e.compareAndSet(this, jVar2, aVar)) {
            return 0;
        }
        return aVar.a(this) == null ? 1 : 2;
    }
}
