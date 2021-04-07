package defpackage;

/* renamed from: sd0  reason: default package */
public enum sd0 implements fl0 {
    APPLICATION_CONNECTION_FAILED_REASON_UNKNOWN(0),
    APPLICATION_NOT_FOUND(1),
    APPLICATION_NOT_RUNNING(2),
    APPLICATION_NOT_ALLOWED(3),
    LAUNCH_CANCELLED(4),
    LAUNCH_TIMED_OUT(5),
    INVALID_REQUEST(6);
    
    private static final il0<sd0> zzahh = null;
    private final int value;

    static {
        zzahh = new vd0();
    }

    private sd0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ud0.a;
    }

    public final String toString() {
        return "<" + sd0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
