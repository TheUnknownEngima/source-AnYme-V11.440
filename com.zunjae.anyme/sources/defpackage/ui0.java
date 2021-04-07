package defpackage;

import defpackage.cl0;

/* renamed from: ui0  reason: default package */
public final class ui0 extends cl0<ui0, a> implements rm0 {
    private static volatile zm0<ui0> zzahx;
    /* access modifiers changed from: private */
    public static final ui0 zzbga;
    private int zzahj;
    private bj0 zzbfq;
    private boolean zzbfr;
    private long zzbfs;
    private int zzbft;
    private int zzbfu;
    private int zzbfv;
    private int zzbfw;
    private int zzbfx;
    private ii0 zzbfy;
    private int zzbfz;

    /* renamed from: ui0$a */
    public static final class a extends cl0.b<ui0, a> implements rm0 {
        private a() {
            super(ui0.zzbga);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }

        public final a s(bj0 bj0) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((ui0) this.f).C(bj0);
            return this;
        }

        public final a t(int i) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((ui0) this.f).z(i);
            return this;
        }

        public final a u(int i) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((ui0) this.f).A(i);
            return this;
        }

        public final a v(long j) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((ui0) this.f).H(j);
            return this;
        }

        public final a w(boolean z) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((ui0) this.f).I(z);
            return this;
        }
    }

    static {
        ui0 ui0 = new ui0();
        zzbga = ui0;
        cl0.o(ui0.class, ui0);
    }

    private ui0() {
    }

    /* access modifiers changed from: private */
    public final void A(int i) {
        this.zzahj |= 128;
        this.zzbfx = i;
    }

    /* access modifiers changed from: private */
    public final void C(bj0 bj0) {
        bj0.getClass();
        this.zzbfq = bj0;
        this.zzahj |= 1;
    }

    public static a D() {
        return (a) zzbga.q();
    }

    public static ui0 E() {
        return zzbga;
    }

    /* access modifiers changed from: private */
    public final void H(long j) {
        this.zzahj |= 4;
        this.zzbfs = j;
    }

    /* access modifiers changed from: private */
    public final void I(boolean z) {
        this.zzahj |= 2;
        this.zzbfr = z;
    }

    public static a u(ui0 ui0) {
        return (a) zzbga.j(ui0);
    }

    /* access modifiers changed from: private */
    public final void z(int i) {
        this.zzahj |= 64;
        this.zzbfw = i;
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ui0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbga, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t", new Object[]{"zzahj", "zzbfq", "zzbfr", "zzbfs", "zzbft", "zzbfu", rd0.zzgk(), "zzbfv", md0.zzgk(), "zzbfw", "zzbfx", "zzbfy", "zzbfz", qe0.zzgk()});
            case 4:
                return zzbga;
            case 5:
                zm0<ui0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ui0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbga);
                            zzahx = zm0;
                        }
                    }
                }
                return zm0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
