package defpackage;

/* renamed from: ec0  reason: default package */
final class ec0 extends zb0<E> {
    private final transient int g;
    private final transient int h;
    private final /* synthetic */ zb0 i;

    ec0(zb0 zb0, int i2, int i3) {
        this.i = zb0;
        this.g = i2;
        this.h = i3;
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.i.d();
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return this.i.g() + this.g;
    }

    public final E get(int i2) {
        sb0.c(i2, this.h);
        return this.i.get(i2 + this.g);
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.i.g() + this.g + this.h;
    }

    /* renamed from: k */
    public final zb0<E> subList(int i2, int i3) {
        sb0.d(i2, i3, this.h);
        zb0 zb0 = this.i;
        int i4 = this.g;
        return (zb0) zb0.subList(i2 + i4, i3 + i4);
    }

    public final int size() {
        return this.h;
    }
}
