package defpackage;

/* renamed from: b51  reason: default package */
public final class b51 implements d51 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;
    private static final zt0<Boolean> c;
    private static final zt0<Boolean> d;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = iu0.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = iu0.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = iu0.d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        iu0.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean b() {
        return b.o().booleanValue();
    }

    public final boolean c() {
        return c.o().booleanValue();
    }

    public final boolean d() {
        return d.o().booleanValue();
    }

    public final boolean zza() {
        return a.o().booleanValue();
    }
}
