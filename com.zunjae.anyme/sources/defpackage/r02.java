package defpackage;

import defpackage.vj1;

/* renamed from: r02  reason: default package */
public final class r02 extends vj1<r02, a> implements Object {
    /* access modifiers changed from: private */
    public static final r02 i;
    private static volatile xk1<r02> j;

    /* renamed from: r02$a */
    public static final class a extends vj1.a<r02, a> implements Object {
        private a() {
            super(r02.i);
        }

        /* synthetic */ a(q02 q02) {
            this();
        }
    }

    static {
        r02 r02 = new r02();
        i = r02;
        vj1.F(r02.class, r02);
    }

    private r02() {
    }

    /* access modifiers changed from: protected */
    public final Object s(vj1.f fVar, Object obj, Object obj2) {
        switch (q02.a[fVar.ordinal()]) {
            case 1:
                return new r02();
            case 2:
                return new a((q02) null);
            case 3:
                return vj1.A(i, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return i;
            case 5:
                xk1<r02> xk1 = j;
                if (xk1 == null) {
                    synchronized (r02.class) {
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
