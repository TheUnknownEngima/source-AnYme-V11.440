package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.sy0;
import java.util.List;

/* renamed from: ss0  reason: default package */
public final class ss0 extends sy0<ss0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ss0 zzj;
    private static volatile o01<ss0> zzk;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private float zzg;
    private double zzh;
    private bz0<ss0> zzi = sy0.z();

    /* renamed from: ss0$a */
    public static final class a extends sy0.b<ss0, a> implements h01 {
        private a() {
            super(ss0.zzj);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a A(a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).V((ss0) ((sy0) aVar.k()));
            return this;
        }

        public final a B(Iterable<? extends ss0> iterable) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).K(iterable);
            return this;
        }

        public final a C(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).L(str);
            return this;
        }

        public final a D() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).h0();
            return this;
        }

        public final a G(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).Q(str);
            return this;
        }

        public final a H() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).i0();
            return this;
        }

        public final int I() {
            return ((ss0) this.f).d0();
        }

        public final a K() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).k0();
            return this;
        }

        public final a w() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).g0();
            return this;
        }

        public final a x(double d) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).A(d);
            return this;
        }

        public final a y(long j) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ss0) this.f).B(j);
            return this;
        }
    }

    static {
        ss0 ss0 = new ss0();
        zzj = ss0;
        sy0.t(ss0.class, ss0);
    }

    private ss0() {
    }

    /* access modifiers changed from: private */
    public final void A(double d) {
        this.zzc |= 16;
        this.zzh = d;
    }

    /* access modifiers changed from: private */
    public final void B(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* access modifiers changed from: private */
    public final void K(Iterable<? extends ss0> iterable) {
        j0();
        cx0.a(iterable, this.zzi);
    }

    /* access modifiers changed from: private */
    public final void L(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: private */
    public final void Q(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void V(ss0 ss0) {
        ss0.getClass();
        j0();
        this.zzi.add(ss0);
    }

    public static a e0() {
        return (a) zzj.v();
    }

    /* access modifiers changed from: private */
    public final void g0() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* access modifiers changed from: private */
    public final void h0() {
        this.zzc &= -5;
        this.zzf = 0;
    }

    /* access modifiers changed from: private */
    public final void i0() {
        this.zzc &= -17;
        this.zzh = Utils.DOUBLE_EPSILON;
    }

    private final void j0() {
        bz0<ss0> bz0 = this.zzi;
        if (!bz0.zza()) {
            this.zzi = sy0.o(bz0);
        }
    }

    /* access modifiers changed from: private */
    public final void k0() {
        this.zzi = sy0.z();
    }

    public final boolean M() {
        return (this.zzc & 1) != 0;
    }

    public final String N() {
        return this.zzd;
    }

    public final boolean S() {
        return (this.zzc & 2) != 0;
    }

    public final String T() {
        return this.zze;
    }

    public final boolean W() {
        return (this.zzc & 4) != 0;
    }

    public final long X() {
        return this.zzf;
    }

    public final boolean Y() {
        return (this.zzc & 8) != 0;
    }

    public final float Z() {
        return this.zzg;
    }

    public final boolean a0() {
        return (this.zzc & 16) != 0;
    }

    public final double b0() {
        return this.zzh;
    }

    public final List<ss0> c0() {
        return this.zzi;
    }

    public final int d0() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        Class<ss0> cls = ss0.class;
        switch (zs0.a[i - 1]) {
            case 1:
                return new ss0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
            case 4:
                return zzj;
            case 5:
                o01<ss0> o01 = zzk;
                if (o01 == null) {
                    synchronized (cls) {
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
