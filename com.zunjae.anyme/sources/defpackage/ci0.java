package defpackage;

import defpackage.cl0;

/* renamed from: ci0  reason: default package */
public final class ci0 extends cl0<ci0, a> implements rm0 {
    private static volatile zm0<ci0> zzahx;
    /* access modifiers changed from: private */
    public static final ci0 zzbld;
    private int zzahj;
    private long zzbla;
    private ml0 zzblb = cl0.s();
    private ml0 zzblc = cl0.s();

    /* renamed from: ci0$a */
    public static final class a extends cl0.b<ci0, a> implements rm0 {
        private a() {
            super(ci0.zzbld);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ci0 ci0 = new ci0();
        zzbld = ci0;
        cl0.o(ci0.class, ci0);
    }

    private ci0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ci0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbld, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzahj", "zzbla", "zzblb", "zzblc"});
            case 4:
                return zzbld;
            case 5:
                zm0<ci0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ci0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbld);
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
