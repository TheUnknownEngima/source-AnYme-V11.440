package defpackage;

import defpackage.cl0;

/* renamed from: aj0  reason: default package */
public final class aj0 extends cl0<aj0, a> implements rm0 {
    private static volatile zm0<aj0> zzahx;
    /* access modifiers changed from: private */
    public static final aj0 zzbiv;
    private int zzahj;
    private int zzbis;
    private int zzbit;
    private ri0 zzbiu;

    /* renamed from: aj0$a */
    public static final class a extends cl0.b<aj0, a> implements rm0 {
        private a() {
            super(aj0.zzbiv);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        aj0 aj0 = new aj0();
        zzbiv = aj0;
        cl0.o(aj0.class, aj0);
    }

    private aj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new aj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbiv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbis", ee0.zzgk(), "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                zm0<aj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (aj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbiv);
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
