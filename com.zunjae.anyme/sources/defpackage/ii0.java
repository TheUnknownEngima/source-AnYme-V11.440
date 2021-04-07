package defpackage;

import defpackage.cl0;

/* renamed from: ii0  reason: default package */
public final class ii0 extends cl0<ii0, a> implements rm0 {
    private static volatile zm0<ii0> zzahx;
    /* access modifiers changed from: private */
    public static final ii0 zzbmb;
    private int zzahj;
    private int zzblz;
    private int zzbma;

    /* renamed from: ii0$a */
    public static final class a extends cl0.b<ii0, a> implements rm0 {
        private a() {
            super(ii0.zzbmb);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ii0 ii0 = new ii0();
        zzbmb = ii0;
        cl0.o(ii0.class, ii0);
    }

    private ii0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ii0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbmb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzahj", "zzblz", eg0.zzgk(), "zzbma", eg0.zzgk()});
            case 4:
                return zzbmb;
            case 5:
                zm0<ii0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ii0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbmb);
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
