package defpackage;

/* renamed from: wh0  reason: default package */
public enum wh0 implements fl0 {
    WIFI_AUTH_TYPE_OTHER(0),
    WIFI_AUTH_TYPE_WEP(1),
    WIFI_AUTH_TYPE_WPA(2);
    
    private static final il0<wh0> zzahh = null;
    private final int value;

    static {
        zzahh = new zh0();
    }

    private wh0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return yh0.a;
    }

    public final String toString() {
        return "<" + wh0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
