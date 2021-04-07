package defpackage;

import defpackage.cl0;

/* renamed from: wi0  reason: default package */
public final class wi0 extends cl0<wi0, a> implements rm0 {
    private static volatile zm0<wi0> zzahx;
    /* access modifiers changed from: private */
    public static final wi0 zzbgg;
    private int zzahj;
    private int zzbgf;

    /* renamed from: wi0$a */
    public static final class a extends cl0.b<wi0, a> implements rm0 {
        private a() {
            super(wi0.zzbgg);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        wi0 wi0 = new wi0();
        zzbgg = wi0;
        cl0.o(wi0.class, wi0);
    }

    private wi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new wi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbgg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzahj", "zzbgf", yd0.zzgk()});
            case 4:
                return zzbgg;
            case 5:
                zm0<wi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (wi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbgg);
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
