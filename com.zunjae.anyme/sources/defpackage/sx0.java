package defpackage;

/* renamed from: sx0  reason: default package */
final class sx0 {
    private final cy0 a;
    private final byte[] b;

    private sx0(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = cy0.f(bArr);
    }

    /* synthetic */ sx0(int i, nx0 nx0) {
        this(i);
    }

    public final lx0 a() {
        this.a.N();
        return new ux0(this.b);
    }

    public final cy0 b() {
        return this.a;
    }
}
