package defpackage;

/* renamed from: w21  reason: default package */
public final class w21 implements t21 {
    private static final zt0<Boolean> a;
    private static final zt0<Long> b;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.sdk.attribution.cache", true);
        b = iu0.b("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    public final long b() {
        return b.o().longValue();
    }

    public final boolean zza() {
        return a.o().booleanValue();
    }
}
