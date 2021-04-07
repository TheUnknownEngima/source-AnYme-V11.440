package defpackage;

import defpackage.uy;
import java.io.EOFException;

/* renamed from: qt  reason: default package */
public final class qt {
    private final i50 a = new i50(10);

    public yx a(it itVar, uy.a aVar) {
        yx yxVar = null;
        int i = 0;
        while (true) {
            try {
                itVar.l(this.a.a, 0, 10);
                this.a.M(0);
                if (this.a.C() != 4801587) {
                    break;
                }
                this.a.N(3);
                int y = this.a.y();
                int i2 = y + 10;
                if (yxVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    itVar.l(bArr, 10, y);
                    yxVar = new uy(aVar).c(bArr, i2);
                } else {
                    itVar.e(y);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        itVar.i();
        itVar.e(i);
        return yxVar;
    }
}
