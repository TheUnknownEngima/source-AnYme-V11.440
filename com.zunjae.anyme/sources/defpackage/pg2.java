package defpackage;

/* renamed from: pg2  reason: default package */
public final class pg2 {
    private static ng2 a;

    public static final ng2 a() {
        ng2 ng2 = a;
        if (ng2 != null) {
            return ng2;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    public static final void b(ng2 ng2) {
        v62.f(ng2, "koinApplication");
        if (a == null) {
            a = ng2;
            return;
        }
        throw new ah2("A Koin Application has already been started");
    }
}
