package defpackage;

/* renamed from: dg0  reason: default package */
public enum dg0 implements fl0 {
    NETWORK_CONNECTION_STATE_UNKNOWN(0),
    CONNECTED(1),
    CONNECTING(2),
    DISCONNECTED(3),
    DISCONNECTING(4),
    SUSPENDED(6);
    
    private static final il0<dg0> zzahh = null;
    private final int value;

    static {
        zzahh = new cg0();
    }

    private dg0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return fg0.a;
    }

    public final String toString() {
        return "<" + dg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
