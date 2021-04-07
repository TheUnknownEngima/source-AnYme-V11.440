package defpackage;

import defpackage.cl0;

/* renamed from: fj0  reason: default package */
public final class fj0 extends cl0<fj0, a> implements rm0 {
    private static volatile zm0<fj0> zzahx;
    /* access modifiers changed from: private */
    public static final fj0 zzbjz;
    private int zzahj;
    private int zzbfh;
    private int zzbjt;
    private int zzbju;
    private kl0 zzbjv = cl0.r();
    private kl0 zzbjw = cl0.r();
    private ll0<String> zzbjx = cl0.t();
    private ll0<String> zzbjy = cl0.t();

    /* renamed from: fj0$a */
    public static final class a extends cl0.b<fj0, a> implements rm0 {
        private a() {
            super(fj0.zzbjz);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        fj0 fj0 = new fj0();
        zzbjz = fj0;
        cl0.o(fj0.class, fj0);
    }

    private fj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new fj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbjz, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002ဌ\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007ဌ\u0002", new Object[]{"zzahj", "zzbjt", "zzbju", xe0.zzgk(), "zzbjv", "zzbjw", "zzbjx", "zzbjy", "zzbfh", le0.zzgk()});
            case 4:
                return zzbjz;
            case 5:
                zm0<fj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (fj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbjz);
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
