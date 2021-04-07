package defpackage;

/* renamed from: xg0  reason: default package */
public enum xg0 implements fl0 {
    SEND_MESSAGE_RESULT_UNKNOWN(0),
    SEND_MESSAGE_RESULT_SUCCESS(1),
    SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST(2),
    SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL(3),
    SEND_MESSAGE_RESULT_FAIL_MESSAGE_TOO_LARGE(4),
    SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR(5);
    
    private static final il0<xg0> zzahh = null;
    private final int value;

    static {
        zzahh = new ah0();
    }

    private xg0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return zg0.a;
    }

    public final String toString() {
        return "<" + xg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
