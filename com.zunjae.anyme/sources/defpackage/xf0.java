package defpackage;

/* renamed from: xf0  reason: default package */
public enum xf0 implements fl0 {
    MDNS_RESPONSE_ERROR_UNKNOWN(0),
    ERROR_NOT_RESPONSE_MESSAGE(1),
    ERROR_NO_ANSWERS(2),
    ERROR_READING_RESPONSE_LABELS(3),
    ERROR_READING_IP4_ADDRESS(4),
    ERROR_READING_IP6_ADDRESS(5),
    ERROR_READING_POINTER_RECORD(6),
    ERROR_SKIPPING_POINTER_RECORD(7),
    ERROR_READING_SERVICE_RECORD(8),
    ERROR_SKIPPING_SERVICE_RECORD(9),
    ERROR_READING_TEXT_RECORD(10),
    ERROR_SKIPPING_UNKNOWN_RECORD(11),
    ERROR_END_OF_FILE(12);
    
    private static final il0<xf0> zzahh = null;
    private final int value;

    static {
        zzahh = new wf0();
    }

    private xf0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return zf0.a;
    }

    public final String toString() {
        return "<" + xf0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
