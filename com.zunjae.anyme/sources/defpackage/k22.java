package defpackage;

/* renamed from: k22  reason: default package */
public final class k22 extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k22(String str) {
        super(str);
        v62.e(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k22(String str, int i, r62 r62) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
