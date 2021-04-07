package defpackage;

import defpackage.cl0;

/* renamed from: hj0  reason: default package */
public final class hj0 extends cl0<hj0, a> implements rm0 {
    private static volatile zm0<hj0> zzahx;
    /* access modifiers changed from: private */
    public static final hj0 zzbke;
    private int zzahj;
    private int zzbkb;
    private int zzbkc;
    private int zzbkd;

    /* renamed from: hj0$a */
    public static final class a extends cl0.b<hj0, a> implements rm0 {
        private a() {
            super(hj0.zzbke);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        hj0 hj0 = new hj0();
        zzbke = hj0;
        cl0.o(hj0.class, hj0);
    }

    private hj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new hj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbke, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzahj", "zzbkb", xe0.zzgk(), "zzbkc", "zzbkd"});
            case 4:
                return zzbke;
            case 5:
                zm0<hj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (hj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbke);
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
