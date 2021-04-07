package defpackage;

import defpackage.sy0;
import defpackage.ws0;

/* renamed from: os0  reason: default package */
public final class os0 extends sy0<os0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final os0 zzh;
    private static volatile o01<os0> zzi;
    private int zzc;
    private int zzd;
    private ws0 zze;
    private ws0 zzf;
    private boolean zzg;

    /* renamed from: os0$a */
    public static final class a extends sy0.b<os0, a> implements h01 {
        private a() {
            super(os0.zzh);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a A(boolean z) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((os0) this.f).G(z);
            return this;
        }

        public final a w(int i) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((os0) this.f).A(i);
            return this;
        }

        public final a x(ws0.a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((os0) this.f).F((ws0) ((sy0) aVar.k()));
            return this;
        }

        public final a y(ws0 ws0) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((os0) this.f).L(ws0);
            return this;
        }
    }

    static {
        os0 os0 = new os0();
        zzh = os0;
        sy0.t(os0.class, os0);
    }

    private os0() {
    }

    /* access modifiers changed from: private */
    public final void A(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* access modifiers changed from: private */
    public final void F(ws0 ws0) {
        ws0.getClass();
        this.zze = ws0;
        this.zzc |= 2;
    }

    /* access modifiers changed from: private */
    public final void G(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* access modifiers changed from: private */
    public final void L(ws0 ws0) {
        ws0.getClass();
        this.zzf = ws0;
        this.zzc |= 4;
    }

    public static a R() {
        return (a) zzh.v();
    }

    public final boolean H() {
        return (this.zzc & 1) != 0;
    }

    public final int I() {
        return this.zzd;
    }

    public final ws0 M() {
        ws0 ws0 = this.zze;
        return ws0 == null ? ws0.b0() : ws0;
    }

    public final boolean N() {
        return (this.zzc & 4) != 0;
    }

    public final ws0 O() {
        ws0 ws0 = this.zzf;
        return ws0 == null ? ws0.b0() : ws0;
    }

    public final boolean P() {
        return (this.zzc & 8) != 0;
    }

    public final boolean Q() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new os0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                o01<os0> o01 = zzi;
                if (o01 == null) {
                    synchronized (os0.class) {
                        o01 = zzi;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzh);
                            zzi = o01;
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
