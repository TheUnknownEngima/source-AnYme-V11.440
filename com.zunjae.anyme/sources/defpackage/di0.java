package defpackage;

import defpackage.cl0;

/* renamed from: di0  reason: default package */
public final class di0 extends cl0<di0, a> implements rm0 {
    private static volatile zm0<di0> zzahx;
    /* access modifiers changed from: private */
    public static final di0 zzblh;
    private int zzahj;
    private int zzble;
    private int zzblf;
    private int zzblg;

    /* renamed from: di0$a */
    public static final class a extends cl0.b<di0, a> implements rm0 {
        private a() {
            super(di0.zzblh);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        di0 di0 = new di0();
        zzblh = di0;
        cl0.o(di0.class, di0);
    }

    private di0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new di0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzblh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzahj", "zzble", "zzblf", "zzblg"});
            case 4:
                return zzblh;
            case 5:
                zm0<di0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (di0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzblh);
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
