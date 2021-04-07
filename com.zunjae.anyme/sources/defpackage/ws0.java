package defpackage;

import defpackage.sy0;
import java.util.List;

/* renamed from: ws0  reason: default package */
public final class ws0 extends sy0<ws0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ws0 zzg;
    private static volatile o01<ws0> zzh;
    private cz0 zzc = sy0.y();
    private cz0 zzd = sy0.y();
    private bz0<ps0> zze = sy0.z();
    private bz0<xs0> zzf = sy0.z();

    /* renamed from: ws0$a */
    public static final class a extends sy0.b<ws0, a> implements h01 {
        private a() {
            super(ws0.zzg);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a A() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).e0();
            return this;
        }

        public final a B(int i) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).W(i);
            return this;
        }

        public final a C(Iterable<? extends Long> iterable) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).N(iterable);
            return this;
        }

        public final a D(Iterable<? extends ps0> iterable) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).Q(iterable);
            return this;
        }

        public final a G(Iterable<? extends xs0> iterable) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).U(iterable);
            return this;
        }

        public final a w() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).d0();
            return this;
        }

        public final a x(int i) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).S(i);
            return this;
        }

        public final a y(Iterable<? extends Long> iterable) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ws0) this.f).G(iterable);
            return this;
        }
    }

    static {
        ws0 ws0 = new ws0();
        zzg = ws0;
        sy0.t(ws0.class, ws0);
    }

    private ws0() {
    }

    /* access modifiers changed from: private */
    public final void G(Iterable<? extends Long> iterable) {
        cz0 cz0 = this.zzc;
        if (!cz0.zza()) {
            this.zzc = sy0.p(cz0);
        }
        cx0.a(iterable, this.zzc);
    }

    /* access modifiers changed from: private */
    public final void N(Iterable<? extends Long> iterable) {
        cz0 cz0 = this.zzd;
        if (!cz0.zza()) {
            this.zzd = sy0.p(cz0);
        }
        cx0.a(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    public final void Q(Iterable<? extends ps0> iterable) {
        f0();
        cx0.a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    public final void S(int i) {
        f0();
        this.zze.remove(i);
    }

    /* access modifiers changed from: private */
    public final void U(Iterable<? extends xs0> iterable) {
        g0();
        cx0.a(iterable, this.zzf);
    }

    /* access modifiers changed from: private */
    public final void W(int i) {
        g0();
        this.zzf.remove(i);
    }

    public static a a0() {
        return (a) zzg.v();
    }

    public static ws0 b0() {
        return zzg;
    }

    /* access modifiers changed from: private */
    public final void d0() {
        this.zzc = sy0.y();
    }

    /* access modifiers changed from: private */
    public final void e0() {
        this.zzd = sy0.y();
    }

    private final void f0() {
        bz0<ps0> bz0 = this.zze;
        if (!bz0.zza()) {
            this.zze = sy0.o(bz0);
        }
    }

    private final void g0() {
        bz0<xs0> bz0 = this.zzf;
        if (!bz0.zza()) {
            this.zzf = sy0.o(bz0);
        }
    }

    public final ps0 A(int i) {
        return this.zze.get(i);
    }

    public final List<Long> B() {
        return this.zzc;
    }

    public final int H() {
        return this.zzc.size();
    }

    public final xs0 I(int i) {
        return this.zzf.get(i);
    }

    public final List<Long> O() {
        return this.zzd;
    }

    public final int R() {
        return this.zzd.size();
    }

    public final List<ps0> V() {
        return this.zze;
    }

    public final int X() {
        return this.zze.size();
    }

    public final List<xs0> Y() {
        return this.zzf;
    }

    public final int Z() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new ws0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", ps0.class, "zzf", xs0.class});
            case 4:
                return zzg;
            case 5:
                o01<ws0> o01 = zzh;
                if (o01 == null) {
                    synchronized (ws0.class) {
                        o01 = zzh;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzg);
                            zzh = o01;
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
