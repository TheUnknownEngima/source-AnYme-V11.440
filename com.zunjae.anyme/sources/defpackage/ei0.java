package defpackage;

import defpackage.cl0;

/* renamed from: ei0  reason: default package */
public final class ei0 extends cl0<ei0, a> implements rm0 {
    private static volatile zm0<ei0> zzahx;
    /* access modifiers changed from: private */
    public static final ei0 zzblj;
    private int zzahj;
    private int zzbkc;
    private String zzbli = "";

    /* renamed from: ei0$a */
    public static final class a extends cl0.b<ei0, a> implements rm0 {
        private a() {
            super(ei0.zzblj);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ei0 ei0 = new ei0();
        zzblj = ei0;
        cl0.o(ei0.class, ei0);
    }

    private ei0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ei0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzblj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbkc", "zzbli"});
            case 4:
                return zzblj;
            case 5:
                zm0<ei0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ei0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzblj);
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
