package defpackage;

/* renamed from: df0  reason: default package */
public enum df0 implements fl0 {
    DISCOVERY_STOP_UNKNOWN(0),
    DISCOVERY_STOP_CRITERIA_CHANGED(1),
    DISCOVERY_STOP_NETWORK_CHANGE(2),
    DISCOVERY_STOP_SCREEN_OFF(3),
    DISCOVERY_STOP_BACKGROUND_MODE(4),
    DISCOVERY_STOP_CONFIGURATION_UPDATED(5),
    DISCOVERY_STOP_APPLICATION_FINISHED(6);
    
    private static final il0<df0> zzahh = null;
    private final int value;

    static {
        zzahh = new gf0();
    }

    private df0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ff0.a;
    }

    public final String toString() {
        return "<" + df0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
