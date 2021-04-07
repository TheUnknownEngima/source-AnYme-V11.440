package defpackage;

/* renamed from: e31  reason: default package */
public final class e31 implements f31 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;
    private static final zt0<Long> c;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.client.consent_state_v1", false);
        b = iu0.d("measurement.service.consent_state_v1_W33", false);
        c = iu0.b("measurement.service.storage_consent_support_version", 203290);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean c() {
        return b.o().booleanValue();
    }

    public final long d() {
        return c.o().longValue();
    }

    public final boolean zza() {
        return true;
    }
}
