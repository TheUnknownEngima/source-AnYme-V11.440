package defpackage;

import defpackage.cl0;

/* renamed from: ij0  reason: default package */
public final class ij0 extends cl0<ij0, a> implements rm0 {
    private static volatile zm0<ij0> zzahx;
    /* access modifiers changed from: private */
    public static final ij0 zzbkg;
    private ll0<ej0> zzbkf = cl0.t();

    /* renamed from: ij0$a */
    public static final class a extends cl0.b<ij0, a> implements rm0 {
        private a() {
            super(ij0.zzbkg);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ij0 ij0 = new ij0();
        zzbkg = ij0;
        cl0.o(ij0.class, ij0);
    }

    private ij0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ij0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbkg, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbkf", ej0.class});
            case 4:
                return zzbkg;
            case 5:
                zm0<ij0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ij0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbkg);
                            zzahx = zm0;
                        }
                    }
                }
                return zm0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
