package defpackage;

import defpackage.sy0;

/* renamed from: ps0  reason: default package */
public final class ps0 extends sy0<ps0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ps0 zzf;
    private static volatile o01<ps0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* renamed from: ps0$a */
    public static final class a extends sy0.b<ps0, a> implements h01 {
        private a() {
            super(ps0.zzf);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a w(int i) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ps0) this.f).A(i);
            return this;
        }

        public final a x(long j) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ps0) this.f).B(j);
            return this;
        }
    }

    static {
        ps0 ps0 = new ps0();
        zzf = ps0;
        sy0.t(ps0.class, ps0);
    }

    private ps0() {
    }

    /* access modifiers changed from: private */
    public final void A(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* access modifiers changed from: private */
    public final void B(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    public static a K() {
        return (a) zzf.v();
    }

    public final boolean F() {
        return (this.zzc & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzc & 2) != 0;
    }

    public final long I() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new ps0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                o01<ps0> o01 = zzg;
                if (o01 == null) {
                    synchronized (ps0.class) {
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
