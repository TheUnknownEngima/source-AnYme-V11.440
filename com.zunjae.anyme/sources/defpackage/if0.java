package defpackage;

/* renamed from: if0  reason: default package */
public enum if0 implements fl0 {
    UNKNOWN(0),
    POSIX(1),
    OSSTATUS(2),
    COCOA(3);
    
    private static final il0<if0> zzahh = null;
    private final int value;

    static {
        zzahh = new hf0();
    }

    private if0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return lf0.a;
    }

    public final String toString() {
        return "<" + if0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
