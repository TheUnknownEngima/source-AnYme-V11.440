package defpackage;

/* renamed from: h51  reason: default package */
public final class h51 implements e51 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;
    private static final zt0<Boolean> c;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        iu0.b("measurement.id.lifecycle.app_in_background_parameter", 0);
        a = iu0.d("measurement.lifecycle.app_backgrounded_engagement", false);
        b = iu0.d("measurement.lifecycle.app_backgrounded_tracking", true);
        c = iu0.d("measurement.lifecycle.app_in_background_parameter", false);
        iu0.b("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean b() {
        return b.o().booleanValue();
    }

    public final boolean c() {
        return c.o().booleanValue();
    }

    public final boolean zza() {
        return a.o().booleanValue();
    }
}
