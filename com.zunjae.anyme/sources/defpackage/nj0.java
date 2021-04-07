package defpackage;

import defpackage.cl0;

/* renamed from: nj0  reason: default package */
public final class nj0 extends cl0<nj0, a> implements rm0 {
    private static volatile zm0<nj0> zzahx;
    /* access modifiers changed from: private */
    public static final nj0 zzbkv;
    private int zzahj;
    private int zzbgf;
    private long zzbkt;
    private int zzbku;

    /* renamed from: nj0$a */
    public static final class a extends cl0.b<nj0, a> implements rm0 {
        private a() {
            super(nj0.zzbkv);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        nj0 nj0 = new nj0();
        zzbkv = nj0;
        cl0.o(nj0.class, nj0);
    }

    private nj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new nj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbkv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zzahj", "zzbgf", rf0.zzgk(), "zzbkt", "zzbku", xd0.zzgk()});
            case 4:
                return zzbkv;
            case 5:
                zm0<nj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (nj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbkv);
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
