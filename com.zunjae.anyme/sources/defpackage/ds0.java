package defpackage;

import defpackage.sy0;
import java.util.List;

/* renamed from: ds0  reason: default package */
public final class ds0 extends sy0<ds0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ds0 zzh;
    private static volatile o01<ds0> zzi;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private bz0<String> zzg = sy0.z();

    /* renamed from: ds0$a */
    public static final class a extends sy0.b<ds0, a> implements h01 {
        private a() {
            super(ds0.zzh);
        }

        /* synthetic */ a(es0 es0) {
            this();
        }
    }

    /* renamed from: ds0$b */
    public enum b implements yy0 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        private static final wy0<b> zzh = null;
        private final int zzi;

        static {
            zzh = new hs0();
        }

        private b(int i) {
            this.zzi = i;
        }

        public static b zza(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static az0 zzb() {
            return ms0.a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzi;
        }
    }

    static {
        ds0 ds0 = new ds0();
        zzh = ds0;
        sy0.t(ds0.class, ds0);
    }

    private ds0() {
    }

    public static ds0 K() {
        return zzh;
    }

    public final boolean A() {
        return (this.zzc & 1) != 0;
    }

    public final b B() {
        b zza = b.zza(this.zzd);
        return zza == null ? b.UNKNOWN_MATCH_TYPE : zza;
    }

    public final boolean C() {
        return (this.zzc & 2) != 0;
    }

    public final String D() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzc & 4) != 0;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final List<String> H() {
        return this.zzg;
    }

    public final int I() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (es0.a[i - 1]) {
            case 1:
                return new ds0();
            case 2:
                return new a((es0) null);
            case 3:
                return sy0.r(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.zzb(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                o01<ds0> o01 = zzi;
                if (o01 == null) {
                    synchronized (ds0.class) {
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
