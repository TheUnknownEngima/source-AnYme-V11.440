package defpackage;

import defpackage.cl0;

/* renamed from: gj0  reason: default package */
public final class gj0 extends cl0<gj0, a> implements rm0 {
    private static volatile zm0<gj0> zzahx;
    /* access modifiers changed from: private */
    public static final gj0 zzbka;
    private int zzahj;
    private int zzbju;

    /* renamed from: gj0$a */
    public static final class a extends cl0.b<gj0, a> implements rm0 {
        private a() {
            super(gj0.zzbka);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        gj0 gj0 = new gj0();
        zzbka = gj0;
        cl0.o(gj0.class, gj0);
    }

    private gj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new gj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbka, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzahj", "zzbju", xe0.zzgk()});
            case 4:
                return zzbka;
            case 5:
                zm0<gj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (gj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbka);
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
