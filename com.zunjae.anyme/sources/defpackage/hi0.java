package defpackage;

import defpackage.cl0;

/* renamed from: hi0  reason: default package */
public final class hi0 extends cl0<hi0, a> implements rm0 {
    private static volatile zm0<hi0> zzahx;
    /* access modifiers changed from: private */
    public static final hi0 zzbly;
    private int zzahj;
    private ll0<mi0> zzblv = cl0.t();
    private ll0<aj0> zzblw = cl0.t();
    private li0 zzblx;

    /* renamed from: hi0$a */
    public static final class a extends cl0.b<hi0, a> implements rm0 {
        private a() {
            super(hi0.zzbly);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        hi0 hi0 = new hi0();
        zzbly = hi0;
        cl0.o(hi0.class, hi0);
    }

    private hi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new hi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbly, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzahj", "zzblv", mi0.class, "zzblw", aj0.class, "zzblx"});
            case 4:
                return zzbly;
            case 5:
                zm0<hi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (hi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbly);
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
