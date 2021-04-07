package defpackage;

import defpackage.sy0;

/* renamed from: rs0  reason: default package */
public final class rs0 extends sy0<rs0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final rs0 zzf;
    private static volatile o01<rs0> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* renamed from: rs0$a */
    public static final class a extends sy0.b<rs0, a> implements h01 {
        private a() {
            super(rs0.zzf);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }
    }

    static {
        rs0 rs0 = new rs0();
        zzf = rs0;
        sy0.t(rs0.class, rs0);
    }

    private rs0() {
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new rs0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                o01<rs0> o01 = zzg;
                if (o01 == null) {
                    synchronized (rs0.class) {
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
