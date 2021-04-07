package defpackage;

/* renamed from: lg0  reason: default package */
public enum lg0 implements fl0 {
    PRECACHE_MESSAGE_TYPE_UNKNOWN(0),
    PRECACHE_MESSAGE_TYPE_ACTIVE_CONNECTION(1),
    PRECACHE_MESSAGE_TYPE_BROADCAST(2);
    
    private static final il0<lg0> zzahh = null;
    private final int value;

    static {
        zzahh = new og0();
    }

    private lg0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ng0.a;
    }

    public final String toString() {
        return "<" + lg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
