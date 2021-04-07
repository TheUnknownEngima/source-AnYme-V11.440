package defpackage;

import defpackage.cl0;

/* renamed from: oj0  reason: default package */
public final class oj0 extends cl0<oj0, a> implements rm0 {
    private static volatile zm0<oj0> zzahx;
    /* access modifiers changed from: private */
    public static final oj0 zzbkz;
    private int zzahj;
    private int zzbft;
    private int zzbjo;
    private int zzbkc;
    private int zzbkw;
    private boolean zzbkx;
    private boolean zzbky;

    /* renamed from: oj0$a */
    public static final class a extends cl0.b<oj0, a> implements rm0 {
        private a() {
            super(oj0.zzbkz);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        oj0 oj0 = new oj0();
        zzbkz = oj0;
        cl0.o(oj0.class, oj0);
    }

    private oj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new oj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbkz, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဆ\u0005", new Object[]{"zzahj", "zzbkc", "zzbkw", sf0.zzgk(), "zzbkx", "zzbky", "zzbjo", de0.zzgk(), "zzbft"});
            case 4:
                return zzbkz;
            case 5:
                zm0<oj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (oj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbkz);
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
