package defpackage;

/* renamed from: v31  reason: default package */
public final class v31 implements s31 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;
    private static final zt0<Boolean> c;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        iu0.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = iu0.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = iu0.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = iu0.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
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
