package defpackage;

import defpackage.cl0;

/* renamed from: oi0  reason: default package */
public final class oi0 extends cl0<oi0, a> implements rm0 {
    private static volatile zm0<oi0> zzahx;
    /* access modifiers changed from: private */
    public static final oi0 zzbmu;
    private int zzahj;
    private int zzbmp;
    private int zzbmq;
    private ll0<bj0> zzbmr = cl0.t();
    private ll0<bj0> zzbms = cl0.t();
    private int zzbmt;

    /* renamed from: oi0$a */
    public static final class a extends cl0.b<oi0, a> implements rm0 {
        private a() {
            super(oi0.zzbmu);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        oi0 oi0 = new oi0();
        zzbmu = oi0;
        cl0.o(oi0.class, oi0);
    }

    private oi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        Class<bj0> cls = bj0.class;
        switch (ai0.a[i - 1]) {
            case 1:
                return new oi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbmu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"zzahj", "zzbmp", ih0.zzgk(), "zzbmq", jh0.zzgk(), "zzbmr", cls, "zzbms", cls, "zzbmt", le0.zzgk()});
            case 4:
                return zzbmu;
            case 5:
                zm0<oi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (oi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbmu);
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
