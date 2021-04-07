package defpackage;

import defpackage.cl0;

/* renamed from: qi0  reason: default package */
public final class qi0 extends cl0<qi0, a> implements rm0 {
    private static volatile zm0<qi0> zzahx;
    private static final jl0<Integer, vh0> zzbex = new qj0();
    /* access modifiers changed from: private */
    public static final qi0 zzbey;
    private int zzahj;
    private ti0 zzbet;
    private mj0 zzbeu;
    private ll0<kj0> zzbev = cl0.t();
    private kl0 zzbew = cl0.r();

    /* renamed from: qi0$a */
    public static final class a extends cl0.b<qi0, a> implements rm0 {
        private a() {
            super(qi0.zzbey);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }

        public final a s(ti0 ti0) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((qi0) this.f).w(ti0);
            return this;
        }

        public final a t(Iterable<? extends vh0> iterable) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((qi0) this.f).x(iterable);
            return this;
        }
    }

    static {
        qi0 qi0 = new qi0();
        zzbey = qi0;
        cl0.o(qi0.class, qi0);
    }

    private qi0() {
    }

    /* access modifiers changed from: private */
    public final void w(ti0 ti0) {
        ti0.getClass();
        this.zzbet = ti0;
        this.zzahj |= 1;
    }

    /* access modifiers changed from: private */
    public final void x(Iterable<? extends vh0> iterable) {
        kl0 kl0 = this.zzbew;
        if (!kl0.T()) {
            int size = kl0.size();
            this.zzbew = kl0.H(size == 0 ? 10 : size << 1);
        }
        for (vh0 zzgj : iterable) {
            this.zzbew.S(zzgj.zzgj());
        }
    }

    public static a y() {
        return (a) zzbey.q();
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new qi0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbey, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzahj", "zzbet", "zzbeu", "zzbev", kj0.class, "zzbew", vh0.zzgk()});
            case 4:
                return zzbey;
            case 5:
                zm0<qi0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (qi0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbey);
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
