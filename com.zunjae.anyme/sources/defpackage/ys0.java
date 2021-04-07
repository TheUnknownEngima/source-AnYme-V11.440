package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.sy0;

/* renamed from: ys0  reason: default package */
public final class ys0 extends sy0<ys0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ys0 zzj;
    private static volatile o01<ys0> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* renamed from: ys0$a */
    public static final class a extends sy0.b<ys0, a> implements h01 {
        private a() {
            super(ys0.zzj);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a A(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).H(str);
            return this;
        }

        public final a B() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).b0();
            return this;
        }

        public final a C(long j) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).L(j);
            return this;
        }

        public final a D(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).P(str);
            return this;
        }

        public final a G() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).c0();
            return this;
        }

        public final a w() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).a0();
            return this;
        }

        public final a x(double d) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).A(d);
            return this;
        }

        public final a y(long j) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ys0) this.f).B(j);
            return this;
        }
    }

    static {
        ys0 ys0 = new ys0();
        zzj = ys0;
        sy0.t(ys0.class, ys0);
    }

    private ys0() {
    }

    /* access modifiers changed from: private */
    public final void A(double d) {
        this.zzc |= 32;
        this.zzi = d;
    }

    /* access modifiers changed from: private */
    public final void B(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void L(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* access modifiers changed from: private */
    public final void P(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    public static a Y() {
        return (a) zzj.v();
    }

    /* access modifiers changed from: private */
    public final void a0() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* access modifiers changed from: private */
    public final void b0() {
        this.zzc &= -9;
        this.zzg = 0;
    }

    /* access modifiers changed from: private */
    public final void c0() {
        this.zzc &= -33;
        this.zzi = Utils.DOUBLE_EPSILON;
    }

    public final boolean I() {
        return (this.zzc & 1) != 0;
    }

    public final long K() {
        return this.zzd;
    }

    public final String Q() {
        return this.zze;
    }

    public final boolean S() {
        return (this.zzc & 4) != 0;
    }

    public final String T() {
        return this.zzf;
    }

    public final boolean U() {
        return (this.zzc & 8) != 0;
    }

    public final long V() {
        return this.zzg;
    }

    public final boolean W() {
        return (this.zzc & 32) != 0;
    }

    public final double X() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new ys0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                o01<ys0> o01 = zzk;
                if (o01 == null) {
                    synchronized (ys0.class) {
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
