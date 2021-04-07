package defpackage;

/* renamed from: re0  reason: default package */
public enum re0 implements fl0 {
    DEVICE_DISCONNECT_REASON_UNKNOWN(0),
    STATUS_ERROR_NETWORK(1),
    STATUS_ERROR_HEARTBEAT_TIMEOUT(2),
    STATUS_EXPLICIT_DISCONNECT(3),
    STATUS_IMPLICIT_DISCONNECT(4);
    
    private static final il0<re0> zzahh = null;
    private final int value;

    static {
        zzahh = new ue0();
    }

    private re0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return te0.a;
    }

    public final String toString() {
        return "<" + re0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
