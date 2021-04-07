package defpackage;

/* renamed from: we0  reason: default package */
public enum we0 implements fl0 {
    DEVICE_LINK_STATE_UNKNOWN(0),
    DEVICE_LINK_STATE_NOT_LINKED(1),
    DEVICE_LINK_STATE_LINKED(2);
    
    private static final il0<we0> zzahh = null;
    private final int value;

    static {
        zzahh = new ve0();
    }

    private we0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ye0.a;
    }

    public final String toString() {
        return "<" + we0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
