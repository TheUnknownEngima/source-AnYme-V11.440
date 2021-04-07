package defpackage;

import defpackage.cl0;

/* renamed from: jj0  reason: default package */
public final class jj0 extends cl0<jj0, a> implements rm0 {
    private static volatile zm0<jj0> zzahx;
    /* access modifiers changed from: private */
    public static final jj0 zzbkk;
    private int zzahj;
    private int zzbkh;
    private int zzbki;
    private hj0 zzbkj;

    /* renamed from: jj0$a */
    public static final class a extends cl0.b<jj0, a> implements rm0 {
        private a() {
            super(jj0.zzbkk);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        jj0 jj0 = new jj0();
        zzbkk = jj0;
        cl0.o(jj0.class, jj0);
    }

    private jj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new jj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbkk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbkh", "zzbki", "zzbkj"});
            case 4:
                return zzbkk;
            case 5:
                zm0<jj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (jj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbkk);
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
