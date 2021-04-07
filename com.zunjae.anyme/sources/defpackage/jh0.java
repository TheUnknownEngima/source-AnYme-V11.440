package defpackage;

/* renamed from: jh0  reason: default package */
public enum jh0 implements fl0 {
    TCP_PROBER_RESULT_UNKNOWN(0),
    TCP_PROBER_RESULT_SUCCESS(1),
    TCP_PROBER_RESULT_CONNECTION_ERROR(2),
    TCP_PROBER_RESULT_OTHER(99);
    
    private static final il0<jh0> zzahh = null;
    private final int value;

    static {
        zzahh = new nh0();
    }

    private jh0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return mh0.a;
    }

    public final String toString() {
        return "<" + jh0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
