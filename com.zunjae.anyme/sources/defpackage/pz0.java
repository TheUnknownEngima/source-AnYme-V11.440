package defpackage;

/* renamed from: pz0  reason: default package */
final class pz0 extends oz0 {
    private pz0() {
        super();
    }

    private static <E> bz0<E> e(Object obj, long j) {
        return (bz0) s11.F(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j) {
        bz0 e = e(obj, j);
        bz0 e2 = e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.zza()) {
                e = e.f(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        s11.j(obj, j, e2);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j) {
        e(obj, j).f0();
    }
}
