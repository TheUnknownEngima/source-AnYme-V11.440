package defpackage;

import defpackage.sy0;

/* renamed from: et0  reason: default package */
public final class et0 extends sy0<et0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final et0 zzk;
    private static volatile o01<et0> zzl;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private long zzg;
    private double zzh;
    private bz0<et0> zzi = sy0.z();
    private String zzj = "";

    /* renamed from: et0$a */
    public static final class a extends sy0.b<et0, a> implements h01 {
        private a() {
            super(et0.zzk);
        }

        /* synthetic */ a(ct0 ct0) {
            this();
        }
    }

    /* renamed from: et0$b */
    public enum b implements yy0 {
        UNDEFINED(0),
        NULL(1),
        STRING(2),
        NUMBER(3),
        BOOLEAN(4),
        LIST(5),
        MAP(6),
        STATEMENT(7);
        
        private static final wy0<b> zzi = null;
        private final int zzj;

        static {
            zzi = new ft0();
        }

        private b(int i) {
            this.zzj = i;
        }

        public static b zza(int i) {
            switch (i) {
                case 0:
                    return UNDEFINED;
                case 1:
                    return NULL;
                case 2:
                    return STRING;
                case 3:
                    return NUMBER;
                case 4:
                    return BOOLEAN;
                case 5:
                    return LIST;
                case 6:
                    return MAP;
                case 7:
                    return STATEMENT;
                default:
                    return null;
            }
        }

        public static az0 zzb() {
            return ht0.a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzj;
        }
    }

    static {
        et0 et0 = new et0();
        zzk = et0;
        sy0.t(et0.class, et0);
    }

    private et0() {
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        Class<et0> cls = et0.class;
        switch (ct0.a[i - 1]) {
            case 1:
                return new et0();
            case 2:
                return new a((ct0) null);
            case 3:
                return sy0.r(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", b.zzb(), "zze", "zzf", "zzg", "zzh", "zzi", cls, "zzj"});
            case 4:
                return zzk;
            case 5:
                o01<et0> o01 = zzl;
                if (o01 == null) {
                    synchronized (cls) {
                        o01 = zzl;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzk);
                            zzl = o01;
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
