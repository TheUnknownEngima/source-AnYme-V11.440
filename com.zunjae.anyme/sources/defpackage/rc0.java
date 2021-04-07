package defpackage;

import defpackage.cl0;

/* renamed from: rc0  reason: default package */
public final class rc0 extends cl0<rc0, c> implements rm0 {
    /* access modifiers changed from: private */
    public static final rc0 zzahw;
    private static volatile zm0<rc0> zzahx;
    private int zzahj;
    private int zzahk;
    private int zzahl;
    private int zzahm;
    private int zzahn;
    private int zzaho;
    private int zzahp;
    private int zzahq;
    private int zzahr;
    private int zzahs;
    private int zzaht;
    private int zzahu;
    private boolean zzahv;

    /* renamed from: rc0$a */
    public enum a implements fl0 {
        AUDIO_FORMAT_UNKNOWN(0),
        AUDIO_FORMAT_AV_AUDIO_PCM_FLOAT_32(1),
        AUDIO_FORMAT_AV_AUDIO_PCM_FLOAT_64(2),
        AUDIO_FORMAT_AV_AUDIO_PCM_INT_16(3),
        AUDIO_FORMAT_AV_AUDIO_PCM_INT_32(4);
        
        private static final il0<a> zzahh = null;
        private final int value;

        static {
            zzahh = new uc0();
        }

        private a(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return tc0.a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    /* renamed from: rc0$b */
    public enum b implements fl0 {
        BITRATE_MODE_UNKNOWN(0),
        BITRATE_MODE_FIXED(1),
        BITRATE_MODE_ADAPTIVE(2);
        
        private static final il0<b> zzahh = null;
        private final int value;

        static {
            zzahh = new vc0();
        }

        private b(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return wc0.a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    /* renamed from: rc0$c */
    public static final class c extends cl0.b<rc0, c> implements rm0 {
        private c() {
            super(rc0.zzahw);
        }

        /* synthetic */ c(qc0 qc0) {
            this();
        }
    }

    /* renamed from: rc0$d */
    public enum d implements fl0 {
        RENDER_BACKEND_UNKNOWN(0),
        RENDER_BACKEND_OPENGL_ES_2(1),
        RENDER_BACKEND_OPENGL_ES_3(2),
        RENDER_BACKEND_METAL(3);
        
        private static final il0<d> zzahh = null;
        private final int value;

        static {
            zzahh = new xc0();
        }

        private d(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return yc0.a;
        }

        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    /* renamed from: rc0$e */
    public enum e implements fl0 {
        RENDER_TARGET_UNKNOWN(0),
        RENDER_TARGET_CAMERA(1),
        RENDER_TARGET_RENDER_TEXTURE_SET_ON_CAMERA(2),
        RENDER_TARGET_RENDER_TEXTURE(3);
        
        private static final il0<e> zzahh = null;
        private final int value;

        static {
            zzahh = new ad0();
        }

        private e(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return zc0.a;
        }

        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    /* renamed from: rc0$f */
    public enum f implements fl0 {
        TARGET_DELAY_UNKNOWN(0),
        TARGET_DELAY_MINIMUM(1),
        TARGET_DELAY_LOW(2),
        TARGET_DELAY_NORMAL(3),
        TARGET_DELAY_HIGH(4);
        
        private static final il0<f> zzahh = null;
        private final int value;

        static {
            zzahh = new bd0();
        }

        private f(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return cd0.a;
        }

        public final String toString() {
            return "<" + f.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    /* renamed from: rc0$g */
    public enum g implements fl0 {
        TARGET_FPS_UNKNOWN(0),
        TARGET_FPS_15(1),
        TARGET_FPS_24(2),
        TARGET_FPS_25(3),
        TARGET_FPS_30(4),
        TARGET_FPS_60(5);
        
        private static final il0<g> zzahh = null;
        private final int value;

        static {
            zzahh = new ed0();
        }

        private g(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return dd0.a;
        }

        public final String toString() {
            return "<" + g.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    static {
        rc0 rc0 = new rc0();
        zzahw = rc0;
        cl0.o(rc0.class, rc0);
    }

    private rc0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (qc0.a[i - 1]) {
            case 1:
                return new rc0();
            case 2:
                return new c((qc0) null);
            case 3:
                return cl0.m(zzahw, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tင\b\nင\t\u000bင\n\fဇ\u000b", new Object[]{"zzahj", "zzahk", "zzahl", "zzahm", d.zzgk(), "zzahn", e.zzgk(), "zzaho", b.zzgk(), "zzahp", f.zzgk(), "zzahq", g.zzgk(), "zzahr", a.zzgk(), "zzahs", "zzaht", "zzahu", "zzahv"});
            case 4:
                return zzahw;
            case 5:
                zm0<rc0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (rc0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzahw);
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
