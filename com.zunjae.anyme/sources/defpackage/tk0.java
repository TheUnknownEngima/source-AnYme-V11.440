package defpackage;

/* renamed from: tk0  reason: default package */
final class tk0 {
    private static final rk0<?> a = new uk0();
    private static final rk0<?> b = a();

    private static rk0<?> a() {
        try {
            return (rk0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static rk0<?> b() {
        return a;
    }

    static rk0<?> c() {
        rk0<?> rk0 = b;
        if (rk0 != null) {
            return rk0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
