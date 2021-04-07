package defpackage;

/* renamed from: n51  reason: default package */
public final class n51 implements k51 {
    private static final zt0<Long> a;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        iu0.b("measurement.id.max_bundles_per_iteration", 0);
        a = iu0.b("measurement.max_bundles_per_iteration", 2);
    }

    public final long zza() {
        return a.o().longValue();
    }
}
