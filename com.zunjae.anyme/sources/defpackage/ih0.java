package defpackage;

/* renamed from: ih0  reason: default package */
public enum ih0 implements fl0 {
    TCP_PROBER_UNKNOWN(0),
    TCP_PROBER_DEVICE_EXPIRED(1),
    TCP_PROBER_SUBTYPE_MDNS_MISSING(2),
    TCP_PROBER_BLE(3),
    TCP_PROBER_CLOUD_DISCOVERY(4),
    TCP_PROBER_GAIA_DISCOVERY(5),
    TCP_PROBER_KNOWN_SESSION_ENDPOINT(6),
    TCP_PROBER_APP_HINT(7),
    TCP_PROBER_REFRESH_SESSION_ENDPOINT(8);
    
    private static final il0<ih0> zzahh = null;
    private final int value;

    static {
        zzahh = new hh0();
    }

    private ih0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return kh0.a;
    }

    public final String toString() {
        return "<" + ih0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
