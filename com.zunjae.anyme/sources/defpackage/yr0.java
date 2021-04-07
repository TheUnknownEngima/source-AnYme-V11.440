package defpackage;

import defpackage.cs0;
import defpackage.sy0;
import defpackage.zr0;
import java.util.List;

/* renamed from: yr0  reason: default package */
public final class yr0 extends sy0<yr0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final yr0 zzi;
    private static volatile o01<yr0> zzj;
    private int zzc;
    private int zzd;
    private bz0<cs0> zze = sy0.z();
    private bz0<zr0> zzf = sy0.z();
    private boolean zzg;
    private boolean zzh;

    /* renamed from: yr0$a */
    public static final class a extends sy0.b<yr0, a> implements h01 {
        private a() {
            super(yr0.zzi);
        }

        /* synthetic */ a(es0 es0) {
            this();
        }

        public final cs0 A(int i) {
            return ((yr0) this.f).A(i);
        }

        public final int B() {
            return ((yr0) this.f).N();
        }

        public final zr0 C(int i) {
            return ((yr0) this.f).I(i);
        }

        public final int w() {
            return ((yr0) this.f).L();
        }

        public final a x(int i, zr0.a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((yr0) this.f).B(i, (zr0) ((sy0) aVar.k()));
            return this;
        }

        public final a y(int i, cs0.a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((yr0) this.f).C(i, (cs0) ((sy0) aVar.k()));
            return this;
        }
    }

    static {
        yr0 yr0 = new yr0();
        zzi = yr0;
        sy0.t(yr0.class, yr0);
    }

    private yr0() {
    }

    /* access modifiers changed from: private */
    public final void B(int i, zr0 zr0) {
        zr0.getClass();
        bz0<zr0> bz0 = this.zzf;
        if (!bz0.zza()) {
            this.zzf = sy0.o(bz0);
        }
        this.zzf.set(i, zr0);
    }

    /* access modifiers changed from: private */
    public final void C(int i, cs0 cs0) {
        cs0.getClass();
        bz0<cs0> bz0 = this.zze;
        if (!bz0.zza()) {
            this.zze = sy0.o(bz0);
        }
        this.zze.set(i, cs0);
    }

    public final cs0 A(int i) {
        return this.zze.get(i);
    }

    public final boolean G() {
        return (this.zzc & 1) != 0;
    }

    public final int H() {
        return this.zzd;
    }

    public final zr0 I(int i) {
        return this.zzf.get(i);
    }

    public final List<cs0> K() {
        return this.zze;
    }

    public final int L() {
        return this.zze.size();
    }

    public final List<zr0> M() {
        return this.zzf;
    }

    public final int N() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (es0.a[i - 1]) {
            case 1:
                return new yr0();
            case 2:
                return new a((es0) null);
            case 3:
                return sy0.r(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", cs0.class, "zzf", zr0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                o01<yr0> o01 = zzj;
                if (o01 == null) {
                    synchronized (yr0.class) {
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
