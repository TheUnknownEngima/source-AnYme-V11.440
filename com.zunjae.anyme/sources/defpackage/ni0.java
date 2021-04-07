package defpackage;

import defpackage.cl0;

/* renamed from: ni0  reason: default package */
public final class ni0 extends cl0<ni0, a> implements rm0 {
    private static volatile zm0<ni0> zzahx;
    /* access modifiers changed from: private */
    public static final ni0 zzbmo;
    private int zzahj;
    private ll0<ei0> zzbfj = cl0.t();
    private int zzblp;
    private int zzbmc;
    private ll0<ei0> zzbmn = cl0.t();

    /* renamed from: ni0$a */
    public static final class a extends cl0.b<ni0, a> implements rm0 {
        private a() {
            super(ni0.zzbmo);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ni0 ni0 = new ni0();
        zzbmo = ni0;
        cl0.o(ni0.class, ni0);
    }

    private ni0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        Class<ei0> cls = ei0.class;
        switch (ai0.a[i - 1]) {
            case 1:
                return new ni0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbmo, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzahj", "zzbmc", dh0.zzgk(), "zzbfj", cls, "zzbmn", cls, "zzblp"});
            case 4:
                return zzbmo;
            case 5:
                zm0<ni0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ni0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbmo);
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
