package defpackage;

import defpackage.cl0;

/* renamed from: ki0  reason: default package */
public final class ki0 extends cl0<ki0, a> implements rm0 {
    private static volatile zm0<ki0> zzahx;
    /* access modifiers changed from: private */
    public static final ki0 zzbmk;
    private int zzahj;
    private String zzbhd = "";
    private ll0<hj0> zzbmh = cl0.t();
    private ll0<bj0> zzbmi = cl0.t();
    private boolean zzbmj;

    /* renamed from: ki0$a */
    public static final class a extends cl0.b<ki0, a> implements rm0 {
        private a() {
            super(ki0.zzbmk);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ki0 ki0 = new ki0();
        zzbmk = ki0;
        cl0.o(ki0.class, ki0);
    }

    private ki0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ki0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbmk, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzahj", "zzbhd", "zzbmh", hj0.class, "zzbmi", bj0.class, "zzbmj"});
            case 4:
                return zzbmk;
            case 5:
                zm0<ki0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ki0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbmk);
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
