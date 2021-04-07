package defpackage;

import defpackage.js0;
import defpackage.sy0;
import java.util.Collections;
import java.util.List;

/* renamed from: ks0  reason: default package */
public final class ks0 extends sy0<ks0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ks0 zzm;
    private static volatile o01<ks0> zzn;
    private int zzc;
    private long zzd;
    private String zze = "";
    private int zzf;
    private bz0<ls0> zzg = sy0.z();
    private bz0<js0> zzh = sy0.z();
    private bz0<yr0> zzi = sy0.z();
    private String zzj = "";
    private boolean zzk;
    private bz0<dt0> zzl = sy0.z();

    /* renamed from: ks0$a */
    public static final class a extends sy0.b<ks0, a> implements h01 {
        private a() {
            super(ks0.zzm);
        }

        /* synthetic */ a(ns0 ns0) {
            this();
        }

        public final List<yr0> A() {
            return Collections.unmodifiableList(((ks0) this.f).M());
        }

        public final a B() {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ks0) this.f).R();
            return this;
        }

        public final int w() {
            return ((ks0) this.f).L();
        }

        public final js0 x(int i) {
            return ((ks0) this.f).A(i);
        }

        public final a y(int i, js0.a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ks0) this.f).B(i, (js0) ((sy0) aVar.k()));
            return this;
        }
    }

    static {
        ks0 ks0 = new ks0();
        zzm = ks0;
        sy0.t(ks0.class, ks0);
    }

    private ks0() {
    }

    /* access modifiers changed from: private */
    public final void B(int i, js0 js0) {
        js0.getClass();
        bz0<js0> bz0 = this.zzh;
        if (!bz0.zza()) {
            this.zzh = sy0.o(bz0);
        }
        this.zzh.set(i, js0);
    }

    public static a O() {
        return (a) zzm.v();
    }

    public static ks0 P() {
        return zzm;
    }

    /* access modifiers changed from: private */
    public final void R() {
        this.zzi = sy0.z();
    }

    public final js0 A(int i) {
        return this.zzh.get(i);
    }

    public final boolean F() {
        return (this.zzc & 1) != 0;
    }

    public final long G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzc & 2) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final List<ls0> K() {
        return this.zzg;
    }

    public final int L() {
        return this.zzh.size();
    }

    public final List<yr0> M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (ns0.a[i - 1]) {
            case 1:
                return new ks0();
            case 2:
                return new a((ns0) null);
            case 3:
                return sy0.r(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", ls0.class, "zzh", js0.class, "zzi", yr0.class, "zzj", "zzk", "zzl", dt0.class});
            case 4:
                return zzm;
            case 5:
                o01<ks0> o01 = zzn;
                if (o01 == null) {
                    synchronized (ks0.class) {
                        o01 = zzn;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzm);
                            zzn = o01;
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
