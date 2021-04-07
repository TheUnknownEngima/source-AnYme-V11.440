package defpackage;

import defpackage.cl0;

/* renamed from: ti0  reason: default package */
public final class ti0 extends cl0<ti0, a> implements rm0 {
    private static volatile zm0<ti0> zzahx;
    /* access modifiers changed from: private */
    public static final ti0 zzbfp;
    private int zzahj;
    private String zzbfn = "";
    private String zzbfo = "";

    /* renamed from: ti0$a */
    public static final class a extends cl0.b<ti0, a> implements rm0 {
        private a() {
            super(ti0.zzbfp);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }

        public final a s(String str) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((ti0) this.f).v(str);
            return this;
        }

        public final a t(String str) {
            if (this.g) {
                p();
                this.g = false;
            }
            ((ti0) this.f).w(str);
            return this;
        }
    }

    static {
        ti0 ti0 = new ti0();
        zzbfp = ti0;
        cl0.o(ti0.class, ti0);
    }

    private ti0() {
    }

    /* access modifiers changed from: private */
    public final void v(String str) {
        str.getClass();
        this.zzahj |= 1;
        this.zzbfn = str;
    }

    /* access modifiers changed from: private */
    public final void w(String str) {
        str.getClass();
        this.zzahj |= 2;
        this.zzbfo = str;
    }

    public static a y() {
        return (a) zzbfp.q();
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new ti0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbfp, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbfn", "zzbfo"});
            case 4:
                return zzbfp;
            case 5:
                zm0<ti0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (ti0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbfp);
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
