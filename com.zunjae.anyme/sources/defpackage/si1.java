package defpackage;

import defpackage.vj1;

/* renamed from: si1  reason: default package */
public final class si1 extends vj1<si1, a> implements Object {
    /* access modifiers changed from: private */
    public static final si1 k;
    private static volatile xk1<si1> l;
    private String i = "";
    private ej1 j = ej1.f;

    /* renamed from: si1$a */
    public static final class a extends vj1.a<si1, a> implements Object {
        private a() {
            super(si1.k);
        }

        /* synthetic */ a(qi1 qi1) {
            this();
        }
    }

    static {
        si1 si1 = new si1();
        k = si1;
        vj1.F(si1.class, si1);
    }

    private si1() {
    }

    public String I() {
        return this.i;
    }

    public ej1 J() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final Object s(vj1.f fVar, Object obj, Object obj2) {
        switch (qi1.a[fVar.ordinal()]) {
            case 1:
                return new si1();
            case 2:
                return new a((qi1) null);
            case 3:
                return vj1.A(k, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"bitField0_", "key_", "value_"});
            case 4:
                return k;
            case 5:
                xk1<si1> xk1 = l;
                if (xk1 == null) {
                    synchronized (si1.class) {
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
