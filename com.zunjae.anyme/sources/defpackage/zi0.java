package defpackage;

import defpackage.cl0;

/* renamed from: zi0  reason: default package */
public final class zi0 extends cl0<zi0, a> implements rm0 {
    private static volatile zm0<zi0> zzahx;
    /* access modifiers changed from: private */
    public static final zi0 zzbir;
    private int zzahj;
    private int zzbio = 0;
    private Object zzbip;
    private long zzbiq;

    /* renamed from: zi0$a */
    public static final class a extends cl0.b<zi0, a> implements rm0 {
        private a() {
            super(zi0.zzbir);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        zi0 zi0 = new zi0();
        zzbir = zi0;
        cl0.o(zi0.class, zi0);
    }

    private zi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new zi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbir, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002်\u0000\u0003ဵ\u0000\u0004း\u0000", new Object[]{"zzbip", "zzbio", "zzahj", "zzbiq"});
            case 4:
                return zzbir;
            case 5:
                zm0<zi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (zi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbir);
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
