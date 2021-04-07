package defpackage;

/* renamed from: k31  reason: default package */
public final class k31 implements l31 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;
    private static final zt0<Boolean> c;
    private static final zt0<Boolean> d;
    private static final zt0<Boolean> e;
    private static final zt0<Boolean> f;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.gold.enhanced_ecommerce.format_logs", true);
        b = iu0.d("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        c = iu0.d("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        d = iu0.d("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        e = iu0.d("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f = iu0.d("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
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

    public final boolean g() {
        return d.o().booleanValue();
    }

    public final boolean i() {
        return e.o().booleanValue();
    }

    public final boolean j() {
        return f.o().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
