package defpackage;

/* renamed from: j31  reason: default package */
public final class j31 implements g31 {
    private static final zt0<Boolean> a;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        iu0.d("measurement.collection.init_params_control_enabled", true);
        iu0.d("measurement.sdk.dynamite.use_dynamite3", true);
        iu0.b("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean zza() {
        return a.o().booleanValue();
    }
}
