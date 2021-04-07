package defpackage;

/* renamed from: r21  reason: default package */
public final class r21 implements s21 {
    private static final zt0<Boolean> a;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.androidId.delete_feature", true);
        iu0.d("measurement.log_androidId_enabled", false);
    }

    public final boolean zza() {
        return a.o().booleanValue();
    }
}
