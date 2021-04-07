package defpackage;

import defpackage.sy0;

/* renamed from: js0  reason: default package */
public final class js0 extends sy0<js0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final js0 zzh;
    private static volatile o01<js0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* renamed from: js0$a */
    public static final class a extends sy0.b<js0, a> implements h01 {
        private a() {
            super(js0.zzh);
        }

        /* synthetic */ a(ns0 ns0) {
            this();
        }

        public final boolean A() {
            return ((js0) this.f).F();
        }

        public final boolean B() {
            return ((js0) this.f).G();
        }

        public final int C() {
            return ((js0) this.f).H();
        }

        public final a w(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((js0) this.f).C(str);
            return this;
        }

        public final String x() {
            return ((js0) this.f).A();
        }

        public final boolean y() {
            return ((js0) this.f).D();
        }
    }

    static {
        js0 js0 = new js0();
        zzh = js0;
        sy0.t(js0.class, js0);
    }

    private js0() {
    }

    /* access modifiers changed from: private */
    public final void C(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean D() {
        return this.zze;
    }

    public final boolean F() {
        return this.zzf;
    }

    public final boolean G() {
        return (this.zzc & 8) != 0;
    }

    public final int H() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (ns0.a[i - 1]) {
            case 1:
                return new js0();
            case 2:
                return new a((ns0) null);
            case 3:
                return sy0.r(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                o01<js0> o01 = zzi;
                if (o01 == null) {
                    synchronized (js0.class) {
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
