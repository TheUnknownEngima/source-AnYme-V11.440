package defpackage;

import defpackage.cl0;

/* renamed from: bi0  reason: default package */
public final class bi0 extends cl0<bi0, a> implements rm0 {
    private static volatile zm0<bi0> zzahx;
    private static final jl0<Integer, vh0> zzber = new pj0();
    /* access modifiers changed from: private */
    public static final bi0 zzbes;
    private int zzahj;
    private String zzbeo = "";
    private String zzbep = "";
    private kl0 zzbeq = cl0.r();

    /* renamed from: bi0$a */
    public static final class a extends cl0.b<bi0, a> implements rm0 {
        private a() {
            super(bi0.zzbes);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        bi0 bi0 = new bi0();
        zzbes = bi0;
        cl0.o(bi0.class, bi0);
    }

    private bi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new bi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbes, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"zzahj", "zzbeo", "zzbep", "zzbeq", vh0.zzgk()});
            case 4:
                return zzbes;
            case 5:
                zm0<bi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (bi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbes);
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
