package defpackage;

/* renamed from: wv0  reason: default package */
final class wv0<E> extends bv0<E> {
    private final tv0<E> g;

    wv0(tv0<E> tv0, int i) {
        super(tv0.size(), i);
        this.g = tv0;
    }

    /* access modifiers changed from: protected */
    public final E a(int i) {
        return this.g.get(i);
    }
}
