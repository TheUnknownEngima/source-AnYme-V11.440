package defpackage;

/* renamed from: bc0  reason: default package */
final class bc0<E> extends wb0<E> {
    private final zb0<E> g;

    bc0(zb0<E> zb0, int i) {
        super(zb0.size(), i);
        this.g = zb0;
    }

    /* access modifiers changed from: protected */
    public final E a(int i) {
        return this.g.get(i);
    }
}
