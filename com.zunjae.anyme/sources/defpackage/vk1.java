package defpackage;

/* renamed from: vk1  reason: default package */
final class vk1 {
    private static final tk1 a = c();
    private static final tk1 b = new uk1();

    static tk1 a() {
        return a;
    }

    static tk1 b() {
        return b;
    }

    private static tk1 c() {
        try {
            return (tk1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
