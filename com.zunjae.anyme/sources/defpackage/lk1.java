package defpackage;

/* renamed from: lk1  reason: default package */
final class lk1 {
    private static final jk1 a = c();
    private static final jk1 b = new kk1();

    static jk1 a() {
        return a;
    }

    static jk1 b() {
        return b;
    }

    private static jk1 c() {
        try {
            return (jk1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
