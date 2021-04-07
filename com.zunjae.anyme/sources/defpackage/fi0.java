package defpackage;

import defpackage.cl0;

/* renamed from: fi0  reason: default package */
public final class fi0 extends cl0<fi0, a> implements rm0 {
    private static volatile zm0<fi0> zzahx;
    /* access modifiers changed from: private */
    public static final fi0 zzblq;
    private int zzahj;
    private String zzbfl = "";
    private boolean zzblk;
    private boolean zzbll;
    private int zzblm;
    private String zzbln = "";
    private int zzblo;
    private int zzblp;

    /* renamed from: fi0$a */
    public static final class a extends cl0.b<fi0, a> implements rm0 {
        private a() {
            super(fi0.zzblq);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    static {
        fi0 fi0 = new fi0();
        zzblq = fi0;
        cl0.o(fi0.class, fi0);
    }

    private fi0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new fi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzblq, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzahj", "zzblk", "zzbll", "zzblm", "zzbln", "zzblo", "zzblp", "zzbfl"});
            case 4:
                return zzblq;
            case 5:
                zm0<fi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (fi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzblq);
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
