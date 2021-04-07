package defpackage;

/* renamed from: ld0  reason: default package */
public enum ld0 implements fl0 {
    TRIGGER_REASON_NONE(0),
    NO_MDNS_RESPONSE(1),
    NO_MDNS_SUBTYPE_RESPONSE(2),
    SOME_MDNS_SUBTYPE_RESPONSES_RECEIVED(3);
    
    private static final il0<ld0> zzahh = null;
    private final int value;

    static {
        zzahh = new kd0();
    }

    private ld0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return nd0.a;
    }

    public final String toString() {
        return "<" + ld0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
