package defpackage;

import java.util.List;

/* renamed from: z20  reason: default package */
public final class z20 extends i20 {
    private final a30 n;

    public z20(List<byte[]> list) {
        super("DvbDecoder");
        i50 i50 = new i50(list.get(0));
        this.n = new a30(i50.F(), i50.F());
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.n.r();
        }
        return new b30(this.n.b(bArr, i));
    }
}
