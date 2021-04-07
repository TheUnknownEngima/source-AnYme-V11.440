package defpackage;

import defpackage.sy0;

/* renamed from: as0  reason: default package */
public final class as0 extends sy0<as0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final as0 zzh;
    private static volatile o01<as0> zzi;
    private int zzc;
    private ds0 zzd;
    private bs0 zze;
    private boolean zzf;
    private String zzg = "";

    /* renamed from: as0$a */
    public static final class a extends sy0.b<as0, a> implements h01 {
        private a() {
            super(as0.zzh);
        }

        /* synthetic */ a(es0 es0) {
            this();
        }

        public final a w(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((as0) this.f).B(str);
            return this;
        }
    }

    static {
        as0 as0 = new as0();
        zzh = as0;
        sy0.t(as0.class, as0);
    }

    private as0() {
    }

    /* access modifiers changed from: private */
    public final void B(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    public static as0 M() {
        return zzh;
    }

    public final boolean C() {
        return (this.zzc & 1) != 0;
    }

    public final ds0 D() {
        ds0 ds0 = this.zzd;
        return ds0 == null ? ds0.K() : ds0;
    }

    public final boolean F() {
        return (this.zzc & 2) != 0;
    }

    public final bs0 G() {
        bs0 bs0 = this.zze;
        return bs0 == null ? bs0.M() : bs0;
    }

    public final boolean H() {
        return (this.zzc & 4) != 0;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzc & 8) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (es0.a[i - 1]) {
            case 1:
                return new as0();
            case 2:
                return new a((es0) null);
            case 3:
                return sy0.r(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                o01<as0> o01 = zzi;
                if (o01 == null) {
                    synchronized (as0.class) {
                        o01 = zzi;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzh);
                            zzi = o01;
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
