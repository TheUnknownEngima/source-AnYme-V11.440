package defpackage;

import defpackage.cl0;

/* renamed from: ej0  reason: default package */
public final class ej0 extends cl0<ej0, a> implements rm0 {
    private static volatile zm0<ej0> zzahx;
    /* access modifiers changed from: private */
    public static final ej0 zzbjs;
    private int zzahj;
    private String zzbhd = "";
    private boolean zzbjq;
    private pi0 zzbjr;

    /* renamed from: ej0$a */
    public static final class a extends cl0.b<ej0, a> implements rm0 {
        private a() {
            super(ej0.zzbjs);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        ej0 ej0 = new ej0();
        zzbjs = ej0;
        cl0.o(ej0.class, ej0);
    }

    private ej0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ej0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbjs, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbhd", "zzbjq", "zzbjr"});
            case 4:
                return zzbjs;
            case 5:
                zm0<ej0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ej0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbjs);
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
