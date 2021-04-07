package defpackage;

import defpackage.ss0;
import defpackage.sy0;
import java.util.Collections;
import java.util.List;

/* renamed from: qs0  reason: default package */
public final class qs0 extends sy0<qs0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final qs0 zzi;
    private static volatile o01<qs0> zzj;
    private int zzc;
    private bz0<ss0> zzd = sy0.z();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* renamed from: qs0$a */
    public static final class a extends sy0.b<qs0, a> implements h01 {
        private a() {
            super(qs0.zzi);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a A(ss0.a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).N((ss0) ((sy0) aVar.k()));
            return this;
        }

        public final a B(ss0 ss0) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).N(ss0);
            return this;
        }

        public final a C(Iterable<? extends ss0> iterable) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).O(iterable);
            return this;
        }

        public final a D(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).P(str);
            return this;
        }

        public final ss0 G(int i) {
            return ((qs0) this.f).A(i);
        }

        public final List<ss0> H() {
            return Collections.unmodifiableList(((qs0) this.f).B());
        }

        public final int I() {
            return ((qs0) this.f).Q();
        }

        public final a K(int i) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).R(i);
            return this;
        }

        public final a L(long j) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).S(j);
            return this;
        }

        public final a O() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).e0();
            return this;
        }

        public final String P() {
            return ((qs0) this.f).U();
        }

        public final long R() {
            return ((qs0) this.f).W();
        }

        public final long S() {
            return ((qs0) this.f).Y();
        }

        public final a w(int i, ss0.a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).C(i, (ss0) ((sy0) aVar.k()));
            return this;
        }

        public final a x(int i, ss0 ss0) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).C(i, ss0);
            return this;
        }

        public final a y(long j) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((qs0) this.f).D(j);
            return this;
        }
    }

    static {
        qs0 qs0 = new qs0();
        zzi = qs0;
        sy0.t(qs0.class, qs0);
    }

    private qs0() {
    }

    /* access modifiers changed from: private */
    public final void C(int i, ss0 ss0) {
        ss0.getClass();
        d0();
        this.zzd.set(i, ss0);
    }

    /* access modifiers changed from: private */
    public final void D(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* access modifiers changed from: private */
    public final void N(ss0 ss0) {
        ss0.getClass();
        d0();
        this.zzd.add(ss0);
    }

    /* access modifiers changed from: private */
    public final void O(Iterable<? extends ss0> iterable) {
        d0();
        cx0.a(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    public final void P(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void R(int i) {
        d0();
        this.zzd.remove(i);
    }

    /* access modifiers changed from: private */
    public final void S(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    public static a b0() {
        return (a) zzi.v();
    }

    private final void d0() {
        bz0<ss0> bz0 = this.zzd;
        if (!bz0.zza()) {
            this.zzd = sy0.o(bz0);
        }
    }

    /* access modifiers changed from: private */
    public final void e0() {
        this.zzd = sy0.z();
    }

    public final ss0 A(int i) {
        return this.zzd.get(i);
    }

    public final List<ss0> B() {
        return this.zzd;
    }

    public final int Q() {
        return this.zzd.size();
    }

    public final String U() {
        return this.zze;
    }

    public final boolean V() {
        return (this.zzc & 2) != 0;
    }

    public final long W() {
        return this.zzf;
    }

    public final boolean X() {
        return (this.zzc & 4) != 0;
    }

    public final long Y() {
        return this.zzg;
    }

    public final boolean Z() {
        return (this.zzc & 8) != 0;
    }

    public final int a0() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new qs0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", ss0.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                o01<qs0> o01 = zzj;
                if (o01 == null) {
                    synchronized (qs0.class) {
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
