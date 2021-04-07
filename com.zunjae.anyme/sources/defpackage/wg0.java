package defpackage;

/* renamed from: wg0  reason: default package */
public enum wg0 implements fl0 {
    REMOTE_CONTROL_NOTIFICATION_FAILURE_UNKNOWN(0),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_CONNECT(1),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_JOIN_APPLICATION(2),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_DEVICE_STATUS(3),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_MEDIA_STATUS(4),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_SET_MEDIA_NAMESPACE_CALLBACK(5),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_REQUEST_RECEIVER_STATUS(6);
    
    private static final il0<wg0> zzahh = null;
    private final int value;

    static {
        zzahh = new vg0();
    }

    private wg0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return yg0.a;
    }

    public final String toString() {
        return "<" + wg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
