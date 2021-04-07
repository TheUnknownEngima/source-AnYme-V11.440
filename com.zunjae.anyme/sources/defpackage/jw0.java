package defpackage;

/* renamed from: jw0  reason: default package */
final class jw0<E> extends tv0<E> {
    static final tv0<Object> i = new jw0(new Object[0], 0);
    private final transient Object[] g;
    private final transient int h;

    jw0(Object[] objArr, int i2) {
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
        tu0.a(i2, this.h);
        return this.g[i2];
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    public final int size() {
        return this.h;
    }
}
