package defpackage;

import defpackage.cl0;

/* renamed from: li0  reason: default package */
public final class li0 extends cl0<li0, a> implements rm0 {
    private static volatile zm0<li0> zzahx;
    /* access modifiers changed from: private */
    public static final li0 zzbml;
    private int zzahj;
    private ri0 zzbiu;

    /* renamed from: li0$a */
    public static final class a extends cl0.b<li0, a> implements rm0 {
        private a() {
            super(li0.zzbml);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        li0 li0 = new li0();
        zzbml = li0;
        cl0.o(li0.class, li0);
    }

    private li0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new li0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbml, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzahj", "zzbiu"});
            case 4:
                return zzbml;
            case 5:
                zm0<li0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (li0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbml);
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
