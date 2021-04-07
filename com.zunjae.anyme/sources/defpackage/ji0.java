package defpackage;

import defpackage.cl0;

/* renamed from: ji0  reason: default package */
public final class ji0 extends cl0<ji0, a> implements rm0 {
    private static volatile zm0<ji0> zzahx;
    /* access modifiers changed from: private */
    public static final ji0 zzbmg;
    private int zzahj;
    private bj0 zzbfq;
    private int zzbgf;
    private long zzbkt;
    private int zzbmc;
    private int zzbmd;
    private int zzbme;
    private ll0<bj0> zzbmf = cl0.t();

    /* renamed from: ji0$a */
    public static final class a extends cl0.b<ji0, a> implements rm0 {
        private a() {
            super(ji0.zzbmg);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ji0 ji0 = new ji0();
        zzbmg = ji0;
        cl0.o(ji0.class, ji0);
    }

    private ji0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ji0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbmg, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzahj", "zzbfq", "zzbmc", lg0.zzgk(), "zzbgf", jg0.zzgk(), "zzbmd", le0.zzgk(), "zzbme", xd0.zzgk(), "zzbkt", "zzbmf", bj0.class});
            case 4:
                return zzbmg;
            case 5:
                zm0<ji0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ji0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbmg);
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
