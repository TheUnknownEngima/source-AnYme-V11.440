package defpackage;

import defpackage.sy0;

/* renamed from: dt0  reason: default package */
public final class dt0 extends sy0<dt0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final dt0 zzd;
    private static volatile o01<dt0> zze;
    private bz0<et0> zzc = sy0.z();

    /* renamed from: dt0$a */
    public static final class a extends sy0.b<dt0, a> implements h01 {
        private a() {
            super(dt0.zzd);
        }

        /* synthetic */ a(ct0 ct0) {
            this();
        }
    }

    static {
        dt0 dt0 = new dt0();
        zzd = dt0;
        sy0.t(dt0.class, dt0);
    }

    private dt0() {
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (ct0.a[i - 1]) {
            case 1:
                return new dt0();
            case 2:
                return new a((ct0) null);
            case 3:
                return sy0.r(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", et0.class});
            case 4:
                return zzd;
            case 5:
                o01<dt0> o01 = zze;
                if (o01 == null) {
                    synchronized (dt0.class) {
                        o01 = zze;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzd);
                            zze = o01;
                        }
                    }
                }
                return o01;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
