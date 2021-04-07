package defpackage;

import defpackage.w30;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: t30  reason: default package */
public final class t30 extends i20 {
    private final i50 n = new i50();
    private final w30.b o = new w30.b();

    public t30() {
        super("Mp4WebvttDecoder");
    }

    private static h20 C(i50 i50, w30.b bVar, int i) {
        bVar.g();
        while (i > 0) {
            if (i >= 8) {
                int k = i50.k();
                int k2 = i50.k();
                int i2 = k - 8;
                String y = v50.y(i50.a, i50.c(), i2);
                i50.N(i2);
                i = (i - 8) - i2;
                if (k2 == 1937011815) {
                    x30.j(y, bVar);
                } else if (k2 == 1885436268) {
                    x30.k((String) null, y.trim(), bVar, Collections.emptyList());
                }
            } else {
                throw new m20("Incomplete vtt cue box header found.");
            }
        }
        return bVar.a();
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        this.n.K(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.n.a() > 0) {
            if (this.n.a() >= 8) {
                int k = this.n.k();
                if (this.n.k() == 1987343459) {
                    arrayList.add(C(this.n, this.o, k - 8));
                } else {
                    this.n.N(k - 8);
                }
            } else {
                throw new m20("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new u30(arrayList);
    }
}
