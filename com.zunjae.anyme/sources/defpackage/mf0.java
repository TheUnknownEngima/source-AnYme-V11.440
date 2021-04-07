package defpackage;

/* renamed from: mf0  reason: default package */
public enum mf0 implements fl0 {
    SUCCESS(0),
    LOW_API_LEVEL(1),
    DEVICE_AUTH_FAILURE(2),
    DEVICE_UNAUTHENTICATED(3),
    PASSWORD_ENCRYPTION_FAILURE(4),
    NO_WIFI_MANAGER(5),
    WEP_RESTRICTION_PRE_O(6),
    NO_MATCHING_NETWORK(7),
    EMPTY_PASSWORD(8);
    
    private static final il0<mf0> zzahh = null;
    private final int value;

    static {
        zzahh = new pf0();
    }

    private mf0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return of0.a;
    }

    public final String toString() {
        return "<" + mf0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
