package defpackage;

/* renamed from: a61  reason: default package */
public final class a61 implements b61 {
    private static final zt0<Boolean> a;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.service.ssaid_removal", true);
        iu0.b("measurement.id.ssaid_removal", 0);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
