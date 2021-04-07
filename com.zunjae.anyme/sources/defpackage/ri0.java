package defpackage;

import defpackage.cl0;

/* renamed from: ri0  reason: default package */
public final class ri0 extends cl0<ri0, a> implements rm0 {
    private static volatile zm0<ri0> zzahx;
    /* access modifiers changed from: private */
    public static final ri0 zzbfe;
    private int zzahj;
    private int zzbez;
    private double zzbfa;
    private double zzbfb;
    private double zzbfc;
    private double zzbfd;

    /* renamed from: ri0$a */
    public static final class a extends cl0.b<ri0, a> implements rm0 {
        private a() {
            super(ri0.zzbfe);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ri0 ri0 = new ri0();
        zzbfe = ri0;
        cl0.o(ri0.class, ri0);
    }

    private ri0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ri0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbfe, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzahj", "zzbez", "zzbfa", "zzbfb", "zzbfc", "zzbfd"});
            case 4:
                return zzbfe;
            case 5:
                zm0<ri0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ri0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbfe);
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
