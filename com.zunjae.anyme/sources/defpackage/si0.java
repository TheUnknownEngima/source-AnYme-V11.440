package defpackage;

import defpackage.cl0;

/* renamed from: si0  reason: default package */
public final class si0 extends cl0<si0, a> implements rm0 {
    private static volatile zm0<si0> zzahx;
    /* access modifiers changed from: private */
    public static final si0 zzbfm;
    private int zzahj;
    private int zzbff;
    private boolean zzbfg;
    private int zzbfh;
    private boolean zzbfi;
    private ll0<ei0> zzbfj = cl0.t();
    private ll0<ei0> zzbfk = cl0.t();
    private String zzbfl = "";

    /* renamed from: si0$a */
    public static final class a extends cl0.b<si0, a> implements rm0 {
        private a() {
            super(si0.zzbfm);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        si0 si0 = new si0();
        zzbfm = si0;
        cl0.o(si0.class, si0);
    }

    private si0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        Class<ei0> cls = ei0.class;
        switch (ai0.a[i - 1]) {
            case 1:
                return new si0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbfm, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzahj", "zzbff", ld0.zzgk(), "zzbfg", "zzbfh", le0.zzgk(), "zzbfi", "zzbfj", cls, "zzbfk", cls, "zzbfl"});
            case 4:
                return zzbfm;
            case 5:
                zm0<si0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (si0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbfm);
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
