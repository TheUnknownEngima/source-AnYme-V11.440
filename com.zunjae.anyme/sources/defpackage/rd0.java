package defpackage;

/* renamed from: rd0  reason: default package */
public enum rd0 implements fl0 {
    APP_SESSION_REASON_UNKNOWN(0),
    APP_SESSION_REASON_ERROR(1),
    APP_SESSION_NETWORK_ERROR(2),
    APP_SESSION_NETWORK_RECOVERED(3),
    APP_SESSION_RECEIVER_CONNECTION_LOSS(4),
    APP_SESSION_RECEIVER_CONNECTION_RECOVERED(5),
    APP_SESSION_APP_BACKGROUNDED(6),
    APP_SESSION_APP_FOREGROUNDED(7),
    APP_SESSION_APP_STOPPED(8),
    APP_SESSION_CASTING_STOPPED(9),
    APP_SESSION_RESUMED_FROM_SAVED_SESSION(10),
    APP_SESSION_RESUMED_FROM_OPEN_URL(11),
    APP_SESSION_NETWORK_NOT_REACHABLE(12),
    APP_SESSION_GMSCORE_SERVICE_DISCONNECTED(13),
    APP_SESSION_ENDPOINT_SWITCHED(14),
    APP_SESSION_DEVICE_CONNECTION_SUSPENDED(15);
    
    private static final il0<rd0> zzahh = null;
    private final int value;

    static {
        zzahh = new qd0();
    }

    private rd0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return td0.a;
    }

    public final String toString() {
        return "<" + rd0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
