package defpackage;

import defpackage.cl0;

/* renamed from: bj0  reason: default package */
public final class bj0 extends cl0<bj0, a> implements rm0 {
    private static volatile zm0<bj0> zzahx;
    /* access modifiers changed from: private */
    public static final bj0 zzbiy;
    private int zzahj;
    private String zzbiw = "";
    private String zzbix = "";

    /* renamed from: bj0$a */
    public static final class a extends cl0.b<bj0, a> implements rm0 {
        private a() {
            super(bj0.zzbiy);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }

        public final a s(String str) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((bj0) this.f).v(str);
            return this;
        }
    }

    static {
        bj0 bj0 = new bj0();
        zzbiy = bj0;
        cl0.o(bj0.class, bj0);
    }

    private bj0() {
    }

    /* access modifiers changed from: private */
    public final void v(String str) {
        str.getClass();
        this.zzahj |= 1;
        this.zzbiw = str;
    }

    public static a w() {
        return (a) zzbiy.q();
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new bj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbiy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbiw", "zzbix"});
            case 4:
                return zzbiy;
            case 5:
                zm0<bj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (bj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbiy);
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
