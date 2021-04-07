package defpackage;

import defpackage.cl0;

/* renamed from: vi0  reason: default package */
public final class vi0 extends cl0<vi0, a> implements rm0 {
    private static volatile zm0<vi0> zzahx;
    /* access modifiers changed from: private */
    public static final vi0 zzbge;
    private int zzahj;
    private int zzbez;
    private int zzbgb;
    private int zzbgc;
    private int zzbgd;

    /* renamed from: vi0$a */
    public static final class a extends cl0.b<vi0, a> implements rm0 {
        private a() {
            super(vi0.zzbge);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        vi0 vi0 = new vi0();
        zzbge = vi0;
        cl0.o(vi0.class, vi0);
    }

    private vi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new vi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbge, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zzahj", "zzbgb", "zzbez", "zzbgc", if0.zzgk(), "zzbgd"});
            case 4:
                return zzbge;
            case 5:
                zm0<vi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (vi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbge);
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
