package defpackage;

/* renamed from: ch0  reason: default package */
public enum ch0 implements fl0 {
    SESSION_ID_TYPE_UNKNOWN(0),
    DEVICE_CONTROLLER_CONNECTION(1),
    DEVICE_CONTROLLER_APPLICATION_CONNECTION(2),
    DEVICE_FILTER(3),
    REMOTE_DISPLAY_PLUGIN_SESSION(4),
    REMOTE_CONTROL_NOTIFICATION_SESSION(5);
    
    private static final il0<ch0> zzahh = null;
    private final int value;

    static {
        zzahh = new bh0();
    }

    private ch0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return eh0.a;
    }

    public final String toString() {
        return "<" + ch0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
