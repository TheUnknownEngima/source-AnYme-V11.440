package defpackage;

/* renamed from: qe0  reason: default package */
public enum qe0 implements fl0 {
    DEVICE_CONNECTION_TYPE_UNKNOWN(0),
    DEVICE_CONNECTION_TYPE_LOCAL(1),
    DEVICE_CONNECTION_TYPE_OPENCAST(2),
    DEVICE_CONNECTION_TYPE_RELAY(3);
    
    private static final il0<qe0> zzahh = null;
    private final int value;

    static {
        zzahh = new pe0();
    }

    private qe0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return se0.a;
    }

    public final String toString() {
        return "<" + qe0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
