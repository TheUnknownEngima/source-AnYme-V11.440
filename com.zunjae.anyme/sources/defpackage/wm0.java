package defpackage;

/* renamed from: wm0  reason: default package */
final class wm0 {
    private static final um0 a = c();
    private static final um0 b = new xm0();

    static um0 a() {
        return a;
    }

    static um0 b() {
        return b;
    }

    private static um0 c() {
        try {
            return (um0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
