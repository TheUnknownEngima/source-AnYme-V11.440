package defpackage;

/* renamed from: sf0  reason: default package */
public enum sf0 implements fl0 {
    LAUNCH_UNKNOWN(0),
    JOIN(1),
    LAUNCH(2);
    
    private static final il0<sf0> zzahh = null;
    private final int value;

    static {
        zzahh = new vf0();
    }

    private sf0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return uf0.a;
    }

    public final String toString() {
        return "<" + sf0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
