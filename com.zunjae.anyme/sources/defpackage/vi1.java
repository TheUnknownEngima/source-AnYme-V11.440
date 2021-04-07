package defpackage;

import defpackage.vj1;

/* renamed from: vi1  reason: default package */
public final class vi1 extends vj1<vi1, a> implements Object {
    /* access modifiers changed from: private */
    public static final vi1 i;
    private static volatile xk1<vi1> j;

    /* renamed from: vi1$a */
    public static final class a extends vj1.a<vi1, a> implements Object {
        private a() {
            super(vi1.i);
        }

        /* synthetic */ a(qi1 qi1) {
            this();
        }
    }

    static {
        vi1 vi1 = new vi1();
        i = vi1;
        vj1.F(vi1.class, vi1);
    }

    private vi1() {
    }

    /* access modifiers changed from: protected */
    public final Object s(vj1.f fVar, Object obj, Object obj2) {
        switch (qi1.a[fVar.ordinal()]) {
            case 1:
                return new vi1();
            case 2:
                return new a((qi1) null);
            case 3:
                return vj1.A(i, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0005\u0001\u0003\b\u0002", new Object[]{"bitField0_", "resourceId_", "appUpdateTime_", "namespace_"});
            case 4:
                return i;
            case 5:
                xk1<vi1> xk1 = j;
                if (xk1 == null) {
                    synchronized (vi1.class) {
                        xk1 = j;
                        if (xk1 == null) {
                            xk1 = new vj1.b<>(i);
                            j = xk1;
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
