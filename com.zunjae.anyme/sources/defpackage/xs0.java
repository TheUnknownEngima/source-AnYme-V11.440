package defpackage;

import defpackage.sy0;
import java.util.List;

/* renamed from: xs0  reason: default package */
public final class xs0 extends sy0<xs0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final xs0 zzf;
    private static volatile o01<xs0> zzg;
    private int zzc;
    private int zzd;
    private cz0 zze = sy0.y();

    /* renamed from: xs0$a */
    public static final class a extends sy0.b<xs0, a> implements h01 {
        private a() {
            super(xs0.zzf);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a w(int i) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((xs0) this.f).H(i);
            return this;
        }

        public final a x(Iterable<? extends Long> iterable) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((xs0) this.f).D(iterable);
            return this;
        }
    }

    static {
        xs0 xs0 = new xs0();
        zzf = xs0;
        sy0.t(xs0.class, xs0);
    }

    private xs0() {
    }

    /* access modifiers changed from: private */
    public final void D(Iterable<? extends Long> iterable) {
        cz0 cz0 = this.zze;
        if (!cz0.zza()) {
            this.zze = sy0.p(cz0);
        }
        cx0.a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    public static a L() {
        return (a) zzf.v();
    }

    public final long A(int i) {
        return this.zze.e(i);
    }

    public final boolean F() {
        return (this.zzc & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final List<Long> I() {
        return this.zze;
    }

    public final int K() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new xs0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                o01<xs0> o01 = zzg;
                if (o01 == null) {
                    synchronized (xs0.class) {
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
