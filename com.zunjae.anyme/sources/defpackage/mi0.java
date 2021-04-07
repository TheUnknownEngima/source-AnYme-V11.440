package defpackage;

import defpackage.cl0;

/* renamed from: mi0  reason: default package */
public final class mi0 extends cl0<mi0, a> implements rm0 {
    private static volatile zm0<mi0> zzahx;
    /* access modifiers changed from: private */
    public static final mi0 zzbmm;
    private int zzahj;
    private int zzbis;
    private int zzbit;
    private ri0 zzbiu;

    /* renamed from: mi0$a */
    public static final class a extends cl0.b<mi0, a> implements rm0 {
        private a() {
            super(mi0.zzbmm);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        mi0 mi0 = new mi0();
        zzbmm = mi0;
        cl0.o(mi0.class, mi0);
    }

    private mi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new mi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbmm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbis", xg0.zzgk(), "zzbit", "zzbiu"});
            case 4:
                return zzbmm;
            case 5:
                zm0<mi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (mi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbmm);
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
