package defpackage;

/* renamed from: zl0  reason: default package */
final class zl0 extends yl0 {
    private zl0() {
        super();
    }

    private static <E> ll0<E> e(Object obj, long j) {
        return (ll0) bo0.G(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, long j) {
        e(obj, j).q();
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j) {
        ll0 e = e(obj, j);
        ll0 e2 = e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.T()) {
                e = e.l0(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        bo0.g(obj, j, e2);
    }
}
