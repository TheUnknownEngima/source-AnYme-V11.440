package defpackage;

/* renamed from: eg0  reason: default package */
public enum eg0 implements fl0 {
    NETWORK_CONNECTION_TYPE_UNKNOWN(0),
    MOBILE(1),
    WIFI(2),
    MOBILE_MMS(3),
    MOBILE_SUPL(4),
    MOBILE_DUN(5),
    MOBILE_HIPRI(6),
    WIMAX(7),
    BLUETOOTH(8),
    DUMMY(9),
    ETHERNET(10),
    VPN(11);
    
    private static final il0<eg0> zzahh = null;
    private final int value;

    static {
        zzahh = new hg0();
    }

    private eg0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return gg0.a;
    }

    public final String toString() {
        return "<" + eg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
