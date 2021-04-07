package defpackage;

/* renamed from: gc0  reason: default package */
final class gc0<E> extends zb0<E> {
    static final zb0<Object> i = new gc0(new Object[0], 0);
    private final transient Object[] g;
    private final transient int h;

    gc0(Object[] objArr, int i2) {
        this.g = objArr;
        this.h = i2;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.g, 0, objArr, i2, this.h);
        return i2 + this.h;
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return 0;
    }

    public final E get(int i2) {
        sb0.c(i2, this.h);
        return this.g[i2];
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.h;
    }

    public final int size() {
        return this.h;
    }
}
