package defpackage;

import defpackage.sy0;

/* renamed from: bs0  reason: default package */
public final class bs0 extends sy0<bs0, b> implements h01 {
    /* access modifiers changed from: private */
    public static final bs0 zzi;
    private static volatile o01<bs0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* renamed from: bs0$a */
    public enum a implements yy0 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        private static final wy0<a> zzf = null;
        private final int zzg;

        static {
            zzf = new gs0();
        }

        private a(int i) {
            this.zzg = i;
        }

        public static a zza(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static az0 zzb() {
            return fs0.a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzg;
        }
    }

    /* renamed from: bs0$b */
    public static final class b extends sy0.b<bs0, b> implements h01 {
        private b() {
            super(bs0.zzi);
        }

        /* synthetic */ b(es0 es0) {
            this();
        }
    }

    static {
        bs0 bs0 = new bs0();
        zzi = bs0;
        sy0.t(bs0.class, bs0);
    }

    private bs0() {
    }

    public static bs0 M() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzc & 1) != 0;
    }

    public final a B() {
        a zza = a.zza(this.zzd);
        return zza == null ? a.UNKNOWN_COMPARISON_TYPE : zza;
    }

    public final boolean C() {
        return (this.zzc & 2) != 0;
    }

    public final boolean D() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzc & 4) != 0;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzc & 8) != 0;
    }

    public final String I() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzc & 16) != 0;
    }

    public final String L() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (es0.a[i - 1]) {
            case 1:
                return new bs0();
            case 2:
                return new b((es0) null);
            case 3:
                return sy0.r(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", a.zzb(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                o01<bs0> o01 = zzj;
                if (o01 == null) {
                    synchronized (bs0.class) {
                        o01 = zzj;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzi);
                            zzj = o01;
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
