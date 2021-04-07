package defpackage;

import defpackage.cl0;

/* renamed from: xi0  reason: default package */
public final class xi0 extends cl0<xi0, a> implements rm0 {
    private static volatile zm0<xi0> zzahx;
    /* access modifiers changed from: private */
    public static final xi0 zzbgm;
    private int zzahj;
    private int zzbgh;
    private int zzbgi;
    private int zzbgj;
    private boolean zzbgk;
    private int zzbgl;

    /* renamed from: xi0$a */
    public static final class a extends cl0.b<xi0, a> implements rm0 {
        private a() {
            super(xi0.zzbgm);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        xi0 xi0 = new xi0();
        zzbgm = xi0;
        cl0.o(xi0.class, xi0);
    }

    private xi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new xi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbgm, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzahj", "zzbgh", eg0.zzgk(), "zzbgi", yf0.zzgk(), "zzbgj", dg0.zzgk(), "zzbgk", "zzbgl"});
            case 4:
                return zzbgm;
            case 5:
                zm0<xi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (xi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbgm);
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
