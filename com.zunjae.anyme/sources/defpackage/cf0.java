package defpackage;

/* renamed from: cf0  reason: default package */
public enum cf0 implements fl0 {
    DISCOVERY_START_UNKNOWN(0),
    DISCOVERY_START_CRITERIA_CHANGED(1),
    DISCOVERY_START_NETWORK_CHANGE(2),
    DISCOVERY_START_SCREEN_ON(3),
    DISCOVERY_START_FOREGROUND_MODE(4),
    DISCOVERY_START_CONFIGURATION_UPDATED(5);
    
    private static final il0<cf0> zzahh = null;
    private final int value;

    static {
        zzahh = new bf0();
    }

    private cf0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ef0.a;
    }

    public final String toString() {
        return "<" + cf0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
