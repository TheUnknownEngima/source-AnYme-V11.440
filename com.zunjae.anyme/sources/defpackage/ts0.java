package defpackage;

import defpackage.sy0;
import defpackage.us0;
import java.util.List;

/* renamed from: ts0  reason: default package */
public final class ts0 extends sy0<ts0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final ts0 zzd;
    private static volatile o01<ts0> zze;
    private bz0<us0> zzc = sy0.z();

    /* renamed from: ts0$a */
    public static final class a extends sy0.b<ts0, a> implements h01 {
        private a() {
            super(ts0.zzd);
        }

        /* synthetic */ a(zs0 zs0) {
            this();
        }

        public final a w(us0.a aVar) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((ts0) this.f).D((us0) ((sy0) aVar.k()));
            return this;
        }

        public final us0 x(int i) {
            return ((ts0) this.f).A(0);
        }
    }

    static {
        ts0 ts0 = new ts0();
        zzd = ts0;
        sy0.t(ts0.class, ts0);
    }

    private ts0() {
    }

    /* access modifiers changed from: private */
    public final void D(us0 us0) {
        us0.getClass();
        bz0<us0> bz0 = this.zzc;
        if (!bz0.zza()) {
            this.zzc = sy0.o(bz0);
        }
        this.zzc.add(us0);
    }

    public static a F() {
        return (a) zzd.v();
    }

    public final us0 A(int i) {
        return this.zzc.get(0);
    }

    public final List<us0> B() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (zs0.a[i - 1]) {
            case 1:
                return new ts0();
            case 2:
                return new a((zs0) null);
            case 3:
                return sy0.r(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", us0.class});
            case 4:
                return zzd;
            case 5:
                o01<ts0> o01 = zze;
                if (o01 == null) {
                    synchronized (ts0.class) {
                        o01 = zze;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzd);
                            zze = o01;
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
