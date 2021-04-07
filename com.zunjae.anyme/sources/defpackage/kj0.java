package defpackage;

import defpackage.cl0;

/* renamed from: kj0  reason: default package */
public final class kj0 extends cl0<kj0, a> implements rm0 {
    private static volatile zm0<kj0> zzahx;
    /* access modifiers changed from: private */
    public static final kj0 zzbkn;
    private int zzahj;
    private int zzbkl;
    private int zzbkm;

    /* renamed from: kj0$a */
    public static final class a extends cl0.b<kj0, a> implements rm0 {
        private a() {
            super(kj0.zzbkn);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        kj0 kj0 = new kj0();
        zzbkn = kj0;
        cl0.o(kj0.class, kj0);
    }

    private kj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new kj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbkn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"zzahj", "zzbkl", ke0.zzgk(), "zzbkm"});
            case 4:
                return zzbkn;
            case 5:
                zm0<kj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (kj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbkn);
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
