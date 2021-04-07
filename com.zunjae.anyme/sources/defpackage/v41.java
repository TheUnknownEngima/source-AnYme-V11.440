package defpackage;

/* renamed from: v41  reason: default package */
public final class v41 implements w41 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;
    private static final zt0<Boolean> c;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.client.global_params", true);
        b = iu0.d("measurement.service.global_params_in_payload", true);
        c = iu0.d("measurement.service.global_params", true);
        iu0.b("measurement.id.service.global_params", 0);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean c() {
        return b.o().booleanValue();
    }

    public final boolean d() {
        return c.o().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
