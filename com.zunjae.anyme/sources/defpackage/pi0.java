package defpackage;

import defpackage.cl0;

/* renamed from: pi0  reason: default package */
public final class pi0 extends cl0<pi0, a> implements rm0 {
    private static volatile zm0<pi0> zzahx;
    private static final jl0<Integer, ph0> zzbmw = new rj0();
    /* access modifiers changed from: private */
    public static final pi0 zzbmx;
    private int zzahj;
    private int zzbis;
    private int zzbmt;
    private kl0 zzbmv = cl0.r();

    /* renamed from: pi0$a */
    public static final class a extends cl0.b<pi0, a> implements rm0 {
        private a() {
            super(pi0.zzbmx);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        pi0 pi0 = new pi0();
        zzbmx = pi0;
        cl0.o(pi0.class, pi0);
    }

    private pi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new pi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbmx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001e", new Object[]{"zzahj", "zzbis", qh0.zzgk(), "zzbmt", le0.zzgk(), "zzbmv", ph0.zzgk()});
            case 4:
                return zzbmx;
            case 5:
                zm0<pi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (pi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbmx);
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
