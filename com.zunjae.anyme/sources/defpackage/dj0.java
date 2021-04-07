package defpackage;

import defpackage.cl0;

/* renamed from: dj0  reason: default package */
public final class dj0 extends cl0<dj0, a> implements rm0 {
    private static volatile zm0<dj0> zzahx;
    /* access modifiers changed from: private */
    public static final dj0 zzbjp;
    private int zzahj;
    private boolean zzbjj;
    private int zzbjk;
    private int zzbjl;
    private int zzbjm;
    private oj0 zzbjn;
    private int zzbjo;

    /* renamed from: dj0$a */
    public static final class a extends cl0.b<dj0, a> implements rm0 {
        private a() {
            super(dj0.zzbjp);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        dj0 dj0 = new dj0();
        zzbjp = dj0;
        cl0.o(dj0.class, dj0);
    }

    private dj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new dj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbjp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzahj", "zzbjj", "zzbjk", le0.zzgk(), "zzbjl", re0.zzgk(), "zzbjm", sd0.zzgk(), "zzbjn", "zzbjo", qe0.zzgk()});
            case 4:
                return zzbjp;
            case 5:
                zm0<dj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (dj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbjp);
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
