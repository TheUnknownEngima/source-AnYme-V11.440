package defpackage;

import defpackage.cl0;

/* renamed from: mj0  reason: default package */
public final class mj0 extends cl0<mj0, a> implements rm0 {
    private static volatile zm0<mj0> zzahx;
    /* access modifiers changed from: private */
    public static final mj0 zzbks;
    private int zzahj;
    private String zzbeo = "";
    private String zzbep = "";

    /* renamed from: mj0$a */
    public static final class a extends cl0.b<mj0, a> implements rm0 {
        private a() {
            super(mj0.zzbks);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        mj0 mj0 = new mj0();
        zzbks = mj0;
        cl0.o(mj0.class, mj0);
    }

    private mj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new mj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbks, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbeo", "zzbep"});
            case 4:
                return zzbks;
            case 5:
                zm0<mj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (mj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbks);
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
