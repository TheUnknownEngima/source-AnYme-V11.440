package defpackage;

import defpackage.sy0;

/* renamed from: cs0  reason: default package */
public final class cs0 extends sy0<cs0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final cs0 zzj;
    private static volatile o01<cs0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private as0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* renamed from: cs0$a */
    public static final class a extends sy0.b<cs0, a> implements h01 {
        private a() {
            super(cs0.zzj);
        }

        /* synthetic */ a(es0 es0) {
            this();
        }

        public final a w(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((cs0) this.f).B(str);
            return this;
        }
    }

    static {
        cs0 cs0 = new cs0();
        zzj = cs0;
        sy0.t(cs0.class, cs0);
    }

    private cs0() {
    }

    /* access modifiers changed from: private */
    public final void B(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a M() {
        return (a) zzj.v();
    }

    public final boolean C() {
        return (this.zzc & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    public final as0 G() {
        as0 as0 = this.zzf;
        return as0 == null ? as0.M() : as0;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zzc & 32) != 0;
    }

    public final boolean L() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (es0.a[i - 1]) {
            case 1:
                return new cs0();
            case 2:
                return new a((es0) null);
            case 3:
                return sy0.r(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                o01<cs0> o01 = zzk;
                if (o01 == null) {
                    synchronized (cs0.class) {
                        o01 = zzk;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzj);
                            zzk = o01;
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
