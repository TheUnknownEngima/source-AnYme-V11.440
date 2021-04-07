package defpackage;

/* renamed from: nc0  reason: default package */
final class nc0 extends zb0<Object> {
    private final transient Object[] g;
    private final transient int h;
    private final transient int i = 0;

    nc0(Object[] objArr, int i2, int i3) {
        this.g = objArr;
        this.h = i2;
    }

    public final Object get(int i2) {
        sb0.c(i2, this.i);
        return this.g[(i2 * 2) + this.h];
    }

    public final int size() {
        return this.i;
    }
}
