package defpackage;

/* renamed from: mw0  reason: default package */
final class mw0 extends tv0<Object> {
    private final transient Object[] g;
    private final transient int h;
    private final transient int i;

    mw0(Object[] objArr, int i2, int i3) {
        this.g = objArr;
        this.h = i2;
        this.i = i3;
    }

    public final Object get(int i2) {
        tu0.a(i2, this.i);
        return this.g[(i2 * 2) + this.h];
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    public final int size() {
        return this.i;
    }
}
