package defpackage;

import defpackage.sy0;

/* renamed from: ls0  reason: default package */
public final class ls0 extends sy0<ls0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ls0 zzf;
    private static volatile o01<ls0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: ls0$a */
    public static final class a extends sy0.b<ls0, a> implements h01 {
        private a() {
            super(ls0.zzf);
        }

        /* synthetic */ a(ns0 ns0) {
            this();
        }
    }

    static {
        ls0 ls0 = new ls0();
        zzf = ls0;
        sy0.t(ls0.class, ls0);
    }

    private ls0() {
    }

    public final String A() {
        return this.zzd;
    }

    public final String B() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (ns0.a[i - 1]) {
            case 1:
                return new ls0();
            case 2:
                return new a((ns0) null);
            case 3:
                return sy0.r(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                o01<ls0> o01 = zzg;
                if (o01 == null) {
                    synchronized (ls0.class) {
                        o01 = zzg;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzf);
                            zzg = o01;
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
