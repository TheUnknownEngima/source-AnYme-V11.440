package defpackage;

/* renamed from: rg0  reason: default package */
public enum rg0 implements fl0 {
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_NO_OP(0),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_PARTNER_APP(1),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_HOME_APP(2),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_PARTNER_APP_PLAY_STORE(3),
    REMOTE_CONTROL_NOTIFICATION_CLICK_THROUGH_RESULT_OPEN_HOME_APP_PLAY_STORE(4);
    
    private static final il0<rg0> zzahh = null;
    private final int value;

    static {
        zzahh = new ug0();
    }

    private rg0(int i) {
        this.value = i;
    }

    public static hl0 zzgk() {
        return tg0.a;
    }

    public final String toString() {
        return "<" + rg0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    public final int zzgj() {
        return this.value;
    }
}
