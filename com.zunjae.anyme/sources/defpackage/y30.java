package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.m0;
import defpackage.w30;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y30  reason: default package */
public final class y30 extends i20 {
    private final x30 n = new x30();
    private final i50 o = new i50();
    private final w30.b p = new w30.b();
    private final s30 q = new s30();
    private final List<v30> r = new ArrayList();

    public y30() {
        super("WebvttDecoder");
    }

    private static int C(i50 i50) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = i50.c();
            String m = i50.m();
            i = m == null ? 0 : "STYLE".equals(m) ? 2 : m.startsWith("NOTE") ? 1 : 3;
        }
        i50.M(i2);
        return i;
    }

    private static void D(i50 i50) {
        do {
        } while (!TextUtils.isEmpty(i50.m()));
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        this.o.K(bArr, i);
        this.p.g();
        this.r.clear();
        try {
            z30.e(this.o);
            do {
            } while (!TextUtils.isEmpty(this.o.m()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int C = C(this.o);
                if (C == 0) {
                    return new a40(arrayList);
                }
                if (C == 1) {
                    D(this.o);
                } else if (C == 2) {
                    if (arrayList.isEmpty()) {
                        this.o.m();
                        this.r.addAll(this.q.d(this.o));
                    } else {
                        throw new m20("A style block was found after the first cue.");
                    }
                } else if (C == 3 && this.n.h(this.o, this.p, this.r)) {
                    arrayList.add(this.p.a());
                    this.p.g();
                }
            }
        } catch (m0 e) {
            throw new m20((Exception) e);
        }
    }
}
