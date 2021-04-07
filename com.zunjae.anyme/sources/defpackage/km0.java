package defpackage;

/* renamed from: km0  reason: default package */
final class km0 {
    private static final im0 a = c();
    private static final im0 b = new lm0();

    static im0 a() {
        return a;
    }

    static im0 b() {
        return b;
    }

    private static im0 c() {
        try {
            return (im0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
