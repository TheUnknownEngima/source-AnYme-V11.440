package defpackage;

/* renamed from: xe0  reason: default package */
public enum xe0 implements fl0 {
    DISCOVERY_PROTOCOL_TYPE_UNKNOWN(0),
    MDNS(1),
    CAST_NEARBY(2),
    MDNS_UNICAST_RESPONSE(3),
    SSDP(4),
    BLE(5),
    ADAPTIVE_DISCOVERY(6),
    TCP_FILTER(7);
    
    private static final il0<xe0> zzahh = null;
    private final int value;

    static {
        zzahh = new af0();
    }

    private xe0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ze0.a;
    }

    public final String toString() {
        return "<" + xe0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
