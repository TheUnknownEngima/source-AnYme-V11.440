package defpackage;

/* renamed from: xd0  reason: default package */
public enum xd0 implements fl0 {
    BROADCAST_ERROR_UNKNOWN(0),
    BROADCAST_ERROR_ENCRYPTION_FAILED(1),
    BROADCAST_ERROR_SOCKET_ERROR(2),
    BROADCAST_ERROR_DROPPED(3),
    BROADCAST_ERROR_KEY_EXCHANGE_INVALID_INPUT(4),
    BROADCAST_ERROR_KEY_EXCHANGE_INVALID_RESPONSE(5),
    BROADCAST_ERROR_KEY_EXCHANGE_EMPTY_RESPONSE(6),
    BROADCAST_ERROR_KEY_EXCHANGE_FAILED_TO_FIND_DEVICE(7),
    BROADCAST_ERROR_KEY_EXCHANGE_FAILED_TO_CONNECT(8),
    BROADCAST_ERROR_KEY_EXCHANGE_REQUEST_TIMED_OUT(9);
    
    private static final il0<xd0> zzahh = null;
    private final int value;

    static {
        zzahh = new wd0();
    }

    private xd0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return zd0.a;
    }

    public final String toString() {
        return "<" + xd0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
