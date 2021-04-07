package defpackage;

/* renamed from: d31  reason: default package */
public final class d31 implements z21 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.service.configurable_service_limits", true);
        b = iu0.d("measurement.client.configurable_service_limits", true);
        iu0.b("measurement.id.service.configurable_service_limits", 0);
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
