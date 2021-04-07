package defpackage;

import defpackage.cl0;

/* renamed from: gi0  reason: default package */
public final class gi0 extends cl0<gi0, a> implements rm0 {
    private static volatile zm0<gi0> zzahx;
    /* access modifiers changed from: private */
    public static final gi0 zzblu;
    private int zzahj;
    private int zzblr;
    private int zzbls;
    private int zzblt;

    /* renamed from: gi0$a */
    public static final class a extends cl0.b<gi0, a> implements rm0 {
        private a() {
            super(gi0.zzblu);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        gi0 gi0 = new gi0();
        zzblu = gi0;
        cl0.o(gi0.class, gi0);
    }

    private gi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new gi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzblu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zzahj", "zzblr", "zzbls", xf0.zzgk(), "zzblt"});
            case 4:
                return zzblu;
            case 5:
                zm0<gi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (gi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzblu);
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
