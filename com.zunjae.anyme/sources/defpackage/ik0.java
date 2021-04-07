package defpackage;

/* renamed from: ik0  reason: default package */
final class ik0 {
    private final nk0 a;
    private final byte[] b;

    private ik0(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = nk0.f(bArr);
    }

    /* synthetic */ ik0(int i, ak0 ak0) {
        this(i);
    }

    public final bk0 a() {
        this.a.n0();
        return new kk0(this.b);
    }

    public final nk0 b() {
        return this.a;
    }
}
