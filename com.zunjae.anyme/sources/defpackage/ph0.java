package defpackage;

/* renamed from: ph0  reason: default package */
public enum ph0 implements fl0 {
    TCP_PROBER_IP_SOURCE_UNKNOWN(0),
    TCP_PROBER_IP_SOURCE_CACHED(1),
    TCP_PROBER_IP_SOURCE_BLE(2),
    TCP_PROBER_IP_SOURCE_GAIA(3);
    
    private static final il0<ph0> zzahh = null;
    private final int value;

    static {
        zzahh = new oh0();
    }

    private ph0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return rh0.a;
    }

    public final String toString() {
        return "<" + ph0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
