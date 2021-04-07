package defpackage;

import defpackage.vj1;
import defpackage.xj1;
import java.util.List;

/* renamed from: ti1  reason: default package */
public final class ti1 extends vj1<ti1, a> implements Object {
    /* access modifiers changed from: private */
    public static final ti1 k;
    private static volatile xk1<ti1> l;
    private String i = "";
    private xj1.i<si1> j = vj1.t();

    /* renamed from: ti1$a */
    public static final class a extends vj1.a<ti1, a> implements Object {
        private a() {
            super(ti1.k);
        }

        /* synthetic */ a(qi1 qi1) {
            this();
        }
    }

    static {
        ti1 ti1 = new ti1();
        k = ti1;
        vj1.F(ti1.class, ti1);
    }

    private ti1() {
    }

    public List<si1> I() {
        return this.j;
    }

    public String J() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public final Object s(vj1.f fVar, Object obj, Object obj2) {
        switch (qi1.a[fVar.ordinal()]) {
            case 1:
                return new ti1();
            case 2:
                return new a((qi1) null);
            case 3:
                return vj1.A(k, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b", new Object[]{"bitField0_", "namespace_", "keyValue_", si1.class});
            case 4:
                return k;
            case 5:
                xk1<ti1> xk1 = l;
                if (xk1 == null) {
                    synchronized (ti1.class) {
                        xk1 = l;
                        if (xk1 == null) {
                            xk1 = new vj1.b<>(k);
                            l = xk1;
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
