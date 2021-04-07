package defpackage;

import defpackage.vj1;
import defpackage.xj1;
import java.util.List;

/* renamed from: ri1  reason: default package */
public final class ri1 extends vj1<ri1, a> implements Object {
    /* access modifiers changed from: private */
    public static final ri1 l;
    private static volatile xk1<ri1> m;
    private xj1.i<ti1> i = vj1.t();
    private long j;
    private xj1.i<ej1> k = vj1.t();

    /* renamed from: ri1$a */
    public static final class a extends vj1.a<ri1, a> implements Object {
        private a() {
            super(ri1.l);
        }

        /* synthetic */ a(qi1 qi1) {
            this();
        }
    }

    static {
        ri1 ri1 = new ri1();
        l = ri1;
        vj1.F(ri1.class, ri1);
    }

    private ri1() {
    }

    public static ri1 I() {
        return l;
    }

    public List<ej1> J() {
        return this.k;
    }

    public List<ti1> K() {
        return this.i;
    }

    public long L() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final Object s(vj1.f fVar, Object obj, Object obj2) {
        switch (qi1.a[fVar.ordinal()]) {
            case 1:
                return new ri1();
            case 2:
                return new a((qi1) null);
            case 3:
                return vj1.A(l, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u0005\u0000\u0003\u001c", new Object[]{"bitField0_", "namespaceKeyValue_", ti1.class, "timestamp_", "experimentPayload_"});
            case 4:
                return l;
            case 5:
                xk1<ri1> xk1 = m;
                if (xk1 == null) {
                    synchronized (ri1.class) {
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
