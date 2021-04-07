package defpackage;

/* renamed from: rf0  reason: default package */
public enum rf0 implements fl0 {
    KEY_EXCHANGE_UNKNOWN(0),
    KEY_EXCHANGE_SUCCEEDED(1),
    KEY_EXCHANGE_FAILED(2);
    
    private static final il0<rf0> zzahh = null;
    private final int value;

    static {
        zzahh = new qf0();
    }

    private rf0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return tf0.a;
    }

    public final String toString() {
        return "<" + rf0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
