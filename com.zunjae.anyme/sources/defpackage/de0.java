package defpackage;

/* renamed from: de0  reason: default package */
public enum de0 implements fl0 {
    CONNECTION_TYPE_UNKNOWN(0),
    CONNECTION_TYPE_STRONG(1),
    CONNECTION_TYPE_INVISIBLE(2);
    
    private static final il0<de0> zzahh = null;
    private final int value;

    static {
        zzahh = new ce0();
    }

    private de0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return fe0.a;
    }

    public final String toString() {
        return "<" + de0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
