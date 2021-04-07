package defpackage;

/* renamed from: i41  reason: default package */
public final class i41 implements f41 {
    private static final zt0<Boolean> a;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        iu0.d("measurement.client.sessions.check_on_startup", true);
        iu0.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
