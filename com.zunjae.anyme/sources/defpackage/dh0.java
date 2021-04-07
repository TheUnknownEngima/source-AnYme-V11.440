package defpackage;

/* renamed from: dh0  reason: default package */
public enum dh0 implements fl0 {
    SLOW_MDNS_UNKNOWN(0),
    SLOW_MDNS_RESPONSE_FROM_NON_SUBTYPE_AWARE_DEVICE(1),
    SLOW_MDNS_SUBTYPE_RESPONSE(2);
    
    private static final il0<dh0> zzahh = null;
    private final int value;

    static {
        zzahh = new gh0();
    }

    private dh0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return fh0.a;
    }

    public final String toString() {
        return "<" + dh0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
