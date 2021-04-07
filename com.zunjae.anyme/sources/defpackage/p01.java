package defpackage;

/* renamed from: p01  reason: default package */
final class p01 {
    private static final n01 a = c();
    private static final n01 b = new m01();

    static n01 a() {
        return a;
    }

    static n01 b() {
        return b;
    }

    private static n01 c() {
        try {
            return (n01) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
