package defpackage;

/* renamed from: mk0  reason: default package */
public abstract class mk0 {
    private mk0() {
    }

    static mk0 a(byte[] bArr, int i, int i2, boolean z) {
        ok0 ok0 = new ok0(bArr, i2);
        try {
            ok0.b(i2);
            return ok0;
        } catch (ol0 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
