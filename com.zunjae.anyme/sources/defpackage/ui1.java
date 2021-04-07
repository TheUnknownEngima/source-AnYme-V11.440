package defpackage;

import defpackage.vj1;
import java.io.InputStream;

/* renamed from: ui1  reason: default package */
public final class ui1 extends vj1<ui1, a> implements Object {
    /* access modifiers changed from: private */
    public static final ui1 l;
    private static volatile xk1<ui1> m;
    private ri1 i;
    private ri1 j;
    private ri1 k;

    /* renamed from: ui1$a */
    public static final class a extends vj1.a<ui1, a> implements Object {
        private a() {
            super(ui1.l);
        }

        /* synthetic */ a(qi1 qi1) {
            this();
        }
    }

    static {
        ui1 ui1 = new ui1();
        l = ui1;
        vj1.F(ui1.class, ui1);
    }

    private ui1() {
        vj1.t();
    }

    public static ui1 L(InputStream inputStream) {
        return (ui1) vj1.B(l, inputStream);
    }

    public ri1 I() {
        ri1 ri1 = this.j;
        return ri1 == null ? ri1.I() : ri1;
    }

    public ri1 J() {
        ri1 ri1 = this.k;
        return ri1 == null ? ri1.I() : ri1;
    }

    public ri1 K() {
        ri1 ri1 = this.i;
        return ri1 == null ? ri1.I() : ri1;
    }

    /* access modifiers changed from: protected */
    public final Object s(vj1.f fVar, Object obj, Object obj2) {
        switch (qi1.a[fVar.ordinal()]) {
            case 1:
                return new ui1();
            case 2:
                return new a((qi1) null);
            case 3:
                return vj1.A(l, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b", new Object[]{"bitField0_", "fetchedConfigHolder_", "activeConfigHolder_", "defaultsConfigHolder_", "metadata_", "appliedResource_", vi1.class});
            case 4:
                return l;
            case 5:
                xk1<ui1> xk1 = m;
                if (xk1 == null) {
                    synchronized (ui1.class) {
                        xk1 = m;
                        if (xk1 == null) {
                            xk1 = new vj1.b<>(l);
                            m = xk1;
                        }
                    }
                }
                return xk1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
