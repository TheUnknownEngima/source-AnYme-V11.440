package defpackage;

import defpackage.cl0;

/* renamed from: cj0  reason: default package */
public final class cj0 extends cl0<cj0, a> implements rm0 {
    private static volatile zm0<cj0> zzahx;
    /* access modifiers changed from: private */
    public static final cj0 zzbjd;
    private int zzahj;
    private int zzbiz;
    private int zzbja;
    private int zzbjb;
    private ll0<b> zzbjc = cl0.t();

    /* renamed from: cj0$a */
    public static final class a extends cl0.b<cj0, a> implements rm0 {
        private a() {
            super(cj0.zzbjd);
        }

        /* synthetic */ a(ai0 ai0) {
            this();
        }
    }

    /* renamed from: cj0$b */
    public static final class b extends cl0<b, a> implements rm0 {
        private static volatile zm0<b> zzahx;
        /* access modifiers changed from: private */
        public static final b zzbji;
        private int zzahj;
        private int zzbje;
        private int zzbjf;
        private int zzbjg;
        private int zzbjh;

        /* renamed from: cj0$b$a */
        public static final class a extends cl0.b<b, a> implements rm0 {
            private a() {
                super(b.zzbji);
            }

            /* synthetic */ a(ai0 ai0) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzbji = bVar;
            cl0.o(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        public final Object l(int i, Object obj, Object obj2) {
            switch (ai0.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((ai0) null);
                case 3:
                    return cl0.m(zzbji, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzahj", "zzbje", "zzbjf", "zzbjg", "zzbjh"});
                case 4:
                    return zzbji;
                case 5:
                    zm0<b> zm0 = zzahx;
                    if (zm0 == null) {
                        synchronized (b.class) {
                            zm0 = zzahx;
                            if (zm0 == null) {
                                zm0 = new cl0.a<>(zzbji);
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

    static {
        cj0 cj0 = new cj0();
        zzbjd = cj0;
        cl0.o(cj0.class, cj0);
    }

    private cj0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (ai0.a[i - 1]) {
            case 1:
                return new cj0();
            case 2:
                return new a((ai0) null);
            case 3:
                return cl0.m(zzbjd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzahj", "zzbiz", "zzbja", "zzbjb", "zzbjc", b.class});
            case 4:
                return zzbjd;
            case 5:
                zm0<cj0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (cj0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzbjd);
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
