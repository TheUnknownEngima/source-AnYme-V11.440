package defpackage;

import defpackage.cl0;

/* renamed from: sc0  reason: default package */
public final class sc0 extends cl0<sc0, a> implements rm0 {
    private static volatile zm0<sc0> zzahx;
    /* access modifiers changed from: private */
    public static final sc0 zzajg;
    private int zzahj;
    private int zzaja;
    private int zzajb;
    private int zzajc;
    private int zzajd;
    private rc0 zzaje;
    private int zzajf;

    /* renamed from: sc0$a */
    public static final class a extends cl0.b<sc0, a> implements rm0 {
        private a() {
            super(sc0.zzajg);
        }

        /* synthetic */ a(qc0 qc0) {
            this();
        }
    }

    /* renamed from: sc0$b */
    public enum b implements fl0 {
        ERROR_UNKNOWN(0),
        ERROR_SETUP_DEVICE_NOT_SUPPORTED(1),
        ERROR_SETUP_GOOGLE_PLAY_SERVICES_UPDATE_REQUIRED(2),
        ERROR_SETUP_CONFIGURATION_REJECTED_BY_RECEIVER(3),
        ERROR_OPENGL_UNKNOWN_ERROR(4),
        ERROR_OPENGL_INITIALIZATION_ERROR(5),
        ERROR_OPENGL_CONTEXT_CREATION_ERROR(6),
        ERROR_OPENGL_SHADER_COMPILATION_ERROR(7),
        ERROR_OPENGL_SHADER_LINKING_ERROR(8),
        ERROR_OPENGL_RENDERING_ERROR(9),
        ERROR_OPENGL_TEXTURE_BINDING_ERROR(10),
        ERROR_OPENGL_SHUTDOWN_ERROR(11),
        ERROR_OPENGL_UNSUPPORTED_OPENGL_API_ERROR(12),
        ERROR_OPENGL_TEXTURE_CACHE_CREATION_ERROR(13),
        ERROR_OPENGL_LUMA_PASS_PIPELINE_CREATION_ERROR(14),
        ERROR_OPENGL_CHROMA_PASS_PIPELINE_CREATION_ERROR(15),
        ERROR_OPENGL_SHADER_DECOMPRESSION_ERROR(16),
        ERROR_OPENGL_PIXELBUFFER_CREATION_ERROR(17),
        ERROR_OPENGL_LUMA_TEXTURE_CACHE_CREATION_ERROR(18),
        ERROR_OPENGL_CHROMA_TEXTURE_CACHE_CREATION_ERROR(19),
        ERROR_OPENGL_MAKE_CURRENT_ERROR(20),
        ERROR_OPENGL_EGL_CONTEXT_ERROR(21),
        ERROR_OPENGL_EGL_BAD_NATIVE_SURFACE_ERROR(22),
        ERROR_METAL_UNKNOWN_ERROR(23),
        ERROR_METAL_TEXTURE_CACHE_CREATION_ERROR(24),
        ERROR_METAL_SHADER_DECOMPRESSION_ERROR(25),
        ERROR_METAL_SHADER_LOADING_ERROR(26),
        ERROR_METAL_BUFFER_ALLOCATION_ERROR(27),
        ERROR_METAL_LUMA_PASS_PIPELINE_CREATION_ERROR(28),
        ERROR_METAL_CHROMA_PASS_BUFFER_CREATION_ERROR(29),
        ERROR_METAL_CHROMA_PASS_TEXTURE_CREATION_ERROR(30),
        ERROR_METAL_CHROMA_PASS_PIPELINE_CREATION_ERROR(31),
        ERROR_METAL_PIXELBUFFER_CREATION_ERROR(32),
        ERROR_METAL_TEXTURE_CREATION_ERROR(33),
        ERROR_METAL_LUMA_RENDER_COMMAND_ENCODER_CREATION_ERROR(34),
        ERROR_METAL_CHROMA_RENDER_COMMAND_ENCODER_CREATION_ERROR(35),
        ERROR_METAL_COMMAND_BUFFER_EXECUTION_ERROR(36),
        ERROR_AUDIO_CONVERTER_CREATION_ERROR(37),
        ERROR_AUDIO_CONVERTER_PRIMEMETHOD_ERROR(38),
        ERROR_AUDIO_CONVERTER_CONVERSION_ERROR(39),
        ERROR_SETUP_FEATURE_NOT_SUPPORTED(40),
        ERROR_DUPLICATE_REQUEST(41),
        ERROR_PROTOCOL_ERROR(42);
        
        private static final il0<b> zzahh = null;
        private final int value;

        static {
            zzahh = new fd0();
        }

        private b(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return gd0.a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    /* renamed from: sc0$c */
    public enum c implements fl0 {
        PLUGIN_TYPE_UNKNOWN(0),
        PLUGIN_TYPE_UNITY_3D(1);
        
        private static final il0<c> zzahh = null;
        private final int value;

        static {
            zzahh = new jd0();
        }

        private c(int i) {
            this.value = i;
        }

        public static hl0 zzgk() {
            return id0.a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        public final int zzgj() {
            return this.value;
        }
    }

    static {
        sc0 sc0 = new sc0();
        zzajg = sc0;
        cl0.o(sc0.class, sc0);
    }

    private sc0() {
    }

    /* access modifiers changed from: protected */
    public final Object l(int i, Object obj, Object obj2) {
        switch (qc0.a[i - 1]) {
            case 1:
                return new sc0();
            case 2:
                return new a((qc0) null);
            case 3:
                return cl0.m(zzajg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzahj", "zzaja", "zzajb", c.zzgk(), "zzajc", "zzajd", "zzaje", "zzajf", b.zzgk()});
            case 4:
                return zzajg;
            case 5:
                zm0<sc0> zm0 = zzahx;
                if (zm0 == null) {
                    synchronized (sc0.class) {
                        zm0 = zzahx;
                        if (zm0 == null) {
                            zm0 = new cl0.a<>(zzajg);
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
