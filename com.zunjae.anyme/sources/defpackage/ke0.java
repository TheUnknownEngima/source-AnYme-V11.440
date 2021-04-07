package defpackage;

/* renamed from: ke0  reason: default package */
public enum ke0 implements fl0 {
    UNKNOWN_FEATURE(0),
    GET_IP_ADDRESS(1),
    GET_INET_ADDRESS(2);
    
    private static final il0<ke0> zzahh = null;
    private final int value;

    static {
        zzahh = new je0();
    }

    private ke0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return me0.a;
    }

    public final String toString() {
        return "<" + ke0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
