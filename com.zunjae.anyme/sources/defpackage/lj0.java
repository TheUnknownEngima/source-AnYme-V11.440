package defpackage;

import defpackage.cl0;

/* renamed from: lj0  reason: default package */
public final class lj0 extends cl0<lj0, a> implements rm0 {
    private static volatile zm0<lj0> zzahx;
    /* access modifiers changed from: private */
    public static final lj0 zzbkr;
    private int zzahj;
    private byte zzbim = 2;
    private int zzbko;
    private int zzbkp;
    private int zzbkq;

    /* renamed from: lj0$a */
    public static final class a extends cl0.b<lj0, a> implements rm0 {
        private a() {
            super(lj0.zzbkr);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        lj0 lj0 = new lj0();
        zzbkr = lj0;
        cl0.o(lj0.class, lj0);
    }

    private lj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        int i2 = 1;
        switch (ai0.a[i - 1]) {
            case 1:
                return new lj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbkr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzahj", "zzbko", mf0.zzgk(), "zzbkp", "zzbkq", wh0.zzgk()});
            case 4:
                return zzbkr;
            case 5:
                zm0<lj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (lj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbkr);
                            zzahx = zm0;
                        }
                    }
                }
                return zm0;
            case 6:
                return Byte.valueOf(this.zzbim);
            case 7:
                if (obj == null) {
                    i2 = 0;
                }
                this.zzbim = (byte) i2;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
