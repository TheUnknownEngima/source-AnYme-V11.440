package defpackage;

/* renamed from: l21  reason: default package */
public final class l21 implements m21 {
    private static final zt0<Boolean> a;
    private static final zt0<Boolean> b;
    private static final zt0<Boolean> c;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.client.ad_impression.dev", false);
        b = iu0.d("measurement.service.separate_public_internal_event_blacklisting", false);
        c = iu0.d("measurement.service.ad_impression", false);
        iu0.b("measurement.id.service.ad_impression", 0);
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
