package defpackage;

/* renamed from: iy0  reason: default package */
final class iy0 {
    private static final hy0<?> a = new jy0();
    private static final hy0<?> b = c();

    static hy0<?> a() {
        return a;
    }

    static hy0<?> b() {
        hy0<?> hy0 = b;
        if (hy0 != null) {
            return hy0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static hy0<?> c() {
        try {
            return (hy0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
