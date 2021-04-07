package defpackage;

/* renamed from: jg0  reason: default package */
public enum jg0 implements fl0 {
    PRECACHE_MESSAGE_RESULT_UNKNOWN(0),
    PRECACHE_MESSAGE_RESULT_SENT(1),
    PRECACHE_MESSAGE_RESULT_FAILED(2);
    
    private static final il0<jg0> zzahh = null;
    private final int value;

    static {
        zzahh = new ig0();
    }

    private jg0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return mg0.a;
    }

    public final String toString() {
        return "<" + jg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
