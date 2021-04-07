package defpackage;

/* renamed from: yf0  reason: default package */
public enum yf0 implements fl0 {
    SUBTYPE_UNKNOWN(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    SUBTYPE_1XRTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18);
    
    private static final il0<yf0> zzahh = null;
    private final int value;

    static {
        zzahh = new bg0();
    }

    private yf0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return ag0.a;
    }

    public final String toString() {
        return "<" + yf0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
