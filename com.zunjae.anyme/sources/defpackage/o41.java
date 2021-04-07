package defpackage;

/* renamed from: o41  reason: default package */
public final class o41 implements l41 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        b = iu0.d("measurement.collection.redundant_engagement_removal_enabled", false);
        iu0.b("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean b() {
        return b.o().booleanValue();
    }

    public final boolean zza() {
        return a.o().booleanValue();
    }
}
