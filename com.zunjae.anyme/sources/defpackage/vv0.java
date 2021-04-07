package defpackage;

/* renamed from: vv0  reason: default package */
final class vv0 extends tv0<E> {
    private final transient int g;
    private final transient int h;
    private final /* synthetic */ tv0 i;

    vv0(tv0 tv0, int i2, int i3) {
        this.i = tv0;
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
        tu0.a(i2, this.h);
        return this.i.get(i2 + this.g);
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.i.g() + this.g + this.h;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    /* renamed from: j */
    public final tv0<E> subList(int i2, int i3) {
        tu0.e(i2, i3, this.h);
        tv0 tv0 = this.i;
        int i4 = this.g;
        return (tv0) tv0.subList(i2 + i4, i3 + i4);
    }

    public final int size() {
        return this.h;
    }
}
