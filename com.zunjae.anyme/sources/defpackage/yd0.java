package defpackage;

/* renamed from: yd0  reason: default package */
public enum yd0 implements fl0 {
    RESULT_UNKNOWN(0),
    DECODE_SUCCESS(1),
    REQUEST_TIMED_OUT(2),
    USER_CANCELLED(3),
    USER_INTERRUPTED_AUDIO_PARING(4);
    
    private static final il0<yd0> zzahh = null;
    private final int value;

    static {
        zzahh = new be0();
    }

    private yd0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ae0.a;
    }

    public final String toString() {
        return "<" + yd0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
