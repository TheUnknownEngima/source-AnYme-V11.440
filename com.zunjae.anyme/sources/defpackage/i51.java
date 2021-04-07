package defpackage;

/* renamed from: i51  reason: default package */
public final class i51 implements j51 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.sdk.screen.manual_screen_view_logging", true);
        b = iu0.d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean c() {
        return b.o().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
