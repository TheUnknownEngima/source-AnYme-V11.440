package defpackage;

/* renamed from: w31  reason: default package */
public final class w31 implements x31 {
    private static final zt0<Boolean> a;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.sdk.referrer.delayed_install_referrer_api", false);
        iu0.b("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
