package defpackage;

import defpackage.sy0;
import java.util.List;

/* renamed from: zr0  reason: default package */
public final class zr0 extends sy0<zr0, a> implements h01 {
    /* access modifiers changed from: private */
    public static final zr0 zzl;
    private static volatile o01<zr0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private bz0<as0> zzf = sy0.z();
    private boolean zzg;
    private bs0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* renamed from: zr0$a */
    public static final class a extends sy0.b<zr0, a> implements h01 {
        private a() {
            super(zr0.zzl);
        }

        /* synthetic */ a(es0 es0) {
            this();
        }

        public final String A() {
            return ((zr0) this.f).I();
        }

        public final int B() {
            return ((zr0) this.f).L();
        }

        public final a w(int i, as0 as0) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((zr0) this.f).B(i, as0);
            return this;
        }

        public final a x(String str) {
            if (this.g) {
                t();
                this.g = false;
            }
            ((zr0) this.f).F(str);
            return this;
        }

        public final as0 y(int i) {
            return ((zr0) this.f).A(i);
        }
    }

    static {
        zr0 zr0 = new zr0();
        zzl = zr0;
        sy0.t(zr0.class, zr0);
    }

    private zr0() {
    }

    /* access modifiers changed from: private */
    public final void B(int i, as0 as0) {
        as0.getClass();
        bz0<as0> bz0 = this.zzf;
        if (!bz0.zza()) {
            this.zzf = sy0.o(bz0);
        }
        this.zzf.set(i, as0);
    }

    /* access modifiers changed from: private */
    public final void F(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a S() {
        return (a) zzl.v();
    }

    public final as0 A(int i) {
        return this.zzf.get(i);
    }

    public final boolean G() {
        return (this.zzc & 1) != 0;
    }

    public final int H() {
        return this.zzd;
    }

    public final String I() {
        return this.zze;
    }

    public final List<as0> K() {
        return this.zzf;
    }

    public final int L() {
        return this.zzf.size();
    }

    public final boolean M() {
        return (this.zzc & 8) != 0;
    }

    public final bs0 N() {
        bs0 bs0 = this.zzh;
        return bs0 == null ? bs0.M() : bs0;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return (this.zzc & 64) != 0;
    }

    public final boolean R() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final Object q(int i, Object obj, Object obj2) {
        switch (es0.a[i - 1]) {
            case 1:
                return new zr0();
            case 2:
                return new a((es0) null);
            case 3:
                return sy0.r(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", as0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                o01<zr0> o01 = zzm;
                if (o01 == null) {
                    synchronized (zr0.class) {
                        o01 = zzm;
                        if (o01 == null) {
                            o01 = new sy0.a<>(zzl);
                            zzm = o01;
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
