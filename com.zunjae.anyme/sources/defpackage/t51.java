package defpackage;

/* renamed from: t51  reason: default package */
public final class t51 implements q51 {
    private static final zt0<Boolean> a;
    private static final zt0<Double> b;
    private static final zt0<Long> c;
    private static final zt0<Long> d;
    private static final zt0<String> e;

    static {
        iu0 iu0 = new iu0(au0.a("com.google.android.gms.measurement"));
        a = iu0.d("measurement.test.boolean_flag", false);
        b = iu0.a("measurement.test.double_flag", -3.0d);
        c = iu0.b("measurement.test.int_flag", -2);
        d = iu0.b("measurement.test.long_flag", -1);
        e = iu0.c("measurement.test.string_flag", "---");
    }

    public final double b() {
        return b.o().doubleValue();
    }

    public final long c() {
        return c.o().longValue();
    }

    public final long d() {
        return d.o().longValue();
    }

    public final String g() {
        return e.o();
    }

    public final boolean zza() {
        return a.o().booleanValue();
    }
}
