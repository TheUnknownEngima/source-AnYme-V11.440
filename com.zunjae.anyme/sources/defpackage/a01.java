package defpackage;

/* renamed from: a01  reason: default package */
final class a01 {
    private static final xz0 a = c();
    private static final xz0 b = new b01();

    static xz0 a() {
        return a;
    }

    static xz0 b() {
        return b;
    }

    private static xz0 c() {
        try {
            return (xz0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
