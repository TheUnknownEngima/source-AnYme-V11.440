package defpackage;

import defpackage.sy0;

/* renamed from: vs0  reason: default package */
public final class vs0 extends sy0<vs0, b> implements h01 {
    /* access modifiers changed from: private */
    public static final vs0 zzf;
    private static volatile o01<vs0> zzg;
    private int zzc;
    private int zzd = 1;
    private bz0<rs0> zze = sy0.z();

    /* renamed from: vs0$a */
    public enum a implements yy0 {
        RADS(1),
        PROVISIONING(2);
        
        private static final wy0<a> zzc = null;
        private final int zzd;

        static {
            zzc = new bt0();
        }

        private a(int i) {
            this.zzd = i;
        }

        public static a zza(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static az0 zzb() {
            return at0.a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzd;
        }
    }

    /* renamed from: vs0$b */
    public static final class b extends sy0.b<vs0, b> implements h01 {
        private b() {
            super(vs0.zzf);
        }

        /* synthetic */ b(zs0 zs0) {
            this();
        }
    }

    static {
        vs0 vs0 = new vs0();
        zzf = vs0;
        sy0.t(vs0.class, vs0);
    }

    private vs0() {
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new vs0();
            case 2:
                return new b((zs0) null);
            case 3:
                return sy0.r(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", a.zzb(), "zze", rs0.class});
            case 4:
                return zzf;
            case 5:
                o01<vs0> o01 = zzg;
                if (o01 == null) {
                    synchronized (vs0.class) {
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
